package org.telegram.messenger.video;

import java.io.InputStream;
import java.lang.reflect.Array;
import p2.w;
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
        int i10;
        ?? obj = new Object();
        w wVar = new w((char) 0, 12);
        wVar.f41030c = new char[50];
        obj.e = wVar;
        obj.f1762a = inputStream;
        obj.f1763b = inputStream.read();
        obj.f1764c = inputStream.read();
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
        int e6 = obj.e("log2_max_pic_order_cnt_lsb_minus4");
        boolean b10 = obj.b("sps_sub_layer_ordering_info_present_flag");
        int i11 = this.sps_max_sub_layers_minus1;
        if (b10) {
            i10 = 0;
        } else {
            i10 = i11;
        }
        int i12 = (i11 - i10) + 1;
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        int[] iArr3 = new int[i12];
        for (i11 = b10 ? 0 : i11; i11 <= this.sps_max_sub_layers_minus1; i11++) {
            iArr[i11] = obj.e("sps_max_dec_pic_buffering_minus1[" + i11 + "]");
            iArr2[i11] = obj.e("sps_max_num_reorder_pics[" + i11 + "]");
            iArr3[i11] = obj.e("sps_max_latency_increase_plus1[" + i11 + "]");
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
            int e10 = obj.e("num_long_term_ref_pics_sps");
            int[] iArr4 = new int[e10];
            boolean[] zArr = new boolean[e10];
            for (int i13 = 0; i13 < e10; i13++) {
                iArr4[i13] = (int) obj.d(e6 + 4, "lt_ref_pic_poc_lsb_sps[" + i13 + "]");
                zArr[i13] = obj.b("used_by_curr_pic_lt_sps_flag[" + i13 + "]");
            }
        }
        obj.b("sps_temporal_mvp_enabled_flag");
        obj.b("strong_intra_smoothing_enabled_flag");
    }

    private void parse_short_term_ref_pic_sets(int i10, bc.a aVar) {
        boolean z4;
        boolean z10;
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 != 0 && aVar.a() == 1) {
                aVar.b("delta_rps_sign");
                aVar.e("abs_delta_rps_minus1");
                jArr[i11] = 0;
                for (int i12 = 0; i12 <= jArr[i11 - 1]; i12++) {
                    if (aVar.a() == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4 && aVar.a() == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z4 || z10) {
                        jArr[i11] = jArr[i11] + 1;
                    }
                }
            } else {
                long e = aVar.e("num_positive_pics") + aVar.e("num_negative_pics");
                jArr[i11] = e;
                for (long j10 = 0; j10 < e; j10++) {
                    aVar.e("delta_poc_s0/1_minus1");
                    aVar.b("used_by_curr_pic_s0/1_flag");
                }
            }
        }
    }

    private void profile_tier_level(int i10, bc.a aVar) {
        boolean[] zArr;
        int[] iArr;
        boolean[] zArr2;
        long[] jArr;
        int i11 = i10;
        long d = aVar.d(2, "general_profile_space");
        InputStream inputStream = aVar.f1762a;
        this.general_profile_space = (int) d;
        this.general_tier_flag = aVar.b("general_tier_flag");
        this.general_profile_idc = (int) aVar.d(5, "general_profile_idc");
        this.general_profile_compatibility_flags = aVar.c(32);
        this.general_constraint_indicator_flags = aVar.c(48);
        if (aVar.d > 0) {
            aVar.f1763b = aVar.f1764c;
            aVar.f1764c = inputStream.read();
            aVar.d = 0;
        }
        int i12 = aVar.f1763b;
        aVar.f1763b = aVar.f1764c;
        aVar.f1764c = inputStream.read();
        aVar.d = 0;
        this.general_level_idc = (byte) i12;
        boolean[] zArr3 = new boolean[i11];
        boolean[] zArr4 = new boolean[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            zArr3[i13] = aVar.b("sub_layer_profile_present_flag[" + i13 + "]");
            zArr4[i13] = aVar.b("sub_layer_level_present_flag[" + i13 + "]");
        }
        if (i11 > 0) {
            int[] iArr2 = new int[8];
            for (int i14 = i11; i14 < 8; i14++) {
                iArr2[i14] = (int) aVar.d(2, "reserved_zero_2bits[" + i14 + "]");
            }
        }
        int[] iArr3 = new int[i11];
        boolean[] zArr5 = new boolean[i11];
        int[] iArr4 = new int[i11];
        boolean[][] zArr6 = (boolean[][]) Array.newInstance(Boolean.TYPE, i11, 32);
        boolean[] zArr7 = new boolean[i11];
        boolean[] zArr8 = new boolean[i11];
        boolean[] zArr9 = new boolean[i11];
        boolean[] zArr10 = new boolean[i11];
        long[] jArr2 = new long[i11];
        int[] iArr5 = new int[i11];
        int i15 = 0;
        while (i15 < i11) {
            if (zArr3[i15]) {
                zArr = zArr3;
                iArr = iArr5;
                zArr2 = zArr10;
                iArr3[i15] = (int) aVar.d(2, "sub_layer_profile_space[" + i15 + "]");
                zArr5[i15] = aVar.b("sub_layer_tier_flag[" + i15 + "]");
                jArr = jArr2;
                iArr4[i15] = (int) aVar.d(5, "sub_layer_profile_idc[" + i15 + "]");
                for (int i16 = 0; i16 < 32; i16++) {
                    boolean[] zArr11 = zArr6[i15];
                    zArr11[i16] = aVar.b("sub_layer_profile_compatibility_flag[" + i15 + "][" + i16 + "]");
                }
                zArr7[i15] = aVar.b("sub_layer_progressive_source_flag[" + i15 + "]");
                zArr8[i15] = aVar.b("sub_layer_interlaced_source_flag[" + i15 + "]");
                zArr9[i15] = aVar.b("sub_layer_non_packed_constraint_flag[" + i15 + "]");
                zArr2[i15] = aVar.b("sub_layer_frame_only_constraint_flag[" + i15 + "]");
                jArr[i15] = aVar.c(44);
            } else {
                zArr = zArr3;
                iArr = iArr5;
                zArr2 = zArr10;
                jArr = jArr2;
            }
            if (zArr4[i15]) {
                iArr[i15] = (int) aVar.d(8, "sub_layer_level_idc[" + i15 + "]");
            }
            i15++;
            i11 = i10;
            jArr2 = jArr;
            zArr10 = zArr2;
            zArr3 = zArr;
            iArr5 = iArr;
        }
    }

    private static void skip_scaling_list_data(bc.a aVar) {
        int i10;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = 0;
            while (true) {
                if (i11 == 3) {
                    i10 = 2;
                } else {
                    i10 = 6;
                }
                if (i12 < i10) {
                    if (aVar.a() == 1) {
                        aVar.e("scaling_list_pred_matrix_id_delta");
                    } else {
                        int min = Math.min(64, 1 << ((i11 << 1) + 4));
                        if (i11 > 1) {
                            aVar.e("scaling_list_dc_coef_minus8");
                        }
                        for (int i13 = 0; i13 < min; i13++) {
                            aVar.e("scaling_list_delta_coef");
                        }
                    }
                    i12++;
                }
            }
        }
    }
}
