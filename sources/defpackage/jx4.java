package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.Iterator;
public final class jx4 implements gx4, jl0, rw4 {
    public final gx4 a;
    public final gx4 b;
    public final e59 c = new e59(0, false);
    public float d;

    public jx4(gx4 gx4Var, gx4 gx4Var2) {
        this.a = gx4Var;
        this.b = gx4Var2;
    }

    public static rw4 i(gx4 gx4Var) {
        if (gx4Var instanceof rw4) {
            rw4 rw4Var = (rw4) gx4Var;
            if (rw4Var.h()) {
                return rw4Var;
            }
        }
        return null;
    }

    @Override
    public final int a() {
        return j().a();
    }

    @Override
    public final il0 b() {
        il0 il0Var = new il0(this, this, this);
        c(il0Var);
        return il0Var;
    }

    @Override
    public final void c(il0 il0Var) {
        this.c.add(il0Var);
    }

    @Override
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        float f3;
        float f4;
        int i2;
        Canvas canvas2;
        RectF rectF2;
        if (this.d < 1.0f) {
            f3 = f;
            f4 = f2;
            i2 = i;
            canvas2 = canvas;
            rectF2 = rectF;
            i(this.a).d(f3, f4, i2, canvas2, rectF2);
        } else {
            f3 = f;
            f4 = f2;
            i2 = i;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        float f5 = this.d;
        if (f5 > 0.0f) {
            if (f5 < 1.0f) {
                canvas2.saveLayerAlpha(null, (int) (f5 * 255.0f));
            }
            RectF rectF3 = rectF2;
            Canvas canvas3 = canvas2;
            int i3 = i2;
            i(this.b).d(f3, f4, i3, canvas3, rectF3);
            if (this.d < 1.0f) {
                canvas3.restore();
            }
        }
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        float f5;
        float f6;
        float f7;
        float f8;
        Canvas canvas2;
        if (this.d < 1.0f) {
            this.a.e(f, f2, f3, f4, canvas);
            f5 = f;
            canvas2 = canvas;
            f8 = f4;
            f7 = f3;
            f6 = f2;
        } else {
            f5 = f;
            f6 = f2;
            f7 = f3;
            f8 = f4;
            canvas2 = canvas;
        }
        float f9 = this.d;
        if (f9 > 0.0f) {
            if (f9 < 1.0f) {
                canvas2.saveLayerAlpha(f5, f6, f7, f8, (int) (f9 * 255.0f));
            }
            Canvas canvas3 = canvas2;
            this.b.e(f5, f6, f7, f8, canvas3);
            if (this.d < 1.0f) {
                canvas3.restore();
            }
        }
    }

    @Override
    public final int f() {
        return j().f();
    }

    @Override
    public final int g() {
        return j().g();
    }

    @Override
    public final boolean h() {
        if (i(this.a) != null && i(this.b) != null) {
            return true;
        }
        return false;
    }

    public final rw4 j() {
        rw4 i = i(this.a);
        rw4 i2 = i(this.b);
        if (i.f() <= i2.f()) {
            return i;
        }
        return i2;
    }

    public final void k(float f) {
        if (this.d != f) {
            this.d = f;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                il0 il0Var = (il0) it.next();
                il0Var.updateColors();
                il0Var.invalidateSelf();
            }
        }
    }
}
