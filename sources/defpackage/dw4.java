package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class dw4 implements gx4, rw4 {
    public final int a;
    public final ew4 b;

    public dw4(ew4 ew4Var, int i) {
        this.b = ew4Var;
        this.a = i;
    }

    @Override
    public final int a() {
        boolean c = tb4.c(this.a);
        ew4 ew4Var = this.b;
        if (c) {
            return ew4Var.s;
        }
        return ew4Var.q;
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
        boolean c = tb4.c(this.a);
        ew4 ew4Var = this.b;
        if (c) {
            return ew4Var.n;
        }
        return ew4Var.m;
    }

    @Override
    public final int g() {
        boolean c = tb4.c(this.a);
        ew4 ew4Var = this.b;
        if (c) {
            return ew4Var.r;
        }
        return ew4Var.p;
    }

    @Override
    public final boolean h() {
        return true;
    }
}
