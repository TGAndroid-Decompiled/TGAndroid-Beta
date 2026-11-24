package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class u37 extends w44 {
    public int A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public final SparseIntArray E0;
    public final t37 F0;
    public m37 G0;
    public m37 H0;
    public m37 I0;
    public m37 J0;
    public m37 K0;
    public m37 L0;
    public m37 M0;
    public m37 N0;
    public final jp0 s0;
    public final o37 t0;
    public final ArrayList u0;
    public final f47 v0;
    public boolean w0;
    public boolean x0;
    public TextureView y0;
    public boolean z0;

    public u37(Context context, PointF pointF, ArrayList arrayList, sm0 sm0Var, boolean z, n10 n10Var) {
        super(context, pointF);
        vt4 vt4Var;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean C;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.u0 = new ArrayList();
        this.A0 = 1;
        this.B0 = 1;
        this.C0 = true;
        this.D0 = cmb.I.o();
        this.E0 = new SparseIntArray();
        pv7 pv7Var = (pv7) this;
        this.F0 = new t37(pv7Var);
        setRotation(0.0f);
        setScale(1.0f);
        for (int i = 0; i < arrayList.size(); i++) {
            k47 k47Var = (k47) arrayList.get(i);
            TLRPC.Message message2 = k47Var.k;
            int i2 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                C = g6b.C(k47Var);
                if (C != null && C.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i3 = k47Var.K1;
                k47 k47Var2 = new k47(i3, message, k47Var.C, oc7.r1(i3).d, oc7.r1(k47Var.K1).b, null, null, true, true, 0L, true, z, false, 0);
                k47Var2.K5();
                this.u0.add(k47Var2);
            }
            tL_messageService.id = message2.id;
            tL_messageService.from_id = message2.from_id;
            tL_messageService.peer_id = message2.peer_id;
            tL_messageService.date = message2.date;
            tL_messageService.expire_date = message2.expire_date;
            tL_messageService.action = message2.action;
            tL_messageService.message = message2.message;
            tL_messageService.media = message2.media;
            tL_messageService.flags = message2.flags;
            tL_messageService.flags2 = message2.flags2;
            tL_messageService.rich_message = message2.rich_message;
            tL_messageService.translatedRichMessage = message2.translatedRichMessage;
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
            C = g6b.C(k47Var);
            if (C != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i32 = k47Var.K1;
            k47 k47Var22 = new k47(i32, message, k47Var.C, oc7.r1(i32).d, oc7.r1(k47Var.K1).b, null, null, true, true, 0L, true, z, false, 0);
            k47Var22.K5();
            this.u0.add(k47Var22);
        }
        this.v0 = null;
        if (this.u0.size() > 1) {
            f47 f47Var = new f47();
            this.v0 = f47Var;
            f47Var.d.addAll(this.u0);
            f47Var.a = ((k47) this.u0.get(0)).c1();
            f47Var.a();
        }
        jp0 jp0Var = new jp0(pv7Var, context);
        this.s0 = jp0Var;
        addView(jp0Var, qoe.c(-1.0f, -1));
        o37 o37Var = new o37(pv7Var, context, this.F0);
        this.t0 = o37Var;
        o37Var.setAdapter(new r37(pv7Var, context, sm0Var, n10Var, z));
        s37 s37Var = new s37(pv7Var, (byte) 0);
        s37Var.O = new zr1(pv7Var, (byte) 8);
        o37Var.setLayoutManager(s37Var);
        o37Var.i(new as1((byte) 8));
        jp0Var.addView(o37Var, qoe.c(-1.0f, -1));
        if (n10Var != null && n10Var.g) {
            sk3 sk3Var = new sk3(pv7Var, (byte) 26);
            vt4 vt4Var2 = new vt4(pv7Var, (byte) 17);
            n10Var.b = sk3Var;
            n10Var.c = vt4Var2;
            TextureView textureView = (TextureView) n10Var.a;
            if (textureView != null) {
                sk3Var.a(textureView);
            }
            if (n10Var.d && (vt4Var = (vt4) n10Var.c) != null) {
                vt4Var.a(Integer.valueOf(n10Var.e), Integer.valueOf(n10Var.f));
            }
        }
        k();
    }

    public rc2 getCell() {
        o37 o37Var = this.t0;
        if (o37Var != null) {
            for (int i = 0; i < o37Var.getChildCount(); i++) {
                if (o37Var.getChildAt(i) instanceof rc2) {
                    return (rc2) o37Var.getChildAt(i);
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final v44 a() {
        return new n66(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public o49 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new o49(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - gm.L(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - gm.L(35.5f), (getScale() * getMeasuredWidth() * scaleX) + gm.L(71.0f), (getScale() * getMeasuredHeight() * scaleX) + gm.L(71.0f));
    }

    @Override
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.x0) {
            s();
        }
    }

    @Override
    public final void onMeasure(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u37.onMeasure(int, int):void");
    }

    public final float r(RectF rectF) {
        float y;
        float f;
        float f2;
        float L;
        float f3 = 2.1474836E9f;
        float f4 = -2.1474836E9f;
        int i = 0;
        float f5 = 2.1474836E9f;
        float f6 = -2.1474836E9f;
        while (true) {
            o37 o37Var = this.t0;
            if (i < o37Var.getChildCount()) {
                View childAt = o37Var.getChildAt(i);
                boolean z = childAt instanceof rc2;
                jp0 jp0Var = this.s0;
                if (z) {
                    rc2 rc2Var = (rc2) childAt;
                    if (rc2Var.getMessageObject() != null && rc2Var.getMessageObject().g4() && rc2Var.getPhotoImage() != null) {
                        f = rc2Var.getX() + jp0Var.getX() + rc2Var.getPhotoImage().L0;
                        f2 = rc2Var.getPhotoImage().w() + rc2Var.getX() + jp0Var.getX();
                        L = rc2Var.getY() + jp0Var.getY() + rc2Var.getPhotoImage().M0;
                        y = rc2Var.getPhotoImage().x() + rc2Var.getY() + jp0Var.getY();
                    } else {
                        float x = childAt.getX() + jp0Var.getX() + rc2Var.getBackgroundDrawableLeft() + gm.L(1.0f);
                        if (this.v0 == null) {
                            x += gm.L(8.0f);
                        }
                        float x2 = ((childAt.getX() + jp0Var.getX()) + rc2Var.getBackgroundDrawableRight()) - gm.L(1.66f);
                        float y2 = childAt.getY() + jp0Var.getY() + rc2Var.getBackgroundDrawableTop();
                        y = ((childAt.getY() + jp0Var.getY()) + rc2Var.getBackgroundDrawableBottom()) - gm.L(1.0f);
                        f = x;
                        f2 = x2;
                        L = gm.L(2.0f) + y2;
                    }
                    f3 = Math.min(Math.min(f3, f), f2);
                    f6 = Math.max(Math.max(f6, f), f2);
                    f5 = Math.min(Math.min(f5, L), y);
                    f4 = Math.max(Math.max(f4, L), y);
                } else if (childAt instanceof cm1) {
                    cm1 cm1Var = (cm1) childAt;
                    if (cm1Var.R()) {
                        float x3 = cm1Var.getX() + jp0Var.getX() + cm1Var.getBoundsLeft();
                        float x4 = cm1Var.getX() + jp0Var.getX() + cm1Var.getBoundsRight();
                        float y3 = cm1Var.getY() + jp0Var.getY();
                        float y4 = cm1Var.getY() + jp0Var.getY() + cm1Var.getMeasuredHeight();
                        f3 = Math.min(Math.min(f3, x3), x4);
                        f6 = Math.max(Math.max(f6, x3), x4);
                        f5 = Math.min(Math.min(f5, y3), y4);
                        f4 = Math.max(Math.max(f4, y3), y4);
                    }
                }
                i++;
            } else {
                rectF.set(f3, f5, f6, f4);
                return gm.L(gda.U0);
            }
        }
    }

    public final void s() {
        o37 o37Var = this.t0;
        o37Var.invalidate();
        for (int i = 0; i < o37Var.getChildCount(); i++) {
            o37Var.getChildAt(i).invalidate();
        }
    }

    public void setupTheme(defpackage.g6b r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u37.setupTheme(g6b):void");
    }
}
