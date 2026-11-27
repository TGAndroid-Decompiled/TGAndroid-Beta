package org.telegram.messenger.video;

import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
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

    public static class Array {
        public boolean array_completeness;
        public List<byte[]> nalUnits;
        public int nal_unit_type;
        public boolean reserved;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Array array = (Array) obj;
                if (this.array_completeness != array.array_completeness || this.nal_unit_type != array.nal_unit_type || this.reserved != array.reserved) {
                    return false;
                }
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
                if (!listIterator.hasNext() && !listIterator2.hasNext()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = (((((this.array_completeness ? 1 : 0) * 31) + (this.reserved ? 1 : 0)) * 31) + this.nal_unit_type) * 31;
            List<byte[]> list = this.nalUnits;
            if (list != null) {
                i = list.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return "Array{nal_unit_type=" + this.nal_unit_type + ", reserved=" + this.reserved + ", array_completeness=" + this.array_completeness + ", num_nals=" + this.nalUnits.size() + '}';
        }
    }

    public static class H265NalUnitHeader {
        public int forbiddenZeroFlag;
        public int nalUnitType;
        public int nuhLayerId;
        public int nuhTemporalIdPlusOne;
    }

    private static ijc createSampleEntry(ArrayList<ByteBuffer> arrayList, ArrayList<ByteBuffer> arrayList2, ArrayList<ByteBuffer> arrayList3, SequenceParameterSetRbsp sequenceParameterSetRbsp) {
        ijc ijcVar = new ijc("hvc1");
        ijcVar.n = "HEVC Coding";
        HevcConfigurationBox hevcConfigurationBox = new HevcConfigurationBox();
        hevcConfigurationBox.getHevcDecoderConfigurationRecord().setConfigurationVersion(1);
        if (sequenceParameterSetRbsp != null) {
            ijcVar.f = sequenceParameterSetRbsp.pic_width_in_luma_samples;
            ijcVar.h = sequenceParameterSetRbsp.pic_height_in_luma_samples;
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
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            ByteBuffer byteBuffer = arrayList3.get(i);
            i++;
            array.nalUnits.add(byteBuffer.array());
        }
        Array array2 = new Array();
        array2.array_completeness = true;
        array2.nal_unit_type = 33;
        array2.nalUnits = new ArrayList();
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            ByteBuffer byteBuffer2 = arrayList.get(i2);
            i2++;
            array2.nalUnits.add(byteBuffer2.array());
        }
        Array array3 = new Array();
        array3.array_completeness = true;
        array3.nal_unit_type = 34;
        array3.nalUnits = new ArrayList();
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            ByteBuffer byteBuffer3 = arrayList2.get(i3);
            i3++;
            array3.nalUnits.add(byteBuffer3.array());
        }
        hevcConfigurationBox.getArrays().addAll(Arrays.asList(array, array2, array3));
        ijcVar.a(hevcConfigurationBox);
        return ijcVar;
    }

    private static H265NalUnitHeader getNalUnitHeader(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        int f = zpe.f(byteBuffer);
        H265NalUnitHeader h265NalUnitHeader = new H265NalUnitHeader();
        h265NalUnitHeader.forbiddenZeroFlag = (32768 & f) >> 15;
        h265NalUnitHeader.nalUnitType = (f & 32256) >> 9;
        h265NalUnitHeader.nuhLayerId = (f & 504) >> 3;
        h265NalUnitHeader.nuhTemporalIdPlusOne = f & 7;
        return h265NalUnitHeader;
    }

    private boolean isVcl(H265NalUnitHeader h265NalUnitHeader) {
        int i = h265NalUnitHeader.nalUnitType;
        if (i >= 0 && i <= 31) {
            return true;
        }
        return false;
    }

    public static ijc parseFromCsd(List<ByteBuffer> list) {
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
                case 33:
                    arrayList.add(byteBuffer.duplicate());
                    byteBuffer.position(2);
                    ByteBuffer slice = byteBuffer.slice();
                    ?? obj = new Object();
                    obj.a = slice;
                    sequenceParameterSetRbsp = new SequenceParameterSetRbsp(new oi2(Channels.newInputStream((ReadableByteChannel) obj)));
                    break;
                case 34:
                    arrayList2.add(byteBuffer.duplicate());
                    break;
            }
        }
        return createSampleEntry(arrayList, arrayList2, arrayList3, sequenceParameterSetRbsp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord = (HevcDecoderConfigurationRecord) obj;
        if (this.avgFrameRate != hevcDecoderConfigurationRecord.avgFrameRate || this.bitDepthChromaMinus8 != hevcDecoderConfigurationRecord.bitDepthChromaMinus8 || this.bitDepthLumaMinus8 != hevcDecoderConfigurationRecord.bitDepthLumaMinus8 || this.chromaFormat != hevcDecoderConfigurationRecord.chromaFormat || this.configurationVersion != hevcDecoderConfigurationRecord.configurationVersion || this.constantFrameRate != hevcDecoderConfigurationRecord.constantFrameRate || this.general_constraint_indicator_flags != hevcDecoderConfigurationRecord.general_constraint_indicator_flags || this.general_level_idc != hevcDecoderConfigurationRecord.general_level_idc || this.general_profile_compatibility_flags != hevcDecoderConfigurationRecord.general_profile_compatibility_flags || this.general_profile_idc != hevcDecoderConfigurationRecord.general_profile_idc || this.general_profile_space != hevcDecoderConfigurationRecord.general_profile_space || this.general_tier_flag != hevcDecoderConfigurationRecord.general_tier_flag || this.lengthSizeMinusOne != hevcDecoderConfigurationRecord.lengthSizeMinusOne || this.min_spatial_segmentation_idc != hevcDecoderConfigurationRecord.min_spatial_segmentation_idc || this.numTemporalLayers != hevcDecoderConfigurationRecord.numTemporalLayers || this.parallelismType != hevcDecoderConfigurationRecord.parallelismType || this.reserved1 != hevcDecoderConfigurationRecord.reserved1 || this.reserved2 != hevcDecoderConfigurationRecord.reserved2 || this.reserved3 != hevcDecoderConfigurationRecord.reserved3 || this.reserved4 != hevcDecoderConfigurationRecord.reserved4 || this.reserved5 != hevcDecoderConfigurationRecord.reserved5 || this.temporalIdNested != hevcDecoderConfigurationRecord.temporalIdNested) {
            return false;
        }
        List<Array> list = this.arrays;
        List<Array> list2 = hevcDecoderConfigurationRecord.arrays;
        if (list == null ? list2 == null : list.equals(list2)) {
            return true;
        }
        return false;
    }

    public List<Array> getArrays() {
        return this.arrays;
    }

    public int getAvgFrameRate() {
        return this.avgFrameRate;
    }

    public int getBitDepthChromaMinus8() {
        return this.bitDepthChromaMinus8;
    }

    public int getBitDepthLumaMinus8() {
        return this.bitDepthLumaMinus8;
    }

    public int getChromaFormat() {
        return this.chromaFormat;
    }

    public int getConfigurationVersion() {
        return this.configurationVersion;
    }

    public int getConstantFrameRate() {
        return this.constantFrameRate;
    }

    public long getGeneral_constraint_indicator_flags() {
        return this.general_constraint_indicator_flags;
    }

    public int getGeneral_level_idc() {
        return this.general_level_idc;
    }

    public long getGeneral_profile_compatibility_flags() {
        return this.general_profile_compatibility_flags;
    }

    public int getGeneral_profile_idc() {
        return this.general_profile_idc;
    }

    public int getGeneral_profile_space() {
        return this.general_profile_space;
    }

    public int getLengthSizeMinusOne() {
        return this.lengthSizeMinusOne;
    }

    public int getMin_spatial_segmentation_idc() {
        return this.min_spatial_segmentation_idc;
    }

    public int getNumTemporalLayers() {
        return this.numTemporalLayers;
    }

    public int getParallelismType() {
        return this.parallelismType;
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

    public int hashCode() {
        int i;
        long j = this.general_profile_compatibility_flags;
        long j2 = this.general_constraint_indicator_flags;
        int i2 = ((((((((((((((((((((((((((((((((((((((((((this.configurationVersion * 31) + this.general_profile_space) * 31) + (this.general_tier_flag ? 1 : 0)) * 31) + this.general_profile_idc) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.general_level_idc) * 31) + this.reserved1) * 31) + this.min_spatial_segmentation_idc) * 31) + this.reserved2) * 31) + this.parallelismType) * 31) + this.reserved3) * 31) + this.chromaFormat) * 31) + this.reserved4) * 31) + this.bitDepthLumaMinus8) * 31) + this.reserved5) * 31) + this.bitDepthChromaMinus8) * 31) + this.avgFrameRate) * 31) + this.constantFrameRate) * 31) + this.numTemporalLayers) * 31) + (this.temporalIdNested ? 1 : 0)) * 31) + this.lengthSizeMinusOne) * 31;
        List<Array> list = this.arrays;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public boolean isFrame_only_constraint_flag() {
        return this.frame_only_constraint_flag;
    }

    public boolean isGeneral_tier_flag() {
        return this.general_tier_flag;
    }

    public boolean isInterlaced_source_flag() {
        return this.interlaced_source_flag;
    }

    public boolean isNon_packed_constraint_flag() {
        return this.non_packed_constraint_flag;
    }

    public boolean isProgressive_source_flag() {
        return this.progressive_source_flag;
    }

    public boolean isTemporalIdNested() {
        return this.temporalIdNested;
    }

    public void parse(ByteBuffer byteBuffer) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        this.configurationVersion = zpe.i(byteBuffer);
        int a = zpe.a(byteBuffer.get());
        this.general_profile_space = (a & 192) >> 6;
        if ((a & 32) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.general_tier_flag = z;
        this.general_profile_idc = a & 31;
        this.general_profile_compatibility_flags = zpe.g(byteBuffer);
        long f = zpe.f(byteBuffer) << 32;
        if (f >= 0) {
            long g = zpe.g(byteBuffer) + f;
            this.general_constraint_indicator_flags = g;
            if (((g >> 44) & 8) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.frame_only_constraint_flag = z2;
            if (((g >> 44) & 4) > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.non_packed_constraint_flag = z3;
            if (((g >> 44) & 2) > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.interlaced_source_flag = z4;
            if (((g >> 44) & 1) > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.progressive_source_flag = z5;
            this.general_constraint_indicator_flags = g & 140737488355327L;
            this.general_level_idc = zpe.a(byteBuffer.get());
            int f2 = zpe.f(byteBuffer);
            this.reserved1 = (61440 & f2) >> 12;
            this.min_spatial_segmentation_idc = f2 & 4095;
            int a2 = zpe.a(byteBuffer.get());
            this.reserved2 = (a2 & 252) >> 2;
            this.parallelismType = a2 & 3;
            int a3 = zpe.a(byteBuffer.get());
            this.reserved3 = (a3 & 252) >> 2;
            this.chromaFormat = a3 & 3;
            int a4 = zpe.a(byteBuffer.get());
            this.reserved4 = (a4 & 248) >> 3;
            this.bitDepthLumaMinus8 = a4 & 7;
            int a5 = zpe.a(byteBuffer.get());
            this.reserved5 = (a5 & 248) >> 3;
            this.bitDepthChromaMinus8 = a5 & 7;
            this.avgFrameRate = zpe.f(byteBuffer);
            int a6 = zpe.a(byteBuffer.get());
            this.constantFrameRate = (a6 & 192) >> 6;
            this.numTemporalLayers = (a6 & 56) >> 3;
            if ((a6 & 4) > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.temporalIdNested = z6;
            this.lengthSizeMinusOne = a6 & 3;
            int a7 = zpe.a(byteBuffer.get());
            this.arrays = new ArrayList();
            for (int i = 0; i < a7; i++) {
                Array array = new Array();
                int a8 = zpe.a(byteBuffer.get());
                if ((a8 & 128) > 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                array.array_completeness = z7;
                if ((a8 & 64) > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                array.reserved = z8;
                array.nal_unit_type = a8 & 63;
                int f3 = zpe.f(byteBuffer);
                array.nalUnits = new ArrayList();
                for (int i2 = 0; i2 < f3; i2++) {
                    byte[] bArr = new byte[zpe.f(byteBuffer)];
                    byteBuffer.get(bArr);
                    array.nalUnits.add(bArr);
                }
                this.arrays.add(array);
            }
            return;
        }
        xi4.l("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public void setArrays(List<Array> list) {
        this.arrays = list;
    }

    public void setAvgFrameRate(int i) {
        this.avgFrameRate = i;
    }

    public void setBitDepthChromaMinus8(int i) {
        this.bitDepthChromaMinus8 = i;
    }

    public void setBitDepthLumaMinus8(int i) {
        this.bitDepthLumaMinus8 = i;
    }

    public void setChromaFormat(int i) {
        this.chromaFormat = i;
    }

    public void setConfigurationVersion(int i) {
        this.configurationVersion = i;
    }

    public void setConstantFrameRate(int i) {
        this.constantFrameRate = i;
    }

    public void setFrame_only_constraint_flag(boolean z) {
        this.frame_only_constraint_flag = z;
    }

    public void setGeneral_constraint_indicator_flags(long j) {
        this.general_constraint_indicator_flags = j;
    }

    public void setGeneral_level_idc(int i) {
        this.general_level_idc = i;
    }

    public void setGeneral_profile_compatibility_flags(long j) {
        this.general_profile_compatibility_flags = j;
    }

    public void setGeneral_profile_idc(int i) {
        this.general_profile_idc = i;
    }

    public void setGeneral_profile_space(int i) {
        this.general_profile_space = i;
    }

    public void setGeneral_tier_flag(boolean z) {
        this.general_tier_flag = z;
    }

    public void setInterlaced_source_flag(boolean z) {
        this.interlaced_source_flag = z;
    }

    public void setLengthSizeMinusOne(int i) {
        this.lengthSizeMinusOne = i;
    }

    public void setMin_spatial_segmentation_idc(int i) {
        this.min_spatial_segmentation_idc = i;
    }

    public void setNon_packed_constraint_flag(boolean z) {
        this.non_packed_constraint_flag = z;
    }

    public void setNumTemporalLayers(int i) {
        this.numTemporalLayers = i;
    }

    public void setParallelismType(int i) {
        this.parallelismType = i;
    }

    public void setProgressive_source_flag(boolean z) {
        this.progressive_source_flag = z;
    }

    public void setTemporalIdNested(boolean z) {
        this.temporalIdNested = z;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("HEVCDecoderConfigurationRecord{configurationVersion=");
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
        String str5 = "";
        if (this.reserved1 == 15) {
            str = "";
        } else {
            str = ", reserved1=" + this.reserved1;
        }
        sb.append(str);
        sb.append(", min_spatial_segmentation_idc=");
        sb.append(this.min_spatial_segmentation_idc);
        if (this.reserved2 == 63) {
            str2 = "";
        } else {
            str2 = ", reserved2=" + this.reserved2;
        }
        sb.append(str2);
        sb.append(", parallelismType=");
        sb.append(this.parallelismType);
        if (this.reserved3 == 63) {
            str3 = "";
        } else {
            str3 = ", reserved3=" + this.reserved3;
        }
        sb.append(str3);
        sb.append(", chromaFormat=");
        sb.append(this.chromaFormat);
        if (this.reserved4 == 31) {
            str4 = "";
        } else {
            str4 = ", reserved4=" + this.reserved4;
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

    public void write(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        int i4;
        aqe.f(this.configurationVersion, byteBuffer);
        int i5 = this.general_profile_space << 6;
        if (this.general_tier_flag) {
            i = 32;
        } else {
            i = 0;
        }
        byteBuffer.put((byte) ((i5 + i + this.general_profile_idc) & 255));
        byteBuffer.putInt((int) this.general_profile_compatibility_flags);
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
        aqe.d((int) ((281474976710655L & j) >> 32), byteBuffer);
        byteBuffer.putInt((int) (j & 4294967295L));
        byteBuffer.put((byte) (this.general_level_idc & 255));
        aqe.d((this.reserved1 << 12) + this.min_spatial_segmentation_idc, byteBuffer);
        byteBuffer.put((byte) (((this.reserved2 << 2) + this.parallelismType) & 255));
        byteBuffer.put((byte) (((this.reserved3 << 2) + this.chromaFormat) & 255));
        byteBuffer.put((byte) (((this.reserved4 << 3) + this.bitDepthLumaMinus8) & 255));
        byteBuffer.put((byte) (((this.reserved5 << 3) + this.bitDepthChromaMinus8) & 255));
        aqe.d(this.avgFrameRate, byteBuffer);
        int i6 = (this.constantFrameRate << 6) + (this.numTemporalLayers << 3);
        if (this.temporalIdNested) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        byteBuffer.put((byte) ((i6 + i2 + this.lengthSizeMinusOne) & 255));
        byteBuffer.put((byte) (this.arrays.size() & 255));
        for (Array array : this.arrays) {
            if (array.array_completeness) {
                i3 = 128;
            } else {
                i3 = 0;
            }
            if (array.reserved) {
                i4 = 64;
            } else {
                i4 = 0;
            }
            byteBuffer.put((byte) ((i3 + i4 + array.nal_unit_type) & 255));
            aqe.d(array.nalUnits.size(), byteBuffer);
            for (byte[] bArr : array.nalUnits) {
                aqe.d(bArr.length, byteBuffer);
                byteBuffer.put(bArr);
            }
        }
    }
}
