package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
public final class fn0 implements g94 {
    public final int a;
    public final g94 b;
    public final Interpolator c;
    public final short d;
    public float e;
    public boolean f;
    public h94 h;

    public fn0(int i, g94 g94Var, Interpolator interpolator, long j, boolean z) {
        float f;
        this.a = i;
        this.b = g94Var;
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
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (this.e != f) {
            this.e = f;
            this.b.D(this.a, f, -1.0f, null);
        }
    }

    @Override
    public final void V(float f, int i) {
        this.b.V(f, this.a);
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
            h94 h94Var = this.h;
            if (z2) {
                if (h94Var == null) {
                    float f2 = this.e;
                    h94 h94Var2 = new h94(0, this, this.c, this.d, f2);
                    this.h = h94Var2;
                    h94Var = h94Var2;
                }
                h94Var.a(f);
                return;
            }
            if (h94Var != null) {
                h94Var.c(f);
            }
            float f3 = this.e;
            if (f3 != f) {
                int i = (f3 > f ? 1 : (f3 == f ? 0 : -1));
                int i2 = this.a;
                g94 g94Var = this.b;
                if (i != 0) {
                    this.e = f;
                    g94Var.D(i2, f, -1.0f, null);
                }
                g94Var.V(f, i2);
            }
        }
    }

    public fn0(int i, g94 g94Var, d53 d53Var, long j) {
        this(i, g94Var, d53Var, j, false);
    }

    public fn0(long j, View view, Interpolator interpolator) {
        this(0, new en0(view), interpolator, j, false);
    }
}
