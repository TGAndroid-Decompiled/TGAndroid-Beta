package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.Iterator;
public final class lz4 implements iz4, jm0, ty4 {
    public final iz4 a;
    public final iz4 b;
    public final g79 c = new g79(0, false);
    public float d;

    public lz4(iz4 iz4Var, iz4 iz4Var2) {
        this.a = iz4Var;
        this.b = iz4Var2;
    }

    public static ty4 i(iz4 iz4Var) {
        if (iz4Var instanceof ty4) {
            ty4 ty4Var = (ty4) iz4Var;
            if (ty4Var.h()) {
                return ty4Var;
            }
        }
        return null;
    }

    @Override
    public final int a() {
        return j().a();
    }

    @Override
    public final im0 b() {
        im0 im0Var = new im0(this, this, this);
        c(im0Var);
        return im0Var;
    }

    @Override
    public final void c(im0 im0Var) {
        this.c.add(im0Var);
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

    public final ty4 j() {
        ty4 i = i(this.a);
        ty4 i2 = i(this.b);
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
                im0 im0Var = (im0) it.next();
                im0Var.updateColors();
                im0Var.invalidateSelf();
            }
        }
    }
}
