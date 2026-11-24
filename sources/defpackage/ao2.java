package defpackage;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class ao2 extends i49 {
    public final byte a;
    public final Object b;

    public ao2(Object obj, byte b) {
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
            case 0:
                co2 co2Var = (co2) obj;
                if (i == 0) {
                    co2Var.e = !co2Var.d.canScrollVertically(-1);
                    co2Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
            case 20:
            case 23:
            case 25:
            case 26:
            default:
                return;
            case 2:
                if (i == 1) {
                    gl.t1(((qx2) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                tv3 tv3Var = (tv3) obj;
                if (i == 0 && tv3Var.n >= 0.0f && !tv3Var.b.canScrollVertically(-1)) {
                    tv3Var.n = -1.0f;
                    return;
                }
                return;
            case 9:
                sx3 sx3Var = (sx3) obj;
                if (i == 1) {
                    z2 = true;
                }
                sx3Var.d0 = z2;
                if (i != 0) {
                    sx3Var.b0 = System.currentTimeMillis() - sx3.g0;
                }
                sx3Var.invalidate();
                return;
            case 13:
                if (i == 0) {
                    xu4 xu4Var = (xu4) obj;
                    if (xu4Var.m2) {
                        xu4Var.m2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ((qw4) obj).g++;
                return;
            case 15:
                iz4 iz4Var = (iz4) obj;
                if (i == 0) {
                    int L = gl.L(16.0f) + iz4Var.o0().getBottom();
                    int i2 = (iz4Var.w > 0.5f ? 1 : (iz4Var.w == 0.5f ? 0 : -1));
                    o39 o39Var = iz4Var.c;
                    if (i2 > 0) {
                        o39Var.x0(0, iz4Var.r - L, null);
                        return;
                    }
                    if (o39Var.getLayoutManager() != null) {
                        view = iz4Var.c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (iz4Var.p0() + view.getTop() < 0.0f) {
                            iz4Var.c.x0(0, Math.round(iz4Var.p0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ca5 ca5Var = (ca5) obj;
                if (i == 0) {
                    float f = ca5Var.B0;
                    if (f >= 0.5f && f < 1.0f) {
                        int bottom = ca5.m1(ca5Var).getBottom();
                        d49 layoutManager = ca5Var.N.getLayoutManager();
                        if (layoutManager != null && (m = layoutManager.m(0)) != null) {
                            ca5Var.N.x0(0, m.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f < 0.5f) {
                        if (ca5Var.N.getLayoutManager() != null) {
                            view2 = ca5Var.N.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            ca5Var.N.x0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 17:
                qa5 qa5Var = (qa5) obj;
                if (i == 1) {
                    qa5Var.f.r.m();
                    gl.t1(qa5Var.f.r);
                    return;
                }
                return;
            case 18:
                if (i == 1) {
                    gl.t1(((wa5) obj).c);
                    return;
                }
                return;
            case 19:
                if (i == 1) {
                    gl.t1(((mb5) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 21:
                gq5 gq5Var = (gq5) obj;
                if (i == 1 && gq5.Y(gq5Var).G) {
                    gl.t1(gq5.Z(gq5Var).getSearchField());
                    return;
                }
                return;
            case 22:
                if (i == 1) {
                    gl.t1(((LanguageSelectActivity) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                tz6 tz6Var = (tz6) obj;
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                tz6Var.f3 = z;
                if (i == 1) {
                    z2 = true;
                }
                tz6Var.g3 = z2;
                return;
            case 27:
                return;
            case 28:
                if (i == 1) {
                    gl.t1(((gg7) obj).T1.getEditText());
                    return;
                }
                return;
            case 29:
                if (i == 1) {
                    gl.t1(((NotificationsCustomSettingsActivity) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        xv3 xv3Var;
        int i3;
        xv3 xv3Var2;
        kd4 kd4Var;
        ts3 ts3Var;
        int i4;
        cq3 cq3Var;
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
                eo2 eo2Var = ((co2) obj).f;
                int i9 = eo2.P1;
                eo2Var.b.invalidate();
                return;
            case 1:
                xn2 xn2Var = (xn2) obj;
                xn2Var.n.G1.b(xn2Var.d);
                return;
            case 2:
            case 18:
            case 19:
            case 21:
            case 22:
            case 28:
            case 29:
            default:
                return;
            case 3:
                ((xx2) obj).Z0();
                return;
            case 4:
                je3 je3Var = (je3) obj;
                zx0 zx0Var = je3Var.t1;
                if (zx0Var != null) {
                    ui7 ui7Var = zx0Var.o0;
                    if (ui7Var != null && ui7Var.getTop() == zx0Var.q0) {
                        z = true;
                    }
                    je3Var.v1 = !z;
                    zx0Var.invalidate();
                    return;
                }
                return;
            case 5:
                oh3 oh3Var = (oh3) obj;
                oh3Var.invalidate();
                oh3Var.c();
                je5 je5Var = oh3Var.K;
                if (je5Var != null) {
                    je5Var.f(true);
                    return;
                }
                return;
            case 6:
                nv3 nv3Var = (nv3) obj;
                lv3 lv3Var = nv3Var.c;
                ew3 ew3Var = nv3Var.r;
                int i10 = ew3.C1;
                ew3Var.b.invalidate();
                if (ew3Var.d && nv3Var.b.J1 && (xv3Var = nv3Var.d) != null && xv3Var.e != null) {
                    ew3Var.G0();
                }
                if (nv3Var.e.L0() + 7 >= lv3Var.b() - 1) {
                    lv3Var.F();
                    return;
                }
                return;
            case 7:
                tv3 tv3Var = (tv3) obj;
                sv3 sv3Var = tv3Var.c;
                jv3 jv3Var = tv3Var.b;
                ew3 ew3Var2 = tv3Var.s;
                int i11 = ew3.C1;
                ew3Var2.b.invalidate();
                if (tv3Var.n < 0.0f) {
                    i3 = tv3Var.d.H0();
                } else {
                    while (true) {
                        if (i8 < jv3Var.getChildCount()) {
                            View childAt = jv3Var.getChildAt(i8);
                            if (childAt.getY() + childAt.getHeight() > tv3Var.n + jv3Var.getPaddingTop()) {
                                jv3Var.getClass();
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
                int size = sv3Var.E.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = sv3Var.E.keyAt(size);
                        int valueAt = sv3Var.E.valueAt(size);
                        if (i3 >= keyAt) {
                            i5 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i5 >= 0) {
                    tv3Var.e.j(i5, true);
                }
                if (ew3Var2.d && jv3Var.J1 && (xv3Var2 = tv3Var.f) != null && xv3Var2.e != null) {
                    ew3Var2.G0();
                    return;
                }
                return;
            case 8:
                qx3 qx3Var = (qx3) obj;
                hx3 hx3Var = qx3Var.p1;
                if (hx3Var != null && qx3Var.q1.J1 && hx3Var.x) {
                    hx3Var.x = false;
                    hx3Var.invalidate();
                    return;
                }
                return;
            case 9:
                sx3 sx3Var = (sx3) obj;
                if (i2 != 0) {
                    sx3Var.b0 = System.currentTimeMillis() - sx3.g0;
                    sx3Var.invalidate();
                    return;
                }
                return;
            case 10:
                pd4 pd4Var = (pd4) obj;
                if (pd4Var.a.J1 && (kd4Var = pd4Var.L) != null && (ts3Var = kd4Var.b) != null) {
                    if (ts3Var.e) {
                        ts3Var.k(true);
                        return;
                    } else {
                        ts3Var.d();
                        return;
                    }
                }
                return;
            case 11:
                he4 he4Var = (he4) obj;
                he4Var.G.invalidate();
                he4Var.invalidate();
                return;
            case 12:
                ((cf4) obj).F0();
                return;
            case 13:
                xu4 xu4Var = (xu4) obj;
                xu4Var.j1();
                if (xu4Var.n1.J1 && !xu4Var.m2) {
                    gl.t1(xu4Var.b);
                    return;
                }
                return;
            case 14:
                ((qw4) obj).h(i, i2);
                return;
            case 15:
                ((iz4) obj).s.invalidate();
                return;
            case 16:
                ca5 ca5Var = (ca5) obj;
                gh1 gh1Var = ca5Var.A0;
                if (gh1Var == null) {
                    gh1Var = (gh1) ca5Var.B0(ca5Var.a0);
                    ca5Var.A0 = gh1Var;
                }
                int measuredHeight = gh1Var.getMeasuredHeight() - ca5.l1(ca5Var).getMeasuredHeight();
                float top = ca5Var.A0.getTop() * (-1);
                float f = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f), 0.0f);
                ca5Var.B0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(ca5Var.B0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                ca5Var.A0.b.setAlpha(gl.R1(1.0f, 0.0f, min));
                ca5Var.A0.f.setAlpha(gl.R1(1.0f, 0.0f, min));
                ca5Var.A0.c.setAlpha(gl.R1(0.0f, 1.0f, min2));
                int i12 = (ca5Var.B0 > 1.0f ? 1 : (ca5Var.B0 == 1.0f ? 0 : -1));
                gh1 gh1Var2 = ca5Var.A0;
                if (i12 >= 0) {
                    gh1Var2.setTranslationY(top - f);
                    return;
                } else {
                    gh1Var2.setTranslationY(0.0f);
                    return;
                }
            case 17:
                qa5 qa5Var = (qa5) obj;
                int K0 = qa5Var.r.K0();
                View childAt2 = qa5Var.n.getChildAt(0);
                if (childAt2 != null) {
                    i4 = childAt2.getTop();
                } else {
                    i4 = 0;
                }
                ((fm0) qa5Var.e.c).a((K0 != 0 || i4 < qa5Var.n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (cq3Var = qa5Var.q0) != null) {
                    cq3Var.f(i, i2);
                    qa5Var.f0();
                    return;
                }
                return;
            case 20:
                me5 me5Var = (me5) obj;
                if (me5Var.a.J1) {
                    gl.t1(me5Var.fragmentView);
                    return;
                }
                return;
            case 23:
                t26 t26Var = (t26) recyclerView.getLayoutManager();
                xy6 xy6Var = (xy6) obj;
                oy6 oy6Var = xy6Var.C;
                if (xy6Var.x && !xy6Var.w && t26Var != null) {
                    if (xy6Var.f.b() - t26Var.M0() < 10) {
                        gl.r(oy6Var);
                        gl.c3(oy6Var);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                tz6 tz6Var = (tz6) obj;
                d49 layoutManager = tz6Var.getLayoutManager();
                uz6 uz6Var = tz6Var.j3;
                nz6 nz6Var = uz6Var.d;
                if (layoutManager == nz6Var) {
                    M0 = nz6Var.M0();
                } else {
                    M0 = uz6Var.c.M0();
                }
                if (M0 != -1) {
                    i7 = M0;
                }
                if (i7 > 0) {
                    kz6 kz6Var = uz6Var.f;
                    if (M0 > kz6Var.N0 - 5 && kz6Var.v0 == 0 && (str = kz6Var.t0) != null && str.length() != 0 && (user = kz6Var.x0) != null && (str2 = kz6Var.s0) != null) {
                        kz6Var.T(true, user, str2, kz6Var.t0);
                    }
                }
                tz6Var.canScrollVertically(1);
                uz6Var.n(!tz6Var.canScrollVertically(-1));
                uz6Var.b();
                return;
            case 25:
                f37 f37Var = (f37) obj;
                n81 n81Var = f37Var.b;
                fu fuVar = f37Var.f;
                for (int i13 = 0; i13 < fuVar.getChildCount(); i13++) {
                    View childAt3 = fuVar.getChildAt(i13);
                    if (childAt3 instanceof gb2) {
                        ((gb2) childAt3).B3(n81Var.getMeasuredWidth(), n81Var.getBackgroundSizeY());
                    }
                }
                z27 z27Var = f37Var.e;
                if (z27Var != null) {
                    z27Var.v();
                    return;
                }
                return;
            case 26:
                ((j47) obj).K.invalidate();
                return;
            case 27:
                s47 s47Var = (s47) obj;
                int K02 = s47Var.h.K0();
                if (K02 != -1) {
                    i6 = Math.abs(s47Var.h.M0() - K02) + 1;
                }
                int b2 = recyclerView.getAdapter().b();
                if (i6 > 0 && !s47Var.W && !s47Var.F && !s47Var.y.isEmpty() && K02 + i6 >= b2 - 5 && s47Var.E) {
                    s47Var.g0();
                    return;
                }
                return;
        }
    }

    private final void c(RecyclerView recyclerView, int i) {
    }

    private final void d(RecyclerView recyclerView, int i, int i2) {
    }
}
