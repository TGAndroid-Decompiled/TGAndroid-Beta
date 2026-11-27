package defpackage;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
public final class hz3 implements ry4, t69, vu9, s84 {
    public final byte a;
    public final o24 b;

    public hz3(o24 o24Var, byte b) {
        this.a = b;
        this.b = o24Var;
    }

    @Override
    public final void a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        b24 b24Var;
        byte b = this.a;
        o24 o24Var = this.b;
        switch (b) {
            case 2:
                u14 u14Var = o24Var.j0;
                int i7 = o24Var.d1;
                t14 t14Var = o24Var.o0;
                w14 w14Var = o24Var.l0;
                if (i != o24Var.t0 || !t14Var.y.isEmpty()) {
                    o24Var.i0.E0();
                    o24Var.q0.k(i, 0);
                    if (i != o24Var.s0 && i != o24Var.t0) {
                        ArrayList arrayList = uc7.s1(i7).x3;
                        o24Var.k0.H((String) arrayList.get(i - o24Var.u0));
                        int i8 = i - o24Var.u0;
                        if (i8 > 0) {
                            w14Var.a((String) arrayList.get(i8 - 1), true);
                        }
                        if (i - o24Var.u0 < arrayList.size() - 1) {
                            w14Var.a((String) arrayList.get((i - o24Var.u0) + 1), true);
                        }
                    } else {
                        o24Var.p0.d.setText("");
                        if (i == o24Var.t0 && (i3 = t14Var.J) >= 1) {
                            u14Var.g1(i3, -hl.L(4.0f));
                        } else {
                            p14 p14Var = o24Var.u1;
                            if (p14Var != null && p14Var.A()) {
                                i2 = 0;
                            } else {
                                i2 = 1;
                            }
                            u14Var.g1(i2, 0);
                        }
                        if (i == o24Var.t0) {
                            ArrayList arrayList2 = uc7.s1(i7).x3;
                            if (!arrayList2.isEmpty()) {
                                w14Var.a((String) arrayList2.get(0), true);
                            }
                        }
                    }
                    o24Var.D(2);
                    return;
                }
                return;
            default:
                a04 a04Var = o24Var.H0;
                ArrayList arrayList3 = o24Var.e1;
                b04 b04Var = o24Var.C0;
                g24 g24Var = o24Var.z0;
                wz3 wz3Var = o24Var.E0;
                if (!o24Var.T0) {
                    if (i == o24Var.I1) {
                        o24Var.u1.g(new d6c(o24Var.getContext(), new j04(o24Var), o24Var.y1, o24Var.z1, o24Var.A1, null, o24Var.a2));
                        return;
                    }
                    if (a04Var != null && (b24Var = a04Var.r) != null && b24Var.getSelectedCategory() != null) {
                        a04Var.b(null, false);
                        b24Var.J1(null);
                    }
                    if (i == o24Var.G1) {
                        wz3Var.E0();
                        o24Var.F(g24Var.E("recent"), 0);
                        o24Var.D(0);
                        int i9 = o24Var.G1;
                        if (i9 > 0) {
                            i6 = i9;
                        } else {
                            i6 = o24Var.F1;
                        }
                        b04Var.k(i9, i6);
                        return;
                    } else if (i == o24Var.H1) {
                        wz3Var.E0();
                        o24Var.F(g24Var.E("fav"), 0);
                        o24Var.D(0);
                        int i10 = o24Var.H1;
                        if (i10 > 0) {
                            i5 = i10;
                        } else {
                            i5 = o24Var.F1;
                        }
                        b04Var.k(i10, i5);
                        return;
                    } else if (i == o24Var.J1) {
                        wz3Var.E0();
                        o24Var.F(g24Var.E("premium"), 0);
                        o24Var.D(0);
                        int i11 = o24Var.J1;
                        if (i11 > 0) {
                            i4 = i11;
                        } else {
                            i4 = o24Var.F1;
                        }
                        b04Var.k(i11, i4);
                        return;
                    } else {
                        int i12 = i - o24Var.F1;
                        if (i12 < arrayList3.size()) {
                            if (i12 >= arrayList3.size()) {
                                i12 = arrayList3.size() - 1;
                            }
                            o24Var.J0 = false;
                            wz3Var.E0();
                            o24Var.F(g24Var.E(arrayList3.get(i12)), 0);
                            o24Var.D(0);
                            o24Var.m(0);
                            int i13 = o24Var.H1;
                            if (i13 <= 0 && (i13 = o24Var.G1) <= 0) {
                                i13 = o24Var.F1;
                            }
                            b04Var.k(i, i13);
                            o24Var.Y1 = false;
                            o24Var.Y();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final boolean e(int i, View view) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        String str3;
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        boolean z3;
        o24 o24Var = this.b;
        int i7 = o24Var.D1;
        int[] iArr = o24Var.E1;
        b14 b14Var = o24Var.Q;
        bx3 bx3Var = o24Var.C1;
        if (view instanceof x14) {
            x14 x14Var = (x14) view;
            f89 f89Var = null;
            if (x14Var.c) {
                View G = b14Var.G(view);
                if (G != null) {
                    f89Var = b14Var.U(G);
                }
                if (f89Var != null && f89Var.b() <= o24Var.getRecentEmoji().size()) {
                    o24Var.u1.n();
                }
                b14Var.B1(view);
                return true;
            } else if (x14Var.getSpan() == null && (str = (String) x14Var.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!x14Var.c) {
                    str2 = (String) pv3.j.get(replace);
                } else {
                    str2 = null;
                }
                if (jr2.a(replace, null, null) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || jx3.l.contains(replace)) {
                    o24Var.S1 = x14Var;
                    o24Var.V1 = o24Var.T1;
                    o24Var.W1 = o24Var.U1;
                    if (z) {
                        replace = o24.c(replace, str2);
                    } else {
                        int indexOf = jr2.a.indexOf(str2) + 1;
                        ax3 ax3Var = bx3Var.c;
                        int[] iArr2 = ax3Var.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            ax3Var.invalidate();
                        }
                    }
                    bx3Var.getClass();
                    ax3 ax3Var2 = bx3Var.c;
                    int i8 = bx3Var.e;
                    if (jr2.a(replace, null, null) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bx3Var.d = z2;
                    int i9 = 3;
                    Drawable[] drawableArr = ax3Var2.b;
                    int[] iArr3 = ax3Var2.n;
                    ax3Var2.f = z2;
                    ax3Var2.e = replace;
                    int i10 = 5;
                    if (z2) {
                        drawableArr[0] = jr2.a(replace, -1, -1);
                        drawableArr[1] = jr2.a(ax3Var2.e, 0, -2);
                        drawableArr[2] = jr2.a(ax3Var2.e, 1, -2);
                        drawableArr[3] = jr2.a(ax3Var2.e, 2, -2);
                        drawableArr[4] = jr2.a(ax3Var2.e, 3, -2);
                        drawableArr[5] = jr2.a(ax3Var2.e, 4, -2);
                        drawableArr[6] = jr2.a(ax3Var2.e, -2, 0);
                        drawableArr[7] = jr2.a(ax3Var2.e, -2, 1);
                        drawableArr[8] = jr2.a(ax3Var2.e, -2, 2);
                        drawableArr[9] = jr2.a(ax3Var2.e, -2, 3);
                        drawableArr[10] = jr2.a(ax3Var2.e, -2, 4);
                        Pair c = jr2.c(replace);
                        if (c != null) {
                            int intValue = ((Integer) c.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                ax3Var2.invalidate();
                            }
                            int intValue2 = ((Integer) c.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                ax3Var2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            ax3Var2.H = z3;
                        }
                        ax3Var2.J = true;
                    } else {
                        for (int i11 = 0; i11 < 6; i11++) {
                            if (i11 != 0) {
                                str3 = o24.c(replace, (String) jr2.a.get(i11 - 1));
                            } else {
                                str3 = replace;
                            }
                            drawableArr[i11] = pv3.f(str3);
                        }
                    }
                    ax3Var2.invalidate();
                    int i12 = i8 * 6;
                    if (bx3Var.d) {
                        i2 = 3;
                    } else {
                        i2 = 0;
                    }
                    bx3Var.setWidth(hl.L(i2 + 30) + i12);
                    float f3 = 15.0f;
                    if (bx3Var.d) {
                        f = 11.66f;
                    } else {
                        f = 15.0f;
                    }
                    int L = hl.L(f);
                    if (bx3Var.d) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    bx3Var.setHeight((i3 * i8) + L);
                    int i13 = i8 * 6;
                    if (!bx3Var.d) {
                        i9 = 0;
                    }
                    int L2 = hl.L(i9 + 30) + i13;
                    if (bx3Var.d) {
                        f3 = 11.66f;
                    }
                    int L3 = hl.L(f3);
                    if (bx3Var.d) {
                        i4 = 2;
                    } else {
                        i4 = 1;
                    }
                    int i14 = (i4 * i8) + L3;
                    x14Var.getLocationOnScreen(iArr);
                    if (!bx3Var.d) {
                        int i15 = ax3Var2.n[0];
                        int i16 = i15 * i7;
                        int i17 = i15 << 2;
                        if (!hl.O1()) {
                            i10 = 1;
                        }
                        i5 = hl.L(i17 - i10) + i16;
                    } else {
                        i5 = 0;
                    }
                    if (iArr[0] - i5 < hl.L(5.0f)) {
                        i5 = c00.A(5.0f, iArr[0] - i5, i5);
                    } else {
                        int i18 = (iArr[0] - i5) + L2;
                        Point point = hl.q;
                        if (i18 > point.x - hl.L(5.0f)) {
                            i5 += ((iArr[0] - i5) + L2) - (point.x - hl.L(5.0f));
                        }
                    }
                    int i19 = -i5;
                    if (x14Var.getTop() < 0) {
                        i6 = x14Var.getTop();
                    } else {
                        i6 = 0;
                    }
                    if (hl.O1()) {
                        f2 = 30.0f;
                    } else {
                        f2 = 22.0f;
                    }
                    ax3Var2.setArrowX((hl.L(f2) - i19) + ((int) hl.N(0.5f)));
                    bx3Var.setFocusable(true);
                    bx3Var.showAsDropDown(view, i19, (((view.getMeasuredHeight() - i7) / 2) + ((-view.getMeasuredHeight()) - i14)) - i6);
                    o24Var.h.requestDisallowInterceptTouchEvent(true);
                    b14Var.f1(true);
                    b14Var.B1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void k(int i) {
        o24 o24Var = this.b;
        tq3 tq3Var = o24Var.k2;
        if (Build.VERSION.SDK_INT >= 31 && tq3Var != null) {
            if (vsd.a(i, 4)) {
                tq3Var.h(o24Var.n2.e());
            }
            tq3Var.e(o24Var.l2, o24Var.getWidth(), o24Var.getHeight());
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        this.b.R();
    }

    @Override
    public final void v0(float f, int i) {
    }
}
