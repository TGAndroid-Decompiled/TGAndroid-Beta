package fg;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import lh.q5;
import lh.r5;
import mh.g5;
import mh.ga;
import oh.e5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.xj;
import org.telegram.ui.hx;
import org.telegram.ui.qb1;
import qh.e3;
public final class e2 extends f2.a1 {
    public final int f6308a;
    public final Object f6309b;

    public e2(Object obj, int i10) {
        this.f6308a = i10;
        this.f6309b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        el0 el0Var;
        int i11;
        el0 el0Var2;
        el0 el0Var3;
        int top;
        int i12;
        el0 el0Var4;
        el0 el0Var5;
        int top2;
        boolean z4;
        switch (this.f6308a) {
            case 0:
                f1 f1Var = (f1) this.f6309b;
                if (i10 == 1) {
                    f1Var.f6339a3 = true;
                }
                if (i10 == 0) {
                    h2 h2Var = null;
                    for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
                        h2 h2Var2 = (h2) f1Var.getChildAt(i13);
                        if (h2Var == null || h2Var2.f6327a > h2Var.f6327a) {
                            h2Var = h2Var2;
                        }
                    }
                    if (h2Var != null) {
                        f1Var.v1(h2Var, true);
                        f1Var.f6339a3 = false;
                        f1Var.v0(0, h2Var.getTop() - ((f1Var.getMeasuredHeight() - h2Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    f1Var.w1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(f1Var.f6340b3);
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hg.f2) this.f6309b).V.getEditText());
                    return;
                }
                return;
            case 12:
                e5 e5Var = (e5) this.f6309b;
                if (i10 == 0) {
                    e5Var.S = true;
                    e5Var.invalidate();
                }
                if (i10 == 1) {
                    e5Var.S = false;
                    b4.e0 e0Var = e5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) e0Var.f1475c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) e0Var.f1475c).cancel();
                        e0Var.f1475c = null;
                    }
                    AndroidUtilities.hideKeyboard(e5Var);
                    return;
                }
                return;
            case 15:
                c8 c8Var = (c8) this.f6309b;
                o7 o7Var = c8Var.f25817n;
                if (i10 == 0) {
                    if (c8.j0(c8Var) + ((c8Var.f25832x0 - c8.i0(c8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && o7Var.canScrollVertically(1) && (el0Var = (el0) o7Var.K(c8Var.f25825s0 ? 1 : 0)) != null) {
                        View view = el0Var.f5875a;
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
                bj bjVar = (bj) this.f6309b;
                mh.d1 d1Var = bjVar.f25612n;
                mi miVar = bjVar.f26590b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = miVar.X0;
                    if (w0Var != null) {
                        i11 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i14 = dp + i11;
                    int backgroundPaddingTop = miVar.getBackgroundPaddingTop();
                    if (((miVar.Y1[0] - backgroundPaddingTop) - i14) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var2 = (el0) d1Var.K(0)) != null) {
                        View view2 = el0Var2.f5875a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            d1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                jk jkVar = (jk) this.f6309b;
                xj xjVar = jkVar.f28132r;
                mi miVar2 = jkVar.f26590b;
                boolean z10 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = miVar2.getBackgroundPaddingTop();
                    if (((miVar2.Y1[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var3 = (el0) xjVar.K(0)) != null && (top = (el0Var3.f5875a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        xjVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && jkVar.V && xjVar.getAdapter() == jkVar.f28136y) {
                    AndroidUtilities.hideKeyboard(miVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z10 = true;
                }
                jkVar.R = z10;
                return;
            case 21:
                kk kkVar = (kk) this.f6309b;
                sl0 sl0Var = kkVar.f28431r;
                mi miVar3 = kkVar.f26590b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var2 = miVar3.X0;
                    if (w0Var2 != null) {
                        i12 = AndroidUtilities.dp(w0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i15 = dp3 + i12;
                    int backgroundPaddingTop3 = miVar3.getBackgroundPaddingTop();
                    if (((miVar3.Y1[0] - backgroundPaddingTop3) - i15) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var4 = (el0) sl0Var.K(0)) != null) {
                        View view3 = el0Var4.f5875a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            sl0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    cl clVar = (cl) this.f6309b;
                    if (clVar.f25981i0 && clVar.f25982j0) {
                        AndroidUtilities.hideKeyboard(clVar.f26590b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 23:
                rn rnVar = (rn) this.f6309b;
                qb1 qb1Var = rnVar.f30842s;
                mi miVar4 = rnVar.f26590b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = miVar4.getBackgroundPaddingTop();
                    if (((miVar4.Y1[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var5 = (el0) qb1Var.K(1)) != null && (top2 = (el0Var5.f5875a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        qb1Var.v0(0, top2, null);
                    }
                    int i16 = rnVar.T0;
                    if (i16 >= 0) {
                        rn.J(rnVar, i16);
                        rnVar.T0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 29:
                qa0 qa0Var = (qa0) this.f6309b;
                boolean z11 = false;
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                qa0Var.U2 = z4;
                if (i10 == 1) {
                    z11 = true;
                }
                qa0Var.V2 = z11;
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
        uf.e0 e0Var;
        m40 m40Var;
        f2.m1 T;
        int N0;
        int i13;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.f6308a) {
            case 0:
                f1 f1Var = (f1) this.f6309b;
                if (recyclerView.getScrollState() == 1) {
                    f1Var.v1(null, true);
                }
                f1Var.invalidate();
                return;
            case 1:
            case 22:
            default:
                return;
            case 2:
                ((hh.f) this.f6309b).R();
                return;
            case 3:
                f2.j0 j0Var = (f2.j0) recyclerView.getLayoutManager();
                kh.v vVar = (kh.v) this.f6309b;
                kh.i iVar = vVar.C;
                if (vVar.f11324x && !vVar.f11323w && j0Var != null) {
                    if (vVar.f11308f.h() - j0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        AndroidUtilities.runOnUIThread(iVar);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                r5 r5Var = (r5) this.f6309b;
                int i14 = 0;
                while (true) {
                    if (i14 < r5Var.f12932n.getChildCount()) {
                        if (r5Var.f12932n.getChildAt(i14) instanceof u00) {
                            r5Var.d.g(false);
                        } else {
                            i14++;
                        }
                    }
                }
                ViewPropertyAnimator animate = r5Var.h.animate();
                if (r5Var.H && r5Var.f12932n.canScrollVertically(-1)) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                org.telegram.ui.b.p(animate.alpha(f10), pr.h, 320L);
                return;
            case 5:
                ((q5) this.f6309b).Z();
                return;
            case 6:
                mh.p pVar = (mh.p) this.f6309b;
                if (pVar.f14554a == 1) {
                    if (pVar.f14561e.canScrollVertically(1)) {
                        for (int i15 = 0; i15 < pVar.f14561e.getChildCount(); i15++) {
                            if (!(pVar.f14561e.getChildAt(i15) instanceof u00)) {
                            }
                        }
                        return;
                    }
                    mh.p.e0(pVar);
                    return;
                }
                return;
            case 7:
                mh.i1 i1Var = (mh.i1) this.f6309b;
                og.e eVar = i1Var.f14216p0;
                View view = i1Var.f14214n0;
                FrameLayout frameLayout = i1Var.f14210i0;
                sl0 sl0Var = i1Var.d;
                int childCount = sl0Var.getChildCount() - 1;
                while (true) {
                    i12 = 0;
                    if (childCount >= 0) {
                        View childAt = sl0Var.getChildAt(childCount);
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
                if (i1Var.f14221u0 != z10) {
                    i1Var.f14221u0 = z10;
                    if (z10) {
                        view.setVisibility(0);
                    }
                    ViewPropertyAnimator animate2 = view.animate();
                    if (z10) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    animate2.alpha(f12).setDuration(200L).withEndAction(new kh.f(2, i1Var, z10)).start();
                }
                if (f11 <= 0.0f) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.0f);
                }
                i1Var.H = dp;
                if (!z4) {
                    i12 = 8;
                }
                frameLayout.setVisibility(i12);
                frameLayout.setTranslationY(f11);
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 31 && eVar != null) {
                    eVar.f(i10, i11);
                    if (i16 >= 31 && eVar != null) {
                        i1Var.Q(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((g5) this.f6309b).V.e();
                return;
            case 9:
                ga gaVar = (ga) this.f6309b;
                h61 h61Var = gaVar.f14131a;
                if (h61Var.canScrollVertically(1)) {
                    for (int i17 = 0; i17 < h61Var.getChildCount(); i17++) {
                        if (!(h61Var.getChildAt(i17) instanceof u00)) {
                        }
                    }
                    return;
                }
                gaVar.h.run();
                return;
            case 10:
                ((ng.v) this.f6309b).c(true);
                return;
            case 11:
                hx hxVar = (hx) this.f6309b;
                hxVar.invalidate();
                hxVar.c();
                e3 e3Var = hxVar.G;
                if (e3Var != null) {
                    e3Var.e(true);
                    return;
                }
                return;
            case 12:
                e5 e5Var = (e5) this.f6309b;
                e5Var.c();
                e5Var.invalidate();
                return;
            case 13:
                ((org.telegram.messenger.voip.h) this.f6309b).run();
                return;
            case 14:
                ((org.telegram.ui.Components.f0) this.f6309b).r0();
                return;
            case 15:
                c8 c8Var = (c8) this.f6309b;
                f2.j0 j0Var2 = c8Var.f25822r;
                c8.P(c8Var);
                c8Var.E0();
                if (!c8Var.f25809f) {
                    int L0 = j0Var2.L0();
                    int i18 = 0;
                    if (c8Var.f25825s0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    if (L0 != -1) {
                        i18 = Math.abs(j0Var2.N0() - L0) + 1;
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
                ((pv0) this.f6309b).invalidate();
                return;
            case 17:
                xi xiVar = (xi) this.f6309b;
                xiVar.f26590b.X1(xiVar, i11);
                return;
            case 18:
                bj bjVar = (bj) this.f6309b;
                if (bjVar.f25612n.getChildCount() > 0) {
                    bjVar.f26590b.X1(bjVar, i11);
                    return;
                }
                return;
            case 19:
                sj sjVar = (sj) this.f6309b;
                sjVar.f26590b.X1(sjVar, i11);
                sjVar.O();
                return;
            case 20:
                jk jkVar = (jk) this.f6309b;
                gj gjVar = jkVar.B;
                jkVar.f26590b.X1(jkVar, i11);
                jkVar.U();
                f2.p0 adapter = jkVar.f28132r.getAdapter();
                ik ikVar = jkVar.f28136y;
                if (adapter == ikVar) {
                    int L02 = gjVar.L0();
                    int N02 = gjVar.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h9 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h9 - 10) {
                        ik ikVar2 = ikVar.U.f28136y;
                        if (!ikVar2.P && !ikVar2.S && (e0Var = ikVar.f27848y) != null) {
                            ikVar.Z(ikVar.f27847x, ikVar.B, ikVar.C, e0Var, ikVar.G, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                kk kkVar = (kk) this.f6309b;
                kkVar.f26590b.X1(kkVar, i11);
                kkVar.v.setTranslationY(Math.max(0, kkVar.getCurrentItemTop()));
                return;
            case 23:
                rn rnVar = (rn) this.f6309b;
                gj gjVar2 = rnVar.f30847w;
                rnVar.f26590b.X1(rnVar, i11);
                hn hnVar = rnVar.f30849x;
                if (hnVar != null && hnVar.f30566s) {
                    oy0 delegate = hnVar.getDelegate();
                    if (delegate instanceof c6) {
                        qb1 qb1Var = rnVar.f30842s;
                        View F = qb1Var.F((c6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = qb1Var.T(F);
                        }
                        if (T != null) {
                            View view2 = T.f5875a;
                            int b10 = T.b();
                            if (hnVar.getDirection() == 0) {
                                hnVar.setTranslationY((view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight());
                            } else {
                                hnVar.setTranslationY(view2.getY());
                            }
                            if (b10 < gjVar2.L0() || b10 > gjVar2.N0()) {
                                hnVar.f();
                            }
                        } else {
                            hnVar.f();
                        }
                    } else {
                        hnVar.f();
                    }
                }
                if (i11 != 0 && (m40Var = rnVar.f30851y) != null) {
                    m40Var.b(true);
                    return;
                }
                return;
            case 24:
                sn snVar = (sn) this.f6309b;
                snVar.f26590b.X1(snVar, i11);
                return;
            case 25:
                mp mpVar = (mp) this.f6309b;
                if (mpVar.f29222x.M0() + 10 >= mpVar.h.h()) {
                    mpVar.w();
                    return;
                }
                return;
            case 26:
                ov ovVar = (ov) this.f6309b;
                ev evVar = ovVar.f29901f;
                if (evVar != null && ovVar.h.H1 && evVar.f26677w) {
                    evVar.f26677w = false;
                    evVar.invalidate();
                    return;
                }
                return;
            case 27:
                l00 l00Var = (l00) this.f6309b;
                l00Var.C.invalidate();
                l00Var.invalidate();
                return;
            case 28:
                o00.F((o00) this.f6309b);
                return;
            case 29:
                qa0 qa0Var = (qa0) this.f6309b;
                f2.w0 layoutManager = qa0Var.getLayoutManager();
                ra0 ra0Var = qa0Var.Y2;
                ka0 ka0Var = ra0Var.d;
                if (layoutManager == ka0Var) {
                    N0 = ka0Var.N0();
                } else {
                    N0 = ra0Var.f30708c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    uf.u0 u0Var = ra0Var.f30710f;
                    if (N0 > u0Var.I0 - 5 && u0Var.f48750r0 == 0 && (str = u0Var.f48747p0) != null && str.length() != 0 && (user = u0Var.f48753t0) != null && (str2 = u0Var.f48746o0) != null) {
                        u0Var.T(true, user, str2, u0Var.f48747p0);
                    }
                }
                qa0Var.canScrollVertically(1);
                ra0Var.n(!qa0Var.canScrollVertically(-1));
                ra0Var.b();
                return;
        }
    }
}
