package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
public final class pg8 extends d2b {
    public boolean a = false;
    public final Paint b = new Paint(1);
    public final int c = yac.t0;
    public long d = 0;
    public boolean e = false;
    public final RectF f = new RectF();
    public float g;
    public final boolean h;
    public final vnb i;

    public pg8(vnb vnbVar, boolean z) {
        this.h = z;
        this.i = vnbVar;
    }

    @Override
    public final void c(boolean z) {
        this.a = z;
    }

    @Override
    public final void d() {
        this.d = System.currentTimeMillis();
        this.e = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        float f;
        int i2;
        int L = hl.L(10.0f);
        int L2 = ((hl.L(18.0f) - L) / 2) + getBounds().top;
        if (!this.a) {
            L2 += hl.L(1.0f);
        }
        int i3 = L2;
        boolean z = this.h;
        if (z) {
            i = aob.p9;
        } else {
            i = aob.pa;
        }
        int v0 = aob.v0(i, this.i);
        Paint paint = this.b;
        paint.setColor(v0);
        RectF rectF = this.f;
        rectF.set(0.0f, i3, L, i3 + L);
        float f2 = this.g;
        float f3 = 0.5f;
        if (f2 < 0.5f) {
            f = uh9.e(f2, 0.5f, 1.0f, 35.0f);
        } else {
            f = ((f2 - 0.5f) * 35.0f) / 0.5f;
        }
        int i4 = (int) f;
        int i5 = 0;
        while (i5 < 3) {
            int L3 = hl.L(9.2f);
            float f4 = f3;
            float f5 = this.g;
            float L4 = (L3 + (hl.L(5.0f) * i5)) - (hl.L(5.0f) * f5);
            if (i5 == 2) {
                paint.setAlpha(Math.min(255, (int) ((f5 * 255.0f) / f4)));
            } else if (i5 == 0) {
                if (f5 > f4) {
                    paint.setAlpha((int) ((1.0f - ((f5 - f4) / f4)) * 255.0f));
                } else {
                    paint.setAlpha(255);
                }
            } else {
                paint.setAlpha(255);
            }
            canvas.drawCircle(L4, (L / 2) + i3, hl.L(1.2f), paint);
            i5++;
            f3 = f4;
        }
        paint.setAlpha(255);
        canvas.drawArc(rectF, i4, 360 - (i4 << 1), true, paint);
        if (z) {
            i2 = aob.d6;
        } else {
            i2 = aob.s8;
        }
        paint.setColor(aob.w0(null, i2, false));
        canvas.drawCircle(hl.L(4.0f), ((L / 2) + i3) - hl.L(2.0f), hl.L(1.0f), paint);
        f();
    }

    @Override
    public final void e() {
        this.g = 0.0f;
        this.e = false;
    }

    public final void f() {
        if (this.e) {
            if (!jn7.f(this.c).g()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.d;
                this.d = currentTimeMillis;
                if (j > 50) {
                    j = 50;
                }
                float f = this.g;
                if (f >= 1.0f) {
                    f = 0.0f;
                    this.g = 0.0f;
                }
                float f2 = (((float) j) / 300.0f) + f;
                this.g = f2;
                if (f2 > 1.0f) {
                    this.g = 1.0f;
                }
                a();
                return;
            }
            hl.d3(new x38(this, (byte) 27), 100L);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return hl.L(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return hl.L(20.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
