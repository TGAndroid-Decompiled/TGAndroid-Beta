package org.telegram.messenger;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cd0;
public final class p0 {
    public final hi.x4 A;
    public final hi.x4 B;
    public final hi.u5 C;
    public final hi.u5 D;
    public final hi.u5 E;
    public final h9.g1 F;
    public final h9.g1 G;
    public final h9.g1 H;
    public final hi.x4 I;
    public final hi.x4 J;
    public final hi.u5 K;
    public final hi.u5 L;
    public final hi.u5 M;
    public final hi.u5 N;
    public final hi.u5 O;
    public final hi.x4 P;
    public final hi.u5 Q;
    public final hi.u5 R;
    public final hi.u5 S;
    public final hi.u5 T;
    public final hi.u5 U;
    public final hi.u5 V;
    public final hi.u5 W;
    public final hi.u5 X;
    public final hi.u5 Y;
    public final h9.g1 Z;
    public final HashMap f26175a;
    public final hi.u5 f26176a0;
    public final hi.u5 f26177b;
    public final hi.u5 f26178b0;
    public final hi.u5 f26179c;
    public final hi.u5 f26180c0;
    public final hi.u5 d;
    public final hi.u5 f26181d0;
    public final hi.u5 f26182e;
    public final hi.u5 f26183e0;
    public final hi.u5 f26184f;
    public final hi.u5 f26185f0;
    public final h9.g1 f26186g;
    public final hi.u5 f26187g0;
    public final h9.g1 h;
    public final hi.u5 f26188h0;
    public final hi.x4 f26189i;
    public final hi.u5 f26190i0;
    public final hi.x4 f26191j;
    public final hi.u5 f26192j0;
    public final hi.x4 f26193k;
    public final hi.u5 f26194k0;
    public final hi.x4 f26195l;
    public final h9.g1 f26196l0;
    public final h9.g1 f26197m;
    public final h9.g1 m0;
    public final hi.u5 f26198n;
    public final h9.g1 f26199n0;
    public final hi.u5 f26200o;
    public final h9.g1 f26201o0;
    public final hi.u5 f26202p;
    public final h9.g1 f26203p0;
    public final hi.u5 f26204q;
    public final h9.g1 f26205q0;
    public final h9.g1 f26206r;
    public final h9.g1 f26207r0;
    public final h9.g1 f26208s;
    public final h9.g1 f26209s0;
    public final h9.g1 f26210t;
    public final hi.x4 f26211t0;
    public final h9.g1 f26212u;
    public final h9.g1 f26213u0;
    public final hi.u5 v;
    public final hi.u5 f26214v0;
    public final hi.u5 f26215w;
    public final h9.g1 f26216x;
    public final hi.u5 f26217y;
    public final hi.u5 f26218z;

    public p0() {
        HashMap hashMap = new HashMap();
        this.f26175a = hashMap;
        this.f26177b = e(10, "stars_paid_messages_channel_amount_default");
        this.f26179c = e(850, "stars_suggested_post_commission_permille");
        this.d = e(5, "stars_suggested_post_amount_min");
        this.f26182e = e(100000, "stars_suggested_post_amount_max");
        this.f26184f = e(850, "ton_suggested_post_commission_permille");
        this.f26186g = f(10000000L, "ton_suggested_post_amount_min");
        this.h = f(10000000000000L, "ton_suggested_post_amount_max");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f26189i = h(86400L, "stars_suggested_post_age_min");
        this.f26191j = h(300L, "stars_suggested_post_future_min");
        this.f26193k = h(2678400L, "stars_suggested_post_future_max");
        hi.x4 x4Var = new hi.x4(20);
        hashMap.put("ton_usd_rate", (i0) x4Var.f15680b);
        this.f26195l = x4Var;
        g("stars_rating_learnmore_url", "https://telegram.org/blog/telegram-stars");
        this.f26197m = d("need_age_video_verification", false);
        this.f26198n = e(800, "stars_stargift_resale_commission_permille");
        this.f26200o = e(800, "ton_stargift_resale_commission_permille");
        this.f26202p = e(125, "stars_stargift_resale_amount_min");
        this.f26204q = e(35000, "stars_stargift_resale_amount_max");
        this.f26206r = f(10000000L, "ton_stargift_resale_amount_min");
        this.f26208s = f(10000000000000L, "ton_stargift_resale_amount_max");
        this.f26210t = d("stargifts_fragment_resale_enabled", false);
        this.f26212u = d("stargifts_fixed_sale_enabled", false);
        this.v = g("stargifts_stars_resale", "default");
        this.f26215w = g("stargifts_ton_resale", "default");
        this.f26216x = d("stargifts_craft_minted_first_source", false);
        this.f26217y = e(100, "stargifts_collections_limit");
        e(100, "stargifts_collection_gifts_limit");
        this.f26218z = e(100, "stories_albums_limit");
        e(100, "stories_album_stories_limit");
        this.A = h(30L, "message_typing_draft_ttl");
        this.B = h(10L, "group_call_message_ttl");
        this.C = e(128, "group_call_message_length_limit");
        this.D = e(128, "contact_note_length_limit");
        this.E = e(5, "passkeys_account_passkeys_max");
        boolean z10 = s2.f26694a;
        this.F = d("settings_display_passkeys", true);
        this.G = d("android_disable_blur_in_light_theme", false);
        this.H = d("android_disable_blur_in_dark_theme", false);
        this.I = h(86400L, "no_forwards_request_expire_period");
        this.J = h(2592000L, "poll_close_period_max");
        this.K = g("music_search_username", null);
        this.L = e(12, "poll_answers_max");
        this.M = e(12, "poll_countries_max");
        this.N = e(100, "poll_answer_length_max");
        e(255, "poll_question_length_max");
        e(200, "poll_solution_length_max");
        this.O = e(300, "poll_caption_length_max");
        this.P = h(300L, "poll_answer_delete_period");
        this.Q = e(20, "bots_create_limit_default");
        this.R = e(40, "bots_create_limit_premium");
        this.S = e(2, "bot_additional_usernames_limit");
        this.T = g("phone_country_iso2", "en");
        this.U = e(3, "aicompose_tone_examples_num");
        this.V = e(12, "aicompose_tone_title_length_max");
        this.W = e(1024, "aicompose_tone_prompt_length_max");
        this.X = e(5, "aicompose_tone_saved_limit_default");
        this.Y = e(20, "aicompose_tone_saved_limit_premium");
        this.Z = d("message_primary_edited_date", false);
        this.f26176a0 = e(32768, "rich_message_length_limit");
        this.f26178b0 = e(500, "rich_message_max_blocks");
        this.f26180c0 = e(16, "rich_message_max_depth");
        this.f26181d0 = e(50, "rich_message_max_media");
        this.f26183e0 = e(20, "rich_message_max_table_cols");
        this.f26185f0 = g("rich_message_posting", "premium");
        this.f26187g0 = g("speech_to_text", "enabled");
        e(100, "community_peers_limit");
        e(100, "community_bot_peers_limit");
        this.f26188h0 = e(4096, "message_length_limit_default");
        this.f26190i0 = e(8192, "message_length_limit_premium");
        this.f26192j0 = e(20, "quick_reply_messages_limit");
        this.f26194k0 = e(5, "ephemeral_welcome_messages_max");
        this.f26196l0 = d("android_audio_recorder_v2_disabled", false);
        this.m0 = d("android_round_video_recorder_v2_disabled", false);
        this.f26199n0 = d("stars_spend_topup_invoice_disabled", false);
        h9.g1 g1Var = new h9.g1("bot_allowed_suffixes", Collections.singleton("bot"));
        hashMap.put("bot_allowed_suffixes", (o0) g1Var.f13993b);
        this.f26201o0 = g1Var;
        this.f26203p0 = d("wallet_available", true);
        this.f26205q0 = d("wallet_paid_message_recipient_message_amount_check", true);
        this.f26207r0 = f(100000000L, "wallet_transfer_min_nanos");
        f(100000000L, "wallet_gasless_min_nanos");
        h9.g1 g1Var2 = new h9.g1("wallet_card_bg_gifts", Collections.EMPTY_SET);
        hashMap.put("wallet_card_bg_gifts", (o0) g1Var2.f13993b);
        this.f26209s0 = g1Var2;
        hi.x4 x4Var2 = new hi.x4(21);
        hashMap.put("agent_bot_ids", (m0) x4Var2.f15680b);
        this.f26211t0 = x4Var2;
        this.f26213u0 = d("widgets_disabled", false);
        this.f26214v0 = e(6, "widgets_processes");
    }

    public static String i(hi.u5 u5Var) {
        String str = ((n0) u5Var.f15495b).f25675c;
        if (!"visible".equals(str) && !"hidden".equals(str)) {
            return "default";
        }
        return str;
    }

    public final boolean a(SharedPreferences.Editor editor, TLRPC.TL_jsonObject tL_jsonObject) {
        int size = tL_jsonObject.value.size();
        boolean z10 = false;
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i7);
            k0 k0Var = (k0) this.f26175a.get(tL_jsonObjectValue.key);
            if (k0Var != null) {
                z10 |= k0Var.a(editor, tL_jsonObjectValue.value);
            }
        }
        TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
        tL_jsonString.value = "default";
        boolean b10 = b(editor, tL_jsonObject, "stargifts_stars_resale", tL_jsonString) | z10;
        TLRPC.TL_jsonString tL_jsonString2 = new TLRPC.TL_jsonString();
        tL_jsonString2.value = "default";
        boolean b11 = b10 | b(editor, tL_jsonObject, "stargifts_ton_resale", tL_jsonString2);
        TLRPC.TL_jsonBool tL_jsonBool = new TLRPC.TL_jsonBool();
        tL_jsonBool.value = false;
        boolean b12 = b11 | b(editor, tL_jsonObject, "stargifts_fragment_resale_enabled", tL_jsonBool);
        TLRPC.TL_jsonBool tL_jsonBool2 = new TLRPC.TL_jsonBool();
        tL_jsonBool2.value = false;
        boolean b13 = b12 | b(editor, tL_jsonObject, "stargifts_fixed_sale_enabled", tL_jsonBool2);
        boolean z11 = s2.f26694a;
        TLRPC.TL_jsonBool tL_jsonBool3 = new TLRPC.TL_jsonBool();
        tL_jsonBool3.value = true;
        boolean b14 = b(editor, tL_jsonObject, "wallet_available", tL_jsonBool3) | b13;
        if (((h0) this.f26213u0.f13993b).f24305c) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f54856a;
            g0.g3(new cd0(18));
        }
        return b14;
    }

    public final boolean b(SharedPreferences.Editor editor, TLRPC.TL_jsonObject tL_jsonObject, String str, TLRPC.JSONValue jSONValue) {
        int size = tL_jsonObject.value.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                if (str.equals(tL_jsonObject.value.get(i7).key)) {
                    break;
                }
                i7++;
            } else {
                k0 k0Var = (k0) this.f26175a.get(str);
                if (k0Var != null) {
                    return k0Var.a(editor, jSONValue);
                }
            }
        }
        return false;
    }

    public final void c(SharedPreferences sharedPreferences) {
        for (k0 k0Var : this.f26175a.values()) {
            try {
                k0Var.b(sharedPreferences);
            } catch (ClassCastException e10) {
                a8.g(e10, true);
            }
        }
    }

    public final h9.g1 d(String str, boolean z10) {
        h9.g1 g1Var = new h9.g1(str, z10);
        this.f26175a.put(str, (h0) g1Var.f13993b);
        return g1Var;
    }

    public final hi.u5 e(int i7, String str) {
        hi.u5 u5Var = new hi.u5(str, i7);
        this.f26175a.put(str, (j0) u5Var.f15495b);
        return u5Var;
    }

    public final h9.g1 f(long j3, String str) {
        h9.g1 g1Var = new h9.g1(str, j3);
        this.f26175a.put(str, (l0) g1Var.f13993b);
        return g1Var;
    }

    public final hi.u5 g(String str, String str2) {
        hi.u5 u5Var = new hi.u5(str, str2);
        this.f26175a.put(str, (n0) u5Var.f15495b);
        return u5Var;
    }

    public final hi.x4 h(long j3, String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        hi.x4 x4Var = new hi.x4(str, j3);
        this.f26175a.put(str, (l0) x4Var.f15680b);
        return x4Var;
    }
}
