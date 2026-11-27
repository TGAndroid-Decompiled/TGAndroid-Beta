package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
public final class os8 implements mz4, wy4 {
    public final ll0 a;

    public os8(ll0 ll0Var) {
        this.a = ll0Var;
    }

    @Override
    public final int a() {
        return ((wy4) b()).a();
    }

    public final mz4 b() {
        lz4 f = vy4.f();
        boolean z = f.a;
        ll0 ll0Var = this.a;
        if (!z) {
            return ll0Var.c;
        }
        if (f.b && Build.VERSION.SDK_INT >= 33) {
            return ll0Var.a;
        }
        return ll0Var.b;
    }

    @Override
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        ((wy4) b()).d(f, f2, i, canvas, rectF);
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        b().e(f, f2, f3, f4, canvas);
    }

    @Override
    public final int f() {
        return ((wy4) b()).f();
    }

    @Override
    public final int g() {
        return ((wy4) b()).g();
    }

    @Override
    public final boolean h() {
        mz4 b = b();
        if ((b instanceof wy4) && ((wy4) b).h()) {
            return true;
        }
        return false;
    }
}
