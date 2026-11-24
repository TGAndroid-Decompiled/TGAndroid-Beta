package defpackage;
public final class u12 extends gb {
    public final v12 x;

    public u12(v12 v12Var, v12 v12Var2) {
        super(v12Var2);
        this.x = v12Var;
    }

    @Override
    public final boolean b() {
        e34 e34Var;
        i22 i22Var = this.x.r0;
        if ((!i22Var.J || i22Var.r2) && i22Var.p3) {
            a22 a22Var = i22Var.v2;
            if (a22Var == i22Var.g2 || a22Var == i22Var.h2 || i22Var.U0().m()) {
                a22 a22Var2 = i22Var.v2;
                v72 v72Var = i22Var.g2;
                if (a22Var2 != v72Var || ((e34Var = v72Var.F) != null && e34Var.getVisibility() == 0)) {
                    a22 a22Var3 = i22Var.v2;
                    v72 v72Var2 = i22Var.h2;
                    if (a22Var3 == v72Var2) {
                        e34 e34Var2 = v72Var2.F;
                        if (e34Var2 != null && e34Var2.getVisibility() == 0) {
                            return false;
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void e(float f, float f2, boolean z) {
        float f3;
        v12 v12Var = this.x;
        i22 i22Var = v12Var.r0;
        i22Var.i4 = f;
        float f4 = i22Var.a4;
        float f5 = 0.0f;
        if (f4 > 0.0f) {
            if (i22Var.v2 == i22Var.q2 && !z) {
                f3 = f2;
            } else {
                f3 = 1.0f - f2;
            }
            f = td4.A(f4, i22Var.b4, f3, f);
            i22Var.i4 = f;
        }
        i22Var.U2.setTranslationY(f);
        i22Var.X2.setTranslationY(i22Var.i4);
        r7 r7Var = i22Var.b3;
        if (r7Var != null) {
            r7Var.setTranslationY(i22Var.i4);
        }
        r7 r7Var2 = i22Var.Z2;
        if (r7Var2 != null) {
            r7Var2.setTranslationY(i22Var.X2.getTranslationY());
        }
        hg5 hg5Var = i22Var.a3;
        if (hg5Var != null) {
            hg5Var.setTranslationY(i22Var.X2.getTranslationY());
        }
        i22Var.c3.setTranslationY(i22Var.i4);
        i22Var.K1(0);
        if (i22Var.v2 != i22Var.q2) {
            f5 = i22Var.i4;
        }
        i22Var.F0 = f5;
        i22Var.c.invalidate();
        v12Var.invalidate();
        i22Var.A2.invalidate();
        i22Var.E1();
        a22 a22Var = i22Var.v2;
        if (a22Var != null) {
            a22Var.n(i22Var.i4, f2);
        }
    }

    @Override
    public final void f() {
        int i;
        i22 i22Var = this.x.r0;
        i22Var.H1(i22Var.v2, 0);
        i22Var.Z3 = i22Var.Y3[0];
        i22Var.v2.y();
        if ((i22Var.v2 instanceof e32) && !i22Var.A3) {
            if (i22Var.d) {
                i = gm.L(84.0f);
            } else {
                i = 0;
            }
            for (int i2 = 0; i2 < i22Var.u2.size(); i2++) {
                ((e32) i22Var.u2.valueAt(i2)).setMeasureOffsetY(i);
            }
        }
    }

    @Override
    public final void g(int i, boolean z) {
        int i2;
        v12 v12Var = this.x;
        i22 i22Var = v12Var.r0;
        int i3 = i22Var.Z3;
        if (i3 > 0 && i3 != (i2 = i22Var.Y3[0]) && (z || i22Var.v2 == i22Var.q2)) {
            i22Var.a4 = i3;
            i22Var.b4 = i2;
        } else {
            i22Var.a4 = -1.0f;
        }
        v12Var.invalidate();
        if ((i22Var.v2 instanceof e32) && !i22Var.A3) {
            h12 h12Var = i22Var.u3;
            if (z) {
                h12Var.setVisibility(8);
            } else {
                h12Var.setVisibility(0);
            }
        }
        i22Var.v2.z(i, z);
    }
}
