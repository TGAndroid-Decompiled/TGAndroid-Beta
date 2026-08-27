package hh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

public final class jb extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public long A;
    public long B;
    public final jh.s0 C;
    public final jh.n0 D;
    public final bp E;
    public final ag.k F;
    public final MessageObject G;
    public final ArrayList H;
    public final b I;
    public jh.g2 J;
    public int K;
    public h3.x L;
    public final cq[] M;
    public boolean N;
    public boolean O;
    public rn P;
    public View Q;
    public ValueAnimator R;

    public final org.telegram.ui.ActionBar.c6 f9556b;

    public final int f9557c;
    public final boolean d;

    public final boolean f9558e;

    public final LinearLayout f9559f;
    public final FrameLayout h;

    public final LinearLayout f9560n;

    public final va f9561r;

    public final FrameLayout f9562s;
    public final FrameLayout v;

    public final org.telegram.ui.Components.n9 f9563w;

    public final lh.d f9564x;

    public final ib f9565y;

    public jb(android.content.Context r38, int r39, long r40, org.telegram.ui.rn r42, org.telegram.messenger.MessageObject r43, java.util.ArrayList r44, boolean r45, boolean r46, long r47, org.telegram.ui.ActionBar.c6 r49) {
        throw new UnsupportedOperationException("Method not decompiled: hh.jb.<init>(android.content.Context, int, long, org.telegram.ui.rn, org.telegram.messenger.MessageObject, java.util.ArrayList, boolean, boolean, long, org.telegram.ui.ActionBar.c6):void");
    }

    public static void m(jb jbVar, int i10, org.telegram.ui.ActionBar.c6 c6Var, long j10, boolean z10) {
        long j11;
        jb jbVar2 = jbVar;
        c0 c0VarG = c0.g(i10);
        c0VarG.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = c0VarG.f9058l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        b70 b70VarF = b70.F(jbVar2.containerView, c6Var, jbVar2.v);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject instanceof TLRPC.User) {
                j11 = ((TLRPC.User) tLObject).f22527id;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        j11 = -chat.f22380id;
                    }
                } else {
                    jbVar2 = jbVar;
                }
                i11 = i12;
            }
            if (j11 != j10) {
                long j12 = jbVar2.A;
                b70VarF.g(tLObject, j11 == j12 || (j12 == 0 && j11 == UserConfig.getInstance(i10).getClientUserId()), new ua(jbVar2, j11, z10, 0));
                jbVar2 = jbVar;
            }
            i11 = i12;
        }
        b70VarF.f26993t = false;
        b70VarF.Y = true;
        b70VarF.f26992s = 0;
        b70VarF.V(5);
        b70VarF.Z();
    }

    @Override
    public final void appendOpenAnimator(boolean z10, ArrayList arrayList) {
        Property property = View.ALPHA;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        b bVar = this.I;
        arrayList.add(ObjectAnimator.ofFloat(bVar, (Property<b, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(bVar, (Property<b, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(bVar, (Property<b, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f9561r.f9354g0) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.adminedChannelsLoaded) {
            r(true);
        }
    }

    @Override
    public final void dismiss() {
        Long myPaidReactionPeer;
        if (!this.N && !this.O) {
            this.O = true;
            MessageObject messageObject = this.G;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.A)) {
                messageObject.setMyPaidReactionDialogId(this.A);
                o7 o7VarB = o7.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.f9557c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j10 = o7VarB.f9840a;
                int i11 = o7VarB.f9841b;
                tL_messages_togglePaidReactionPrivacy.peer = messagesController.getInputPeer(j10);
                tL_messages_togglePaidReactionPrivacy.msg_id = i11;
                long j11 = this.A;
                if (j11 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j11 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = MessagesController.getInstance(i10).getInputPeer(this.A);
                }
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(o7VarB.f9840a), Integer.valueOf(i11), Long.valueOf(this.A));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new cf.a(this, 10));
            }
        }
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.dismissInternal();
        }
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        b bVar = this.I;
        if (f10 < bVar.getX() || f10 > bVar.getX() + bVar.getWidth() || f11 < bVar.getY() || f11 > bVar.getY() + bVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f9557c).addObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f9557c).removeObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    public final void p(final r7 r7Var) {
        View view;
        ig.r0 r0Var;
        jh.g2 g2Var;
        View view2;
        ig.r0 r0Var2;
        ig.o0 o0VarM;
        ig.o0 o0VarM2 = null;
        MessageObject messageObject = null;
        if (this.G != null && (view2 = this.P.fragmentView) != null && view2.isAttachedToWindow()) {
            View viewQ8 = this.Q;
            if (viewQ8 instanceof org.telegram.ui.Cells.s1) {
                r0Var2 = ((org.telegram.ui.Cells.s1) viewQ8).J;
                r0Var2.getClass();
                o0VarM = r0Var2.m("stars");
            } else if (viewQ8 instanceof org.telegram.ui.Cells.v0) {
                r0Var2 = ((org.telegram.ui.Cells.v0) viewQ8).f25785y0;
                r0Var2.getClass();
                o0VarM = r0Var2.m("stars");
            } else {
                r0Var2 = null;
                o0VarM = null;
            }
            if (o0VarM != null || r0Var2 == null) {
                o0VarM2 = o0VarM;
            } else {
                MessageObject.GroupedMessages groupedMessagesX8 = this.P.X8(this.G);
                if (groupedMessagesX8 != null && !groupedMessagesX8.posArray.isEmpty()) {
                    ArrayList<MessageObject> arrayList = groupedMessagesX8.messages;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        MessageObject messageObject2 = arrayList.get(i10);
                        i10++;
                        MessageObject messageObject3 = messageObject2;
                        MessageObject.GroupedMessagePosition position = groupedMessagesX8.getPosition(messageObject3);
                        if (position != null) {
                            int i11 = position.flags;
                            if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                messageObject = messageObject3;
                                break;
                            }
                        }
                    }
                    if (messageObject != null) {
                        viewQ8 = this.P.q8(messageObject.getId(), false);
                    }
                }
                if (viewQ8 == null) {
                    return;
                }
                if (viewQ8 instanceof org.telegram.ui.Cells.s1) {
                    ig.r0 r0Var3 = ((org.telegram.ui.Cells.s1) viewQ8).J;
                    r0Var3.getClass();
                    r0Var2 = r0Var3;
                    o0VarM2 = r0Var3.m("stars");
                } else {
                    o0VarM2 = o0VarM;
                }
            }
            if (o0VarM2 == null) {
                return;
            }
            r0Var = r0Var2;
            view = viewQ8;
        } else {
            if (this.J == null) {
                return;
            }
            view = null;
            r0Var = null;
        }
        View view3 = view;
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        this.f9561r.getLocationInWindow(iArr);
        rectF.set(this.f9561r.C.getBounds());
        rectF.inset(-AndroidUtilities.dp(3.5f), -AndroidUtilities.dp(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        ag.k kVar = this.F;
        pa paVar = new pa(this, 2);
        if (kVar.L) {
            paVar.run();
        } else {
            kVar.M = paVar;
        }
        if (o0VarM2 != null) {
            o0VarM2.f11393l = false;
        }
        if (view3 != null) {
            view3.invalidate();
        }
        jh.n0[] n0VarArr = new jh.n0[1];
        if (this.d && (g2Var = this.J) != null) {
            n0VarArr[0] = g2Var.d(this.K);
        }
        ig.o0 o0Var = o0VarM2;
        final RectF rectF2 = new RectF();
        final cg.h0 h0Var = new cg.h0(this, n0VarArr, iArr, rectF2, view3, r0Var, o0Var, 5);
        h0Var.run();
        this.F.setPaused(false);
        this.F.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        this.F.setTranslationX(rectF3.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
        this.F.setTranslationY(rectF3.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
        this.F.setScaleX(rectF3.width() / AndroidUtilities.dp(150.0f));
        this.F.setScaleY(rectF3.height() / AndroidUtilities.dp(150.0f));
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                h0Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                AndroidUtilities.lerp(rectF4, rectF5, fFloatValue, rectF6);
                jb jbVar = this.f9943a;
                ag.k kVar2 = jbVar.F;
                kVar2.setTranslationX(rectF6.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
                kVar2.setTranslationY(rectF6.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
                float fLerp = AndroidUtilities.lerp(Math.max(rectF6.width() / AndroidUtilities.dp(150.0f), rectF6.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(((double) fFloatValue) * 3.141592653589793d));
                kVar2.setScaleX(fLerp);
                kVar2.setScaleY(fLerp);
                bg.a aVar = kVar2.f2129b;
                aVar.d = 360.0f * fFloatValue;
                aVar.h = Math.max(0.0f, 1.0f - (4.0f * fFloatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || fFloatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    jbVar.container.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                Runnable runnable = r7Var;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.R.addListener(new za(this, o0Var, view3, n0VarArr, zArr, rectF2, r7Var));
        this.R.setDuration(800L);
        this.R.setInterpolator(new f2.b0(3));
        this.R.start();
    }

    public final boolean q() {
        if (!this.d) {
            c0 c0VarG = c0.g(this.f9557c);
            c0VarG.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = c0VarG.f9058l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if ((obj instanceof TLRPC.Chat) && ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void r(boolean z10) {
        FrameLayout frameLayout = this.f9562s;
        if ((frameLayout.getVisibility() == 0) != q()) {
            frameLayout.setVisibility(q() ? 0 : 8);
            if (z10) {
                if (q()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.f9560n, changeBounds);
            }
        }
    }

    public final void s() {
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.f34858p = 0.42f;
        long j10 = this.A;
        org.telegram.ui.Components.n9 n9Var = this.f9563w;
        if (j10 == 2666000) {
            y8Var.g(21);
            int i10 = org.telegram.ui.ActionBar.g6.f23038c8;
            org.telegram.ui.ActionBar.c6 c6Var = this.f9556b;
            y8Var.i(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            n9Var.e(null, y8Var);
            return;
        }
        int i11 = this.f9557c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.A));
            y8Var.r(user);
            n9Var.e(user, y8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-this.A));
            y8Var.q(chat);
            n9Var.e(chat, y8Var);
        }
    }

    public final void t(long j10) {
        ib ibVar;
        long j11;
        long j12;
        long j13 = 0;
        if ((!this.d || this.f9558e || j10 <= 0) && (ibVar = this.f9565y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.f9557c).getClientUserId();
            int i10 = 1;
            ArrayList arrayList2 = this.H;
            if (arrayList2 != null) {
                j12 = 0;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i11);
                    long peerDialogId = DialogObject.getPeerDialogId(messageReactor.peer_id);
                    long j14 = j13;
                    boolean z10 = messageReactor.anonymous;
                    if (z10) {
                        peerDialogId = messageReactor.my ? clientUserId : (-i11) - i10;
                    }
                    if (messageReactor.my || peerDialogId == clientUserId) {
                        j12 = messageReactor.count;
                    } else {
                        long j15 = messageReactor.count;
                        cb cbVar = new cb();
                        cbVar.f9105a = z10;
                        cbVar.f9106b = false;
                        cbVar.f9107c = peerDialogId;
                        cbVar.d = j15;
                        arrayList.add(cbVar);
                    }
                    i11++;
                    j13 = j14;
                    i10 = 1;
                }
                j11 = j13;
            } else {
                j11 = 0;
                j12 = 0;
            }
            long j16 = j12 + j10;
            if (j16 > j11) {
                boolean z11 = this.A == 2666000;
                cb cbVar2 = new cb();
                cbVar2.f9105a = z11;
                cbVar2.f9106b = true;
                cbVar2.f9107c = clientUserId;
                cbVar2.d = j16;
                arrayList.add(cbVar2);
            }
            Collections.sort(arrayList, new a5.f(20));
            ibVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}
