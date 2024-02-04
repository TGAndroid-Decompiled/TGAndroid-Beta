package org.telegram.messenger.video;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.authoring.tracks.CleanInputStream;
import com.googlecode.mp4parser.util.ByteBufferByteChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.R;
public class HevcDecoderConfigurationRecord {
    int avgFrameRate;
    int bitDepthChromaMinus8;
    int bitDepthLumaMinus8;
    int chromaFormat;
    int configurationVersion;
    int constantFrameRate;
    boolean frame_only_constraint_flag;
    long general_constraint_indicator_flags;
    int general_level_idc;
    long general_profile_compatibility_flags;
    int general_profile_idc;
    int general_profile_space;
    boolean general_tier_flag;
    boolean interlaced_source_flag;
    int lengthSizeMinusOne;
    int min_spatial_segmentation_idc;
    boolean non_packed_constraint_flag;
    int numTemporalLayers;
    int parallelismType;
    boolean progressive_source_flag;
    boolean temporalIdNested;
    int reserved1 = 15;
    int reserved2 = 63;
    int reserved3 = 63;
    int reserved4 = 31;
    int reserved5 = 31;
    List<Array> arrays = new ArrayList();

    public static class H265NalUnitHeader {
        public int forbiddenZeroFlag;
        public int nalUnitType;
        public int nuhLayerId;
        public int nuhTemporalIdPlusOne;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.configurationVersion = IsoTypeReader.readUInt8(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.general_profile_space = (readUInt8 & 192) >> 6;
        this.general_tier_flag = (readUInt8 & 32) > 0;
        this.general_profile_idc = readUInt8 & 31;
        this.general_profile_compatibility_flags = IsoTypeReader.readUInt32(byteBuffer);
        long readUInt48 = IsoTypeReader.readUInt48(byteBuffer);
        this.general_constraint_indicator_flags = readUInt48;
        this.frame_only_constraint_flag = ((readUInt48 >> 44) & 8) > 0;
        this.non_packed_constraint_flag = ((readUInt48 >> 44) & 4) > 0;
        this.interlaced_source_flag = ((readUInt48 >> 44) & 2) > 0;
        this.progressive_source_flag = ((readUInt48 >> 44) & 1) > 0;
        this.general_constraint_indicator_flags = readUInt48 & 140737488355327L;
        this.general_level_idc = IsoTypeReader.readUInt8(byteBuffer);
        int readUInt16 = IsoTypeReader.readUInt16(byteBuffer);
        this.reserved1 = (61440 & readUInt16) >> 12;
        this.min_spatial_segmentation_idc = readUInt16 & 4095;
        int readUInt82 = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved2 = (readUInt82 & 252) >> 2;
        this.parallelismType = readUInt82 & 3;
        int readUInt83 = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved3 = (readUInt83 & 252) >> 2;
        this.chromaFormat = readUInt83 & 3;
        int readUInt84 = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved4 = (readUInt84 & 248) >> 3;
        this.bitDepthLumaMinus8 = readUInt84 & 7;
        int readUInt85 = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved5 = (readUInt85 & 248) >> 3;
        this.bitDepthChromaMinus8 = readUInt85 & 7;
        this.avgFrameRate = IsoTypeReader.readUInt16(byteBuffer);
        int readUInt86 = IsoTypeReader.readUInt8(byteBuffer);
        this.constantFrameRate = (readUInt86 & 192) >> 6;
        this.numTemporalLayers = (readUInt86 & 56) >> 3;
        this.temporalIdNested = (readUInt86 & 4) > 0;
        this.lengthSizeMinusOne = readUInt86 & 3;
        int readUInt87 = IsoTypeReader.readUInt8(byteBuffer);
        this.arrays = new ArrayList();
        for (int i = 0; i < readUInt87; i++) {
            Array array = new Array();
            int readUInt88 = IsoTypeReader.readUInt8(byteBuffer);
            array.array_completeness = (readUInt88 & 128) > 0;
            array.reserved = (readUInt88 & 64) > 0;
            array.nal_unit_type = readUInt88 & 63;
            int readUInt162 = IsoTypeReader.readUInt16(byteBuffer);
            array.nalUnits = new ArrayList();
            for (int i2 = 0; i2 < readUInt162; i2++) {
                byte[] bArr = new byte[IsoTypeReader.readUInt16(byteBuffer)];
                byteBuffer.get(bArr);
                array.nalUnits.add(bArr);
            }
            this.arrays.add(array);
        }
    }

    public void write(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt8(byteBuffer, this.configurationVersion);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.general_profile_space << 6) + (this.general_tier_flag ? 32 : 0) + this.general_profile_idc);
        IsoTypeWriter.writeUInt32(byteBuffer, this.general_profile_compatibility_flags);
        long j = this.general_constraint_indicator_flags;
        if (this.frame_only_constraint_flag) {
            j |= 140737488355328L;
        }
        if (this.non_packed_constraint_flag) {
            j |= 70368744177664L;
        }
        if (this.interlaced_source_flag) {
            j |= 35184372088832L;
        }
        if (this.progressive_source_flag) {
            j |= 17592186044416L;
        }
        IsoTypeWriter.writeUInt48(byteBuffer, j);
        IsoTypeWriter.writeUInt8(byteBuffer, this.general_level_idc);
        IsoTypeWriter.writeUInt16(byteBuffer, (this.reserved1 << 12) + this.min_spatial_segmentation_idc);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.reserved2 << 2) + this.parallelismType);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.reserved3 << 2) + this.chromaFormat);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.reserved4 << 3) + this.bitDepthLumaMinus8);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.reserved5 << 3) + this.bitDepthChromaMinus8);
        IsoTypeWriter.writeUInt16(byteBuffer, this.avgFrameRate);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.constantFrameRate << 6) + (this.numTemporalLayers << 3) + (this.temporalIdNested ? 4 : 0) + this.lengthSizeMinusOne);
        IsoTypeWriter.writeUInt8(byteBuffer, this.arrays.size());
        for (Array array : this.arrays) {
            IsoTypeWriter.writeUInt8(byteBuffer, (array.array_completeness ? 128 : 0) + (array.reserved ? 64 : 0) + array.nal_unit_type);
            IsoTypeWriter.writeUInt16(byteBuffer, array.nalUnits.size());
            for (byte[] bArr : array.nalUnits) {
                IsoTypeWriter.writeUInt16(byteBuffer, bArr.length);
                byteBuffer.put(bArr);
            }
        }
    }

    public int getSize() {
        int i = 23;
        for (Array array : this.arrays) {
            i += 3;
            for (byte[] bArr : array.nalUnits) {
                i = i + 2 + bArr.length;
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord = (HevcDecoderConfigurationRecord) obj;
        if (this.avgFrameRate == hevcDecoderConfigurationRecord.avgFrameRate && this.bitDepthChromaMinus8 == hevcDecoderConfigurationRecord.bitDepthChromaMinus8 && this.bitDepthLumaMinus8 == hevcDecoderConfigurationRecord.bitDepthLumaMinus8 && this.chromaFormat == hevcDecoderConfigurationRecord.chromaFormat && this.configurationVersion == hevcDecoderConfigurationRecord.configurationVersion && this.constantFrameRate == hevcDecoderConfigurationRecord.constantFrameRate && this.general_constraint_indicator_flags == hevcDecoderConfigurationRecord.general_constraint_indicator_flags && this.general_level_idc == hevcDecoderConfigurationRecord.general_level_idc && this.general_profile_compatibility_flags == hevcDecoderConfigurationRecord.general_profile_compatibility_flags && this.general_profile_idc == hevcDecoderConfigurationRecord.general_profile_idc && this.general_profile_space == hevcDecoderConfigurationRecord.general_profile_space && this.general_tier_flag == hevcDecoderConfigurationRecord.general_tier_flag && this.lengthSizeMinusOne == hevcDecoderConfigurationRecord.lengthSizeMinusOne && this.min_spatial_segmentation_idc == hevcDecoderConfigurationRecord.min_spatial_segmentation_idc && this.numTemporalLayers == hevcDecoderConfigurationRecord.numTemporalLayers && this.parallelismType == hevcDecoderConfigurationRecord.parallelismType && this.reserved1 == hevcDecoderConfigurationRecord.reserved1 && this.reserved2 == hevcDecoderConfigurationRecord.reserved2 && this.reserved3 == hevcDecoderConfigurationRecord.reserved3 && this.reserved4 == hevcDecoderConfigurationRecord.reserved4 && this.reserved5 == hevcDecoderConfigurationRecord.reserved5 && this.temporalIdNested == hevcDecoderConfigurationRecord.temporalIdNested) {
            List<Array> list = this.arrays;
            List<Array> list2 = hevcDecoderConfigurationRecord.arrays;
            return list == null ? list2 == null : list.equals(list2);
        }
        return false;
    }

    public int hashCode() {
        long j = this.general_profile_compatibility_flags;
        long j2 = this.general_constraint_indicator_flags;
        int i = ((((((((((((((((((((((((((((((((((((((((((this.configurationVersion * 31) + this.general_profile_space) * 31) + (this.general_tier_flag ? 1 : 0)) * 31) + this.general_profile_idc) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.general_level_idc) * 31) + this.reserved1) * 31) + this.min_spatial_segmentation_idc) * 31) + this.reserved2) * 31) + this.parallelismType) * 31) + this.reserved3) * 31) + this.chromaFormat) * 31) + this.reserved4) * 31) + this.bitDepthLumaMinus8) * 31) + this.reserved5) * 31) + this.bitDepthChromaMinus8) * 31) + this.avgFrameRate) * 31) + this.constantFrameRate) * 31) + this.numTemporalLayers) * 31) + (this.temporalIdNested ? 1 : 0)) * 31) + this.lengthSizeMinusOne) * 31;
        List<Array> list = this.arrays;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder();
        sb.append("HEVCDecoderConfigurationRecord{configurationVersion=");
        sb.append(this.configurationVersion);
        sb.append(", general_profile_space=");
        sb.append(this.general_profile_space);
        sb.append(", general_tier_flag=");
        sb.append(this.general_tier_flag);
        sb.append(", general_profile_idc=");
        sb.append(this.general_profile_idc);
        sb.append(", general_profile_compatibility_flags=");
        sb.append(this.general_profile_compatibility_flags);
        sb.append(", general_constraint_indicator_flags=");
        sb.append(this.general_constraint_indicator_flags);
        sb.append(", general_level_idc=");
        sb.append(this.general_level_idc);
        int i = this.reserved1;
        String str5 = BuildConfig.APP_CENTER_HASH;
        if (i != 15) {
            str = ", reserved1=" + this.reserved1;
        } else {
            str = BuildConfig.APP_CENTER_HASH;
        }
        sb.append(str);
        sb.append(", min_spatial_segmentation_idc=");
        sb.append(this.min_spatial_segmentation_idc);
        if (this.reserved2 != 63) {
            str2 = ", reserved2=" + this.reserved2;
        } else {
            str2 = BuildConfig.APP_CENTER_HASH;
        }
        sb.append(str2);
        sb.append(", parallelismType=");
        sb.append(this.parallelismType);
        if (this.reserved3 != 63) {
            str3 = ", reserved3=" + this.reserved3;
        } else {
            str3 = BuildConfig.APP_CENTER_HASH;
        }
        sb.append(str3);
        sb.append(", chromaFormat=");
        sb.append(this.chromaFormat);
        if (this.reserved4 != 31) {
            str4 = ", reserved4=" + this.reserved4;
        } else {
            str4 = BuildConfig.APP_CENTER_HASH;
        }
        sb.append(str4);
        sb.append(", bitDepthLumaMinus8=");
        sb.append(this.bitDepthLumaMinus8);
        if (this.reserved5 != 31) {
            str5 = ", reserved5=" + this.reserved5;
        }
        sb.append(str5);
        sb.append(", bitDepthChromaMinus8=");
        sb.append(this.bitDepthChromaMinus8);
        sb.append(", avgFrameRate=");
        sb.append(this.avgFrameRate);
        sb.append(", constantFrameRate=");
        sb.append(this.constantFrameRate);
        sb.append(", numTemporalLayers=");
        sb.append(this.numTemporalLayers);
        sb.append(", temporalIdNested=");
        sb.append(this.temporalIdNested);
        sb.append(", lengthSizeMinusOne=");
        sb.append(this.lengthSizeMinusOne);
        sb.append(", arrays=");
        sb.append(this.arrays);
        sb.append('}');
        return sb.toString();
    }

    public int getConfigurationVersion() {
        return this.configurationVersion;
    }

    public void setConfigurationVersion(int i) {
        this.configurationVersion = i;
    }

    public int getGeneral_profile_space() {
        return this.general_profile_space;
    }

    public void setGeneral_profile_space(int i) {
        this.general_profile_space = i;
    }

    public boolean isGeneral_tier_flag() {
        return this.general_tier_flag;
    }

    public void setGeneral_tier_flag(boolean z) {
        this.general_tier_flag = z;
    }

    public int getGeneral_profile_idc() {
        return this.general_profile_idc;
    }

    public void setGeneral_profile_idc(int i) {
        this.general_profile_idc = i;
    }

    public long getGeneral_profile_compatibility_flags() {
        return this.general_profile_compatibility_flags;
    }

    public void setGeneral_profile_compatibility_flags(long j) {
        this.general_profile_compatibility_flags = j;
    }

    public long getGeneral_constraint_indicator_flags() {
        return this.general_constraint_indicator_flags;
    }

    public void setGeneral_constraint_indicator_flags(long j) {
        this.general_constraint_indicator_flags = j;
    }

    public int getGeneral_level_idc() {
        return this.general_level_idc;
    }

    public void setGeneral_level_idc(int i) {
        this.general_level_idc = i;
    }

    public int getMin_spatial_segmentation_idc() {
        return this.min_spatial_segmentation_idc;
    }

    public void setMin_spatial_segmentation_idc(int i) {
        this.min_spatial_segmentation_idc = i;
    }

    public int getParallelismType() {
        return this.parallelismType;
    }

    public void setParallelismType(int i) {
        this.parallelismType = i;
    }

    public int getChromaFormat() {
        return this.chromaFormat;
    }

    public void setChromaFormat(int i) {
        this.chromaFormat = i;
    }

    public int getBitDepthLumaMinus8() {
        return this.bitDepthLumaMinus8;
    }

    public void setBitDepthLumaMinus8(int i) {
        this.bitDepthLumaMinus8 = i;
    }

    public int getBitDepthChromaMinus8() {
        return this.bitDepthChromaMinus8;
    }

    public void setBitDepthChromaMinus8(int i) {
        this.bitDepthChromaMinus8 = i;
    }

    public int getAvgFrameRate() {
        return this.avgFrameRate;
    }

    public void setAvgFrameRate(int i) {
        this.avgFrameRate = i;
    }

    public int getNumTemporalLayers() {
        return this.numTemporalLayers;
    }

    public void setNumTemporalLayers(int i) {
        this.numTemporalLayers = i;
    }

    public int getLengthSizeMinusOne() {
        return this.lengthSizeMinusOne;
    }

    public void setLengthSizeMinusOne(int i) {
        this.lengthSizeMinusOne = i;
    }

    public boolean isTemporalIdNested() {
        return this.temporalIdNested;
    }

    public void setTemporalIdNested(boolean z) {
        this.temporalIdNested = z;
    }

    public int getConstantFrameRate() {
        return this.constantFrameRate;
    }

    public void setConstantFrameRate(int i) {
        this.constantFrameRate = i;
    }

    public List<Array> getArrays() {
        return this.arrays;
    }

    public void setArrays(List<Array> list) {
        this.arrays = list;
    }

    public boolean isFrame_only_constraint_flag() {
        return this.frame_only_constraint_flag;
    }

    public void setFrame_only_constraint_flag(boolean z) {
        this.frame_only_constraint_flag = z;
    }

    public boolean isNon_packed_constraint_flag() {
        return this.non_packed_constraint_flag;
    }

    public void setNon_packed_constraint_flag(boolean z) {
        this.non_packed_constraint_flag = z;
    }

    public boolean isInterlaced_source_flag() {
        return this.interlaced_source_flag;
    }

    public void setInterlaced_source_flag(boolean z) {
        this.interlaced_source_flag = z;
    }

    public boolean isProgressive_source_flag() {
        return this.progressive_source_flag;
    }

    public void setProgressive_source_flag(boolean z) {
        this.progressive_source_flag = z;
    }

    public static class Array {
        public boolean array_completeness;
        public List<byte[]> nalUnits;
        public int nal_unit_type;
        public boolean reserved;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Array array = (Array) obj;
            if (this.array_completeness == array.array_completeness && this.nal_unit_type == array.nal_unit_type && this.reserved == array.reserved) {
                ListIterator<byte[]> listIterator = this.nalUnits.listIterator();
                ListIterator<byte[]> listIterator2 = array.nalUnits.listIterator();
                while (listIterator.hasNext() && listIterator2.hasNext()) {
                    byte[] next = listIterator.next();
                    byte[] next2 = listIterator2.next();
                    if (next == null) {
                        if (next2 != null) {
                            return false;
                        }
                    } else if (!Arrays.equals(next, next2)) {
                        return false;
                    }
                }
                return (listIterator.hasNext() || listIterator2.hasNext()) ? false : true;
            }
            return false;
        }

        public int hashCode() {
            int i = (((((this.array_completeness ? 1 : 0) * 31) + (this.reserved ? 1 : 0)) * 31) + this.nal_unit_type) * 31;
            List<byte[]> list = this.nalUnits;
            return i + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Array{nal_unit_type=" + this.nal_unit_type + ", reserved=" + this.reserved + ", array_completeness=" + this.array_completeness + ", num_nals=" + this.nalUnits.size() + '}';
        }
    }

    public static VisualSampleEntry parseFromCsd(List<ByteBuffer> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        SequenceParameterSetRbsp sequenceParameterSetRbsp = null;
        for (ByteBuffer byteBuffer : list) {
            H265NalUnitHeader nalUnitHeader = getNalUnitHeader(byteBuffer);
            byteBuffer.position(0);
            switch (nalUnitHeader.nalUnitType) {
                case 32:
                    arrayList3.add(byteBuffer.duplicate());
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle:
                    arrayList.add(byteBuffer.duplicate());
                    byteBuffer.position(2);
                    sequenceParameterSetRbsp = new SequenceParameterSetRbsp(new CleanInputStream(Channels.newInputStream(new ByteBufferByteChannel(byteBuffer.slice()))));
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle:
                    arrayList2.add(byteBuffer.duplicate());
                    break;
            }
        }
        return createSampleEntry(arrayList, arrayList2, arrayList3, sequenceParameterSetRbsp);
    }

    private static VisualSampleEntry createSampleEntry(ArrayList<ByteBuffer> arrayList, ArrayList<ByteBuffer> arrayList2, ArrayList<ByteBuffer> arrayList3, SequenceParameterSetRbsp sequenceParameterSetRbsp) {
        VisualSampleEntry visualSampleEntry = new VisualSampleEntry("hvc1");
        visualSampleEntry.setDataReferenceIndex(1);
        visualSampleEntry.setDepth(24);
        visualSampleEntry.setFrameCount(1);
        visualSampleEntry.setHorizresolution(72.0d);
        visualSampleEntry.setVertresolution(72.0d);
        visualSampleEntry.setCompressorname("HEVC Coding");
        HevcConfigurationBox hevcConfigurationBox = new HevcConfigurationBox();
        hevcConfigurationBox.getHevcDecoderConfigurationRecord().setConfigurationVersion(1);
        if (sequenceParameterSetRbsp != null) {
            visualSampleEntry.setWidth(sequenceParameterSetRbsp.pic_width_in_luma_samples);
            visualSampleEntry.setHeight(sequenceParameterSetRbsp.pic_height_in_luma_samples);
            HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord = hevcConfigurationBox.getHevcDecoderConfigurationRecord();
            hevcDecoderConfigurationRecord.setChromaFormat(sequenceParameterSetRbsp.chroma_format_idc);
            hevcDecoderConfigurationRecord.setGeneral_profile_idc(sequenceParameterSetRbsp.general_profile_idc);
            hevcDecoderConfigurationRecord.setGeneral_profile_compatibility_flags(sequenceParameterSetRbsp.general_profile_compatibility_flags);
            hevcDecoderConfigurationRecord.setGeneral_constraint_indicator_flags(sequenceParameterSetRbsp.general_constraint_indicator_flags);
            hevcDecoderConfigurationRecord.setGeneral_level_idc(sequenceParameterSetRbsp.general_level_idc);
            hevcDecoderConfigurationRecord.setGeneral_tier_flag(sequenceParameterSetRbsp.general_tier_flag);
            hevcDecoderConfigurationRecord.setGeneral_profile_space(sequenceParameterSetRbsp.general_profile_space);
            hevcDecoderConfigurationRecord.setBitDepthChromaMinus8(sequenceParameterSetRbsp.bit_depth_chroma_minus8);
            hevcDecoderConfigurationRecord.setBitDepthLumaMinus8(sequenceParameterSetRbsp.bit_depth_luma_minus8);
            hevcDecoderConfigurationRecord.setTemporalIdNested(sequenceParameterSetRbsp.sps_temporal_id_nesting_flag);
        }
        hevcConfigurationBox.getHevcDecoderConfigurationRecord().setLengthSizeMinusOne(3);
        Array array = new Array();
        array.array_completeness = true;
        array.nal_unit_type = 32;
        array.nalUnits = new ArrayList();
        Iterator<ByteBuffer> it = arrayList3.iterator();
        while (it.hasNext()) {
            array.nalUnits.add(it.next().array());
        }
        Array array2 = new Array();
        array2.array_completeness = true;
        array2.nal_unit_type = 33;
        array2.nalUnits = new ArrayList();
        Iterator<ByteBuffer> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            array2.nalUnits.add(it2.next().array());
        }
        Array array3 = new Array();
        array3.array_completeness = true;
        array3.nal_unit_type = 34;
        array3.nalUnits = new ArrayList();
        Iterator<ByteBuffer> it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            array3.nalUnits.add(it3.next().array());
        }
        hevcConfigurationBox.getArrays().addAll(Arrays.asList(array, array2, array3));
        visualSampleEntry.addBox(hevcConfigurationBox);
        return visualSampleEntry;
    }

    private boolean isVcl(H265NalUnitHeader h265NalUnitHeader) {
        int i = h265NalUnitHeader.nalUnitType;
        return i >= 0 && i <= 31;
    }

    private static H265NalUnitHeader getNalUnitHeader(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        int readUInt16 = IsoTypeReader.readUInt16(byteBuffer);
        H265NalUnitHeader h265NalUnitHeader = new H265NalUnitHeader();
        h265NalUnitHeader.forbiddenZeroFlag = (32768 & readUInt16) >> 15;
        h265NalUnitHeader.nalUnitType = (readUInt16 & 32256) >> 9;
        h265NalUnitHeader.nuhLayerId = (readUInt16 & 504) >> 3;
        h265NalUnitHeader.nuhTemporalIdPlusOne = readUInt16 & 7;
        return h265NalUnitHeader;
    }
}
