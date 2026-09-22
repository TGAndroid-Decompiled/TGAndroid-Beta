package ai;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.Components.yj;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.fc1;
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
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.f277c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.f277c).cancel();
                        aVar.f277c = null;
                    }
                    AndroidUtilities.hideKeyboard(j7Var);
                    return;
                }
                return;
            case 3:
                ci.e2 e2Var = (ci.e2) this.f1445b;
                if (i10 == 0 && e2Var.f4590n >= 0.0f && !e2Var.f4587b.canScrollVertically(-1)) {
                    e2Var.f4590n = -1.0f;
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
                    AndroidUtilities.hideKeyboard(((hg.e2) this.f1445b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                ((li.i) this.f1445b).e++;
                return;
            case 15:
                org.telegram.ui.Components.i8 i8Var = (org.telegram.ui.Components.i8) this.f1445b;
                org.telegram.ui.Components.t7 t7Var = i8Var.f25012n;
                if (i10 == 0) {
                    if (org.telegram.ui.Components.i8.j0(i8Var) + ((i8Var.A0 - org.telegram.ui.Components.i8.i0(i8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && t7Var.canScrollVertically(1) && (il0Var = (il0) t7Var.L(i8Var.f25023v0 ? 1 : 0)) != null) {
                        View view = il0Var.f42995a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            t7Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(i8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 18:
                jj jjVar = (jj) this.f1445b;
                w0 w0Var = jjVar.f25384n;
                vi viVar = jjVar.f26786b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.f29080a1;
                    if (v0Var != null) {
                        i11 = AndroidUtilities.dp(v0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.f29084b2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var2 = (il0) w0Var.L(0)) != null) {
                        View view2 = il0Var2.f42995a;
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
                ok okVar = (ok) this.f1445b;
                dk dkVar = okVar.f27117r;
                vi viVar2 = okVar.f26786b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = viVar2.getBackgroundPaddingTop();
                    if (((viVar2.f29084b2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var3 = (il0) dkVar.L(0)) != null && (top = (il0Var3.f42995a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        dkVar.w0(0, top, null);
                    }
                }
                if (i10 == 1 && okVar.f27111b0 && dkVar.getAdapter() == okVar.f27121y) {
                    AndroidUtilities.hideKeyboard(viVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                okVar.U = z11;
                return;
            case 21:
                pk pkVar = (pk) this.f1445b;
                yl0 yl0Var = pkVar.f27363r;
                vi viVar3 = pkVar.f26786b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var2 = viVar3.f29080a1;
                    if (v0Var2 != null) {
                        i12 = AndroidUtilities.dp(v0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = viVar3.getBackgroundPaddingTop();
                    if (((viVar3.f29084b2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var4 = (il0) yl0Var.L(0)) != null) {
                        View view3 = il0Var4.f42995a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            yl0Var.w0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
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
                    if (glVar.f24574l0 && glVar.m0) {
                        AndroidUtilities.hideKeyboard(glVar.f26786b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 23:
                un unVar = (un) this.f1445b;
                fc1 fc1Var = unVar.f28835s;
                vi viVar4 = unVar.f26786b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = viVar4.getBackgroundPaddingTop();
                    if (((viVar4.f29084b2[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var5 = (il0) fc1Var.L(1)) != null && (top2 = (il0Var5.f42995a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        fc1Var.w0(0, top2, null);
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
                xa0 xa0Var = (xa0) this.f1445b;
                boolean z12 = false;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xa0Var.X2 = z10;
                if (i10 == 1) {
                    z12 = true;
                }
                xa0Var.Y2 = z12;
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
        float f7;
        gg.q0 q0Var;
        i40 i40Var;
        s4.c1 U;
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
                ci.w1 w1Var = z1Var.f5856c;
                ci.t2 t2Var = z1Var.f5859r;
                ci.t2.t(t2Var).invalidate();
                if (ci.t2.F(t2Var) && z1Var.f5855b.K1 && (l2Var = z1Var.d) != null && l2Var.d != null) {
                    t2Var.o0();
                }
                if (z1Var.e.M0() + 7 >= w1Var.h() - 1) {
                    w1Var.G();
                    return;
                }
                return;
            case 3:
                ci.e2 e2Var = (ci.e2) this.f1445b;
                ci.d2 d2Var = e2Var.f4588c;
                ci.p1 p1Var = e2Var.f4587b;
                ci.t2 t2Var2 = e2Var.f4592s;
                ci.t2.J(t2Var2).invalidate();
                int i14 = -1;
                if (e2Var.f4590n < 0.0f) {
                    i12 = e2Var.d.I0();
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 < p1Var.getChildCount()) {
                            View childAt = p1Var.getChildAt(i15);
                            if (childAt.getY() + childAt.getHeight() > e2Var.f4590n + p1Var.getPaddingTop()) {
                                p1Var.getClass();
                                i12 = RecyclerView.S(childAt);
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
                int size = d2Var.f4494y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = d2Var.f4494y.keyAt(size);
                        int valueAt = d2Var.f4494y.valueAt(size);
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
                if (ci.t2.K(t2Var2) && p1Var.K1 && (l2Var2 = e2Var.f4589f) != null && l2Var2.d != null) {
                    t2Var2.o0();
                    return;
                }
                return;
            case 4:
                nf nfVar = (nf) this.f1445b;
                View m10 = nfVar.f8739c.getLayoutManager().m(0);
                float f10 = 0.0f;
                if (m10 != null) {
                    f7 = m10.getY();
                } else {
                    f7 = 0.0f;
                }
                if (f7 >= 0.0f) {
                    f10 = f7;
                }
                nfVar.h = f10;
                nfVar.b();
                return;
            case 5:
                ei.e4 e4Var = (ei.e4) this.f1445b;
                long j3 = e4Var.P;
                int i16 = 0;
                while (true) {
                    if (i16 < e4Var.f37047c.getChildCount()) {
                        if (!(e4Var.f37047c.getChildAt(i16) instanceof t00)) {
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
                fi.k0.M(((fi.h0) this.f1445b).f9113f).invalidate();
                return;
            case 8:
                fi.j0 j0Var = (fi.j0) this.f1445b;
                j0Var.h.M.b(j0Var.d);
                return;
            case 9:
                hg.m.b0((hg.m) this.f1445b);
                return;
            case 10:
                hg.i0 i0Var = (hg.i0) this.f1445b;
                i0Var.f26786b.X1(i0Var, i11);
                i0Var.M();
                return;
            case 11:
            case 22:
            default:
                return;
            case 12:
                ((li.i) this.f1445b).e++;
                return;
            case 13:
                ((ki.l) this.f1445b).run();
                return;
            case 14:
                ((org.telegram.ui.Components.e0) this.f1445b).r0();
                return;
            case 15:
                org.telegram.ui.Components.i8 i8Var = (org.telegram.ui.Components.i8) this.f1445b;
                s4.c0 c0Var = i8Var.f25017r;
                org.telegram.ui.Components.i8.P(i8Var);
                i8Var.E0();
                if (!i8Var.f25004f) {
                    int L0 = c0Var.L0();
                    int i17 = 0;
                    if (i8Var.f25023v0) {
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
                ((cw0) this.f1445b).invalidate();
                return;
            case 17:
                gj gjVar = (gj) this.f1445b;
                gjVar.f26786b.X1(gjVar, i11);
                return;
            case 18:
                jj jjVar = (jj) this.f1445b;
                if (jjVar.f25384n.getChildCount() > 0) {
                    jjVar.f26786b.X1(jjVar, i11);
                    return;
                }
                return;
            case 19:
                yj yjVar = (yj) this.f1445b;
                yjVar.f26786b.X1(yjVar, i11);
                yjVar.O();
                return;
            case 20:
                ok okVar = (ok) this.f1445b;
                hg.e0 e0Var = okVar.E;
                okVar.f26786b.X1(okVar, i11);
                okVar.U();
                s4.h0 adapter = okVar.f27117r.getAdapter();
                nk nkVar = okVar.f27121y;
                if (adapter == nkVar) {
                    int L02 = e0Var.L0();
                    int N02 = e0Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h10 - 10) {
                        nk nkVar2 = nkVar.X.f27121y;
                        if (!nkVar2.S && !nkVar2.V && (q0Var = nkVar.f26799y) != null) {
                            nkVar.Z(nkVar.f26798x, nkVar.E, nkVar.F, q0Var, nkVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                pk pkVar = (pk) this.f1445b;
                pkVar.f26786b.X1(pkVar, i11);
                pkVar.v.setTranslationY(Math.max(0, pkVar.getCurrentItemTop()));
                return;
            case 23:
                un unVar = (un) this.f1445b;
                hg.e0 e0Var2 = unVar.f28840w;
                unVar.f26786b.X1(unVar, i11);
                jn jnVar = unVar.f28842x;
                if (jnVar != null && jnVar.f22784s) {
                    yy0 delegate = jnVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.e6) {
                        fc1 fc1Var = unVar.f28835s;
                        View G = fc1Var.G((org.telegram.ui.Cells.e6) delegate);
                        if (G == null) {
                            U = null;
                        } else {
                            U = fc1Var.U(G);
                        }
                        if (U != null) {
                            View view = U.f42995a;
                            int b10 = U.b();
                            if (jnVar.getDirection() == 0) {
                                jnVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                jnVar.setTranslationY(view.getY());
                            }
                            if (b10 < e0Var2.L0() || b10 > e0Var2.N0()) {
                                jnVar.f();
                            }
                        } else {
                            jnVar.f();
                        }
                    } else {
                        jnVar.f();
                    }
                }
                if (i11 != 0 && (i40Var = unVar.f28844y) != null) {
                    i40Var.b(true);
                    return;
                }
                return;
            case 24:
                vn vnVar = (vn) this.f1445b;
                vnVar.f26786b.X1(vnVar, i11);
                return;
            case 25:
                mp mpVar = (mp) this.f1445b;
                if (mpVar.f26510x.M0() + 10 >= mpVar.h.h()) {
                    mpVar.w();
                    return;
                }
                return;
            case 26:
                tv tvVar = (tv) this.f1445b;
                jv jvVar = tvVar.f28536f;
                if (jvVar != null && tvVar.h.K1 && jvVar.f25478w) {
                    jvVar.f25478w = false;
                    jvVar.invalidate();
                    return;
                }
                return;
            case 27:
                k00 k00Var = (k00) this.f1445b;
                k00Var.F.invalidate();
                k00Var.invalidate();
                return;
            case 28:
                n00.F((n00) this.f1445b);
                return;
            case 29:
                xa0 xa0Var = (xa0) this.f1445b;
                s4.o0 layoutManager = xa0Var.getLayoutManager();
                ya0 ya0Var = xa0Var.f30297b3;
                ra0 ra0Var = ya0Var.d;
                if (layoutManager == ra0Var) {
                    N0 = ra0Var.N0();
                } else {
                    N0 = ya0Var.f30617c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    gg.k1 k1Var = ya0Var.f30618f;
                    if (N0 > k1Var.M0 - 5 && k1Var.f9839u0 == 0 && (str = k1Var.f9837s0) != null && str.length() != 0 && (user = k1Var.f9842w0) != null && (str2 = k1Var.f9835r0) != null) {
                        k1Var.T(true, user, str2, k1Var.f9837s0);
                    }
                }
                xa0Var.canScrollVertically(1);
                ya0Var.n(!xa0Var.canScrollVertically(-1));
                ya0Var.b();
                return;
        }
    }
}
