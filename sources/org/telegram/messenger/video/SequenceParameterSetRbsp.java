package org.telegram.messenger.video;

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
        int i;
        ?? obj = new Object();
        vk1 vk1Var = new vk1((byte) 0);
        vk1Var.b = new char[50];
        obj.e = vk1Var;
        obj.a = inputStream;
        obj.b = inputStream.read();
        obj.c = inputStream.read();
        obj.d(4, "sps_video_parameter_set_id");
        this.sps_max_sub_layers_minus1 = (int) obj.d(3, "sps_max_sub_layers_minus1");
        obj.b("sps_temporal_id_nesting_flag");
        profile_tier_level(this.sps_max_sub_layers_minus1, obj);
        obj.e("sps_seq_parameter_set_id");
        int e = obj.e("chroma_format_idc");
        this.chroma_format_idc = e;
        if (e == 3) {
            obj.a();
        }
        this.pic_width_in_luma_samples = obj.e("pic_width_in_luma_samples");
        this.pic_height_in_luma_samples = obj.e("pic_width_in_luma_samples");
        if (obj.b("conformance_window_flag")) {
            obj.e("conf_win_left_offset");
            obj.e("conf_win_right_offset");
            obj.e("conf_win_top_offset");
            obj.e("conf_win_bottom_offset");
        }
        this.bit_depth_luma_minus8 = obj.e("bit_depth_luma_minus8");
        this.bit_depth_chroma_minus8 = obj.e("bit_depth_chroma_minus8");
        int e2 = obj.e("log2_max_pic_order_cnt_lsb_minus4");
        boolean b = obj.b("sps_sub_layer_ordering_info_present_flag");
        int i2 = this.sps_max_sub_layers_minus1;
        if (b) {
            i = 0;
        } else {
            i = i2;
        }
        int i3 = (i2 - i) + 1;
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        int[] iArr3 = new int[i3];
        for (i2 = b ? 0 : i2; i2 <= this.sps_max_sub_layers_minus1; i2++) {
            iArr[i2] = obj.e("sps_max_dec_pic_buffering_minus1[" + i2 + "]");
            iArr2[i2] = obj.e("sps_max_num_reorder_pics[" + i2 + "]");
            iArr3[i2] = obj.e("sps_max_latency_increase_plus1[" + i2 + "]");
        }
        obj.e("log2_min_luma_coding_block_size_minus3");
        obj.e("log2_diff_max_min_luma_coding_block_size");
        obj.e("log2_min_transform_block_size_minus2");
        obj.e("log2_diff_max_min_transform_block_size");
        obj.e("max_transform_hierarchy_depth_inter");
        obj.e("max_transform_hierarchy_depth_intra");
        if (obj.b("scaling_list_enabled_flag") && obj.b("sps_scaling_list_data_present_flag")) {
            skip_scaling_list_data(obj);
        }
        obj.b("amp_enabled_flag");
        obj.b("sample_adaptive_offset_enabled_flag");
        if (obj.b("pcm_enabled_flag")) {
            obj.d(4, "pcm_sample_bit_depth_luma_minus1");
            obj.d(4, "pcm_sample_bit_depth_chroma_minus1");
            obj.e("log2_min_pcm_luma_coding_block_size_minus3");
            obj.e("log2_diff_max_min_pcm_luma_coding_block_size");
            obj.b("pcm_loop_filter_disabled_flag");
        }
        parse_short_term_ref_pic_sets(obj.e("num_short_term_ref_pic_sets"), obj);
        if (obj.b("long_term_ref_pics_present_flag")) {
            int e3 = obj.e("num_long_term_ref_pics_sps");
            int[] iArr4 = new int[e3];
            boolean[] zArr = new boolean[e3];
            for (int i4 = 0; i4 < e3; i4++) {
                iArr4[i4] = (int) obj.d(e2 + 4, "lt_ref_pic_poc_lsb_sps[" + i4 + "]");
                zArr[i4] = obj.b("used_by_curr_pic_lt_sps_flag[" + i4 + "]");
            }
        }
        obj.b("sps_temporal_mvp_enabled_flag");
        obj.b("strong_intra_smoothing_enabled_flag");
    }

    private void parse_short_term_ref_pic_sets(int i, o61 o61Var) {
        boolean z;
        boolean z2;
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 != 0 && o61Var.a() == 1) {
                o61Var.b("delta_rps_sign");
                o61Var.e("abs_delta_rps_minus1");
                jArr[i2] = 0;
                for (int i3 = 0; i3 <= jArr[i2 - 1]; i3++) {
                    if (o61Var.a() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && o61Var.a() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z || z2) {
                        jArr[i2] = jArr[i2] + 1;
                    }
                }
            } else {
                long e = o61Var.e("num_positive_pics") + o61Var.e("num_negative_pics");
                jArr[i2] = e;
                for (long j = 0; j < e; j++) {
                    o61Var.e("delta_poc_s0/1_minus1");
                    o61Var.b("used_by_curr_pic_s0/1_flag");
                }
            }
        }
    }

    private void profile_tier_level(int i, o61 o61Var) {
        boolean[] zArr;
        long[] jArr;
        int[] iArr;
        boolean[] zArr2;
        int i2 = i;
        long d = o61Var.d(2, "general_profile_space");
        InputStream inputStream = o61Var.a;
        this.general_profile_space = (int) d;
        this.general_tier_flag = o61Var.b("general_tier_flag");
        this.general_profile_idc = (int) o61Var.d(5, "general_profile_idc");
        this.general_profile_compatibility_flags = o61Var.c(32);
        this.general_constraint_indicator_flags = o61Var.c(48);
        if (o61Var.d > 0) {
            o61Var.b = o61Var.c;
            o61Var.c = inputStream.read();
            o61Var.d = 0;
        }
        int i3 = o61Var.b;
        o61Var.b = o61Var.c;
        o61Var.c = inputStream.read();
        o61Var.d = 0;
        this.general_level_idc = (byte) i3;
        boolean[] zArr3 = new boolean[i2];
        boolean[] zArr4 = new boolean[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            zArr3[i4] = o61Var.b("sub_layer_profile_present_flag[" + i4 + "]");
            zArr4[i4] = o61Var.b("sub_layer_level_present_flag[" + i4 + "]");
        }
        if (i2 > 0) {
            int[] iArr2 = new int[8];
            for (int i5 = i2; i5 < 8; i5++) {
                iArr2[i5] = (int) o61Var.d(2, "reserved_zero_2bits[" + i5 + "]");
            }
        }
        int[] iArr3 = new int[i2];
        boolean[] zArr5 = new boolean[i2];
        int[] iArr4 = new int[i2];
        boolean[][] zArr6 = (boolean[][]) Array.newInstance(Boolean.TYPE, i2, 32);
        boolean[] zArr7 = new boolean[i2];
        boolean[] zArr8 = new boolean[i2];
        boolean[] zArr9 = new boolean[i2];
        boolean[] zArr10 = new boolean[i2];
        long[] jArr2 = new long[i2];
        int[] iArr5 = new int[i2];
        int i6 = 0;
        while (i6 < i2) {
            if (zArr3[i6]) {
                zArr = zArr3;
                jArr = jArr2;
                iArr = iArr5;
                iArr3[i6] = (int) o61Var.d(2, "sub_layer_profile_space[" + i6 + "]");
                zArr5[i6] = o61Var.b("sub_layer_tier_flag[" + i6 + "]");
                iArr4[i6] = (int) o61Var.d(5, "sub_layer_profile_idc[" + i6 + "]");
                for (int i7 = 0; i7 < 32; i7++) {
                    zArr6[i6][i7] = o61Var.b("sub_layer_profile_compatibility_flag[" + i6 + "][" + i7 + "]");
                }
                zArr7[i6] = o61Var.b("sub_layer_progressive_source_flag[" + i6 + "]");
                zArr8[i6] = o61Var.b("sub_layer_interlaced_source_flag[" + i6 + "]");
                zArr9[i6] = o61Var.b("sub_layer_non_packed_constraint_flag[" + i6 + "]");
                zArr10[i6] = o61Var.b("sub_layer_frame_only_constraint_flag[" + i6 + "]");
                jArr[i6] = o61Var.c(44);
            } else {
                zArr = zArr3;
                jArr = jArr2;
                iArr = iArr5;
            }
            if (zArr4[i6]) {
                zArr2 = zArr10;
                iArr[i6] = (int) o61Var.d(8, "sub_layer_level_idc[" + i6 + "]");
            } else {
                zArr2 = zArr10;
            }
            i6++;
            i2 = i;
            zArr10 = zArr2;
            jArr2 = jArr;
            zArr3 = zArr;
            iArr5 = iArr;
        }
    }

    private static void skip_scaling_list_data(o61 o61Var) {
        int i;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (true) {
                if (i2 == 3) {
                    i = 2;
                } else {
                    i = 6;
                }
                if (i3 < i) {
                    if (o61Var.a() == 1) {
                        o61Var.e("scaling_list_pred_matrix_id_delta");
                    } else {
                        int min = Math.min(64, 1 << ((i2 << 1) + 4));
                        if (i2 > 1) {
                            o61Var.e("scaling_list_dc_coef_minus8");
                        }
                        for (int i4 = 0; i4 < min; i4++) {
                            o61Var.e("scaling_list_delta_coef");
                        }
                    }
                    i3++;
                }
            }
        }
    }
}
