package ai;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.za0;
import org.telegram.ui.hx;
import org.telegram.ui.wb1;
public final class r extends s4.s0 {
    public final int f1445a;
    public final Object f1446b;

    public r(Object obj, int i10) {
        this.f1445a = i10;
        this.f1446b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        hl0 hl0Var;
        int i13;
        hl0 hl0Var2;
        hl0 hl0Var3;
        int top;
        int i14;
        hl0 hl0Var4;
        hl0 hl0Var5;
        int top2;
        boolean z10;
        switch (this.f1445a) {
            case 2:
                ci.e2 e2Var = (ci.e2) this.f1446b;
                if (i10 == 0 && e2Var.f4597n >= 0.0f && !e2Var.f4594b.canScrollVertically(-1)) {
                    e2Var.f4597n = -1.0f;
                    return;
                }
                return;
            case 6:
                fi.h0 h0Var = (fi.h0) this.f1446b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 10:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hg.f2) this.f1446b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                ((li.e) this.f1446b).f14359f++;
                return;
            case 14:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f1446b;
                org.telegram.ui.Components.u7 u7Var = j8Var.f25300n;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = j8Var.A0;
                    i11 = ((org.telegram.ui.ActionBar.e3) j8Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.e3) j8Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && u7Var.canScrollVertically(1) && (hl0Var = (hl0) u7Var.K(j8Var.f25311v0 ? 1 : 0)) != null) {
                        View view = hl0Var.f42959a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            u7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
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
                lj ljVar = (lj) this.f1446b;
                w0 w0Var = ljVar.f26087n;
                wi wiVar = ljVar.f27043b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = wiVar.f30004a1;
                    if (u0Var != null) {
                        i13 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i13 = 0;
                    }
                    int i17 = dp2 + i13;
                    int backgroundPaddingTop = wiVar.getBackgroundPaddingTop();
                    if (((wiVar.f30008b2[0] - backgroundPaddingTop) - i17) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (hl0Var2 = (hl0) w0Var.K(0)) != null) {
                        View view2 = hl0Var2.f42959a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            w0Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 19:
                qk qkVar = (qk) this.f1446b;
                fk fkVar = qkVar.f27705r;
                wi wiVar2 = qkVar.f27043b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = wiVar2.getBackgroundPaddingTop();
                    if (((wiVar2.f30008b2[0] - backgroundPaddingTop2) - dp3) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (hl0Var3 = (hl0) fkVar.K(0)) != null && (top = (hl0Var3.f42959a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        fkVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && qkVar.f27699b0 && fkVar.getAdapter() == qkVar.f27709y) {
                    AndroidUtilities.hideKeyboard(wiVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                qkVar.U = z11;
                return;
            case 20:
                rk rkVar = (rk) this.f1446b;
                xl0 xl0Var = rkVar.f27944r;
                wi wiVar3 = rkVar.f27043b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var2 = wiVar3.f30004a1;
                    if (u0Var2 != null) {
                        i14 = AndroidUtilities.dp(u0Var2.getAlpha() * 26.0f);
                    } else {
                        i14 = 0;
                    }
                    int i18 = dp4 + i14;
                    int backgroundPaddingTop3 = wiVar3.getBackgroundPaddingTop();
                    if (((wiVar3.f30008b2[0] - backgroundPaddingTop3) - i18) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (hl0Var4 = (hl0) xl0Var.K(0)) != null) {
                        View view3 = hl0Var4.f42959a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            xl0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                if (i10 == 1) {
                    il ilVar = (il) this.f1446b;
                    if (ilVar.f25131l0 && ilVar.m0) {
                        AndroidUtilities.hideKeyboard(ilVar.f27043b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 22:
                wn wnVar = (wn) this.f1446b;
                wb1 wb1Var = wnVar.f30137s;
                wi wiVar4 = wnVar.f27043b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = wiVar4.getBackgroundPaddingTop();
                    if (((wiVar4.f30008b2[0] - backgroundPaddingTop4) - dp5) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (hl0Var5 = (hl0) wb1Var.K(1)) != null && (top2 = (hl0Var5.f42959a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        wb1Var.v0(0, top2, null);
                    }
                    int i19 = wnVar.W0;
                    if (i19 >= 0) {
                        wn.K(wnVar, i19);
                        wnVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 28:
                za0 za0Var = (za0) this.f1446b;
                boolean z12 = false;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                za0Var.X2 = z10;
                if (i10 == 1) {
                    z12 = true;
                }
                za0Var.Y2 = z12;
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
        k40 k40Var;
        s4.c1 T;
        int N0;
        int i13;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.f1445a) {
            case 0:
                hx hxVar = (hx) this.f1446b;
                hxVar.invalidate();
                hxVar.c();
                ci.e4 e4Var = hxVar.J;
                if (e4Var != null) {
                    e4Var.e(true);
                    return;
                }
                return;
            case 1:
                ci.z1 z1Var = (ci.z1) this.f1446b;
                ci.w1 w1Var = z1Var.f5903c;
                ci.s2 s2Var = z1Var.f5906r;
                viewGroup = ((org.telegram.ui.ActionBar.e3) s2Var).containerView;
                viewGroup.invalidate();
                z10 = ((org.telegram.ui.ActionBar.e3) s2Var).keyboardVisible;
                if (z10 && z1Var.f5902b.K1 && (l2Var = z1Var.d) != null && l2Var.d != null) {
                    s2Var.o0();
                }
                if (z1Var.e.M0() + 7 >= w1Var.h() - 1) {
                    w1Var.G();
                    return;
                }
                return;
            case 2:
                ci.e2 e2Var = (ci.e2) this.f1446b;
                ci.d2 d2Var = e2Var.f4595c;
                ci.p1 p1Var = e2Var.f4594b;
                ci.s2 s2Var2 = e2Var.f4599s;
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) s2Var2).containerView;
                viewGroup2.invalidate();
                int i14 = -1;
                if (e2Var.f4597n < 0.0f) {
                    i12 = e2Var.d.I0();
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 < p1Var.getChildCount()) {
                            View childAt = p1Var.getChildAt(i15);
                            if (childAt.getY() + childAt.getHeight() > e2Var.f4597n + p1Var.getPaddingTop()) {
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
                int size = d2Var.f4509y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = d2Var.f4509y.keyAt(size);
                        int valueAt = d2Var.f4509y.valueAt(size);
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
                if (z11 && p1Var.K1 && (l2Var2 = e2Var.f4596f) != null && l2Var2.d != null) {
                    s2Var2.o0();
                    return;
                }
                return;
            case 3:
                of ofVar = (of) this.f1446b;
                View m10 = ofVar.f8722c.getLayoutManager().m(0);
                float f10 = 0.0f;
                if (m10 != null) {
                    f7 = m10.getY();
                } else {
                    f7 = 0.0f;
                }
                if (f7 >= 0.0f) {
                    f10 = f7;
                }
                ofVar.h = f10;
                ofVar.b();
                return;
            case 4:
                ei.e4 e4Var2 = (ei.e4) this.f1446b;
                long j3 = e4Var2.P;
                int i16 = 0;
                while (true) {
                    if (i16 < e4Var2.f35448c.getChildCount()) {
                        if (!(e4Var2.f35448c.getChildAt(i16) instanceof v00)) {
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
                fi.s sVar = (fi.s) this.f1446b;
                sVar.v.b(sVar.d);
                return;
            case 6:
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) ((fi.h0) this.f1446b).f9095f).containerView;
                viewGroup3.invalidate();
                return;
            case 7:
                fi.j0 j0Var = (fi.j0) this.f1446b;
                j0Var.h.M.b(j0Var.d);
                return;
            case 8:
                hg.n.b0((hg.n) this.f1446b);
                return;
            case 9:
                hg.k0 k0Var = (hg.k0) this.f1446b;
                k0Var.f27043b.X1(k0Var, i11);
                k0Var.M();
                return;
            case 10:
            case 21:
            default:
                return;
            case 11:
                ((li.e) this.f1446b).f14359f++;
                return;
            case 12:
                ((ki.h0) this.f1446b).run();
                return;
            case 13:
                ((org.telegram.ui.Components.e0) this.f1446b).r0();
                return;
            case 14:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f1446b;
                s4.c0 c0Var = j8Var.f25305r;
                org.telegram.ui.Components.j8.P(j8Var);
                j8Var.E0();
                if (!j8Var.f25292f) {
                    int L0 = c0Var.L0();
                    int i17 = 0;
                    if (j8Var.f25311v0) {
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
                ((bw0) this.f1446b).invalidate();
                return;
            case 16:
                ij ijVar = (ij) this.f1446b;
                ijVar.f27043b.X1(ijVar, i11);
                return;
            case 17:
                lj ljVar = (lj) this.f1446b;
                if (ljVar.f26087n.getChildCount() > 0) {
                    ljVar.f27043b.X1(ljVar, i11);
                    return;
                }
                return;
            case 18:
                ak akVar = (ak) this.f1446b;
                akVar.f27043b.X1(akVar, i11);
                akVar.O();
                return;
            case 19:
                qk qkVar = (qk) this.f1446b;
                hg.g0 g0Var = qkVar.E;
                qkVar.f27043b.X1(qkVar, i11);
                qkVar.U();
                s4.h0 adapter = qkVar.f27705r.getAdapter();
                pk pkVar = qkVar.f27709y;
                if (adapter == pkVar) {
                    int L02 = g0Var.L0();
                    int N02 = g0Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h10 - 10) {
                        pk pkVar2 = pkVar.X.f27709y;
                        if (!pkVar2.S && !pkVar2.V && (q0Var = pkVar.f27406y) != null) {
                            pkVar.Z(pkVar.f27405x, pkVar.E, pkVar.F, q0Var, pkVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                rk rkVar = (rk) this.f1446b;
                rkVar.f27043b.X1(rkVar, i11);
                rkVar.v.setTranslationY(Math.max(0, rkVar.getCurrentItemTop()));
                return;
            case 22:
                wn wnVar = (wn) this.f1446b;
                hg.g0 g0Var2 = wnVar.f30142w;
                wnVar.f27043b.X1(wnVar, i11);
                ln lnVar = wnVar.f30144x;
                if (lnVar != null && lnVar.f30737s) {
                    wy0 delegate = lnVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        wb1 wb1Var = wnVar.f30137s;
                        View F = wb1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = wb1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f42959a;
                            int b10 = T.b();
                            if (lnVar.getDirection() == 0) {
                                lnVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                lnVar.setTranslationY(view.getY());
                            }
                            if (b10 < g0Var2.L0() || b10 > g0Var2.N0()) {
                                lnVar.f();
                            }
                        } else {
                            lnVar.f();
                        }
                    } else {
                        lnVar.f();
                    }
                }
                if (i11 != 0 && (k40Var = wnVar.f30146y) != null) {
                    k40Var.b(true);
                    return;
                }
                return;
            case 23:
                xn xnVar = (xn) this.f1446b;
                xnVar.f27043b.X1(xnVar, i11);
                return;
            case 24:
                op opVar = (op) this.f1446b;
                if (opVar.f27082x.M0() + 10 >= opVar.h.h()) {
                    opVar.w();
                    return;
                }
                return;
            case 25:
                uv uvVar = (uv) this.f1446b;
                kv kvVar = uvVar.f28913f;
                if (kvVar != null && uvVar.h.K1 && kvVar.f25811w) {
                    kvVar.f25811w = false;
                    kvVar.invalidate();
                    return;
                }
                return;
            case 26:
                m00 m00Var = (m00) this.f1446b;
                m00Var.F.invalidate();
                m00Var.invalidate();
                return;
            case 27:
                p00.G((p00) this.f1446b);
                return;
            case 28:
                za0 za0Var = (za0) this.f1446b;
                s4.o0 layoutManager = za0Var.getLayoutManager();
                ab0 ab0Var = za0Var.f30860b3;
                ta0 ta0Var = ab0Var.d;
                if (layoutManager == ta0Var) {
                    N0 = ta0Var.N0();
                } else {
                    N0 = ab0Var.f22592c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    gg.k1 k1Var = ab0Var.f22593f;
                    if (N0 > k1Var.M0 - 5 && k1Var.f9820u0 == 0 && (str = k1Var.f9818s0) != null && str.length() != 0 && (user = k1Var.f9823w0) != null && (str2 = k1Var.f9816r0) != null) {
                        k1Var.T(true, user, str2, k1Var.f9818s0);
                    }
                }
                za0Var.canScrollVertically(1);
                ab0Var.n(!za0Var.canScrollVertically(-1));
                ab0Var.b();
                return;
            case 29:
                ac0 ac0Var = (ac0) this.f1446b;
                org.telegram.ui.w8 w8Var = ac0Var.f22603b;
                tb0 tb0Var = ac0Var.f22607f;
                for (int i18 = 0; i18 < tb0Var.getChildCount(); i18++) {
                    View childAt2 = tb0Var.getChildAt(i18);
                    if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt2).Z3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                sb0 sb0Var = ac0Var.e;
                if (sb0Var != null) {
                    sb0Var.x();
                    return;
                }
                return;
        }
    }
}
