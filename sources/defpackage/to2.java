package defpackage;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class to2 extends v79 {
    public final byte a;
    public final Object b;

    public to2(Object obj, byte b) {
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
                vo2 vo2Var = (vo2) obj;
                if (i == 0) {
                    vo2Var.e = !vo2Var.d.canScrollVertically(-1);
                    vo2Var.d.canScrollVertically(1);
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
                    hl.t1(((ky2) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                ow3 ow3Var = (ow3) obj;
                if (i == 0 && ow3Var.n >= 0.0f && !ow3Var.b.canScrollVertically(-1)) {
                    ow3Var.n = -1.0f;
                    return;
                }
                return;
            case 9:
                ny3 ny3Var = (ny3) obj;
                if (i == 1) {
                    z2 = true;
                }
                ny3Var.d0 = z2;
                if (i != 0) {
                    ny3Var.b0 = System.currentTimeMillis() - ny3.g0;
                }
                ny3Var.invalidate();
                return;
            case 13:
                if (i == 0) {
                    bx4 bx4Var = (bx4) obj;
                    if (bx4Var.m2) {
                        bx4Var.m2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ((vy4) obj).g++;
                return;
            case 15:
                m15 m15Var = (m15) obj;
                if (i == 0) {
                    int L = hl.L(16.0f) + m15Var.o0().getBottom();
                    int i2 = (m15Var.w > 0.5f ? 1 : (m15Var.w == 0.5f ? 0 : -1));
                    d79 d79Var = m15Var.c;
                    if (i2 > 0) {
                        d79Var.y0(0, m15Var.r - L, null);
                        return;
                    }
                    if (d79Var.getLayoutManager() != null) {
                        view = m15Var.c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (m15Var.p0() + view.getTop() < 0.0f) {
                            m15Var.c.y0(0, Math.round(m15Var.p0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                dc5 dc5Var = (dc5) obj;
                if (i == 0) {
                    float f = dc5Var.B0;
                    if (f >= 0.5f && f < 1.0f) {
                        int bottom = dc5.n1(dc5Var).getBottom();
                        q79 layoutManager = dc5Var.N.getLayoutManager();
                        if (layoutManager != null && (m = layoutManager.m(0)) != null) {
                            dc5Var.N.y0(0, m.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f < 0.5f) {
                        if (dc5Var.N.getLayoutManager() != null) {
                            view2 = dc5Var.N.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            dc5Var.N.y0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 17:
                rc5 rc5Var = (rc5) obj;
                if (i == 1) {
                    rc5Var.f.r.m();
                    hl.t1(rc5Var.f.r);
                    return;
                }
                return;
            case 18:
                if (i == 1) {
                    hl.t1(((xc5) obj).c);
                    return;
                }
                return;
            case 19:
                if (i == 1) {
                    hl.t1(((nd5) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 21:
                hs5 hs5Var = (hs5) obj;
                if (i == 1 && hs5.Y(hs5Var).L) {
                    hl.t1(hs5.Z(hs5Var).getSearchField());
                    return;
                }
                return;
            case 22:
                if (i == 1) {
                    hl.t1(((LanguageSelectActivity) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                a27 a27Var = (a27) obj;
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                a27Var.f3 = z;
                if (i == 1) {
                    z2 = true;
                }
                a27Var.g3 = z2;
                return;
            case 27:
                return;
            case 28:
                if (i == 1) {
                    hl.t1(((qi7) obj).T1.getEditText());
                    return;
                }
                return;
            case 29:
                if (i == 1) {
                    hl.t1(((NotificationsCustomSettingsActivity) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        sw3 sw3Var;
        int i3;
        sw3 sw3Var2;
        if4 if4Var;
        lt3 lt3Var;
        int i4;
        tq3 tq3Var;
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
                xo2 xo2Var = ((vo2) obj).f;
                int i9 = xo2.P1;
                xo2Var.b.invalidate();
                return;
            case 1:
                qo2 qo2Var = (qo2) obj;
                qo2Var.n.G1.b(qo2Var.d);
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
                ((ry2) obj).a1();
                return;
            case 4:
                df3 df3Var = (df3) obj;
                hy0 hy0Var = df3Var.t1;
                if (hy0Var != null) {
                    dl7 dl7Var = hy0Var.i0;
                    if (dl7Var != null && dl7Var.getTop() == hy0Var.k0) {
                        z = true;
                    }
                    df3Var.v1 = !z;
                    hy0Var.invalidate();
                    return;
                }
                return;
            case 5:
                ii3 ii3Var = (ii3) obj;
                ii3Var.invalidate();
                ii3Var.c();
                kg5 kg5Var = ii3Var.K;
                if (kg5Var != null) {
                    kg5Var.f(true);
                    return;
                }
                return;
            case 6:
                hw3 hw3Var = (hw3) obj;
                fw3 fw3Var = hw3Var.c;
                zw3 zw3Var = hw3Var.r;
                int i10 = zw3.C1;
                zw3Var.b.invalidate();
                if (zw3Var.d && hw3Var.b.J1 && (sw3Var = hw3Var.d) != null && sw3Var.e != null) {
                    zw3Var.H0();
                }
                if (hw3Var.e.L0() + 7 >= fw3Var.b() - 1) {
                    fw3Var.F();
                    return;
                }
                return;
            case 7:
                ow3 ow3Var = (ow3) obj;
                nw3 nw3Var = ow3Var.c;
                dw3 dw3Var = ow3Var.b;
                zw3 zw3Var2 = ow3Var.s;
                int i11 = zw3.C1;
                zw3Var2.b.invalidate();
                if (ow3Var.n < 0.0f) {
                    i3 = ow3Var.d.H0();
                } else {
                    while (true) {
                        if (i8 < dw3Var.getChildCount()) {
                            View childAt = dw3Var.getChildAt(i8);
                            if (childAt.getY() + childAt.getHeight() > ow3Var.n + dw3Var.getPaddingTop()) {
                                dw3Var.getClass();
                                i3 = RecyclerView.S(childAt);
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
                int size = nw3Var.E.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = nw3Var.E.keyAt(size);
                        int valueAt = nw3Var.E.valueAt(size);
                        if (i3 >= keyAt) {
                            i5 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i5 >= 0) {
                    ow3Var.e.j(i5, true);
                }
                if (zw3Var2.d && dw3Var.J1 && (sw3Var2 = ow3Var.f) != null && sw3Var2.e != null) {
                    zw3Var2.H0();
                    return;
                }
                return;
            case 8:
                ly3 ly3Var = (ly3) obj;
                dy3 dy3Var = ly3Var.p1;
                if (dy3Var != null && ly3Var.q1.J1 && dy3Var.x) {
                    dy3Var.x = false;
                    dy3Var.invalidate();
                    return;
                }
                return;
            case 9:
                ny3 ny3Var = (ny3) obj;
                if (i2 != 0) {
                    ny3Var.b0 = System.currentTimeMillis() - ny3.g0;
                    ny3Var.invalidate();
                    return;
                }
                return;
            case 10:
                nf4 nf4Var = (nf4) obj;
                if (nf4Var.a.J1 && (if4Var = nf4Var.L) != null && (lt3Var = if4Var.b) != null) {
                    if (lt3Var.e) {
                        lt3Var.k(true);
                        return;
                    } else {
                        lt3Var.d();
                        return;
                    }
                }
                return;
            case 11:
                fg4 fg4Var = (fg4) obj;
                fg4Var.G.invalidate();
                fg4Var.invalidate();
                return;
            case 12:
                ((ah4) obj).G0();
                return;
            case 13:
                bx4 bx4Var = (bx4) obj;
                bx4Var.k1();
                if (bx4Var.n1.J1 && !bx4Var.m2) {
                    hl.t1(bx4Var.b);
                    return;
                }
                return;
            case 14:
                ((vy4) obj).h(i, i2);
                return;
            case 15:
                ((m15) obj).s.invalidate();
                return;
            case 16:
                dc5 dc5Var = (dc5) obj;
                ph1 ph1Var = dc5Var.A0;
                if (ph1Var == null) {
                    ph1Var = (ph1) dc5Var.C0(dc5Var.a0);
                    dc5Var.A0 = ph1Var;
                }
                int measuredHeight = ph1Var.getMeasuredHeight() - dc5.m1(dc5Var).getMeasuredHeight();
                float top = dc5Var.A0.getTop() * (-1);
                float f = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f), 0.0f);
                dc5Var.B0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(dc5Var.B0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                dc5Var.A0.b.setAlpha(hl.R1(1.0f, 0.0f, min));
                dc5Var.A0.f.setAlpha(hl.R1(1.0f, 0.0f, min));
                dc5Var.A0.c.setAlpha(hl.R1(0.0f, 1.0f, min2));
                int i12 = (dc5Var.B0 > 1.0f ? 1 : (dc5Var.B0 == 1.0f ? 0 : -1));
                ph1 ph1Var2 = dc5Var.A0;
                if (i12 >= 0) {
                    ph1Var2.setTranslationY(top - f);
                    return;
                } else {
                    ph1Var2.setTranslationY(0.0f);
                    return;
                }
            case 17:
                rc5 rc5Var = (rc5) obj;
                int K0 = rc5Var.r.K0();
                View childAt2 = rc5Var.n.getChildAt(0);
                if (childAt2 != null) {
                    i4 = childAt2.getTop();
                } else {
                    i4 = 0;
                }
                ((fm0) rc5Var.e.c).a((K0 != 0 || i4 < rc5Var.n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (tq3Var = rc5Var.q0) != null) {
                    tq3Var.f(i, i2);
                    rc5Var.f0();
                    return;
                }
                return;
            case 20:
                ng5 ng5Var = (ng5) obj;
                if (ng5Var.a.J1) {
                    hl.t1(ng5Var.fragmentView);
                    return;
                }
                return;
            case 23:
                x46 x46Var = (x46) recyclerView.getLayoutManager();
                e17 e17Var = (e17) obj;
                v07 v07Var = e17Var.C;
                if (e17Var.x && !e17Var.w && x46Var != null) {
                    if (e17Var.f.b() - x46Var.M0() < 10) {
                        hl.r(v07Var);
                        hl.c3(v07Var);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                a27 a27Var = (a27) obj;
                q79 layoutManager = a27Var.getLayoutManager();
                b27 b27Var = a27Var.j3;
                u17 u17Var = b27Var.d;
                if (layoutManager == u17Var) {
                    M0 = u17Var.M0();
                } else {
                    M0 = b27Var.c.M0();
                }
                if (M0 != -1) {
                    i7 = M0;
                }
                if (i7 > 0) {
                    r17 r17Var = b27Var.f;
                    if (M0 > r17Var.N0 - 5 && r17Var.v0 == 0 && (str = r17Var.t0) != null && str.length() != 0 && (user = r17Var.x0) != null && (str2 = r17Var.s0) != null) {
                        r17Var.T(true, user, str2, r17Var.t0);
                    }
                }
                a27Var.canScrollVertically(1);
                b27Var.n(!a27Var.canScrollVertically(-1));
                b27Var.b();
                return;
            case 25:
                m57 m57Var = (m57) obj;
                w81 w81Var = m57Var.b;
                gu guVar = m57Var.f;
                for (int i13 = 0; i13 < guVar.getChildCount(); i13++) {
                    View childAt3 = guVar.getChildAt(i13);
                    if (childAt3 instanceof wb2) {
                        ((wb2) childAt3).B3(w81Var.getMeasuredWidth(), w81Var.getBackgroundSizeY());
                    }
                }
                g57 g57Var = m57Var.e;
                if (g57Var != null) {
                    g57Var.v();
                    return;
                }
                return;
            case 26:
                ((q67) obj).K.invalidate();
                return;
            case 27:
                z67 z67Var = (z67) obj;
                int K02 = z67Var.h.K0();
                if (K02 != -1) {
                    i6 = Math.abs(z67Var.h.M0() - K02) + 1;
                }
                int b2 = recyclerView.getAdapter().b();
                if (i6 > 0 && !z67Var.W && !z67Var.F && !z67Var.y.isEmpty() && K02 + i6 >= b2 - 5 && z67Var.E) {
                    z67Var.g0();
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
