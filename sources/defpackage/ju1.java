package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;
public final class ju1 implements uz1 {
    public int a;
    public final yv1 b;

    public ju1(yv1 yv1Var) {
        this.b = yv1Var;
    }

    @Override
    public final void A1() {
        int indexOfChild;
        int i;
        yv1 yv1Var = this.b;
        if (yv1Var.getParentActivity() != null) {
            if ((yv1Var.e != null || yv1Var.s8 != null) && yv1Var.fragmentView != null) {
                hg5 hg5Var = yv1Var.u2;
                if ((hg5Var == null || !hg5Var.W) && (indexOfChild = yv1Var.m1.indexOfChild(yv1Var.U)) != -1) {
                    try {
                        yv1Var.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    hg5 hg5Var2 = yv1Var.u2;
                    if (hg5Var2 == null) {
                        hg5Var2 = yv1Var.x4(310.0f, 3, indexOfChild + 1, false);
                        yv1Var.u2 = hg5Var2;
                    }
                    TLRPC.UserFull userFull = yv1Var.s8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        if (yv1Var.a0.d1) {
                            i = 2131743281;
                        } else {
                            i = 2131743204;
                        }
                        hg5Var2.t(gm.S2(jb6.a0(null, null, i, yv1Var.f.first_name)));
                    } else if (!sd2.v(yv1Var.e) && !sd2.s(yv1Var.e)) {
                        if (!yv1Var.W4()) {
                            boolean z = yv1Var.a0.d1;
                            hg5 hg5Var3 = yv1Var.u2;
                            TLRPC.Chat chat = yv1Var.e;
                            if (z) {
                                hg5Var3.t(sd2.L(21, chat));
                            } else {
                                hg5Var3.t(sd2.L(20, chat));
                            }
                        } else {
                            return;
                        }
                    } else if (sd2.P(20, yv1Var.e)) {
                        yv1Var.u2.t(jb6.M0(2131749311, null));
                    } else if (sd2.P(21, yv1Var.e)) {
                        yv1Var.u2.t(jb6.M0(2131749314, null));
                    } else if (sd2.P(7, yv1Var.e)) {
                        yv1Var.u2.t(jb6.M0(2131749317, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = yv1Var.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            boolean B1 = gm.B1(tL_chatBannedRights);
                            hg5 hg5Var4 = yv1Var.u2;
                            if (B1) {
                                hg5Var4.t(jb6.M0(2131753920, null));
                            } else {
                                hg5Var4.t(jb6.a0("AttachMediaRestricted", null, 2131753921, jb6.v(yv1Var.e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = yv1Var.a0.getSendButton();
                    View audioVideoButtonContainer = yv1Var.a0.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    yv1Var.u2.x(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void B() {
        boolean z;
        yv1 yv1Var = this.b;
        ms1 ms1Var = yv1Var.a0;
        boolean z2 = ms1Var.p4;
        jz1 jz1Var = ms1Var.V0;
        boolean z3 = false;
        if (jz1Var != null && jz1Var.getCurrentPage() == 0) {
            z = true;
        } else {
            z = false;
        }
        fn0 fn0Var = yv1Var.qd;
        if (z2 && !z) {
            z3 = true;
        }
        fn0Var.a(z3, true);
    }

    @Override
    public final int B0() {
        return this.b.m1.getHeight();
    }

    @Override
    public final void C(boolean z) {
        this.b.zc(false, z);
    }

    @Override
    public final TL_stories.StoryItem C0() {
        return null;
    }

    @Override
    public final boolean E0(long j) {
        return false;
    }

    @Override
    public final void E1(boolean z) {
        yv1 yv1Var = this.b;
        View view = yv1Var.L2;
        if (view != null) {
            view.setVisibility(8);
        }
        yv1Var.t5 = !z;
    }

    @Override
    public final void F1(int i, int i2, int i3, long j, long j2, boolean z) {
        yv1 yv1Var = this.b;
        boolean z2 = false;
        if (yv1Var.q3 == null && CameraView.isCameraAllowed() && yv1Var.getParentActivity() != null) {
            Activity parentActivity = yv1Var.getParentActivity();
            wv1 wv1Var = yv1Var.Ba;
            int i4 = zq5.e;
            q qVar = new q(parentActivity, yv1Var, wv1Var, true);
            yv1Var.q3 = qVar;
            qVar.setAnimationCallback(new gm1(yv1Var, (byte) 0));
            yv1Var.q3.setTrimCallback(new gm1(yv1Var, (byte) 1));
            yv1Var.q3.setRecordingUiFrameCallback(new ni6(yv1Var, (byte) 17));
            yv1Var.q3.setClipToPadding(false);
            q qVar2 = yv1Var.q3;
            km0 km0Var = yv1Var.L;
            jr1 jr1Var = yv1Var.x;
            View view = qVar2.G;
            im0 c = km0Var.c(view, jr1Var, false);
            c.q(gm.L(6.0f));
            c.r(gm.L(21.0f));
            view.setBackground(c);
            int indexOfChild = yv1Var.m1.indexOfChild(yv1Var.U);
            if (indexOfChild < 0) {
                indexOfChild = yv1Var.m1.getChildCount();
            }
            yv1Var.m1.addView(yv1Var.q3, Math.min(indexOfChild + 1, yv1Var.m1.getChildCount()), qoe.e(-1, -1, 51));
        }
        q qVar3 = yv1Var.q3;
        if (qVar3 != null) {
            if (i == 0) {
                qVar3.v();
                yv1Var.A0.D0();
                yv1Var.D0.O();
            } else if (i != 1 && i != 3 && i != 4) {
                if (i != 2) {
                    if (i != 5) {
                        return;
                    }
                } else {
                    z2 = true;
                }
                qVar3.f(z2);
            } else {
                qVar3.u(i, i2, i3, j, j2, z);
            }
        }
    }

    @Override
    public final boolean G0() {
        tn9 tn9Var;
        q qVar = this.b.q3;
        if (qVar != null && (tn9Var = qVar.S) != null) {
            int i = tn9Var.a;
            if (i == 4 || i == 5 || i == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void G1() {
        yv1 yv1Var = this.b;
        hg5 hg5Var = yv1Var.v2;
        if (hg5Var != null) {
            hg5Var.f(true);
        }
        hg5 hg5Var2 = yv1Var.x2;
        if (hg5Var2 != null) {
            hg5Var2.f(true);
        }
    }

    @Override
    public final void H0(CharSequence charSequence, boolean z, boolean z2) {
        boolean z3;
        CharSequence charSequence2;
        long j;
        hg5 hg5Var;
        TLRPC.ChatFull chatFull;
        MediaController w = MediaController.w();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z4 = false;
        yv1 yv1Var = this.b;
        if (isEmpty && !yv1Var.a0.Q0()) {
            z3 = false;
        } else {
            z3 = true;
        }
        w.N = z3;
        es1 es1Var = yv1Var.X1;
        if (es1Var != null && es1Var.getAdapter() != null) {
            charSequence2 = charSequence;
            yv1Var.X1.getAdapter().U(charSequence2, yv1Var.a0.getCursorPosition(), yv1Var.M6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        us4 us4Var = yv1Var.b6;
        if (us4Var != null) {
            gm.r(us4Var);
            yv1Var.b6 = null;
        }
        TLRPC.Chat chat = yv1Var.e;
        if (chat == null || sd2.m(chat)) {
            ms1 ms1Var = yv1Var.a0;
            if (ms1Var.O3 && (!ms1Var.Q0() || !yv1Var.a0.Q2)) {
                if (z) {
                    yv1Var.tb(charSequence2, true);
                } else {
                    yv1Var.Z4(charSequence2);
                    us4 us4Var2 = new us4(this, charSequence2, false, (byte) 4);
                    yv1Var.b6 = us4Var2;
                    if (gm.S == null) {
                        j = 3000;
                    } else {
                        j = 1000;
                    }
                    gm.d3(us4Var2, j);
                }
            }
        }
        xs1 xs1Var = yv1Var.Ua;
        if (xs1Var != null) {
            ArrayList arrayList = xs1Var.G;
            for (int i = 0; i < arrayList.size(); i++) {
                ((jw3) arrayList.get(i)).n = true;
            }
        }
        g39 g39Var = g39.B;
        if (g39Var != null) {
            g39Var.l = true;
        }
        g39 g39Var2 = g39.C;
        if (g39Var2 != null) {
            g39Var2.l = true;
        }
        if (!z2) {
            hg5 hg5Var2 = yv1Var.v2;
            if ((hg5Var2 != null && hg5Var2.W) || ((hg5Var = yv1Var.x2) != null && hg5Var.W)) {
                if (hg5Var2 != null) {
                    hg5Var2.f(true);
                }
                hg5 hg5Var3 = yv1Var.x2;
                if (hg5Var3 != null) {
                    hg5Var3.f(true);
                    return;
                }
                return;
            }
            ho1 ho1Var = yv1Var.lb;
            if (m9c.D(yv1Var.f) || ((chatFull = yv1Var.r8) != null && chatFull.slowmode_next_send_date > 0 && yv1Var.g4 == 0)) {
                z4 = true;
            }
            if (!yv1Var.y2 && !yv1Var.w2 && !z4 && gda.L < 3 && !yv1Var.a0.Q0()) {
                gm.r(ho1Var);
                gm.d3(ho1Var, 4000L);
            }
        }
    }

    @Override
    public final void H1() {
        a aVar;
        yv1 yv1Var = this.b;
        aVar = ((d) yv1Var).actionBar;
        if (!aVar.o0) {
            r7 r7Var = yv1Var.j0;
            if (r7Var != null) {
                r7Var.setVisibility(0);
            }
            q6 q6Var = yv1Var.g0;
            if (q6Var != null) {
                q6Var.e(8);
            }
            qr2 qr2Var = yv1Var.f0;
            if (qr2Var != null) {
                qr2Var.b(false);
            }
        }
    }

    @Override
    public final void I() {
        fdb fdbVar = this.b.s1;
        if (fdbVar != null) {
            fdbVar.e();
        }
    }

    @Override
    public final void I0() {
        q qVar = this.b.q3;
        if (qVar != null) {
            qVar.y();
        }
    }

    @Override
    public final nv1 J() {
        return this.b.D5;
    }

    @Override
    public final boolean K0() {
        yv1 yv1Var = this.b;
        TLRPC.User user = yv1Var.f;
        if (user != null && !m9c.D(user) && !yv1Var.f.bot && yv1Var.h == null && yv1Var.g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void L() {
        a aVar;
        yv1 yv1Var = this.b;
        aVar = ((d) yv1Var).actionBar;
        if (!aVar.o0 && !yv1Var.g8() && TextUtils.isEmpty(yv1Var.a0.getSlowModeTimer())) {
            r7 r7Var = yv1Var.j0;
            if (r7Var != null) {
                r7Var.setVisibility(8);
            }
            q6 q6Var = yv1Var.g0;
            if (q6Var != null) {
                q6Var.e(0);
            }
            qr2 qr2Var = yv1Var.f0;
            if (qr2Var != null) {
                qr2Var.b(true);
            }
        }
    }

    @Override
    public final void O0() {
        int i;
        yv1 yv1Var = this.b;
        Activity parentActivity = yv1Var.getParentActivity();
        i = ((d) yv1Var).currentAccount;
        long j = yv1Var.l6;
        v67 v67Var = yv1Var.y5;
        if (v67Var == null) {
            v67Var = v67.a();
        }
        new u67(parentActivity, i, j, v67Var, yv1Var, yv1Var.getResourceProvider(), 0, new qm1(yv1Var, (byte) 9)).show();
    }

    @Override
    public final void R1() {
        yv1 yv1Var = this.b;
        e51 e51Var = yv1Var.Y1;
        if (e51Var != null) {
            e51Var.r1(0, null);
        }
        yv1Var.ma();
    }

    @Override
    public final void W0() {
        this.b.S4();
    }

    @Override
    public final void Y0() {
        boolean z;
        boolean z2;
        int i;
        float f;
        int i2;
        yv1 yv1Var = this.b;
        yv1Var.j5();
        ms1 ms1Var = yv1Var.a0;
        boolean z3 = ms1Var.p4;
        jz1 jz1Var = ms1Var.V0;
        if (jz1Var != null && jz1Var.getCurrentPage() == 0) {
            z = true;
        } else {
            z = false;
        }
        fn0 fn0Var = yv1Var.qd;
        if (z3 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        fn0Var.a(z2, true);
        if (z3) {
            Activity parentActivity = yv1Var.getParentActivity();
            i2 = ((d) yv1Var).classGuid;
            gm.g3(parentActivity, i2);
            u31 u31Var = u31.x;
            if (u31Var != null && u31Var.m) {
                u31Var.b();
            }
        } else {
            Activity parentActivity2 = yv1Var.getParentActivity();
            i = ((d) yv1Var).classGuid;
            gm.V2(parentActivity2, i);
        }
        es1 es1Var = yv1Var.X1;
        float f2 = 0.0f;
        if (es1Var != null) {
            ViewPropertyAnimator animate = es1Var.animate();
            if (!z3 && !yv1Var.isInPreviewMode()) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            animate.alpha(f).setInterpolator(d53.f).start();
        }
        fdb fdbVar = yv1Var.s1;
        if (fdbVar != null) {
            fdbVar.setVisibility(0);
            ViewPropertyAnimator animate2 = yv1Var.s1.animate();
            if (!z3 && !yv1Var.isInPreviewMode()) {
                f2 = 1.0f;
            }
            animate2.alpha(f2).setInterpolator(d53.f).withEndAction(new y8c((byte) 9, this, z3)).start();
        }
    }

    @Override
    public final void a() {
        this.b.dd();
    }

    @Override
    public final void a1(View view, CharSequence charSequence, boolean z) {
        yv1 yv1Var = this.b;
        yv1Var.vc(view, charSequence, z);
        r7 r7Var = yv1Var.j0;
        if (r7Var != null && r7Var.getVisibility() != 0) {
            yv1Var.j0.setVisibility(0);
            q6 q6Var = yv1Var.g0;
            if (q6Var != null) {
                q6Var.e(8);
            }
            qr2 qr2Var = yv1Var.f0;
            if (qr2Var != null) {
                qr2Var.b(false);
            }
        }
    }

    @Override
    public final boolean b0() {
        int i;
        yv1 yv1Var = this.b;
        if ((!yv1Var.getMessagesController().s2(yv1Var.a()) || yv1Var.x4) && (i = yv1Var.g4) != 9 && yv1Var.h4 > 0) {
            if (i != 0) {
                if (i == 3 && yv1Var.f7() == yv1Var.getUserConfig().e()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void c0() {
        yv1 yv1Var = this.b;
        yv1Var.L9 = true;
        hu1 hu1Var = yv1Var.D0;
        if (hu1Var != null) {
            hu1Var.F(true);
        }
    }

    @Override
    public final void c1(CharSequence charSequence) {
        this.b.tb(charSequence, true);
    }

    @Override
    public final boolean d1() {
        m47 m47Var;
        o47 o47Var = this.b.x5;
        if (o47Var != null && (m47Var = o47Var.b) != null && !m47Var.e.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e() {
        fdb fdbVar = this.b.s1;
        if (fdbVar != null) {
            fdbVar.e();
        }
    }

    @Override
    public final void e1() {
        int i;
        long j;
        long j2;
        yv1 yv1Var = this.b;
        i = ((d) yv1Var).currentAccount;
        wq0 b = wq0.b(i);
        long j3 = yv1Var.l6;
        long d = (int) yv1Var.d();
        nl9 nl9Var = b.a;
        LongSparseArray z0 = nl9Var.z0(j3, d);
        if (z0 != null && z0.size() > 0) {
            int size = z0.size();
            rq0 rq0Var = null;
            int i2 = 0;
            long j4 = 0;
            while (true) {
                if (i2 < size) {
                    j4 = z0.keyAt(i2);
                    rq0Var = (rq0) z0.valueAt(i2);
                    j = 0;
                    if (!rq0Var.e) {
                        break;
                    }
                    i2++;
                } else {
                    j = 0;
                    break;
                }
            }
            rq0 rq0Var2 = rq0Var;
            long j5 = j4;
            if (rq0Var2 != null && !rq0Var2.e) {
                Runnable runnable = rq0Var2.f;
                if (runnable != null) {
                    gm.r(runnable);
                }
                b.b.I0(j3, d, j5, new Object());
                if (rq0Var2.d) {
                    rq0Var2.e = true;
                    j2 = j5;
                } else {
                    nl9Var.J0(j3, d, j5);
                    j2 = j5;
                    nm7 notificationCenter = b.getNotificationCenter();
                    sq0 sq0Var = new sq0(j3, rq0Var2.b, d);
                    d = d;
                    notificationCenter.k(nm7.P5, sq0Var);
                }
                TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
                tL_sendMessageStopDraftAction.random_id = j2;
                TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                tL_messages_setTyping.peer = b.getMessagesController().i1(j3);
                tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
                if (d != j) {
                    tL_messages_setTyping.flags |= 1;
                    tL_messages_setTyping.top_msg_id = (int) d;
                }
                b.getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new nq0((byte) 0));
            }
        }
        yv1Var.p5(true);
    }

    @Override
    public final void f0() {
        this.b.za(0, false);
    }

    @Override
    public final boolean h() {
        return this.b.W4();
    }

    @Override
    public final int j() {
        return this.b.m1.Q();
    }

    @Override
    public final void j1() {
        int i;
        int i2;
        yv1 yv1Var = this.b;
        if (!yv1Var.b8() && (i = yv1Var.g4) != 6 && i != 8) {
            oc7 messagesController = yv1Var.getMessagesController();
            long j = yv1Var.l6;
            long j2 = yv1Var.s4;
            i2 = ((d) yv1Var).classGuid;
            messagesController.J4(0, i2, j, j2, null);
        }
    }

    @Override
    public final TLRPC.Peer l() {
        return null;
    }

    @Override
    public final void n() {
        boolean z;
        yv1 yv1Var = this.b;
        if (yv1Var.B0 != null) {
            yv1Var.d0 = yv1Var.a0.getBackgroundTop();
        }
        es1 es1Var = yv1Var.X1;
        if (es1Var != null) {
            es1Var.getAdapter().g0 = true;
        }
        if (yv1Var.H5 != null) {
            gm.d3(new fo1(this, (byte) 7), 30L);
        }
        if (yv1Var.a0.R0()) {
            yv1Var.a0.I1();
            z = true;
        } else {
            z = false;
        }
        yv1Var.a0.z1(true, true, z);
        if (yv1Var.G5 != 0) {
            yv1Var.getConnectionsManager().cancelRequest(yv1Var.G5, true);
            yv1Var.G5 = 0;
        }
        yv1Var.gd(0, true);
        yv1Var.Pc(false);
        yv1Var.Gd(false);
    }

    @Override
    public final void n0() {
        yv1 yv1Var = this.b;
        a6a sendMessagesHelper = yv1Var.getSendMessagesHelper();
        long j = yv1Var.l6;
        SparseArray sparseArray = sendMessagesHelper.e;
        SparseArray sparseArray2 = sendMessagesHelper.c;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < sparseArray2.size()) {
                TLRPC.Message message = (TLRPC.Message) sparseArray2.valueAt(i2);
                if (message.dialog_id == j) {
                    i = message.id;
                    break;
                }
                i2++;
            } else {
                int i3 = 0;
                while (true) {
                    if (i3 >= sparseArray.size()) {
                        break;
                    }
                    TLRPC.Message message2 = (TLRPC.Message) sparseArray.valueAt(i3);
                    if (message2.dialog_id == j) {
                        i = message2.id;
                        break;
                    }
                    i3++;
                }
            }
        }
        int i4 = i;
        if (i4 != 0) {
            yv1Var.J(i4, 0, 0, 0, true, true);
        }
    }

    @Override
    public final void o(float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        yv1 yv1Var = this.b;
        if (i != 0) {
            yv1Var.R4 = true;
        }
        yv1Var.O7();
        yv1Var.Q7();
        yv1Var.vd(false, false);
        yv1Var.m1.invalidate();
        u31 u31Var = u31.x;
        if (u31Var != null && yv1Var.Pc != null) {
            u31Var.l();
        }
    }

    @Override
    public final void p(boolean z) {
        int i;
        int i2;
        yv1 yv1Var = this.b;
        if (z) {
            Activity parentActivity = yv1Var.getParentActivity();
            i2 = ((d) yv1Var).classGuid;
            gm.g3(parentActivity, i2);
            yv1Var.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = yv1Var.getParentActivity();
        i = ((d) yv1Var).classGuid;
        gm.V2(parentActivity2, i);
    }

    @Override
    public final void r() {
        this.b.zc(true, false);
    }

    @Override
    public final void s1() {
        fdb fdbVar = this.b.s1;
        if (fdbVar != null) {
            fdbVar.d();
        }
    }

    @Override
    public final void v() {
        fdb fdbVar = this.b.s1;
        if (fdbVar != null) {
            fdbVar.d();
        }
    }

    @Override
    public final void v1(int i) {
        int i2;
        int currentActionBarHeight = a.getCurrentActionBarHeight() + gm.L(72.0f);
        yv1 yv1Var = this.b;
        if (i < currentActionBarHeight) {
            yv1Var.r5 = false;
            if (yv1Var.s1.getVisibility() == 0) {
                yv1Var.s1.setVisibility(4);
            }
        } else {
            yv1Var.r5 = true;
            if (yv1Var.s1.getVisibility() == 4 && !yv1Var.isInPreviewMode()) {
                yv1Var.s1.setVisibility(0);
            }
        }
        yv1Var.s5 = !yv1Var.a0.R0();
        if (yv1Var.a0.R0()) {
            i2 = 65536;
        } else {
            i2 = 0;
        }
        int i3 = i + i2;
        if (this.a != i3) {
            yv1Var.d0 = 0;
        }
        this.a = i3;
    }

    @Override
    public final void w(CharSequence charSequence, boolean z, int i, int i2, long j) {
        w04 w04Var;
        k47 k47Var;
        int i3;
        long b2;
        o47 o47Var;
        m47 m47Var;
        boolean z2;
        TLRPC.Message message;
        m47 m47Var2;
        yv1 yv1Var = this.b;
        ArrayList arrayList = yv1Var.M6;
        if (yv1Var.B0 != null) {
            yv1Var.d0 = yv1Var.a0.getBackgroundTop();
        }
        es1 es1Var = yv1Var.X1;
        if (es1Var != null && es1Var.getAdapter() != null) {
            yv1Var.X1.getAdapter().x.a(charSequence);
        }
        if (i != 0) {
            int i4 = yv1Var.h4;
            if (i4 == -1) {
                yv1Var.h4 = 0;
                i4 = 0;
            }
            if (charSequence != null) {
                yv1Var.h4 = i4 + 1;
            }
            o47 o47Var2 = yv1Var.x5;
            if (o47Var2 != null && (m47Var2 = o47Var2.b) != null && !m47Var2.e.isEmpty()) {
                yv1Var.h4 += yv1Var.x5.b.e.size();
            }
            yv1Var.md(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (o47Var = yv1Var.x5) != null && (m47Var = o47Var.b) != null && !m47Var.e.isEmpty() && yv1Var.x5.d == null && j <= 0) {
            ArrayList arrayList2 = new ArrayList();
            yv1Var.x5.b.b(arrayList2);
            if (arrayList2.size() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            TLRPC.Peer x1 = yv1Var.getMessagesController().x1(yv1Var.l6);
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList2.size()) {
                    break;
                }
                k47 k47Var2 = (k47) arrayList2.get(i5);
                if (k47Var2 != null && (message = k47Var2.k) != null && !k47.u5(message.peer_id, x1)) {
                    z2 = false;
                    break;
                }
                i5++;
            }
            if (z2) {
                u31 I = c41.b0(yv1Var).I(2131624048, jb6.M0(2131743991, null), jb6.M0(2131743990, null));
                s09 s09Var = ((r31) I.e).a;
                s09Var.setScaleX(1.8f);
                s09Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (sd2.c0(yv1Var.e) && !yv1Var.x4 && (k47Var = yv1Var.F5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = k47Var.j1;
            if (tL_forumTopic == null) {
                i3 = ((d) yv1Var).currentAccount;
                b2 = k47.b2(i3, yv1Var.F5.k, true, false);
            } else {
                b2 = tL_forumTopic.id;
            }
            long j2 = b2;
            if (j2 != 0) {
                yv1Var.getMediaDataController().F(yv1Var.l6, j2, false);
            }
        }
        yv1Var.ac(false, null, null, null, null, z, i, null, false, j, null, true);
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var != null && ms1Var.getEmojiView() != null && (w04Var = yv1Var.a0.getEmojiView().U0) != null) {
            if (w04Var.e) {
                oc7.r1(w04Var.a).J4(2, 0, w04Var.b, w04Var.c, null);
            }
            w04Var.f = -1L;
        }
        if (!yv1Var.getMessagesController().H3() && yv1Var.getMessagesController().G3 <= 0 && yv1Var.getMessagesController().a4 < 2 && !yv1Var.getUserConfig().p() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i6 = 1; i6 < Math.min(5, arrayList.size()); i6++) {
                k47 k47Var3 = (k47) arrayList.get(i6);
                if (k47Var3 != null && !k47Var3.O3() && ((k47.Q4(k47Var3.k) || k47Var3.g4()) && k47Var3.k.media_unread)) {
                    v0c.v(k47Var3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers x() {
        return this.b.Ea;
    }

    @Override
    public final void y(float f, int i) {
        q qVar = this.b.q3;
        if (qVar != null) {
            qVar.h(f, i);
        }
    }

    @Override
    public final void z0(int i) {
        int i2;
        if (i == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        yv1 yv1Var = this.b;
        if (yv1Var.r3.getVisibility() != i2) {
            yv1Var.r3.setVisibility(i2);
        }
    }
}
