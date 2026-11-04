package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLRPC;
public final class p0 {
    public final gi.v5 A;
    public final gi.v5 B;
    public final gi.v5 C;
    public final hi.d D;
    public final hi.d E;
    public final gi.w5 F;
    public final gi.w5 G;
    public final gi.w5 H;
    public final gi.w5 I;
    public final gi.w5 J;
    public final hi.d K;
    public final gi.w5 L;
    public final gi.w5 M;
    public final gi.w5 N;
    public final gi.w5 O;
    public final gi.w5 P;
    public final gi.w5 Q;
    public final gi.w5 R;
    public final gi.w5 S;
    public final gi.w5 T;
    public final gi.v5 U;
    public final gi.w5 V;
    public final gi.w5 W;
    public final gi.w5 X;
    public final gi.w5 Y;
    public final gi.w5 Z;
    public final HashMap f24645a;
    public final gi.w5 f24646a0;
    public final gi.w5 f24647b;
    public final gi.w5 f24648b0;
    public final gi.w5 f24649c;
    public final gi.w5 f24650c0;
    public final gi.w5 d;
    public final gi.w5 f24651d0;
    public final gi.w5 f24652e;
    public final gi.w5 f24653e0;
    public final gi.w5 f24654f;
    public final gi.v5 f24655f0;
    public final gi.v5 f24656g;
    public final gi.v5 f24657g0;
    public final gi.v5 h;
    public final gi.v5 f24658h0;
    public final hi.d f24659i;
    public final gi.v5 f24660i0;
    public final hi.d f24661j;
    public final gi.v5 f24662j0;
    public final hi.d f24663k;
    public final gi.v5 f24664k0;
    public final hi.d f24665l;
    public final gi.v5 f24666l0;
    public final gi.v5 f24667m;
    public final gi.v5 m0;
    public final gi.w5 f24668n;
    public final hi.d f24669n0;
    public final gi.w5 f24670o;
    public final gi.w5 f24671p;
    public final gi.w5 f24672q;
    public final gi.v5 f24673r;
    public final gi.v5 f24674s;
    public final gi.w5 f24675t;
    public final gi.w5 f24676u;
    public final hi.d v;
    public final hi.d f24677w;
    public final gi.w5 f24678x;
    public final gi.w5 f24679y;
    public final gi.w5 f24680z;

    public p0() {
        HashMap hashMap = new HashMap();
        this.f24645a = hashMap;
        this.f24647b = d(10, "stars_paid_messages_channel_amount_default");
        this.f24649c = d(850, "stars_suggested_post_commission_permille");
        this.d = d(5, "stars_suggested_post_amount_min");
        this.f24652e = d(100000, "stars_suggested_post_amount_max");
        this.f24654f = d(850, "ton_suggested_post_commission_permille");
        this.f24656g = e(10000000L, "ton_suggested_post_amount_min");
        this.h = e(10000000000000L, "ton_suggested_post_amount_max");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f24659i = g(86400L, "stars_suggested_post_age_min");
        this.f24661j = g(300L, "stars_suggested_post_future_min");
        this.f24663k = g(2678400L, "stars_suggested_post_future_max");
        hi.d dVar = new hi.d(20);
        hashMap.put("ton_usd_rate", (i0) dVar.f14429b);
        this.f24665l = dVar;
        f("stars_rating_learnmore_url", "https://telegram.org/blog/telegram-stars");
        this.f24667m = c("need_age_video_verification", false);
        this.f24668n = d(800, "stars_stargift_resale_commission_permille");
        this.f24670o = d(800, "ton_stargift_resale_commission_permille");
        this.f24671p = d(125, "stars_stargift_resale_amount_min");
        this.f24672q = d(35000, "stars_stargift_resale_amount_max");
        this.f24673r = e(10000000L, "ton_stargift_resale_amount_min");
        this.f24674s = e(10000000000000L, "ton_stargift_resale_amount_max");
        this.f24675t = d(100, "stargifts_collections_limit");
        d(100, "stargifts_collection_gifts_limit");
        this.f24676u = d(100, "stories_albums_limit");
        d(100, "stories_album_stories_limit");
        this.v = g(30L, "message_typing_draft_ttl");
        this.f24677w = g(10L, "group_call_message_ttl");
        this.f24678x = d(128, "group_call_message_length_limit");
        this.f24679y = d(128, "contact_note_length_limit");
        this.f24680z = d(5, "passkeys_account_passkeys_max");
        boolean z10 = r2.f25040a;
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
        this.f24646a0 = f("rich_message_posting", "premium");
        d(100, "community_peers_limit");
        d(100, "community_bot_peers_limit");
        this.f24648b0 = d(4096, "message_length_limit_default");
        this.f24650c0 = d(8192, "message_length_limit_premium");
        this.f24651d0 = d(20, "quick_reply_messages_limit");
        this.f24653e0 = d(5, "ephemeral_welcome_messages_max");
        this.f24655f0 = c("android_audio_recorder_v2_disabled", false);
        this.f24657g0 = c("android_round_video_recorder_v2_disabled", false);
        this.f24658h0 = c("stars_spend_topup_invoice_disabled", false);
        gi.v5 v5Var = new gi.v5("bot_allowed_suffixes", Collections.singleton("bot"));
        hashMap.put("bot_allowed_suffixes", (o0) v5Var.f13688b);
        this.f24660i0 = v5Var;
        this.f24662j0 = c("wallet_available", true);
        this.f24664k0 = c("wallet_paid_message_recipient_message_amount_check", true);
        this.f24666l0 = e(100000000L, "wallet_transfer_min_nanos");
        e(100000000L, "wallet_gasless_min_nanos");
        gi.v5 v5Var2 = new gi.v5("wallet_card_bg_gifts", Collections.EMPTY_SET);
        hashMap.put("wallet_card_bg_gifts", (o0) v5Var2.f13688b);
        this.m0 = v5Var2;
        hi.d dVar2 = new hi.d(21);
        hashMap.put("agent_bot_ids", (m0) dVar2.f14429b);
        this.f24669n0 = dVar2;
    }

    public final boolean a(SharedPreferences.Editor editor, TLRPC.TL_jsonObject tL_jsonObject) {
        int size = tL_jsonObject.value.size();
        boolean z10 = false;
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i3);
            k0 k0Var = (k0) this.f24645a.get(tL_jsonObjectValue.key);
            if (k0Var != null) {
                z10 |= k0Var.a(editor, tL_jsonObjectValue.value);
            }
        }
        return z10;
    }

    public final void b(SharedPreferences sharedPreferences) {
        for (k0 k0Var : this.f24645a.values()) {
            try {
                k0Var.b(sharedPreferences);
            } catch (ClassCastException e10) {
                a8.g(e10, true);
            }
        }
    }

    public final gi.v5 c(String str, boolean z10) {
        gi.v5 v5Var = new gi.v5(str, z10);
        this.f24645a.put(str, (h0) v5Var.f13688b);
        return v5Var;
    }

    public final gi.w5 d(int i3, String str) {
        gi.w5 w5Var = new gi.w5(str, i3);
        this.f24645a.put(str, (j0) w5Var.f13798b);
        return w5Var;
    }

    public final gi.v5 e(long j10, String str) {
        gi.v5 v5Var = new gi.v5(str, j10);
        this.f24645a.put(str, (l0) v5Var.f13688b);
        return v5Var;
    }

    public final gi.w5 f(String str, String str2) {
        gi.w5 w5Var = new gi.w5(str, str2);
        this.f24645a.put(str, (n0) w5Var.f13798b);
        return w5Var;
    }

    public final hi.d g(long j10, String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        hi.d dVar = new hi.d(str, j10);
        this.f24645a.put(str, (l0) dVar.f14429b);
        return dVar;
    }
}
