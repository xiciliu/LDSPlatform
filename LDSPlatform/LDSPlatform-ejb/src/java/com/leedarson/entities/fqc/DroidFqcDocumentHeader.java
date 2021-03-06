/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leedarson.entities.fqc;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chenfeng
 */
@Entity
@Table(name = "DROID_FQC_DOCUMENT_HEADER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DroidFqcDocumentHeader.findAll", query = "SELECT d FROM DroidFqcDocumentHeader d"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByDocumentHeaderId", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.documentHeaderId = :documentHeaderId"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByDocumentNumber", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.documentNumber = :documentNumber"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByCategory", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.category = :category"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByDocumentType", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.documentType = :documentType"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByDocumentStatus", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.documentStatus = :documentStatus"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByWorkOrderNumber", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.workOrderNumber = :workOrderNumber"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByProdLineGroupDes", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.prodLineGroupDes = :prodLineGroupDes"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByProdLineIdDes", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.prodLineIdDes = :prodLineIdDes"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByInspectionAmount", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.inspectionAmount = :inspectionAmount"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findBySamplingAmount", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.samplingAmount = :samplingAmount"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByShiftCode", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.shiftCode = :shiftCode"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByInspector", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.inspector = :inspector"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByResultCode", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.resultCode = :resultCode"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByAttr1", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.attr1 = :attr1"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByAttr2", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.attr2 = :attr2"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByAttr3", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.attr3 = :attr3"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByAttr4", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.attr4 = :attr4"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByAttr5", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.attr5 = :attr5"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByCreatedBy", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.createdBy = :createdBy"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByCreationDate", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.creationDate = :creationDate"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByLastUpdatedBy", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.lastUpdatedBy = :lastUpdatedBy"),
    @NamedQuery(name = "DroidFqcDocumentHeader.findByLastUpdateDate", query = "SELECT d FROM DroidFqcDocumentHeader d WHERE d.lastUpdateDate = :lastUpdateDate")})
public class DroidFqcDocumentHeader implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "DOCUMENT_HEADER_ID")
    private String documentHeaderId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DOCUMENT_NUMBER")
    private String documentNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CATEGORY")
    private String category;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DOCUMENT_TYPE")
    private String documentType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DOCUMENT_STATUS")
    private String documentStatus;
    @Size(max = 250)
    @Column(name = "WORK_ORDER_NUMBER")
    private String workOrderNumber;
    @Size(max = 250)
    @Column(name = "PROD_LINE_GROUP_DES")
    private String prodLineGroupDes;
    @Size(max = 250)
    @Column(name = "PROD_LINE_ID_DES")
    private String prodLineIdDes;
    @Size(max = 250)
    @Column(name = "INSPECTION_AMOUNT")
    private String inspectionAmount;
    @Size(max = 250)
    @Column(name = "SAMPLING_AMOUNT")
    private String samplingAmount;
    @Size(max = 1)
    @Column(name = "SHIFT_CODE")
    private String shiftCode;
    @Size(max = 250)
    @Column(name = "INSPECTOR")
    private String inspector;
    @Size(max = 30)
    @Column(name = "RESULT_CODE")
    private String resultCode;
    @Size(max = 1000)
    @Column(name = "ATTR1")
    private String attr1;
    @Size(max = 1000)
    @Column(name = "ATTR2")
    private String attr2;
    @Size(max = 1000)
    @Column(name = "ATTR3")
    private String attr3;
    @Size(max = 1000)
    @Column(name = "ATTR4")
    private String attr4;
    @Size(max = 1000)
    @Column(name = "ATTR5")
    private String attr5;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATED_BY")
    private BigInteger createdBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LAST_UPDATED_BY")
    private BigInteger lastUpdatedBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LAST_UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateDate;
//    
//    private String itemCode;
//    private String plantCode;
//    private String customer;
//    private String poNumber;
//    private String soNumber;
//    private String description;
//    private String longDescription;
//
//    public void setItemCode(String itemCode) {
//        this.itemCode = itemCode;
//    }
//
//    public void setPlantCode(String plantCode) {
//        this.plantCode = plantCode;
//    }
//
//    public void setCustomer(String customer) {
//        this.customer = customer;
//    }
//
//    public void setPoNumber(String poNumber) {
//        this.poNumber = poNumber;
//    }
//
//    public void setSoNumber(String soNumber) {
//        this.soNumber = soNumber;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setLongDescription(String longDescription) {
//        this.longDescription = longDescription;
//    }
    
    
    

    public DroidFqcDocumentHeader() {
    }

    public DroidFqcDocumentHeader(String documentHeaderId) {
        this.documentHeaderId = documentHeaderId;
    }

    public DroidFqcDocumentHeader(String documentHeaderId, String documentNumber, String category, String documentType, String documentStatus, BigInteger createdBy, Date creationDate, BigInteger lastUpdatedBy, Date lastUpdateDate) {
        this.documentHeaderId = documentHeaderId;
        this.documentNumber = documentNumber;
        this.category = category;
        this.documentType = documentType;
        this.documentStatus = documentStatus;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getDocumentHeaderId() {
        return documentHeaderId;
    }

    public void setDocumentHeaderId(String documentHeaderId) {
        this.documentHeaderId = documentHeaderId;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }

    public String getWorkOrderNumber() {
        return workOrderNumber;
    }

    public void setWorkOrderNumber(String workOrderNumber) {
        this.workOrderNumber = workOrderNumber;
    }

    public String getProdLineGroupDes() {
        return prodLineGroupDes;
    }

    public void setProdLineGroupDes(String prodLineGroupDes) {
        this.prodLineGroupDes = prodLineGroupDes;
    }

    public String getProdLineIdDes() {
        return prodLineIdDes;
    }

    public void setProdLineIdDes(String prodLineIdDes) {
        this.prodLineIdDes = prodLineIdDes;
    }

    public String getInspectionAmount() {
        return inspectionAmount;
    }

    public void setInspectionAmount(String inspectionAmount) {
        this.inspectionAmount = inspectionAmount;
    }

    public String getSamplingAmount() {
        return samplingAmount;
    }

    public void setSamplingAmount(String samplingAmount) {
        this.samplingAmount = samplingAmount;
    }

    public String getShiftCode() {
        return shiftCode;
    }

    public void setShiftCode(String shiftCode) {
        this.shiftCode = shiftCode;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    public String getAttr4() {
        return attr4;
    }

    public void setAttr4(String attr4) {
        this.attr4 = attr4;
    }

    public String getAttr5() {
        return attr5;
    }

    public void setAttr5(String attr5) {
        this.attr5 = attr5;
    }

    public BigInteger getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigInteger createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public BigInteger getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentHeaderId != null ? documentHeaderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DroidFqcDocumentHeader)) {
            return false;
        }
        DroidFqcDocumentHeader other = (DroidFqcDocumentHeader) object;
        if ((this.documentHeaderId == null && other.documentHeaderId != null) || (this.documentHeaderId != null && !this.documentHeaderId.equals(other.documentHeaderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.leedarson.entities.fqc.DroidFqcDocumentHeader[ documentHeaderId=" + documentHeaderId + " ]";
    }
    
}
