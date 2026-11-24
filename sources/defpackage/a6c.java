package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
public final class a6c extends e0b {
    public final int a = z8c.t0;
    public boolean b = false;
    public final float[] c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] e = {0.0f, 0.0f, 0.0f};
    public long f = 0;
    public boolean g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean i;
    public final Paint j;

    public a6c(boolean z) {
        if (z) {
            this.j = new Paint(1);
        }
    }

    @Override
    public final void b(int i) {
        Paint paint = this.j;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override
    public final void c(boolean z) {
        this.b = z;
    }

    @Override
    public final void d() {
        this.f = System.currentTimeMillis();
        this.g = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int i;
        int i2 = getBounds().left;
        if (this.b) {
            L = gm.L(8.5f);
            i = getBounds().top;
        } else {
            L = gm.L(9.3f);
            i = getBounds().top;
        }
        int i3 = L + i;
        Paint paint = this.j;
        if (paint == null) {
            paint = cmb.b2;
            paint.setAlpha(255);
        }
        float f = i3;
        float[] fArr = this.c;
        canvas.drawCircle(gm.L(3.0f) + i2, f, fArr[0] * gm.p, paint);
        canvas.drawCircle(gm.L(9.0f) + i2, f, fArr[1] * gm.p, paint);
        canvas.drawCircle(gm.L(15.0f) + i2, f, fArr[2] * gm.p, paint);
        f();
    }

    @Override
    public final void e() {
        for (int i = 0; i < 3; i++) {
            this.e[i] = 0.0f;
            this.c[i] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.g = false;
    }

    public final void f() {
        if (this.g) {
            if (nm7.f(this.a).g() && !this.i) {
                gm.d3(new zcb(this, (byte) 27), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.f;
            this.f = currentTimeMillis;
            if (j > 50) {
                j = 50;
            }
            for (int i = 0; i < 3; i++) {
                float[] fArr = this.e;
                float f = fArr[i] + ((float) j);
                fArr[i] = f;
                float[] fArr2 = this.d;
                float f2 = f - fArr2[i];
                int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                float[] fArr3 = this.c;
                if (i2 > 0) {
                    int i3 = (f2 > 320.0f ? 1 : (f2 == 320.0f ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (i3 <= 0) {
                        fArr3[i] = decelerateInterpolator.getInterpolation(f2 / 320.0f) + 1.33f;
                    } else if (f2 <= 640.0f) {
                        fArr3[i] = (1.0f - decelerateInterpolator.getInterpolation((f2 - 320.0f) / 320.0f)) + 1.33f;
                    } else if (f2 >= 800.0f) {
                        fArr[i] = 0.0f;
                        fArr2[i] = 0.0f;
                        fArr3[i] = 1.33f;
                    } else {
                        fArr3[i] = 1.33f;
                    }
                } else {
                    fArr3[i] = 1.33f;
                }
            }
            a();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(18.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i) {
    }
}
