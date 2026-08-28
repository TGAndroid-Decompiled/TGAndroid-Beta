package org.telegram.messenger.video;

import java.io.InputStream;
import java.lang.reflect.Array;
import n2.w;
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
        int i9;
        ?? obj = new Object();
        w wVar = new w((char) 0, 11);
        wVar.f18361c = new char[50];
        obj.f49104e = wVar;
        obj.f49101a = inputStream;
        obj.f49102b = inputStream.read();
        obj.f49103c = inputStream.read();
        obj.d(4, "sps_video_parameter_set_id");
        this.sps_max_sub_layers_minus1 = (int) obj.d(3, "sps_max_sub_layers_minus1");
        obj.b("sps_temporal_id_nesting_flag");
        profile_tier_level(this.sps_max_sub_layers_minus1, obj);
        obj.e("sps_seq_parameter_set_id");
        int e10 = obj.e("chroma_format_idc");
        this.chroma_format_idc = e10;
        if (e10 == 3) {
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
        int e11 = obj.e("log2_max_pic_order_cnt_lsb_minus4");
        boolean b10 = obj.b("sps_sub_layer_ordering_info_present_flag");
        int i10 = this.sps_max_sub_layers_minus1;
        if (b10) {
            i9 = 0;
        } else {
            i9 = i10;
        }
        int i11 = (i10 - i9) + 1;
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        for (i10 = b10 ? 0 : i10; i10 <= this.sps_max_sub_layers_minus1; i10++) {
            iArr[i10] = obj.e("sps_max_dec_pic_buffering_minus1[" + i10 + "]");
            iArr2[i10] = obj.e("sps_max_num_reorder_pics[" + i10 + "]");
            iArr3[i10] = obj.e("sps_max_latency_increase_plus1[" + i10 + "]");
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
            int e12 = obj.e("num_long_term_ref_pics_sps");
            int[] iArr4 = new int[e12];
            boolean[] zArr = new boolean[e12];
            for (int i12 = 0; i12 < e12; i12++) {
                iArr4[i12] = (int) obj.d(e11 + 4, "lt_ref_pic_poc_lsb_sps[" + i12 + "]");
                zArr[i12] = obj.b("used_by_curr_pic_lt_sps_flag[" + i12 + "]");
            }
        }
        obj.b("sps_temporal_mvp_enabled_flag");
        obj.b("strong_intra_smoothing_enabled_flag");
    }

    private void parse_short_term_ref_pic_sets(int i9, xb.a aVar) {
        boolean z10;
        boolean z11;
        long[] jArr = new long[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 != 0 && aVar.a() == 1) {
                aVar.b("delta_rps_sign");
                aVar.e("abs_delta_rps_minus1");
                jArr[i10] = 0;
                for (int i11 = 0; i11 <= jArr[i10 - 1]; i11++) {
                    if (aVar.a() == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && aVar.a() == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 || z11) {
                        jArr[i10] = jArr[i10] + 1;
                    }
                }
            } else {
                long e10 = aVar.e("num_positive_pics") + aVar.e("num_negative_pics");
                jArr[i10] = e10;
                for (long j10 = 0; j10 < e10; j10++) {
                    aVar.e("delta_poc_s0/1_minus1");
                    aVar.b("used_by_curr_pic_s0/1_flag");
                }
            }
        }
    }

    private void profile_tier_level(int i9, xb.a aVar) {
        boolean[] zArr;
        int[] iArr;
        boolean[] zArr2;
        long[] jArr;
        int i10 = i9;
        long d = aVar.d(2, "general_profile_space");
        InputStream inputStream = aVar.f49101a;
        this.general_profile_space = (int) d;
        this.general_tier_flag = aVar.b("general_tier_flag");
        this.general_profile_idc = (int) aVar.d(5, "general_profile_idc");
        this.general_profile_compatibility_flags = aVar.c(32);
        this.general_constraint_indicator_flags = aVar.c(48);
        if (aVar.d > 0) {
            aVar.f49102b = aVar.f49103c;
            aVar.f49103c = inputStream.read();
            aVar.d = 0;
        }
        int i11 = aVar.f49102b;
        aVar.f49102b = aVar.f49103c;
        aVar.f49103c = inputStream.read();
        aVar.d = 0;
        this.general_level_idc = (byte) i11;
        boolean[] zArr3 = new boolean[i10];
        boolean[] zArr4 = new boolean[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            zArr3[i12] = aVar.b("sub_layer_profile_present_flag[" + i12 + "]");
            zArr4[i12] = aVar.b("sub_layer_level_present_flag[" + i12 + "]");
        }
        if (i10 > 0) {
            int[] iArr2 = new int[8];
            for (int i13 = i10; i13 < 8; i13++) {
                iArr2[i13] = (int) aVar.d(2, "reserved_zero_2bits[" + i13 + "]");
            }
        }
        int[] iArr3 = new int[i10];
        boolean[] zArr5 = new boolean[i10];
        int[] iArr4 = new int[i10];
        boolean[][] zArr6 = (boolean[][]) Array.newInstance(Boolean.TYPE, i10, 32);
        boolean[] zArr7 = new boolean[i10];
        boolean[] zArr8 = new boolean[i10];
        boolean[] zArr9 = new boolean[i10];
        boolean[] zArr10 = new boolean[i10];
        long[] jArr2 = new long[i10];
        int[] iArr5 = new int[i10];
        int i14 = 0;
        while (i14 < i10) {
            if (zArr3[i14]) {
                zArr = zArr3;
                iArr = iArr5;
                zArr2 = zArr10;
                iArr3[i14] = (int) aVar.d(2, "sub_layer_profile_space[" + i14 + "]");
                zArr5[i14] = aVar.b("sub_layer_tier_flag[" + i14 + "]");
                jArr = jArr2;
                iArr4[i14] = (int) aVar.d(5, "sub_layer_profile_idc[" + i14 + "]");
                for (int i15 = 0; i15 < 32; i15++) {
                    boolean[] zArr11 = zArr6[i14];
                    zArr11[i15] = aVar.b("sub_layer_profile_compatibility_flag[" + i14 + "][" + i15 + "]");
                }
                zArr7[i14] = aVar.b("sub_layer_progressive_source_flag[" + i14 + "]");
                zArr8[i14] = aVar.b("sub_layer_interlaced_source_flag[" + i14 + "]");
                zArr9[i14] = aVar.b("sub_layer_non_packed_constraint_flag[" + i14 + "]");
                zArr2[i14] = aVar.b("sub_layer_frame_only_constraint_flag[" + i14 + "]");
                jArr[i14] = aVar.c(44);
            } else {
                zArr = zArr3;
                iArr = iArr5;
                zArr2 = zArr10;
                jArr = jArr2;
            }
            if (zArr4[i14]) {
                iArr[i14] = (int) aVar.d(8, "sub_layer_level_idc[" + i14 + "]");
            }
            i14++;
            i10 = i9;
            jArr2 = jArr;
            zArr10 = zArr2;
            zArr3 = zArr;
            iArr5 = iArr;
        }
    }

    private static void skip_scaling_list_data(xb.a aVar) {
        int i9;
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (true) {
                if (i10 == 3) {
                    i9 = 2;
                } else {
                    i9 = 6;
                }
                if (i11 < i9) {
                    if (aVar.a() == 1) {
                        aVar.e("scaling_list_pred_matrix_id_delta");
                    } else {
                        int min = Math.min(64, 1 << ((i10 << 1) + 4));
                        if (i10 > 1) {
                            aVar.e("scaling_list_dc_coef_minus8");
                        }
                        for (int i12 = 0; i12 < min; i12++) {
                            aVar.e("scaling_list_delta_coef");
                        }
                    }
                    i11++;
                }
            }
        }
    }
}
