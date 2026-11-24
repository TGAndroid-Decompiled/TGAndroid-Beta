package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
public class a27 extends Drawable {
    public final Paint a;
    public final Paint b;
    public boolean c;
    public long d;
    public float e;
    public float f;
    public int g;
    public boolean h;
    public final DecelerateInterpolator i;
    public int j;
    public int k;
    public boolean l;
    public float m;
    public boolean n;
    public int o;

    public a27() {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.h = true;
        this.i = new DecelerateInterpolator();
        this.o = 255;
        paint.setStrokeWidth(gm.L(2.0f));
        paint2.setStrokeWidth(gm.p * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.m = 1.0f;
    }

    public final void a(boolean z, float f) {
        this.d = 0L;
        float f2 = this.f;
        if (f2 == 1.0f) {
            this.c = true;
        } else if (f2 == 0.0f) {
            this.c = false;
        }
        this.d = 0L;
        if (z) {
            if (f2 < f) {
                this.g = (int) (f2 * 200.0f);
            } else {
                this.g = (int) ((1.0f - f2) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.e = f;
        } else {
            this.f = f;
            this.e = f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        float abs;
        float L;
        float abs2;
        float abs3;
        int i2;
        float f;
        float f2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.d;
        long j2 = elapsedRealtime - j;
        float f3 = this.f;
        float f4 = this.e;
        if (f3 != f4) {
            if (j != 0) {
                int i3 = (int) (this.g + j2);
                this.g = i3;
                if (i3 >= 200) {
                    this.f = f4;
                } else {
                    int i4 = (f3 > f4 ? 1 : (f3 == f4 ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.i;
                    float f5 = i3 / 200.0f;
                    if (i4 < 0) {
                        this.f = decelerateInterpolator.getInterpolation(f5) * this.e;
                    } else {
                        this.f = 1.0f - decelerateInterpolator.getInterpolation(f5);
                    }
                }
            }
            invalidateSelf();
        }
        float f6 = this.m;
        if (f6 < 1.0f) {
            float f7 = (((float) j2) / 200.0f) + f6;
            this.m = f7;
            if (f7 > 1.0f) {
                this.m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((gm.L(24.0f) / 2) - gm.L(9.0f)) - (gm.L(1.0f) * this.f), gm.L(24.0f) / 2);
        int i5 = this.j;
        if (i5 == 0) {
            i5 = cmb.w0(null, cmb.u8, false);
        }
        int i6 = this.k;
        if (i6 == 0) {
            i6 = cmb.w0(null, cmb.r8, false);
        }
        boolean z = this.h;
        float f8 = this.f;
        boolean z2 = this.c;
        Paint paint = this.a;
        if (z) {
            if (z2) {
                i2 = -180;
            } else {
                i2 = 180;
            }
            canvas.rotate(f8 * i2, gm.L(9.0f), 0.0f);
            paint.setColor(i5);
            paint.setAlpha(this.o);
            if (this.l) {
                f = td4.A(1.0f, this.f, paint.getStrokeWidth() / 2.0f, gm.L(0.5f) * this.f);
            } else {
                f = 0.0f;
            }
            float L2 = (gm.L(18.0f) - (gm.L(3.0f) * this.f)) - 0.0f;
            if (this.l) {
                f2 = (1.0f - this.f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f2 = 0.0f;
            }
            canvas.drawLine(f, 0.0f, L2 - f2, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f)) * gm.L(5.0f)) - (Math.abs(this.f) * gm.L(0.5f));
            L = gm.L(18.0f) - (Math.abs(this.f) * gm.L(2.5f));
            abs2 = (Math.abs(this.f) * gm.L(2.0f)) + gm.L(5.0f);
            abs3 = Math.abs(this.f) * gm.L(7.5f);
            if (this.l) {
                abs3 = td4.A(1.0f, this.f, paint.getStrokeWidth() / 2.0f, abs3);
                float L3 = (gm.L(0.5f) * this.f) + abs;
                L -= ((1.0f - this.f) * (paint.getStrokeWidth() / 2.0f)) + (gm.L(0.5f) * this.f);
                abs2 -= gm.L(0.25f) * this.f;
                abs = (gm.L(0.25f) * this.f) + L3;
            }
        } else {
            if (z2) {
                i = -225;
            } else {
                i = 135;
            }
            canvas.rotate(f8 * i, gm.L(9.0f), 0.0f);
            if (this.n) {
                paint.setColor(i5);
                paint.setAlpha(this.o);
                canvas.drawLine((gm.L(1.0f) * this.f) + ((1.0f - Math.abs(this.f)) * gm.N(2.0f)), 0.0f, ((gm.L(17.0f) * this.f) + ((1.0f - this.f) * gm.N(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * gm.N(5.0f)) - (Math.abs(this.f) * gm.N(0.5f));
                L = (Math.abs(this.f) * gm.N(9.0f)) + ((1.0f - Math.abs(this.f)) * gm.N(16.0f));
                abs2 = (Math.abs(this.f) * gm.N(3.0f)) + gm.N(5.0f);
                abs3 = (Math.abs(this.f) * gm.N(7.0f)) + gm.N(2.0f);
            } else {
                int w0 = cmb.w0(null, cmb.x8, false);
                gm.R0(this.f, 1.0f, i6, cmb.w0(null, cmb.v8, false));
                paint.setColor(gm.R0(this.f, 1.0f, i5, w0));
                paint.setAlpha(this.o);
                canvas.drawLine(this.f * gm.L(1.0f), 0.0f, (gm.L(18.0f) - (gm.L(1.0f) * this.f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * gm.L(5.0f)) - (Math.abs(this.f) * gm.L(0.5f));
                L = gm.L(18.0f) - (Math.abs(this.f) * gm.L(9.0f));
                abs2 = (Math.abs(this.f) * gm.L(3.0f)) + gm.L(5.0f);
                abs3 = Math.abs(this.f) * gm.L(9.0f);
            }
        }
        float f9 = abs3;
        float f10 = abs2;
        float f11 = abs;
        float f12 = L;
        if (this.n) {
            canvas.drawLine(f9, -f10, f12, -f11, paint);
            canvas.drawLine(f9, f10, f12, f11, paint);
        } else {
            canvas.drawLine(f9, -f10, f12 - 0.0f, -f11, paint);
            canvas.drawLine(f9, f10, f12, f11, paint);
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        if (this.o != i) {
            this.o = i;
            this.a.setAlpha(i);
            this.b.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
