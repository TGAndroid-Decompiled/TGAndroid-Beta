package defpackage;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LanguageSelectActivity;
public final class ip2 extends k69 {
    public final byte a;
    public final Object b;

    public ip2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        View view;
        View view2;
        View m;
        boolean z;
        byte b = this.a;
        boolean z2 = false;
        Object obj = this.b;
        switch (b) {
            case 1:
                np2 np2Var = (np2) obj;
                if (i == 0) {
                    np2Var.e = !np2Var.d.canScrollVertically(-1);
                    np2Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 11:
            case 12:
            case 13:
            case 21:
            case 24:
            case 26:
            case 27:
            default:
                return;
            case 3:
                if (i == 1) {
                    gm.t1(((az2) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                ex3 ex3Var = (ex3) obj;
                if (i == 0 && ex3Var.n >= 0.0f && !ex3Var.b.canScrollVertically(-1)) {
                    ex3Var.n = -1.0f;
                    return;
                }
                return;
            case 10:
                cz3 cz3Var = (cz3) obj;
                if (i == 1) {
                    z2 = true;
                }
                cz3Var.d0 = z2;
                if (i != 0) {
                    cz3Var.b0 = System.currentTimeMillis() - cz3.g0;
                }
                cz3Var.invalidate();
                return;
            case 14:
                if (i == 0) {
                    yw4 yw4Var = (yw4) obj;
                    if (yw4Var.m2) {
                        yw4Var.m2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((sy4) obj).g++;
                return;
            case 16:
                h15 h15Var = (h15) obj;
                if (i == 0) {
                    int L = gm.L(16.0f) + h15Var.p0().getBottom();
                    int i2 = (h15Var.w > 0.5f ? 1 : (h15Var.w == 0.5f ? 0 : -1));
                    r59 r59Var = h15Var.c;
                    if (i2 > 0) {
                        r59Var.x0(0, h15Var.r - L, null);
                        return;
                    }
                    if (r59Var.getLayoutManager() != null) {
                        view = h15Var.c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (h15Var.q0() + view.getTop() < 0.0f) {
                            h15Var.c.x0(0, Math.round(h15Var.q0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ac5 ac5Var = (ac5) obj;
                if (i == 0) {
                    float f = ac5Var.B0;
                    if (f >= 0.5f && f < 1.0f) {
                        int bottom = ac5.n1(ac5Var).getBottom();
                        f69 layoutManager = ac5Var.N.getLayoutManager();
                        if (layoutManager != null && (m = layoutManager.m(0)) != null) {
                            ac5Var.N.x0(0, m.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f < 0.5f) {
                        if (ac5Var.N.getLayoutManager() != null) {
                            view2 = ac5Var.N.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            ac5Var.N.x0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 18:
                oc5 oc5Var = (oc5) obj;
                if (i == 1) {
                    oc5Var.f.r.m();
                    gm.t1(oc5Var.f.r);
                    return;
                }
                return;
            case 19:
                if (i == 1) {
                    gm.t1(((uc5) obj).c);
                    return;
                }
                return;
            case 20:
                if (i == 1) {
                    gm.t1(((kd5) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 22:
                es5 es5Var = (es5) obj;
                if (i == 1 && es5.Z(es5Var).G) {
                    gm.t1(es5.a0(es5Var).getSearchField());
                    return;
                }
                return;
            case 23:
                if (i == 1) {
                    gm.t1(((LanguageSelectActivity) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 25:
                t17 t17Var = (t17) obj;
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                t17Var.f3 = z;
                if (i == 1) {
                    z2 = true;
                }
                t17Var.g3 = z2;
                return;
            case 28:
                return;
            case 29:
                if (i == 1) {
                    gm.t1(((ji7) obj).T1.getEditText());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        ix3 ix3Var;
        int i3;
        ix3 ix3Var2;
        lf4 lf4Var;
        du3 du3Var;
        int i4;
        mr3 mr3Var;
        int M0;
        String str;
        TLRPC.User user;
        String str2;
        byte b = this.a;
        int i5 = -1;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        int i8 = 0;
        z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                pp2 pp2Var = (pp2) obj;
                if (pp2Var.A1.J1) {
                    gm.t1(pp2Var.y1.r);
                    return;
                }
                return;
            case 1:
                pp2 pp2Var2 = ((np2) obj).f;
                int i9 = pp2.P1;
                pp2Var2.b.invalidate();
                return;
            case 2:
                jp2 jp2Var = (jp2) obj;
                jp2Var.n.G1.b(jp2Var.d);
                return;
            case 3:
            case 19:
            case 20:
            case 22:
            case 23:
            default:
                return;
            case 4:
                ((hz2) obj).Z0();
                return;
            case 5:
                wf3 wf3Var = (wf3) obj;
                gz0 gz0Var = wf3Var.t1;
                if (gz0Var != null) {
                    wk7 wk7Var = gz0Var.o0;
                    if (wk7Var != null && wk7Var.getTop() == gz0Var.q0) {
                        z = true;
                    }
                    wf3Var.v1 = !z;
                    gz0Var.invalidate();
                    return;
                }
                return;
            case 6:
                aj3 aj3Var = (aj3) obj;
                aj3Var.invalidate();
                aj3Var.c();
                hg5 hg5Var = aj3Var.K;
                if (hg5Var != null) {
                    hg5Var.f(true);
                    return;
                }
                return;
            case 7:
                yw3 yw3Var = (yw3) obj;
                ww3 ww3Var = yw3Var.c;
                px3 px3Var = yw3Var.r;
                int i10 = px3.C1;
                px3Var.b.invalidate();
                if (px3Var.d && yw3Var.b.J1 && (ix3Var = yw3Var.d) != null && ix3Var.e != null) {
                    px3Var.G0();
                }
                if (yw3Var.e.L0() + 7 >= ww3Var.b() - 1) {
                    ww3Var.F();
                    return;
                }
                return;
            case 8:
                ex3 ex3Var = (ex3) obj;
                dx3 dx3Var = ex3Var.c;
                uw3 uw3Var = ex3Var.b;
                px3 px3Var2 = ex3Var.s;
                int i11 = px3.C1;
                px3Var2.b.invalidate();
                if (ex3Var.n < 0.0f) {
                    i3 = ex3Var.d.H0();
                } else {
                    while (true) {
                        if (i8 < uw3Var.getChildCount()) {
                            View childAt = uw3Var.getChildAt(i8);
                            if (childAt.getY() + childAt.getHeight() > ex3Var.n + uw3Var.getPaddingTop()) {
                                uw3Var.getClass();
                                i3 = RecyclerView.R(childAt);
                            } else {
                                i8++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    if (i3 == -1) {
                        return;
                    }
                }
                int size = dx3Var.E.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = dx3Var.E.keyAt(size);
                        int valueAt = dx3Var.E.valueAt(size);
                        if (i3 >= keyAt) {
                            i5 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i5 >= 0) {
                    ex3Var.e.j(i5, true);
                }
                if (px3Var2.d && uw3Var.J1 && (ix3Var2 = ex3Var.f) != null && ix3Var2.e != null) {
                    px3Var2.G0();
                    return;
                }
                return;
            case 9:
                az3 az3Var = (az3) obj;
                sy3 sy3Var = az3Var.p1;
                if (sy3Var != null && az3Var.q1.J1 && sy3Var.x) {
                    sy3Var.x = false;
                    sy3Var.invalidate();
                    return;
                }
                return;
            case 10:
                cz3 cz3Var = (cz3) obj;
                if (i2 != 0) {
                    cz3Var.b0 = System.currentTimeMillis() - cz3.g0;
                    cz3Var.invalidate();
                    return;
                }
                return;
            case 11:
                qf4 qf4Var = (qf4) obj;
                if (qf4Var.a.J1 && (lf4Var = qf4Var.L) != null && (du3Var = lf4Var.b) != null) {
                    if (du3Var.e) {
                        du3Var.k(true);
                        return;
                    } else {
                        du3Var.d();
                        return;
                    }
                }
                return;
            case 12:
                ig4 ig4Var = (ig4) obj;
                ig4Var.G.invalidate();
                ig4Var.invalidate();
                return;
            case 13:
                ((dh4) obj).F0();
                return;
            case 14:
                yw4 yw4Var = (yw4) obj;
                yw4Var.j1();
                if (yw4Var.n1.J1 && !yw4Var.m2) {
                    gm.t1(yw4Var.b);
                    return;
                }
                return;
            case 15:
                ((sy4) obj).h(i, i2);
                return;
            case 16:
                ((h15) obj).s.invalidate();
                return;
            case 17:
                ac5 ac5Var = (ac5) obj;
                oi1 oi1Var = ac5Var.A0;
                if (oi1Var == null) {
                    oi1Var = (oi1) ac5Var.C0(ac5Var.a0);
                    ac5Var.A0 = oi1Var;
                }
                int measuredHeight = oi1Var.getMeasuredHeight() - ac5.m1(ac5Var).getMeasuredHeight();
                float top = ac5Var.A0.getTop() * (-1);
                float f = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f), 0.0f);
                ac5Var.B0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(ac5Var.B0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                ac5Var.A0.b.setAlpha(gm.R1(1.0f, 0.0f, min));
                ac5Var.A0.f.setAlpha(gm.R1(1.0f, 0.0f, min));
                ac5Var.A0.c.setAlpha(gm.R1(0.0f, 1.0f, min2));
                int i12 = (ac5Var.B0 > 1.0f ? 1 : (ac5Var.B0 == 1.0f ? 0 : -1));
                oi1 oi1Var2 = ac5Var.A0;
                if (i12 >= 0) {
                    oi1Var2.setTranslationY(top - f);
                    return;
                } else {
                    oi1Var2.setTranslationY(0.0f);
                    return;
                }
            case 18:
                oc5 oc5Var = (oc5) obj;
                int K0 = oc5Var.r.K0();
                View childAt2 = oc5Var.n.getChildAt(0);
                if (childAt2 != null) {
                    i4 = childAt2.getTop();
                } else {
                    i4 = 0;
                }
                ((fn0) oc5Var.e.c).a((K0 != 0 || i4 < oc5Var.n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (mr3Var = oc5Var.q0) != null) {
                    mr3Var.f(i, i2);
                    oc5Var.g0();
                    return;
                }
                return;
            case 21:
                lg5 lg5Var = (lg5) obj;
                if (lg5Var.a.J1) {
                    gm.t1(lg5Var.fragmentView);
                    return;
                }
                return;
            case 24:
                u46 u46Var = (u46) recyclerView.getLayoutManager();
                x07 x07Var = (x07) obj;
                o07 o07Var = x07Var.C;
                if (x07Var.x && !x07Var.w && u46Var != null) {
                    if (x07Var.f.b() - u46Var.M0() < 10) {
                        gm.r(o07Var);
                        gm.c3(o07Var);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                t17 t17Var = (t17) obj;
                f69 layoutManager = t17Var.getLayoutManager();
                u17 u17Var = t17Var.j3;
                n17 n17Var = u17Var.d;
                if (layoutManager == n17Var) {
                    M0 = n17Var.M0();
                } else {
                    M0 = u17Var.c.M0();
                }
                if (M0 != -1) {
                    i7 = M0;
                }
                if (i7 > 0) {
                    k17 k17Var = u17Var.f;
                    if (M0 > k17Var.N0 - 5 && k17Var.v0 == 0 && (str = k17Var.t0) != null && str.length() != 0 && (user = k17Var.x0) != null && (str2 = k17Var.s0) != null) {
                        k17Var.T(true, user, str2, k17Var.t0);
                    }
                }
                t17Var.canScrollVertically(1);
                u17Var.n(!t17Var.canScrollVertically(-1));
                u17Var.b();
                return;
            case 26:
                f57 f57Var = (f57) obj;
                w91 w91Var = f57Var.b;
                fv fvVar = f57Var.f;
                for (int i13 = 0; i13 < fvVar.getChildCount(); i13++) {
                    View childAt3 = fvVar.getChildAt(i13);
                    if (childAt3 instanceof rc2) {
                        ((rc2) childAt3).B3(w91Var.getMeasuredWidth(), w91Var.getBackgroundSizeY());
                    }
                }
                z47 z47Var = f57Var.e;
                if (z47Var != null) {
                    z47Var.v();
                    return;
                }
                return;
            case 27:
                ((j67) obj).K.invalidate();
                return;
            case 28:
                t67 t67Var = (t67) obj;
                int K02 = t67Var.h.K0();
                if (K02 != -1) {
                    i6 = Math.abs(t67Var.h.M0() - K02) + 1;
                }
                int b2 = recyclerView.getAdapter().b();
                if (i6 > 0 && !t67Var.W && !t67Var.F && !t67Var.y.isEmpty() && K02 + i6 >= b2 - 5 && t67Var.E) {
                    t67Var.h0();
                    return;
                }
                return;
        }
    }

    private final void c(RecyclerView recyclerView, int i) {
    }
}
