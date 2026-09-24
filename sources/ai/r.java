package ai;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.Components.za0;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.Components.zj;
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
        gl0 gl0Var;
        int i11;
        gl0 gl0Var2;
        gl0 gl0Var3;
        int top;
        int i12;
        gl0 gl0Var4;
        gl0 gl0Var5;
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
                ((li.e) this.f1446b).f14344f++;
                return;
            case 14:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f1446b;
                org.telegram.ui.Components.u7 u7Var = j8Var.f25291n;
                if (i10 == 0) {
                    if (org.telegram.ui.Components.j8.j0(j8Var) + ((j8Var.A0 - org.telegram.ui.Components.j8.i0(j8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && u7Var.canScrollVertically(1) && (gl0Var = (gl0) u7Var.K(j8Var.f25302v0 ? 1 : 0)) != null) {
                        View view = gl0Var.f42946a;
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
                kj kjVar = (kj) this.f1446b;
                w0 w0Var = kjVar.f25777n;
                wi wiVar = kjVar.f27083b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = wiVar.f29969a1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = wiVar.getBackgroundPaddingTop();
                    if (((wiVar.f29973b2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (gl0Var2 = (gl0) w0Var.K(0)) != null) {
                        View view2 = gl0Var2.f42946a;
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
                pk pkVar = (pk) this.f1446b;
                ek ekVar = pkVar.f27359r;
                wi wiVar2 = pkVar.f27083b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = wiVar2.getBackgroundPaddingTop();
                    if (((wiVar2.f29973b2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (gl0Var3 = (gl0) ekVar.K(0)) != null && (top = (gl0Var3.f42946a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        ekVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && pkVar.f27353b0 && ekVar.getAdapter() == pkVar.f27363y) {
                    AndroidUtilities.hideKeyboard(wiVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                pkVar.U = z11;
                return;
            case 20:
                qk qkVar = (qk) this.f1446b;
                wl0 wl0Var = qkVar.f27642r;
                wi wiVar3 = qkVar.f27083b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var2 = wiVar3.f29969a1;
                    if (u0Var2 != null) {
                        i12 = AndroidUtilities.dp(u0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = wiVar3.getBackgroundPaddingTop();
                    if (((wiVar3.f29973b2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (gl0Var4 = (gl0) wl0Var.K(0)) != null) {
                        View view3 = gl0Var4.f42946a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            wl0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                if (i10 == 1) {
                    hl hlVar = (hl) this.f1446b;
                    if (hlVar.f24782l0 && hlVar.m0) {
                        AndroidUtilities.hideKeyboard(hlVar.f27083b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 22:
                vn vnVar = (vn) this.f1446b;
                wb1 wb1Var = vnVar.f29205s;
                wi wiVar4 = vnVar.f27083b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = wiVar4.getBackgroundPaddingTop();
                    if (((wiVar4.f29973b2[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (gl0Var5 = (gl0) wb1Var.K(1)) != null && (top2 = (gl0Var5.f42946a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        wb1Var.v0(0, top2, null);
                    }
                    int i15 = vnVar.W0;
                    if (i15 >= 0) {
                        vn.K(vnVar, i15);
                        vnVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ya0 ya0Var = (ya0) this.f1446b;
                boolean z12 = false;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ya0Var.X2 = z10;
                if (i10 == 1) {
                    z12 = true;
                }
                ya0Var.Y2 = z12;
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
        j40 j40Var;
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
                    if (i16 < e4Var2.f35436c.getChildCount()) {
                        if (!(e4Var2.f35436c.getChildAt(i16) instanceof u00)) {
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
                k0Var.f27083b.X1(k0Var, i11);
                k0Var.M();
                return;
            case 10:
            case 21:
            default:
                return;
            case 11:
                ((li.e) this.f1446b).f14344f++;
                return;
            case 12:
                ((ki.n) this.f1446b).run();
                return;
            case 13:
                ((org.telegram.ui.Components.e0) this.f1446b).r0();
                return;
            case 14:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f1446b;
                s4.c0 c0Var = j8Var.f25296r;
                org.telegram.ui.Components.j8.P(j8Var);
                j8Var.E0();
                if (!j8Var.f25283f) {
                    int L0 = c0Var.L0();
                    int i17 = 0;
                    if (j8Var.f25302v0) {
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
                ((aw0) this.f1446b).invalidate();
                return;
            case 16:
                hj hjVar = (hj) this.f1446b;
                hjVar.f27083b.X1(hjVar, i11);
                return;
            case 17:
                kj kjVar = (kj) this.f1446b;
                if (kjVar.f25777n.getChildCount() > 0) {
                    kjVar.f27083b.X1(kjVar, i11);
                    return;
                }
                return;
            case 18:
                zj zjVar = (zj) this.f1446b;
                zjVar.f27083b.X1(zjVar, i11);
                zjVar.O();
                return;
            case 19:
                pk pkVar = (pk) this.f1446b;
                hg.g0 g0Var = pkVar.E;
                pkVar.f27083b.X1(pkVar, i11);
                pkVar.U();
                s4.h0 adapter = pkVar.f27359r.getAdapter();
                ok okVar = pkVar.f27363y;
                if (adapter == okVar) {
                    int L02 = g0Var.L0();
                    int N02 = g0Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h10 - 10) {
                        ok okVar2 = okVar.X.f27363y;
                        if (!okVar2.S && !okVar2.V && (q0Var = okVar.f27097y) != null) {
                            okVar.Z(okVar.f27096x, okVar.E, okVar.F, q0Var, okVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                qk qkVar = (qk) this.f1446b;
                qkVar.f27083b.X1(qkVar, i11);
                qkVar.v.setTranslationY(Math.max(0, qkVar.getCurrentItemTop()));
                return;
            case 22:
                vn vnVar = (vn) this.f1446b;
                hg.g0 g0Var2 = vnVar.f29210w;
                vnVar.f27083b.X1(vnVar, i11);
                kn knVar = vnVar.f29212x;
                if (knVar != null && knVar.f30428s) {
                    vy0 delegate = knVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        wb1 wb1Var = vnVar.f29205s;
                        View F = wb1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = wb1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f42946a;
                            int b10 = T.b();
                            if (knVar.getDirection() == 0) {
                                knVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                knVar.setTranslationY(view.getY());
                            }
                            if (b10 < g0Var2.L0() || b10 > g0Var2.N0()) {
                                knVar.f();
                            }
                        } else {
                            knVar.f();
                        }
                    } else {
                        knVar.f();
                    }
                }
                if (i11 != 0 && (j40Var = vnVar.f29214y) != null) {
                    j40Var.b(true);
                    return;
                }
                return;
            case 23:
                wn wnVar = (wn) this.f1446b;
                wnVar.f27083b.X1(wnVar, i11);
                return;
            case 24:
                np npVar = (np) this.f1446b;
                if (npVar.f26760x.M0() + 10 >= npVar.h.h()) {
                    npVar.w();
                    return;
                }
                return;
            case 25:
                uv uvVar = (uv) this.f1446b;
                kv kvVar = uvVar.f28919f;
                if (kvVar != null && uvVar.h.K1 && kvVar.f25879w) {
                    kvVar.f25879w = false;
                    kvVar.invalidate();
                    return;
                }
                return;
            case 26:
                l00 l00Var = (l00) this.f1446b;
                l00Var.F.invalidate();
                l00Var.invalidate();
                return;
            case 27:
                o00.G((o00) this.f1446b);
                return;
            case 28:
                ya0 ya0Var = (ya0) this.f1446b;
                s4.o0 layoutManager = ya0Var.getLayoutManager();
                za0 za0Var = ya0Var.f30573b3;
                sa0 sa0Var = za0Var.d;
                if (layoutManager == sa0Var) {
                    N0 = sa0Var.N0();
                } else {
                    N0 = za0Var.f30815c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    gg.k1 k1Var = za0Var.f30816f;
                    if (N0 > k1Var.M0 - 5 && k1Var.f9820u0 == 0 && (str = k1Var.f9818s0) != null && str.length() != 0 && (user = k1Var.f9823w0) != null && (str2 = k1Var.f9816r0) != null) {
                        k1Var.T(true, user, str2, k1Var.f9818s0);
                    }
                }
                ya0Var.canScrollVertically(1);
                za0Var.n(!ya0Var.canScrollVertically(-1));
                za0Var.b();
                return;
            case 29:
                zb0 zb0Var = (zb0) this.f1446b;
                org.telegram.ui.w8 w8Var = zb0Var.f30826b;
                sb0 sb0Var = zb0Var.f30830f;
                for (int i18 = 0; i18 < sb0Var.getChildCount(); i18++) {
                    View childAt2 = sb0Var.getChildAt(i18);
                    if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt2).Z3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                rb0 rb0Var = zb0Var.e;
                if (rb0Var != null) {
                    rb0Var.x();
                    return;
                }
                return;
        }
    }
}
