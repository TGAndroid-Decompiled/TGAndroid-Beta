package fh;

import a8.n7;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import c8.i9;
import org.telegram.messenger.i20;
public final class f {
    public int d;
    public boolean f11322e;
    public int f11323f;
    public float f11325i;
    public float f11326j;
    public float f11331o;
    public float f11332p;
    public float f11333q;
    public float f11334r;
    public float f11336t;
    public float f11337u;
    public float v;
    public float f11338w;
    public long f11339x;
    public final Rect f11319a = new Rect();
    public final float[] f11320b = new float[8];
    public final float[] f11321c = new float[8];
    public float f11324g = 0.75f;
    public final float h = 1.5f;
    public final Path f11327k = new Path();
    public boolean f11328l = true;
    public final Rect f11329m = new Rect();
    public int f11330n = -1;
    public final RectF f11335s = new RectF();
    public final Matrix f11340y = new Matrix();
    public final RectF f11341z = new RectF();
    public final float[] A = new float[4];

    public static long f(int i7, long j3) {
        return (j3 ^ i7) * 1099511628211L;
    }

    public final void a() {
        boolean z10;
        float width;
        float height;
        int i7;
        float f10;
        float[] fArr;
        float f11;
        float f12;
        float f13;
        float f14;
        float[] fArr2 = this.f11320b;
        this.f11328l = n7.a(fArr2);
        Rect rect = this.f11319a;
        Rect rect2 = this.f11329m;
        rect2.set(rect);
        int i10 = this.d;
        rect2.inset(i10, i10);
        RectF rectF = this.f11335s;
        rectF.set(rect2);
        Path path = this.f11327k;
        path.rewind();
        if (e()) {
            int i11 = this.f11330n;
            if (i11 != 0 && i11 != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (i11 == 0) {
                rectF.left += this.f11332p;
            } else if (i11 == 1) {
                rectF.top += this.f11332p;
            } else if (i11 != 2) {
                rectF.bottom -= this.f11332p;
            } else {
                rectF.right -= this.f11332p;
            }
            if (z10) {
                width = rectF.height();
            } else {
                width = rectF.width();
            }
            if (z10) {
                height = rectF.width();
            } else {
                height = rectF.height();
            }
            int i12 = this.f11330n;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        i7 = 2;
                    } else {
                        i7 = 1;
                    }
                } else {
                    i7 = 0;
                }
            } else {
                i7 = 3;
            }
            float f15 = 2.0f;
            float max = Math.max(0.0f, Math.min(width, height) / 2.0f);
            int i13 = 0;
            while (true) {
                f10 = f15;
                fArr = this.A;
                if (i13 >= 4) {
                    break;
                }
                fArr[i13] = Math.min(fArr2[((i7 + i13) % 4) * 2], max);
                i13++;
                f15 = f10;
            }
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr[2];
            float f19 = fArr[3];
            float f20 = this.f11332p;
            float min = Math.min(this.f11333q, f20);
            float f21 = this.f11334r;
            Math.sqrt(0.5d);
            float b10 = i20.b(min, f21, ((float) Math.sqrt(2.0d)) - 1.0f, f20);
            this.f11337u = b10;
            int i14 = this.f11330n;
            if (i14 != 0) {
                f11 = width;
                if (i14 != 1) {
                    if (i14 != 2) {
                        f12 = rectF.right;
                        f13 = this.f11331o;
                    } else {
                        f12 = this.f11331o;
                        f13 = rectF.top;
                    }
                } else {
                    f12 = this.f11331o;
                    f13 = rectF.left;
                }
            } else {
                f11 = width;
                f12 = rectF.bottom;
                f13 = this.f11331o;
            }
            float f22 = f12 - f13;
            float f23 = f16 + b10;
            float f24 = f11 - f17;
            float f25 = f24 - b10;
            if (f23 <= f25) {
                f14 = i9.a(f22, f23, f25);
            } else {
                f14 = f11 / f10;
            }
            this.f11336t = f14;
            this.v = f14 - f16;
            this.f11338w = f24 - f14;
            path.moveTo(f16, 0.0f);
            float f26 = this.f11337u;
            float f27 = f14 - f26;
            float f28 = f14;
            float f29 = f21 * (-2.0f);
            RectF rectF2 = this.f11341z;
            float f30 = height;
            rectF2.set(f27 - f21, f29, f27 + f21, 0.0f);
            path.arcTo(rectF2, 90.0f, -45.0f, false);
            float f31 = f28 - min;
            float f32 = -f20;
            rectF2.set(f31, f32, f28 + min, (min * f10) + f32);
            path.arcTo(rectF2, 225.0f, 90.0f, false);
            float f33 = f28 + f26;
            rectF2.set(f33 - f21, f29, f33 + f21, 0.0f);
            path.arcTo(rectF2, 135.0f, -45.0f, false);
            b(f11 - (f17 * f10), 0.0f, f17, 270.0f);
            float f34 = f18 * f10;
            b(f11 - f34, f30 - f34, f18, 0.0f);
            b(0.0f, f30 - (f19 * f10), f19, 90.0f);
            b(0.0f, 0.0f, f16, 180.0f);
            int i15 = this.f11330n;
            Matrix matrix = this.f11340y;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
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
            path.transform(matrix);
            long f35 = f(Math.round(f21 * 4.0f), f(Math.round(min * 4.0f), f(Math.round(f20 * 4.0f), f(Math.round(f28 * 4.0f), f(Math.round(f30 * 4.0f), f(Math.round(f11 * 4.0f), f(this.f11330n, -3750763034362895579L)))))));
            for (float f36 : fArr) {
                f35 = f(Math.round(f36 * 4.0f), f35);
            }
            this.f11339x = f(Math.round((rectF.top - rect2.top) * 4.0f), f(Math.round((rectF.left - rect2.left) * 4.0f), f35));
        } else {
            path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, this.f11320b, Path.Direction.CW);
        }
        path.close();
    }

    public final void b(float f10, float f11, float f12, float f13) {
        int i7 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        Path path = this.f11327k;
        if (i7 <= 0) {
            path.lineTo(f10, f11);
            return;
        }
        float f14 = f12 * 2.0f;
        RectF rectF = this.f11341z;
        rectF.set(f10, f11, f10 + f14, f14 + f11);
        path.arcTo(rectF, f13, 90.0f, false);
    }

    public final void c(Canvas canvas, Paint paint) {
        Rect rect;
        if (this.f11328l && !e()) {
            float f10 = this.f11329m.bottom;
            float f11 = this.f11320b[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, f10, f11, f11, paint);
            return;
        }
        canvas.drawPath(this.f11327k, paint);
    }

    public final void d(Canvas canvas, Paint paint, boolean z10) {
        Rect rect;
        if (z10 && !e()) {
            float f10 = this.f11329m.top;
            float[] fArr = this.f11320b;
            float a10 = i9.a((fArr[0] * 2.0f) + f10, f10, rect.bottom);
            canvas.save();
            Rect rect2 = this.f11319a;
            canvas.clipRect(rect2.left, rect2.top, rect2.right, a10);
            float f11 = fArr[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, a10, f11, f11, paint);
            canvas.restore();
            return;
        }
        c(canvas, paint);
    }

    public final boolean e() {
        if (this.f11330n != -1 && this.f11332p > 0.0f) {
            return true;
        }
        return false;
    }
}
