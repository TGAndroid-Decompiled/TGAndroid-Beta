package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
public final class er8 implements iz4, jm0, ty4 {
    public final dr8 a;
    public final Paint b = new Paint(1);
    public final Paint c = new Paint();
    public RadialGradient d;
    public int e;
    public float f;
    public final fr8 h;

    public er8(fr8 fr8Var, dr8 dr8Var) {
        this.h = fr8Var;
        this.a = dr8Var;
    }

    @Override
    public final int a() {
        return j().a();
    }

    @Override
    public final im0 b() {
        return new im0(this, this, this);
    }

    @Override
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        float f3;
        float f4;
        int i2;
        Canvas canvas2;
        RectF rectF2;
        dr8 dr8Var;
        fr8 fr8Var = this.h;
        dr8 dr8Var2 = this.a;
        if (dr8Var2 != null) {
            f3 = fr8Var.l;
        } else {
            f3 = 0.0f;
        }
        int i3 = (f3 > 1.0f ? 1 : (f3 == 1.0f ? 0 : -1));
        if (i3 < 0) {
            fy4 fy4Var = fr8Var.b;
            if (fy4Var == null) {
                fy4Var = null;
            }
            fy4Var.d(f, f2, i, canvas, rectF);
            i2 = i;
            canvas2 = canvas;
            rectF2 = rectF;
            float f5 = 1.0f - fr8Var.k;
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
            if (wi8.A(dr8Var2)) {
                dr8Var = dr8Var2;
            } else {
                dr8Var = null;
            }
            dr8Var.d(f4, f2, i2, canvas2, rectF2);
            if (i3 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        float f5;
        dr8 dr8Var = this.a;
        fr8 fr8Var = this.h;
        if (dr8Var != null) {
            f5 = fr8Var.l;
        } else {
            f5 = 0.0f;
        }
        int i = (f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1));
        if (i < 0) {
            if (fr8Var.b != null && canvas.isHardwareAccelerated()) {
                fr8Var.b.e(f, f2, f3, f4, canvas);
            } else {
                float f6 = fr8Var.k;
                if (f6 > 0.0f) {
                    int p1 = cmb.p1(f6 * 0.5f, -16777216);
                    Paint paint = this.c;
                    paint.setColor(p1);
                    canvas.drawRect(f, f2, f3, f4, paint);
                }
            }
            float f7 = 1.0f - fr8Var.k;
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
        fy4 fy4Var = this.h.b;
        dr8 dr8Var = null;
        if (fy4Var == null) {
            fy4Var = null;
        }
        dr8 dr8Var2 = this.a;
        if (wi8.A(dr8Var2)) {
            dr8Var = dr8Var2;
        }
        if (fy4Var != null && fy4Var.f() > 1) {
            if (dr8Var2 == null || (dr8Var != null && dr8Var.h())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        fr8 fr8Var = this.h;
        boolean z = fr8Var.j;
        Paint paint = this.b;
        if (z) {
            float f7 = f3 - f;
            float max = Math.max(1.0f, 0.65f * f7);
            if (this.d == null || this.e != fr8Var.i || this.f != max) {
                this.e = fr8Var.i;
                this.f = max;
                this.d = new RadialGradient(0.0f, 0.0f, max, cmb.p1(0.8f, fr8Var.i), fr8Var.i, Shader.TileMode.CLAMP);
            }
            canvas.save();
            canvas.translate((f + f3) / 2.0f, (f2 + f4) / 2.0f);
            paint.setShader(this.d);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f5));
            canvas.drawRect(((f - f3) / 2.0f) - f6, ((f2 - f4) / 2.0f) - f6, (f7 / 2.0f) + f6, aq1.z(f4, f2, 2.0f, f6), paint);
            canvas.restore();
            return;
        }
        paint.setShader(null);
        paint.setColor(cmb.p1(f5, fr8Var.i));
        canvas.drawRect(f - f6, f2 - f6, f3 + f6, f4 + f6, paint);
    }

    public final ty4 j() {
        fy4 fy4Var = this.h.b;
        dr8 dr8Var = null;
        if (fy4Var == null) {
            fy4Var = null;
        }
        dr8 dr8Var2 = this.a;
        if (wi8.A(dr8Var2)) {
            dr8Var = dr8Var2;
        }
        if (dr8Var != null && fy4Var.f() >= dr8Var.f()) {
            return dr8Var;
        }
        return fy4Var;
    }

    @Override
    public final void c(im0 im0Var) {
    }
}
