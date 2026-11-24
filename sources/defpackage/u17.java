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
public abstract class u17 extends l34 {
    public int A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public final SparseIntArray E0;
    public final t17 F0;
    public m17 G0;
    public m17 H0;
    public m17 I0;
    public m17 J0;
    public m17 K0;
    public m17 L0;
    public m17 M0;
    public m17 N0;
    public final jo0 s0;
    public final o17 t0;
    public final ArrayList u0;
    public final f27 v0;
    public boolean w0;
    public boolean x0;
    public TextureView y0;
    public boolean z0;

    public u17(Context context, PointF pointF, ArrayList arrayList, sl0 sl0Var, boolean z, n00 n00Var) {
        super(context, pointF);
        ur4 ur4Var;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean C;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.u0 = new ArrayList();
        this.A0 = 1;
        this.B0 = 1;
        this.C0 = true;
        this.D0 = bkb.I.o();
        this.E0 = new SparseIntArray();
        ot7 ot7Var = (ot7) this;
        this.F0 = new t17(ot7Var);
        setRotation(0.0f);
        setScale(1.0f);
        for (int i = 0; i < arrayList.size(); i++) {
            k27 k27Var = (k27) arrayList.get(i);
            TLRPC.Message message2 = k27Var.k;
            int i2 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                C = f4b.C(k27Var);
                if (C != null && C.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i3 = k27Var.K1;
                k27 k27Var2 = new k27(i3, message, k27Var.C, na7.q1(i3).d, na7.q1(k27Var.K1).b, null, null, true, true, 0L, true, z, false, 0);
                k27Var2.K5();
                this.u0.add(k27Var2);
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
            C = f4b.C(k27Var);
            if (C != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i32 = k27Var.K1;
            k27 k27Var22 = new k27(i32, message, k27Var.C, na7.q1(i32).d, na7.q1(k27Var.K1).b, null, null, true, true, 0L, true, z, false, 0);
            k27Var22.K5();
            this.u0.add(k27Var22);
        }
        this.v0 = null;
        if (this.u0.size() > 1) {
            f27 f27Var = new f27();
            this.v0 = f27Var;
            f27Var.d.addAll(this.u0);
            f27Var.a = ((k27) this.u0.get(0)).c1();
            f27Var.a();
        }
        jo0 jo0Var = new jo0(ot7Var, context);
        this.s0 = jo0Var;
        addView(jo0Var, nme.c(-1.0f, -1));
        o17 o17Var = new o17(ot7Var, context, this.F0);
        this.t0 = o17Var;
        o17Var.setAdapter(new r17(ot7Var, context, sl0Var, n00Var, z));
        s17 s17Var = new s17(ot7Var, (byte) 0);
        s17Var.O = new nq1(ot7Var, (byte) 8);
        o17Var.setLayoutManager(s17Var);
        o17Var.i(new oq1((byte) 8));
        jo0Var.addView(o17Var, nme.c(-1.0f, -1));
        if (n00Var != null && n00Var.g) {
            hj3 hj3Var = new hj3(ot7Var, (byte) 26);
            ur4 ur4Var2 = new ur4(ot7Var, (byte) 17);
            n00Var.b = hj3Var;
            n00Var.c = ur4Var2;
            TextureView textureView = (TextureView) n00Var.a;
            if (textureView != null) {
                hj3Var.a(textureView);
            }
            if (n00Var.d && (ur4Var = (ur4) n00Var.c) != null) {
                ur4Var.a(Integer.valueOf(n00Var.e), Integer.valueOf(n00Var.f));
            }
        }
        k();
    }

    public gb2 getCell() {
        o17 o17Var = this.t0;
        if (o17Var != null) {
            for (int i = 0; i < o17Var.getChildCount(); i++) {
                if (o17Var.getChildAt(i) instanceof gb2) {
                    return (gb2) o17Var.getChildAt(i);
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final k34 a() {
        return new n46(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public l29 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new l29(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - gl.L(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - gl.L(35.5f), (getScale() * getMeasuredWidth() * scaleX) + gl.L(71.0f), (getScale() * getMeasuredHeight() * scaleX) + gl.L(71.0f));
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u17.onMeasure(int, int):void");
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
            o17 o17Var = this.t0;
            if (i < o17Var.getChildCount()) {
                View childAt = o17Var.getChildAt(i);
                boolean z = childAt instanceof gb2;
                jo0 jo0Var = this.s0;
                if (z) {
                    gb2 gb2Var = (gb2) childAt;
                    if (gb2Var.getMessageObject() != null && gb2Var.getMessageObject().g4() && gb2Var.getPhotoImage() != null) {
                        f = gb2Var.getX() + jo0Var.getX() + gb2Var.getPhotoImage().L0;
                        f2 = gb2Var.getPhotoImage().w() + gb2Var.getX() + jo0Var.getX();
                        L = gb2Var.getY() + jo0Var.getY() + gb2Var.getPhotoImage().M0;
                        y = gb2Var.getPhotoImage().x() + gb2Var.getY() + jo0Var.getY();
                    } else {
                        float x = childAt.getX() + jo0Var.getX() + gb2Var.getBackgroundDrawableLeft() + gl.L(1.0f);
                        if (this.v0 == null) {
                            x += gl.L(8.0f);
                        }
                        float x2 = ((childAt.getX() + jo0Var.getX()) + gb2Var.getBackgroundDrawableRight()) - gl.L(1.66f);
                        float y2 = childAt.getY() + jo0Var.getY() + gb2Var.getBackgroundDrawableTop();
                        y = ((childAt.getY() + jo0Var.getY()) + gb2Var.getBackgroundDrawableBottom()) - gl.L(1.0f);
                        f = x;
                        f2 = x2;
                        L = gl.L(2.0f) + y2;
                    }
                    f3 = Math.min(Math.min(f3, f), f2);
                    f6 = Math.max(Math.max(f6, f), f2);
                    f5 = Math.min(Math.min(f5, L), y);
                    f4 = Math.max(Math.max(f4, L), y);
                } else if (childAt instanceof uk1) {
                    uk1 uk1Var = (uk1) childAt;
                    if (uk1Var.U()) {
                        float x3 = uk1Var.getX() + jo0Var.getX() + uk1Var.getBoundsLeft();
                        float x4 = uk1Var.getX() + jo0Var.getX() + uk1Var.getBoundsRight();
                        float y3 = uk1Var.getY() + jo0Var.getY();
                        float y4 = uk1Var.getY() + jo0Var.getY() + uk1Var.getMeasuredHeight();
                        f3 = Math.min(Math.min(f3, x3), x4);
                        f6 = Math.max(Math.max(f6, x3), x4);
                        f5 = Math.min(Math.min(f5, y3), y4);
                        f4 = Math.max(Math.max(f4, y3), y4);
                    }
                }
                i++;
            } else {
                rectF.set(f3, f5, f6, f4);
                return gl.L(gba.V0);
            }
        }
    }

    public final void s() {
        o17 o17Var = this.t0;
        o17Var.invalidate();
        for (int i = 0; i < o17Var.getChildCount(); i++) {
            o17Var.getChildAt(i).invalidate();
        }
    }

    public void setupTheme(defpackage.f4b r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u17.setupTheme(f4b):void");
    }
}
