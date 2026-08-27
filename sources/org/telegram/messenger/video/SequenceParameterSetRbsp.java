package org.telegram.messenger.video;

import java.io.InputStream;
import java.lang.reflect.Array;
import n2.v;

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
        yb.a aVar = new yb.a();
        v vVar = new v((char) 0, 11);
        vVar.f18187c = new char[50];
        aVar.f49820e = vVar;
        aVar.f49817a = inputStream;
        aVar.f49818b = inputStream.read();
        aVar.f49819c = inputStream.read();
        aVar.d(4, "sps_video_parameter_set_id");
        this.sps_max_sub_layers_minus1 = (int) aVar.d(3, "sps_max_sub_layers_minus1");
        aVar.b("sps_temporal_id_nesting_flag");
        profile_tier_level(this.sps_max_sub_layers_minus1, aVar);
        aVar.e("sps_seq_parameter_set_id");
        int iE = aVar.e("chroma_format_idc");
        this.chroma_format_idc = iE;
        if (iE == 3) {
            aVar.a();
        }
        this.pic_width_in_luma_samples = aVar.e("pic_width_in_luma_samples");
        this.pic_height_in_luma_samples = aVar.e("pic_width_in_luma_samples");
        if (aVar.b("conformance_window_flag")) {
            aVar.e("conf_win_left_offset");
            aVar.e("conf_win_right_offset");
            aVar.e("conf_win_top_offset");
            aVar.e("conf_win_bottom_offset");
        }
        this.bit_depth_luma_minus8 = aVar.e("bit_depth_luma_minus8");
        this.bit_depth_chroma_minus8 = aVar.e("bit_depth_chroma_minus8");
        int iE2 = aVar.e("log2_max_pic_order_cnt_lsb_minus4");
        boolean zB = aVar.b("sps_sub_layer_ordering_info_present_flag");
        int i10 = this.sps_max_sub_layers_minus1;
        int i11 = (i10 - (zB ? 0 : i10)) + 1;
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        for (i10 = zB ? 0 : i10; i10 <= this.sps_max_sub_layers_minus1; i10++) {
            iArr[i10] = aVar.e("sps_max_dec_pic_buffering_minus1[" + i10 + "]");
            iArr2[i10] = aVar.e("sps_max_num_reorder_pics[" + i10 + "]");
            iArr3[i10] = aVar.e("sps_max_latency_increase_plus1[" + i10 + "]");
        }
        aVar.e("log2_min_luma_coding_block_size_minus3");
        aVar.e("log2_diff_max_min_luma_coding_block_size");
        aVar.e("log2_min_transform_block_size_minus2");
        aVar.e("log2_diff_max_min_transform_block_size");
        aVar.e("max_transform_hierarchy_depth_inter");
        aVar.e("max_transform_hierarchy_depth_intra");
        if (aVar.b("scaling_list_enabled_flag") && aVar.b("sps_scaling_list_data_present_flag")) {
            skip_scaling_list_data(aVar);
        }
        aVar.b("amp_enabled_flag");
        aVar.b("sample_adaptive_offset_enabled_flag");
        if (aVar.b("pcm_enabled_flag")) {
            aVar.d(4, "pcm_sample_bit_depth_luma_minus1");
            aVar.d(4, "pcm_sample_bit_depth_chroma_minus1");
            aVar.e("log2_min_pcm_luma_coding_block_size_minus3");
            aVar.e("log2_diff_max_min_pcm_luma_coding_block_size");
            aVar.b("pcm_loop_filter_disabled_flag");
        }
        parse_short_term_ref_pic_sets(aVar.e("num_short_term_ref_pic_sets"), aVar);
        if (aVar.b("long_term_ref_pics_present_flag")) {
            int iE3 = aVar.e("num_long_term_ref_pics_sps");
            int[] iArr4 = new int[iE3];
            boolean[] zArr = new boolean[iE3];
            for (int i12 = 0; i12 < iE3; i12++) {
                iArr4[i12] = (int) aVar.d(iE2 + 4, "lt_ref_pic_poc_lsb_sps[" + i12 + "]");
                zArr[i12] = aVar.b("used_by_curr_pic_lt_sps_flag[" + i12 + "]");
            }
        }
        aVar.b("sps_temporal_mvp_enabled_flag");
        aVar.b("strong_intra_smoothing_enabled_flag");
    }

    private void parse_short_term_ref_pic_sets(int i10, yb.a aVar) {
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 == 0 || aVar.a() != 1) {
                long jE = aVar.e("num_positive_pics") + aVar.e("num_negative_pics");
                jArr[i11] = jE;
                for (long j10 = 0; j10 < jE; j10++) {
                    aVar.e("delta_poc_s0/1_minus1");
                    aVar.b("used_by_curr_pic_s0/1_flag");
                }
            } else {
                aVar.b("delta_rps_sign");
                aVar.e("abs_delta_rps_minus1");
                jArr[i11] = 0;
                for (int i12 = 0; i12 <= jArr[i11 - 1]; i12++) {
                    boolean z10 = aVar.a() == 1;
                    boolean z11 = !z10 && aVar.a() == 1;
                    if (z10 || z11) {
                        jArr[i11] = jArr[i11] + 1;
                    }
                }
            }
        }
    }

    private void profile_tier_level(int i10, yb.a aVar) {
        boolean[] zArr;
        long[] jArr;
        int i11 = i10;
        long jD = aVar.d(2, "general_profile_space");
        InputStream inputStream = aVar.f49817a;
        this.general_profile_space = (int) jD;
        this.general_tier_flag = aVar.b("general_tier_flag");
        this.general_profile_idc = (int) aVar.d(5, "general_profile_idc");
        this.general_profile_compatibility_flags = aVar.c(32);
        this.general_constraint_indicator_flags = aVar.c(48);
        if (aVar.d > 0) {
            aVar.f49818b = aVar.f49819c;
            aVar.f49819c = inputStream.read();
            aVar.d = 0;
        }
        int i12 = aVar.f49818b;
        aVar.f49818b = aVar.f49819c;
        aVar.f49819c = inputStream.read();
        aVar.d = 0;
        this.general_level_idc = (byte) i12;
        boolean[] zArr2 = new boolean[i11];
        boolean[] zArr3 = new boolean[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            zArr2[i13] = aVar.b("sub_layer_profile_present_flag[" + i13 + "]");
            zArr3[i13] = aVar.b("sub_layer_level_present_flag[" + i13 + "]");
        }
        if (i11 > 0) {
            int[] iArr = new int[8];
            for (int i14 = i11; i14 < 8; i14++) {
                iArr[i14] = (int) aVar.d(2, "reserved_zero_2bits[" + i14 + "]");
            }
        }
        int[] iArr2 = new int[i11];
        boolean[] zArr4 = new boolean[i11];
        int[] iArr3 = new int[i11];
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i11, 32);
        boolean[] zArr6 = new boolean[i11];
        boolean[] zArr7 = new boolean[i11];
        boolean[] zArr8 = new boolean[i11];
        boolean[] zArr9 = new boolean[i11];
        long[] jArr2 = new long[i11];
        int[] iArr4 = new int[i11];
        int i15 = 0;
        while (i15 < i11) {
            if (zArr2[i15]) {
                zArr = zArr9;
                iArr2[i15] = (int) aVar.d(2, "sub_layer_profile_space[" + i15 + "]");
                zArr4[i15] = aVar.b("sub_layer_tier_flag[" + i15 + "]");
                jArr = jArr2;
                iArr3[i15] = (int) aVar.d(5, "sub_layer_profile_idc[" + i15 + "]");
                for (int i16 = 0; i16 < 32; i16++) {
                    zArr5[i15][i16] = aVar.b("sub_layer_profile_compatibility_flag[" + i15 + "][" + i16 + "]");
                }
                zArr6[i15] = aVar.b("sub_layer_progressive_source_flag[" + i15 + "]");
                zArr7[i15] = aVar.b("sub_layer_interlaced_source_flag[" + i15 + "]");
                zArr8[i15] = aVar.b("sub_layer_non_packed_constraint_flag[" + i15 + "]");
                zArr[i15] = aVar.b("sub_layer_frame_only_constraint_flag[" + i15 + "]");
                jArr[i15] = aVar.c(44);
            } else {
                zArr = zArr9;
                jArr = jArr2;
            }
            if (zArr3[i15]) {
                iArr4[i15] = (int) aVar.d(8, "sub_layer_level_idc[" + i15 + "]");
            }
            i15++;
            i11 = i10;
            jArr2 = jArr;
            zArr9 = zArr;
            zArr2 = zArr2;
            iArr4 = iArr4;
        }
    }

    private static void skip_scaling_list_data(yb.a aVar) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (true) {
                if (i11 < (i10 == 3 ? 2 : 6)) {
                    if (aVar.a() == 1) {
                        aVar.e("scaling_list_pred_matrix_id_delta");
                    } else {
                        int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                        if (i10 > 1) {
                            aVar.e("scaling_list_dc_coef_minus8");
                        }
                        for (int i12 = 0; i12 < iMin; i12++) {
                            aVar.e("scaling_list_delta_coef");
                        }
                    }
                    i11++;
                }
            }
            i10++;
        }
    }
}
