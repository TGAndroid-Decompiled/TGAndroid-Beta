package ai;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.vv;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.yn;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.hx;
import org.telegram.ui.wb1;
public final class r extends s4.s0 {
    public final int f1450a;
    public final Object f1451b;

    public r(Object obj, int i10) {
        this.f1450a = i10;
        this.f1451b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        jl0 jl0Var;
        int i13;
        jl0 jl0Var2;
        jl0 jl0Var3;
        int top;
        int i14;
        jl0 jl0Var4;
        jl0 jl0Var5;
        int top2;
        boolean z10;
        switch (this.f1450a) {
            case 2:
                ci.e2 e2Var = (ci.e2) this.f1451b;
                if (i10 == 0 && e2Var.f4604n >= 0.0f && !e2Var.f4601b.canScrollVertically(-1)) {
                    e2Var.f4604n = -1.0f;
                    return;
                }
                return;
            case 6:
                fi.h0 h0Var = (fi.h0) this.f1451b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 10:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hg.f2) this.f1451b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                ((li.e) this.f1451b).f14375f++;
                return;
            case 14:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f1451b;
                org.telegram.ui.Components.u7 u7Var = j8Var.f25328n;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = j8Var.A0;
                    i11 = ((org.telegram.ui.ActionBar.e3) j8Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.e3) j8Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && u7Var.canScrollVertically(1) && (jl0Var = (jl0) u7Var.K(j8Var.f25339v0 ? 1 : 0)) != null) {
                        View view = jl0Var.f43068a;
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
            case 17:
                mj mjVar = (mj) this.f1451b;
                w0 w0Var = mjVar.f26304n;
                xi xiVar = mjVar.f27362b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = xiVar.f30254a1;
                    if (u0Var != null) {
                        i13 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i13 = 0;
                    }
                    int i17 = dp2 + i13;
                    int backgroundPaddingTop = xiVar.getBackgroundPaddingTop();
                    if (((xiVar.f30258b2[0] - backgroundPaddingTop) - i17) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (jl0Var2 = (jl0) w0Var.K(0)) != null) {
                        View view2 = jl0Var2.f43068a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            w0Var.w0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 19:
                rk rkVar = (rk) this.f1451b;
                gk gkVar = rkVar.f28045r;
                xi xiVar2 = rkVar.f27362b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = xiVar2.getBackgroundPaddingTop();
                    if (((xiVar2.f30258b2[0] - backgroundPaddingTop2) - dp3) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (jl0Var3 = (jl0) gkVar.K(0)) != null && (top = (jl0Var3.f43068a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        gkVar.w0(0, top, null);
                    }
                }
                if (i10 == 1 && rkVar.f28039b0 && gkVar.getAdapter() == rkVar.f28049y) {
                    AndroidUtilities.hideKeyboard(xiVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                rkVar.U = z11;
                return;
            case 20:
                sk skVar = (sk) this.f1451b;
                zl0 zl0Var = skVar.f28278r;
                xi xiVar3 = skVar.f27362b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var2 = xiVar3.f30254a1;
                    if (u0Var2 != null) {
                        i14 = AndroidUtilities.dp(u0Var2.getAlpha() * 26.0f);
                    } else {
                        i14 = 0;
                    }
                    int i18 = dp4 + i14;
                    int backgroundPaddingTop3 = xiVar3.getBackgroundPaddingTop();
                    if (((xiVar3.f30258b2[0] - backgroundPaddingTop3) - i18) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (jl0Var4 = (jl0) zl0Var.K(0)) != null) {
                        View view3 = jl0Var4.f43068a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            zl0Var.w0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                if (i10 == 1) {
                    jl jlVar = (jl) this.f1451b;
                    if (jlVar.f25495l0 && jlVar.m0) {
                        AndroidUtilities.hideKeyboard(jlVar.f27362b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 22:
                xn xnVar = (xn) this.f1451b;
                wb1 wb1Var = xnVar.f30414s;
                xi xiVar4 = xnVar.f27362b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = xiVar4.getBackgroundPaddingTop();
                    if (((xiVar4.f30258b2[0] - backgroundPaddingTop4) - dp5) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (jl0Var5 = (jl0) wb1Var.K(1)) != null && (top2 = (jl0Var5.f43068a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        wb1Var.w0(0, top2, null);
                    }
                    int i19 = xnVar.W0;
                    if (i19 >= 0) {
                        xn.K(xnVar, i19);
                        xnVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 28:
                bb0 bb0Var = (bb0) this.f1451b;
                boolean z12 = false;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bb0Var.f22912e3 = z10;
                if (i10 == 1) {
                    z12 = true;
                }
                bb0Var.f22913f3 = z12;
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        boolean z10;
        ci.l2 l2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z11;
        ci.l2 l2Var2;
        float f7;
        ViewGroup viewGroup3;
        gg.q0 q0Var;
        m40 m40Var;
        s4.c1 T;
        int N0;
        int i13;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.f1450a) {
            case 0:
                hx hxVar = (hx) this.f1451b;
                hxVar.invalidate();
                hxVar.c();
                ci.e4 e4Var = hxVar.J;
                if (e4Var != null) {
                    e4Var.e(true);
                    return;
                }
                return;
            case 1:
                ci.z1 z1Var = (ci.z1) this.f1451b;
                ci.w1 w1Var = z1Var.f5915c;
                ci.s2 s2Var = z1Var.f5918r;
                viewGroup = ((org.telegram.ui.ActionBar.e3) s2Var).containerView;
                viewGroup.invalidate();
                z10 = ((org.telegram.ui.ActionBar.e3) s2Var).keyboardVisible;
                if (z10 && z1Var.f5914b.K1 && (l2Var = z1Var.d) != null && l2Var.d != null) {
                    s2Var.o0();
                }
                if (z1Var.e.M0() + 7 >= w1Var.h() - 1) {
                    w1Var.G();
                    return;
                }
                return;
            case 2:
                ci.e2 e2Var = (ci.e2) this.f1451b;
                ci.d2 d2Var = e2Var.f4602c;
                ci.p1 p1Var = e2Var.f4601b;
                ci.s2 s2Var2 = e2Var.f4606s;
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) s2Var2).containerView;
                viewGroup2.invalidate();
                int i14 = -1;
                if (e2Var.f4604n < 0.0f) {
                    i12 = e2Var.d.I0();
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 < p1Var.getChildCount()) {
                            View childAt = p1Var.getChildAt(i15);
                            if (childAt.getY() + childAt.getHeight() > e2Var.f4604n + p1Var.getPaddingTop()) {
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
                int size = d2Var.f4516y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = d2Var.f4516y.keyAt(size);
                        int valueAt = d2Var.f4516y.valueAt(size);
                        if (i12 >= keyAt) {
                            i14 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i14 >= 0) {
                    e2Var.e.j(i14, true);
                }
                z11 = ((org.telegram.ui.ActionBar.e3) s2Var2).keyboardVisible;
                if (z11 && p1Var.K1 && (l2Var2 = e2Var.f4603f) != null && l2Var2.d != null) {
                    s2Var2.o0();
                    return;
                }
                return;
            case 3:
                pf pfVar = (pf) this.f1451b;
                View m10 = pfVar.f8734c.getLayoutManager().m(0);
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
            case 4:
                ei.e4 e4Var2 = (ei.e4) this.f1451b;
                long j3 = e4Var2.P;
                int i16 = 0;
                while (true) {
                    if (i16 < e4Var2.f35539c.getChildCount()) {
                        if (!(e4Var2.f35539c.getChildAt(i16) instanceof w00)) {
                            i16++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                yh.o.g(ei.e4.C0(e4Var2)).d(j3).a();
                yh.o.g(ei.e4.D0(e4Var2)).e(j3).a();
                return;
            case 5:
                fi.s sVar = (fi.s) this.f1451b;
                sVar.v.b(sVar.d);
                return;
            case 6:
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) ((fi.h0) this.f1451b).f9107f).containerView;
                viewGroup3.invalidate();
                return;
            case 7:
                fi.j0 j0Var = (fi.j0) this.f1451b;
                j0Var.h.M.b(j0Var.d);
                return;
            case 8:
                hg.n.b0((hg.n) this.f1451b);
                return;
            case 9:
                hg.k0 k0Var = (hg.k0) this.f1451b;
                k0Var.f27362b.X1(k0Var, i11);
                k0Var.M();
                return;
            case 10:
            case 21:
            default:
                return;
            case 11:
                ((li.e) this.f1451b).f14375f++;
                return;
            case 12:
                ((ki.h0) this.f1451b).run();
                return;
            case 13:
                ((org.telegram.ui.Components.e0) this.f1451b).r0();
                return;
            case 14:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f1451b;
                s4.c0 c0Var = j8Var.f25333r;
                org.telegram.ui.Components.j8.P(j8Var);
                j8Var.E0();
                if (!j8Var.f25320f) {
                    int L0 = c0Var.L0();
                    int i17 = 0;
                    if (j8Var.f25339v0) {
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
            case 15:
                ((dw0) this.f1451b).invalidate();
                return;
            case 16:
                jj jjVar = (jj) this.f1451b;
                jjVar.f27362b.X1(jjVar, i11);
                return;
            case 17:
                mj mjVar = (mj) this.f1451b;
                if (mjVar.f26304n.getChildCount() > 0) {
                    mjVar.f27362b.X1(mjVar, i11);
                    return;
                }
                return;
            case 18:
                bk bkVar = (bk) this.f1451b;
                bkVar.f27362b.X1(bkVar, i11);
                bkVar.O();
                return;
            case 19:
                rk rkVar = (rk) this.f1451b;
                hg.g0 g0Var = rkVar.E;
                rkVar.f27362b.X1(rkVar, i11);
                rkVar.U();
                s4.h0 adapter = rkVar.f28045r.getAdapter();
                qk qkVar = rkVar.f28049y;
                if (adapter == qkVar) {
                    int L02 = g0Var.L0();
                    int N02 = g0Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h10 - 10) {
                        qk qkVar2 = qkVar.X.f28049y;
                        if (!qkVar2.S && !qkVar2.V && (q0Var = qkVar.f27669y) != null) {
                            qkVar.Z(qkVar.f27668x, qkVar.E, qkVar.F, q0Var, qkVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                sk skVar = (sk) this.f1451b;
                skVar.f27362b.X1(skVar, i11);
                skVar.v.setTranslationY(Math.max(0, skVar.getCurrentItemTop()));
                return;
            case 22:
                xn xnVar = (xn) this.f1451b;
                hg.g0 g0Var2 = xnVar.f30419w;
                xnVar.f27362b.X1(xnVar, i11);
                mn mnVar = xnVar.f30421x;
                if (mnVar != null && mnVar.f22754s) {
                    yy0 delegate = mnVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        wb1 wb1Var = xnVar.f30414s;
                        View F = wb1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = wb1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f43068a;
                            int b10 = T.b();
                            if (mnVar.getDirection() == 0) {
                                mnVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                mnVar.setTranslationY(view.getY());
                            }
                            if (b10 < g0Var2.L0() || b10 > g0Var2.N0()) {
                                mnVar.f();
                            }
                        } else {
                            mnVar.f();
                        }
                    } else {
                        mnVar.f();
                    }
                }
                if (i11 != 0 && (m40Var = xnVar.f30423y) != null) {
                    m40Var.b(true);
                    return;
                }
                return;
            case 23:
                yn ynVar = (yn) this.f1451b;
                ynVar.f27362b.X1(ynVar, i11);
                return;
            case 24:
                pp ppVar = (pp) this.f1451b;
                if (ppVar.f27438x.M0() + 10 >= ppVar.h.h()) {
                    ppVar.w();
                    return;
                }
                return;
            case 25:
                vv vvVar = (vv) this.f1451b;
                lv lvVar = vvVar.f29727f;
                if (lvVar != null && vvVar.h.K1 && lvVar.f26123w) {
                    lvVar.f26123w = false;
                    lvVar.invalidate();
                    return;
                }
                return;
            case 26:
                n00 n00Var = (n00) this.f1451b;
                n00Var.F.invalidate();
                n00Var.invalidate();
                return;
            case 27:
                q00.G((q00) this.f1451b);
                return;
            case 28:
                bb0 bb0Var = (bb0) this.f1451b;
                s4.o0 layoutManager = bb0Var.getLayoutManager();
                cb0 cb0Var = bb0Var.f22916i3;
                va0 va0Var = cb0Var.d;
                if (layoutManager == va0Var) {
                    N0 = va0Var.N0();
                } else {
                    N0 = cb0Var.f23249c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    gg.k1 k1Var = cb0Var.f23250f;
                    if (N0 > k1Var.M0 - 5 && k1Var.f9832u0 == 0 && (str = k1Var.f9830s0) != null && str.length() != 0 && (user = k1Var.f9835w0) != null && (str2 = k1Var.f9828r0) != null) {
                        k1Var.T(true, user, str2, k1Var.f9830s0);
                    }
                }
                bb0Var.canScrollVertically(1);
                cb0Var.n(!bb0Var.canScrollVertically(-1));
                cb0Var.b();
                return;
            case 29:
                cc0 cc0Var = (cc0) this.f1451b;
                org.telegram.ui.w8 w8Var = cc0Var.f23261b;
                vb0 vb0Var = cc0Var.f23265f;
                for (int i18 = 0; i18 < vb0Var.getChildCount(); i18++) {
                    View childAt2 = vb0Var.getChildAt(i18);
                    if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt2).Z3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                ub0 ub0Var = cc0Var.e;
                if (ub0Var != null) {
                    ub0Var.x();
                    return;
                }
                return;
        }
    }
}
