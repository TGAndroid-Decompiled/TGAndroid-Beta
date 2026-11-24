package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
public final class ql9 extends e0b {
    public float d;
    public final Paint f;
    public boolean a = false;
    public long b = 0;
    public boolean c = false;
    public int e = 1;

    public ql9(boolean z) {
        if (z) {
            this.f = new Paint(1);
        }
    }

    @Override
    public final void b(int i) {
        Paint paint = this.f;
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
        Paint paint = this.f;
        if (paint == null) {
            paint = cmb.b2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        float L = gm.L(6.0f);
        if (this.a) {
            f = 8.0f;
        } else {
            f = 9.0f;
        }
        canvas.drawCircle(L, gm.L(f), gm.L(4.0f), paint);
        if (this.c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.b;
            this.b = currentTimeMillis;
            if (j > 50) {
                j = 50;
            }
            float f2 = this.d;
            int i = this.e;
            float f3 = (((float) (i * j)) / 400.0f) + f2;
            this.d = f3;
            if (i > 0 && f3 >= 1.0f) {
                this.e = -1;
                this.d = 1.0f;
            } else if (i < 0 && f3 <= 0.0f) {
                this.e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override
    public final void e() {
        this.c = false;
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(10.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(12.0f);
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
