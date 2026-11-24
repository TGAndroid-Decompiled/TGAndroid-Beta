package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class ty8 {
    public static DecelerateInterpolator y;
    public final View i;
    public boolean k;
    public boolean l;
    public Drawable m;
    public Drawable n;
    public final Paint p;
    public boolean s;
    public long a = 0;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f = 0.0f;
    public final RectF g = new RectF();
    public final RectF h = new RectF();
    public float j = 1.0f;
    public int o = -1;
    public int q = gl.L(4.0f);
    public Paint r = null;
    public float t = 3000.0f;
    public final Path u = new Path();
    public final Matrix v = new Matrix();
    public final PathMeasure w = new PathMeasure();
    public final Path x = new Path();

    public ty8(View view) {
        if (y == null) {
            y = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.p = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(gl.L(3.0f));
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(gl.L(2.0f));
        new Paint(1);
        this.i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.n;
        RectF rectF = this.g;
        if (drawable != null) {
            drawable.setAlpha((int) (this.j * 255.0f * 1.0f));
            this.n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.n.draw(canvas);
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            if (this.n != null) {
                drawable2.setAlpha((int) tb4.z(1.0f, this.j, 255.0f, 1.0f));
            } else {
                drawable2.setAlpha(255);
            }
            this.m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.m.draw(canvas);
        }
        if (!this.k && !this.l) {
            g(false);
            return;
        }
        Paint paint2 = this.r;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i = this.o;
            Paint paint3 = this.p;
            paint3.setColor(i);
            if (this.l) {
                paint3.setAlpha((int) (this.j * 255.0f * 1.0f));
            } else {
                paint3.setAlpha(255);
            }
            paint = paint3;
        }
        float f = rectF.left;
        float f2 = this.q;
        RectF rectF2 = this.h;
        rectF2.set(f + f2, rectF.top + f2, rectF.right - f2, rectF.bottom - f2);
        b(this.b - 90.0f, Math.max(4.0f, this.f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f, float f2, Canvas canvas, Paint paint, RectF rectF) {
        if (this.s) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f2) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f3 = ((((int) f) / 90) * 90) + 90;
            float f4 = (-199.0f) + f3;
            float f5 = ((f + f2) - f4) / 360.0f;
            Path path = this.u;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.v;
            matrix.reset();
            matrix.postRotate(f3, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.w;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.x;
            path2.reset();
            pathMeasure.getSegment(((f - f4) / 360.0f) * length, length * f5, path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            if (f5 > 1.0f) {
                b(f + 90.0f, f2 - 90.0f, canvas, paint, rectF);
                return;
            }
            return;
        }
        canvas.drawArc(rectF, f, f2, false, paint);
    }

    public final void c() {
        int L = gl.L(2.0f);
        RectF rectF = this.g;
        int i = ((int) rectF.left) - L;
        int i2 = ((int) rectF.top) - L;
        int i3 = L << 1;
        this.i.invalidate(i, i2, ((int) rectF.right) + i3, ((int) rectF.bottom) + i3);
    }

    public final void d(Drawable drawable, boolean z, boolean z2) {
        Drawable drawable2;
        this.a = System.currentTimeMillis();
        if (z2 && (drawable2 = this.m) != drawable) {
            this.n = drawable2;
            this.l = this.k;
            this.j = 1.0f;
            e(z2, 1.0f);
        } else {
            this.n = null;
            this.l = false;
        }
        this.k = z;
        this.m = drawable;
        if (!z2) {
            this.i.invalidate();
        } else {
            c();
        }
    }

    public final void e(boolean z, float f) {
        if (f != 1.0f && this.j != 0.0f && this.n != null) {
            this.j = 0.0f;
            this.n = null;
        }
        if (!z) {
            this.f = f;
            this.d = f;
        } else {
            float f2 = this.f;
            if (f2 > f) {
                this.f = f;
                f2 = f;
            }
            this.d = f2;
        }
        this.c = f;
        this.e = 0L;
        c();
    }

    public final void f(int i, int i2, int i3, int i4) {
        this.g.set(i, i2, i3, i4);
    }

    public final void g(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.a;
        this.a = currentTimeMillis;
        if (z) {
            if (this.f != 1.0f) {
                this.b = (((float) (360 * j)) / this.t) + this.b;
                float f = this.c;
                float f2 = this.d;
                float f3 = f - f2;
                if (f3 > 0.0f) {
                    long j2 = this.e + j;
                    this.e = j2;
                    if (j2 >= 300) {
                        this.f = f;
                        this.d = f;
                        this.e = 0L;
                    } else {
                        this.f = (y.getInterpolation(((float) j2) / 300.0f) * f3) + f2;
                    }
                }
                c();
            }
            if (this.f >= 1.0f && this.n != null) {
                float f4 = this.j - (((float) j) / 200.0f);
                this.j = f4;
                if (f4 <= 0.0f) {
                    this.j = 0.0f;
                    this.n = null;
                }
                c();
            }
        } else if (this.n != null) {
            float f5 = this.j - (((float) j) / 200.0f);
            this.j = f5;
            if (f5 <= 0.0f) {
                this.j = 0.0f;
                this.n = null;
            }
            c();
        }
    }
}
