package org.telegram.messenger;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cd0;
public final class p0 {
    public final h6.o A;
    public final h6.o B;
    public final hi.u0 C;
    public final hi.u0 D;
    public final hi.u0 E;
    public final j6.r F;
    public final j6.r G;
    public final j6.r H;
    public final h6.o I;
    public final h6.o J;
    public final hi.u0 K;
    public final hi.u0 L;
    public final hi.u0 M;
    public final hi.u0 N;
    public final hi.u0 O;
    public final h6.o P;
    public final hi.u0 Q;
    public final hi.u0 R;
    public final hi.u0 S;
    public final hi.u0 T;
    public final hi.u0 U;
    public final hi.u0 V;
    public final hi.u0 W;
    public final hi.u0 X;
    public final hi.u0 Y;
    public final j6.r Z;
    public final HashMap f26226a;
    public final hi.u0 f26227a0;
    public final hi.u0 f26228b;
    public final hi.u0 f26229b0;
    public final hi.u0 f26230c;
    public final hi.u0 f26231c0;
    public final hi.u0 d;
    public final hi.u0 f26232d0;
    public final hi.u0 f26233e;
    public final hi.u0 f26234e0;
    public final hi.u0 f26235f;
    public final hi.u0 f26236f0;
    public final j6.r f26237g;
    public final hi.u0 f26238g0;
    public final j6.r h;
    public final hi.u0 f26239h0;
    public final h6.o f26240i;
    public final hi.u0 f26241i0;
    public final h6.o f26242j;
    public final hi.u0 f26243j0;
    public final h6.o f26244k;
    public final hi.u0 f26245k0;
    public final h6.o f26246l;
    public final j6.r f26247l0;
    public final j6.r f26248m;
    public final j6.r m0;
    public final hi.u0 f26249n;
    public final j6.r f26250n0;
    public final hi.u0 f26251o;
    public final j6.r f26252o0;
    public final hi.u0 f26253p;
    public final j6.r f26254p0;
    public final hi.u0 f26255q;
    public final j6.r f26256q0;
    public final j6.r f26257r;
    public final j6.r f26258r0;
    public final j6.r f26259s;
    public final j6.r f26260s0;
    public final j6.r f26261t;
    public final h6.o f26262t0;
    public final j6.r f26263u;
    public final j6.r f26264u0;
    public final hi.u0 v;
    public final hi.u0 f26265v0;
    public final hi.u0 f26266w;
    public final j6.r f26267x;
    public final hi.u0 f26268y;
    public final hi.u0 f26269z;

    public p0() {
        HashMap hashMap = new HashMap();
        this.f26226a = hashMap;
        this.f26228b = e(10, "stars_paid_messages_channel_amount_default");
        this.f26230c = e(850, "stars_suggested_post_commission_permille");
        this.d = e(5, "stars_suggested_post_amount_min");
        this.f26233e = e(100000, "stars_suggested_post_amount_max");
        this.f26235f = e(850, "ton_suggested_post_commission_permille");
        this.f26237g = f(10000000L, "ton_suggested_post_amount_min");
        this.h = f(10000000000000L, "ton_suggested_post_amount_max");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f26240i = h(86400L, "stars_suggested_post_age_min");
        this.f26242j = h(300L, "stars_suggested_post_future_min");
        this.f26244k = h(2678400L, "stars_suggested_post_future_max");
        h6.o oVar = new h6.o(22);
        hashMap.put("ton_usd_rate", (i0) oVar.f13936b);
        this.f26246l = oVar;
        g("stars_rating_learnmore_url", "https://telegram.org/blog/telegram-stars");
        this.f26248m = d("need_age_video_verification", false);
        this.f26249n = e(800, "stars_stargift_resale_commission_permille");
        this.f26251o = e(800, "ton_stargift_resale_commission_permille");
        this.f26253p = e(125, "stars_stargift_resale_amount_min");
        this.f26255q = e(35000, "stars_stargift_resale_amount_max");
        this.f26257r = f(10000000L, "ton_stargift_resale_amount_min");
        this.f26259s = f(10000000000000L, "ton_stargift_resale_amount_max");
        this.f26261t = d("stargifts_fragment_resale_enabled", false);
        this.f26263u = d("stargifts_fixed_sale_enabled", false);
        this.v = g("stargifts_stars_resale", "default");
        this.f26266w = g("stargifts_ton_resale", "default");
        this.f26267x = d("stargifts_craft_minted_first_source", false);
        this.f26268y = e(100, "stargifts_collections_limit");
        e(100, "stargifts_collection_gifts_limit");
        this.f26269z = e(100, "stories_albums_limit");
        e(100, "stories_album_stories_limit");
        this.A = h(30L, "message_typing_draft_ttl");
        this.B = h(10L, "group_call_message_ttl");
        this.C = e(128, "group_call_message_length_limit");
        this.D = e(128, "contact_note_length_limit");
        this.E = e(5, "passkeys_account_passkeys_max");
        boolean z10 = s2.f26829a;
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
        this.f26227a0 = e(32768, "rich_message_length_limit");
        this.f26229b0 = e(500, "rich_message_max_blocks");
        this.f26231c0 = e(16, "rich_message_max_depth");
        this.f26232d0 = e(50, "rich_message_max_media");
        this.f26234e0 = e(20, "rich_message_max_table_cols");
        this.f26236f0 = g("rich_message_posting", "premium");
        this.f26238g0 = g("speech_to_text", "enabled");
        e(100, "community_peers_limit");
        e(100, "community_bot_peers_limit");
        this.f26239h0 = e(4096, "message_length_limit_default");
        this.f26241i0 = e(8192, "message_length_limit_premium");
        this.f26243j0 = e(20, "quick_reply_messages_limit");
        this.f26245k0 = e(5, "ephemeral_welcome_messages_max");
        this.f26247l0 = d("android_audio_recorder_v2_disabled", false);
        this.m0 = d("android_round_video_recorder_v2_disabled", false);
        this.f26250n0 = d("stars_spend_topup_invoice_disabled", false);
        j6.r rVar = new j6.r("bot_allowed_suffixes", Collections.singleton("bot"));
        hashMap.put("bot_allowed_suffixes", (o0) rVar.f17372b);
        this.f26252o0 = rVar;
        this.f26254p0 = d("wallet_available", true);
        this.f26256q0 = d("wallet_paid_message_recipient_message_amount_check", true);
        this.f26258r0 = f(100000000L, "wallet_transfer_min_nanos");
        f(100000000L, "wallet_gasless_min_nanos");
        j6.r rVar2 = new j6.r("wallet_card_bg_gifts", Collections.EMPTY_SET);
        hashMap.put("wallet_card_bg_gifts", (o0) rVar2.f17372b);
        this.f26260s0 = rVar2;
        h6.o oVar2 = new h6.o(23);
        hashMap.put("agent_bot_ids", (m0) oVar2.f13936b);
        this.f26262t0 = oVar2;
        this.f26264u0 = d("widgets_disabled", false);
        this.f26265v0 = e(6, "widgets_processes");
    }

    public static String i(hi.u0 u0Var) {
        String str = ((n0) u0Var.f15482b).f25966c;
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
            k0 k0Var = (k0) this.f26226a.get(tL_jsonObjectValue.key);
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
        boolean z11 = s2.f26829a;
        TLRPC.TL_jsonBool tL_jsonBool3 = new TLRPC.TL_jsonBool();
        tL_jsonBool3.value = true;
        boolean b14 = b(editor, tL_jsonObject, "wallet_available", tL_jsonBool3) | b13;
        if (((h0) this.f26264u0.f17372b).f24439c) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f54972a;
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
                k0 k0Var = (k0) this.f26226a.get(str);
                if (k0Var != null) {
                    return k0Var.a(editor, jSONValue);
                }
            }
        }
        return false;
    }

    public final void c(SharedPreferences sharedPreferences) {
        for (k0 k0Var : this.f26226a.values()) {
            try {
                k0Var.b(sharedPreferences);
            } catch (ClassCastException e10) {
                a8.g(e10, true);
            }
        }
    }

    public final j6.r d(String str, boolean z10) {
        j6.r rVar = new j6.r(str, z10);
        this.f26226a.put(str, (h0) rVar.f17372b);
        return rVar;
    }

    public final hi.u0 e(int i7, String str) {
        hi.u0 u0Var = new hi.u0(str, i7);
        this.f26226a.put(str, (j0) u0Var.f15482b);
        return u0Var;
    }

    public final j6.r f(long j3, String str) {
        j6.r rVar = new j6.r(str, j3);
        this.f26226a.put(str, (l0) rVar.f17372b);
        return rVar;
    }

    public final hi.u0 g(String str, String str2) {
        hi.u0 u0Var = new hi.u0(str, str2);
        this.f26226a.put(str, (n0) u0Var.f15482b);
        return u0Var;
    }

    public final h6.o h(long j3, String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        h6.o oVar = new h6.o(str, j3);
        this.f26226a.put(str, (l0) oVar.f13936b);
        return oVar;
    }
}
