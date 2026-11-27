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
public final class y extends v79 {
    public final byte a;
    public final Object b;

    public y(wf1 wf1Var) {
        this.a = (byte) 13;
        this.b = wf1Var;
        Typeface typeface = hl.a;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        n69 n69Var;
        int i2;
        n69 n69Var2;
        n69 n69Var3;
        int top;
        int i3;
        n69 n69Var4;
        n69 n69Var5;
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
                j20 j20Var = (j20) obj;
                q10 q10Var = j20Var.r1;
                if (i == 0) {
                    int L = hl.L(13.0f);
                    int i4 = j20Var.t2;
                    int i5 = j20Var.t0;
                    if (((i4 - i5) - L) + i5 < a.getCurrentActionBarHeight() && q10Var.canScrollVertically(1) && (n69Var = (n69) q10Var.L(j20Var.o2 ? 1 : 0)) != null) {
                        View view = n69Var.a;
                        if (view.getTop() > hl.L(7.0f)) {
                            q10Var.y0(0, view.getTop() - hl.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 1) {
                    hl.t1(j20Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 13:
                wf1 wf1Var = (wf1) obj;
                if (i == 1) {
                    wf1Var.T = true;
                    wf1Var.W = true;
                    return;
                } else if (i == 0) {
                    wf1Var.T = false;
                    wf1Var.W = false;
                    wf1Var.Q0(true);
                    return;
                } else {
                    return;
                }
            case 15:
                if (i == 1) {
                    hl.t1(((zu1) obj).m1);
                    return;
                }
                return;
            case 17:
                m22 m22Var = (m22) obj;
                gu guVar = m22Var.n;
                n12 n12Var = m22Var.b;
                if (i == 0) {
                    int L2 = hl.L(13.0f);
                    s7 s7Var = n12Var.X2;
                    if (s7Var != null) {
                        i2 = hl.L(s7Var.getAlpha() * 26.0f);
                    } else {
                        i2 = 0;
                    }
                    int i6 = L2 + i2;
                    int i7 = n12Var.t0;
                    if (((n12Var.Y3[0] - i7) - i6) + i7 < a.getCurrentActionBarHeight() && (n69Var2 = (n69) guVar.L(0)) != null) {
                        View view2 = n69Var2.a;
                        if (view2.getTop() > hl.L(7.0f)) {
                            guVar.y0(0, view2.getTop() - hl.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 19:
                u32 u32Var = (u32) obj;
                n12 n12Var2 = u32Var.b;
                i32 i32Var = u32Var.r;
                if (i == 0) {
                    int L3 = hl.L(13.0f);
                    int i8 = n12Var2.t0;
                    if (((n12Var2.Y3[0] - i8) - L3) + i8 < a.getCurrentActionBarHeight() && (n69Var3 = (n69) i32Var.L(0)) != null && (top = (n69Var3.a.getTop() - hl.m) - hl.L(56.0f)) > 0) {
                        i32Var.y0(0, top, null);
                    }
                }
                if (i == 1 && u32Var.c0 && i32Var.getAdapter() == u32Var.E) {
                    hl.t1(n12Var2.getCurrentFocus());
                }
                if (i != 0) {
                    z = true;
                }
                u32Var.V = z;
                return;
            case 20:
                v32 v32Var = (v32) obj;
                d79 d79Var = v32Var.r;
                n12 n12Var3 = v32Var.b;
                if (i == 0) {
                    int L4 = hl.L(13.0f);
                    s7 s7Var2 = n12Var3.X2;
                    if (s7Var2 != null) {
                        i3 = hl.L(s7Var2.getAlpha() * 26.0f);
                    } else {
                        i3 = 0;
                    }
                    int i9 = L4 + i3;
                    int i10 = n12Var3.t0;
                    if (((n12Var3.Y3[0] - i10) - i9) + i10 < a.getCurrentActionBarHeight() && (n69Var4 = (n69) d79Var.L(0)) != null) {
                        View view3 = n69Var4.a;
                        if (view3.getTop() > hl.L(7.0f)) {
                            d79Var.y0(0, view3.getTop() - hl.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                a72 a72Var = (a72) obj;
                qob qobVar = a72Var.s;
                if (i == 0) {
                    int L5 = hl.L(13.0f);
                    n12 n12Var4 = a72Var.b;
                    int i11 = n12Var4.t0;
                    if (((n12Var4.Y3[0] - i11) - L5) + i11 < a.getCurrentActionBarHeight() && (n69Var5 = (n69) qobVar.L(1)) != null && (top2 = (n69Var5.a.getTop() - hl.m) - hl.L(65.0f)) > 0) {
                        qobVar.y0(0, top2, null);
                    }
                    int i12 = a72Var.X0;
                    if (i12 >= 0) {
                        a72Var.j0(i12);
                        a72Var.X0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 24:
                if (i == 1) {
                    hl.t1(((pd2) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 27:
                if (i == 1) {
                    hl.t1(((bg2) obj).getParentActivity().getCurrentFocus());
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
        ph4 ph4Var;
        lg5 lg5Var;
        f89 U;
        byte b = this.a;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((b1) obj).k1(true);
                return;
            case 1:
                ((ve2) obj).run();
                return;
            case 2:
                is isVar = (is) obj;
                if (!isVar.J && !isVar.r && isVar.d.M0() > isVar.F - 2) {
                    isVar.a0();
                    return;
                }
                return;
            case 3:
                o oVar = (o) obj;
                if (oVar.j0.x.J1) {
                    hl.t1(oVar.i0.c0);
                    return;
                }
                return;
            case 4:
                o oVar2 = ((m) obj).M;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    oVar2.Q0.F();
                    tw twVar = oVar2.L;
                    if (twVar != null) {
                        twVar.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = oVar2.g0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    oVar2.d0();
                    tw twVar2 = oVar2.L;
                    if (twVar2 == null || twVar2.G) {
                        oVar2.V(oVar2.K0 - i2);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                j20 j20Var = (j20) obj;
                x46 x46Var = j20Var.s1;
                j20Var.V0();
                j20Var.U0();
                if (!j20Var.p1) {
                    int K0 = x46Var.K0();
                    if (j20Var.o2) {
                        K0 = Math.max(0, K0 - 1);
                    }
                    if (K0 != -1) {
                        i3 = Math.abs(x46Var.M0() - K0) + 1;
                    }
                    int b2 = recyclerView.getAdapter().b();
                    MediaController.z();
                    if (xea.K0) {
                        if (K0 < 10) {
                            MediaController.z().S();
                            return;
                        }
                        return;
                    } else if (K0 + i3 > b2 - 10) {
                        MediaController.z().S();
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
                        db dbVar = dm0Var.f;
                        if (dbVar != null) {
                            dbVar.d();
                        }
                    }
                }
                if (dm0Var.a.J1) {
                    hl.t1(dm0Var.fragmentView);
                    return;
                }
                return;
            case 7:
                qx1 qx1Var = (qx1) obj;
                View m = qx1Var.c.getLayoutManager().m(0);
                float f2 = 0.0f;
                if (m != null) {
                    f = m.getY();
                } else {
                    f = 0.0f;
                }
                if (f >= 0.0f) {
                    f2 = f;
                }
                qx1Var.h = f2;
                qx1Var.b();
                return;
            case 8:
                zs0 zs0Var = (zs0) obj;
                pz pzVar = zs0Var.n;
                if (!recyclerView.canScrollVertically(1)) {
                    zs0Var.removeCallbacks(pzVar);
                    zs0Var.post(pzVar);
                    return;
                }
                return;
            case 9:
                ((wma) obj).invalidate();
                return;
            case 10:
                ((g41) obj).l0();
                return;
            case 11:
                z61 z61Var = (z61) obj;
                if (z61Var.b.canScrollVertically(-1) || z61.Z(z61Var).z()) {
                    z = true;
                }
                fm0 fm0Var = z61Var.T;
                if (fm0Var != null) {
                    fm0Var.a(z, true);
                    return;
                }
                return;
            case 12:
                ((j81) obj).s0();
                return;
            case 13:
                wf1 wf1Var = (wf1) obj;
                wf1Var.w.invalidate();
                if (i2 != 0 && wf1Var.T && !wf1Var.R && wf1Var.N.getTag() == null) {
                    AnimatorSet animatorSet = wf1Var.S;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    wf1Var.N.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    wf1Var.S = animatorSet2;
                    animatorSet2.setDuration(150L);
                    wf1Var.S.playTogether(ObjectAnimator.ofFloat(wf1Var.N, "alpha", 1.0f));
                    wf1Var.S.addListener(new jb1(this, (byte) 1));
                    wf1Var.S.start();
                }
                wf1Var.L0(true);
                wf1Var.h1();
                return;
            case 14:
                ng1 ng1Var = (ng1) obj;
                long j = ng1Var.S;
                while (true) {
                    if (i4 < ng1Var.c.getChildCount()) {
                        if (!(ng1Var.c.getChildAt(i4) instanceof tk4)) {
                            i4++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                kt0.g(ng1.A0(ng1Var)).d(j).a();
                kt0.g(ng1.B0(ng1Var)).e(j).a();
                return;
            case 15:
            case 24:
            default:
                return;
            case 16:
                x12 x12Var = (x12) obj;
                x12Var.b.I1(x12Var, i2);
                return;
            case 17:
                m22 m22Var = (m22) obj;
                if (m22Var.n.getChildCount() > 0) {
                    m22Var.b.I1(m22Var, i2);
                    return;
                }
                return;
            case 18:
                b32 b32Var = (b32) obj;
                b32Var.b.I1(b32Var, i2);
                b32Var.S();
                return;
            case 19:
                u32 u32Var = (u32) obj;
                q22 q22Var = u32Var.F;
                u32Var.b.I1(u32Var, i2);
                u32Var.Y();
                j79 adapter = u32Var.r.getAdapter();
                t32 t32Var = u32Var.E;
                if (adapter == t32Var) {
                    int K02 = q22Var.K0();
                    int M0 = q22Var.M0();
                    int abs = Math.abs(M0 - K02) + 1;
                    int b3 = recyclerView.getAdapter().b();
                    if (abs > 0 && M0 >= b3 - 10) {
                        t32 t32Var2 = t32Var.Y.E;
                        if (!t32Var2.T && !t32Var2.W && (ph4Var = t32Var.E) != null) {
                            t32Var.Z(t32Var.y, t32Var.F, t32Var.G, ph4Var, t32Var.K, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                v32 v32Var = (v32) obj;
                v32Var.b.I1(v32Var, i2);
                v32Var.w.setTranslationY(Math.max(0, v32Var.getCurrentItemTop()));
                return;
            case 21:
                a72 a72Var = (a72) obj;
                q22 q22Var2 = a72Var.x;
                a72Var.b.I1(a72Var, i2);
                s62 s62Var = a72Var.y;
                if (s62Var != null && s62Var.s) {
                    xeb delegate = s62Var.getDelegate();
                    if (delegate instanceof zh8) {
                        qob qobVar = a72Var.s;
                        View G = qobVar.G((zh8) delegate);
                        if (G == null) {
                            U = null;
                        } else {
                            U = qobVar.U(G);
                        }
                        if (U != null) {
                            View view = U.a;
                            int b4 = U.b();
                            if (s62Var.getDirection() == 0) {
                                s62Var.setTranslationY((view.getY() - hl.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                s62Var.setTranslationY(view.getY());
                            }
                            if (b4 < q22Var2.K0() || b4 > q22Var2.M0()) {
                                s62Var.e();
                            }
                        } else {
                            s62Var.e();
                        }
                    } else {
                        s62Var.e();
                    }
                }
                if (i2 != 0 && (lg5Var = a72Var.E) != null) {
                    lg5Var.a();
                    return;
                }
                return;
            case 22:
                f72 f72Var = (f72) obj;
                f72Var.b.I1(f72Var, i2);
                f72Var.Q();
                return;
            case 23:
                w72 w72Var = (w72) obj;
                w72Var.b.I1(w72Var, i2);
                return;
            case 25:
                ((wd2) obj).c(true);
                return;
            case 26:
                oe2 oe2Var = (oe2) obj;
                if (oe2Var.w1.L0() + 10 >= oe2Var.q1.b()) {
                    oe2Var.L0();
                    return;
                }
                return;
            case 27:
                return;
            case 28:
                io2 io2Var = (io2) obj;
                io2Var.w.b(io2Var.d);
                return;
            case 29:
                xo2 xo2Var = (xo2) obj;
                if (xo2Var.A1.J1) {
                    hl.t1(xo2Var.y1.r);
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
