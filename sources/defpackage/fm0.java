package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
public final class fm0 implements x74 {
    public final int a;
    public final x74 b;
    public final Interpolator c;
    public final short d;
    public float e;
    public boolean f;
    public y74 h;

    public fm0(int i, x74 x74Var, Interpolator interpolator, long j, boolean z) {
        float f;
        this.a = i;
        this.b = x74Var;
        this.c = interpolator;
        this.d = (int) j;
        this.f = z;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.e = f;
    }

    @Override
    public final void F(float f, int i) {
        this.b.F(f, this.a);
    }

    public final void a(boolean z, boolean z2) {
        float f;
        if (this.f != z || !z2) {
            this.f = z;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            y74 y74Var = this.h;
            if (z2) {
                if (y74Var == null) {
                    float f2 = this.e;
                    y74 y74Var2 = new y74(0, this, this.c, this.d, f2);
                    this.h = y74Var2;
                    y74Var = y74Var2;
                }
                y74Var.a(f);
                return;
            }
            if (y74Var != null) {
                y74Var.c(f);
            }
            float f3 = this.e;
            if (f3 != f) {
                int i = (f3 > f ? 1 : (f3 == f ? 0 : -1));
                int i2 = this.a;
                x74 x74Var = this.b;
                if (i != 0) {
                    this.e = f;
                    x74Var.p(i2, f, -1.0f, null);
                }
                x74Var.F(f, i2);
            }
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (this.e != f) {
            this.e = f;
            this.b.p(this.a, f, -1.0f, null);
        }
    }

    public fm0(int i, x74 x74Var, s33 s33Var, long j) {
        this(i, x74Var, s33Var, j, false);
    }

    public fm0(long j, View view, Interpolator interpolator) {
        this(0, new em0(view), interpolator, j, false);
    }
}
