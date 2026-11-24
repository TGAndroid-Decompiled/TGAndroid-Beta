package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
public final class pg2 extends bya {
    public final byte a;
    public boolean b;
    public long c;
    public boolean d;
    public float e;
    public int f;
    public final Paint g;
    public final Object h;

    public pg2(boolean z) {
        this.a = (byte) 1;
        this.b = false;
        this.c = 0L;
        this.d = false;
        this.h = new RectF();
        this.f = 255;
        if (z) {
            Paint paint = new Paint(1);
            this.g = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(gl.L(2.0f));
        }
    }

    @Override
    public final void b(int i) {
        byte b = this.a;
        Paint paint = this.g;
        switch (b) {
            case 0:
                if (this.f != i) {
                    ((Paint) this.h).setColor(i);
                    paint.setColor(i);
                }
                this.f = i;
                return;
            default:
                if (paint != null) {
                    paint.setColor(i);
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(boolean z) {
        switch (this.a) {
            case 0:
                return;
            default:
                this.b = z;
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.a) {
            case 0:
                this.c = System.currentTimeMillis();
                this.b = true;
                invalidateSelf();
                return;
            default:
                this.c = System.currentTimeMillis();
                this.d = true;
                invalidateSelf();
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        float L;
        float N;
        long j;
        byte b = this.a;
        long j2 = 50;
        Paint paint = this.g;
        float f3 = 2.0f;
        Object obj = this.h;
        switch (b) {
            case 0:
                float min = Math.min(this.e, 1.0f);
                s33 s33Var = s33.i;
                int i = (min > 0.3f ? 1 : (min == 0.3f ? 0 : -1));
                if (i < 0) {
                    f = min / 0.3f;
                } else {
                    f = 1.0f;
                }
                float interpolation = s33Var.getInterpolation(f);
                s33 s33Var2 = s33.g;
                if (i < 0) {
                    f2 = 0.0f;
                } else {
                    f2 = (min - 0.3f) / 0.7f;
                }
                float interpolation2 = s33Var2.getInterpolation(f2);
                if (this.d) {
                    L = tb4.A(1.0f, interpolation, gl.L(7.0f) - gl.L(2.1f), gl.L(2.1f) * interpolation);
                    N = (1.0f - s33Var2.getInterpolation(this.e / 2.0f)) * gl.N(1.5f);
                } else {
                    L = ((gl.L(7.0f) - gl.L(2.1f)) * interpolation) + ((1.0f - interpolation) * gl.L(2.1f));
                    N = gl.N(1.5f) * s33.h.getInterpolation(this.e / 2.0f);
                }
                float L2 = gl.L(11.0f) / 2.0f;
                float N2 = gl.N(2.0f);
                float N3 = (gl.N(0.5f) * interpolation) - (gl.N(0.5f) * interpolation2);
                if (paint == null) {
                    paint = bkb.c2;
                }
                Paint paint2 = (Paint) obj;
                if (paint2 == null) {
                    paint2 = bkb.b2;
                }
                if (paint.getStrokeWidth() != gl.L(0.8f)) {
                    paint.setStrokeWidth(gl.L(0.8f));
                }
                int i2 = 0;
                for (int i3 = 2; i2 < i3; i3 = 2) {
                    canvas.save();
                    canvas.translate(gl.N(0.2f) + (paint.getStrokeWidth() / 2.0f) + N + (gl.L(9.0f) * i2) + getBounds().left, gl.N(2.0f) + (paint.getStrokeWidth() / 2.0f) + getBounds().top);
                    RectF rectF = gl.P;
                    rectF.set(0.0f, N3, gl.L(7.0f), gl.L(11.0f) - N3);
                    canvas.drawOval(rectF, paint);
                    canvas.drawCircle(L, L2, N2, paint2);
                    canvas.restore();
                    i2++;
                }
                if (this.b) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - this.c;
                    this.c = currentTimeMillis;
                    if (j3 > 50) {
                        j = 50;
                    } else {
                        j = j3;
                    }
                    float f4 = (((float) j) / 500.0f) + this.e;
                    this.e = f4;
                    if (f4 >= 2.0f) {
                        this.e = 0.0f;
                        this.d = !this.d;
                    }
                    a();
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) obj;
                if (paint == null) {
                    paint = bkb.c2;
                }
                if (paint.getStrokeWidth() != gl.L(2.0f)) {
                    paint.setStrokeWidth(gl.L(2.0f));
                }
                canvas.save();
                int L3 = gl.L(14.0f) / 2;
                if (this.b) {
                    f3 = 1.0f;
                }
                canvas.translate(0.0f, gl.L(f3) + L3);
                for (int i4 = 0; i4 < 4; i4++) {
                    int i5 = this.f;
                    if (i4 == 0) {
                        paint.setAlpha((int) (i5 * this.e));
                    } else if (i4 == 3) {
                        paint.setAlpha((int) ((1.0f - this.e) * i5));
                    } else {
                        paint.setAlpha(i5);
                    }
                    float L4 = (gl.L(4.0f) * this.e) + (gl.L(4.0f) * i4);
                    float f5 = -L4;
                    rectF2.set(f5, f5, L4, L4);
                    canvas.drawArc(rectF2, -15.0f, 30.0f, false, paint);
                }
                canvas.restore();
                if (this.d) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j4 = currentTimeMillis2 - this.c;
                    this.c = currentTimeMillis2;
                    if (j4 <= 50) {
                        j2 = j4;
                    }
                    this.e = (((float) j2) / 800.0f) + this.e;
                    while (true) {
                        float f6 = this.e;
                        if (f6 > 1.0f) {
                            this.e = f6 - 1.0f;
                        } else {
                            a();
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void e() {
        switch (this.a) {
            case 0:
                this.b = false;
                return;
            default:
                this.d = false;
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return gl.L(18.0f);
            default:
                return gl.L(14.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return gl.L(20.0f);
            default:
                return gl.L(18.0f);
        }
    }

    @Override
    public final int getOpacity() {
        byte b = this.a;
        return 0;
    }

    @Override
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                return;
            default:
                this.f = i;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }

    private final void f(int i) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(boolean z) {
    }

    public pg2() {
        this.a = (byte) 0;
        this.c = 0L;
        this.b = false;
        this.d = true;
        Paint paint = new Paint(1);
        this.g = paint;
        this.h = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.N(1.2f));
    }
}
