package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
public final class ps8 implements mz4, kl0, wy4 {
    public final os8 a;
    public final Paint b = new Paint(1);
    public final Paint c = new Paint();
    public RadialGradient d;
    public int e;
    public float f;
    public final qs8 h;

    public ps8(qs8 qs8Var, os8 os8Var) {
        this.h = qs8Var;
        this.a = os8Var;
    }

    @Override
    public final int a() {
        return j().a();
    }

    @Override
    public final jl0 b() {
        return new jl0(this, this, this);
    }

    @Override
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        float f3;
        float f4;
        int i2;
        Canvas canvas2;
        RectF rectF2;
        os8 os8Var;
        qs8 qs8Var = this.h;
        os8 os8Var2 = this.a;
        if (os8Var2 != null) {
            f3 = qs8Var.l;
        } else {
            f3 = 0.0f;
        }
        int i3 = (f3 > 1.0f ? 1 : (f3 == 1.0f ? 0 : -1));
        if (i3 < 0) {
            iy4 iy4Var = qs8Var.b;
            if (iy4Var == null) {
                iy4Var = null;
            }
            iy4Var.d(f, f2, i, canvas, rectF);
            i2 = i;
            canvas2 = canvas;
            rectF2 = rectF;
            float f5 = 1.0f - qs8Var.k;
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
            if (ik8.A(os8Var2)) {
                os8Var = os8Var2;
            } else {
                os8Var = null;
            }
            os8Var.d(f4, f2, i2, canvas2, rectF2);
            if (i3 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        float f5;
        os8 os8Var = this.a;
        qs8 qs8Var = this.h;
        if (os8Var != null) {
            f5 = qs8Var.l;
        } else {
            f5 = 0.0f;
        }
        int i = (f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1));
        if (i < 0) {
            if (qs8Var.b != null && canvas.isHardwareAccelerated()) {
                qs8Var.b.e(f, f2, f3, f4, canvas);
            } else {
                float f6 = qs8Var.k;
                if (f6 > 0.0f) {
                    int p1 = aob.p1(f6 * 0.5f, -16777216);
                    Paint paint = this.c;
                    paint.setColor(p1);
                    canvas.drawRect(f, f2, f3, f4, paint);
                }
            }
            float f7 = 1.0f - qs8Var.k;
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
        iy4 iy4Var = this.h.b;
        os8 os8Var = null;
        if (iy4Var == null) {
            iy4Var = null;
        }
        os8 os8Var2 = this.a;
        if (ik8.A(os8Var2)) {
            os8Var = os8Var2;
        }
        if (iy4Var != null && iy4Var.f() > 1) {
            if (os8Var2 == null || (os8Var != null && os8Var.h())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        qs8 qs8Var = this.h;
        boolean z = qs8Var.j;
        Paint paint = this.b;
        if (z) {
            float f7 = f3 - f;
            float max = Math.max(1.0f, 0.65f * f7);
            if (this.d == null || this.e != qs8Var.i || this.f != max) {
                this.e = qs8Var.i;
                this.f = max;
                this.d = new RadialGradient(0.0f, 0.0f, max, aob.p1(0.8f, qs8Var.i), qs8Var.i, Shader.TileMode.CLAMP);
            }
            canvas.save();
            canvas.translate((f + f3) / 2.0f, (f2 + f4) / 2.0f);
            paint.setShader(this.d);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f5));
            canvas.drawRect(((f - f3) / 2.0f) - f6, ((f2 - f4) / 2.0f) - f6, (f7 / 2.0f) + f6, bp1.z(f4, f2, 2.0f, f6), paint);
            canvas.restore();
            return;
        }
        paint.setShader(null);
        paint.setColor(aob.p1(f5, qs8Var.i));
        canvas.drawRect(f - f6, f2 - f6, f3 + f6, f4 + f6, paint);
    }

    public final wy4 j() {
        iy4 iy4Var = this.h.b;
        os8 os8Var = null;
        if (iy4Var == null) {
            iy4Var = null;
        }
        os8 os8Var2 = this.a;
        if (ik8.A(os8Var2)) {
            os8Var = os8Var2;
        }
        if (os8Var != null && iy4Var.f() >= os8Var.f()) {
            return os8Var;
        }
        return iy4Var;
    }

    @Override
    public final void c(jl0 jl0Var) {
    }
}
