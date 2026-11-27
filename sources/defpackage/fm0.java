package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
public final class fm0 implements s84 {
    public final int a;
    public final s84 b;
    public Interpolator c;
    public long d;
    public float e;
    public boolean f;
    public t84 h;

    public fm0(int i, s84 s84Var, Interpolator interpolator, long j, boolean z) {
        float f;
        this.a = i;
        this.b = s84Var;
        this.c = interpolator;
        this.d = j;
        this.f = z;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.e = f;
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
            t84 t84Var = this.h;
            if (z2) {
                if (t84Var == null) {
                    t84 t84Var2 = new t84(0, this, this.c, this.d, this.e);
                    this.h = t84Var2;
                    t84Var = t84Var2;
                }
                t84Var.a(f);
                return;
            }
            if (t84Var != null) {
                t84Var.c(f);
            }
            float f2 = this.e;
            if (f2 != f) {
                int i = (f2 > f ? 1 : (f2 == f ? 0 : -1));
                int i2 = this.a;
                s84 s84Var = this.b;
                if (i != 0) {
                    this.e = f;
                    s84Var.t(i2, f, -1.0f, null);
                }
                s84Var.v0(f, i2);
            }
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (this.e != f) {
            this.e = f;
            this.b.t(this.a, f, -1.0f, null);
        }
    }

    @Override
    public final void v0(float f, int i) {
        this.b.v0(f, this.a);
    }

    public fm0(int i, s84 s84Var, k43 k43Var, long j) {
        this(i, s84Var, k43Var, j, false);
    }

    public fm0(long j, View view, Interpolator interpolator) {
        this(0, new em0(view), interpolator, j, false);
    }
}
