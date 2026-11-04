package lg;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import gi.j8;
import gi.w5;
import ii.m2;
import mi.g2;
import mi.z1;
import org.telegram.messenger.a8;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.k3;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
public final class n implements Runnable {
    public final int f18371a;
    public final Object f18372b;

    public n(Object obj, int i3) {
        this.f18371a = i3;
        this.f18372b = obj;
    }

    @Override
    public final void run() {
        int L;
        int i3 = this.f18371a;
        Animation animation = null;
        Object obj = this.f18372b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.g(((TL_account.TL_businessChatLink) obj).link);
                fc.a0(LaunchActivity.Q()).k(false).j();
                return;
            case 1:
                j0 j0Var = (j0) obj;
                f41 f41Var = j0Var.X1;
                if (f41Var != null) {
                    f41Var.O(true);
                }
                j0Var.d1(true);
                return;
            case 2:
                r0 r0Var = (r0) ((w5) obj).f13798b;
                r0Var.f18440c.f35594g3.O(true);
                r0Var.g0();
                return;
            case 3:
                t0 t0Var = (t0) obj;
                t0Var.f18465b.f35594g3.O(true);
                t0Var.a0(true);
                return;
            case 4:
                d1 d1Var = (d1) obj;
                d1Var.f18265a.f35594g3.O(true);
                d1Var.d0(true);
                return;
            case 5:
                ((ai.v1) obj).a(Boolean.FALSE);
                return;
            case 6:
                hs.f(((u1) obj).f18484a).k(121, new Object[0]);
                return;
            case 7:
                ((m2.e) obj).c();
                return;
            case 8:
                g2.s sVar = (g2.s) obj;
                sVar.getClass();
                if (Thread.currentThread() == sVar.f11900a) {
                    sVar.e(-1, new l2.d(19));
                    return;
                }
                return;
            case 9:
                m2.s0 s0Var = (m2.s0) obj;
                if (s0Var.f18981a0 >= 300000) {
                    s0Var.f18993n.p();
                    s0Var.f18981a0 = 0L;
                    return;
                }
                return;
            case 10:
                i3 i3Var = ((k3) obj).d;
                i3Var.requestFocus();
                org.telegram.messenger.g0.K3(i3Var);
                return;
            case 11:
                org.telegram.messenger.g0.K3(((mi.v) obj).X1.d);
                return;
            case 12:
                ((mi.c0) obj).invalidate();
                return;
            case 13:
                fa.f fVar = (fa.f) obj;
                fVar.d = null;
                fVar.f11541e = null;
                fVar.f11542f = null;
                fVar.h = null;
                fVar.j(null);
                return;
            case 14:
                ((z1) obj).invalidateSelf();
                return;
            case 15:
                ((g2) obj).c();
                return;
            case 16:
                ((nh.b) obj).invalidate();
                return;
            case 17:
                oh.c cVar = (oh.c) obj;
                GroupCallMessage groupCallMessage = cVar.I;
                if (groupCallMessage != null) {
                    cVar.f21111a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f21112b.a(cVar.I.isSendError(), true);
                    return;
                }
                return;
            case 18:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) obj);
                return;
            case 19:
                Drawable drawable = ActionBarLayout.f27273w1;
                org.telegram.messenger.g0.h3((bi.q0) obj);
                return;
            case 20:
                ((org.telegram.ui.ActionBar.p0) obj).setSelectedForDelete(false);
                return;
            case 21:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                v0Var.f28713a0 = true;
                org.telegram.messenger.g0.l2(new j8(v0Var, 16), 8.0f);
                return;
            case 22:
                ((org.telegram.ui.ActionBar.h1) obj).c();
                return;
            case 23:
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) obj;
                org.telegram.ui.ActionBar.s1 s1Var = o1Var.d;
                int i10 = org.telegram.messenger.g0.f22608q.x;
                s1Var.M = i10;
                int L2 = i10 - org.telegram.messenger.g0.L(56.0f);
                if (org.telegram.messenger.g0.Q1()) {
                    if (org.telegram.messenger.g0.P1()) {
                        L = org.telegram.messenger.g0.L(446.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(496.0f);
                    }
                } else {
                    L = org.telegram.messenger.g0.L(356.0f);
                }
                int min = Math.min(L, L2);
                Rect rect = s1Var.D0;
                int i11 = min + rect.left + rect.right;
                if (s1Var.f28525a1) {
                    ViewGroup.LayoutParams layoutParams = o1Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.width != i11) {
                        layoutParams.width = i11;
                        o1Var.requestLayout();
                        return;
                    }
                    return;
                }
                Window window = s1Var.getWindow();
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                layoutParams2.copyFrom(window.getAttributes());
                layoutParams2.width = i11;
                try {
                    window.setAttributes(layoutParams2);
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 24:
                org.telegram.ui.ActionBar.v1 v1Var = (org.telegram.ui.ActionBar.v1) obj;
                v1Var.f28733p1.setVisibility(0);
                v1Var.f28735r1.setAlpha(0.0f);
                int i12 = v1Var.f28731n1;
                if (i12 != 0 && i12 != -1) {
                    try {
                        animation = AnimationUtils.loadAnimation(v1Var.getContext(), i12);
                    } catch (Resources.NotFoundException e10) {
                        a8.g(e10, true);
                    }
                }
                if (animation != null) {
                    v1Var.f28734q1.startAnimation(animation);
                } else {
                    v1Var.f28734q1.setAlpha(0.0f);
                    v1Var.f28734q1.animate().setDuration(300L).alpha(1.0f).start();
                }
                v1Var.f28735r1.animate().setDuration(300L).alpha(1.0f).setListener(new org.telegram.ui.ActionBar.t1(v1Var, 0)).start();
                return;
            case 25:
                t2 t2Var = (t2) ((m2) obj).f15079c;
                DialogInterface.OnDismissListener onDismissListener = t2Var.I0;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(t2Var);
                }
                try {
                    t2Var.K();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 26:
                try {
                    ((l2) obj).f28304b.K();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 27:
                g3 g3Var = (g3) obj;
                if (g3Var.mo25d() != null) {
                    g3Var.mo25d().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 28:
                ((j3) obj).f();
                return;
            default:
                i4 i4Var = (i4) ((androidx.mediarouter.app.g0) obj).f2161b;
                i4Var.k();
                i4Var.j();
                return;
        }
    }
}
