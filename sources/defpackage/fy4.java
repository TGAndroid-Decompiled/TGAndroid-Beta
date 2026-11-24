package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class fy4 implements iz4, ty4 {
    public final int a;
    public final gy4 b;

    public fy4(gy4 gy4Var, int i) {
        this.b = gy4Var;
        this.a = i;
    }

    @Override
    public final int a() {
        boolean c = td4.c(this.a);
        gy4 gy4Var = this.b;
        if (c) {
            return gy4Var.s;
        }
        return gy4Var.q;
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
        boolean c = td4.c(this.a);
        gy4 gy4Var = this.b;
        if (c) {
            return gy4Var.n;
        }
        return gy4Var.m;
    }

    @Override
    public final int g() {
        boolean c = td4.c(this.a);
        gy4 gy4Var = this.b;
        if (c) {
            return gy4Var.r;
        }
        return gy4Var.p;
    }

    @Override
    public final boolean h() {
        return true;
    }
}
