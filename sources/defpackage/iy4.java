package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class iy4 implements mz4, wy4 {
    public final int a;
    public final jy4 b;

    public iy4(jy4 jy4Var, int i) {
        this.b = jy4Var;
        this.a = i;
    }

    @Override
    public final int a() {
        boolean c = qd4.c(this.a);
        jy4 jy4Var = this.b;
        if (c) {
            return jy4Var.s;
        }
        return jy4Var.q;
    }

    @Override
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        this.b.b(this.a, canvas, rectF, i, f, f2);
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        this.b.c(canvas, this.a, f, f2, f3, f4);
    }

    @Override
    public final int f() {
        boolean c = qd4.c(this.a);
        jy4 jy4Var = this.b;
        if (c) {
            return jy4Var.n;
        }
        return jy4Var.m;
    }

    @Override
    public final int g() {
        boolean c = qd4.c(this.a);
        jy4 jy4Var = this.b;
        if (c) {
            return jy4Var.r;
        }
        return jy4Var.p;
    }

    @Override
    public final boolean h() {
        return true;
    }
}
