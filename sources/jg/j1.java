package jg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ej;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.s9;
import vh.j4;
import vh.n5;
import vh.s3;
import w7.b6;
public abstract class j1 extends j {
    public boolean A0;
    public boolean B0;
    public final SparseIntArray C0;
    public final i1 D0;
    public c5 E0;
    public c5 F0;
    public c5 G0;
    public c5 H0;
    public c5 I0;
    public c5 J0;
    public c5 K0;
    public c5 L0;
    public final b1 f10055q0;
    public final c1 f10056r0;
    public final ArrayList f10057s0;
    public final ej f10058t0;
    public boolean f10059u0;
    public boolean f10060v0;
    public TextureView f10061w0;
    public boolean f10062x0;
    public int f10063y0;
    public int f10064z0;

    public j1(Context context, PointF pointF, ArrayList arrayList, s9 s9Var, boolean z10, j4 j4Var) {
        super(context, pointF);
        ag.a aVar;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.f10057s0 = new ArrayList();
        this.f10063y0 = 1;
        this.f10064z0 = 1;
        this.A0 = true;
        this.B0 = t6.I.q();
        this.C0 = new SparseIntArray();
        s3 s3Var = (s3) this;
        this.D0 = new i1(s3Var);
        setRotation(0.0f);
        setScale(1.0f);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jj jjVar = (jj) arrayList.get(i10);
            TLRPC.Message message2 = jjVar.f16337k;
            int i11 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                D = n5.D(jjVar);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i12 = jjVar.I1;
                jj jjVar2 = new jj(i12, message, jjVar.C, vp.r1(i12).d, vp.r1(jjVar.I1).f18742b, null, null, true, true, 0L, true, z10, false, 0);
                jjVar2.K5();
                this.f10057s0.add(jjVar2);
            }
            tL_messageService.f19814id = message2.f19814id;
            tL_messageService.from_id = message2.from_id;
            tL_messageService.peer_id = message2.peer_id;
            tL_messageService.date = message2.date;
            tL_messageService.expire_date = message2.expire_date;
            tL_messageService.action = message2.action;
            tL_messageService.message = message2.message;
            tL_messageService.media = message2.media;
            tL_messageService.flags = message2.flags;
            tL_messageService.mentioned = message2.mentioned;
            tL_messageService.media_unread = message2.media_unread;
            tL_messageService.out = message2.out;
            tL_messageService.unread = message2.unread;
            tL_messageService.entities = message2.entities;
            tL_messageService.via_bot_name = message2.via_bot_name;
            tL_messageService.reply_markup = message2.reply_markup;
            tL_messageService.views = message2.views;
            tL_messageService.forwards = message2.forwards;
            tL_messageService.replies = message2.replies;
            tL_messageService.edit_date = message2.edit_date;
            tL_messageService.silent = message2.silent;
            tL_messageService.post = message2.post;
            tL_messageService.from_scheduled = message2.from_scheduled;
            tL_messageService.legacy = message2.legacy;
            tL_messageService.edit_hide = message2.edit_hide;
            tL_messageService.pinned = message2.pinned;
            tL_messageService.fwd_from = message2.fwd_from;
            tL_messageService.via_bot_id = message2.via_bot_id;
            tL_messageService.reply_to = message2.reply_to;
            tL_messageService.post_author = message2.post_author;
            tL_messageService.grouped_id = message2.grouped_id;
            tL_messageService.reactions = message2.reactions;
            tL_messageService.restriction_reason = message2.restriction_reason;
            tL_messageService.ttl_period = message2.ttl_period;
            tL_messageService.noforwards = message2.noforwards;
            tL_messageService.invert_media = message2.invert_media;
            tL_messageService.send_state = message2.send_state;
            tL_messageService.fwd_msg_id = message2.fwd_msg_id;
            tL_messageService.attachPath = message2.attachPath;
            tL_messageService.params = message2.params;
            tL_messageService.random_id = message2.random_id;
            tL_messageService.local_id = message2.local_id;
            tL_messageService.dialog_id = message2.dialog_id;
            tL_messageService.ttl = message2.ttl;
            tL_messageService.destroyTime = message2.destroyTime;
            tL_messageService.destroyTimeMillis = message2.destroyTimeMillis;
            tL_messageService.layer = message2.layer;
            tL_messageService.seq_in = message2.seq_in;
            tL_messageService.seq_out = message2.seq_out;
            tL_messageService.with_my_score = message2.with_my_score;
            tL_messageService.replyMessage = message2.replyMessage;
            tL_messageService.reqId = message2.reqId;
            tL_messageService.realId = message2.realId;
            tL_messageService.stickerVerified = message2.stickerVerified;
            tL_messageService.isThreadMessage = message2.isThreadMessage;
            tL_messageService.voiceTranscription = message2.voiceTranscription;
            tL_messageService.voiceTranscriptionOpen = message2.voiceTranscriptionOpen;
            tL_messageService.voiceTranscriptionRated = message2.voiceTranscriptionRated;
            tL_messageService.voiceTranscriptionFinal = message2.voiceTranscriptionFinal;
            tL_messageService.voiceTranscriptionForce = message2.voiceTranscriptionForce;
            tL_messageService.voiceTranscriptionId = message2.voiceTranscriptionId;
            tL_messageService.premiumEffectWasPlayed = message2.premiumEffectWasPlayed;
            tL_messageService.originalLanguage = message2.originalLanguage;
            tL_messageService.translatedToLanguage = message2.translatedToLanguage;
            tL_messageService.translatedText = message2.translatedText;
            tL_messageService.replyStory = message2.replyStory;
            message = tL_messageService;
            D = n5.D(jjVar);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i122 = jjVar.I1;
            jj jjVar22 = new jj(i122, message, jjVar.C, vp.r1(i122).d, vp.r1(jjVar.I1).f18742b, null, null, true, true, 0L, true, z10, false, 0);
            jjVar22.K5();
            this.f10057s0.add(jjVar22);
        }
        this.f10058t0 = null;
        if (this.f10057s0.size() > 1) {
            ej ejVar = new ej();
            this.f10058t0 = ejVar;
            ejVar.d.addAll(this.f10057s0);
            ejVar.f15394a = ((jj) this.f10057s0.get(0)).d1();
            ejVar.a();
        }
        b1 b1Var = new b1(s3Var, context);
        this.f10055q0 = b1Var;
        addView(b1Var, b6.c(-1.0f, -1));
        c1 c1Var = new c1(s3Var, context, this.D0);
        this.f10056r0 = c1Var;
        c1Var.setAdapter(new f1(s3Var, context, s9Var, j4Var, z10));
        g1 g1Var = new g1(s3Var, 0);
        g1Var.O = new h1(s3Var, 0);
        c1Var.setLayoutManager(g1Var);
        c1Var.i(new dh.g(1));
        b1Var.addView(c1Var, b6.c(-1.0f, -1));
        if (j4Var != null && j4Var.f51318g) {
            ag.l lVar = new ag.l(s3Var, 13);
            ag.a aVar2 = new ag.a(s3Var, 15);
            j4Var.f51315b = lVar;
            j4Var.f51316c = aVar2;
            TextureView textureView = j4Var.f51314a;
            if (textureView != null) {
                lVar.a(textureView);
            }
            if (j4Var.d && (aVar = j4Var.f51316c) != null) {
                aVar.a(Integer.valueOf(j4Var.e), Integer.valueOf(j4Var.f51317f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.q1 getCell() {
        c1 c1Var = this.f10056r0;
        if (c1Var != null) {
            for (int i10 = 0; i10 < c1Var.getChildCount(); i10++) {
                if (c1Var.getChildAt(i10) instanceof org.telegram.ui.Cells.q1) {
                    return (org.telegram.ui.Cells.q1) c1Var.getChildAt(i10);
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final i a() {
        return new u0(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public oj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new oj0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - org.telegram.messenger.i0.L(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - org.telegram.messenger.i0.L(35.5f), (getScale() * getMeasuredWidth() * scaleX) + org.telegram.messenger.i0.L(71.0f), (getScale() * getMeasuredHeight() * scaleX) + org.telegram.messenger.i0.L(71.0f));
    }

    @Override
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.f10060v0) {
            s();
        }
    }

    @Override
    public final void onMeasure(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: jg.j1.onMeasure(int, int):void");
    }

    public final float r(RectF rectF) {
        float y3;
        float f7;
        float f10;
        float L;
        float f11 = 2.1474836E9f;
        float f12 = -2.1474836E9f;
        int i10 = 0;
        float f13 = 2.1474836E9f;
        float f14 = -2.1474836E9f;
        while (true) {
            c1 c1Var = this.f10056r0;
            if (i10 < c1Var.getChildCount()) {
                View childAt = c1Var.getChildAt(i10);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.q1;
                b1 b1Var = this.f10055q0;
                if (z10) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() != null && q1Var.getMessageObject().h4() && q1Var.getPhotoImage() != null) {
                        f7 = q1Var.getX() + b1Var.getX() + q1Var.getPhotoImage().K0;
                        f10 = q1Var.getPhotoImage().y() + q1Var.getX() + b1Var.getX();
                        L = q1Var.getY() + b1Var.getY() + q1Var.getPhotoImage().L0;
                        y3 = q1Var.getPhotoImage().A() + q1Var.getY() + b1Var.getY();
                    } else {
                        float x10 = childAt.getX() + b1Var.getX() + q1Var.getBackgroundDrawableLeft() + org.telegram.messenger.i0.L(1.0f);
                        if (this.f10058t0 == null) {
                            x10 += org.telegram.messenger.i0.L(8.0f);
                        }
                        float x11 = ((childAt.getX() + b1Var.getX()) + q1Var.getBackgroundDrawableRight()) - org.telegram.messenger.i0.L(1.66f);
                        float y10 = childAt.getY() + b1Var.getY() + q1Var.getBackgroundDrawableTop();
                        y3 = ((childAt.getY() + b1Var.getY()) + q1Var.getBackgroundDrawableBottom()) - org.telegram.messenger.i0.L(1.0f);
                        f7 = x10;
                        f10 = x11;
                        L = org.telegram.messenger.i0.L(2.0f) + y10;
                    }
                    f11 = Math.min(Math.min(f11, f7), f10);
                    f14 = Math.max(Math.max(f14, f7), f10);
                    f13 = Math.min(Math.min(f13, L), y3);
                    f12 = Math.max(Math.max(f12, L), y3);
                } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                    org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                    if (s0Var.S()) {
                        float x12 = s0Var.getX() + b1Var.getX() + s0Var.getBoundsLeft();
                        float x13 = s0Var.getX() + b1Var.getX() + s0Var.getBoundsRight();
                        float y11 = s0Var.getY() + b1Var.getY();
                        float y12 = s0Var.getY() + b1Var.getY() + s0Var.getMeasuredHeight();
                        f11 = Math.min(Math.min(f11, x12), x13);
                        f14 = Math.max(Math.max(f14, x12), x13);
                        f13 = Math.min(Math.min(f13, y11), y12);
                        f12 = Math.max(Math.max(f12, y11), y12);
                    }
                }
                i10++;
            } else {
                rectF.set(f11, f13, f14, f12);
                return org.telegram.messenger.i0.L(tz.Y0);
            }
        }
    }

    public final void s() {
        c1 c1Var = this.f10056r0;
        c1Var.invalidate();
        for (int i10 = 0; i10 < c1Var.getChildCount(); i10++) {
            c1Var.getChildAt(i10).invalidate();
        }
    }

    public void setupTheme(vh.n5 r8) {
        throw new UnsupportedOperationException("Method not decompiled: jg.j1.setupTheme(vh.n5):void");
    }
}
