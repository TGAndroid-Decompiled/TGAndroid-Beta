package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
public final class hl0 {
    public int d;
    public boolean e;
    public int f;
    public float i;
    public float j;
    public float o;
    public float p;
    public float q;
    public float r;
    public float t;
    public float u;
    public float v;
    public float w;
    public long x;
    public final Rect a = new Rect();
    public final float[] b = new float[8];
    public final float[] c = new float[8];
    public float g = 0.75f;
    public final float h = 1.5f;
    public final Path k = new Path();
    public boolean l = true;
    public final Rect m = new Rect();
    public int n = -1;
    public final RectF s = new RectF();
    public final Matrix y = new Matrix();
    public final RectF z = new RectF();
    public final float[] A = new float[4];

    public static long f(int i, long j) {
        return (j ^ i) * 1099511628211L;
    }

    public final void a() {
        Path path;
        boolean z;
        float width;
        float height;
        int i;
        float[] fArr;
        float f;
        float f2;
        float f3;
        float f4;
        float[] fArr2 = this.b;
        this.l = hse.a(fArr2);
        Rect rect = this.a;
        Rect rect2 = this.m;
        rect2.set(rect);
        int i2 = this.d;
        rect2.inset(i2, i2);
        RectF rectF = this.s;
        rectF.set(rect2);
        Path path2 = this.k;
        path2.rewind();
        if (e()) {
            int i3 = this.n;
            if (i3 != 0 && i3 != 2) {
                z = false;
            } else {
                z = true;
            }
            if (i3 == 0) {
                rectF.left += this.p;
            } else if (i3 == 1) {
                rectF.top += this.p;
            } else if (i3 != 2) {
                rectF.bottom -= this.p;
            } else {
                rectF.right -= this.p;
            }
            if (z) {
                width = rectF.height();
                height = rectF.width();
            } else {
                width = rectF.width();
                height = rectF.height();
            }
            int i4 = this.n;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                } else {
                    i = 0;
                }
            } else {
                i = 3;
            }
            float f5 = 2.0f;
            float max = Math.max(0.0f, Math.min(width, height) / 2.0f);
            int i5 = 0;
            while (true) {
                fArr = this.A;
                f = f5;
                if (i5 >= 4) {
                    break;
                }
                fArr[i5] = Math.min(fArr2[((i + i5) % 4) << 1], max);
                i5++;
                f5 = f;
            }
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[2];
            float f9 = fArr[3];
            float f10 = this.p;
            float min = Math.min(this.q, f10);
            float f11 = this.r;
            float v = de9.v(min, f11, 0.41421354f, f10);
            this.u = v;
            float f12 = width;
            int i6 = this.n;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        f2 = rectF.right;
                        f3 = this.o;
                    } else {
                        f2 = this.o;
                        f3 = rectF.top;
                    }
                } else {
                    f2 = this.o;
                    f3 = rectF.left;
                }
            } else {
                f2 = rectF.bottom;
                f3 = this.o;
            }
            float f13 = f2 - f3;
            float f14 = f6 + v;
            float f15 = f12 - f7;
            float f16 = f15 - v;
            if (f14 <= f16) {
                f4 = moe.a(f13, f14, f16);
            } else {
                f4 = f12 / f;
            }
            this.t = f4;
            this.v = f4 - f6;
            this.w = f15 - f4;
            path2.moveTo(f6, 0.0f);
            float f17 = this.u;
            float f18 = f4 - f17;
            float f19 = f4;
            float f20 = f11 * (-2.0f);
            RectF rectF2 = this.z;
            float f21 = height;
            rectF2.set(f18 - f11, f20, f18 + f11, 0.0f);
            path2.arcTo(rectF2, 90.0f, -45.0f, false);
            float f22 = -f10;
            rectF2.set(f19 - min, f22, f19 + min, (min * f) + f22);
            path2.arcTo(rectF2, 225.0f, 90.0f, false);
            float f23 = f19 + f17;
            rectF2.set(f23 - f11, f20, f23 + f11, 0.0f);
            path2.arcTo(rectF2, 135.0f, -45.0f, false);
            b(f12 - (f7 * f), 0.0f, f7, 270.0f);
            float f24 = f8 * f;
            b(f12 - f24, f21 - f24, f8, 0.0f);
            b(0.0f, f21 - (f9 * f), f9, 90.0f);
            b(0.0f, 0.0f, f6, 180.0f);
            int i7 = this.n;
            Matrix matrix = this.y;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        matrix.setRotate(180.0f);
                        matrix.postTranslate(rectF.right, rectF.bottom);
                    } else {
                        matrix.setRotate(90.0f);
                        matrix.postTranslate(rectF.right, rectF.top);
                    }
                } else {
                    matrix.setTranslate(rectF.left, rectF.top);
                }
            } else {
                matrix.setRotate(-90.0f);
                matrix.postTranslate(rectF.left, rectF.bottom);
            }
            path2.transform(matrix);
            long f25 = f(Math.round(f11 * 4.0f), f(Math.round(min * 4.0f), f(Math.round(f10 * 4.0f), f(Math.round(f19 * 4.0f), f(Math.round(f21 * 4.0f), f(Math.round(f12 * 4.0f), f(this.n, -3750763034362895579L)))))));
            for (float f26 : fArr) {
                f25 = f(Math.round(f26 * 4.0f), f25);
            }
            this.x = f(Math.round((rectF.top - rect2.top) * 4.0f), f(Math.round((rectF.left - rect2.left) * 4.0f), f25));
            path = path2;
        } else {
            path = path2;
            path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, fArr2, Path.Direction.CW);
        }
        path.close();
    }

    public final void b(float f, float f2, float f3, float f4) {
        int i = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        Path path = this.k;
        if (i <= 0) {
            path.lineTo(f, f2);
            return;
        }
        float f5 = f3 * 2.0f;
        RectF rectF = this.z;
        rectF.set(f, f2, f + f5, f5 + f2);
        path.arcTo(rectF, f4, 90.0f, false);
    }

    public final void c(Canvas canvas, Paint paint) {
        if (this.l && !e()) {
            Rect rect = this.m;
            float f = this.b[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, rect.bottom, f, f, paint);
            return;
        }
        canvas.drawPath(this.k, paint);
    }

    public final void d(Canvas canvas, Paint paint, boolean z) {
        Rect rect;
        if (z && !e()) {
            float f = this.m.top;
            float[] fArr = this.b;
            float a = moe.a((fArr[0] * 2.0f) + f, f, rect.bottom);
            canvas.save();
            Rect rect2 = this.a;
            canvas.clipRect(rect2.left, rect2.top, rect2.right, a);
            float f2 = fArr[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, a, f2, f2, paint);
            canvas.restore();
            return;
        }
        c(canvas, paint);
    }

    public final boolean e() {
        if (this.n != -1 && this.p > 0.0f) {
            return true;
        }
        return false;
    }
}
