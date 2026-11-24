package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
public final class ed0 extends Drawable {
    public final Paint a;
    public boolean b;
    public long c;
    public float d;
    public float e;
    public int f;
    public final boolean g;
    public final DecelerateInterpolator h;
    public int i;
    public int j;
    public float k;
    public short l;

    public ed0(boolean z) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.i = -1;
        this.j = -9079435;
        this.k = 300.0f;
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(gl.L(2.0f));
        paint2.setColor(-65536);
        this.g = z;
    }

    public final void a(int i) {
        this.i = i;
        invalidateSelf();
    }

    public final void b(int i) {
        this.j = i;
        invalidateSelf();
    }

    public final void c(boolean z, float f) {
        this.c = 0L;
        float f2 = this.e;
        if (f2 == 1.0f) {
            this.b = true;
        } else if (f2 == 0.0f) {
            this.b = false;
        }
        this.c = 0L;
        if (z) {
            int i = (f2 > f ? 1 : (f2 == f ? 0 : -1));
            float f3 = this.k;
            if (i < 0) {
                this.f = (int) (f2 * f3);
            } else {
                this.f = (int) ((1.0f - f2) * f3);
            }
            this.c = System.currentTimeMillis();
            this.d = f;
        } else {
            this.e = f;
            this.d = f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        if (this.e != this.d) {
            if (this.c != 0) {
                int currentTimeMillis = this.f + ((int) (System.currentTimeMillis() - this.c));
                this.f = currentTimeMillis;
                float f = currentTimeMillis;
                float f2 = this.k;
                if (f >= f2) {
                    this.e = this.d;
                } else {
                    int i3 = (this.e > this.d ? 1 : (this.e == this.d ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    float f3 = f / f2;
                    if (i3 < 0) {
                        this.e = decelerateInterpolator.getInterpolation(f3) * this.d;
                    } else {
                        this.e = 1.0f - decelerateInterpolator.getInterpolation(f3);
                    }
                }
            }
            this.c = System.currentTimeMillis();
            invalidateSelf();
        }
        int f4 = bm2.f(this.e, this.i, this.j);
        Paint paint = this.a;
        paint.setColor(f4);
        canvas.save();
        canvas.translate(gl.L(24.0f) / 2.0f, gl.L(24.0f) / 2.0f);
        short s = this.l;
        if (s != 0) {
            canvas.rotate(s);
        }
        float f5 = this.e;
        canvas.translate(-gl.L(0.66f), 0.0f);
        float f6 = this.e;
        boolean z = this.b;
        if (!this.g) {
            if (z) {
                i2 = -225;
            } else {
                i2 = 135;
            }
            canvas.rotate(f6 * i2);
        } else {
            if (z) {
                i = -180;
            } else {
                i = 180;
            }
            canvas.rotate((f6 * i) + 135.0f);
            f5 = 1.0f;
        }
        float f7 = 1.0f - f5;
        canvas.drawLine(gl.L(gl.R1(-6.75f, -8.0f, f5)), 0.0f, gl.L(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f7), 0.0f, paint);
        float L = gl.L(-0.25f);
        float L2 = gl.L(gl.R1(7.0f, 8.0f, f5)) - ((paint.getStrokeWidth() / 4.0f) * f7);
        float L3 = gl.L(gl.R1(-7.25f, 0.0f, f5));
        canvas.drawLine(L3, -L, 0.0f, -L2, paint);
        canvas.drawLine(L3, L, 0.0f, L2, paint);
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return gl.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gl.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
