package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
public final class e8a extends d2b {
    public boolean a = false;
    public long b = 0;
    public boolean c = false;
    public float d;
    public final Paint e;

    public e8a(boolean z) {
        if (z) {
            Paint paint = new Paint(1);
            this.e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(hl.L(2.0f));
        }
    }

    @Override
    public final void b(int i) {
        Paint paint = this.e;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override
    public final void c(boolean z) {
        this.a = z;
    }

    @Override
    public final void d() {
        this.b = System.currentTimeMillis();
        this.c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        Paint paint = this.e;
        if (paint == null) {
            paint = aob.d2;
        }
        Paint paint2 = paint;
        int i = 0;
        while (i < 3) {
            if (i == 0) {
                paint2.setAlpha((int) (this.d * 255.0f));
            } else if (i == 2) {
                paint2.setAlpha((int) ((1.0f - this.d) * 255.0f));
            } else {
                paint2.setAlpha(255);
            }
            float L = (hl.L(5.0f) * i) + (hl.L(5.0f) * this.d);
            if (this.a) {
                f = 3.0f;
            } else {
                f = 4.0f;
            }
            float L2 = hl.L(f);
            float L3 = L + hl.L(4.0f);
            float f4 = 8.0f;
            if (this.a) {
                f2 = 7.0f;
            } else {
                f2 = 8.0f;
            }
            float L4 = hl.L(f2);
            Canvas canvas2 = canvas;
            canvas2.drawLine(L, L2, L3, L4, paint2);
            if (this.a) {
                f3 = 11.0f;
            } else {
                f3 = 12.0f;
            }
            float L5 = hl.L(f3);
            float L6 = L + hl.L(4.0f);
            if (this.a) {
                f4 = 7.0f;
            }
            canvas2.drawLine(L, L5, L6, hl.L(f4), paint2);
            i++;
            canvas = canvas2;
        }
        if (this.c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.b;
            this.b = currentTimeMillis;
            if (j > 50) {
                j = 50;
            }
            this.d = (((float) j) / 500.0f) + this.d;
            while (true) {
                float f5 = this.d;
                if (f5 > 1.0f) {
                    this.d = f5 - 1.0f;
                } else {
                    a();
                    return;
                }
            }
        }
    }

    @Override
    public final void e() {
        this.c = false;
    }

    @Override
    public final int getIntrinsicHeight() {
        return hl.L(14.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return hl.L(18.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
