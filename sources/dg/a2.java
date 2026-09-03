package dg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.rk0;
import ph.j5;
import ph.o4;
import ph.t6;
public abstract class a2 extends j {
    public final a9.a A0;
    public g5 B0;
    public g5 C0;
    public g5 D0;
    public g5 E0;
    public g5 F0;
    public g5 G0;
    public g5 H0;
    public g5 I0;
    public final s1 f4356n0;
    public final t1 f4357o0;
    public final ArrayList f4358p0;
    public final MessageObject.GroupedMessages f4359q0;
    public boolean f4360r0;
    public boolean f4361s0;
    public TextureView f4362t0;
    public boolean f4363u0;
    public int f4364v0;
    public int f4365w0;
    public boolean f4366x0;
    public boolean f4367y0;
    public final SparseIntArray f4368z0;

    public a2(Context context, PointF pointF, ArrayList arrayList, ba baVar, boolean z4, j5 j5Var) {
        super(context, pointF);
        r1 r1Var;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.f4358p0 = new ArrayList();
        this.f4364v0 = 1;
        this.f4365w0 = 1;
        this.f4366x0 = true;
        this.f4367y0 = j6.I.q();
        this.f4368z0 = new SparseIntArray();
        o4 o4Var = (o4) this;
        ?? obj = new Object();
        obj.f145f = o4Var;
        TextPaint textPaint = new TextPaint();
        obj.f142a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        obj.f143b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        obj.f144c = textPaint3;
        new Paint(3);
        obj.d = new Paint(3);
        Paint paint = new Paint(3);
        obj.e = paint;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
        this.A0 = obj;
        setRotation(0.0f);
        setScale(1.0f);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            TLRPC.Message message2 = messageObject.messageOwner;
            int i11 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                D = t6.D(messageObject);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i12 = messageObject.currentAccount;
                MessageObject messageObject2 = new MessageObject(i12, message, messageObject.replyMessageObject, MessagesController.getInstance(i12).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z4, false);
                messageObject2.setType();
                this.f4358p0.add(messageObject2);
            }
            tL_messageService.f19180id = message2.f19180id;
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
            D = t6.D(messageObject);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i122 = messageObject.currentAccount;
            MessageObject messageObject22 = new MessageObject(i122, message, messageObject.replyMessageObject, MessagesController.getInstance(i122).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z4, false);
            messageObject22.setType();
            this.f4358p0.add(messageObject22);
        }
        this.f4359q0 = null;
        if (this.f4358p0.size() > 1) {
            MessageObject.GroupedMessages groupedMessages = new MessageObject.GroupedMessages();
            this.f4359q0 = groupedMessages;
            groupedMessages.messages.addAll(this.f4358p0);
            groupedMessages.groupId = ((MessageObject) this.f4358p0.get(0)).getGroupId();
            groupedMessages.calculate();
        }
        s1 s1Var = new s1(o4Var, context);
        this.f4356n0 = s1Var;
        addView(s1Var, b6.c(-1.0f, -1));
        t1 t1Var = new t1(o4Var, context, this.A0);
        this.f4357o0 = t1Var;
        t1Var.setAdapter(new w1(o4Var, context, baVar, j5Var, z4));
        x1 x1Var = new x1(o4Var);
        x1Var.O = new y1(o4Var);
        t1Var.setLayoutManager(x1Var);
        t1Var.i(new Object());
        s1Var.addView(t1Var, b6.c(-1.0f, -1));
        if (j5Var != null && j5Var.f41818g) {
            cg.h0 h0Var = new cg.h0(o4Var, 2);
            r1 r1Var2 = new r1(o4Var, 0);
            j5Var.f41815b = h0Var;
            j5Var.f41816c = r1Var2;
            TextureView textureView = j5Var.f41814a;
            if (textureView != null) {
                h0Var.run(textureView);
            }
            if (j5Var.d && (r1Var = j5Var.f41816c) != null) {
                r1Var.run(Integer.valueOf(j5Var.e), Integer.valueOf(j5Var.f41817f));
            }
        }
        k();
    }

    public org.telegram.ui.Cells.s1 getCell() {
        t1 t1Var = this.f4357o0;
        if (t1Var != null) {
            for (int i10 = 0; i10 < t1Var.getChildCount(); i10++) {
                if (t1Var.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                    return (org.telegram.ui.Cells.s1) t1Var.getChildAt(i10);
                }
            }
            return null;
        }
        return null;
    }

    public static org.telegram.ui.Cells.s1 q(o4 o4Var) {
        return o4Var.getCell();
    }

    @Override
    public final i a() {
        return new h1(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    @Override
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        return new rk0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), (getScale() * getMeasuredWidth() * scaleX) + AndroidUtilities.dp(71.0f), (getScale() * getMeasuredHeight() * scaleX) + AndroidUtilities.dp(71.0f));
    }

    @Override
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.f4361s0) {
            s();
        }
    }

    @Override
    public final void onMeasure(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: dg.a2.onMeasure(int, int):void");
    }

    public final float r(RectF rectF) {
        float y10;
        float f10;
        float f11;
        float dp;
        float f12 = 2.1474836E9f;
        float f13 = 2.1474836E9f;
        float f14 = -2.1474836E9f;
        float f15 = -2.1474836E9f;
        int i10 = 0;
        while (true) {
            t1 t1Var = this.f4357o0;
            if (i10 < t1Var.getChildCount()) {
                View childAt = t1Var.getChildAt(i10);
                boolean z4 = childAt instanceof org.telegram.ui.Cells.s1;
                s1 s1Var = this.f4356n0;
                if (z4) {
                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var2.getMessageObject() != null && s1Var2.getMessageObject().isRoundVideo() && s1Var2.getPhotoImage() != null) {
                        f10 = s1Var2.getPhotoImage().getImageX() + s1Var2.getX() + s1Var.getX();
                        f11 = s1Var2.getPhotoImage().getImageX2() + s1Var2.getX() + s1Var.getX();
                        dp = s1Var2.getPhotoImage().getImageY() + s1Var2.getY() + s1Var.getY();
                        float y11 = s1Var.getY();
                        y10 = s1Var2.getPhotoImage().getImageY2() + s1Var2.getY() + y11;
                    } else {
                        float x10 = childAt.getX() + s1Var.getX() + s1Var2.getBackgroundDrawableLeft() + AndroidUtilities.dp(1.0f);
                        if (this.f4359q0 == null) {
                            x10 += AndroidUtilities.dp(8.0f);
                        }
                        float x11 = ((childAt.getX() + s1Var.getX()) + s1Var2.getBackgroundDrawableRight()) - AndroidUtilities.dp(1.66f);
                        float y12 = childAt.getY() + s1Var.getY() + s1Var2.getBackgroundDrawableTop();
                        y10 = ((childAt.getY() + s1Var.getY()) + s1Var2.getBackgroundDrawableBottom()) - AndroidUtilities.dp(1.0f);
                        f10 = x10;
                        f11 = x11;
                        dp = AndroidUtilities.dp(2.0f) + y12;
                    }
                    f12 = Math.min(Math.min(f12, f10), f11);
                    f14 = Math.max(Math.max(f14, f10), f11);
                    f13 = Math.min(Math.min(f13, dp), y10);
                    f15 = Math.max(Math.max(f15, dp), y10);
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.C0.d()) {
                        float x12 = v0Var.getX() + s1Var.getX() + v0Var.getBoundsLeft();
                        float x13 = v0Var.getX() + s1Var.getX() + v0Var.getBoundsRight();
                        float y13 = v0Var.getY() + s1Var.getY();
                        float y14 = v0Var.getY() + s1Var.getY() + v0Var.getMeasuredHeight();
                        f12 = Math.min(Math.min(f12, x12), x13);
                        f14 = Math.max(Math.max(f14, x12), x13);
                        f13 = Math.min(Math.min(f13, y13), y14);
                        f15 = Math.max(Math.max(f15, y13), y14);
                    }
                }
                i10++;
            } else {
                rectF.set(f12, f13, f14, f15);
                return AndroidUtilities.dp(SharedConfig.bubbleRadius);
            }
        }
    }

    public final void s() {
        t1 t1Var = this.f4357o0;
        t1Var.invalidate();
        for (int i10 = 0; i10 < t1Var.getChildCount(); i10++) {
            t1Var.getChildAt(i10).invalidate();
        }
    }

    public void setupTheme(ph.t6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: dg.a2.setupTheme(ph.t6):void");
    }
}
