package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class uk9 extends Drawable {
    public long a;
    public boolean b;
    public Paint c;
    public float d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public gb2 j;
    public float k;
    public int l;
    public int m;
    public wjb n;

    public final void a() {
        if (this.b) {
            return;
        }
        this.a = System.currentTimeMillis();
        this.b = true;
        this.j.invalidate();
    }

    public final void b() {
        if (!this.b) {
            return;
        }
        this.b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.c;
        paint.setColor(bm2.f(this.k, bkb.v0(bkb.Yc, this.n), this.l));
        int i = this.m;
        if (i != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i));
        }
        int i2 = getBounds().left;
        int i3 = getBounds().top;
        int i4 = 0;
        while (i4 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(gl.L(2.0f) + i2, gl.L((this.d * 7.0f) + 2.0f) + i3, gl.L(4.0f) + i2, gl.L(10.0f) + i3, paint);
            canvas2.drawRect(gl.L(5.0f) + i2, gl.L((this.e * 7.0f) + 2.0f) + i3, gl.L(7.0f) + i2, gl.L(10.0f) + i3, paint);
            canvas2.drawRect(gl.L(8.0f) + i2, gl.L((this.f * 7.0f) + 2.0f) + i3, gl.L(10.0f) + i2, gl.L(10.0f) + i3, paint);
            i4++;
            canvas = canvas2;
        }
        if (this.b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.a;
            this.a = currentTimeMillis;
            if (j > 50) {
                j = 50;
            }
            float f = (float) j;
            float f2 = ((f / 300.0f) * this.g) + this.d;
            this.d = f2;
            if (f2 > 1.0f) {
                this.g = -1;
                this.d = 1.0f;
            } else if (f2 < 0.0f) {
                this.g = 1;
                this.d = 0.0f;
            }
            float f3 = ((f / 310.0f) * this.h) + this.e;
            this.e = f3;
            if (f3 > 1.0f) {
                this.h = -1;
                this.e = 1.0f;
            } else if (f3 < 0.0f) {
                this.h = 1;
                this.e = 0.0f;
            }
            float f4 = ((f / 320.0f) * this.i) + this.f;
            this.f = f4;
            if (f4 > 1.0f) {
                this.i = -1;
                this.f = 1.0f;
            } else if (f4 < 0.0f) {
                this.i = 1;
                this.f = 0.0f;
            }
            this.j.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return gl.L(12.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gl.L(12.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.m = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
