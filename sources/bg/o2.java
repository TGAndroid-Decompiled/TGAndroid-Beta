package bg;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import fh.f6;
import fh.g6;
import gh.k5;
import gh.la;
import ih.g5;
import kh.x3;
import mh.u3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.ll;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zm;
import org.telegram.ui.va1;
import org.telegram.ui.vw;
public final class o2 extends f2.d1 {
    public final int f1905a;
    public final Object f1906b;

    public o2(Object obj, int i9) {
        this.f1905a = i9;
        this.f1906b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i9) {
        ik0 ik0Var;
        int i10;
        ik0 ik0Var2;
        ik0 ik0Var3;
        int top;
        int i11;
        ik0 ik0Var4;
        ik0 ik0Var5;
        int top2;
        switch (this.f1905a) {
            case 0:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((q2) this.f1906b).U.getEditText());
                    return;
                }
                return;
            case 11:
                g5 g5Var = (g5) this.f1906b;
                if (i9 == 0) {
                    g5Var.R = true;
                    g5Var.invalidate();
                }
                if (i9 == 1) {
                    g5Var.R = false;
                    a6.a aVar = g5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.f101b;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.f101b).cancel();
                        aVar.f101b = null;
                    }
                    AndroidUtilities.hideKeyboard(g5Var);
                    return;
                }
                return;
            case 13:
                kh.b2 b2Var = (kh.b2) this.f1906b;
                if (i9 == 0 && b2Var.f14986n >= 0.0f && !b2Var.f14982b.canScrollVertically(-1)) {
                    b2Var.f14986n = -1.0f;
                    return;
                }
                return;
            case 17:
                nh.g0 g0Var = (nh.g0) this.f1906b;
                if (i9 == 0) {
                    g0Var.f18640e = !g0Var.d.canScrollVertically(-1);
                    g0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 21:
                c8 c8Var = (c8) this.f1906b;
                n7 n7Var = c8Var.f27394n;
                if (i9 == 0) {
                    if (c8.i0(c8Var) + ((c8Var.f27407w0 - c8.h0(c8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && n7Var.canScrollVertically(1) && (ik0Var = (ik0) n7Var.K(c8Var.f27400r0 ? 1 : 0)) != null) {
                        View view = ik0Var.f5501a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            n7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(c8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 24:
                yi yiVar = (yi) this.f1906b;
                gh.f1 f1Var = yiVar.f34973n;
                ki kiVar = yiVar.f27493b;
                if (i9 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = kiVar.W0;
                    if (w0Var != null) {
                        i10 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i12 = dp + i10;
                    int backgroundPaddingTop = kiVar.getBackgroundPaddingTop();
                    if (((kiVar.X1[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (ik0Var2 = (ik0) f1Var.K(0)) != null) {
                        View view2 = ik0Var2.f5501a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            f1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                fk fkVar = (fk) this.f1906b;
                uj ujVar = fkVar.f28459r;
                ki kiVar2 = fkVar.f27493b;
                boolean z10 = false;
                if (i9 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = kiVar2.getBackgroundPaddingTop();
                    if (((kiVar2.X1[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (ik0Var3 = (ik0) ujVar.K(0)) != null && (top = (ik0Var3.f5501a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        ujVar.v0(0, top, null);
                    }
                }
                if (i9 == 1 && fkVar.U && ujVar.getAdapter() == fkVar.f28463y) {
                    AndroidUtilities.hideKeyboard(kiVar2.getCurrentFocus());
                }
                if (i9 != 0) {
                    z10 = true;
                }
                fkVar.Q = z10;
                return;
            case 27:
                gk gkVar = (gk) this.f1906b;
                wk0 wk0Var = gkVar.f28785r;
                ki kiVar3 = gkVar.f27493b;
                if (i9 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var2 = kiVar3.W0;
                    if (w0Var2 != null) {
                        i11 = AndroidUtilities.dp(w0Var2.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp3 + i11;
                    int backgroundPaddingTop3 = kiVar3.getBackgroundPaddingTop();
                    if (((kiVar3.X1[0] - backgroundPaddingTop3) - i13) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (ik0Var4 = (ik0) wk0Var.K(0)) != null) {
                        View view3 = ik0Var4.f5501a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            wk0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 28:
                if (i9 == 1) {
                    xk xkVar = (xk) this.f1906b;
                    if (xkVar.f34695h0 && xkVar.f34696i0) {
                        AndroidUtilities.hideKeyboard(xkVar.f27493b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 29:
                jn jnVar = (jn) this.f1906b;
                va1 va1Var = jnVar.f29791s;
                ki kiVar4 = jnVar.f27493b;
                if (i9 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = kiVar4.getBackgroundPaddingTop();
                    if (((kiVar4.X1[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (ik0Var5 = (ik0) va1Var.K(1)) != null && (top2 = (ik0Var5.f5501a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        va1Var.v0(0, top2, null);
                    }
                    int i14 = jnVar.S0;
                    if (i14 >= 0) {
                        jn.J(jnVar, i14);
                        jnVar.S0 = -1;
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i9, int i10) {
        float f10;
        int i11;
        float f11;
        boolean z10;
        boolean z11;
        int dp;
        float f12;
        float y10;
        int measuredHeight;
        ViewGroup viewGroup;
        boolean z12;
        kh.g2 g2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z13;
        kh.g2 g2Var2;
        float f13;
        ViewGroup viewGroup3;
        of.m0 m0Var;
        s30 s30Var;
        f2.q1 T;
        switch (this.f1905a) {
            case 1:
                ((bh.j) this.f1906b).Q();
                return;
            case 2:
                f2.m0 m0Var2 = (f2.m0) recyclerView.getLayoutManager();
                eh.x xVar = (eh.x) this.f1906b;
                eh.i iVar = xVar.C;
                if (xVar.f5266x && !xVar.f5265w && m0Var2 != null) {
                    if (xVar.f5250f.h() - m0Var2.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        AndroidUtilities.runOnUIThread(iVar);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                g6 g6Var = (g6) this.f1906b;
                int i13 = 0;
                while (true) {
                    if (i13 < g6Var.f6487n.getChildCount()) {
                        if (g6Var.f6487n.getChildAt(i13) instanceof e00) {
                            g6Var.d.g(false);
                        } else {
                            i13++;
                        }
                    }
                }
                ViewPropertyAnimator animate = g6Var.h.animate();
                if (g6Var.G && g6Var.f6487n.canScrollVertically(-1)) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ll.r(animate.alpha(f10), gr.h, 320L);
                return;
            case 4:
                ((f6) this.f1906b).Y();
                return;
            case 5:
                gh.r rVar = (gh.r) this.f1906b;
                if (rVar.f8767a == 1) {
                    if (rVar.f8774e.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < rVar.f8774e.getChildCount(); i14++) {
                            if (!(rVar.f8774e.getChildAt(i14) instanceof e00)) {
                            }
                        }
                        return;
                    }
                    gh.r.d0(rVar);
                    return;
                }
                return;
            case 6:
                gh.l1 l1Var = (gh.l1) this.f1906b;
                ig.e eVar = l1Var.f8474o0;
                View view = l1Var.m0;
                FrameLayout frameLayout = l1Var.f8468h0;
                wk0 wk0Var = l1Var.d;
                int childCount = wk0Var.getChildCount() - 1;
                while (true) {
                    i11 = 0;
                    if (childCount >= 0) {
                        View childAt = wk0Var.getChildAt(childCount);
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
                        z10 = false;
                    }
                }
                f11 = y10 - measuredHeight;
                z10 = true;
                float height = frameLayout.getHeight() + f11;
                if (z10 && height >= 0.0f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (l1Var.f8479t0 != z11) {
                    l1Var.f8479t0 = z11;
                    if (z11) {
                        view.setVisibility(0);
                    }
                    ViewPropertyAnimator animate2 = view.animate();
                    if (z11) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    animate2.alpha(f12).setDuration(200L).withEndAction(new eh.f(1, l1Var, z11)).start();
                }
                if (f11 <= 0.0f) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.0f);
                }
                l1Var.G = dp;
                if (!z10) {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                frameLayout.setTranslationY(f11);
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 31 && eVar != null) {
                    eVar.f(i9, i10);
                    if (i15 >= 31 && eVar != null) {
                        l1Var.P(1);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((k5) this.f1906b).U.e();
                return;
            case 8:
                la laVar = (la) this.f1906b;
                i51 i51Var = laVar.f8515a;
                if (i51Var.canScrollVertically(1)) {
                    for (int i16 = 0; i16 < i51Var.getChildCount(); i16++) {
                        if (!(i51Var.getChildAt(i16) instanceof e00)) {
                        }
                    }
                    return;
                }
                laVar.h.run();
                return;
            case 9:
                ((hg.v) this.f1906b).c(true);
                return;
            case 10:
                vw vwVar = (vw) this.f1906b;
                vwVar.invalidate();
                vwVar.c();
                x3 x3Var = vwVar.F;
                if (x3Var != null) {
                    x3Var.e(true);
                    return;
                }
                return;
            case 11:
                g5 g5Var = (g5) this.f1906b;
                g5Var.c();
                g5Var.invalidate();
                return;
            case 12:
                kh.w1 w1Var = (kh.w1) this.f1906b;
                kh.u1 u1Var = w1Var.f16229c;
                kh.n2 n2Var = w1Var.f16233r;
                viewGroup = ((org.telegram.ui.ActionBar.f3) n2Var).containerView;
                viewGroup.invalidate();
                z12 = ((org.telegram.ui.ActionBar.f3) n2Var).keyboardVisible;
                if (z12 && w1Var.f16228b.G1 && (g2Var = w1Var.d) != null && g2Var.d != null) {
                    n2Var.n0();
                }
                if (w1Var.f16230e.M0() + 7 >= u1Var.h() - 1) {
                    u1Var.G();
                    return;
                }
                return;
            case 13:
                kh.b2 b2Var = (kh.b2) this.f1906b;
                kh.a2 a2Var = b2Var.f14983c;
                kh.q1 q1Var = b2Var.f14982b;
                kh.n2 n2Var2 = b2Var.f14988s;
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) n2Var2).containerView;
                viewGroup2.invalidate();
                int i17 = -1;
                if (b2Var.f14986n < 0.0f) {
                    i12 = b2Var.d.I0();
                } else {
                    int i18 = 0;
                    while (true) {
                        if (i18 < q1Var.getChildCount()) {
                            View childAt2 = q1Var.getChildAt(i18);
                            if (childAt2.getY() + childAt2.getHeight() > b2Var.f14986n + q1Var.getPaddingTop()) {
                                q1Var.getClass();
                                i12 = RecyclerView.R(childAt2);
                            } else {
                                i18++;
                            }
                        } else {
                            i12 = -1;
                        }
                    }
                    if (i12 == -1) {
                        return;
                    }
                }
                int size = a2Var.f14888y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = a2Var.f14888y.keyAt(size);
                        int valueAt = a2Var.f14888y.valueAt(size);
                        if (i12 >= keyAt) {
                            i17 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i17 >= 0) {
                    b2Var.f14984e.j(i17, true);
                }
                z13 = ((org.telegram.ui.ActionBar.f3) n2Var2).keyboardVisible;
                if (z13 && q1Var.G1 && (g2Var2 = b2Var.f14985f) != null && g2Var2.d != null) {
                    n2Var2.n0();
                    return;
                }
                return;
            case 14:
                df dfVar = (df) this.f1906b;
                View m10 = dfVar.f18206c.getLayoutManager().m(0);
                float f14 = 0.0f;
                if (m10 != null) {
                    f13 = m10.getY();
                } else {
                    f13 = 0.0f;
                }
                if (f13 >= 0.0f) {
                    f14 = f13;
                }
                dfVar.h = f14;
                dfVar.b();
                return;
            case 15:
                u3 u3Var = (u3) this.f1906b;
                long j10 = u3Var.L;
                int i19 = 0;
                while (true) {
                    if (i19 < u3Var.f44314c.getChildCount()) {
                        if (!(u3Var.f44314c.getChildAt(i19) instanceof e00)) {
                            i19++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                gh.c0.g(u3.B0(u3Var)).d(j10).a();
                gh.c0.g(u3.C0(u3Var)).e(j10).a();
                return;
            case 16:
                nh.r rVar2 = (nh.r) this.f1906b;
                rVar2.v.b(rVar2.d);
                return;
            case 17:
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((nh.g0) this.f1906b).f18641f).containerView;
                viewGroup3.invalidate();
                return;
            case 18:
                nh.i0 i0Var = (nh.i0) this.f1906b;
                i0Var.h.I.b(i0Var.d);
                return;
            case 19:
                ((org.telegram.messenger.voip.l0) this.f1906b).run();
                return;
            case 20:
                ((org.telegram.ui.Components.e0) this.f1906b).q0();
                return;
            case 21:
                c8 c8Var = (c8) this.f1906b;
                f2.m0 m0Var3 = c8Var.f27399r;
                c8.O(c8Var);
                c8Var.D0();
                if (!c8Var.f27386f) {
                    int L0 = m0Var3.L0();
                    int i20 = 0;
                    if (c8Var.f27400r0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    if (L0 != -1) {
                        i20 = Math.abs(m0Var3.N0() - L0) + 1;
                    }
                    int h = recyclerView.getAdapter().h();
                    MediaController.getInstance().getPlayingMessageObject();
                    if (SharedConfig.playOrderReversed) {
                        if (L0 < 10) {
                            MediaController.getInstance().loadMoreMusic();
                            return;
                        }
                        return;
                    } else if (L0 + i20 > h - 10) {
                        MediaController.getInstance().loadMoreMusic();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((xu0) this.f1906b).invalidate();
                return;
            case 23:
                vi viVar = (vi) this.f1906b;
                viVar.f27493b.X1(viVar, i10);
                return;
            case 24:
                yi yiVar = (yi) this.f1906b;
                if (yiVar.f34973n.getChildCount() > 0) {
                    yiVar.f27493b.X1(yiVar, i10);
                    return;
                }
                return;
            case 25:
                pj pjVar = (pj) this.f1906b;
                pjVar.f27493b.X1(pjVar, i10);
                pjVar.N();
                return;
            case 26:
                fk fkVar = (fk) this.f1906b;
                dj djVar = fkVar.A;
                fkVar.f27493b.X1(fkVar, i10);
                fkVar.T();
                f2.r0 adapter = fkVar.f28459r.getAdapter();
                ek ekVar = fkVar.f28463y;
                if (adapter == ekVar) {
                    int L02 = djVar.L0();
                    int N0 = djVar.N0();
                    int abs = Math.abs(N0 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N0 >= h10 - 10) {
                        ek ekVar2 = ekVar.T.f28463y;
                        if (!ekVar2.O && !ekVar2.R && (m0Var = ekVar.f28052y) != null) {
                            ekVar.Z(ekVar.f28051x, ekVar.A, ekVar.B, m0Var, ekVar.F, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 27:
                gk gkVar = (gk) this.f1906b;
                gkVar.f27493b.X1(gkVar, i10);
                gkVar.v.setTranslationY(Math.max(0, gkVar.getCurrentItemTop()));
                return;
            case 28:
            default:
                return;
            case 29:
                jn jnVar = (jn) this.f1906b;
                dj djVar2 = jnVar.f29796w;
                jnVar.f27493b.X1(jnVar, i10);
                zm zmVar = jnVar.f29798x;
                if (zmVar != null && zmVar.f33165s) {
                    sx0 delegate = zmVar.getDelegate();
                    if (delegate instanceof c6) {
                        va1 va1Var = jnVar.f29791s;
                        View F = va1Var.F((c6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = va1Var.T(F);
                        }
                        if (T != null) {
                            View view2 = T.f5501a;
                            int b10 = T.b();
                            if (zmVar.getDirection() == 0) {
                                zmVar.setTranslationY((view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight());
                            } else {
                                zmVar.setTranslationY(view2.getY());
                            }
                            if (b10 < djVar2.L0() || b10 > djVar2.N0()) {
                                zmVar.f();
                            }
                        } else {
                            zmVar.f();
                        }
                    } else {
                        zmVar.f();
                    }
                }
                if (i10 != 0 && (s30Var = jnVar.f29800y) != null) {
                    s30Var.b(true);
                    return;
                }
                return;
        }
    }
}
