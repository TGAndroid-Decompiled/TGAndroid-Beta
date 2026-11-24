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
public final class uga implements mc2 {
    public final int a;
    public final ylb b;
    public final wga c;

    public uga(wga wgaVar, int i, ylb ylbVar) {
        this.c = wgaVar;
        this.a = i;
        this.b = ylbVar;
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
    public final boolean A0(long j) {
        return false;
    }

    @Override
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final pc8 M1() {
        return null;
    }

    @Override
    public final boolean N() {
        return false;
    }

    @Override
    public final int O() {
        return 0;
    }

    @Override
    public final boolean O1(long j) {
        return false;
    }

    @Override
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override
    public final hw1 S() {
        return null;
    }

    @Override
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean U1(k47 k47Var) {
        return true;
    }

    @Override
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    @Override
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
        a6a.B(this.a).v0(rc2Var.getMessageObject(), arrayList, null);
    }

    @Override
    public final boolean d0() {
        return true;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        int i2;
        TLRPC.Message message;
        int i3;
        TLRPC.Document document;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        TLRPC.Document document3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        nha nhaVar = this.c.s;
        k47 messageObject = rc2Var.getMessageObject();
        TLRPC.MessageMedia m1 = k47.m1(messageObject);
        if (messageMedia != null && messageObject != null && (m1 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            ylb ylbVar = this.b;
            int i4 = this.a;
            int i5 = 0;
            if (geoPoint != null) {
                if (gm.H1(nhaVar.y1)) {
                    pc6 pc6Var = new pc6(3);
                    pc6Var.setResourceProvider(ylbVar);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = oc7.r1(i4).x1(nhaVar.m1);
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
                    pc6Var.V0 = false;
                    pc6Var.G0(new k47(z8c.t0, tL_message, false, false));
                    nhaVar.y1.presentFragment(pc6Var);
                }
            } else if (k47.N2(messageMedia.document)) {
                hx2.e().l(nhaVar.y1.getParentActivity());
                hx2.e().k(new pga(this, tL_messageMediaPoll, pollAnswer, rc2Var));
                hx2 e = hx2.e();
                TLRPC.Document document4 = messageMedia.document;
                if (k47.H2(document4)) {
                    i5 = 2;
                }
                e.i(document4, null, "", null, null, i5, false, rc2Var.getMessageObject(), this.b, 200);
            } else {
                TLRPC.Message message2 = messageObject.k;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || k47.J4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i2 = arrayList2.size();
                    } else {
                        i2 = -1;
                    }
                    TLRPC.TL_message a = a(message2);
                    a.media = messageMedia3;
                    arrayList2.add(new k47(i4, a, false, true));
                    arrayList.add(-2);
                } else {
                    i2 = -1;
                }
                if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || k47.J4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i2 = arrayList2.size();
                    }
                    TLRPC.TL_message a2 = a(message2);
                    a2.media = messageMedia2;
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    a2.message = pollResults2.solution;
                    a2.entities = pollResults2.solution_entities;
                    arrayList2.add(new k47(i4, a2, false, true));
                    arrayList.add(-3);
                }
                int i6 = i4;
                brb.b(tL_messageMediaPoll.poll, z8c.h(i4).e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
                if (arrayList3 == null) {
                    arrayList3 = poll.answers;
                }
                int i7 = 0;
                while (i7 < arrayList3.size()) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i7);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || k47.J4(document))) {
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
                        arrayList2.add(new k47(i3, a3, false, true));
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
                    PhotoViewer.r0().T1(null, nhaVar.y1, ylbVar);
                    PhotoViewer.r0().n1(arrayList2, i2, nhaVar.m1, 0L, 0L, new tga(this));
                }
            }
        }
    }

    @Override
    public final boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override
    public final boolean m2(int i) {
        return false;
    }

    @Override
    public final boolean n1(rc2 rc2Var, int i) {
        return false;
    }

    @Override
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        return false;
    }

    @Override
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final hkb p2() {
        return null;
    }

    @Override
    public final String t(long j) {
        return null;
    }

    @Override
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void t1(rc2 rc2Var, int i) {
        if (i == 80) {
            d dVar = this.c.s.y1;
            k47 messageObject = rc2Var.getMessageObject();
            pn pnVar = ih8.L1;
            if (dVar != null && dVar.getParentActivity() != null) {
                dVar.showDialog(new ih8(dVar.getContext(), dVar.getCurrentAccount(), messageObject, dVar.getResourceProvider()));
            }
        }
    }

    @Override
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void A(rc2 rc2Var) {
    }

    @Override
    public final void C1() {
    }

    @Override
    public final void F0(rc2 rc2Var) {
    }

    @Override
    public final void G(rc2 rc2Var) {
    }

    @Override
    public final void J1(rc2 rc2Var) {
    }

    @Override
    public final void L1(rc2 rc2Var) {
    }

    @Override
    public final void M0(rc2 rc2Var) {
    }

    @Override
    public final void P(rc2 rc2Var) {
    }

    @Override
    public final void Q0(rc2 rc2Var) {
    }

    @Override
    public final void Q1(rc2 rc2Var) {
    }

    @Override
    public final void R(rc2 rc2Var) {
    }

    @Override
    public final void T(k47 k47Var) {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void U0(rc2 rc2Var) {
    }

    @Override
    public final void X0(rc2 rc2Var) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Z0(rc2 rc2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e0(k47 k47Var) {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void h0(String str) {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void i2(rc2 rc2Var) {
    }

    @Override
    public final void k(rc2 rc2Var) {
    }

    @Override
    public final void k0(rc2 rc2Var) {
    }

    @Override
    public final void k1(rc2 rc2Var) {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void q1(h47 h47Var) {
    }

    @Override
    public final void q2(rc2 rc2Var) {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void y1(rc2 rc2Var) {
    }

    @Override
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void N1(String str, String str2) {
    }

    @Override
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void v0(rc2 rc2Var, long j) {
    }

    @Override
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void N0(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void d2(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void i1(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override
    public final void u(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void W(rc2 rc2Var, TLRPC.User user, float f, float f2) {
    }

    @Override
    public final void r0(rc2 rc2Var, float f, float f2, boolean z) {
    }

    @Override
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void H(rc2 rc2Var, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
