package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
public final class dr8 implements iz4, ty4 {
    public final km0 a;

    public dr8(km0 km0Var) {
        this.a = km0Var;
    }

    @Override
    public final int a() {
        return ((ty4) b()).a();
    }

    public final iz4 b() {
        hz4 f = sy4.f();
        boolean z = f.a;
        km0 km0Var = this.a;
        if (!z) {
            return km0Var.c;
        }
        if (f.b && Build.VERSION.SDK_INT >= 33) {
            return km0Var.a;
        }
        return km0Var.b;
    }

    @Override
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        ((ty4) b()).d(f, f2, i, canvas, rectF);
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        b().e(f, f2, f3, f4, canvas);
    }

    @Override
    public final int f() {
        return ((ty4) b()).f();
    }

    @Override
    public final int g() {
        return ((ty4) b()).g();
    }

    @Override
    public final boolean h() {
        iz4 b = b();
        if ((b instanceof ty4) && ((ty4) b).h()) {
            return true;
        }
        return false;
    }
}
