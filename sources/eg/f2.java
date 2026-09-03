package eg;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kh.p5;
import kh.q5;
import lh.g5;
import lh.ga;
import nh.d5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.zi;
import org.telegram.ui.ix;
import org.telegram.ui.rb1;
import ph.f3;
public final class f2 extends f2.z0 {
    public final int f5280a;
    public final Object f5281b;

    public f2(Object obj, int i10) {
        this.f5280a = i10;
        this.f5281b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        dl0 dl0Var;
        int i11;
        dl0 dl0Var2;
        dl0 dl0Var3;
        int top;
        int i12;
        dl0 dl0Var4;
        dl0 dl0Var5;
        int top2;
        boolean z4;
        switch (this.f5280a) {
            case 0:
                g1 g1Var = (g1) this.f5281b;
                if (i10 == 1) {
                    g1Var.f5308a3 = true;
                }
                if (i10 == 0) {
                    i2 i2Var = null;
                    for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
                        i2 i2Var2 = (i2) g1Var.getChildAt(i13);
                        if (i2Var == null || i2Var2.f5296a > i2Var.f5296a) {
                            i2Var = i2Var2;
                        }
                    }
                    if (i2Var != null) {
                        g1Var.v1(i2Var, true);
                        g1Var.f5308a3 = false;
                        g1Var.v0(0, i2Var.getTop() - ((g1Var.getMeasuredHeight() - i2Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    g1Var.w1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(g1Var.f5309b3);
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((gg.f2) this.f5281b).V.getEditText());
                    return;
                }
                return;
            case 12:
                d5 d5Var = (d5) this.f5281b;
                if (i10 == 0) {
                    d5Var.S = true;
                    d5Var.invalidate();
                }
                if (i10 == 1) {
                    d5Var.S = false;
                    b4.e0 e0Var = d5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) e0Var.f1379c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) e0Var.f1379c).cancel();
                        e0Var.f1379c = null;
                    }
                    AndroidUtilities.hideKeyboard(d5Var);
                    return;
                }
                return;
            case 15:
                c8 c8Var = (c8) this.f5281b;
                o7 o7Var = c8Var.f23855n;
                if (i10 == 0) {
                    if (c8.j0(c8Var) + ((c8Var.f23870x0 - c8.i0(c8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && o7Var.canScrollVertically(1) && (dl0Var = (dl0) o7Var.K(c8Var.f23863s0 ? 1 : 0)) != null) {
                        View view = dl0Var.f5774a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            o7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(c8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 18:
                zi ziVar = (zi) this.f5281b;
                lh.e1 e1Var = ziVar.f31386n;
                li liVar = ziVar.f24282b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = liVar.X0;
                    if (w0Var != null) {
                        i11 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i14 = dp + i11;
                    int backgroundPaddingTop = liVar.getBackgroundPaddingTop();
                    if (((liVar.Y1[0] - backgroundPaddingTop) - i14) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (dl0Var2 = (dl0) e1Var.K(0)) != null) {
                        View view2 = dl0Var2.f5774a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            e1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                hk hkVar = (hk) this.f5281b;
                vj vjVar = hkVar.f25436r;
                li liVar2 = hkVar.f24282b;
                boolean z10 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = liVar2.getBackgroundPaddingTop();
                    if (((liVar2.Y1[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (dl0Var3 = (dl0) vjVar.K(0)) != null && (top = (dl0Var3.f5774a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        vjVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && hkVar.V && vjVar.getAdapter() == hkVar.f25440y) {
                    AndroidUtilities.hideKeyboard(liVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z10 = true;
                }
                hkVar.R = z10;
                return;
            case 21:
                ik ikVar = (ik) this.f5281b;
                rl0 rl0Var = ikVar.f25733r;
                li liVar3 = ikVar.f24282b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var2 = liVar3.X0;
                    if (w0Var2 != null) {
                        i12 = AndroidUtilities.dp(w0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i15 = dp3 + i12;
                    int backgroundPaddingTop3 = liVar3.getBackgroundPaddingTop();
                    if (((liVar3.Y1[0] - backgroundPaddingTop3) - i15) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (dl0Var4 = (dl0) rl0Var.K(0)) != null) {
                        View view3 = dl0Var4.f5774a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            rl0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    al alVar = (al) this.f5281b;
                    if (alVar.f23407i0 && alVar.f23408j0) {
                        AndroidUtilities.hideKeyboard(alVar.f24282b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 23:
                pn pnVar = (pn) this.f5281b;
                rb1 rb1Var = pnVar.f27960s;
                li liVar4 = pnVar.f24282b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = liVar4.getBackgroundPaddingTop();
                    if (((liVar4.Y1[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (dl0Var5 = (dl0) rb1Var.K(1)) != null && (top2 = (dl0Var5.f5774a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        rb1Var.v0(0, top2, null);
                    }
                    int i16 = pnVar.T0;
                    if (i16 >= 0) {
                        pn.J(pnVar, i16);
                        pnVar.T0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 29:
                pa0 pa0Var = (pa0) this.f5281b;
                boolean z11 = false;
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                pa0Var.U2 = z4;
                if (i10 == 1) {
                    z11 = true;
                }
                pa0Var.V2 = z11;
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        float f10;
        int i12;
        float f11;
        boolean z4;
        boolean z10;
        int dp;
        float f12;
        float y10;
        int measuredHeight;
        tf.e0 e0Var;
        l40 l40Var;
        f2.l1 T;
        int N0;
        int i13;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.f5280a) {
            case 0:
                g1 g1Var = (g1) this.f5281b;
                if (recyclerView.getScrollState() == 1) {
                    g1Var.v1(null, true);
                }
                g1Var.invalidate();
                return;
            case 1:
            case 22:
            default:
                return;
            case 2:
                ((gh.f) this.f5281b).R();
                return;
            case 3:
                f2.i0 i0Var = (f2.i0) recyclerView.getLayoutManager();
                jh.v vVar = (jh.v) this.f5281b;
                jh.i iVar = vVar.C;
                if (vVar.f9479x && !vVar.f9478w && i0Var != null) {
                    if (vVar.f9463f.h() - i0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        AndroidUtilities.runOnUIThread(iVar);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                q5 q5Var = (q5) this.f5281b;
                int i14 = 0;
                while (true) {
                    if (i14 < q5Var.f10879n.getChildCount()) {
                        if (q5Var.f10879n.getChildAt(i14) instanceof u00) {
                            q5Var.d.g(false);
                        } else {
                            i14++;
                        }
                    }
                }
                ViewPropertyAnimator animate = q5Var.h.animate();
                if (q5Var.H && q5Var.f10879n.canScrollVertically(-1)) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                org.telegram.ui.b.p(animate.alpha(f10), mr.h, 320L);
                return;
            case 5:
                ((p5) this.f5281b).Z();
                return;
            case 6:
                lh.q qVar = (lh.q) this.f5281b;
                if (qVar.f12929a == 1) {
                    if (qVar.e.canScrollVertically(1)) {
                        for (int i15 = 0; i15 < qVar.e.getChildCount(); i15++) {
                            if (!(qVar.e.getChildAt(i15) instanceof u00)) {
                            }
                        }
                        return;
                    }
                    lh.q.e0(qVar);
                    return;
                }
                return;
            case 7:
                lh.j1 j1Var = (lh.j1) this.f5281b;
                ng.e eVar = j1Var.f12634p0;
                View view = j1Var.f12632n0;
                FrameLayout frameLayout = j1Var.f12628i0;
                rl0 rl0Var = j1Var.d;
                int childCount = rl0Var.getChildCount() - 1;
                while (true) {
                    i12 = 0;
                    if (childCount >= 0) {
                        View childAt = rl0Var.getChildAt(childCount);
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            if (R == 2) {
                                y10 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            } else if (R == 1) {
                                f11 = childAt.getY();
                            } else if (R == 0) {
                                y10 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            }
                        }
                        childCount--;
                    } else {
                        f11 = 0.0f;
                        z4 = false;
                    }
                }
                f11 = y10 - measuredHeight;
                z4 = true;
                float height = frameLayout.getHeight() + f11;
                if (z4 && height >= 0.0f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (j1Var.f12639u0 != z10) {
                    j1Var.f12639u0 = z10;
                    if (z10) {
                        view.setVisibility(0);
                    }
                    ViewPropertyAnimator animate2 = view.animate();
                    if (z10) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    animate2.alpha(f12).setDuration(200L).withEndAction(new jh.f(2, j1Var, z10)).start();
                }
                if (f11 <= 0.0f) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.0f);
                }
                j1Var.H = dp;
                if (!z4) {
                    i12 = 8;
                }
                frameLayout.setVisibility(i12);
                frameLayout.setTranslationY(f11);
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 31 && eVar != null) {
                    eVar.f(i10, i11);
                    if (i16 >= 31 && eVar != null) {
                        j1Var.Q(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((g5) this.f5281b).V.e();
                return;
            case 9:
                ga gaVar = (ga) this.f5281b;
                g61 g61Var = gaVar.f12496a;
                if (g61Var.canScrollVertically(1)) {
                    for (int i17 = 0; i17 < g61Var.getChildCount(); i17++) {
                        if (!(g61Var.getChildAt(i17) instanceof u00)) {
                        }
                    }
                    return;
                }
                gaVar.h.run();
                return;
            case 10:
                ((mg.v) this.f5281b).c(true);
                return;
            case 11:
                ix ixVar = (ix) this.f5281b;
                ixVar.invalidate();
                ixVar.c();
                f3 f3Var = ixVar.G;
                if (f3Var != null) {
                    f3Var.e(true);
                    return;
                }
                return;
            case 12:
                d5 d5Var = (d5) this.f5281b;
                d5Var.c();
                d5Var.invalidate();
                return;
            case 13:
                ((org.telegram.messenger.voip.h) this.f5281b).run();
                return;
            case 14:
                ((org.telegram.ui.Components.f0) this.f5281b).r0();
                return;
            case 15:
                c8 c8Var = (c8) this.f5281b;
                f2.i0 i0Var2 = c8Var.f23860r;
                c8.P(c8Var);
                c8Var.E0();
                if (!c8Var.f23847f) {
                    int L0 = i0Var2.L0();
                    int i18 = 0;
                    if (c8Var.f23863s0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    if (L0 != -1) {
                        i18 = Math.abs(i0Var2.N0() - L0) + 1;
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
            case 16:
                ((qv0) this.f5281b).invalidate();
                return;
            case 17:
                wi wiVar = (wi) this.f5281b;
                wiVar.f24282b.X1(wiVar, i11);
                return;
            case 18:
                zi ziVar = (zi) this.f5281b;
                if (ziVar.f31386n.getChildCount() > 0) {
                    ziVar.f24282b.X1(ziVar, i11);
                    return;
                }
                return;
            case 19:
                qj qjVar = (qj) this.f5281b;
                qjVar.f24282b.X1(qjVar, i11);
                qjVar.O();
                return;
            case 20:
                hk hkVar = (hk) this.f5281b;
                ej ejVar = hkVar.B;
                hkVar.f24282b.X1(hkVar, i11);
                hkVar.U();
                f2.o0 adapter = hkVar.f25436r.getAdapter();
                gk gkVar = hkVar.f25440y;
                if (adapter == gkVar) {
                    int L02 = ejVar.L0();
                    int N02 = ejVar.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h9 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h9 - 10) {
                        gk gkVar2 = gkVar.U.f25440y;
                        if (!gkVar2.P && !gkVar2.S && (e0Var = gkVar.f25191y) != null) {
                            gkVar.Z(gkVar.f25190x, gkVar.B, gkVar.C, e0Var, gkVar.G, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ik ikVar = (ik) this.f5281b;
                ikVar.f24282b.X1(ikVar, i11);
                ikVar.v.setTranslationY(Math.max(0, ikVar.getCurrentItemTop()));
                return;
            case 23:
                pn pnVar = (pn) this.f5281b;
                ej ejVar2 = pnVar.f27965w;
                pnVar.f24282b.X1(pnVar, i11);
                fn fnVar = pnVar.f27967x;
                if (fnVar != null && fnVar.f28324s) {
                    oy0 delegate = fnVar.getDelegate();
                    if (delegate instanceof b6) {
                        rb1 rb1Var = pnVar.f27960s;
                        View F = rb1Var.F((b6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = rb1Var.T(F);
                        }
                        if (T != null) {
                            View view2 = T.f5774a;
                            int b10 = T.b();
                            if (fnVar.getDirection() == 0) {
                                fnVar.setTranslationY((view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight());
                            } else {
                                fnVar.setTranslationY(view2.getY());
                            }
                            if (b10 < ejVar2.L0() || b10 > ejVar2.N0()) {
                                fnVar.f();
                            }
                        } else {
                            fnVar.f();
                        }
                    } else {
                        fnVar.f();
                    }
                }
                if (i11 != 0 && (l40Var = pnVar.f27969y) != null) {
                    l40Var.b(true);
                    return;
                }
                return;
            case 24:
                qn qnVar = (qn) this.f5281b;
                qnVar.f24282b.X1(qnVar, i11);
                return;
            case 25:
                jp jpVar = (jp) this.f5281b;
                if (jpVar.f26018x.M0() + 10 >= jpVar.h.h()) {
                    jpVar.w();
                    return;
                }
                return;
            case 26:
                lv lvVar = (lv) this.f5281b;
                bv bvVar = lvVar.f26880f;
                if (bvVar != null && lvVar.h.H1 && bvVar.f23755w) {
                    bvVar.f23755w = false;
                    bvVar.invalidate();
                    return;
                }
                return;
            case 27:
                k00 k00Var = (k00) this.f5281b;
                k00Var.C.invalidate();
                k00Var.invalidate();
                return;
            case 28:
                o00.F((o00) this.f5281b);
                return;
            case 29:
                pa0 pa0Var = (pa0) this.f5281b;
                f2.v0 layoutManager = pa0Var.getLayoutManager();
                qa0 qa0Var = pa0Var.Y2;
                ja0 ja0Var = qa0Var.d;
                if (layoutManager == ja0Var) {
                    N0 = ja0Var.N0();
                } else {
                    N0 = qa0Var.f28128c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    tf.u0 u0Var = qa0Var.f28129f;
                    if (N0 > u0Var.I0 - 5 && u0Var.f44919r0 == 0 && (str = u0Var.f44916p0) != null && str.length() != 0 && (user = u0Var.f44922t0) != null && (str2 = u0Var.f44915o0) != null) {
                        u0Var.T(true, user, str2, u0Var.f44916p0);
                    }
                }
                pa0Var.canScrollVertically(1);
                qa0Var.n(!pa0Var.canScrollVertically(-1));
                qa0Var.b();
                return;
        }
    }
}
