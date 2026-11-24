package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ArticleViewer$WindowView;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class y extends i49 {
    public final byte a;
    public final Object b;

    public y(nf1 nf1Var) {
        this.a = (byte) 13;
        this.b = nf1Var;
        Typeface typeface = gl.a;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        y29 y29Var;
        int i2;
        y29 y29Var2;
        y29 y29Var3;
        int top;
        int i3;
        y29 y29Var4;
        y29 y29Var5;
        int top2;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 4:
                if (i == 0) {
                    ((m) obj).M.Q0.U();
                    return;
                }
                return;
            case 5:
                i20 i20Var = (i20) obj;
                p10 p10Var = i20Var.r1;
                if (i == 0) {
                    int L = gl.L(13.0f);
                    int i4 = i20Var.t2;
                    int i5 = i20Var.t0;
                    if (((i4 - i5) - L) + i5 < a.getCurrentActionBarHeight() && p10Var.canScrollVertically(1) && (y29Var = (y29) p10Var.K(i20Var.o2 ? 1 : 0)) != null) {
                        View view = y29Var.a;
                        if (view.getTop() > gl.L(7.0f)) {
                            p10Var.x0(0, view.getTop() - gl.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 1) {
                    gl.t1(i20Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 13:
                nf1 nf1Var = (nf1) obj;
                if (i == 1) {
                    nf1Var.T = true;
                    nf1Var.W = true;
                    return;
                } else if (i == 0) {
                    nf1Var.T = false;
                    nf1Var.W = false;
                    nf1Var.P0(true);
                    return;
                } else {
                    return;
                }
            case 15:
                if (i == 1) {
                    gl.t1(((mu1) obj).m1);
                    return;
                }
                return;
            case 17:
                v12 v12Var = (v12) obj;
                fu fuVar = v12Var.n;
                x02 x02Var = v12Var.b;
                if (i == 0) {
                    int L2 = gl.L(13.0f);
                    r7 r7Var = x02Var.X2;
                    if (r7Var != null) {
                        i2 = gl.L(r7Var.getAlpha() * 26.0f);
                    } else {
                        i2 = 0;
                    }
                    int i6 = L2 + i2;
                    int i7 = x02Var.t0;
                    if (((x02Var.Y3[0] - i7) - i6) + i7 < a.getCurrentActionBarHeight() && (y29Var2 = (y29) fuVar.K(0)) != null) {
                        View view2 = y29Var2.a;
                        if (view2.getTop() > gl.L(7.0f)) {
                            fuVar.x0(0, view2.getTop() - gl.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 19:
                d32 d32Var = (d32) obj;
                x02 x02Var2 = d32Var.b;
                r22 r22Var = d32Var.r;
                if (i == 0) {
                    int L3 = gl.L(13.0f);
                    int i8 = x02Var2.t0;
                    if (((x02Var2.Y3[0] - i8) - L3) + i8 < a.getCurrentActionBarHeight() && (y29Var3 = (y29) r22Var.K(0)) != null && (top = (y29Var3.a.getTop() - gl.m) - gl.L(56.0f)) > 0) {
                        r22Var.x0(0, top, null);
                    }
                }
                if (i == 1 && d32Var.c0 && r22Var.getAdapter() == d32Var.E) {
                    gl.t1(x02Var2.getCurrentFocus());
                }
                if (i != 0) {
                    z = true;
                }
                d32Var.V = z;
                return;
            case 20:
                e32 e32Var = (e32) obj;
                o39 o39Var = e32Var.r;
                x02 x02Var3 = e32Var.b;
                if (i == 0) {
                    int L4 = gl.L(13.0f);
                    r7 r7Var2 = x02Var3.X2;
                    if (r7Var2 != null) {
                        i3 = gl.L(r7Var2.getAlpha() * 26.0f);
                    } else {
                        i3 = 0;
                    }
                    int i9 = L4 + i3;
                    int i10 = x02Var3.t0;
                    if (((x02Var3.Y3[0] - i10) - i9) + i10 < a.getCurrentActionBarHeight() && (y29Var4 = (y29) o39Var.K(0)) != null) {
                        View view3 = y29Var4.a;
                        if (view3.getTop() > gl.L(7.0f)) {
                            o39Var.x0(0, view3.getTop() - gl.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                k62 k62Var = (k62) obj;
                rkb rkbVar = k62Var.s;
                if (i == 0) {
                    int L5 = gl.L(13.0f);
                    x02 x02Var4 = k62Var.b;
                    int i11 = x02Var4.t0;
                    if (((x02Var4.Y3[0] - i11) - L5) + i11 < a.getCurrentActionBarHeight() && (y29Var5 = (y29) rkbVar.K(1)) != null && (top2 = (y29Var5.a.getTop() - gl.m) - gl.L(65.0f)) > 0) {
                        rkbVar.x0(0, top2, null);
                    }
                    int i12 = k62Var.X0;
                    if (i12 >= 0) {
                        k62Var.k0(i12);
                        k62Var.X0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 24:
                if (i == 1) {
                    gl.t1(((zc2) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 27:
                if (i == 1) {
                    gl.t1(((kf2) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        float f;
        rf4 rf4Var;
        ke5 ke5Var;
        s49 T;
        byte b = this.a;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((a1) obj).u1();
                return;
            case 1:
                ((ee2) obj).run();
                return;
            case 2:
                hs hsVar = (hs) obj;
                if (!hsVar.J && !hsVar.r && hsVar.d.M0() > hsVar.F - 2) {
                    hsVar.a0();
                    return;
                }
                return;
            case 3:
                o oVar = (o) obj;
                if (oVar.j0.x.J1) {
                    gl.t1(oVar.i0.c0);
                    return;
                }
                return;
            case 4:
                o oVar2 = ((m) obj).M;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    oVar2.Q0.F();
                    sw swVar = oVar2.L;
                    if (swVar != null) {
                        swVar.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = oVar2.g0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    oVar2.d0();
                    sw swVar2 = oVar2.L;
                    if (swVar2 == null || swVar2.G) {
                        oVar2.V(oVar2.K0 - i2);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                i20 i20Var = (i20) obj;
                t26 t26Var = i20Var.s1;
                i20Var.U0();
                i20Var.T0();
                if (!i20Var.p1) {
                    int K0 = t26Var.K0();
                    if (i20Var.o2) {
                        K0 = Math.max(0, K0 - 1);
                    }
                    if (K0 != -1) {
                        i3 = Math.abs(t26Var.M0() - K0) + 1;
                    }
                    int b2 = recyclerView.getAdapter().b();
                    MediaController.w();
                    if (gba.L0) {
                        if (K0 < 10) {
                            MediaController.w().O();
                            return;
                        }
                        return;
                    } else if (K0 + i3 > b2 - 10) {
                        MediaController.w().O();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 6:
                dm0 dm0Var = (dm0) obj;
                if (!dm0Var.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(dm0Var.w)) {
                        dm0Var.e.d();
                    } else {
                        cb cbVar = dm0Var.f;
                        if (cbVar != null) {
                            cbVar.d();
                        }
                    }
                }
                if (dm0Var.a.J1) {
                    gl.t1(dm0Var.fragmentView);
                    return;
                }
                return;
            case 7:
                cx1 cx1Var = (cx1) obj;
                View m = cx1Var.c.getLayoutManager().m(0);
                float f2 = 0.0f;
                if (m != null) {
                    f = m.getY();
                } else {
                    f = 0.0f;
                }
                if (f >= 0.0f) {
                    f2 = f;
                }
                cx1Var.h = f2;
                cx1Var.b();
                return;
            case 8:
                rs0 rs0Var = (rs0) obj;
                oz ozVar = rs0Var.n;
                if (!recyclerView.canScrollVertically(1)) {
                    rs0Var.removeCallbacks(ozVar);
                    rs0Var.post(ozVar);
                    return;
                }
                return;
            case 9:
                ((cja) obj).invalidate();
                return;
            case 10:
                ((y31) obj).l0();
                return;
            case 11:
                r61 r61Var = (r61) obj;
                if (r61Var.b.canScrollVertically(-1) || r61.Z(r61Var).x()) {
                    z = true;
                }
                fm0 fm0Var = r61Var.T;
                if (fm0Var != null) {
                    fm0Var.a(z, true);
                    return;
                }
                return;
            case 12:
                ((b81) obj).s0();
                return;
            case 13:
                nf1 nf1Var = (nf1) obj;
                nf1Var.w.invalidate();
                if (i2 != 0 && nf1Var.T && !nf1Var.R && nf1Var.N.getTag() == null) {
                    AnimatorSet animatorSet = nf1Var.S;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    nf1Var.N.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    nf1Var.S = animatorSet2;
                    animatorSet2.setDuration(150L);
                    nf1Var.S.playTogether(ObjectAnimator.ofFloat(nf1Var.N, "alpha", 1.0f));
                    nf1Var.S.addListener(new bb1(this, (byte) 1));
                    nf1Var.S.start();
                }
                nf1Var.K0(true);
                nf1Var.g1();
                return;
            case 14:
                eg1 eg1Var = (eg1) obj;
                long j = eg1Var.S;
                while (true) {
                    if (i4 < eg1Var.c.getChildCount()) {
                        if (!(eg1Var.c.getChildAt(i4) instanceof pi4)) {
                            i4++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                ct0.g(eg1.z0(eg1Var)).d(j).a();
                ct0.g(eg1.A0(eg1Var)).e(j).a();
                return;
            case 15:
            case 24:
            default:
                return;
            case 16:
                h12 h12Var = (h12) obj;
                h12Var.b.H1(h12Var, i2);
                return;
            case 17:
                v12 v12Var = (v12) obj;
                if (v12Var.n.getChildCount() > 0) {
                    v12Var.b.H1(v12Var, i2);
                    return;
                }
                return;
            case 18:
                k22 k22Var = (k22) obj;
                k22Var.b.H1(k22Var, i2);
                k22Var.T();
                return;
            case 19:
                d32 d32Var = (d32) obj;
                z12 z12Var = d32Var.F;
                d32Var.b.H1(d32Var, i2);
                d32Var.Z();
                w39 adapter = d32Var.r.getAdapter();
                c32 c32Var = d32Var.E;
                if (adapter == c32Var) {
                    int K02 = z12Var.K0();
                    int M0 = z12Var.M0();
                    int abs = Math.abs(M0 - K02) + 1;
                    int b3 = recyclerView.getAdapter().b();
                    if (abs > 0 && M0 >= b3 - 10) {
                        c32 c32Var2 = c32Var.Y.E;
                        if (!c32Var2.T && !c32Var2.W && (rf4Var = c32Var.E) != null) {
                            c32Var.Z(c32Var.y, c32Var.F, c32Var.G, rf4Var, c32Var.K, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                e32 e32Var = (e32) obj;
                e32Var.b.H1(e32Var, i2);
                e32Var.w.setTranslationY(Math.max(0, e32Var.getCurrentItemTop()));
                return;
            case 21:
                k62 k62Var = (k62) obj;
                z12 z12Var2 = k62Var.x;
                k62Var.b.H1(k62Var, i2);
                c62 c62Var = k62Var.y;
                if (c62Var != null && c62Var.s) {
                    bbb delegate = c62Var.getDelegate();
                    if (delegate instanceof le8) {
                        rkb rkbVar = k62Var.s;
                        View F = rkbVar.F((le8) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = rkbVar.T(F);
                        }
                        if (T != null) {
                            View view = T.a;
                            int b4 = T.b();
                            if (c62Var.getDirection() == 0) {
                                c62Var.setTranslationY((view.getY() - gl.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                c62Var.setTranslationY(view.getY());
                            }
                            if (b4 < z12Var2.K0() || b4 > z12Var2.M0()) {
                                c62Var.e();
                            }
                        } else {
                            c62Var.e();
                        }
                    } else {
                        c62Var.e();
                    }
                }
                if (i2 != 0 && (ke5Var = k62Var.E) != null) {
                    ke5Var.a();
                    return;
                }
                return;
            case 22:
                p62 p62Var = (p62) obj;
                p62Var.b.H1(p62Var, i2);
                p62Var.R();
                return;
            case 23:
                f72 f72Var = (f72) obj;
                f72Var.b.H1(f72Var, i2);
                return;
            case 25:
                ((fd2) obj).c(true);
                return;
            case 26:
                xd2 xd2Var = (xd2) obj;
                if (xd2Var.w1.L0() + 10 >= xd2Var.q1.b()) {
                    xd2Var.K0();
                    return;
                }
                return;
            case 27:
                return;
            case 28:
                pn2 pn2Var = (pn2) obj;
                pn2Var.w.b(pn2Var.d);
                return;
            case 29:
                eo2 eo2Var = (eo2) obj;
                if (eo2Var.A1.J1) {
                    gl.t1(eo2Var.y1.r);
                    return;
                }
                return;
        }
    }

    public y(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void c(RecyclerView recyclerView, int i, int i2) {
    }
}
