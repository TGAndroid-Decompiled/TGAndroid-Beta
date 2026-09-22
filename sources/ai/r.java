package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.lf;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.yj;
import org.telegram.ui.ec1;
import org.telegram.ui.lx;
public final class r extends s4.s0 {
    public final int f1444a;
    public final Object f1445b;

    public r(Object obj, int i10) {
        this.f1444a = i10;
        this.f1445b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        vk0 vk0Var;
        int i11;
        vk0 vk0Var2;
        vk0 vk0Var3;
        int top;
        int i12;
        vk0 vk0Var4;
        vk0 vk0Var5;
        int top2;
        boolean z10;
        switch (this.f1444a) {
            case 1:
                j7 j7Var = (j7) this.f1445b;
                if (i10 == 0) {
                    j7Var.V = true;
                    j7Var.invalidate();
                }
                if (i10 == 1) {
                    j7Var.V = false;
                    a5.a aVar = j7Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.f278c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.f278c).cancel();
                        aVar.f278c = null;
                    }
                    AndroidUtilities.hideKeyboard(j7Var);
                    return;
                }
                return;
            case 3:
                ci.e2 e2Var = (ci.e2) this.f1445b;
                if (i10 == 0 && e2Var.f4588n >= 0.0f && !e2Var.f4585b.canScrollVertically(-1)) {
                    e2Var.f4588n = -1.0f;
                    return;
                }
                return;
            case 7:
                fi.h0 h0Var = (fi.h0) this.f1445b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 11:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hg.f2) this.f1445b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                ((ki.e) this.f1445b).f13661f++;
                return;
            case 15:
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) this.f1445b;
                org.telegram.ui.Components.s7 s7Var = h8Var.f24569n;
                if (i10 == 0) {
                    if (org.telegram.ui.Components.h8.j0(h8Var) + ((h8Var.A0 - org.telegram.ui.Components.h8.i0(h8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && s7Var.canScrollVertically(1) && (vk0Var = (vk0) s7Var.K(h8Var.f24580v0 ? 1 : 0)) != null) {
                        View view = vk0Var.f42671a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            s7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(h8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 18:
                jj jjVar = (jj) this.f1445b;
                w0 w0Var = jjVar.f25351n;
                vi viVar = jjVar.f26461b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.f28731a1;
                    if (v0Var != null) {
                        i11 = AndroidUtilities.dp(v0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.f28735b2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var2 = (vk0) w0Var.K(0)) != null) {
                        View view2 = vk0Var2.f42671a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            w0Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ok okVar = (ok) this.f1445b;
                dk dkVar = okVar.f26821r;
                vi viVar2 = okVar.f26461b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = viVar2.getBackgroundPaddingTop();
                    if (((viVar2.f28735b2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var3 = (vk0) dkVar.K(0)) != null && (top = (vk0Var3.f42671a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        dkVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && okVar.f26815b0 && dkVar.getAdapter() == okVar.f26825y) {
                    AndroidUtilities.hideKeyboard(viVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                okVar.U = z11;
                return;
            case 21:
                pk pkVar = (pk) this.f1445b;
                ll0 ll0Var = pkVar.f27067r;
                vi viVar3 = pkVar.f26461b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var2 = viVar3.f28731a1;
                    if (v0Var2 != null) {
                        i12 = AndroidUtilities.dp(v0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = viVar3.getBackgroundPaddingTop();
                    if (((viVar3.f28735b2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var4 = (vk0) ll0Var.K(0)) != null) {
                        View view3 = vk0Var4.f42671a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            ll0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    gl glVar = (gl) this.f1445b;
                    if (glVar.f24396l0 && glVar.m0) {
                        AndroidUtilities.hideKeyboard(glVar.f26461b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 23:
                un unVar = (un) this.f1445b;
                ec1 ec1Var = unVar.f28460s;
                vi viVar4 = unVar.f26461b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = viVar4.getBackgroundPaddingTop();
                    if (((viVar4.f28735b2[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var5 = (vk0) ec1Var.K(1)) != null && (top2 = (vk0Var5.f42671a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        ec1Var.v0(0, top2, null);
                    }
                    int i15 = unVar.W0;
                    if (i15 >= 0) {
                        un.K(unVar, i15);
                        unVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 29:
                ma0 ma0Var = (ma0) this.f1445b;
                boolean z12 = false;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ma0Var.X2 = z10;
                if (i10 == 1) {
                    z12 = true;
                }
                ma0Var.Y2 = z12;
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
        i40 i40Var;
        s4.c1 T;
        int N0;
        int i13;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.f1444a) {
            case 0:
                lx lxVar = (lx) this.f1445b;
                lxVar.invalidate();
                lxVar.c();
                ci.f4 f4Var = lxVar.J;
                if (f4Var != null) {
                    f4Var.e(true);
                    return;
                }
                return;
            case 1:
                j7 j7Var = (j7) this.f1445b;
                j7Var.c();
                j7Var.invalidate();
                return;
            case 2:
                ci.z1 z1Var = (ci.z1) this.f1445b;
                ci.w1 w1Var = z1Var.f5854c;
                ci.t2 t2Var = z1Var.f5857r;
                viewGroup = ((org.telegram.ui.ActionBar.f3) t2Var).containerView;
                viewGroup.invalidate();
                z10 = ((org.telegram.ui.ActionBar.f3) t2Var).keyboardVisible;
                if (z10 && z1Var.f5853b.K1 && (l2Var = z1Var.d) != null && l2Var.d != null) {
                    t2Var.o0();
                }
                if (z1Var.e.M0() + 7 >= w1Var.h() - 1) {
                    w1Var.G();
                    return;
                }
                return;
            case 3:
                ci.e2 e2Var = (ci.e2) this.f1445b;
                ci.d2 d2Var = e2Var.f4586c;
                ci.p1 p1Var = e2Var.f4585b;
                ci.t2 t2Var2 = e2Var.f4590s;
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) t2Var2).containerView;
                viewGroup2.invalidate();
                int i14 = -1;
                if (e2Var.f4588n < 0.0f) {
                    i12 = e2Var.d.I0();
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 < p1Var.getChildCount()) {
                            View childAt = p1Var.getChildAt(i15);
                            if (childAt.getY() + childAt.getHeight() > e2Var.f4588n + p1Var.getPaddingTop()) {
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
                int size = d2Var.f4492y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = d2Var.f4492y.keyAt(size);
                        int valueAt = d2Var.f4492y.valueAt(size);
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
                z11 = ((org.telegram.ui.ActionBar.f3) t2Var2).keyboardVisible;
                if (z11 && p1Var.K1 && (l2Var2 = e2Var.f4587f) != null && l2Var2.d != null) {
                    t2Var2.o0();
                    return;
                }
                return;
            case 4:
                lf lfVar = (lf) this.f1445b;
                View m10 = lfVar.f8737c.getLayoutManager().m(0);
                float f10 = 0.0f;
                if (m10 != null) {
                    f7 = m10.getY();
                } else {
                    f7 = 0.0f;
                }
                if (f7 >= 0.0f) {
                    f10 = f7;
                }
                lfVar.h = f10;
                lfVar.b();
                return;
            case 5:
                ei.e4 e4Var = (ei.e4) this.f1445b;
                long j3 = e4Var.P;
                int i16 = 0;
                while (true) {
                    if (i16 < e4Var.f37004c.getChildCount()) {
                        if (!(e4Var.f37004c.getChildAt(i16) instanceof t00)) {
                            i16++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                yh.o.g(ei.e4.C0(e4Var)).d(j3).a();
                yh.o.g(ei.e4.D0(e4Var)).e(j3).a();
                return;
            case 6:
                fi.s sVar = (fi.s) this.f1445b;
                sVar.v.b(sVar.d);
                return;
            case 7:
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((fi.h0) this.f1445b).f9110f).containerView;
                viewGroup3.invalidate();
                return;
            case 8:
                fi.j0 j0Var = (fi.j0) this.f1445b;
                j0Var.h.M.b(j0Var.d);
                return;
            case 9:
                hg.n.b0((hg.n) this.f1445b);
                return;
            case 10:
                hg.k0 k0Var = (hg.k0) this.f1445b;
                k0Var.f26461b.X1(k0Var, i11);
                k0Var.M();
                return;
            case 11:
            case 22:
            default:
                return;
            case 12:
                ((ki.e) this.f1445b).f13661f++;
                return;
            case 13:
                ((m4.g0) this.f1445b).run();
                return;
            case 14:
                ((org.telegram.ui.Components.e0) this.f1445b).r0();
                return;
            case 15:
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) this.f1445b;
                s4.c0 c0Var = h8Var.f24574r;
                org.telegram.ui.Components.h8.P(h8Var);
                h8Var.E0();
                if (!h8Var.f24561f) {
                    int L0 = c0Var.L0();
                    int i17 = 0;
                    if (h8Var.f24580v0) {
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
                ((pv0) this.f1445b).invalidate();
                return;
            case 17:
                gj gjVar = (gj) this.f1445b;
                gjVar.f26461b.X1(gjVar, i11);
                return;
            case 18:
                jj jjVar = (jj) this.f1445b;
                if (jjVar.f25351n.getChildCount() > 0) {
                    jjVar.f26461b.X1(jjVar, i11);
                    return;
                }
                return;
            case 19:
                yj yjVar = (yj) this.f1445b;
                yjVar.f26461b.X1(yjVar, i11);
                yjVar.O();
                return;
            case 20:
                ok okVar = (ok) this.f1445b;
                hg.g0 g0Var = okVar.E;
                okVar.f26461b.X1(okVar, i11);
                okVar.U();
                s4.h0 adapter = okVar.f26821r.getAdapter();
                nk nkVar = okVar.f26825y;
                if (adapter == nkVar) {
                    int L02 = g0Var.L0();
                    int N02 = g0Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h10 - 10) {
                        nk nkVar2 = nkVar.X.f26825y;
                        if (!nkVar2.S && !nkVar2.V && (q0Var = nkVar.f26483y) != null) {
                            nkVar.Z(nkVar.f26482x, nkVar.E, nkVar.F, q0Var, nkVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                pk pkVar = (pk) this.f1445b;
                pkVar.f26461b.X1(pkVar, i11);
                pkVar.v.setTranslationY(Math.max(0, pkVar.getCurrentItemTop()));
                return;
            case 23:
                un unVar = (un) this.f1445b;
                hg.g0 g0Var2 = unVar.f28465w;
                unVar.f26461b.X1(unVar, i11);
                jn jnVar = unVar.f28467x;
                if (jnVar != null && jnVar.f26623s) {
                    ly0 delegate = jnVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        ec1 ec1Var = unVar.f28460s;
                        View F = ec1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = ec1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f42671a;
                            int b10 = T.b();
                            if (jnVar.getDirection() == 0) {
                                jnVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                jnVar.setTranslationY(view.getY());
                            }
                            if (b10 < g0Var2.L0() || b10 > g0Var2.N0()) {
                                jnVar.f();
                            }
                        } else {
                            jnVar.f();
                        }
                    } else {
                        jnVar.f();
                    }
                }
                if (i11 != 0 && (i40Var = unVar.f28469y) != null) {
                    i40Var.b(true);
                    return;
                }
                return;
            case 24:
                vn vnVar = (vn) this.f1445b;
                vnVar.f26461b.X1(vnVar, i11);
                return;
            case 25:
                mp mpVar = (mp) this.f1445b;
                if (mpVar.f26207x.M0() + 10 >= mpVar.h.h()) {
                    mpVar.w();
                    return;
                }
                return;
            case 26:
                sv svVar = (sv) this.f1445b;
                iv ivVar = svVar.f27973f;
                if (ivVar != null && svVar.h.K1 && ivVar.f25148w) {
                    ivVar.f25148w = false;
                    ivVar.invalidate();
                    return;
                }
                return;
            case 27:
                k00 k00Var = (k00) this.f1445b;
                k00Var.F.invalidate();
                k00Var.invalidate();
                return;
            case 28:
                n00.G((n00) this.f1445b);
                return;
            case 29:
                ma0 ma0Var = (ma0) this.f1445b;
                s4.o0 layoutManager = ma0Var.getLayoutManager();
                na0 na0Var = ma0Var.f26135b3;
                ga0 ga0Var = na0Var.d;
                if (layoutManager == ga0Var) {
                    N0 = ga0Var.N0();
                } else {
                    N0 = na0Var.f26423c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    gg.k1 k1Var = na0Var.f26424f;
                    if (N0 > k1Var.M0 - 5 && k1Var.f9835u0 == 0 && (str = k1Var.f9833s0) != null && str.length() != 0 && (user = k1Var.f9838w0) != null && (str2 = k1Var.f9831r0) != null) {
                        k1Var.T(true, user, str2, k1Var.f9833s0);
                    }
                }
                ma0Var.canScrollVertically(1);
                na0Var.n(!ma0Var.canScrollVertically(-1));
                na0Var.b();
                return;
        }
    }
}
