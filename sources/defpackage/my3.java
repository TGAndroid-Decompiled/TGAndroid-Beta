package defpackage;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
public final class my3 implements mw4, e39, cr9, x74 {
    public final byte a;
    public final t14 b;

    public my3(t14 t14Var, byte b) {
        this.a = b;
        this.b = t14Var;
    }

    @Override
    public final void a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        g14 g14Var;
        byte b = this.a;
        t14 t14Var = this.b;
        switch (b) {
            case 2:
                z04 z04Var = t14Var.j0;
                int i7 = t14Var.d1;
                y04 y04Var = t14Var.o0;
                b14 b14Var = t14Var.l0;
                if (i != t14Var.t0 || !y04Var.y.isEmpty()) {
                    t14Var.i0.D0();
                    t14Var.q0.k(i, 0);
                    if (i != t14Var.s0 && i != t14Var.t0) {
                        ArrayList arrayList = na7.q1(i7).x3;
                        t14Var.k0.H((String) arrayList.get(i - t14Var.u0));
                        int i8 = i - t14Var.u0;
                        if (i8 > 0) {
                            b14Var.a((String) arrayList.get(i8 - 1), true);
                        }
                        if (i - t14Var.u0 < arrayList.size() - 1) {
                            b14Var.a((String) arrayList.get((i - t14Var.u0) + 1), true);
                        }
                    } else {
                        t14Var.p0.d.setText("");
                        if (i == t14Var.t0 && (i3 = y04Var.J) >= 1) {
                            z04Var.g1(i3, -gl.L(4.0f));
                        } else {
                            u04 u04Var = t14Var.u1;
                            if (u04Var != null && u04Var.A()) {
                                i2 = 0;
                            } else {
                                i2 = 1;
                            }
                            z04Var.g1(i2, 0);
                        }
                        if (i == t14Var.t0) {
                            ArrayList arrayList2 = na7.q1(i7).x3;
                            if (!arrayList2.isEmpty()) {
                                b14Var.a((String) arrayList2.get(0), true);
                            }
                        }
                    }
                    t14Var.E(2);
                    return;
                }
                return;
            default:
                fz3 fz3Var = t14Var.H0;
                ArrayList arrayList3 = t14Var.e1;
                gz3 gz3Var = t14Var.C0;
                l14 l14Var = t14Var.z0;
                bz3 bz3Var = t14Var.E0;
                if (!t14Var.T0) {
                    if (i == t14Var.I1) {
                        t14Var.u1.g(new d2c(t14Var.getContext(), new oz3(t14Var), t14Var.y1, t14Var.z1, t14Var.A1, null, t14Var.a2));
                        return;
                    }
                    if (fz3Var != null && (g14Var = fz3Var.r) != null && g14Var.getSelectedCategory() != null) {
                        fz3Var.b(null, false);
                        g14Var.I1(null);
                    }
                    if (i == t14Var.G1) {
                        bz3Var.D0();
                        t14Var.G(l14Var.E("recent"), 0);
                        t14Var.E(0);
                        int i9 = t14Var.G1;
                        if (i9 > 0) {
                            i6 = i9;
                        } else {
                            i6 = t14Var.F1;
                        }
                        gz3Var.k(i9, i6);
                        return;
                    } else if (i == t14Var.H1) {
                        bz3Var.D0();
                        t14Var.G(l14Var.E("fav"), 0);
                        t14Var.E(0);
                        int i10 = t14Var.H1;
                        if (i10 > 0) {
                            i5 = i10;
                        } else {
                            i5 = t14Var.F1;
                        }
                        gz3Var.k(i10, i5);
                        return;
                    } else if (i == t14Var.J1) {
                        bz3Var.D0();
                        t14Var.G(l14Var.E("premium"), 0);
                        t14Var.E(0);
                        int i11 = t14Var.J1;
                        if (i11 > 0) {
                            i4 = i11;
                        } else {
                            i4 = t14Var.F1;
                        }
                        gz3Var.k(i11, i4);
                        return;
                    } else {
                        int i12 = i - t14Var.F1;
                        if (i12 < arrayList3.size()) {
                            if (i12 >= arrayList3.size()) {
                                i12 = arrayList3.size() - 1;
                            }
                            t14Var.J0 = false;
                            bz3Var.D0();
                            t14Var.G(l14Var.E(arrayList3.get(i12)), 0);
                            t14Var.E(0);
                            t14Var.m(0);
                            int i13 = t14Var.H1;
                            if (i13 <= 0 && (i13 = t14Var.G1) <= 0) {
                                i13 = t14Var.F1;
                            }
                            gz3Var.k(i, i13);
                            t14Var.Y1 = false;
                            t14Var.Z();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final boolean d(int i, View view) {
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
        t14 t14Var = this.b;
        int i7 = t14Var.D1;
        int[] iArr = t14Var.E1;
        g04 g04Var = t14Var.Q;
        gw3 gw3Var = t14Var.C1;
        if (view instanceof c14) {
            c14 c14Var = (c14) view;
            s49 s49Var = null;
            if (c14Var.c) {
                View F = g04Var.F(view);
                if (F != null) {
                    s49Var = g04Var.T(F);
                }
                if (s49Var != null && s49Var.b() <= t14Var.getRecentEmoji().size()) {
                    t14Var.u1.n();
                }
                g04Var.A1(view);
                return true;
            } else if (c14Var.getSpan() == null && (str = (String) c14Var.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!c14Var.c) {
                    str2 = (String) vu3.j.get(replace);
                } else {
                    str2 = null;
                }
                if (qq2.a(replace, null, null) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || ow3.l.contains(replace)) {
                    t14Var.S1 = c14Var;
                    t14Var.V1 = t14Var.T1;
                    t14Var.W1 = t14Var.U1;
                    if (z) {
                        replace = t14.c(replace, str2);
                    } else {
                        int indexOf = qq2.a.indexOf(str2) + 1;
                        fw3 fw3Var = gw3Var.c;
                        int[] iArr2 = fw3Var.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            fw3Var.invalidate();
                        }
                    }
                    gw3Var.getClass();
                    fw3 fw3Var2 = gw3Var.c;
                    int i8 = gw3Var.e;
                    if (qq2.a(replace, null, null) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    gw3Var.d = z2;
                    int i9 = 3;
                    Drawable[] drawableArr = fw3Var2.b;
                    int[] iArr3 = fw3Var2.n;
                    fw3Var2.f = z2;
                    fw3Var2.e = replace;
                    int i10 = 5;
                    if (z2) {
                        drawableArr[0] = qq2.a(replace, -1, -1);
                        drawableArr[1] = qq2.a(fw3Var2.e, 0, -2);
                        drawableArr[2] = qq2.a(fw3Var2.e, 1, -2);
                        drawableArr[3] = qq2.a(fw3Var2.e, 2, -2);
                        drawableArr[4] = qq2.a(fw3Var2.e, 3, -2);
                        drawableArr[5] = qq2.a(fw3Var2.e, 4, -2);
                        drawableArr[6] = qq2.a(fw3Var2.e, -2, 0);
                        drawableArr[7] = qq2.a(fw3Var2.e, -2, 1);
                        drawableArr[8] = qq2.a(fw3Var2.e, -2, 2);
                        drawableArr[9] = qq2.a(fw3Var2.e, -2, 3);
                        drawableArr[10] = qq2.a(fw3Var2.e, -2, 4);
                        Pair c = qq2.c(replace);
                        if (c != null) {
                            int intValue = ((Integer) c.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                fw3Var2.invalidate();
                            }
                            int intValue2 = ((Integer) c.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                fw3Var2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            fw3Var2.H = z3;
                        }
                        fw3Var2.J = true;
                    } else {
                        for (int i11 = 0; i11 < 6; i11++) {
                            if (i11 != 0) {
                                str3 = t14.c(replace, (String) qq2.a.get(i11 - 1));
                            } else {
                                str3 = replace;
                            }
                            drawableArr[i11] = vu3.f(str3);
                        }
                    }
                    fw3Var2.invalidate();
                    int i12 = i8 * 6;
                    if (gw3Var.d) {
                        i2 = 3;
                    } else {
                        i2 = 0;
                    }
                    gw3Var.setWidth(gl.L(i2 + 30) + i12);
                    float f3 = 15.0f;
                    if (gw3Var.d) {
                        f = 11.66f;
                    } else {
                        f = 15.0f;
                    }
                    int L = gl.L(f);
                    if (gw3Var.d) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    gw3Var.setHeight((i3 * i8) + L);
                    int i13 = i8 * 6;
                    if (!gw3Var.d) {
                        i9 = 0;
                    }
                    int L2 = gl.L(i9 + 30) + i13;
                    if (gw3Var.d) {
                        f3 = 11.66f;
                    }
                    int L3 = gl.L(f3);
                    if (gw3Var.d) {
                        i4 = 2;
                    } else {
                        i4 = 1;
                    }
                    int i14 = (i4 * i8) + L3;
                    c14Var.getLocationOnScreen(iArr);
                    if (!gw3Var.d) {
                        int i15 = fw3Var2.n[0];
                        int i16 = i15 * i7;
                        int i17 = i15 << 2;
                        if (!gl.O1()) {
                            i10 = 1;
                        }
                        i5 = gl.L(i17 - i10) + i16;
                    } else {
                        i5 = 0;
                    }
                    if (iArr[0] - i5 < gl.L(5.0f)) {
                        i5 = b00.z(5.0f, iArr[0] - i5, i5);
                    } else {
                        int i18 = (iArr[0] - i5) + L2;
                        Point point = gl.q;
                        if (i18 > point.x - gl.L(5.0f)) {
                            i5 += ((iArr[0] - i5) + L2) - (point.x - gl.L(5.0f));
                        }
                    }
                    int i19 = -i5;
                    if (c14Var.getTop() < 0) {
                        i6 = c14Var.getTop();
                    } else {
                        i6 = 0;
                    }
                    if (gl.O1()) {
                        f2 = 30.0f;
                    } else {
                        f2 = 22.0f;
                    }
                    fw3Var2.setArrowX((gl.L(f2) - i19) + ((int) gl.N(0.5f)));
                    gw3Var.setFocusable(true);
                    gw3Var.showAsDropDown(view, i19, (((view.getMeasuredHeight() - i7) / 2) + ((-view.getMeasuredHeight()) - i14)) - i6);
                    t14Var.h.requestDisallowInterceptTouchEvent(true);
                    g04Var.e1(true);
                    g04Var.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void j(int i) {
        t14 t14Var = this.b;
        cq3 cq3Var = t14Var.k2;
        if (Build.VERSION.SDK_INT >= 31 && cq3Var != null) {
            if (fod.a(i, 4)) {
                cq3Var.h(t14Var.n2.e());
            }
            cq3Var.e(t14Var.l2, t14Var.getWidth(), t14Var.getHeight());
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        this.b.S();
    }

    @Override
    public final void D(float f, int i) {
    }
}
