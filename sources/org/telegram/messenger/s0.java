package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLRPC;
public final class s0 {
    public final l2.f A;
    public final l2.f B;
    public final l2.f C;
    public final o0 D;
    public final o0 E;
    public final n2.u F;
    public final k2.m0 G;
    public final k2.m0 H;
    public final k2.m0 I;
    public final k2.m0 J;
    public final o0 K;
    public final k2.m0 L;
    public final k2.m0 M;
    public final k2.m0 N;
    public final n2.u O;
    public final k2.m0 P;
    public final k2.m0 Q;
    public final k2.m0 R;
    public final k2.m0 S;
    public final k2.m0 T;
    public final l2.f U;
    public final k2.m0 V;
    public final k2.m0 W;
    public final k2.m0 X;
    public final k2.m0 Y;
    public final k2.m0 Z;
    public final HashMap f17825a;
    public final n2.u f17826a0;
    public final k2.m0 f17827b;
    public final k2.m0 f17828b0;
    public final k2.m0 f17829c;
    public final k2.m0 f17830c0;
    public final k2.m0 d;
    public final k2.m0 f17831d0;
    public final k2.m0 e;
    public final k2.m0 f17832e0;
    public final k2.m0 f17833f;
    public final l2.f f17834f0;
    public final o0 f17835g;
    public final l2.f f17836g0;
    public final o0 h;
    public final l2.f f17837h0;
    public final o0 f17838i;
    public final k2.m0 f17839i0;
    public final o0 f17840j;
    public final l2.f f17841j0;
    public final o0 f17842k;
    public final l2.f f17843k0;
    public final n2.u f17844l;
    public final o0 f17845l0;
    public final l2.f f17846m;
    public final k2.m0 m0;
    public final k2.m0 f17847n;
    public final l2.f f17848n0;
    public final k2.m0 f17849o;
    public final k2.m0 f17850p;
    public final k2.m0 f17851q;
    public final o0 f17852r;
    public final o0 f17853s;
    public final k2.m0 f17854t;
    public final k2.m0 f17855u;
    public final o0 v;
    public final o0 f17856w;
    public final k2.m0 f17857x;
    public final k2.m0 f17858y;
    public final k2.m0 f17859z;

    public s0() {
        HashMap hashMap = new HashMap();
        this.f17825a = hashMap;
        this.f17827b = d(10, "stars_paid_messages_channel_amount_default");
        this.f17829c = d(850, "stars_suggested_post_commission_permille");
        this.d = d(5, "stars_suggested_post_amount_min");
        this.e = d(100000, "stars_suggested_post_amount_max");
        this.f17833f = d(850, "ton_suggested_post_commission_permille");
        this.f17835g = e(10000000L, "ton_suggested_post_amount_min");
        this.h = e(10000000000000L, "ton_suggested_post_amount_max");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f17838i = g(86400L, "stars_suggested_post_age_min");
        this.f17840j = g(300L, "stars_suggested_post_future_min");
        this.f17842k = g(2678400L, "stars_suggested_post_future_max");
        n2.u uVar = new n2.u(3);
        hashMap.put("ton_usd_rate", (k0) uVar.f13480b);
        this.f17844l = uVar;
        f("stars_rating_learnmore_url", "https://telegram.org/blog/telegram-stars");
        this.f17846m = c("need_age_video_verification", false);
        this.f17847n = d(800, "stars_stargift_resale_commission_permille");
        this.f17849o = d(800, "ton_stargift_resale_commission_permille");
        this.f17850p = d(125, "stars_stargift_resale_amount_min");
        this.f17851q = d(35000, "stars_stargift_resale_amount_max");
        this.f17852r = e(10000000L, "ton_stargift_resale_amount_min");
        this.f17853s = e(10000000000000L, "ton_stargift_resale_amount_max");
        this.f17854t = d(100, "stargifts_collections_limit");
        d(100, "stargifts_collection_gifts_limit");
        this.f17855u = d(100, "stories_albums_limit");
        d(100, "stories_album_stories_limit");
        this.v = g(30L, "message_typing_draft_ttl");
        this.f17856w = g(10L, "group_call_message_ttl");
        this.f17857x = d(128, "group_call_message_length_limit");
        this.f17858y = d(128, "contact_note_length_limit");
        this.f17859z = d(5, "passkeys_account_passkeys_max");
        boolean z10 = v2.f18448a;
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
        this.f17826a0 = f("rich_message_posting", "premium");
        d(100, "community_peers_limit");
        d(100, "community_bot_peers_limit");
        this.f17828b0 = d(4096, "message_length_limit_default");
        this.f17830c0 = d(8192, "message_length_limit_premium");
        this.f17831d0 = d(20, "quick_reply_messages_limit");
        this.f17832e0 = d(5, "ephemeral_welcome_messages_max");
        this.f17834f0 = c("android_audio_recorder_v2_disabled", false);
        this.f17836g0 = c("android_round_video_recorder_v2_disabled", false);
        this.f17837h0 = c("stars_spend_topup_invoice_disabled", false);
        k2.m0 m0Var = new k2.m0("bot_allowed_suffixes", Collections.singleton("bot"));
        hashMap.put("bot_allowed_suffixes", (r0) m0Var.f10700a);
        this.f17839i0 = m0Var;
        this.f17841j0 = c("wallet_available", true);
        this.f17843k0 = c("wallet_paid_message_recipient_message_amount_check", true);
        this.f17845l0 = e(100000000L, "wallet_transfer_min_nanos");
        e(100000000L, "wallet_gasless_min_nanos");
        k2.m0 m0Var2 = new k2.m0("wallet_card_bg_gifts", Collections.EMPTY_SET);
        hashMap.put("wallet_card_bg_gifts", (r0) m0Var2.f10700a);
        this.m0 = m0Var2;
        l2.f fVar = new l2.f(8);
        hashMap.put("agent_bot_ids", (p0) fVar.f11587b);
        this.f17848n0 = fVar;
    }

    public final boolean a(SharedPreferences.Editor editor, TLRPC.TL_jsonObject tL_jsonObject) {
        int size = tL_jsonObject.value.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i10);
            m0 m0Var = (m0) this.f17825a.get(tL_jsonObjectValue.key);
            if (m0Var != null) {
                z10 |= m0Var.a(editor, tL_jsonObjectValue.value);
            }
        }
        return z10;
    }

    public final void b(SharedPreferences sharedPreferences) {
        for (m0 m0Var : this.f17825a.values()) {
            try {
                m0Var.b(sharedPreferences);
            } catch (ClassCastException e) {
                f8.g(e, true);
            }
        }
    }

    public final l2.f c(String str, boolean z10) {
        l2.f fVar = new l2.f(str, z10);
        this.f17825a.put(str, (j0) fVar.f11587b);
        return fVar;
    }

    public final k2.m0 d(int i10, String str) {
        ?? obj = new Object();
        obj.f10700a = new l0(str, i10);
        this.f17825a.put(str, (l0) obj.f10700a);
        return obj;
    }

    public final o0 e(long j10, String str) {
        o0 o0Var = new o0(str, j10, 0);
        this.f17825a.put(str, o0Var.f17206a);
        return o0Var;
    }

    public final n2.u f(String str, String str2) {
        n2.u uVar = new n2.u(str, str2);
        this.f17825a.put(str, (q0) uVar.f13480b);
        return uVar;
    }

    public final o0 g(long j10, String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        o0 o0Var = new o0(str, j10, 1);
        this.f17825a.put(str, o0Var.f17206a);
        return o0Var;
    }
}
