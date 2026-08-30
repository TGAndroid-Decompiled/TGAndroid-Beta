package eg;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kh.q5;
import kh.r5;
import lh.g5;
import lh.ga;
import nh.d5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.zi;
import org.telegram.ui.gx;
import org.telegram.ui.jb1;
import ph.f3;
public final class f2 extends f2.z0 {
    public final int f5291a;
    public final Object f5292b;

    public f2(Object obj, int i10) {
        this.f5291a = i10;
        this.f5292b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        el0 el0Var;
        int i11;
        el0 el0Var2;
        el0 el0Var3;
        int top;
        int i12;
        el0 el0Var4;
        el0 el0Var5;
        int top2;
        boolean z4;
        switch (this.f5291a) {
            case 0:
                g1 g1Var = (g1) this.f5292b;
                if (i10 == 1) {
                    g1Var.f5319a3 = true;
                }
                if (i10 == 0) {
                    i2 i2Var = null;
                    for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
                        i2 i2Var2 = (i2) g1Var.getChildAt(i13);
                        if (i2Var == null || i2Var2.f5307a > i2Var.f5307a) {
                            i2Var = i2Var2;
                        }
                    }
                    if (i2Var != null) {
                        g1Var.w1(i2Var, true);
                        g1Var.f5319a3 = false;
                        g1Var.v0(0, i2Var.getTop() - ((g1Var.getMeasuredHeight() - i2Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    g1Var.x1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(g1Var.f5320b3);
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((gg.f2) this.f5292b).V.getEditText());
                    return;
                }
                return;
            case 12:
                d5 d5Var = (d5) this.f5292b;
                if (i10 == 0) {
                    d5Var.S = true;
                    d5Var.invalidate();
                }
                if (i10 == 1) {
                    d5Var.S = false;
                    b4.e0 e0Var = d5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) e0Var.f1368c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) e0Var.f1368c).cancel();
                        e0Var.f1368c = null;
                    }
                    AndroidUtilities.hideKeyboard(d5Var);
                    return;
                }
                return;
            case 15:
                c8 c8Var = (c8) this.f5292b;
                o7 o7Var = c8Var.f23900n;
                if (i10 == 0) {
                    if (c8.j0(c8Var) + ((c8Var.f23915x0 - c8.i0(c8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && o7Var.canScrollVertically(1) && (el0Var = (el0) o7Var.K(c8Var.f23908s0 ? 1 : 0)) != null) {
                        View view = el0Var.f5785a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            o7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(c8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 18:
                zi ziVar = (zi) this.f5292b;
                lh.e1 e1Var = ziVar.f31347n;
                li liVar = ziVar.f24278b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = liVar.X0;
                    if (w0Var != null) {
                        i11 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i14 = dp + i11;
                    int backgroundPaddingTop = liVar.getBackgroundPaddingTop();
                    if (((liVar.Y1[0] - backgroundPaddingTop) - i14) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var2 = (el0) e1Var.K(0)) != null) {
                        View view2 = el0Var2.f5785a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            e1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                hk hkVar = (hk) this.f5292b;
                vj vjVar = hkVar.f25434r;
                li liVar2 = hkVar.f24278b;
                boolean z10 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = liVar2.getBackgroundPaddingTop();
                    if (((liVar2.Y1[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var3 = (el0) vjVar.K(0)) != null && (top = (el0Var3.f5785a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        vjVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && hkVar.V && vjVar.getAdapter() == hkVar.f25438y) {
                    AndroidUtilities.hideKeyboard(liVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z10 = true;
                }
                hkVar.R = z10;
                return;
            case 21:
                ik ikVar = (ik) this.f5292b;
                sl0 sl0Var = ikVar.f25736r;
                li liVar3 = ikVar.f24278b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var2 = liVar3.X0;
                    if (w0Var2 != null) {
                        i12 = AndroidUtilities.dp(w0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i15 = dp3 + i12;
                    int backgroundPaddingTop3 = liVar3.getBackgroundPaddingTop();
                    if (((liVar3.Y1[0] - backgroundPaddingTop3) - i15) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var4 = (el0) sl0Var.K(0)) != null) {
                        View view3 = el0Var4.f5785a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            sl0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    al alVar = (al) this.f5292b;
                    if (alVar.f23426i0 && alVar.f23427j0) {
                        AndroidUtilities.hideKeyboard(alVar.f24278b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 23:
                qn qnVar = (qn) this.f5292b;
                jb1 jb1Var = qnVar.f28188s;
                li liVar4 = qnVar.f24278b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = liVar4.getBackgroundPaddingTop();
                    if (((liVar4.Y1[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var5 = (el0) jb1Var.K(1)) != null && (top2 = (el0Var5.f5785a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        jb1Var.v0(0, top2, null);
                    }
                    int i16 = qnVar.T0;
                    if (i16 >= 0) {
                        qn.J(qnVar, i16);
                        qnVar.T0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 29:
                oa0 oa0Var = (oa0) this.f5292b;
                boolean z11 = false;
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                oa0Var.U2 = z4;
                if (i10 == 1) {
                    z11 = true;
                }
                oa0Var.V2 = z11;
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        float f10;
        int i12;
        float f11;
        boolean z4;
        boolean z10;
        int dp;
        float f12;
        float y10;
        int measuredHeight;
        tf.e0 e0Var;
        k40 k40Var;
        f2.l1 T;
        int N0;
        int i13;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.f5291a) {
            case 0:
                g1 g1Var = (g1) this.f5292b;
                if (recyclerView.getScrollState() == 1) {
                    g1Var.w1(null, true);
                }
                g1Var.invalidate();
                return;
            case 1:
            case 22:
            default:
                return;
            case 2:
                ((gh.f) this.f5292b).R();
                return;
            case 3:
                f2.i0 i0Var = (f2.i0) recyclerView.getLayoutManager();
                jh.v vVar = (jh.v) this.f5292b;
                jh.i iVar = vVar.C;
                if (vVar.f9498x && !vVar.f9497w && i0Var != null) {
                    if (vVar.f9482f.h() - i0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        AndroidUtilities.runOnUIThread(iVar);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                r5 r5Var = (r5) this.f5292b;
                int i14 = 0;
                while (true) {
                    if (i14 < r5Var.f10783n.getChildCount()) {
                        if (r5Var.f10783n.getChildAt(i14) instanceof t00) {
                            r5Var.d.g(false);
                        } else {
                            i14++;
                        }
                    }
                }
                ViewPropertyAnimator animate = r5Var.h.animate();
                if (r5Var.H && r5Var.f10783n.canScrollVertically(-1)) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                org.telegram.ui.b.p(animate.alpha(f10), nr.h, 320L);
                return;
            case 5:
                ((q5) this.f5292b).Z();
                return;
            case 6:
                lh.q qVar = (lh.q) this.f5292b;
                if (qVar.f12945a == 1) {
                    if (qVar.e.canScrollVertically(1)) {
                        for (int i15 = 0; i15 < qVar.e.getChildCount(); i15++) {
                            if (!(qVar.e.getChildAt(i15) instanceof t00)) {
                            }
                        }
                        return;
                    }
                    lh.q.e0(qVar);
                    return;
                }
                return;
            case 7:
                lh.j1 j1Var = (lh.j1) this.f5292b;
                ng.e eVar = j1Var.f12650p0;
                View view = j1Var.f12648n0;
                FrameLayout frameLayout = j1Var.f12644i0;
                sl0 sl0Var = j1Var.d;
                int childCount = sl0Var.getChildCount() - 1;
                while (true) {
                    i12 = 0;
                    if (childCount >= 0) {
                        View childAt = sl0Var.getChildAt(childCount);
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            if (R == 2) {
                                y10 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            } else if (R == 1) {
                                f11 = childAt.getY();
                            } else if (R == 0) {
                                y10 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            }
                        }
                        childCount--;
                    } else {
                        f11 = 0.0f;
                        z4 = false;
                    }
                }
                f11 = y10 - measuredHeight;
                z4 = true;
                float height = frameLayout.getHeight() + f11;
                if (z4 && height >= 0.0f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (j1Var.f12655u0 != z10) {
                    j1Var.f12655u0 = z10;
                    if (z10) {
                        view.setVisibility(0);
                    }
                    ViewPropertyAnimator animate2 = view.animate();
                    if (z10) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    animate2.alpha(f12).setDuration(200L).withEndAction(new jh.f(2, j1Var, z10)).start();
                }
                if (f11 <= 0.0f) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.0f);
                }
                j1Var.H = dp;
                if (!z4) {
                    i12 = 8;
                }
                frameLayout.setVisibility(i12);
                frameLayout.setTranslationY(f11);
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 31 && eVar != null) {
                    eVar.f(i10, i11);
                    if (i16 >= 31 && eVar != null) {
                        j1Var.Q(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((g5) this.f5292b).V.e();
                return;
            case 9:
                ga gaVar = (ga) this.f5292b;
                g61 g61Var = gaVar.f12512a;
                if (g61Var.canScrollVertically(1)) {
                    for (int i17 = 0; i17 < g61Var.getChildCount(); i17++) {
                        if (!(g61Var.getChildAt(i17) instanceof t00)) {
                        }
                    }
                    return;
                }
                gaVar.h.run();
                return;
            case 10:
                ((mg.v) this.f5292b).c(true);
                return;
            case 11:
                gx gxVar = (gx) this.f5292b;
                gxVar.invalidate();
                gxVar.c();
                f3 f3Var = gxVar.G;
                if (f3Var != null) {
                    f3Var.e(true);
                    return;
                }
                return;
            case 12:
                d5 d5Var = (d5) this.f5292b;
                d5Var.c();
                d5Var.invalidate();
                return;
            case 13:
                ((org.telegram.messenger.voip.b) this.f5292b).run();
                return;
            case 14:
                ((org.telegram.ui.Components.f0) this.f5292b).r0();
                return;
            case 15:
                c8 c8Var = (c8) this.f5292b;
                f2.i0 i0Var2 = c8Var.f23905r;
                c8.P(c8Var);
                c8Var.E0();
                if (!c8Var.f23892f) {
                    int L0 = i0Var2.L0();
                    int i18 = 0;
                    if (c8Var.f23908s0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    if (L0 != -1) {
                        i18 = Math.abs(i0Var2.N0() - L0) + 1;
                    }
                    int h = recyclerView.getAdapter().h();
                    MediaController.getInstance().getPlayingMessageObject();
                    if (SharedConfig.playOrderReversed) {
                        if (L0 < 10) {
                            MediaController.getInstance().loadMoreMusic();
                            return;
                        }
                        return;
                    } else if (L0 + i18 > h - 10) {
                        MediaController.getInstance().loadMoreMusic();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                ((qv0) this.f5292b).invalidate();
                return;
            case 17:
                wi wiVar = (wi) this.f5292b;
                wiVar.f24278b.X1(wiVar, i11);
                return;
            case 18:
                zi ziVar = (zi) this.f5292b;
                if (ziVar.f31347n.getChildCount() > 0) {
                    ziVar.f24278b.X1(ziVar, i11);
                    return;
                }
                return;
            case 19:
                qj qjVar = (qj) this.f5292b;
                qjVar.f24278b.X1(qjVar, i11);
                qjVar.O();
                return;
            case 20:
                hk hkVar = (hk) this.f5292b;
                ej ejVar = hkVar.B;
                hkVar.f24278b.X1(hkVar, i11);
                hkVar.U();
                f2.o0 adapter = hkVar.f25434r.getAdapter();
                gk gkVar = hkVar.f25438y;
                if (adapter == gkVar) {
                    int L02 = ejVar.L0();
                    int N02 = ejVar.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h9 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h9 - 10) {
                        gk gkVar2 = gkVar.U.f25438y;
                        if (!gkVar2.P && !gkVar2.S && (e0Var = gkVar.f25185y) != null) {
                            gkVar.Z(gkVar.f25184x, gkVar.B, gkVar.C, e0Var, gkVar.G, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ik ikVar = (ik) this.f5292b;
                ikVar.f24278b.X1(ikVar, i11);
                ikVar.v.setTranslationY(Math.max(0, ikVar.getCurrentItemTop()));
                return;
            case 23:
                qn qnVar = (qn) this.f5292b;
                ej ejVar2 = qnVar.f28193w;
                qnVar.f24278b.X1(qnVar, i11);
                gn gnVar = qnVar.f28195x;
                if (gnVar != null && gnVar.f28310s) {
                    oy0 delegate = gnVar.getDelegate();
                    if (delegate instanceof c6) {
                        jb1 jb1Var = qnVar.f28188s;
                        View F = jb1Var.F((c6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = jb1Var.T(F);
                        }
                        if (T != null) {
                            View view2 = T.f5785a;
                            int b10 = T.b();
                            if (gnVar.getDirection() == 0) {
                                gnVar.setTranslationY((view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight());
                            } else {
                                gnVar.setTranslationY(view2.getY());
                            }
                            if (b10 < ejVar2.L0() || b10 > ejVar2.N0()) {
                                gnVar.f();
                            }
                        } else {
                            gnVar.f();
                        }
                    } else {
                        gnVar.f();
                    }
                }
                if (i11 != 0 && (k40Var = qnVar.f28197y) != null) {
                    k40Var.b(true);
                    return;
                }
                return;
            case 24:
                rn rnVar = (rn) this.f5292b;
                rnVar.f24278b.X1(rnVar, i11);
                return;
            case 25:
                kp kpVar = (kp) this.f5292b;
                if (kpVar.f26348x.M0() + 10 >= kpVar.h.h()) {
                    kpVar.w();
                    return;
                }
                return;
            case 26:
                mv mvVar = (mv) this.f5292b;
                cv cvVar = mvVar.f27125f;
                if (cvVar != null && mvVar.h.H1 && cvVar.f24059w) {
                    cvVar.f24059w = false;
                    cvVar.invalidate();
                    return;
                }
                return;
            case 27:
                j00 j00Var = (j00) this.f5292b;
                j00Var.C.invalidate();
                j00Var.invalidate();
                return;
            case 28:
                n00.F((n00) this.f5292b);
                return;
            case 29:
                oa0 oa0Var = (oa0) this.f5292b;
                f2.v0 layoutManager = oa0Var.getLayoutManager();
                pa0 pa0Var = oa0Var.Y2;
                ia0 ia0Var = pa0Var.d;
                if (layoutManager == ia0Var) {
                    N0 = ia0Var.N0();
                } else {
                    N0 = pa0Var.f27802c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    tf.u0 u0Var = pa0Var.f27803f;
                    if (N0 > u0Var.I0 - 5 && u0Var.f44857r0 == 0 && (str = u0Var.f44854p0) != null && str.length() != 0 && (user = u0Var.f44860t0) != null && (str2 = u0Var.f44853o0) != null) {
                        u0Var.T(true, user, str2, u0Var.f44854p0);
                    }
                }
                oa0Var.canScrollVertically(1);
                pa0Var.n(!oa0Var.canScrollVertically(-1));
                pa0Var.b();
                return;
        }
    }
}
