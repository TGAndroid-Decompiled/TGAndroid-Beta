package defpackage;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
public final class wz3 implements oy4, h59, et9, g94 {
    public final byte a;
    public final e34 b;

    public wz3(e34 e34Var, byte b) {
        this.a = b;
        this.b = e34Var;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        this.b.R();
    }

    @Override
    public final void a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        r24 r24Var;
        byte b = this.a;
        e34 e34Var = this.b;
        switch (b) {
            case 2:
                k24 k24Var = e34Var.j0;
                int i7 = e34Var.d1;
                j24 j24Var = e34Var.o0;
                m24 m24Var = e34Var.l0;
                if (i != e34Var.t0 || !j24Var.y.isEmpty()) {
                    e34Var.i0.D0();
                    e34Var.q0.k(i, 0);
                    if (i != e34Var.s0 && i != e34Var.t0) {
                        ArrayList arrayList = oc7.r1(i7).x3;
                        e34Var.k0.H((String) arrayList.get(i - e34Var.u0));
                        int i8 = i - e34Var.u0;
                        if (i8 > 0) {
                            m24Var.a((String) arrayList.get(i8 - 1), true);
                        }
                        if (i - e34Var.u0 < arrayList.size() - 1) {
                            m24Var.a((String) arrayList.get((i - e34Var.u0) + 1), true);
                        }
                    } else {
                        e34Var.p0.d.setText("");
                        if (i == e34Var.t0 && (i3 = j24Var.J) >= 1) {
                            k24Var.g1(i3, -gm.L(4.0f));
                        } else {
                            f24 f24Var = e34Var.u1;
                            if (f24Var != null && f24Var.A()) {
                                i2 = 0;
                            } else {
                                i2 = 1;
                            }
                            k24Var.g1(i2, 0);
                        }
                        if (i == e34Var.t0) {
                            ArrayList arrayList2 = oc7.r1(i7).x3;
                            if (!arrayList2.isEmpty()) {
                                m24Var.a((String) arrayList2.get(0), true);
                            }
                        }
                    }
                    e34Var.C(2);
                    return;
                }
                return;
            default:
                p04 p04Var = e34Var.H0;
                ArrayList arrayList3 = e34Var.e1;
                q04 q04Var = e34Var.C0;
                w24 w24Var = e34Var.z0;
                l04 l04Var = e34Var.E0;
                if (!e34Var.T0) {
                    if (i == e34Var.I1) {
                        e34Var.u1.g(new d4c(e34Var.getContext(), new y04(e34Var), e34Var.y1, e34Var.z1, e34Var.A1, null, e34Var.a2));
                        return;
                    }
                    if (p04Var != null && (r24Var = p04Var.r) != null && r24Var.getSelectedCategory() != null) {
                        p04Var.b(null, false);
                        r24Var.I1(null);
                    }
                    if (i == e34Var.G1) {
                        l04Var.D0();
                        e34Var.F(w24Var.E("recent"), 0);
                        e34Var.C(0);
                        int i9 = e34Var.G1;
                        if (i9 > 0) {
                            i6 = i9;
                        } else {
                            i6 = e34Var.F1;
                        }
                        q04Var.k(i9, i6);
                        return;
                    } else if (i == e34Var.H1) {
                        l04Var.D0();
                        e34Var.F(w24Var.E("fav"), 0);
                        e34Var.C(0);
                        int i10 = e34Var.H1;
                        if (i10 > 0) {
                            i5 = i10;
                        } else {
                            i5 = e34Var.F1;
                        }
                        q04Var.k(i10, i5);
                        return;
                    } else if (i == e34Var.J1) {
                        l04Var.D0();
                        e34Var.F(w24Var.E("premium"), 0);
                        e34Var.C(0);
                        int i11 = e34Var.J1;
                        if (i11 > 0) {
                            i4 = i11;
                        } else {
                            i4 = e34Var.F1;
                        }
                        q04Var.k(i11, i4);
                        return;
                    } else {
                        int i12 = i - e34Var.F1;
                        if (i12 < arrayList3.size()) {
                            if (i12 >= arrayList3.size()) {
                                i12 = arrayList3.size() - 1;
                            }
                            e34Var.J0 = false;
                            l04Var.D0();
                            e34Var.F(w24Var.E(arrayList3.get(i12)), 0);
                            e34Var.C(0);
                            e34Var.m(0);
                            int i13 = e34Var.H1;
                            if (i13 <= 0 && (i13 = e34Var.G1) <= 0) {
                                i13 = e34Var.F1;
                            }
                            q04Var.k(i, i13);
                            e34Var.Y1 = false;
                            e34Var.Z();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final boolean g(int i, View view) {
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
        e34 e34Var = this.b;
        int i7 = e34Var.D1;
        int[] iArr = e34Var.E1;
        r14 r14Var = e34Var.Q;
        rx3 rx3Var = e34Var.C1;
        if (view instanceof n24) {
            n24 n24Var = (n24) view;
            u69 u69Var = null;
            if (n24Var.c) {
                View F = r14Var.F(view);
                if (F != null) {
                    u69Var = r14Var.T(F);
                }
                if (u69Var != null && u69Var.b() <= e34Var.getRecentEmoji().size()) {
                    e34Var.u1.n();
                }
                r14Var.A1(view);
                return true;
            } else if (n24Var.getSpan() == null && (str = (String) n24Var.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!n24Var.c) {
                    str2 = (String) gw3.j.get(replace);
                } else {
                    str2 = null;
                }
                if (bs2.a(replace, null, null) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || zx3.l.contains(replace)) {
                    e34Var.S1 = n24Var;
                    e34Var.V1 = e34Var.T1;
                    e34Var.W1 = e34Var.U1;
                    if (z) {
                        replace = e34.c(replace, str2);
                    } else {
                        int indexOf = bs2.a.indexOf(str2) + 1;
                        qx3 qx3Var = rx3Var.c;
                        int[] iArr2 = qx3Var.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            qx3Var.invalidate();
                        }
                    }
                    rx3Var.getClass();
                    qx3 qx3Var2 = rx3Var.c;
                    int i8 = rx3Var.e;
                    if (bs2.a(replace, null, null) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    rx3Var.d = z2;
                    int i9 = 3;
                    Drawable[] drawableArr = qx3Var2.b;
                    int[] iArr3 = qx3Var2.n;
                    qx3Var2.f = z2;
                    qx3Var2.e = replace;
                    int i10 = 5;
                    if (z2) {
                        drawableArr[0] = bs2.a(replace, -1, -1);
                        drawableArr[1] = bs2.a(qx3Var2.e, 0, -2);
                        drawableArr[2] = bs2.a(qx3Var2.e, 1, -2);
                        drawableArr[3] = bs2.a(qx3Var2.e, 2, -2);
                        drawableArr[4] = bs2.a(qx3Var2.e, 3, -2);
                        drawableArr[5] = bs2.a(qx3Var2.e, 4, -2);
                        drawableArr[6] = bs2.a(qx3Var2.e, -2, 0);
                        drawableArr[7] = bs2.a(qx3Var2.e, -2, 1);
                        drawableArr[8] = bs2.a(qx3Var2.e, -2, 2);
                        drawableArr[9] = bs2.a(qx3Var2.e, -2, 3);
                        drawableArr[10] = bs2.a(qx3Var2.e, -2, 4);
                        Pair c = bs2.c(replace);
                        if (c != null) {
                            int intValue = ((Integer) c.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                qx3Var2.invalidate();
                            }
                            int intValue2 = ((Integer) c.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                qx3Var2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            qx3Var2.H = z3;
                        }
                        qx3Var2.J = true;
                    } else {
                        for (int i11 = 0; i11 < 6; i11++) {
                            if (i11 != 0) {
                                str3 = e34.c(replace, (String) bs2.a.get(i11 - 1));
                            } else {
                                str3 = replace;
                            }
                            drawableArr[i11] = gw3.f(str3);
                        }
                    }
                    qx3Var2.invalidate();
                    int i12 = i8 * 6;
                    if (rx3Var.d) {
                        i2 = 3;
                    } else {
                        i2 = 0;
                    }
                    rx3Var.setWidth(gm.L(i2 + 30) + i12);
                    float f3 = 15.0f;
                    if (rx3Var.d) {
                        f = 11.66f;
                    } else {
                        f = 15.0f;
                    }
                    int L = gm.L(f);
                    if (rx3Var.d) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    rx3Var.setHeight((i3 * i8) + L);
                    int i13 = i8 * 6;
                    if (!rx3Var.d) {
                        i9 = 0;
                    }
                    int L2 = gm.L(i9 + 30) + i13;
                    if (rx3Var.d) {
                        f3 = 11.66f;
                    }
                    int L3 = gm.L(f3);
                    if (rx3Var.d) {
                        i4 = 2;
                    } else {
                        i4 = 1;
                    }
                    int i14 = (i4 * i8) + L3;
                    n24Var.getLocationOnScreen(iArr);
                    if (!rx3Var.d) {
                        int i15 = qx3Var2.n[0];
                        int i16 = i15 * i7;
                        int i17 = i15 << 2;
                        if (!gm.O1()) {
                            i10 = 1;
                        }
                        i5 = gm.L(i17 - i10) + i16;
                    } else {
                        i5 = 0;
                    }
                    if (iArr[0] - i5 < gm.L(5.0f)) {
                        i5 = b10.z(5.0f, iArr[0] - i5, i5);
                    } else {
                        int i18 = (iArr[0] - i5) + L2;
                        Point point = gm.q;
                        if (i18 > point.x - gm.L(5.0f)) {
                            i5 += ((iArr[0] - i5) + L2) - (point.x - gm.L(5.0f));
                        }
                    }
                    int i19 = -i5;
                    if (n24Var.getTop() < 0) {
                        i6 = n24Var.getTop();
                    } else {
                        i6 = 0;
                    }
                    if (gm.O1()) {
                        f2 = 30.0f;
                    } else {
                        f2 = 22.0f;
                    }
                    qx3Var2.setArrowX((gm.L(f2) - i19) + ((int) gm.N(0.5f)));
                    rx3Var.setFocusable(true);
                    rx3Var.showAsDropDown(view, i19, (((view.getMeasuredHeight() - i7) / 2) + ((-view.getMeasuredHeight()) - i14)) - i6);
                    e34Var.h.requestDisallowInterceptTouchEvent(true);
                    r14Var.e1(true);
                    r14Var.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void s(int i) {
        e34 e34Var = this.b;
        mr3 mr3Var = e34Var.k2;
        if (Build.VERSION.SDK_INT >= 31 && mr3Var != null) {
            if (iqd.a(i, 4)) {
                mr3Var.h(e34Var.n2.e());
            }
            mr3Var.e(e34Var.l2, e34Var.getWidth(), e34Var.getHeight());
        }
    }

    @Override
    public final void V(float f, int i) {
    }
}
