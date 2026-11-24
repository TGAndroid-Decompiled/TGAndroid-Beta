package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
public final class cp8 implements gx4, rw4 {
    public final kl0 a;

    public cp8(kl0 kl0Var) {
        this.a = kl0Var;
    }

    @Override
    public final int a() {
        return ((rw4) b()).a();
    }

    public final gx4 b() {
        fx4 f = qw4.f();
        boolean z = f.a;
        kl0 kl0Var = this.a;
        if (!z) {
            return kl0Var.c;
        }
        if (f.b && Build.VERSION.SDK_INT >= 33) {
            return kl0Var.a;
        }
        return kl0Var.b;
    }

    @Override
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        ((rw4) b()).d(f, f2, i, canvas, rectF);
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        b().e(f, f2, f3, f4, canvas);
    }

    @Override
    public final int f() {
        return ((rw4) b()).f();
    }

    @Override
    public final int g() {
        return ((rw4) b()).g();
    }

    @Override
    public final boolean h() {
        gx4 b = b();
        if ((b instanceof rw4) && ((rw4) b).h()) {
            return true;
        }
        return false;
    }
}
