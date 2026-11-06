package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLRPC;
public final class p0 {
    public final gf.g A;
    public final gf.g B;
    public final gf.g C;
    public final h9.f1 D;
    public final h9.f1 E;
    public final g6.d0 F;
    public final g6.d0 G;
    public final g6.d0 H;
    public final g6.d0 I;
    public final g6.d0 J;
    public final h9.f1 K;
    public final g6.d0 L;
    public final g6.d0 M;
    public final g6.d0 N;
    public final g6.d0 O;
    public final g6.d0 P;
    public final g6.d0 Q;
    public final g6.d0 R;
    public final g6.d0 S;
    public final g6.d0 T;
    public final gf.g U;
    public final g6.d0 V;
    public final g6.d0 W;
    public final g6.d0 X;
    public final g6.d0 Y;
    public final g6.d0 Z;
    public final HashMap f24418a;
    public final g6.d0 f24419a0;
    public final g6.d0 f24420b;
    public final g6.d0 f24421b0;
    public final g6.d0 f24422c;
    public final g6.d0 f24423c0;
    public final g6.d0 d;
    public final g6.d0 f24424d0;
    public final g6.d0 f24425e;
    public final g6.d0 f24426e0;
    public final g6.d0 f24427f;
    public final gf.g f24428f0;
    public final gf.g f24429g;
    public final gf.g f24430g0;
    public final gf.g h;
    public final gf.g f24431h0;
    public final h9.f1 f24432i;
    public final gf.g f24433i0;
    public final h9.f1 f24434j;
    public final gf.g f24435j0;
    public final h9.f1 f24436k;
    public final gf.g f24437k0;
    public final h9.f1 f24438l;
    public final gf.g f24439l0;
    public final gf.g f24440m;
    public final gf.g m0;
    public final g6.d0 f24441n;
    public final h9.f1 f24442n0;
    public final g6.d0 f24443o;
    public final g6.d0 f24444p;
    public final g6.d0 f24445q;
    public final gf.g f24446r;
    public final gf.g f24447s;
    public final g6.d0 f24448t;
    public final g6.d0 f24449u;
    public final h9.f1 v;
    public final h9.f1 f24450w;
    public final g6.d0 f24451x;
    public final g6.d0 f24452y;
    public final g6.d0 f24453z;

    public p0() {
        HashMap hashMap = new HashMap();
        this.f24418a = hashMap;
        this.f24420b = d(10, "stars_paid_messages_channel_amount_default");
        this.f24422c = d(850, "stars_suggested_post_commission_permille");
        this.d = d(5, "stars_suggested_post_amount_min");
        this.f24425e = d(100000, "stars_suggested_post_amount_max");
        this.f24427f = d(850, "ton_suggested_post_commission_permille");
        this.f24429g = e(10000000L, "ton_suggested_post_amount_min");
        this.h = e(10000000000000L, "ton_suggested_post_amount_max");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f24432i = g(86400L, "stars_suggested_post_age_min");
        this.f24434j = g(300L, "stars_suggested_post_future_min");
        this.f24436k = g(2678400L, "stars_suggested_post_future_max");
        h9.f1 f1Var = new h9.f1(19);
        hashMap.put("ton_usd_rate", (i0) f1Var.f14323b);
        this.f24438l = f1Var;
        f("stars_rating_learnmore_url", "https://telegram.org/blog/telegram-stars");
        this.f24440m = c("need_age_video_verification", false);
        this.f24441n = d(800, "stars_stargift_resale_commission_permille");
        this.f24443o = d(800, "ton_stargift_resale_commission_permille");
        this.f24444p = d(125, "stars_stargift_resale_amount_min");
        this.f24445q = d(35000, "stars_stargift_resale_amount_max");
        this.f24446r = e(10000000L, "ton_stargift_resale_amount_min");
        this.f24447s = e(10000000000000L, "ton_stargift_resale_amount_max");
        this.f24448t = d(100, "stargifts_collections_limit");
        d(100, "stargifts_collection_gifts_limit");
        this.f24449u = d(100, "stories_albums_limit");
        d(100, "stories_album_stories_limit");
        this.v = g(30L, "message_typing_draft_ttl");
        this.f24450w = g(10L, "group_call_message_ttl");
        this.f24451x = d(128, "group_call_message_length_limit");
        this.f24452y = d(128, "contact_note_length_limit");
        this.f24453z = d(5, "passkeys_account_passkeys_max");
        boolean z9 = r2.f25191a;
        this.A = c("settings_display_passkeys", true);
        this.B = c("android_disable_blur_in_light_theme", false);
        this.C = c("android_disable_blur_in_dark_theme", false);
        this.D = g(86400L, "no_forwards_request_expire_period");
        this.E = g(2592000L, "poll_close_period_max");
        this.F = f("music_search_username", null);
        this.G = d(12, "poll_answers_max");
        this.H = d(12, "poll_countries_max");
        this.I = d(100, "poll_answer_length_max");
        d(255, "poll_question_length_max");
        d(200, "poll_solution_length_max");
        this.J = d(300, "poll_caption_length_max");
        this.K = g(300L, "poll_answer_delete_period");
        this.L = d(20, "bots_create_limit_default");
        this.M = d(40, "bots_create_limit_premium");
        this.N = d(2, "bot_additional_usernames_limit");
        this.O = f("phone_country_iso2", "en");
        this.P = d(3, "aicompose_tone_examples_num");
        this.Q = d(12, "aicompose_tone_title_length_max");
        this.R = d(1024, "aicompose_tone_prompt_length_max");
        this.S = d(5, "aicompose_tone_saved_limit_default");
        this.T = d(20, "aicompose_tone_saved_limit_premium");
        this.U = c("message_primary_edited_date", false);
        this.V = d(32768, "rich_message_length_limit");
        this.W = d(500, "rich_message_max_blocks");
        this.X = d(16, "rich_message_max_depth");
        this.Y = d(50, "rich_message_max_media");
        this.Z = d(20, "rich_message_max_table_cols");
        this.f24419a0 = f("rich_message_posting", "premium");
        d(100, "community_peers_limit");
        d(100, "community_bot_peers_limit");
        this.f24421b0 = d(4096, "message_length_limit_default");
        this.f24423c0 = d(8192, "message_length_limit_premium");
        this.f24424d0 = d(20, "quick_reply_messages_limit");
        this.f24426e0 = d(5, "ephemeral_welcome_messages_max");
        this.f24428f0 = c("android_audio_recorder_v2_disabled", false);
        this.f24430g0 = c("android_round_video_recorder_v2_disabled", false);
        this.f24431h0 = c("stars_spend_topup_invoice_disabled", false);
        gf.g gVar = new gf.g("bot_allowed_suffixes", Collections.singleton("bot"));
        hashMap.put("bot_allowed_suffixes", (o0) gVar.f13889b);
        this.f24433i0 = gVar;
        this.f24435j0 = c("wallet_available", true);
        this.f24437k0 = c("wallet_paid_message_recipient_message_amount_check", true);
        this.f24439l0 = e(100000000L, "wallet_transfer_min_nanos");
        e(100000000L, "wallet_gasless_min_nanos");
        gf.g gVar2 = new gf.g("wallet_card_bg_gifts", Collections.EMPTY_SET);
        hashMap.put("wallet_card_bg_gifts", (o0) gVar2.f13889b);
        this.m0 = gVar2;
        h9.f1 f1Var2 = new h9.f1(20);
        hashMap.put("agent_bot_ids", (m0) f1Var2.f14323b);
        this.f24442n0 = f1Var2;
    }

    public final boolean a(SharedPreferences.Editor editor, TLRPC.TL_jsonObject tL_jsonObject) {
        int size = tL_jsonObject.value.size();
        boolean z9 = false;
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i7);
            k0 k0Var = (k0) this.f24418a.get(tL_jsonObjectValue.key);
            if (k0Var != null) {
                z9 |= k0Var.a(editor, tL_jsonObjectValue.value);
            }
        }
        return z9;
    }

    public final void b(SharedPreferences sharedPreferences) {
        for (k0 k0Var : this.f24418a.values()) {
            try {
                k0Var.b(sharedPreferences);
            } catch (ClassCastException e10) {
                a8.g(e10, true);
            }
        }
    }

    public final gf.g c(String str, boolean z9) {
        gf.g gVar = new gf.g(str, z9);
        this.f24418a.put(str, (h0) gVar.f13889b);
        return gVar;
    }

    public final g6.d0 d(int i7, String str) {
        g6.d0 d0Var = new g6.d0(str, i7);
        this.f24418a.put(str, (j0) d0Var.f13555b);
        return d0Var;
    }

    public final gf.g e(long j3, String str) {
        gf.g gVar = new gf.g(str, j3);
        this.f24418a.put(str, (l0) gVar.f13889b);
        return gVar;
    }

    public final g6.d0 f(String str, String str2) {
        g6.d0 d0Var = new g6.d0(str, str2);
        this.f24418a.put(str, (n0) d0Var.f13555b);
        return d0Var;
    }

    public final h9.f1 g(long j3, String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        h9.f1 f1Var = new h9.f1(str, j3);
        this.f24418a.put(str, (l0) f1Var.f14323b);
        return f1Var;
    }
}
