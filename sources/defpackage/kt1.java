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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.q;
public final class kt1 implements xy1 {
    public int a;
    public final zu1 b;

    public kt1(zu1 zu1Var) {
        this.b = zu1Var;
    }

    @Override
    public final void B(float f, int i) {
        q qVar = this.b.q3;
        if (qVar != null) {
            qVar.h(f, i);
        }
    }

    @Override
    public final void B1() {
        zeb zebVar = this.b.s1;
        if (zebVar != null) {
            zebVar.d();
        }
    }

    @Override
    public final void C() {
        boolean z;
        zu1 zu1Var = this.b;
        nr1 nr1Var = zu1Var.a0;
        boolean z2 = nr1Var.o4;
        my1 my1Var = nr1Var.V0;
        boolean z3 = false;
        if (my1Var != null && my1Var.getCurrentPage() == 0) {
            z = true;
        } else {
            z = false;
        }
        fm0 fm0Var = zu1Var.td;
        if (z2 && !z) {
            z3 = true;
        }
        fm0Var.a(z3, true);
    }

    @Override
    public final void C1(int i) {
        int i2;
        int currentActionBarHeight = a.getCurrentActionBarHeight() + hl.L(72.0f);
        zu1 zu1Var = this.b;
        if (i < currentActionBarHeight) {
            zu1Var.r5 = false;
            if (zu1Var.s1.getVisibility() == 0) {
                zu1Var.s1.setVisibility(4);
            }
        } else {
            zu1Var.r5 = true;
            if (zu1Var.s1.getVisibility() == 4 && !zu1Var.isInPreviewMode()) {
                zu1Var.s1.setVisibility(0);
            }
        }
        zu1Var.s5 = !zu1Var.a0.U0();
        if (zu1Var.a0.U0()) {
            i2 = 65536;
        } else {
            i2 = 0;
        }
        int i3 = i + i2;
        if (this.a != i3) {
            zu1Var.d0 = 0;
        }
        this.a = i3;
    }

    @Override
    public final void D(boolean z) {
        this.b.zc(false, z);
    }

    @Override
    public final void D1() {
        int indexOfChild;
        int i;
        zu1 zu1Var = this.b;
        if (zu1Var.getParentActivity() != null) {
            if ((zu1Var.e != null || zu1Var.s8 != null) && zu1Var.fragmentView != null) {
                kg5 kg5Var = zu1Var.u2;
                if ((kg5Var == null || !kg5Var.W) && (indexOfChild = zu1Var.m1.indexOfChild(zu1Var.U)) != -1) {
                    try {
                        zu1Var.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    kg5 kg5Var2 = zu1Var.u2;
                    if (kg5Var2 == null) {
                        kg5Var2 = zu1Var.x4(310.0f, 3, indexOfChild + 1, false);
                        zu1Var.u2 = kg5Var2;
                    }
                    TLRPC.UserFull userFull = zu1Var.s8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        if (zu1Var.a0.d1) {
                            i = 2131743249;
                        } else {
                            i = 2131743172;
                        }
                        kg5Var2.t(hl.S2(ob6.a0(null, null, i, zu1Var.f.first_name)));
                    } else if (!xc2.v(zu1Var.e) && !xc2.s(zu1Var.e)) {
                        if (!zu1Var.V4()) {
                            boolean z = zu1Var.a0.d1;
                            kg5 kg5Var3 = zu1Var.u2;
                            TLRPC.Chat chat = zu1Var.e;
                            if (z) {
                                kg5Var3.t(xc2.L(21, chat));
                            } else {
                                kg5Var3.t(xc2.L(20, chat));
                            }
                        } else {
                            return;
                        }
                    } else if (xc2.P(20, zu1Var.e)) {
                        zu1Var.u2.t(ob6.M0(2131749308, null));
                    } else if (xc2.P(21, zu1Var.e)) {
                        zu1Var.u2.t(ob6.M0(2131749311, null));
                    } else if (xc2.P(7, zu1Var.e)) {
                        zu1Var.u2.t(ob6.M0(2131749314, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = zu1Var.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            boolean B1 = hl.B1(tL_chatBannedRights);
                            kg5 kg5Var4 = zu1Var.u2;
                            if (B1) {
                                kg5Var4.t(ob6.M0(2131753948, null));
                            } else {
                                kg5Var4.t(ob6.a0("AttachMediaRestricted", null, 2131753949, ob6.v(zu1Var.e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = zu1Var.a0.getSendButton();
                    View audioVideoButtonContainer = zu1Var.a0.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    zu1Var.u2.x(sendButton, true);
                }
            }
        }
    }

    @Override
    public final int E0() {
        return this.b.m1.getHeight();
    }

    @Override
    public final void E1(boolean z) {
        zu1 zu1Var = this.b;
        View view = zu1Var.L2;
        if (view != null) {
            view.setVisibility(8);
        }
        zu1Var.t5 = !z;
    }

    @Override
    public final TL_stories.StoryItem F0() {
        return null;
    }

    @Override
    public final boolean H0(long j) {
        return false;
    }

    @Override
    public final void H1(int i, int i2, int i3, long j, long j2, boolean z) {
        zu1 zu1Var = this.b;
        boolean z2 = false;
        if (zu1Var.q3 == null && CameraView.isCameraAllowed() && zu1Var.getParentActivity() != null) {
            Activity parentActivity = zu1Var.getParentActivity();
            xu1 xu1Var = zu1Var.Ba;
            int i4 = cr5.e;
            q qVar = new q(parentActivity, zu1Var, xu1Var, true);
            zu1Var.q3 = qVar;
            qVar.setAnimationCallback(new el1(zu1Var, (byte) 7));
            zu1Var.q3.setTrimCallback(new el1(zu1Var, (byte) 8));
            zu1Var.q3.setRecordingUiFrameCallback(new ri6(zu1Var, (byte) 17));
            zu1Var.q3.setClipToPadding(false);
            q qVar2 = zu1Var.q3;
            ll0 ll0Var = zu1Var.L;
            kq1 kq1Var = zu1Var.x;
            View view = qVar2.G;
            jl0 c = ll0Var.c(view, kq1Var, false);
            c.q(hl.L(6.0f));
            c.r(hl.L(21.0f));
            view.setBackground(c);
            int indexOfChild = zu1Var.m1.indexOfChild(zu1Var.U);
            if (indexOfChild < 0) {
                indexOfChild = zu1Var.m1.getChildCount();
            }
            zu1Var.m1.addView(zu1Var.q3, Math.min(indexOfChild + 1, zu1Var.m1.getChildCount()), tre.e(-1, -1, 51));
        }
        q qVar3 = zu1Var.q3;
        if (qVar3 != null) {
            if (i == 0) {
                qVar3.v();
                zu1Var.A0.E0();
                zu1Var.D0.O();
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
    public final void J() {
        zeb zebVar = this.b.s1;
        if (zebVar != null) {
            zebVar.e();
        }
    }

    @Override
    public final boolean L0() {
        ip9 ip9Var;
        q qVar = this.b.q3;
        if (qVar != null && (ip9Var = qVar.S) != null) {
            int i = ip9Var.a;
            if (i == 4 || i == 5 || i == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void O1() {
        zu1 zu1Var = this.b;
        kg5 kg5Var = zu1Var.v2;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
        kg5 kg5Var2 = zu1Var.x2;
        if (kg5Var2 != null) {
            kg5Var2.f(true);
        }
    }

    @Override
    public final void P1() {
        a aVar;
        zu1 zu1Var = this.b;
        aVar = ((e) zu1Var).actionBar;
        if (!aVar.o0) {
            s7 s7Var = zu1Var.j0;
            if (s7Var != null) {
                s7Var.setVisibility(0);
            }
            r6 r6Var = zu1Var.g0;
            if (r6Var != null) {
                r6Var.e(8);
            }
            yq2 yq2Var = zu1Var.f0;
            if (yq2Var != null) {
                yq2Var.b(false);
            }
        }
    }

    @Override
    public final ou1 R() {
        return this.b.D5;
    }

    @Override
    public final void R0(CharSequence charSequence, boolean z, boolean z2) {
        boolean z3;
        CharSequence charSequence2;
        long j;
        kg5 kg5Var;
        TLRPC.ChatFull chatFull;
        MediaController z4 = MediaController.z();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z5 = false;
        zu1 zu1Var = this.b;
        if (isEmpty && !zu1Var.a0.T0()) {
            z3 = false;
        } else {
            z3 = true;
        }
        z4.N = z3;
        fr1 fr1Var = zu1Var.X1;
        if (fr1Var != null && fr1Var.getAdapter() != null) {
            charSequence2 = charSequence;
            zu1Var.X1.getAdapter().U(charSequence2, zu1Var.a0.getCursorPosition(), zu1Var.M6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        xs4 xs4Var = zu1Var.b6;
        if (xs4Var != null) {
            hl.r(xs4Var);
            zu1Var.b6 = null;
        }
        TLRPC.Chat chat = zu1Var.e;
        if (chat == null || xc2.m(chat)) {
            nr1 nr1Var = zu1Var.a0;
            if (nr1Var.N3 && (!nr1Var.T0() || !zu1Var.a0.P2)) {
                if (z) {
                    zu1Var.ub(charSequence2, true);
                } else {
                    zu1Var.Y4(charSequence2);
                    xs4 xs4Var2 = new xs4(this, charSequence2, false, (byte) 4);
                    zu1Var.b6 = xs4Var2;
                    if (hl.S == null) {
                        j = 3000;
                    } else {
                        j = 1000;
                    }
                    hl.d3(xs4Var2, j);
                }
            }
        }
        yr1 yr1Var = zu1Var.Ua;
        if (yr1Var != null) {
            ArrayList arrayList = yr1Var.G;
            for (int i = 0; i < arrayList.size(); i++) {
                ((sv3) arrayList.get(i)).n = true;
            }
        }
        s49 s49Var = s49.B;
        if (s49Var != null) {
            s49Var.l = true;
        }
        s49 s49Var2 = s49.C;
        if (s49Var2 != null) {
            s49Var2.l = true;
        }
        if (!z2) {
            kg5 kg5Var2 = zu1Var.v2;
            if ((kg5Var2 != null && kg5Var2.W) || ((kg5Var = zu1Var.x2) != null && kg5Var.W)) {
                if (kg5Var2 != null) {
                    kg5Var2.f(true);
                }
                kg5 kg5Var3 = zu1Var.x2;
                if (kg5Var3 != null) {
                    kg5Var3.f(true);
                    return;
                }
                return;
            }
            hm1 hm1Var = zu1Var.lb;
            if (lbc.D(zu1Var.f) || ((chatFull = zu1Var.r8) != null && chatFull.slowmode_next_send_date > 0 && zu1Var.g4 == 0)) {
                z5 = true;
            }
            if (!zu1Var.y2 && !zu1Var.w2 && !z5 && xea.L < 3 && !zu1Var.a0.T0()) {
                hl.r(hm1Var);
                hl.d3(hm1Var, 4000L);
            }
        }
    }

    @Override
    public final void S0() {
        q qVar = this.b.q3;
        if (qVar != null) {
            qVar.y();
        }
    }

    @Override
    public final void S1() {
        zu1 zu1Var = this.b;
        f41 f41Var = zu1Var.Y1;
        if (f41Var != null) {
            f41Var.s1(0, null);
        }
        zu1Var.na();
    }

    @Override
    public final boolean T0() {
        zu1 zu1Var = this.b;
        TLRPC.User user = zu1Var.f;
        if (user != null && !lbc.D(user) && !zu1Var.f.bot && zu1Var.h == null && zu1Var.g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void V() {
        a aVar;
        zu1 zu1Var = this.b;
        aVar = ((e) zu1Var).actionBar;
        if (!aVar.o0 && !zu1Var.g8() && TextUtils.isEmpty(zu1Var.a0.getSlowModeTimer())) {
            s7 s7Var = zu1Var.j0;
            if (s7Var != null) {
                s7Var.setVisibility(8);
            }
            r6 r6Var = zu1Var.g0;
            if (r6Var != null) {
                r6Var.e(0);
            }
            yq2 yq2Var = zu1Var.f0;
            if (yq2Var != null) {
                yq2Var.b(true);
            }
        }
    }

    @Override
    public final void W0() {
        int i;
        zu1 zu1Var = this.b;
        Activity parentActivity = zu1Var.getParentActivity();
        i = ((e) zu1Var).currentAccount;
        long j = zu1Var.l6;
        b77 b77Var = zu1Var.y5;
        if (b77Var == null) {
            b77Var = b77.a();
        }
        new a77(parentActivity, i, j, b77Var, zu1Var, zu1Var.getResourceProvider(), 0, new gl1(zu1Var, (byte) 9)).show();
    }

    @Override
    public final void X0() {
        this.b.S4();
    }

    @Override
    public final void Z0() {
        boolean z;
        boolean z2;
        int i;
        float f;
        int i2;
        zu1 zu1Var = this.b;
        zu1Var.i5();
        nr1 nr1Var = zu1Var.a0;
        boolean z3 = nr1Var.o4;
        my1 my1Var = nr1Var.V0;
        if (my1Var != null && my1Var.getCurrentPage() == 0) {
            z = true;
        } else {
            z = false;
        }
        fm0 fm0Var = zu1Var.td;
        if (z3 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        fm0Var.a(z2, true);
        if (z3) {
            Activity parentActivity = zu1Var.getParentActivity();
            i2 = ((e) zu1Var).classGuid;
            hl.g3(parentActivity, i2);
            v21 v21Var = v21.x;
            if (v21Var != null && v21Var.m) {
                v21Var.b();
            }
        } else {
            Activity parentActivity2 = zu1Var.getParentActivity();
            i = ((e) zu1Var).classGuid;
            hl.V2(parentActivity2, i);
        }
        fr1 fr1Var = zu1Var.X1;
        float f2 = 0.0f;
        if (fr1Var != null) {
            ViewPropertyAnimator animate = fr1Var.animate();
            if (!z3 && !zu1Var.isInPreviewMode()) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            animate.alpha(f).setInterpolator(k43.f).start();
        }
        zeb zebVar = zu1Var.s1;
        if (zebVar != null) {
            zebVar.setVisibility(0);
            ViewPropertyAnimator animate2 = zu1Var.s1.animate();
            if (!z3 && !zu1Var.isInPreviewMode()) {
                f2 = 1.0f;
            }
            animate2.alpha(f2).setInterpolator(k43.f).withEndAction(new xac((byte) 9, this, z3)).start();
        }
    }

    @Override
    public final void a() {
        this.b.dd();
    }

    @Override
    public final void b1(View view, CharSequence charSequence, boolean z) {
        zu1 zu1Var = this.b;
        zu1Var.vc(view, charSequence, z);
        s7 s7Var = zu1Var.j0;
        if (s7Var != null && s7Var.getVisibility() != 0) {
            zu1Var.j0.setVisibility(0);
            r6 r6Var = zu1Var.g0;
            if (r6Var != null) {
                r6Var.e(8);
            }
            yq2 yq2Var = zu1Var.f0;
            if (yq2Var != null) {
                yq2Var.b(false);
            }
        }
    }

    @Override
    public final void d1(CharSequence charSequence) {
        this.b.ub(charSequence, true);
    }

    @Override
    public final void e() {
        zeb zebVar = this.b.s1;
        if (zebVar != null) {
            zebVar.e();
        }
    }

    @Override
    public final boolean e0() {
        int i;
        zu1 zu1Var = this.b;
        if ((!zu1Var.getMessagesController().v2(zu1Var.a()) || zu1Var.x4) && (i = zu1Var.g4) != 9 && zu1Var.h4 > 0) {
            if (i != 0) {
                if (i == 3 && zu1Var.f7() == zu1Var.getUserConfig().e()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean e1() {
        t47 t47Var;
        v47 v47Var = this.b.x5;
        if (v47Var != null && (t47Var = v47Var.b) != null && !t47Var.e.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void f0() {
        zu1 zu1Var = this.b;
        zu1Var.L9 = true;
        it1 it1Var = zu1Var.D0;
        if (it1Var != null) {
            it1Var.F(true);
        }
    }

    @Override
    public final boolean g() {
        return this.b.V4();
    }

    @Override
    public final void g1() {
        int i;
        long j;
        long j2;
        zu1 zu1Var = this.b;
        i = ((e) zu1Var).currentAccount;
        wp0 b = wp0.b(i);
        long j3 = zu1Var.l6;
        long c = (int) zu1Var.c();
        zm9 zm9Var = b.a;
        LongSparseArray H0 = zm9Var.H0(j3, c);
        if (H0 != null && H0.size() > 0) {
            int size = H0.size();
            rp0 rp0Var = null;
            int i2 = 0;
            long j4 = 0;
            while (true) {
                if (i2 < size) {
                    j4 = H0.keyAt(i2);
                    rp0Var = (rp0) H0.valueAt(i2);
                    j = 0;
                    if (!rp0Var.e) {
                        break;
                    }
                    i2++;
                } else {
                    j = 0;
                    break;
                }
            }
            rp0 rp0Var2 = rp0Var;
            long j5 = j4;
            if (rp0Var2 != null && !rp0Var2.e) {
                Runnable runnable = rp0Var2.f;
                if (runnable != null) {
                    hl.r(runnable);
                }
                b.b.N0(j3, c, j5, new Object());
                if (rp0Var2.d) {
                    rp0Var2.e = true;
                    j2 = j5;
                } else {
                    zm9Var.O0(j3, c, j5);
                    j2 = j5;
                    jn7 notificationCenter = b.getNotificationCenter();
                    sp0 sp0Var = new sp0(j3, rp0Var2.b, c);
                    c = c;
                    notificationCenter.k(jn7.O5, sp0Var);
                }
                TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
                tL_sendMessageStopDraftAction.random_id = j2;
                TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                tL_messages_setTyping.peer = b.getMessagesController().j1(j3);
                tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
                if (c != j) {
                    tL_messages_setTyping.flags |= 1;
                    tL_messages_setTyping.top_msg_id = (int) c;
                }
                b.getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new pp0((byte) 0));
            }
        }
        zu1Var.o5(true);
    }

    @Override
    public final void i0() {
        this.b.Aa(0, false);
    }

    @Override
    public final int j() {
        return this.b.m1.Q();
    }

    @Override
    public final TLRPC.Peer k() {
        return null;
    }

    @Override
    public final void n() {
        boolean z;
        zu1 zu1Var = this.b;
        if (zu1Var.B0 != null) {
            zu1Var.d0 = zu1Var.a0.getBackgroundTop();
        }
        fr1 fr1Var = zu1Var.X1;
        if (fr1Var != null) {
            fr1Var.getAdapter().g0 = true;
        }
        if (zu1Var.H5 != null) {
            hl.d3(new go1(this, (byte) 7), 30L);
        }
        if (zu1Var.a0.U0()) {
            zu1Var.a0.P1();
            z = true;
        } else {
            z = false;
        }
        zu1Var.a0.G1(true, true, z);
        if (zu1Var.G5 != 0) {
            zu1Var.getConnectionsManager().cancelRequest(zu1Var.G5, true);
            zu1Var.G5 = 0;
        }
        zu1Var.gd(0, true);
        zu1Var.Pc(false);
        zu1Var.Gd(false);
    }

    @Override
    public final void o(float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        zu1 zu1Var = this.b;
        if (i != 0) {
            zu1Var.R4 = true;
        }
        zu1Var.O7();
        zu1Var.Q7();
        zu1Var.vd(false, false);
        zu1Var.m1.invalidate();
        v21 v21Var = v21.x;
        if (v21Var != null && zu1Var.Sc != null) {
            v21Var.l();
        }
    }

    @Override
    public final void p(boolean z) {
        int i;
        int i2;
        zu1 zu1Var = this.b;
        if (z) {
            Activity parentActivity = zu1Var.getParentActivity();
            i2 = ((e) zu1Var).classGuid;
            hl.g3(parentActivity, i2);
            zu1Var.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = zu1Var.getParentActivity();
        i = ((e) zu1Var).classGuid;
        hl.V2(parentActivity2, i);
    }

    @Override
    public final void p1() {
        int i;
        int i2;
        zu1 zu1Var = this.b;
        if (!zu1Var.b8() && (i = zu1Var.g4) != 6 && i != 8) {
            uc7 messagesController = zu1Var.getMessagesController();
            long j = zu1Var.l6;
            long j2 = zu1Var.s4;
            i2 = ((e) zu1Var).classGuid;
            messagesController.P4(0, i2, j, j2, null);
        }
    }

    @Override
    public final void s() {
        this.b.zc(true, false);
    }

    @Override
    public final void t0() {
        zu1 zu1Var = this.b;
        r7a sendMessagesHelper = zu1Var.getSendMessagesHelper();
        long j = zu1Var.l6;
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
            zu1Var.J(i4, 0, 0, 0, true, true);
        }
    }

    @Override
    public final void w() {
        zeb zebVar = this.b.s1;
        if (zebVar != null) {
            zebVar.d();
        }
    }

    @Override
    public final void x(CharSequence charSequence, boolean z, int i, int i2, long j) {
        h04 h04Var;
        r47 r47Var;
        int i3;
        long b2;
        v47 v47Var;
        t47 t47Var;
        boolean z2;
        TLRPC.Message message;
        t47 t47Var2;
        zu1 zu1Var = this.b;
        ArrayList arrayList = zu1Var.M6;
        if (zu1Var.B0 != null) {
            zu1Var.d0 = zu1Var.a0.getBackgroundTop();
        }
        fr1 fr1Var = zu1Var.X1;
        if (fr1Var != null && fr1Var.getAdapter() != null) {
            zu1Var.X1.getAdapter().x.a(charSequence);
        }
        if (i != 0) {
            int i4 = zu1Var.h4;
            if (i4 == -1) {
                zu1Var.h4 = 0;
                i4 = 0;
            }
            if (charSequence != null) {
                zu1Var.h4 = i4 + 1;
            }
            v47 v47Var2 = zu1Var.x5;
            if (v47Var2 != null && (t47Var2 = v47Var2.b) != null && !t47Var2.e.isEmpty()) {
                zu1Var.h4 = zu1Var.x5.b.e.size() + zu1Var.h4;
            }
            zu1Var.md(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (v47Var = zu1Var.x5) != null && (t47Var = v47Var.b) != null && !t47Var.e.isEmpty() && zu1Var.x5.d == null && j <= 0) {
            ArrayList arrayList2 = new ArrayList();
            zu1Var.x5.b.b(arrayList2);
            if (arrayList2.size() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            TLRPC.Peer y1 = zu1Var.getMessagesController().y1(zu1Var.l6);
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList2.size()) {
                    break;
                }
                r47 r47Var2 = (r47) arrayList2.get(i5);
                if (r47Var2 != null && (message = r47Var2.k) != null && !r47.u5(message.peer_id, y1)) {
                    z2 = false;
                    break;
                }
                i5++;
            }
            if (z2) {
                v21 I = d31.b0(zu1Var).I(2131624048, ob6.M0(2131743959, null), ob6.M0(2131743958, null));
                e29 e29Var = ((s21) I.e).a;
                e29Var.setScaleX(1.8f);
                e29Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (xc2.c0(zu1Var.e) && !zu1Var.x4 && (r47Var = zu1Var.F5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = r47Var.j1;
            if (tL_forumTopic == null) {
                i3 = ((e) zu1Var).currentAccount;
                b2 = r47.b2(i3, zu1Var.F5.k, true, false);
            } else {
                b2 = tL_forumTopic.id;
            }
            long j2 = b2;
            if (j2 != 0) {
                zu1Var.getMediaDataController().F(zu1Var.l6, j2, false);
            }
        }
        zu1Var.bc(false, null, null, null, z, i, null, false, j, true);
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var != null && nr1Var.getEmojiView() != null && (h04Var = zu1Var.a0.getEmojiView().U0) != null) {
            if (h04Var.e) {
                uc7.s1(h04Var.a).P4(2, 0, h04Var.b, h04Var.c, null);
            }
            h04Var.f = -1L;
        }
        if (!zu1Var.getMessagesController().M3() && zu1Var.getMessagesController().G3 <= 0 && zu1Var.getMessagesController().a4 < 2 && !zu1Var.getUserConfig().p() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i6 = 1; i6 < Math.min(5, arrayList.size()); i6++) {
                r47 r47Var3 = (r47) arrayList.get(i6);
                if (r47Var3 != null && !r47Var3.O3() && ((r47.Q4(r47Var3.k) || r47Var3.g4()) && r47Var3.k.media_unread)) {
                    u2c.v(r47Var3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers y() {
        return this.b.Ea;
    }

    @Override
    public final void z0(int i) {
        int i2;
        if (i == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        zu1 zu1Var = this.b;
        if (zu1Var.r3.getVisibility() != i2) {
            zu1Var.r3.setVisibility(i2);
        }
    }
}
