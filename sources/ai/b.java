package ai;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.ad;
import bi.dd;
import bi.h7;
import bi.x1;
import fi.l2;
import fi.v3;
import fi.y1;
import fi.z1;
import hi.d4;
import jg.f2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.r5;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.xj;
import org.telegram.ui.qw;
public final class b extends s4.u0 {
    public final int f1435a;
    public final Object f1436b;

    public b(Object obj, int i10) {
        this.f1435a = i10;
        this.f1436b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        vl0 vl0Var;
        int i11;
        vl0 vl0Var2;
        vl0 vl0Var3;
        int top;
        int i12;
        vl0 vl0Var4;
        switch (this.f1435a) {
            case 0:
                d dVar = (d) this.f1436b;
                boolean z10 = true;
                if (i10 != 1) {
                    z10 = false;
                }
                dVar.f1457c0 = z10;
                if (i10 != 0) {
                    dVar.f1453a0 = d.b();
                }
                dVar.invalidate();
                return;
            case 1:
                if (i10 == 0) {
                    ((x0) this.f1436b).v = false;
                    return;
                }
                return;
            case 10:
                z1 z1Var = (z1) this.f1436b;
                if (i10 == 0 && z1Var.f12053n >= 0.0f && !z1Var.f12050b.canScrollVertically(-1)) {
                    z1Var.f12053n = -1.0f;
                    return;
                }
                return;
            case 15:
                ii.g0 g0Var = (ii.g0) this.f1436b;
                if (i10 == 0) {
                    g0Var.e = !g0Var.d.canScrollVertically(-1);
                    g0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 19:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((f2) this.f1436b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 20:
                ((oi.q) this.f1436b).e++;
                return;
            case 23:
                m8 m8Var = (m8) this.f1436b;
                x7 x7Var = m8Var.f30435n;
                if (i10 == 0) {
                    if (m8.m0(m8Var) + ((m8Var.f30453z0 - m8.l0(m8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && x7Var.canScrollVertically(1) && (vl0Var = (vl0) x7Var.K(m8Var.f30445u0 ? 1 : 0)) != null) {
                        View view = vl0Var.f47735a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            x7Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(m8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 26:
                ij ijVar = (ij) this.f1436b;
                bi.r1 r1Var = ijVar.f29295n;
                ti tiVar = ijVar.f30213b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = tiVar.f33012d1;
                    if (w0Var != null) {
                        i11 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
                    if (((tiVar.f33016e2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vl0Var2 = (vl0) r1Var.K(0)) != null) {
                        View view2 = vl0Var2.f47735a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            r1Var.w0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 28:
                nk nkVar = (nk) this.f1436b;
                ck ckVar = nkVar.f31032r;
                ti tiVar2 = nkVar.f30213b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = tiVar2.getBackgroundPaddingTop();
                    if (((tiVar2.f33016e2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vl0Var3 = (vl0) ckVar.K(0)) != null && (top = (vl0Var3.f47735a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        ckVar.w0(0, top, null);
                    }
                }
                if (i10 == 1 && nkVar.f31026b0 && ckVar.getAdapter() == nkVar.f31036y) {
                    AndroidUtilities.hideKeyboard(tiVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                nkVar.U = z11;
                return;
            case 29:
                ok okVar = (ok) this.f1436b;
                mm0 mm0Var = okVar.f31318r;
                ti tiVar3 = okVar.f30213b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var2 = tiVar3.f33012d1;
                    if (w0Var2 != null) {
                        i12 = AndroidUtilities.dp(w0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = tiVar3.getBackgroundPaddingTop();
                    if (((tiVar3.f33016e2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vl0Var4 = (vl0) mm0Var.K(0)) != null) {
                        View view3 = vl0Var4.f47735a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            mm0Var.w0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
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
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        float f7;
        int dp;
        float f10;
        float y3;
        int measuredHeight;
        boolean z11;
        r5 r5Var;
        fi.f2 f2Var;
        int i13;
        fi.f2 f2Var2;
        boolean z12;
        float f11;
        ig.p0 p0Var;
        switch (this.f1435a) {
            case 0:
                d dVar = (d) this.f1436b;
                if (i11 != 0) {
                    dVar.f1453a0 = d.b();
                    dVar.invalidate();
                    return;
                }
                return;
            case 1:
                x0 x0Var = (x0) this.f1436b;
                if (!x0Var.v) {
                    x0Var.h.a(x0Var.f(x0Var.c()), true);
                    return;
                }
                return;
            case 2:
                ((bh.x) this.f1436b).c(true);
                return;
            case 3:
                bi.x xVar = (bi.x) this.f1436b;
                a3.d dVar2 = xVar.f5638n;
                if (!recyclerView.canScrollVertically(1)) {
                    xVar.removeCallbacks(dVar2);
                    xVar.post(dVar2);
                    return;
                }
                return;
            case 4:
                x1 x1Var = (x1) this.f1436b;
                View view = x1Var.f5657q0;
                FrameLayout frameLayout = x1Var.f5653l0;
                mm0 mm0Var = x1Var.d;
                boolean z13 = true;
                int childCount = mm0Var.getChildCount() - 1;
                while (true) {
                    i12 = 0;
                    if (childCount >= 0) {
                        View childAt = mm0Var.getChildAt(childCount);
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            if (R == 2) {
                                y3 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            } else if (R == 1) {
                                f7 = childAt.getY();
                            } else if (R == 0) {
                                y3 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            }
                        }
                        childCount--;
                    } else {
                        z10 = false;
                        f7 = 0.0f;
                    }
                }
                f7 = y3 - measuredHeight;
                z10 = true;
                float height = frameLayout.getHeight() + f7;
                if (z10 && height >= 0.0f) {
                    z13 = false;
                }
                if (x1Var.f5662v0 != z13) {
                    x1Var.f5662v0 = z13;
                    if (z13) {
                        view.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    if (z13) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).setDuration(200L).withEndAction(new bh.n(1, x1Var, z13)).start();
                }
                if (f7 <= 0.0f) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.0f);
                }
                x1Var.K = dp;
                if (!z10) {
                    i12 = 8;
                }
                frameLayout.setVisibility(i12);
                frameLayout.setTranslationY(f7);
                return;
            case 5:
                ((h7) this.f1436b).Y.e();
                return;
            case 6:
                dd ddVar = (dd) this.f1436b;
                oe.b bVar = ddVar.X;
                if (!ddVar.f38713c.canScrollVertically(-1)) {
                    r5Var = ((r2) ddVar).simpleActionBar;
                    if (!r5Var.o()) {
                        z11 = false;
                        bVar.a(z11, true);
                        return;
                    }
                }
                z11 = true;
                bVar.a(z11, true);
                return;
            case 7:
                ad adVar = (ad) this.f1436b;
                r71 r71Var = adVar.f4289a;
                if (r71Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < r71Var.getChildCount(); i14++) {
                        if (!(r71Var.getChildAt(i14) instanceof c10)) {
                        }
                    }
                    return;
                }
                adVar.h.run();
                return;
            case 8:
                qw qwVar = (qw) this.f1436b;
                qwVar.invalidate();
                qwVar.c();
                v3 v3Var = qwVar.J;
                if (v3Var != null) {
                    v3Var.e(true);
                    return;
                }
                return;
            case 9:
                fi.u1 u1Var = (fi.u1) this.f1436b;
                fi.s1 s1Var = u1Var.f11743c;
                l2 l2Var = u1Var.f11746r;
                l2.t(l2Var).invalidate();
                if (l2.G(l2Var) && u1Var.f11742b.I1 && (f2Var = u1Var.d) != null && f2Var.e != null) {
                    l2Var.q0();
                }
                if (u1Var.e.M0() + 7 >= s1Var.h() - 1) {
                    s1Var.G();
                    return;
                }
                return;
            case 10:
                z1 z1Var = (z1) this.f1436b;
                y1 y1Var = z1Var.f12051c;
                fi.n1 n1Var = z1Var.f12050b;
                l2 l2Var2 = z1Var.f12055s;
                l2.J(l2Var2).invalidate();
                int i15 = -1;
                if (z1Var.f12053n < 0.0f) {
                    i13 = z1Var.d.I0();
                } else {
                    int i16 = 0;
                    while (true) {
                        if (i16 < n1Var.getChildCount()) {
                            View childAt2 = n1Var.getChildAt(i16);
                            if (childAt2.getY() + childAt2.getHeight() > z1Var.f12053n + n1Var.getPaddingTop()) {
                                n1Var.getClass();
                                i13 = RecyclerView.R(childAt2);
                            } else {
                                i16++;
                            }
                        } else {
                            i13 = -1;
                        }
                    }
                    if (i13 == -1) {
                        return;
                    }
                }
                int size = y1Var.f11991y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = y1Var.f11991y.keyAt(size);
                        int valueAt = y1Var.f11991y.valueAt(size);
                        if (i13 >= keyAt) {
                            i15 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i15 >= 0) {
                    z1Var.e.j(i15, true);
                }
                if (l2.K(l2Var2) && n1Var.I1 && (f2Var2 = z1Var.f12052f) != null && f2Var2.e != null) {
                    l2Var2.q0();
                    return;
                }
                return;
            case 11:
                gi.h hVar = (gi.h) this.f1436b;
                oe.b bVar2 = hVar.X;
                if (!hVar.f38713c.canScrollVertically(-1) && !gi.h.y0(hVar).o()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                bVar2.a(z12, true);
                return;
            case 12:
                nf nfVar = (nf) this.f1436b;
                View m10 = nfVar.f12949c.getLayoutManager().m(0);
                float f12 = 0.0f;
                if (m10 != null) {
                    f11 = m10.getY();
                } else {
                    f11 = 0.0f;
                }
                if (f11 >= 0.0f) {
                    f12 = f11;
                }
                nfVar.h = f12;
                nfVar.b();
                return;
            case 13:
                d4 d4Var = (d4) this.f1436b;
                long j10 = d4Var.R;
                int i17 = 0;
                while (true) {
                    if (i17 < d4Var.f38713c.getChildCount()) {
                        if (!(d4Var.f38713c.getChildAt(i17) instanceof c10)) {
                            i17++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                bi.m0.g(d4.B0(d4Var)).d(j10).a();
                bi.m0.g(d4.C0(d4Var)).e(j10).a();
                return;
            case 14:
                ii.r rVar = (ii.r) this.f1436b;
                rVar.v.b(rVar.d);
                return;
            case 15:
                ii.j0.W(((ii.g0) this.f1436b).f14350f).invalidate();
                return;
            case 16:
                ii.i0 i0Var = (ii.i0) this.f1436b;
                i0Var.h.M.b(i0Var.d);
                return;
            case 17:
                jg.n.c0((jg.n) this.f1436b);
                return;
            case 18:
                jg.i0 i0Var2 = (jg.i0) this.f1436b;
                i0Var2.f30213b.e2(i0Var2, i11);
                i0Var2.P();
                return;
            case 19:
            default:
                return;
            case 20:
                ((oi.q) this.f1436b).h(i10, i11);
                return;
            case 21:
                ((org.telegram.messenger.voip.m0) this.f1436b).run();
                return;
            case 22:
                ((org.telegram.ui.Components.e0) this.f1436b).r0();
                return;
            case 23:
                m8 m8Var = (m8) this.f1436b;
                s4.c0 c0Var = m8Var.f30440r;
                m8.P(m8Var);
                m8Var.K0();
                if (!m8Var.f30427f) {
                    int L0 = c0Var.L0();
                    int i18 = 0;
                    if (m8Var.f30445u0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    if (L0 != -1) {
                        i18 = Math.abs(c0Var.N0() - L0) + 1;
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
            case 24:
                ((vw0) this.f1436b).invalidate();
                return;
            case 25:
                fj fjVar = (fj) this.f1436b;
                fjVar.f30213b.e2(fjVar, i11);
                return;
            case 26:
                ij ijVar = (ij) this.f1436b;
                if (ijVar.f29295n.getChildCount() > 0) {
                    ijVar.f30213b.e2(ijVar, i11);
                    return;
                }
                return;
            case 27:
                xj xjVar = (xj) this.f1436b;
                xjVar.f30213b.e2(xjVar, i11);
                xjVar.R();
                return;
            case 28:
                nk nkVar = (nk) this.f1436b;
                jg.e0 e0Var = nkVar.E;
                nkVar.f30213b.e2(nkVar, i11);
                nkVar.X();
                s4.h0 adapter = nkVar.f31032r.getAdapter();
                mk mkVar = nkVar.f31036y;
                if (adapter == mkVar) {
                    int L02 = e0Var.L0();
                    int N0 = e0Var.N0();
                    int abs = Math.abs(N0 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N0 >= h10 - 10) {
                        mk mkVar2 = mkVar.X.f31036y;
                        if (!mkVar2.S && !mkVar2.V && (p0Var = mkVar.f30607y) != null) {
                            mkVar.Z(mkVar.f30606x, mkVar.E, mkVar.F, p0Var, mkVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 29:
                ok okVar = (ok) this.f1436b;
                okVar.f30213b.e2(okVar, i11);
                okVar.v.setTranslationY(Math.max(0, okVar.getCurrentItemTop()));
                return;
        }
    }
}
