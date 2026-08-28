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
            int i9;
            int i10 = (((((this.array_completeness ? 1 : 0) * 31) + (this.reserved ? 1 : 0)) * 31) + this.nal_unit_type) * 31;
            List<byte[]> list = this.nalUnits;
            if (list != null) {
                i9 = list.hashCode();
            } else {
                i9 = 0;
            }
            return i10 + i9;
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

    private static r2.c createSampleEntry(ArrayList<ByteBuffer> arrayList, ArrayList<ByteBuffer> arrayList2, ArrayList<ByteBuffer> arrayList3, SequenceParameterSetRbsp sequenceParameterSetRbsp) {
        r2.c cVar = new r2.c("hvc1");
        cVar.f47005f = 1;
        cVar.f47012x = 24;
        cVar.v = 1;
        cVar.f47009r = 72.0d;
        cVar.f47010s = 72.0d;
        cVar.f47011w = "HEVC Coding";
        HevcConfigurationBox hevcConfigurationBox = new HevcConfigurationBox();
        hevcConfigurationBox.getHevcDecoderConfigurationRecord().setConfigurationVersion(1);
        if (sequenceParameterSetRbsp != null) {
            cVar.h = sequenceParameterSetRbsp.pic_width_in_luma_samples;
            cVar.f47008n = sequenceParameterSetRbsp.pic_height_in_luma_samples;
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
        int i9 = 0;
        while (i9 < size) {
            ByteBuffer byteBuffer = arrayList3.get(i9);
            i9++;
            array.nalUnits.add(byteBuffer.array());
        }
        Array array2 = new Array();
        array2.array_completeness = true;
        array2.nal_unit_type = 33;
        array2.nalUnits = new ArrayList();
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            ByteBuffer byteBuffer2 = arrayList.get(i10);
            i10++;
            array2.nalUnits.add(byteBuffer2.array());
        }
        Array array3 = new Array();
        array3.array_completeness = true;
        array3.nal_unit_type = 34;
        array3.nalUnits = new ArrayList();
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            ByteBuffer byteBuffer3 = arrayList2.get(i11);
            i11++;
            array3.nalUnits.add(byteBuffer3.array());
        }
        hevcConfigurationBox.getArrays().addAll(Arrays.asList(array, array2, array3));
        cVar.a(hevcConfigurationBox);
        return cVar;
    }

    private static H265NalUnitHeader getNalUnitHeader(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        int h = p2.b.h(byteBuffer);
        H265NalUnitHeader h265NalUnitHeader = new H265NalUnitHeader();
        h265NalUnitHeader.forbiddenZeroFlag = (32768 & h) >> 15;
        h265NalUnitHeader.nalUnitType = (h & 32256) >> 9;
        h265NalUnitHeader.nuhLayerId = (h & 504) >> 3;
        h265NalUnitHeader.nuhTemporalIdPlusOne = h & 7;
        return h265NalUnitHeader;
    }

    private boolean isVcl(H265NalUnitHeader h265NalUnitHeader) {
        int i9 = h265NalUnitHeader.nalUnitType;
        if (i9 >= 0 && i9 <= 31) {
            return true;
        }
        return false;
    }

    public static r2.c parseFromCsd(List<ByteBuffer> list) {
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
                    obj.f49724a = slice;
                    sequenceParameterSetRbsp = new SequenceParameterSetRbsp(new sb.a(Channels.newInputStream((ReadableByteChannel) obj)));
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
        int i9 = 23;
        for (Array array : this.arrays) {
            i9 += 3;
            for (byte[] bArr : array.nalUnits) {
                i9 = i9 + 2 + bArr.length;
            }
        }
        return i9;
    }

    public int hashCode() {
        int i9;
        long j10 = this.general_profile_compatibility_flags;
        long j11 = this.general_constraint_indicator_flags;
        int i10 = ((((((((((((((((((((((((((((((((((((((((((this.configurationVersion * 31) + this.general_profile_space) * 31) + (this.general_tier_flag ? 1 : 0)) * 31) + this.general_profile_idc) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.general_level_idc) * 31) + this.reserved1) * 31) + this.min_spatial_segmentation_idc) * 31) + this.reserved2) * 31) + this.parallelismType) * 31) + this.reserved3) * 31) + this.chromaFormat) * 31) + this.reserved4) * 31) + this.bitDepthLumaMinus8) * 31) + this.reserved5) * 31) + this.bitDepthChromaMinus8) * 31) + this.avgFrameRate) * 31) + this.constantFrameRate) * 31) + this.numTemporalLayers) * 31) + (this.temporalIdNested ? 1 : 0)) * 31) + this.lengthSizeMinusOne) * 31;
        List<Array> list = this.arrays;
        if (list != null) {
            i9 = list.hashCode();
        } else {
            i9 = 0;
        }
        return i10 + i9;
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
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        this.configurationVersion = p2.b.k(byteBuffer);
        int a2 = p2.b.a(byteBuffer.get());
        this.general_profile_space = (a2 & 192) >> 6;
        if ((a2 & 32) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.general_tier_flag = z10;
        this.general_profile_idc = a2 & 31;
        this.general_profile_compatibility_flags = p2.b.i(byteBuffer);
        long h = p2.b.h(byteBuffer) << 32;
        if (h >= 0) {
            long i9 = p2.b.i(byteBuffer) + h;
            this.general_constraint_indicator_flags = i9;
            if (((i9 >> 44) & 8) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.frame_only_constraint_flag = z11;
            if (((i9 >> 44) & 4) > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.non_packed_constraint_flag = z12;
            if (((i9 >> 44) & 2) > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.interlaced_source_flag = z13;
            if (((i9 >> 44) & 1) > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.progressive_source_flag = z14;
            this.general_constraint_indicator_flags = 140737488355327L & i9;
            this.general_level_idc = p2.b.a(byteBuffer.get());
            int h10 = p2.b.h(byteBuffer);
            this.reserved1 = (61440 & h10) >> 12;
            this.min_spatial_segmentation_idc = h10 & 4095;
            int a3 = p2.b.a(byteBuffer.get());
            this.reserved2 = (a3 & 252) >> 2;
            this.parallelismType = a3 & 3;
            int a10 = p2.b.a(byteBuffer.get());
            this.reserved3 = (a10 & 252) >> 2;
            this.chromaFormat = a10 & 3;
            int a11 = p2.b.a(byteBuffer.get());
            this.reserved4 = (a11 & 248) >> 3;
            this.bitDepthLumaMinus8 = a11 & 7;
            int a12 = p2.b.a(byteBuffer.get());
            this.reserved5 = (a12 & 248) >> 3;
            this.bitDepthChromaMinus8 = a12 & 7;
            this.avgFrameRate = p2.b.h(byteBuffer);
            int a13 = p2.b.a(byteBuffer.get());
            this.constantFrameRate = (a13 & 192) >> 6;
            this.numTemporalLayers = (a13 & 56) >> 3;
            if ((a13 & 4) > 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.temporalIdNested = z15;
            this.lengthSizeMinusOne = a13 & 3;
            int a14 = p2.b.a(byteBuffer.get());
            this.arrays = new ArrayList();
            for (int i10 = 0; i10 < a14; i10++) {
                Array array = new Array();
                int a15 = p2.b.a(byteBuffer.get());
                if ((a15 & 128) > 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                array.array_completeness = z16;
                if ((a15 & 64) > 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                array.reserved = z17;
                array.nal_unit_type = a15 & 63;
                int h11 = p2.b.h(byteBuffer);
                array.nalUnits = new ArrayList();
                for (int i11 = 0; i11 < h11; i11++) {
                    byte[] bArr = new byte[p2.b.h(byteBuffer)];
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

    public void setAvgFrameRate(int i9) {
        this.avgFrameRate = i9;
    }

    public void setBitDepthChromaMinus8(int i9) {
        this.bitDepthChromaMinus8 = i9;
    }

    public void setBitDepthLumaMinus8(int i9) {
        this.bitDepthLumaMinus8 = i9;
    }

    public void setChromaFormat(int i9) {
        this.chromaFormat = i9;
    }

    public void setConfigurationVersion(int i9) {
        this.configurationVersion = i9;
    }

    public void setConstantFrameRate(int i9) {
        this.constantFrameRate = i9;
    }

    public void setFrame_only_constraint_flag(boolean z10) {
        this.frame_only_constraint_flag = z10;
    }

    public void setGeneral_constraint_indicator_flags(long j10) {
        this.general_constraint_indicator_flags = j10;
    }

    public void setGeneral_level_idc(int i9) {
        this.general_level_idc = i9;
    }

    public void setGeneral_profile_compatibility_flags(long j10) {
        this.general_profile_compatibility_flags = j10;
    }

    public void setGeneral_profile_idc(int i9) {
        this.general_profile_idc = i9;
    }

    public void setGeneral_profile_space(int i9) {
        this.general_profile_space = i9;
    }

    public void setGeneral_tier_flag(boolean z10) {
        this.general_tier_flag = z10;
    }

    public void setInterlaced_source_flag(boolean z10) {
        this.interlaced_source_flag = z10;
    }

    public void setLengthSizeMinusOne(int i9) {
        this.lengthSizeMinusOne = i9;
    }

    public void setMin_spatial_segmentation_idc(int i9) {
        this.min_spatial_segmentation_idc = i9;
    }

    public void setNon_packed_constraint_flag(boolean z10) {
        this.non_packed_constraint_flag = z10;
    }

    public void setNumTemporalLayers(int i9) {
        this.numTemporalLayers = i9;
    }

    public void setParallelismType(int i9) {
        this.parallelismType = i9;
    }

    public void setProgressive_source_flag(boolean z10) {
        this.progressive_source_flag = z10;
    }

    public void setTemporalIdNested(boolean z10) {
        this.temporalIdNested = z10;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb2 = new StringBuilder("HEVCDecoderConfigurationRecord{configurationVersion=");
        sb2.append(this.configurationVersion);
        sb2.append(", general_profile_space=");
        sb2.append(this.general_profile_space);
        sb2.append(", general_tier_flag=");
        sb2.append(this.general_tier_flag);
        sb2.append(", general_profile_idc=");
        sb2.append(this.general_profile_idc);
        sb2.append(", general_profile_compatibility_flags=");
        sb2.append(this.general_profile_compatibility_flags);
        sb2.append(", general_constraint_indicator_flags=");
        sb2.append(this.general_constraint_indicator_flags);
        sb2.append(", general_level_idc=");
        sb2.append(this.general_level_idc);
        String str5 = "";
        if (this.reserved1 == 15) {
            str = "";
        } else {
            str = ", reserved1=" + this.reserved1;
        }
        sb2.append(str);
        sb2.append(", min_spatial_segmentation_idc=");
        sb2.append(this.min_spatial_segmentation_idc);
        if (this.reserved2 == 63) {
            str2 = "";
        } else {
            str2 = ", reserved2=" + this.reserved2;
        }
        sb2.append(str2);
        sb2.append(", parallelismType=");
        sb2.append(this.parallelismType);
        if (this.reserved3 == 63) {
            str3 = "";
        } else {
            str3 = ", reserved3=" + this.reserved3;
        }
        sb2.append(str3);
        sb2.append(", chromaFormat=");
        sb2.append(this.chromaFormat);
        if (this.reserved4 == 31) {
            str4 = "";
        } else {
            str4 = ", reserved4=" + this.reserved4;
        }
        sb2.append(str4);
        sb2.append(", bitDepthLumaMinus8=");
        sb2.append(this.bitDepthLumaMinus8);
        if (this.reserved5 != 31) {
            str5 = ", reserved5=" + this.reserved5;
        }
        sb2.append(str5);
        sb2.append(", bitDepthChromaMinus8=");
        sb2.append(this.bitDepthChromaMinus8);
        sb2.append(", avgFrameRate=");
        sb2.append(this.avgFrameRate);
        sb2.append(", constantFrameRate=");
        sb2.append(this.constantFrameRate);
        sb2.append(", numTemporalLayers=");
        sb2.append(this.numTemporalLayers);
        sb2.append(", temporalIdNested=");
        sb2.append(this.temporalIdNested);
        sb2.append(", lengthSizeMinusOne=");
        sb2.append(this.lengthSizeMinusOne);
        sb2.append(", arrays=");
        sb2.append(this.arrays);
        sb2.append('}');
        return sb2.toString();
    }

    public void write(ByteBuffer byteBuffer) {
        int i9;
        int i10;
        int i11;
        int i12;
        p2.b.r(this.configurationVersion, byteBuffer);
        int i13 = this.general_profile_space << 6;
        if (this.general_tier_flag) {
            i9 = 32;
        } else {
            i9 = 0;
        }
        byteBuffer.put((byte) ((i13 + i9 + this.general_profile_idc) & 255));
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
        p2.b.p((int) ((281474976710655L & j10) >> 32), byteBuffer);
        byteBuffer.putInt((int) (j10 & 4294967295L));
        byteBuffer.put((byte) (this.general_level_idc & 255));
        p2.b.p((this.reserved1 << 12) + this.min_spatial_segmentation_idc, byteBuffer);
        byteBuffer.put((byte) (((this.reserved2 << 2) + this.parallelismType) & 255));
        byteBuffer.put((byte) (((this.reserved3 << 2) + this.chromaFormat) & 255));
        byteBuffer.put((byte) (((this.reserved4 << 3) + this.bitDepthLumaMinus8) & 255));
        byteBuffer.put((byte) (((this.reserved5 << 3) + this.bitDepthChromaMinus8) & 255));
        p2.b.p(this.avgFrameRate, byteBuffer);
        int i14 = (this.constantFrameRate << 6) + (this.numTemporalLayers << 3);
        if (this.temporalIdNested) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        byteBuffer.put((byte) ((i14 + i10 + this.lengthSizeMinusOne) & 255));
        byteBuffer.put((byte) (this.arrays.size() & 255));
        for (Array array : this.arrays) {
            if (array.array_completeness) {
                i11 = 128;
            } else {
                i11 = 0;
            }
            if (array.reserved) {
                i12 = 64;
            } else {
                i12 = 0;
            }
            byteBuffer.put((byte) ((i11 + i12 + array.nal_unit_type) & 255));
            p2.b.p(array.nalUnits.size(), byteBuffer);
            for (byte[] bArr : array.nalUnits) {
                p2.b.p(bArr.length, byteBuffer);
                byteBuffer.put(bArr);
            }
        }
    }
}
