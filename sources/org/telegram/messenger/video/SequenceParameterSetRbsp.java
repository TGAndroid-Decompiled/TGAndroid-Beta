package org.telegram.messenger.video;

import com.android.billingclient.api.zzbv;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import java.io.InputStream;
import java.lang.reflect.Array;

public class SequenceParameterSetRbsp {
    public int bit_depth_chroma_minus8;
    public int bit_depth_luma_minus8;
    public int chroma_format_idc;
    public long general_constraint_indicator_flags;
    public byte general_level_idc;
    public long general_profile_compatibility_flags;
    public int general_profile_idc;
    public int general_profile_space;
    public boolean general_tier_flag;
    public int pic_height_in_luma_samples;
    public int pic_width_in_luma_samples;
    public int sps_max_sub_layers_minus1;
    public boolean sps_temporal_id_nesting_flag;

    public SequenceParameterSetRbsp(InputStream inputStream) {
        CAVLCReader cAVLCReader = new CAVLCReader();
        zzbv zzbvVar = new zzbv((char) 0, 10);
        zzbvVar.zza = new char[50];
        cAVLCReader.debugBits = zzbvVar;
        cAVLCReader.is = inputStream;
        cAVLCReader.curByte = inputStream.read();
        cAVLCReader.nextByte = inputStream.read();
        cAVLCReader.readNBit(4, "sps_video_parameter_set_id");
        this.sps_max_sub_layers_minus1 = (int) cAVLCReader.readNBit(3, "sps_max_sub_layers_minus1");
        cAVLCReader.readBool("sps_temporal_id_nesting_flag");
        profile_tier_level(this.sps_max_sub_layers_minus1, cAVLCReader);
        cAVLCReader.readUE("sps_seq_parameter_set_id");
        int ue = cAVLCReader.readUE("chroma_format_idc");
        this.chroma_format_idc = ue;
        if (ue == 3) {
            cAVLCReader.read1Bit();
        }
        this.pic_width_in_luma_samples = cAVLCReader.readUE("pic_width_in_luma_samples");
        this.pic_height_in_luma_samples = cAVLCReader.readUE("pic_width_in_luma_samples");
        if (cAVLCReader.readBool("conformance_window_flag")) {
            cAVLCReader.readUE("conf_win_left_offset");
            cAVLCReader.readUE("conf_win_right_offset");
            cAVLCReader.readUE("conf_win_top_offset");
            cAVLCReader.readUE("conf_win_bottom_offset");
        }
        this.bit_depth_luma_minus8 = cAVLCReader.readUE("bit_depth_luma_minus8");
        this.bit_depth_chroma_minus8 = cAVLCReader.readUE("bit_depth_chroma_minus8");
        int ue2 = cAVLCReader.readUE("log2_max_pic_order_cnt_lsb_minus4");
        boolean bool = cAVLCReader.readBool("sps_sub_layer_ordering_info_present_flag");
        int i = this.sps_max_sub_layers_minus1;
        int i2 = (i - (bool ? 0 : i)) + 1;
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        for (i = bool ? 0 : i; i <= this.sps_max_sub_layers_minus1; i++) {
            iArr[i] = cAVLCReader.readUE("sps_max_dec_pic_buffering_minus1[" + i + "]");
            iArr2[i] = cAVLCReader.readUE("sps_max_num_reorder_pics[" + i + "]");
            iArr3[i] = cAVLCReader.readUE("sps_max_latency_increase_plus1[" + i + "]");
        }
        cAVLCReader.readUE("log2_min_luma_coding_block_size_minus3");
        cAVLCReader.readUE("log2_diff_max_min_luma_coding_block_size");
        cAVLCReader.readUE("log2_min_transform_block_size_minus2");
        cAVLCReader.readUE("log2_diff_max_min_transform_block_size");
        cAVLCReader.readUE("max_transform_hierarchy_depth_inter");
        cAVLCReader.readUE("max_transform_hierarchy_depth_intra");
        if (cAVLCReader.readBool("scaling_list_enabled_flag") && cAVLCReader.readBool("sps_scaling_list_data_present_flag")) {
            skip_scaling_list_data(cAVLCReader);
        }
        cAVLCReader.readBool("amp_enabled_flag");
        cAVLCReader.readBool("sample_adaptive_offset_enabled_flag");
        if (cAVLCReader.readBool("pcm_enabled_flag")) {
            cAVLCReader.readNBit(4, "pcm_sample_bit_depth_luma_minus1");
            cAVLCReader.readNBit(4, "pcm_sample_bit_depth_chroma_minus1");
            cAVLCReader.readUE("log2_min_pcm_luma_coding_block_size_minus3");
            cAVLCReader.readUE("log2_diff_max_min_pcm_luma_coding_block_size");
            cAVLCReader.readBool("pcm_loop_filter_disabled_flag");
        }
        parse_short_term_ref_pic_sets(cAVLCReader.readUE("num_short_term_ref_pic_sets"), cAVLCReader);
        if (cAVLCReader.readBool("long_term_ref_pics_present_flag")) {
            int ue3 = cAVLCReader.readUE("num_long_term_ref_pics_sps");
            int[] iArr4 = new int[ue3];
            boolean[] zArr = new boolean[ue3];
            for (int i3 = 0; i3 < ue3; i3++) {
                iArr4[i3] = (int) cAVLCReader.readNBit(ue2 + 4, "lt_ref_pic_poc_lsb_sps[" + i3 + "]");
                zArr[i3] = cAVLCReader.readBool("used_by_curr_pic_lt_sps_flag[" + i3 + "]");
            }
        }
        cAVLCReader.readBool("sps_temporal_mvp_enabled_flag");
        cAVLCReader.readBool("strong_intra_smoothing_enabled_flag");
    }

    private void parse_short_term_ref_pic_sets(int i, CAVLCReader cAVLCReader) {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0 || cAVLCReader.read1Bit() != 1) {
                long ue = cAVLCReader.readUE("num_positive_pics") + cAVLCReader.readUE("num_negative_pics");
                jArr[i2] = ue;
                for (long j = 0; j < ue; j++) {
                    cAVLCReader.readUE("delta_poc_s0/1_minus1");
                    cAVLCReader.readBool("used_by_curr_pic_s0/1_flag");
                }
            } else {
                cAVLCReader.readBool("delta_rps_sign");
                cAVLCReader.readUE("abs_delta_rps_minus1");
                jArr[i2] = 0;
                for (int i3 = 0; i3 <= jArr[i2 - 1]; i3++) {
                    boolean z = cAVLCReader.read1Bit() == 1;
                    boolean z2 = !z && cAVLCReader.read1Bit() == 1;
                    if (z || z2) {
                        jArr[i2] = jArr[i2] + 1;
                    }
                }
            }
        }
    }

    private void profile_tier_level(int i, CAVLCReader cAVLCReader) {
        boolean[] zArr;
        long[] jArr;
        int i2 = i;
        this.general_profile_space = (int) cAVLCReader.readNBit(2, "general_profile_space");
        this.general_tier_flag = cAVLCReader.readBool("general_tier_flag");
        this.general_profile_idc = (int) cAVLCReader.readNBit(5, "general_profile_idc");
        this.general_profile_compatibility_flags = cAVLCReader.readNBit(32);
        this.general_constraint_indicator_flags = cAVLCReader.readNBit(48);
        if (cAVLCReader.nBit > 0) {
            cAVLCReader.curByte = cAVLCReader.nextByte;
            cAVLCReader.nextByte = cAVLCReader.is.read();
            cAVLCReader.nBit = 0;
        }
        int i3 = cAVLCReader.curByte;
        cAVLCReader.curByte = cAVLCReader.nextByte;
        cAVLCReader.nextByte = cAVLCReader.is.read();
        cAVLCReader.nBit = 0;
        this.general_level_idc = (byte) i3;
        boolean[] zArr2 = new boolean[i2];
        boolean[] zArr3 = new boolean[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            zArr2[i4] = cAVLCReader.readBool("sub_layer_profile_present_flag[" + i4 + "]");
            zArr3[i4] = cAVLCReader.readBool("sub_layer_level_present_flag[" + i4 + "]");
        }
        if (i2 > 0) {
            int[] iArr = new int[8];
            for (int i5 = i2; i5 < 8; i5++) {
                iArr[i5] = (int) cAVLCReader.readNBit(2, "reserved_zero_2bits[" + i5 + "]");
            }
        }
        int[] iArr2 = new int[i2];
        boolean[] zArr4 = new boolean[i2];
        int[] iArr3 = new int[i2];
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i2, 32);
        boolean[] zArr6 = new boolean[i2];
        boolean[] zArr7 = new boolean[i2];
        boolean[] zArr8 = new boolean[i2];
        boolean[] zArr9 = new boolean[i2];
        long[] jArr2 = new long[i2];
        int[] iArr4 = new int[i2];
        int i6 = 0;
        while (i6 < i2) {
            if (zArr2[i6]) {
                zArr = zArr9;
                jArr = jArr2;
                iArr2[i6] = (int) cAVLCReader.readNBit(2, "sub_layer_profile_space[" + i6 + "]");
                zArr4[i6] = cAVLCReader.readBool("sub_layer_tier_flag[" + i6 + "]");
                iArr3[i6] = (int) cAVLCReader.readNBit(5, "sub_layer_profile_idc[" + i6 + "]");
                for (int i7 = 0; i7 < 32; i7++) {
                    zArr5[i6][i7] = cAVLCReader.readBool("sub_layer_profile_compatibility_flag[" + i6 + "][" + i7 + "]");
                }
                zArr6[i6] = cAVLCReader.readBool("sub_layer_progressive_source_flag[" + i6 + "]");
                zArr7[i6] = cAVLCReader.readBool("sub_layer_interlaced_source_flag[" + i6 + "]");
                zArr8[i6] = cAVLCReader.readBool("sub_layer_non_packed_constraint_flag[" + i6 + "]");
                zArr[i6] = cAVLCReader.readBool("sub_layer_frame_only_constraint_flag[" + i6 + "]");
                jArr[i6] = cAVLCReader.readNBit(44);
            } else {
                zArr = zArr9;
                jArr = jArr2;
            }
            if (zArr3[i6]) {
                iArr4[i6] = (int) cAVLCReader.readNBit(8, "sub_layer_level_idc[" + i6 + "]");
            }
            i6++;
            i2 = i;
            zArr2 = zArr2;
            jArr2 = jArr;
            zArr9 = zArr;
            iArr4 = iArr4;
        }
    }

    private static void skip_scaling_list_data(CAVLCReader cAVLCReader) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (true) {
                if (i2 < (i == 3 ? 2 : 6)) {
                    if (cAVLCReader.read1Bit() == 1) {
                        cAVLCReader.readUE("scaling_list_pred_matrix_id_delta");
                    } else {
                        int iMin = Math.min(64, 1 << ((i << 1) + 4));
                        if (i > 1) {
                            cAVLCReader.readUE("scaling_list_dc_coef_minus8");
                        }
                        for (int i3 = 0; i3 < iMin; i3++) {
                            cAVLCReader.readUE("scaling_list_delta_coef");
                        }
                    }
                    i2++;
                }
            }
            i++;
        }
    }
}
