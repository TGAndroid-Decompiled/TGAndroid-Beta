package ai;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.yn;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.jx;
import org.telegram.ui.xb1;
public final class r extends s4.s0 {
    public final int f1571a;
    public final Object f1572b;

    public r(Object obj, int i10) {
        this.f1571a = i10;
        this.f1572b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        il0 il0Var;
        int i11;
        il0 il0Var2;
        il0 il0Var3;
        int top;
        int i12;
        il0 il0Var4;
        il0 il0Var5;
        int top2;
        boolean z10;
        switch (this.f1571a) {
            case 2:
                ci.e2 e2Var = (ci.e2) this.f1572b;
                if (i10 == 0 && e2Var.f4978n >= 0.0f && !e2Var.f4974b.canScrollVertically(-1)) {
                    e2Var.f4978n = -1.0f;
                    return;
                }
                return;
            case 7:
                fi.h0 h0Var = (fi.h0) this.f1572b;
                if (i10 == 0) {
                    h0Var.f9901e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 11:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hg.e2) this.f1572b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                ((li.p) this.f1572b).f15674e++;
                return;
            case 15:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f1572b;
                org.telegram.ui.Components.u7 u7Var = j8Var.f27716n;
                if (i10 == 0) {
                    if (org.telegram.ui.Components.j8.j0(j8Var) + ((j8Var.A0 - org.telegram.ui.Components.j8.i0(j8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && u7Var.canScrollVertically(1) && (il0Var = (il0) u7Var.K(j8Var.f27727v0 ? 1 : 0)) != null) {
                        View view = il0Var.f46538a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            u7Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(j8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 18:
                mj mjVar = (mj) this.f1572b;
                w0 w0Var = mjVar.f28713n;
                xi xiVar = mjVar.f29741b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = xiVar.f32893a1;
                    if (v0Var != null) {
                        i11 = AndroidUtilities.dp(v0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = xiVar.getBackgroundPaddingTop();
                    if (((xiVar.f32897b2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var2 = (il0) w0Var.K(0)) != null) {
                        View view2 = il0Var2.f46538a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            w0Var.w0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                rk rkVar = (rk) this.f1572b;
                gk gkVar = rkVar.f30521r;
                xi xiVar2 = rkVar.f29741b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = xiVar2.getBackgroundPaddingTop();
                    if (((xiVar2.f32897b2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var3 = (il0) gkVar.K(0)) != null && (top = (il0Var3.f46538a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        gkVar.w0(0, top, null);
                    }
                }
                if (i10 == 1 && rkVar.f30515b0 && gkVar.getAdapter() == rkVar.f30525y) {
                    AndroidUtilities.hideKeyboard(xiVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                rkVar.U = z11;
                return;
            case 21:
                sk skVar = (sk) this.f1572b;
                zl0 zl0Var = skVar.f30812r;
                xi xiVar3 = skVar.f29741b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var2 = xiVar3.f32893a1;
                    if (v0Var2 != null) {
                        i12 = AndroidUtilities.dp(v0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = xiVar3.getBackgroundPaddingTop();
                    if (((xiVar3.f32897b2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var4 = (il0) zl0Var.K(0)) != null) {
                        View view3 = il0Var4.f46538a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            zl0Var.w0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    jl jlVar = (jl) this.f1572b;
                    if (jlVar.f27887l0 && jlVar.m0) {
                        AndroidUtilities.hideKeyboard(jlVar.f29741b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 23:
                xn xnVar = (xn) this.f1572b;
                xb1 xb1Var = xnVar.f33034s;
                xi xiVar4 = xnVar.f29741b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = xiVar4.getBackgroundPaddingTop();
                    if (((xiVar4.f32897b2[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var5 = (il0) xb1Var.K(1)) != null && (top2 = (il0Var5.f46538a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        xb1Var.w0(0, top2, null);
                    }
                    int i15 = xnVar.W0;
                    if (i15 >= 0) {
                        xn.I(xnVar, i15);
                        xnVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 29:
                ab0 ab0Var = (ab0) this.f1572b;
                boolean z12 = false;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ab0Var.f24579e3 = z10;
                if (i10 == 1) {
                    z12 = true;
                }
                ab0Var.f24580f3 = z12;
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        ci.l2 l2Var;
        int i12;
        ci.l2 l2Var2;
        boolean z10;
        float f7;
        gg.q0 q0Var;
        m40 m40Var;
        s4.c1 T;
        int N0;
        int i13;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.f1571a) {
            case 0:
                jx jxVar = (jx) this.f1572b;
                jxVar.invalidate();
                jxVar.c();
                ci.e4 e4Var = jxVar.J;
                if (e4Var != null) {
                    e4Var.e(true);
                    return;
                }
                return;
            case 1:
                ci.z1 z1Var = (ci.z1) this.f1572b;
                ci.w1 w1Var = z1Var.f6362c;
                ci.s2 s2Var = z1Var.f6366r;
                ci.s2.t(s2Var).invalidate();
                if (ci.s2.E(s2Var) && z1Var.f6361b.K1 && (l2Var = z1Var.d) != null && l2Var.d != null) {
                    s2Var.o0();
                }
                if (z1Var.f6363e.M0() + 7 >= w1Var.h() - 1) {
                    w1Var.G();
                    return;
                }
                return;
            case 2:
                ci.e2 e2Var = (ci.e2) this.f1572b;
                ci.d2 d2Var = e2Var.f4975c;
                ci.p1 p1Var = e2Var.f4974b;
                ci.s2 s2Var2 = e2Var.f4980s;
                ci.s2.H(s2Var2).invalidate();
                int i14 = -1;
                if (e2Var.f4978n < 0.0f) {
                    i12 = e2Var.d.I0();
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 < p1Var.getChildCount()) {
                            View childAt = p1Var.getChildAt(i15);
                            if (childAt.getY() + childAt.getHeight() > e2Var.f4978n + p1Var.getPaddingTop()) {
                                p1Var.getClass();
                                i12 = RecyclerView.R(childAt);
                            } else {
                                i15++;
                            }
                        } else {
                            i12 = -1;
                        }
                    }
                    if (i12 == -1) {
                        return;
                    }
                }
                int size = d2Var.f4903y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = d2Var.f4903y.keyAt(size);
                        int valueAt = d2Var.f4903y.valueAt(size);
                        if (i12 >= keyAt) {
                            i14 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i14 >= 0) {
                    e2Var.f4976e.j(i14, true);
                }
                if (ci.s2.I(s2Var2) && p1Var.K1 && (l2Var2 = e2Var.f4977f) != null && l2Var2.d != null) {
                    s2Var2.o0();
                    return;
                }
                return;
            case 3:
                di.k kVar = (di.k) this.f1572b;
                le.b bVar = kVar.V;
                if (!kVar.f39950c.canScrollVertically(-1) && !di.k.F0(kVar).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                bVar.a(z10, true);
                return;
            case 4:
                pf pfVar = (pf) this.f1572b;
                View m10 = pfVar.f9497c.getLayoutManager().m(0);
                float f10 = 0.0f;
                if (m10 != null) {
                    f7 = m10.getY();
                } else {
                    f7 = 0.0f;
                }
                if (f7 >= 0.0f) {
                    f10 = f7;
                }
                pfVar.h = f10;
                pfVar.b();
                return;
            case 5:
                ei.f4 f4Var = (ei.f4) this.f1572b;
                long j3 = f4Var.P;
                int i16 = 0;
                while (true) {
                    if (i16 < f4Var.f39950c.getChildCount()) {
                        if (!(f4Var.f39950c.getChildAt(i16) instanceof w00)) {
                            i16++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                yh.p.g(ei.f4.H0(f4Var)).d(j3).a();
                yh.p.g(ei.f4.I0(f4Var)).e(j3).a();
                return;
            case 6:
                fi.s sVar = (fi.s) this.f1572b;
                sVar.v.b(sVar.d);
                return;
            case 7:
                fi.k0.K(((fi.h0) this.f1572b).f9902f).invalidate();
                return;
            case 8:
                fi.j0 j0Var = (fi.j0) this.f1572b;
                j0Var.h.M.b(j0Var.d);
                return;
            case 9:
                hg.n.b0((hg.n) this.f1572b);
                return;
            case 10:
                hg.j0 j0Var2 = (hg.j0) this.f1572b;
                j0Var2.f29741b.W1(j0Var2, i11);
                j0Var2.K();
                return;
            case 11:
            case 22:
            default:
                return;
            case 12:
                ((li.p) this.f1572b).h(i10, i11);
                return;
            case 13:
                ((ki.h0) this.f1572b).run();
                return;
            case 14:
                ((org.telegram.ui.Components.e0) this.f1572b).r0();
                return;
            case 15:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f1572b;
                s4.c0 c0Var = j8Var.f27721r;
                org.telegram.ui.Components.j8.N(j8Var);
                j8Var.E0();
                if (!j8Var.f27708f) {
                    int L0 = c0Var.L0();
                    int i17 = 0;
                    if (j8Var.f27727v0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    if (L0 != -1) {
                        i17 = Math.abs(c0Var.N0() - L0) + 1;
                    }
                    int h = recyclerView.getAdapter().h();
                    MediaController.getInstance().getPlayingMessageObject();
                    if (SharedConfig.playOrderReversed) {
                        if (L0 < 10) {
                            MediaController.getInstance().loadMoreMusic();
                            return;
                        }
                        return;
                    } else if (L0 + i17 > h - 10) {
                        MediaController.getInstance().loadMoreMusic();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                ((mw0) this.f1572b).invalidate();
                return;
            case 17:
                jj jjVar = (jj) this.f1572b;
                jjVar.f29741b.W1(jjVar, i11);
                return;
            case 18:
                mj mjVar = (mj) this.f1572b;
                if (mjVar.f28713n.getChildCount() > 0) {
                    mjVar.f29741b.W1(mjVar, i11);
                    return;
                }
                return;
            case 19:
                bk bkVar = (bk) this.f1572b;
                bkVar.f29741b.W1(bkVar, i11);
                bkVar.M();
                return;
            case 20:
                rk rkVar = (rk) this.f1572b;
                hg.f0 f0Var = rkVar.E;
                rkVar.f29741b.W1(rkVar, i11);
                rkVar.S();
                s4.h0 adapter = rkVar.f30521r.getAdapter();
                qk qkVar = rkVar.f30525y;
                if (adapter == qkVar) {
                    int L02 = f0Var.L0();
                    int N02 = f0Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h10 - 10) {
                        qk qkVar2 = qkVar.X.f30525y;
                        if (!qkVar2.S && !qkVar2.V && (q0Var = qkVar.f30084y) != null) {
                            qkVar.Z(qkVar.f30083x, qkVar.E, qkVar.F, q0Var, qkVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                sk skVar = (sk) this.f1572b;
                skVar.f29741b.W1(skVar, i11);
                skVar.v.setTranslationY(Math.max(0, skVar.getCurrentItemTop()));
                return;
            case 23:
                xn xnVar = (xn) this.f1572b;
                hg.f0 f0Var2 = xnVar.f33039w;
                xnVar.f29741b.W1(xnVar, i11);
                mn mnVar = xnVar.f33041x;
                if (mnVar != null && mnVar.f28009s) {
                    hz0 delegate = mnVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        xb1 xb1Var = xnVar.f33034s;
                        View F = xb1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = xb1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f46538a;
                            int b10 = T.b();
                            if (mnVar.getDirection() == 0) {
                                mnVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                mnVar.setTranslationY(view.getY());
                            }
                            if (b10 < f0Var2.L0() || b10 > f0Var2.N0()) {
                                mnVar.f();
                            }
                        } else {
                            mnVar.f();
                        }
                    } else {
                        mnVar.f();
                    }
                }
                if (i11 != 0 && (m40Var = xnVar.f33043y) != null) {
                    m40Var.b(true);
                    return;
                }
                return;
            case 24:
                yn ynVar = (yn) this.f1572b;
                ynVar.f29741b.W1(ynVar, i11);
                return;
            case 25:
                pp ppVar = (pp) this.f1572b;
                if (ppVar.f29796x.M0() + 10 >= ppVar.h.h()) {
                    ppVar.w();
                    return;
                }
                return;
            case 26:
                wv wvVar = (wv) this.f1572b;
                mv mvVar = wvVar.f32713f;
                if (mvVar != null && wvVar.h.K1 && mvVar.f28818w) {
                    mvVar.f28818w = false;
                    mvVar.invalidate();
                    return;
                }
                return;
            case 27:
                n00 n00Var = (n00) this.f1572b;
                n00Var.F.invalidate();
                n00Var.invalidate();
                return;
            case 28:
                q00.E((q00) this.f1572b);
                return;
            case 29:
                ab0 ab0Var = (ab0) this.f1572b;
                s4.o0 layoutManager = ab0Var.getLayoutManager();
                bb0 bb0Var = ab0Var.f24583i3;
                ua0 ua0Var = bb0Var.d;
                if (layoutManager == ua0Var) {
                    N0 = ua0Var.N0();
                } else {
                    N0 = bb0Var.f24928c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    gg.k1 k1Var = bb0Var.f24930f;
                    if (N0 > k1Var.M0 - 5 && k1Var.f10693u0 == 0 && (str = k1Var.f10691s0) != null && str.length() != 0 && (user = k1Var.f10696w0) != null && (str2 = k1Var.f10689r0) != null) {
                        k1Var.T(true, user, str2, k1Var.f10691s0);
                    }
                }
                ab0Var.canScrollVertically(1);
                bb0Var.n(!ab0Var.canScrollVertically(-1));
                bb0Var.b();
                return;
        }
    }
}
