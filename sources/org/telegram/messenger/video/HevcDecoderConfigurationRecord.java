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
            int i10;
            int i11 = (((((this.array_completeness ? 1 : 0) * 31) + (this.reserved ? 1 : 0)) * 31) + this.nal_unit_type) * 31;
            List<byte[]> list = this.nalUnits;
            if (list != null) {
                i10 = list.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
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

    private static t2.c createSampleEntry(ArrayList<ByteBuffer> arrayList, ArrayList<ByteBuffer> arrayList2, ArrayList<ByteBuffer> arrayList3, SequenceParameterSetRbsp sequenceParameterSetRbsp) {
        t2.c cVar = new t2.c("hvc1");
        cVar.f47833f = 1;
        cVar.f47840x = 24;
        cVar.v = 1;
        cVar.f47837r = 72.0d;
        cVar.f47838s = 72.0d;
        cVar.f47839w = "HEVC Coding";
        HevcConfigurationBox hevcConfigurationBox = new HevcConfigurationBox();
        hevcConfigurationBox.getHevcDecoderConfigurationRecord().setConfigurationVersion(1);
        if (sequenceParameterSetRbsp != null) {
            cVar.h = sequenceParameterSetRbsp.pic_width_in_luma_samples;
            cVar.f47836n = sequenceParameterSetRbsp.pic_height_in_luma_samples;
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
        int i10 = 0;
        while (i10 < size) {
            ByteBuffer byteBuffer = arrayList3.get(i10);
            i10++;
            array.nalUnits.add(byteBuffer.array());
        }
        Array array2 = new Array();
        array2.array_completeness = true;
        array2.nal_unit_type = 33;
        array2.nalUnits = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            ByteBuffer byteBuffer2 = arrayList.get(i11);
            i11++;
            array2.nalUnits.add(byteBuffer2.array());
        }
        Array array3 = new Array();
        array3.array_completeness = true;
        array3.nal_unit_type = 34;
        array3.nalUnits = new ArrayList();
        int size3 = arrayList2.size();
        int i12 = 0;
        while (i12 < size3) {
            ByteBuffer byteBuffer3 = arrayList2.get(i12);
            i12++;
            array3.nalUnits.add(byteBuffer3.array());
        }
        hevcConfigurationBox.getArrays().addAll(Arrays.asList(array, array2, array3));
        cVar.a(hevcConfigurationBox);
        return cVar;
    }

    private static H265NalUnitHeader getNalUnitHeader(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        int h = r2.b.h(byteBuffer);
        H265NalUnitHeader h265NalUnitHeader = new H265NalUnitHeader();
        h265NalUnitHeader.forbiddenZeroFlag = (32768 & h) >> 15;
        h265NalUnitHeader.nalUnitType = (h & 32256) >> 9;
        h265NalUnitHeader.nuhLayerId = (h & 504) >> 3;
        h265NalUnitHeader.nuhTemporalIdPlusOne = h & 7;
        return h265NalUnitHeader;
    }

    private boolean isVcl(H265NalUnitHeader h265NalUnitHeader) {
        int i10 = h265NalUnitHeader.nalUnitType;
        if (i10 >= 0 && i10 <= 31) {
            return true;
        }
        return false;
    }

    public static t2.c parseFromCsd(List<ByteBuffer> list) {
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
                    obj.f2447a = slice;
                    sequenceParameterSetRbsp = new SequenceParameterSetRbsp(new wb.a(Channels.newInputStream((ReadableByteChannel) obj)));
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
        int i10 = 23;
        for (Array array : this.arrays) {
            i10 += 3;
            for (byte[] bArr : array.nalUnits) {
                i10 = i10 + 2 + bArr.length;
            }
        }
        return i10;
    }

    public int hashCode() {
        int i10;
        long j10 = this.general_profile_compatibility_flags;
        long j11 = this.general_constraint_indicator_flags;
        int i11 = ((((((((((((((((((((((((((((((((((((((((((this.configurationVersion * 31) + this.general_profile_space) * 31) + (this.general_tier_flag ? 1 : 0)) * 31) + this.general_profile_idc) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.general_level_idc) * 31) + this.reserved1) * 31) + this.min_spatial_segmentation_idc) * 31) + this.reserved2) * 31) + this.parallelismType) * 31) + this.reserved3) * 31) + this.chromaFormat) * 31) + this.reserved4) * 31) + this.bitDepthLumaMinus8) * 31) + this.reserved5) * 31) + this.bitDepthChromaMinus8) * 31) + this.avgFrameRate) * 31) + this.constantFrameRate) * 31) + this.numTemporalLayers) * 31) + (this.temporalIdNested ? 1 : 0)) * 31) + this.lengthSizeMinusOne) * 31;
        List<Array> list = this.arrays;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
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
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        this.configurationVersion = r2.b.k(byteBuffer);
        int a2 = r2.b.a(byteBuffer.get());
        this.general_profile_space = (a2 & 192) >> 6;
        if ((a2 & 32) > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.general_tier_flag = z4;
        this.general_profile_idc = a2 & 31;
        this.general_profile_compatibility_flags = r2.b.i(byteBuffer);
        long h = r2.b.h(byteBuffer) << 32;
        if (h >= 0) {
            long i10 = r2.b.i(byteBuffer) + h;
            this.general_constraint_indicator_flags = i10;
            if (((i10 >> 44) & 8) > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.frame_only_constraint_flag = z10;
            if (((i10 >> 44) & 4) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.non_packed_constraint_flag = z11;
            if (((i10 >> 44) & 2) > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.interlaced_source_flag = z12;
            if (((i10 >> 44) & 1) > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.progressive_source_flag = z13;
            this.general_constraint_indicator_flags = 140737488355327L & i10;
            this.general_level_idc = r2.b.a(byteBuffer.get());
            int h9 = r2.b.h(byteBuffer);
            this.reserved1 = (61440 & h9) >> 12;
            this.min_spatial_segmentation_idc = h9 & 4095;
            int a10 = r2.b.a(byteBuffer.get());
            this.reserved2 = (a10 & 252) >> 2;
            this.parallelismType = a10 & 3;
            int a11 = r2.b.a(byteBuffer.get());
            this.reserved3 = (a11 & 252) >> 2;
            this.chromaFormat = a11 & 3;
            int a12 = r2.b.a(byteBuffer.get());
            this.reserved4 = (a12 & 248) >> 3;
            this.bitDepthLumaMinus8 = a12 & 7;
            int a13 = r2.b.a(byteBuffer.get());
            this.reserved5 = (a13 & 248) >> 3;
            this.bitDepthChromaMinus8 = a13 & 7;
            this.avgFrameRate = r2.b.h(byteBuffer);
            int a14 = r2.b.a(byteBuffer.get());
            this.constantFrameRate = (a14 & 192) >> 6;
            this.numTemporalLayers = (a14 & 56) >> 3;
            if ((a14 & 4) > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.temporalIdNested = z14;
            this.lengthSizeMinusOne = a14 & 3;
            int a15 = r2.b.a(byteBuffer.get());
            this.arrays = new ArrayList();
            for (int i11 = 0; i11 < a15; i11++) {
                Array array = new Array();
                int a16 = r2.b.a(byteBuffer.get());
                if ((a16 & 128) > 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                array.array_completeness = z15;
                if ((a16 & 64) > 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                array.reserved = z16;
                array.nal_unit_type = a16 & 63;
                int h10 = r2.b.h(byteBuffer);
                array.nalUnits = new ArrayList();
                for (int i12 = 0; i12 < h10; i12++) {
                    byte[] bArr = new byte[r2.b.h(byteBuffer)];
                    byteBuffer.get(bArr);
                    array.nalUnits.add(bArr);
                }
                this.arrays.add(array);
            }
            return;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public void setArrays(List<Array> list) {
        this.arrays = list;
    }

    public void setAvgFrameRate(int i10) {
        this.avgFrameRate = i10;
    }

    public void setBitDepthChromaMinus8(int i10) {
        this.bitDepthChromaMinus8 = i10;
    }

    public void setBitDepthLumaMinus8(int i10) {
        this.bitDepthLumaMinus8 = i10;
    }

    public void setChromaFormat(int i10) {
        this.chromaFormat = i10;
    }

    public void setConfigurationVersion(int i10) {
        this.configurationVersion = i10;
    }

    public void setConstantFrameRate(int i10) {
        this.constantFrameRate = i10;
    }

    public void setFrame_only_constraint_flag(boolean z4) {
        this.frame_only_constraint_flag = z4;
    }

    public void setGeneral_constraint_indicator_flags(long j10) {
        this.general_constraint_indicator_flags = j10;
    }

    public void setGeneral_level_idc(int i10) {
        this.general_level_idc = i10;
    }

    public void setGeneral_profile_compatibility_flags(long j10) {
        this.general_profile_compatibility_flags = j10;
    }

    public void setGeneral_profile_idc(int i10) {
        this.general_profile_idc = i10;
    }

    public void setGeneral_profile_space(int i10) {
        this.general_profile_space = i10;
    }

    public void setGeneral_tier_flag(boolean z4) {
        this.general_tier_flag = z4;
    }

    public void setInterlaced_source_flag(boolean z4) {
        this.interlaced_source_flag = z4;
    }

    public void setLengthSizeMinusOne(int i10) {
        this.lengthSizeMinusOne = i10;
    }

    public void setMin_spatial_segmentation_idc(int i10) {
        this.min_spatial_segmentation_idc = i10;
    }

    public void setNon_packed_constraint_flag(boolean z4) {
        this.non_packed_constraint_flag = z4;
    }

    public void setNumTemporalLayers(int i10) {
        this.numTemporalLayers = i10;
    }

    public void setParallelismType(int i10) {
        this.parallelismType = i10;
    }

    public void setProgressive_source_flag(boolean z4) {
        this.progressive_source_flag = z4;
    }

    public void setTemporalIdNested(boolean z4) {
        this.temporalIdNested = z4;
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
        int i10;
        int i11;
        int i12;
        int i13;
        r2.b.r(this.configurationVersion, byteBuffer);
        int i14 = this.general_profile_space << 6;
        if (this.general_tier_flag) {
            i10 = 32;
        } else {
            i10 = 0;
        }
        byteBuffer.put((byte) ((i14 + i10 + this.general_profile_idc) & 255));
        byteBuffer.putInt((int) this.general_profile_compatibility_flags);
        long j10 = this.general_constraint_indicator_flags;
        if (this.frame_only_constraint_flag) {
            j10 |= 140737488355328L;
        }
        if (this.non_packed_constraint_flag) {
            j10 |= 70368744177664L;
        }
        if (this.interlaced_source_flag) {
            j10 |= 35184372088832L;
        }
        if (this.progressive_source_flag) {
            j10 |= 17592186044416L;
        }
        r2.b.p((int) ((281474976710655L & j10) >> 32), byteBuffer);
        byteBuffer.putInt((int) (j10 & 4294967295L));
        byteBuffer.put((byte) (this.general_level_idc & 255));
        r2.b.p((this.reserved1 << 12) + this.min_spatial_segmentation_idc, byteBuffer);
        byteBuffer.put((byte) (((this.reserved2 << 2) + this.parallelismType) & 255));
        byteBuffer.put((byte) (((this.reserved3 << 2) + this.chromaFormat) & 255));
        byteBuffer.put((byte) (((this.reserved4 << 3) + this.bitDepthLumaMinus8) & 255));
        byteBuffer.put((byte) (((this.reserved5 << 3) + this.bitDepthChromaMinus8) & 255));
        r2.b.p(this.avgFrameRate, byteBuffer);
        int i15 = (this.constantFrameRate << 6) + (this.numTemporalLayers << 3);
        if (this.temporalIdNested) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        byteBuffer.put((byte) ((i15 + i11 + this.lengthSizeMinusOne) & 255));
        byteBuffer.put((byte) (this.arrays.size() & 255));
        for (Array array : this.arrays) {
            if (array.array_completeness) {
                i12 = 128;
            } else {
                i12 = 0;
            }
            if (array.reserved) {
                i13 = 64;
            } else {
                i13 = 0;
            }
            byteBuffer.put((byte) ((i12 + i13 + array.nal_unit_type) & 255));
            r2.b.p(array.nalUnits.size(), byteBuffer);
            for (byte[] bArr : array.nalUnits) {
                r2.b.p(bArr.length, byteBuffer);
                byteBuffer.put(bArr);
            }
        }
    }
}
