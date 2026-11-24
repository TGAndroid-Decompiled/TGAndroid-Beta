package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
public final class dp8 implements gx4, jl0, rw4 {
    public final cp8 a;
    public final Paint b = new Paint(1);
    public final Paint c = new Paint();
    public RadialGradient d;
    public int e;
    public float f;
    public final ep8 h;

    public dp8(ep8 ep8Var, cp8 cp8Var) {
        this.h = ep8Var;
        this.a = cp8Var;
    }

    @Override
    public final int a() {
        return j().a();
    }

    @Override
    public final il0 b() {
        return new il0(this, this, this);
    }

    @Override
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        float f3;
        float f4;
        int i2;
        Canvas canvas2;
        RectF rectF2;
        cp8 cp8Var;
        ep8 ep8Var = this.h;
        cp8 cp8Var2 = this.a;
        if (cp8Var2 != null) {
            f3 = ep8Var.l;
        } else {
            f3 = 0.0f;
        }
        int i3 = (f3 > 1.0f ? 1 : (f3 == 1.0f ? 0 : -1));
        if (i3 < 0) {
            dw4 dw4Var = ep8Var.b;
            if (dw4Var == null) {
                dw4Var = null;
            }
            dw4Var.d(f, f2, i, canvas, rectF);
            i2 = i;
            canvas2 = canvas;
            rectF2 = rectF;
            float f5 = 1.0f - ep8Var.k;
            if (f5 > 0.0f) {
                canvas2.save();
                float f6 = 1.0f / i2;
                canvas2.scale(f6, f6);
                f4 = f;
                canvas2.translate(-f4, -f2);
                i(canvas2, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, f5, i2 << 1);
                canvas2.restore();
            } else {
                f4 = f;
            }
        } else {
            f4 = f;
            i2 = i;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        if (f3 > 0.0f) {
            if (i3 < 0) {
                canvas2.saveLayerAlpha(null, (int) (f3 * 255.0f));
            }
            if (ug8.A(cp8Var2)) {
                cp8Var = cp8Var2;
            } else {
                cp8Var = null;
            }
            cp8Var.d(f4, f2, i2, canvas2, rectF2);
            if (i3 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        float f5;
        cp8 cp8Var = this.a;
        ep8 ep8Var = this.h;
        if (cp8Var != null) {
            f5 = ep8Var.l;
        } else {
            f5 = 0.0f;
        }
        int i = (f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1));
        if (i < 0) {
            if (ep8Var.b != null && canvas.isHardwareAccelerated()) {
                ep8Var.b.e(f, f2, f3, f4, canvas);
            } else {
                float f6 = ep8Var.k;
                if (f6 > 0.0f) {
                    int p1 = bkb.p1(f6 * 0.5f, -16777216);
                    Paint paint = this.c;
                    paint.setColor(p1);
                    canvas.drawRect(f, f2, f3, f4, paint);
                }
            }
            float f7 = 1.0f - ep8Var.k;
            if (f7 > 0.0f) {
                i(canvas, f, f2, f3, f4, f7, 0.0f);
            }
        }
        if (f5 > 0.0f) {
            if (i < 0) {
                canvas.saveLayerAlpha(f, f2, f3, f4, (int) (f5 * 255.0f));
            }
            this.a.e(f, f2, f3, f4, canvas);
            if (i < 0) {
                canvas.restore();
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
        dw4 dw4Var = this.h.b;
        cp8 cp8Var = null;
        if (dw4Var == null) {
            dw4Var = null;
        }
        cp8 cp8Var2 = this.a;
        if (ug8.A(cp8Var2)) {
            cp8Var = cp8Var2;
        }
        if (dw4Var != null && dw4Var.f() > 1) {
            if (cp8Var2 == null || (cp8Var != null && cp8Var.h())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        ep8 ep8Var = this.h;
        boolean z = ep8Var.j;
        Paint paint = this.b;
        if (z) {
            float f7 = f3 - f;
            float max = Math.max(1.0f, 0.65f * f7);
            if (this.d == null || this.e != ep8Var.i || this.f != max) {
                this.e = ep8Var.i;
                this.f = max;
                this.d = new RadialGradient(0.0f, 0.0f, max, bkb.p1(0.8f, ep8Var.i), ep8Var.i, Shader.TileMode.CLAMP);
            }
            canvas.save();
            canvas.translate((f + f3) / 2.0f, (f2 + f4) / 2.0f);
            paint.setShader(this.d);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f5));
            canvas.drawRect(((f - f3) / 2.0f) - f6, ((f2 - f4) / 2.0f) - f6, (f7 / 2.0f) + f6, oo1.z(f4, f2, 2.0f, f6), paint);
            canvas.restore();
            return;
        }
        paint.setShader(null);
        paint.setColor(bkb.p1(f5, ep8Var.i));
        canvas.drawRect(f - f6, f2 - f6, f3 + f6, f4 + f6, paint);
    }

    public final rw4 j() {
        dw4 dw4Var = this.h.b;
        cp8 cp8Var = null;
        if (dw4Var == null) {
            dw4Var = null;
        }
        cp8 cp8Var2 = this.a;
        if (ug8.A(cp8Var2)) {
            cp8Var = cp8Var2;
        }
        if (cp8Var != null && dw4Var.f() >= cp8Var.f()) {
            return cp8Var;
        }
        return dw4Var;
    }

    @Override
    public final void c(il0 il0Var) {
    }
}
