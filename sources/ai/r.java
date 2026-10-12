package ai;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.bw;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.lw;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.zl;
import org.telegram.ui.hc1;
import org.telegram.ui.mx;
public final class r extends s4.t0 {
    public final int f1637a;
    public final Object f1638b;

    public r(Object obj, int i10) {
        this.f1637a = i10;
        this.f1638b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        gm0 gm0Var;
        int i11;
        gm0 gm0Var2;
        gm0 gm0Var3;
        int top;
        int i12;
        gm0 gm0Var4;
        gm0 gm0Var5;
        int top2;
        boolean z10;
        switch (this.f1637a) {
            case 2:
                ci.d2 d2Var = (ci.d2) this.f1638b;
                if (i10 == 0 && d2Var.f4897n >= 0.0f && !d2Var.f4893b.canScrollVertically(-1)) {
                    d2Var.f4897n = -1.0f;
                    return;
                }
                return;
            case 6:
                fi.h0 h0Var = (fi.h0) this.f1638b;
                if (i10 == 0) {
                    h0Var.f9974e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 10:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hg.f2) this.f1638b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                ((li.e) this.f1638b).f15357f++;
                return;
            case 14:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f1638b;
                org.telegram.ui.Components.w7 w7Var = l8Var.f28084n;
                if (i10 == 0) {
                    if (org.telegram.ui.Components.l8.k0(l8Var) + ((l8Var.A0 - org.telegram.ui.Components.l8.j0(l8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && w7Var.canScrollVertically(1) && (gm0Var = (gm0) w7Var.K(l8Var.f28095v0 ? 1 : 0)) != null) {
                        View view = gm0Var.f47889a;
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
                pj pjVar = (pj) this.f1638b;
                w0 w0Var = pjVar.f29504n;
                aj ajVar = pjVar.f30574b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = ajVar.f24335d1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = ajVar.getBackgroundPaddingTop();
                    if (((ajVar.f24340e2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (gm0Var2 = (gm0) w0Var.K(0)) != null) {
                        View view2 = gm0Var2.f47889a;
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
                uk ukVar = (uk) this.f1638b;
                jk jkVar = ukVar.f31194r;
                aj ajVar2 = ukVar.f30574b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = ajVar2.getBackgroundPaddingTop();
                    if (((ajVar2.f24340e2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (gm0Var3 = (gm0) jkVar.K(0)) != null && (top = (gm0Var3.f47889a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        jkVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && ukVar.f31188b0 && jkVar.getAdapter() == ukVar.f31198y) {
                    AndroidUtilities.hideKeyboard(ajVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                ukVar.U = z11;
                return;
            case 20:
                vk vkVar = (vk) this.f1638b;
                wm0 wm0Var = vkVar.f31561r;
                aj ajVar3 = vkVar.f30574b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var2 = ajVar3.f24335d1;
                    if (u0Var2 != null) {
                        i12 = AndroidUtilities.dp(u0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = ajVar3.getBackgroundPaddingTop();
                    if (((ajVar3.f24340e2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (gm0Var4 = (gm0) wm0Var.K(0)) != null) {
                        View view3 = gm0Var4.f47889a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            wm0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                if (i10 == 1) {
                    zl zlVar = (zl) this.f1638b;
                    if (zlVar.f33409l0 && zlVar.m0) {
                        AndroidUtilities.hideKeyboard(zlVar.f30574b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 22:
                no noVar = (no) this.f1638b;
                hc1 hc1Var = noVar.f28903s;
                aj ajVar4 = noVar.f30574b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = ajVar4.getBackgroundPaddingTop();
                    if (((ajVar4.f24340e2[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (gm0Var5 = (gm0) hc1Var.K(1)) != null && (top2 = (gm0Var5.f47889a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        hc1Var.v0(0, top2, null);
                    }
                    int i15 = noVar.W0;
                    if (i15 >= 0) {
                        no.N(noVar, i15);
                        noVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 28:
                sb0 sb0Var = (sb0) this.f1638b;
                boolean z12 = false;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sb0Var.V2 = z10;
                if (i10 == 1) {
                    z12 = true;
                }
                sb0Var.W2 = z12;
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
        c50 c50Var;
        s4.d1 T;
        int N0;
        int i13;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.f1637a) {
            case 0:
                mx mxVar = (mx) this.f1638b;
                mxVar.invalidate();
                mxVar.c();
                ci.d4 d4Var = mxVar.J;
                if (d4Var != null) {
                    d4Var.e(true);
                    return;
                }
                return;
            case 1:
                ci.y1 y1Var = (ci.y1) this.f1638b;
                ci.v1 v1Var = y1Var.f6340c;
                ci.r2 r2Var = y1Var.f6344r;
                viewGroup = ((org.telegram.ui.ActionBar.e3) r2Var).containerView;
                viewGroup.invalidate();
                z10 = ((org.telegram.ui.ActionBar.e3) r2Var).keyboardVisible;
                if (z10 && y1Var.f6339b.I1 && (k2Var = y1Var.d) != null && k2Var.d != null) {
                    r2Var.p0();
                }
                if (y1Var.f6341e.M0() + 7 >= v1Var.h() - 1) {
                    v1Var.G();
                    return;
                }
                return;
            case 2:
                ci.d2 d2Var = (ci.d2) this.f1638b;
                ci.c2 c2Var = d2Var.f4894c;
                ci.o1 o1Var = d2Var.f4893b;
                ci.r2 r2Var2 = d2Var.f4899s;
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) r2Var2).containerView;
                viewGroup2.invalidate();
                int i14 = -1;
                if (d2Var.f4897n < 0.0f) {
                    i12 = d2Var.d.I0();
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 < o1Var.getChildCount()) {
                            View childAt = o1Var.getChildAt(i15);
                            if (childAt.getY() + childAt.getHeight() > d2Var.f4897n + o1Var.getPaddingTop()) {
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
                int size = c2Var.f4830y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = c2Var.f4830y.keyAt(size);
                        int valueAt = c2Var.f4830y.valueAt(size);
                        if (i12 >= keyAt) {
                            i14 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i14 >= 0) {
                    d2Var.f4895e.j(i14, true);
                }
                z11 = ((org.telegram.ui.ActionBar.e3) r2Var2).keyboardVisible;
                if (z11 && o1Var.I1 && (k2Var2 = d2Var.f4896f) != null && k2Var2.d != null) {
                    r2Var2.p0();
                    return;
                }
                return;
            case 3:
                sf sfVar = (sf) this.f1638b;
                View m10 = sfVar.f9492c.getLayoutManager().m(0);
                float f10 = 0.0f;
                if (m10 != null) {
                    f7 = m10.getY();
                } else {
                    f7 = 0.0f;
                }
                if (f7 >= 0.0f) {
                    f10 = f7;
                }
                sfVar.h = f10;
                sfVar.b();
                return;
            case 4:
                ei.e4 e4Var = (ei.e4) this.f1638b;
                long j3 = e4Var.P;
                int i16 = 0;
                while (true) {
                    if (i16 < e4Var.f41481c.getChildCount()) {
                        if (!(e4Var.f41481c.getChildAt(i16) instanceof m10)) {
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
                fi.s sVar = (fi.s) this.f1638b;
                sVar.v.b(sVar.d);
                return;
            case 6:
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) ((fi.h0) this.f1638b).f9975f).containerView;
                viewGroup3.invalidate();
                return;
            case 7:
                fi.j0 j0Var = (fi.j0) this.f1638b;
                j0Var.h.M.b(j0Var.d);
                return;
            case 8:
                hg.n.b0((hg.n) this.f1638b);
                return;
            case 9:
                hg.j0 j0Var2 = (hg.j0) this.f1638b;
                j0Var2.f30574b.b2(j0Var2, i11);
                j0Var2.P();
                return;
            case 10:
            case 21:
            default:
                return;
            case 11:
                ((li.e) this.f1638b).f15357f++;
                return;
            case 12:
                ((m4.w) this.f1638b).run();
                return;
            case 13:
                ((org.telegram.ui.Components.e0) this.f1638b).s0();
                return;
            case 14:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f1638b;
                s4.d0 d0Var = l8Var.f28089r;
                org.telegram.ui.Components.l8.Q(l8Var);
                l8Var.E0();
                if (!l8Var.f28076f) {
                    int L0 = d0Var.L0();
                    int i17 = 0;
                    if (l8Var.f28095v0) {
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
                ((yw0) this.f1638b).invalidate();
                return;
            case 16:
                mj mjVar = (mj) this.f1638b;
                mjVar.f30574b.b2(mjVar, i11);
                return;
            case 17:
                pj pjVar = (pj) this.f1638b;
                if (pjVar.f29504n.getChildCount() > 0) {
                    pjVar.f30574b.b2(pjVar, i11);
                    return;
                }
                return;
            case 18:
                ek ekVar = (ek) this.f1638b;
                ekVar.f30574b.b2(ekVar, i11);
                ekVar.R();
                return;
            case 19:
                uk ukVar = (uk) this.f1638b;
                hg.f0 f0Var = ukVar.E;
                ukVar.f30574b.b2(ukVar, i11);
                ukVar.X();
                s4.i0 adapter = ukVar.f31194r.getAdapter();
                tk tkVar = ukVar.f31198y;
                if (adapter == tkVar) {
                    int L02 = f0Var.L0();
                    int N02 = f0Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h10 - 10) {
                        tk tkVar2 = tkVar.X.f31198y;
                        if (!tkVar2.S && !tkVar2.V && (p0Var = tkVar.f30892y) != null) {
                            tkVar.Z(tkVar.f30891x, tkVar.E, tkVar.F, p0Var, tkVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                vk vkVar = (vk) this.f1638b;
                vkVar.f30574b.b2(vkVar, i11);
                vkVar.v.setTranslationY(Math.max(0, vkVar.getCurrentItemTop()));
                return;
            case 22:
                no noVar = (no) this.f1638b;
                hg.f0 f0Var2 = noVar.f28908w;
                noVar.f30574b.b2(noVar, i11);
                bo boVar = noVar.f28910x;
                if (boVar != null && boVar.f31304s) {
                    sz0 delegate = boVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        hc1 hc1Var = noVar.f28903s;
                        View F = hc1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = hc1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f47889a;
                            int b10 = T.b();
                            if (boVar.getDirection() == 0) {
                                boVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                boVar.setTranslationY(view.getY());
                            }
                            if (b10 < f0Var2.L0() || b10 > f0Var2.N0()) {
                                boVar.f();
                            }
                        } else {
                            boVar.f();
                        }
                    } else {
                        boVar.f();
                    }
                }
                if (i11 != 0 && (c50Var = noVar.f28912y) != null) {
                    c50Var.b(true);
                    return;
                }
                return;
            case 23:
                oo ooVar = (oo) this.f1638b;
                ooVar.f30574b.b2(ooVar, i11);
                return;
            case 24:
                eq eqVar = (eq) this.f1638b;
                if (eqVar.f25760x.M0() + 10 >= eqVar.h.h()) {
                    eqVar.y();
                    return;
                }
                return;
            case 25:
                lw lwVar = (lw) this.f1638b;
                bw bwVar = lwVar.f28295f;
                if (bwVar != null && lwVar.h.I1 && bwVar.f24763w) {
                    bwVar.f24763w = false;
                    bwVar.invalidate();
                    return;
                }
                return;
            case 26:
                d10 d10Var = (d10) this.f1638b;
                d10Var.F.invalidate();
                d10Var.invalidate();
                return;
            case 27:
                g10.H((g10) this.f1638b);
                return;
            case 28:
                sb0 sb0Var = (sb0) this.f1638b;
                s4.p0 layoutManager = sb0Var.getLayoutManager();
                tb0 tb0Var = sb0Var.Z2;
                mb0 mb0Var = tb0Var.d;
                if (layoutManager == mb0Var) {
                    N0 = mb0Var.N0();
                } else {
                    N0 = tb0Var.f30840c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    gg.j1 j1Var = tb0Var.f30842f;
                    if (N0 > j1Var.M0 - 5 && j1Var.f10689u0 == 0 && (str = j1Var.f10687s0) != null && str.length() != 0 && (user = j1Var.f10692w0) != null && (str2 = j1Var.f10685r0) != null) {
                        j1Var.T(true, user, str2, j1Var.f10687s0);
                    }
                }
                sb0Var.canScrollVertically(1);
                tb0Var.n(!sb0Var.canScrollVertically(-1));
                tb0Var.b();
                return;
            case 29:
                tc0 tc0Var = (tc0) this.f1638b;
                org.telegram.ui.y8 y8Var = tc0Var.f30853b;
                mc0 mc0Var = tc0Var.f30858f;
                for (int i18 = 0; i18 < mc0Var.getChildCount(); i18++) {
                    View childAt2 = mc0Var.getChildAt(i18);
                    if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt2).Z3(y8Var.getMeasuredWidth(), y8Var.getBackgroundSizeY());
                    }
                }
                lc0 lc0Var = tc0Var.f30857e;
                if (lc0Var != null) {
                    lc0Var.w();
                    return;
                }
                return;
        }
    }
}
