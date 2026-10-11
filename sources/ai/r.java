package ai;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a50;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.jw;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zn;
import org.telegram.ui.Components.zv;
import org.telegram.ui.ec1;
import org.telegram.ui.jx;
public final class r extends s4.t0 {
    public final int f1639a;
    public final Object f1640b;

    public r(Object obj, int i10) {
        this.f1639a = i10;
        this.f1640b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        cm0 cm0Var;
        int i11;
        cm0 cm0Var2;
        cm0 cm0Var3;
        int top;
        int i12;
        cm0 cm0Var4;
        cm0 cm0Var5;
        int top2;
        boolean z10;
        switch (this.f1639a) {
            case 2:
                ci.d2 d2Var = (ci.d2) this.f1640b;
                if (i10 == 0 && d2Var.f4898n >= 0.0f && !d2Var.f4894b.canScrollVertically(-1)) {
                    d2Var.f4898n = -1.0f;
                    return;
                }
                return;
            case 6:
                fi.h0 h0Var = (fi.h0) this.f1640b;
                if (i10 == 0) {
                    h0Var.f9975e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 10:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hg.f2) this.f1640b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                ((mi.e) this.f1640b).f16483f++;
                return;
            case 14:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f1640b;
                org.telegram.ui.Components.w7 w7Var = l8Var.f28212n;
                if (i10 == 0) {
                    if (org.telegram.ui.Components.l8.k0(l8Var) + ((l8Var.A0 - org.telegram.ui.Components.l8.j0(l8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && w7Var.canScrollVertically(1) && (cm0Var = (cm0) w7Var.K(l8Var.f28223v0 ? 1 : 0)) != null) {
                        View view = cm0Var.f47748a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            w7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(l8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 17:
                nj njVar = (nj) this.f1640b;
                w0 w0Var = njVar.f29060n;
                yi yiVar = njVar.f30161b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = yiVar.f33209d1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = yiVar.getBackgroundPaddingTop();
                    if (((yiVar.f33214e2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cm0Var2 = (cm0) w0Var.K(0)) != null) {
                        View view2 = cm0Var2.f47748a;
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
                sk skVar = (sk) this.f1640b;
                hk hkVar = skVar.f30769r;
                yi yiVar2 = skVar.f30161b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = yiVar2.getBackgroundPaddingTop();
                    if (((yiVar2.f33214e2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cm0Var3 = (cm0) hkVar.K(0)) != null && (top = (cm0Var3.f47748a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        hkVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && skVar.f30763b0 && hkVar.getAdapter() == skVar.f30773y) {
                    AndroidUtilities.hideKeyboard(yiVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                skVar.U = z11;
                return;
            case 20:
                tk tkVar = (tk) this.f1640b;
                sm0 sm0Var = tkVar.f31112r;
                yi yiVar3 = tkVar.f30161b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var2 = yiVar3.f33209d1;
                    if (u0Var2 != null) {
                        i12 = AndroidUtilities.dp(u0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = yiVar3.getBackgroundPaddingTop();
                    if (((yiVar3.f33214e2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cm0Var4 = (cm0) sm0Var.K(0)) != null) {
                        View view3 = cm0Var4.f47748a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            sm0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                if (i10 == 1) {
                    xl xlVar = (xl) this.f1640b;
                    if (xlVar.f32959l0 && xlVar.m0) {
                        AndroidUtilities.hideKeyboard(xlVar.f30161b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 22:
                lo loVar = (lo) this.f1640b;
                ec1 ec1Var = loVar.f28403s;
                yi yiVar4 = loVar.f30161b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = yiVar4.getBackgroundPaddingTop();
                    if (((yiVar4.f33214e2[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cm0Var5 = (cm0) ec1Var.K(1)) != null && (top2 = (cm0Var5.f47748a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        ec1Var.v0(0, top2, null);
                    }
                    int i15 = loVar.W0;
                    if (i15 >= 0) {
                        lo.N(loVar, i15);
                        loVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 28:
                pb0 pb0Var = (pb0) this.f1640b;
                boolean z12 = false;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pb0Var.V2 = z10;
                if (i10 == 1) {
                    z12 = true;
                }
                pb0Var.W2 = z12;
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        boolean z10;
        ci.k2 k2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z11;
        ci.k2 k2Var2;
        float f7;
        ViewGroup viewGroup3;
        gg.p0 p0Var;
        a50 a50Var;
        s4.d1 T;
        int N0;
        int i13;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.f1639a) {
            case 0:
                jx jxVar = (jx) this.f1640b;
                jxVar.invalidate();
                jxVar.c();
                ci.d4 d4Var = jxVar.J;
                if (d4Var != null) {
                    d4Var.e(true);
                    return;
                }
                return;
            case 1:
                ci.y1 y1Var = (ci.y1) this.f1640b;
                ci.v1 v1Var = y1Var.f6341c;
                ci.r2 r2Var = y1Var.f6345r;
                viewGroup = ((org.telegram.ui.ActionBar.e3) r2Var).containerView;
                viewGroup.invalidate();
                z10 = ((org.telegram.ui.ActionBar.e3) r2Var).keyboardVisible;
                if (z10 && y1Var.f6340b.I1 && (k2Var = y1Var.d) != null && k2Var.d != null) {
                    r2Var.p0();
                }
                if (y1Var.f6342e.M0() + 7 >= v1Var.h() - 1) {
                    v1Var.G();
                    return;
                }
                return;
            case 2:
                ci.d2 d2Var = (ci.d2) this.f1640b;
                ci.c2 c2Var = d2Var.f4895c;
                ci.o1 o1Var = d2Var.f4894b;
                ci.r2 r2Var2 = d2Var.f4900s;
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) r2Var2).containerView;
                viewGroup2.invalidate();
                int i14 = -1;
                if (d2Var.f4898n < 0.0f) {
                    i12 = d2Var.d.I0();
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 < o1Var.getChildCount()) {
                            View childAt = o1Var.getChildAt(i15);
                            if (childAt.getY() + childAt.getHeight() > d2Var.f4898n + o1Var.getPaddingTop()) {
                                o1Var.getClass();
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
                int size = c2Var.f4831y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = c2Var.f4831y.keyAt(size);
                        int valueAt = c2Var.f4831y.valueAt(size);
                        if (i12 >= keyAt) {
                            i14 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i14 >= 0) {
                    d2Var.f4896e.j(i14, true);
                }
                z11 = ((org.telegram.ui.ActionBar.e3) r2Var2).keyboardVisible;
                if (z11 && o1Var.I1 && (k2Var2 = d2Var.f4897f) != null && k2Var2.d != null) {
                    r2Var2.p0();
                    return;
                }
                return;
            case 3:
                qf qfVar = (qf) this.f1640b;
                View m10 = qfVar.f9494c.getLayoutManager().m(0);
                float f10 = 0.0f;
                if (m10 != null) {
                    f7 = m10.getY();
                } else {
                    f7 = 0.0f;
                }
                if (f7 >= 0.0f) {
                    f10 = f7;
                }
                qfVar.h = f10;
                qfVar.b();
                return;
            case 4:
                ei.e4 e4Var = (ei.e4) this.f1640b;
                long j3 = e4Var.P;
                int i16 = 0;
                while (true) {
                    if (i16 < e4Var.f40392c.getChildCount()) {
                        if (!(e4Var.f40392c.getChildAt(i16) instanceof k10)) {
                            i16++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                yh.o.g(ei.e4.D0(e4Var)).d(j3).a();
                yh.o.g(ei.e4.E0(e4Var)).e(j3).a();
                return;
            case 5:
                fi.s sVar = (fi.s) this.f1640b;
                sVar.v.b(sVar.d);
                return;
            case 6:
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) ((fi.h0) this.f1640b).f9976f).containerView;
                viewGroup3.invalidate();
                return;
            case 7:
                fi.j0 j0Var = (fi.j0) this.f1640b;
                j0Var.h.M.b(j0Var.d);
                return;
            case 8:
                hg.n.b0((hg.n) this.f1640b);
                return;
            case 9:
                hg.j0 j0Var2 = (hg.j0) this.f1640b;
                j0Var2.f30161b.b2(j0Var2, i11);
                j0Var2.P();
                return;
            case 10:
            case 21:
            default:
                return;
            case 11:
                ((mi.e) this.f1640b).f16483f++;
                return;
            case 12:
                ((ki.i0) this.f1640b).run();
                return;
            case 13:
                ((org.telegram.ui.Components.e0) this.f1640b).s0();
                return;
            case 14:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f1640b;
                s4.d0 d0Var = l8Var.f28217r;
                org.telegram.ui.Components.l8.Q(l8Var);
                l8Var.E0();
                if (!l8Var.f28204f) {
                    int L0 = d0Var.L0();
                    int i17 = 0;
                    if (l8Var.f28223v0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    if (L0 != -1) {
                        i17 = Math.abs(d0Var.N0() - L0) + 1;
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
                ((uw0) this.f1640b).invalidate();
                return;
            case 16:
                kj kjVar = (kj) this.f1640b;
                kjVar.f30161b.b2(kjVar, i11);
                return;
            case 17:
                nj njVar = (nj) this.f1640b;
                if (njVar.f29060n.getChildCount() > 0) {
                    njVar.f30161b.b2(njVar, i11);
                    return;
                }
                return;
            case 18:
                ck ckVar = (ck) this.f1640b;
                ckVar.f30161b.b2(ckVar, i11);
                ckVar.R();
                return;
            case 19:
                sk skVar = (sk) this.f1640b;
                hg.f0 f0Var = skVar.E;
                skVar.f30161b.b2(skVar, i11);
                skVar.X();
                s4.i0 adapter = skVar.f30769r.getAdapter();
                rk rkVar = skVar.f30773y;
                if (adapter == rkVar) {
                    int L02 = f0Var.L0();
                    int N02 = f0Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h10 - 10) {
                        rk rkVar2 = rkVar.X.f30773y;
                        if (!rkVar2.S && !rkVar2.V && (p0Var = rkVar.f30476y) != null) {
                            rkVar.Z(rkVar.f30475x, rkVar.E, rkVar.F, p0Var, rkVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                tk tkVar = (tk) this.f1640b;
                tkVar.f30161b.b2(tkVar, i11);
                tkVar.v.setTranslationY(Math.max(0, tkVar.getCurrentItemTop()));
                return;
            case 22:
                lo loVar = (lo) this.f1640b;
                hg.f0 f0Var2 = loVar.f28408w;
                loVar.f30161b.b2(loVar, i11);
                zn znVar = loVar.f28410x;
                if (znVar != null && znVar.f30279s) {
                    oz0 delegate = znVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        ec1 ec1Var = loVar.f28403s;
                        View F = ec1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = ec1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f47748a;
                            int b10 = T.b();
                            if (znVar.getDirection() == 0) {
                                znVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                znVar.setTranslationY(view.getY());
                            }
                            if (b10 < f0Var2.L0() || b10 > f0Var2.N0()) {
                                znVar.f();
                            }
                        } else {
                            znVar.f();
                        }
                    } else {
                        znVar.f();
                    }
                }
                if (i11 != 0 && (a50Var = loVar.f28412y) != null) {
                    a50Var.b(true);
                    return;
                }
                return;
            case 23:
                mo moVar = (mo) this.f1640b;
                moVar.f30161b.b2(moVar, i11);
                return;
            case 24:
                cq cqVar = (cq) this.f1640b;
                if (cqVar.f25277x.M0() + 10 >= cqVar.h.h()) {
                    cqVar.y();
                    return;
                }
                return;
            case 25:
                jw jwVar = (jw) this.f1640b;
                zv zvVar = jwVar.f27761f;
                if (zvVar != null && jwVar.h.I1 && zvVar.f33677w) {
                    zvVar.f33677w = false;
                    zvVar.invalidate();
                    return;
                }
                return;
            case 26:
                b10 b10Var = (b10) this.f1640b;
                b10Var.F.invalidate();
                b10Var.invalidate();
                return;
            case 27:
                e10.H((e10) this.f1640b);
                return;
            case 28:
                pb0 pb0Var = (pb0) this.f1640b;
                s4.p0 layoutManager = pb0Var.getLayoutManager();
                qb0 qb0Var = pb0Var.Z2;
                jb0 jb0Var = qb0Var.d;
                if (layoutManager == jb0Var) {
                    N0 = jb0Var.N0();
                } else {
                    N0 = qb0Var.f30114c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    gg.j1 j1Var = qb0Var.f30116f;
                    if (N0 > j1Var.M0 - 5 && j1Var.f10690u0 == 0 && (str = j1Var.f10688s0) != null && str.length() != 0 && (user = j1Var.f10693w0) != null && (str2 = j1Var.f10686r0) != null) {
                        j1Var.T(true, user, str2, j1Var.f10688s0);
                    }
                }
                pb0Var.canScrollVertically(1);
                qb0Var.n(!pb0Var.canScrollVertically(-1));
                qb0Var.b();
                return;
            case 29:
                qc0 qc0Var = (qc0) this.f1640b;
                org.telegram.ui.u8 u8Var = qc0Var.f30129b;
                jc0 jc0Var = qc0Var.f30134f;
                for (int i18 = 0; i18 < jc0Var.getChildCount(); i18++) {
                    View childAt2 = jc0Var.getChildAt(i18);
                    if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt2).Z3(u8Var.getMeasuredWidth(), u8Var.getBackgroundSizeY());
                    }
                }
                ic0 ic0Var = qc0Var.f30133e;
                if (ic0Var != null) {
                    ic0Var.w();
                    return;
                }
                return;
        }
    }
}
