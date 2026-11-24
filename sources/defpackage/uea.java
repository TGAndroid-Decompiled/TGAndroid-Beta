package defpackage;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public final class uea implements bb2 {
    public final int a;
    public final wjb b;
    public final wea c;

    public uea(wea weaVar, int i, wjb wjbVar) {
        this.c = weaVar;
        this.a = i;
        this.b = wjbVar;
    }

    public static TLRPC.TL_message a(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = message.id;
        tL_message.from_id = message.from_id;
        tL_message.from_boosts_applied = message.from_boosts_applied;
        tL_message.peer_id = message.peer_id;
        tL_message.saved_peer_id = message.saved_peer_id;
        tL_message.date = message.date;
        tL_message.expire_date = message.expire_date;
        tL_message.action = message.action;
        tL_message.message = message.message;
        tL_message.flags = message.flags;
        tL_message.flags2 = message.flags2;
        tL_message.mentioned = message.mentioned;
        tL_message.media_unread = message.media_unread;
        tL_message.out = message.out;
        tL_message.unread = message.unread;
        tL_message.entities = message.entities;
        tL_message.via_bot_name = message.via_bot_name;
        tL_message.reply_markup = message.reply_markup;
        tL_message.views = message.views;
        tL_message.forwards = message.forwards;
        tL_message.replies = message.replies;
        tL_message.edit_date = message.edit_date;
        tL_message.silent = message.silent;
        tL_message.post = message.post;
        tL_message.from_scheduled = message.from_scheduled;
        tL_message.legacy = message.legacy;
        tL_message.edit_hide = message.edit_hide;
        tL_message.pinned = message.pinned;
        tL_message.fwd_from = message.fwd_from;
        tL_message.via_bot_id = message.via_bot_id;
        tL_message.via_business_bot_id = message.via_business_bot_id;
        tL_message.reply_to = message.reply_to;
        tL_message.post_author = message.post_author;
        tL_message.grouped_id = message.grouped_id;
        tL_message.reactions = message.reactions;
        tL_message.restriction_reason = message.restriction_reason;
        tL_message.ttl_period = message.ttl_period;
        tL_message.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
        tL_message.effect = message.effect;
        tL_message.noforwards = message.noforwards;
        tL_message.invert_media = message.invert_media;
        tL_message.offline = message.offline;
        tL_message.factcheck = message.factcheck;
        tL_message.send_state = message.send_state;
        tL_message.fwd_msg_id = message.fwd_msg_id;
        tL_message.params = message.params;
        tL_message.random_id = message.random_id;
        tL_message.local_id = message.local_id;
        tL_message.dialog_id = message.dialog_id;
        tL_message.ttl = message.ttl;
        tL_message.destroyTime = message.destroyTime;
        tL_message.destroyTimeMillis = message.destroyTimeMillis;
        tL_message.layer = message.layer;
        tL_message.seq_in = message.seq_in;
        tL_message.seq_out = message.seq_out;
        tL_message.with_my_score = message.with_my_score;
        tL_message.replyMessage = message.replyMessage;
        tL_message.reqId = message.reqId;
        tL_message.realId = message.realId;
        tL_message.stickerVerified = message.stickerVerified;
        tL_message.isThreadMessage = message.isThreadMessage;
        tL_message.voiceTranscription = message.voiceTranscription;
        tL_message.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
        tL_message.voiceTranscriptionRated = message.voiceTranscriptionRated;
        tL_message.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
        tL_message.voiceTranscriptionForce = message.voiceTranscriptionForce;
        tL_message.voiceTranscriptionId = message.voiceTranscriptionId;
        tL_message.premiumEffectWasPlayed = message.premiumEffectWasPlayed;
        tL_message.originalLanguage = message.originalLanguage;
        tL_message.translatedToLanguage = message.translatedToLanguage;
        tL_message.translatedText = message.translatedText;
        tL_message.replyStory = message.replyStory;
        tL_message.quick_reply_shortcut = message.quick_reply_shortcut;
        return tL_message;
    }

    @Override
    public final boolean A1(gb2 gb2Var, int i) {
        return false;
    }

    @Override
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        return false;
    }

    @Override
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final gib E2() {
        return null;
    }

    @Override
    public final boolean F(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean F0(gb2 gb2Var) {
        return false;
    }

    @Override
    public final void F1(gb2 gb2Var, int i) {
        if (i == 80) {
            d dVar = this.c.s.y1;
            k27 messageObject = gb2Var.getMessageObject();
            pm pmVar = gf8.L1;
            if (dVar != null && dVar.getParentActivity() != null) {
                dVar.showDialog(new gf8(dVar.getContext(), dVar.getCurrentAccount(), messageObject, dVar.getResourceProvider()));
            }
        }
    }

    @Override
    public final boolean J0(long j) {
        return false;
    }

    @Override
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    @Override
    public final boolean N() {
        return false;
    }

    @Override
    public final boolean N1() {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final int Q() {
        return 0;
    }

    @Override
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean T1(gm gmVar) {
        return false;
    }

    @Override
    public final int U(gb2 gb2Var) {
        return 0;
    }

    @Override
    public final vu1 W() {
        return null;
    }

    @Override
    public final ma8 Z1() {
        return null;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final String b1(gb2 gb2Var) {
        return null;
    }

    @Override
    public final boolean c2(long j) {
        return false;
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final CharacterStyle e0(gb2 gb2Var) {
        return null;
    }

    @Override
    public final boolean g2(k27 k27Var) {
        return true;
    }

    @Override
    public final boolean h0() {
        return true;
    }

    @Override
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final boolean l2(gb2 gb2Var) {
        return false;
    }

    @Override
    public final boolean r0(gb2 gb2Var, boolean z) {
        return false;
    }

    @Override
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
        z3a.B(this.a).v0(gb2Var.getMessageObject(), arrayList, null);
    }

    @Override
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        int i2;
        TLRPC.Message message;
        int i3;
        TLRPC.Document document;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        TLRPC.Document document3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        nfa nfaVar = this.c.s;
        k27 messageObject = gb2Var.getMessageObject();
        TLRPC.MessageMedia m1 = k27.m1(messageObject);
        if (messageMedia != null && messageObject != null && (m1 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            wjb wjbVar = this.b;
            int i4 = this.a;
            int i5 = 0;
            if (geoPoint != null) {
                if (gl.H1(nfaVar.y1)) {
                    qa6 qa6Var = new qa6(3);
                    qa6Var.setResourceProvider(wjbVar);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = na7.q1(i4).w1(nfaVar.m1);
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = messageMedia.geo;
                    String str = messageMedia.address;
                    if (str == null) {
                        if (pollAnswer != null && (tL_textWithEntities = pollAnswer.text) != null) {
                            str = tL_textWithEntities.text;
                        } else {
                            str = "";
                        }
                    }
                    tL_messageMediaGeo.address = str;
                    tL_message.media = tL_messageMediaGeo;
                    qa6Var.V0 = false;
                    qa6Var.F0(new k27(y6c.t0, tL_message, false, false));
                    nfaVar.y1.presentFragment(qa6Var);
                }
            } else if (k27.N2(messageMedia.document)) {
                xv2.e().l(nfaVar.y1.getParentActivity());
                xv2.e().k(new pea(this, tL_messageMediaPoll, pollAnswer, gb2Var));
                xv2 e = xv2.e();
                TLRPC.Document document4 = messageMedia.document;
                if (k27.H2(document4)) {
                    i5 = 2;
                }
                e.i(document4, null, "", null, null, i5, false, gb2Var.getMessageObject(), this.b, 200);
            } else {
                TLRPC.Message message2 = messageObject.k;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || k27.J4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i2 = arrayList2.size();
                    } else {
                        i2 = -1;
                    }
                    TLRPC.TL_message a = a(message2);
                    a.media = messageMedia3;
                    arrayList2.add(new k27(i4, a, false, true));
                    arrayList.add(-2);
                } else {
                    i2 = -1;
                }
                if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || k27.J4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i2 = arrayList2.size();
                    }
                    TLRPC.TL_message a2 = a(message2);
                    a2.media = messageMedia2;
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    a2.message = pollResults2.solution;
                    a2.entities = pollResults2.solution_entities;
                    arrayList2.add(new k27(i4, a2, false, true));
                    arrayList.add(-3);
                }
                int i6 = i4;
                apb.b(tL_messageMediaPoll.poll, y6c.h(i4).e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
                if (arrayList3 == null) {
                    arrayList3 = poll.answers;
                }
                int i7 = 0;
                while (i7 < arrayList3.size()) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i7);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || k27.J4(document))) {
                        if (pollAnswer2.unshuffled_index == i) {
                            i2 = arrayList2.size();
                        }
                        TLRPC.TL_message a3 = a(message2);
                        a3.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        a3.message = tL_textWithEntities2.text;
                        a3.entities = tL_textWithEntities2.entities;
                        i3 = i6;
                        message = message2;
                        arrayList2.add(new k27(i3, a3, false, true));
                        arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    } else {
                        int i8 = i6;
                        message = message2;
                        i3 = i8;
                    }
                    i7++;
                    message2 = message;
                    i6 = i3;
                }
                if (i2 > -1 && !arrayList2.isEmpty()) {
                    messageObject.s0 = arrayList;
                    PhotoViewer.r0().S1(null, nfaVar.y1, wjbVar);
                    PhotoViewer.r0().i1(arrayList2, i2, nfaVar.m1, 0L, 0L, new tea(this));
                }
            }
        }
    }

    @Override
    public final boolean w0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final String x(long j) {
        return null;
    }

    @Override
    public final boolean y1() {
        return false;
    }

    @Override
    public final boolean y2(int i) {
        return false;
    }

    @Override
    public final boolean z1(k27 k27Var) {
        return oo1.a(k27Var);
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void C2() {
    }

    @Override
    public final void R1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void D1(h27 h27Var) {
    }

    @Override
    public final void E(gb2 gb2Var) {
    }

    @Override
    public final void H2(gb2 gb2Var) {
    }

    @Override
    public final void I(gb2 gb2Var) {
    }

    @Override
    public final void M1(gb2 gb2Var) {
    }

    @Override
    public final void N0(gb2 gb2Var) {
    }

    @Override
    public final void S(gb2 gb2Var) {
    }

    @Override
    public final void V(gb2 gb2Var) {
    }

    @Override
    public final void X(k27 k27Var) {
    }

    @Override
    public final void X0(gb2 gb2Var) {
    }

    @Override
    public final void X1(gb2 gb2Var) {
    }

    @Override
    public final void Y1(gb2 gb2Var) {
    }

    @Override
    public final void c0(int i) {
    }

    @Override
    public final void c1(gb2 gb2Var) {
    }

    @Override
    public final void e2(gb2 gb2Var) {
    }

    @Override
    public final void i0(k27 k27Var) {
    }

    @Override
    public final void k0(String str) {
    }

    @Override
    public final void l1(gb2 gb2Var) {
    }

    @Override
    public final void n1(gb2 gb2Var) {
    }

    @Override
    public final void q(gb2 gb2Var) {
    }

    @Override
    public final void q0(gb2 gb2Var) {
    }

    @Override
    public final void q1(gb2 gb2Var) {
    }

    @Override
    public final void v2(gb2 gb2Var) {
    }

    @Override
    public final void x1(gb2 gb2Var) {
    }

    @Override
    public final void C1(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void E0(gb2 gb2Var, long j) {
    }

    @Override
    public final void M0(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
    }

    @Override
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void Y(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void b2(String str, String str2) {
    }

    @Override
    public final void d2(gb2 gb2Var, k08 k08Var) {
    }

    @Override
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void l0(gb2 gb2Var, int i) {
    }

    @Override
    public final void u0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void H(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void O(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void Y0(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void s2(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void v0(gb2 gb2Var, int i, int i2) {
    }

    @Override
    public final void v1(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void z(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void D(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void b0(gb2 gb2Var, TLRPC.User user, float f, float f2) {
    }

    @Override
    public final void z0(gb2 gb2Var, float f, float f2, boolean z) {
    }

    @Override
    public final void M(gb2 gb2Var, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
