package org.telegram.messenger;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ah0;
public final class p0 {
    public final hi.l0 A;
    public final hi.l0 B;
    public final hi.l0 C;
    public final gc.b D;
    public final gc.b E;
    public final ia.d F;
    public final ia.d G;
    public final ia.d H;
    public final ia.d I;
    public final ia.d J;
    public final gc.b K;
    public final ia.d L;
    public final ia.d M;
    public final ia.d N;
    public final ia.d O;
    public final ia.d P;
    public final ia.d Q;
    public final ia.d R;
    public final ia.d S;
    public final ia.d T;
    public final hi.l0 U;
    public final ia.d V;
    public final ia.d W;
    public final ia.d X;
    public final ia.d Y;
    public final ia.d Z;
    public final HashMap f25835a;
    public final ia.d f25836a0;
    public final ia.d f25837b;
    public final ia.d f25838b0;
    public final ia.d f25839c;
    public final ia.d f25840c0;
    public final ia.d d;
    public final ia.d f25841d0;
    public final ia.d f25842e;
    public final ia.d f25843e0;
    public final ia.d f25844f;
    public final hi.l0 f25845f0;
    public final hi.l0 f25846g;
    public final hi.l0 f25847g0;
    public final hi.l0 h;
    public final hi.l0 f25848h0;
    public final gc.b f25849i;
    public final hi.l0 f25850i0;
    public final gc.b f25851j;
    public final hi.l0 f25852j0;
    public final gc.b f25853k;
    public final hi.l0 f25854k0;
    public final gc.b f25855l;
    public final hi.l0 f25856l0;
    public final hi.l0 f25857m;
    public final hi.l0 m0;
    public final ia.d f25858n;
    public final gc.b f25859n0;
    public final ia.d f25860o;
    public final hi.l0 f25861o0;
    public final ia.d f25862p;
    public final ia.d f25863q;
    public final hi.l0 f25864r;
    public final hi.l0 f25865s;
    public final ia.d f25866t;
    public final ia.d f25867u;
    public final gc.b v;
    public final gc.b f25868w;
    public final ia.d f25869x;
    public final ia.d f25870y;
    public final ia.d f25871z;

    public p0() {
        HashMap hashMap = new HashMap();
        this.f25835a = hashMap;
        this.f25837b = d(10, "stars_paid_messages_channel_amount_default");
        this.f25839c = d(850, "stars_suggested_post_commission_permille");
        this.d = d(5, "stars_suggested_post_amount_min");
        this.f25842e = d(100000, "stars_suggested_post_amount_max");
        this.f25844f = d(850, "ton_suggested_post_commission_permille");
        this.f25846g = e(10000000L, "ton_suggested_post_amount_min");
        this.h = e(10000000000000L, "ton_suggested_post_amount_max");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f25849i = g(86400L, "stars_suggested_post_age_min");
        this.f25851j = g(300L, "stars_suggested_post_future_min");
        this.f25853k = g(2678400L, "stars_suggested_post_future_max");
        gc.b bVar = new gc.b(25);
        hashMap.put("ton_usd_rate", (i0) bVar.f13134b);
        this.f25855l = bVar;
        f("stars_rating_learnmore_url", "https://telegram.org/blog/telegram-stars");
        this.f25857m = c("need_age_video_verification", false);
        this.f25858n = d(800, "stars_stargift_resale_commission_permille");
        this.f25860o = d(800, "ton_stargift_resale_commission_permille");
        this.f25862p = d(125, "stars_stargift_resale_amount_min");
        this.f25863q = d(35000, "stars_stargift_resale_amount_max");
        this.f25864r = e(10000000L, "ton_stargift_resale_amount_min");
        this.f25865s = e(10000000000000L, "ton_stargift_resale_amount_max");
        this.f25866t = d(100, "stargifts_collections_limit");
        d(100, "stargifts_collection_gifts_limit");
        this.f25867u = d(100, "stories_albums_limit");
        d(100, "stories_album_stories_limit");
        this.v = g(30L, "message_typing_draft_ttl");
        this.f25868w = g(10L, "group_call_message_ttl");
        this.f25869x = d(128, "group_call_message_length_limit");
        this.f25870y = d(128, "contact_note_length_limit");
        this.f25871z = d(5, "passkeys_account_passkeys_max");
        boolean z10 = r2.f26198a;
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
        this.f25836a0 = f("rich_message_posting", "premium");
        d(100, "community_peers_limit");
        d(100, "community_bot_peers_limit");
        this.f25838b0 = d(4096, "message_length_limit_default");
        this.f25840c0 = d(8192, "message_length_limit_premium");
        this.f25841d0 = d(20, "quick_reply_messages_limit");
        this.f25843e0 = d(5, "ephemeral_welcome_messages_max");
        this.f25845f0 = c("android_audio_recorder_v2_disabled", false);
        this.f25847g0 = c("android_round_video_recorder_v2_disabled", false);
        this.f25848h0 = c("stars_spend_topup_invoice_disabled", false);
        hi.l0 l0Var = new hi.l0("bot_allowed_suffixes", Collections.singleton("bot"));
        hashMap.put("bot_allowed_suffixes", (o0) l0Var.f14544b);
        this.f25850i0 = l0Var;
        this.f25852j0 = c("wallet_available", true);
        this.f25854k0 = c("wallet_paid_message_recipient_message_amount_check", true);
        this.f25856l0 = e(100000000L, "wallet_transfer_min_nanos");
        e(100000000L, "wallet_gasless_min_nanos");
        hi.l0 l0Var2 = new hi.l0("wallet_card_bg_gifts", Collections.EMPTY_SET);
        hashMap.put("wallet_card_bg_gifts", (o0) l0Var2.f14544b);
        this.m0 = l0Var2;
        gc.b bVar2 = new gc.b(26);
        hashMap.put("agent_bot_ids", (m0) bVar2.f13134b);
        this.f25859n0 = bVar2;
        this.f25861o0 = c("widgets_disabled", false);
    }

    public final boolean a(SharedPreferences.Editor editor, TLRPC.TL_jsonObject tL_jsonObject) {
        int size = tL_jsonObject.value.size();
        boolean z10 = false;
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i7);
            k0 k0Var = (k0) this.f25835a.get(tL_jsonObjectValue.key);
            if (k0Var != null) {
                z10 |= k0Var.a(editor, tL_jsonObjectValue.value);
            }
        }
        if (((h0) this.f25861o0.f14544b).f24006c) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f54338a;
            g0.h3(new ah0(15));
        }
        return z10;
    }

    public final void b(SharedPreferences sharedPreferences) {
        for (k0 k0Var : this.f25835a.values()) {
            try {
                k0Var.b(sharedPreferences);
            } catch (ClassCastException e10) {
                a8.g(e10, true);
            }
        }
    }

    public final hi.l0 c(String str, boolean z10) {
        hi.l0 l0Var = new hi.l0(str, z10);
        this.f25835a.put(str, (h0) l0Var.f14544b);
        return l0Var;
    }

    public final ia.d d(int i7, String str) {
        ia.d dVar = new ia.d(str, i7);
        this.f25835a.put(str, (j0) dVar.f15881b);
        return dVar;
    }

    public final hi.l0 e(long j3, String str) {
        hi.l0 l0Var = new hi.l0(str, j3);
        this.f25835a.put(str, (l0) l0Var.f14544b);
        return l0Var;
    }

    public final ia.d f(String str, String str2) {
        ia.d dVar = new ia.d(str, str2);
        this.f25835a.put(str, (n0) dVar.f15881b);
        return dVar;
    }

    public final gc.b g(long j3, String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        gc.b bVar = new gc.b(str, j3);
        this.f25835a.put(str, (l0) bVar.f13134b);
        return bVar;
    }
}
