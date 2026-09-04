package ah;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bi.s6;
import di.d2;
import di.e2;
import di.f4;
import di.l2;
import di.p1;
import di.t2;
import di.w1;
import di.z1;
import fi.e4;
import ji.b5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.rv;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.yj;
import org.telegram.ui.ec1;
import org.telegram.ui.lx;
public final class e0 extends s4.s0 {
    public final int f504a;
    public final Object f505b;

    public e0(Object obj, int i10) {
        this.f504a = i10;
        this.f505b = obj;
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
        switch (this.f504a) {
            case 2:
                s6 s6Var = (s6) this.f505b;
                if (i10 == 0) {
                    s6Var.V = true;
                    s6Var.invalidate();
                }
                if (i10 == 1) {
                    s6Var.V = false;
                    a5.a aVar = s6Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.f286c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.f286c).cancel();
                        aVar.f286c = null;
                    }
                    AndroidUtilities.hideKeyboard(s6Var);
                    return;
                }
                return;
            case 4:
                e2 e2Var = (e2) this.f505b;
                if (i10 == 0 && e2Var.f7158n >= 0.0f && !e2Var.f7154b.canScrollVertically(-1)) {
                    e2Var.f7158n = -1.0f;
                    return;
                }
                return;
            case 8:
                gi.h0 h0Var = (gi.h0) this.f505b;
                if (i10 == 0) {
                    h0Var.f10695e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 12:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ig.e2) this.f505b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 15:
                k8 k8Var = (k8) this.f505b;
                v7 v7Var = k8Var.f27729n;
                if (i10 == 0) {
                    if (k8.j0(k8Var) + ((k8Var.A0 - k8.i0(k8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && v7Var.canScrollVertically(1) && (vk0Var = (vk0) v7Var.K(k8Var.f27740v0 ? 1 : 0)) != null) {
                        View view = vk0Var.f45738a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            v7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(k8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 18:
                jj jjVar = (jj) this.f505b;
                bi.o0 o0Var = jjVar.f27513n;
                vi viVar = jjVar.f28753b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.f31262a1;
                    if (v0Var != null) {
                        i11 = AndroidUtilities.dp(v0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.f31266b2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var2 = (vk0) o0Var.K(0)) != null) {
                        View view2 = vk0Var2.f45738a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            o0Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ok okVar = (ok) this.f505b;
                dk dkVar = okVar.f29092r;
                vi viVar2 = okVar.f28753b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = viVar2.getBackgroundPaddingTop();
                    if (((viVar2.f31266b2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var3 = (vk0) dkVar.K(0)) != null && (top = (vk0Var3.f45738a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        dkVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && okVar.f29086b0 && dkVar.getAdapter() == okVar.f29096y) {
                    AndroidUtilities.hideKeyboard(viVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                okVar.U = z11;
                return;
            case 21:
                pk pkVar = (pk) this.f505b;
                ll0 ll0Var = pkVar.f29409r;
                vi viVar3 = pkVar.f28753b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var2 = viVar3.f31262a1;
                    if (v0Var2 != null) {
                        i12 = AndroidUtilities.dp(v0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = viVar3.getBackgroundPaddingTop();
                    if (((viVar3.f31266b2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var4 = (vk0) ll0Var.K(0)) != null) {
                        View view3 = vk0Var4.f45738a;
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
                    gl glVar = (gl) this.f505b;
                    if (glVar.f26439l0 && glVar.m0) {
                        AndroidUtilities.hideKeyboard(glVar.f28753b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 23:
                tn tnVar = (tn) this.f505b;
                ec1 ec1Var = tnVar.f30654s;
                vi viVar4 = tnVar.f28753b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = viVar4.getBackgroundPaddingTop();
                    if (((viVar4.f31266b2[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var5 = (vk0) ec1Var.K(1)) != null && (top2 = (vk0Var5.f45738a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        ec1Var.v0(0, top2, null);
                    }
                    int i15 = tnVar.W0;
                    if (i15 >= 0) {
                        tn.K(tnVar, i15);
                        tnVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 29:
                na0 na0Var = (na0) this.f505b;
                boolean z12 = false;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                na0Var.X2 = z10;
                if (i10 == 1) {
                    z12 = true;
                }
                na0Var.Y2 = z12;
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        boolean z10;
        l2 l2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z11;
        l2 l2Var2;
        float f7;
        ViewGroup viewGroup3;
        hg.q0 q0Var;
        i40 i40Var;
        s4.c1 T;
        int N0;
        int i13;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.f504a) {
            case 0:
                ((g0) this.f505b).c(true);
                return;
            case 1:
                lx lxVar = (lx) this.f505b;
                lxVar.invalidate();
                lxVar.c();
                f4 f4Var = lxVar.J;
                if (f4Var != null) {
                    f4Var.e(true);
                    return;
                }
                return;
            case 2:
                s6 s6Var = (s6) this.f505b;
                s6Var.c();
                s6Var.invalidate();
                return;
            case 3:
                z1 z1Var = (z1) this.f505b;
                w1 w1Var = z1Var.f8507c;
                t2 t2Var = z1Var.f8511r;
                viewGroup = ((f3) t2Var).containerView;
                viewGroup.invalidate();
                z10 = ((f3) t2Var).keyboardVisible;
                if (z10 && z1Var.f8506b.K1 && (l2Var = z1Var.d) != null && l2Var.d != null) {
                    t2Var.o0();
                }
                if (z1Var.f8508e.M0() + 7 >= w1Var.h() - 1) {
                    w1Var.G();
                    return;
                }
                return;
            case 4:
                e2 e2Var = (e2) this.f505b;
                d2 d2Var = e2Var.f7155c;
                p1 p1Var = e2Var.f7154b;
                t2 t2Var2 = e2Var.f7160s;
                viewGroup2 = ((f3) t2Var2).containerView;
                viewGroup2.invalidate();
                int i14 = -1;
                if (e2Var.f7158n < 0.0f) {
                    i12 = e2Var.d.I0();
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 < p1Var.getChildCount()) {
                            View childAt = p1Var.getChildAt(i15);
                            if (childAt.getY() + childAt.getHeight() > e2Var.f7158n + p1Var.getPaddingTop()) {
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
                int size = d2Var.f7059y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = d2Var.f7059y.keyAt(size);
                        int valueAt = d2Var.f7059y.valueAt(size);
                        if (i12 >= keyAt) {
                            i14 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i14 >= 0) {
                    e2Var.f7156e.j(i14, true);
                }
                z11 = ((f3) t2Var2).keyboardVisible;
                if (z11 && p1Var.K1 && (l2Var2 = e2Var.f7157f) != null && l2Var2.d != null) {
                    t2Var2.o0();
                    return;
                }
                return;
            case 5:
                of ofVar = (of) this.f505b;
                View m10 = ofVar.f10100c.getLayoutManager().m(0);
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
            case 6:
                e4 e4Var = (e4) this.f505b;
                long j3 = e4Var.P;
                int i16 = 0;
                while (true) {
                    if (i16 < e4Var.f40041c.getChildCount()) {
                        if (!(e4Var.f40041c.getChildAt(i16) instanceof t00)) {
                            i16++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                zh.o.g(e4.C0(e4Var)).d(j3).a();
                zh.o.g(e4.D0(e4Var)).e(j3).a();
                return;
            case 7:
                gi.s sVar = (gi.s) this.f505b;
                sVar.v.b(sVar.d);
                return;
            case 8:
                viewGroup3 = ((f3) ((gi.h0) this.f505b).f10696f).containerView;
                viewGroup3.invalidate();
                return;
            case 9:
                gi.j0 j0Var = (gi.j0) this.f505b;
                j0Var.h.M.b(j0Var.d);
                return;
            case 10:
                ig.m.b0((ig.m) this.f505b);
                return;
            case 11:
                ig.i0 i0Var = (ig.i0) this.f505b;
                i0Var.f28753b.X1(i0Var, i11);
                i0Var.M();
                return;
            case 12:
            case 22:
            default:
                return;
            case 13:
                ((b5) this.f505b).run();
                return;
            case 14:
                ((org.telegram.ui.Components.f0) this.f505b).r0();
                return;
            case 15:
                k8 k8Var = (k8) this.f505b;
                s4.c0 c0Var = k8Var.f27734r;
                k8.P(k8Var);
                k8Var.E0();
                if (!k8Var.f27721f) {
                    int L0 = c0Var.L0();
                    int i17 = 0;
                    if (k8Var.f27740v0) {
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
                ((ov0) this.f505b).invalidate();
                return;
            case 17:
                gj gjVar = (gj) this.f505b;
                gjVar.f28753b.X1(gjVar, i11);
                return;
            case 18:
                jj jjVar = (jj) this.f505b;
                if (jjVar.f27513n.getChildCount() > 0) {
                    jjVar.f28753b.X1(jjVar, i11);
                    return;
                }
                return;
            case 19:
                yj yjVar = (yj) this.f505b;
                yjVar.f28753b.X1(yjVar, i11);
                yjVar.O();
                return;
            case 20:
                ok okVar = (ok) this.f505b;
                ig.e0 e0Var = okVar.E;
                okVar.f28753b.X1(okVar, i11);
                okVar.U();
                s4.h0 adapter = okVar.f29092r.getAdapter();
                nk nkVar = okVar.f29096y;
                if (adapter == nkVar) {
                    int L02 = e0Var.L0();
                    int N02 = e0Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h10 - 10) {
                        nk nkVar2 = nkVar.X.f29096y;
                        if (!nkVar2.S && !nkVar2.V && (q0Var = nkVar.f28777y) != null) {
                            nkVar.Z(nkVar.f28776x, nkVar.E, nkVar.F, q0Var, nkVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                pk pkVar = (pk) this.f505b;
                pkVar.f28753b.X1(pkVar, i11);
                pkVar.v.setTranslationY(Math.max(0, pkVar.getCurrentItemTop()));
                return;
            case 23:
                tn tnVar = (tn) this.f505b;
                ig.e0 e0Var2 = tnVar.f30659w;
                tnVar.f28753b.X1(tnVar, i11);
                in inVar = tnVar.f30661x;
                if (inVar != null && inVar.f28566s) {
                    ky0 delegate = inVar.getDelegate();
                    if (delegate instanceof c6) {
                        ec1 ec1Var = tnVar.f30654s;
                        View F = ec1Var.F((c6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = ec1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f45738a;
                            int b10 = T.b();
                            if (inVar.getDirection() == 0) {
                                inVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                inVar.setTranslationY(view.getY());
                            }
                            if (b10 < e0Var2.L0() || b10 > e0Var2.N0()) {
                                inVar.f();
                            }
                        } else {
                            inVar.f();
                        }
                    } else {
                        inVar.f();
                    }
                }
                if (i11 != 0 && (i40Var = tnVar.f30663y) != null) {
                    i40Var.b(true);
                    return;
                }
                return;
            case 24:
                un unVar = (un) this.f505b;
                unVar.f28753b.X1(unVar, i11);
                return;
            case 25:
                lp lpVar = (lp) this.f505b;
                if (lpVar.f28271x.M0() + 10 >= lpVar.h.h()) {
                    lpVar.w();
                    return;
                }
                return;
            case 26:
                rv rvVar = (rv) this.f505b;
                hv hvVar = rvVar.f30096f;
                if (hvVar != null && rvVar.h.K1 && hvVar.f26874w) {
                    hvVar.f26874w = false;
                    hvVar.invalidate();
                    return;
                }
                return;
            case 27:
                k00 k00Var = (k00) this.f505b;
                k00Var.F.invalidate();
                k00Var.invalidate();
                return;
            case 28:
                n00.G((n00) this.f505b);
                return;
            case 29:
                na0 na0Var = (na0) this.f505b;
                s4.o0 layoutManager = na0Var.getLayoutManager();
                oa0 oa0Var = na0Var.f28722b3;
                ha0 ha0Var = oa0Var.d;
                if (layoutManager == ha0Var) {
                    N0 = ha0Var.N0();
                } else {
                    N0 = oa0Var.f29019c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    hg.k1 k1Var = oa0Var.f29021f;
                    if (N0 > k1Var.L0 - 5 && k1Var.f11153u0 == 0 && (str = k1Var.f11151s0) != null && str.length() != 0 && (user = k1Var.f11156w0) != null && (str2 = k1Var.f11149r0) != null) {
                        k1Var.T(true, user, str2, k1Var.f11151s0);
                    }
                }
                na0Var.canScrollVertically(1);
                oa0Var.n(!na0Var.canScrollVertically(-1));
                oa0Var.b();
                return;
        }
    }
}
