package gh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import b8.be;
import b8.w9;
import org.telegram.messenger.camera.q;
public final class f {
    public int d;
    public boolean f12302e;
    public int f12303f;
    public float f12305i;
    public float f12306j;
    public float f12311o;
    public float f12312p;
    public float f12313q;
    public float f12314r;
    public float f12316t;
    public float f12317u;
    public float v;
    public float f12318w;
    public long f12319x;
    public final Rect f12299a = new Rect();
    public final float[] f12300b = new float[8];
    public final float[] f12301c = new float[8];
    public float f12304g = 0.75f;
    public final float h = 1.5f;
    public final Path f12307k = new Path();
    public boolean f12308l = true;
    public final Rect f12309m = new Rect();
    public int f12310n = -1;
    public final RectF f12315s = new RectF();
    public final Matrix f12320y = new Matrix();
    public final RectF f12321z = new RectF();
    public final float[] A = new float[4];

    public static long f(int i3, long j10) {
        return (j10 ^ i3) * 1099511628211L;
    }

    public final void a() {
        boolean z10;
        float width;
        float height;
        int i3;
        float f10;
        float[] fArr;
        float f11;
        float f12;
        float f13;
        float f14;
        float[] fArr2 = this.f12300b;
        this.f12308l = w9.a(fArr2);
        Rect rect = this.f12299a;
        Rect rect2 = this.f12309m;
        rect2.set(rect);
        int i10 = this.d;
        rect2.inset(i10, i10);
        RectF rectF = this.f12315s;
        rectF.set(rect2);
        Path path = this.f12307k;
        path.rewind();
        if (e()) {
            int i11 = this.f12310n;
            if (i11 != 0 && i11 != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (i11 == 0) {
                rectF.left += this.f12312p;
            } else if (i11 == 1) {
                rectF.top += this.f12312p;
            } else if (i11 != 2) {
                rectF.bottom -= this.f12312p;
            } else {
                rectF.right -= this.f12312p;
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
            int i12 = this.f12310n;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                } else {
                    i3 = 0;
                }
            } else {
                i3 = 3;
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
                fArr[i13] = Math.min(fArr2[((i3 + i13) % 4) * 2], max);
                i13++;
                f15 = f10;
            }
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr[2];
            float f19 = fArr[3];
            float f20 = this.f12312p;
            float min = Math.min(this.f12313q, f20);
            float f21 = this.f12314r;
            Math.sqrt(0.5d);
            float b10 = q.b(min, f21, ((float) Math.sqrt(2.0d)) - 1.0f, f20);
            this.f12317u = b10;
            int i14 = this.f12310n;
            if (i14 != 0) {
                f11 = width;
                if (i14 != 1) {
                    if (i14 != 2) {
                        f12 = rectF.right;
                        f13 = this.f12311o;
                    } else {
                        f12 = this.f12311o;
                        f13 = rectF.top;
                    }
                } else {
                    f12 = this.f12311o;
                    f13 = rectF.left;
                }
            } else {
                f11 = width;
                f12 = rectF.bottom;
                f13 = this.f12311o;
            }
            float f22 = f12 - f13;
            float f23 = f16 + b10;
            float f24 = f11 - f17;
            float f25 = f24 - b10;
            if (f23 <= f25) {
                f14 = be.a(f22, f23, f25);
            } else {
                f14 = f11 / f10;
            }
            this.f12316t = f14;
            this.v = f14 - f16;
            this.f12318w = f24 - f14;
            path.moveTo(f16, 0.0f);
            float f26 = this.f12317u;
            float f27 = f14 - f26;
            float f28 = f14;
            float f29 = f21 * (-2.0f);
            RectF rectF2 = this.f12321z;
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
            int i15 = this.f12310n;
            Matrix matrix = this.f12320y;
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
            long f35 = f(Math.round(f21 * 4.0f), f(Math.round(min * 4.0f), f(Math.round(f20 * 4.0f), f(Math.round(f28 * 4.0f), f(Math.round(f30 * 4.0f), f(Math.round(f11 * 4.0f), f(this.f12310n, -3750763034362895579L)))))));
            for (float f36 : fArr) {
                f35 = f(Math.round(f36 * 4.0f), f35);
            }
            this.f12319x = f(Math.round((rectF.top - rect2.top) * 4.0f), f(Math.round((rectF.left - rect2.left) * 4.0f), f35));
        } else {
            path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, this.f12300b, Path.Direction.CW);
        }
        path.close();
    }

    public final void b(float f10, float f11, float f12, float f13) {
        int i3 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        Path path = this.f12307k;
        if (i3 <= 0) {
            path.lineTo(f10, f11);
            return;
        }
        float f14 = f12 * 2.0f;
        RectF rectF = this.f12321z;
        rectF.set(f10, f11, f10 + f14, f14 + f11);
        path.arcTo(rectF, f13, 90.0f, false);
    }

    public final void c(Canvas canvas, Paint paint) {
        Rect rect;
        if (this.f12308l && !e()) {
            float f10 = this.f12309m.bottom;
            float f11 = this.f12300b[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, f10, f11, f11, paint);
            return;
        }
        canvas.drawPath(this.f12307k, paint);
    }

    public final void d(Canvas canvas, Paint paint, boolean z10) {
        Rect rect;
        if (z10 && !e()) {
            float f10 = this.f12309m.top;
            float[] fArr = this.f12300b;
            float a10 = be.a((fArr[0] * 2.0f) + f10, f10, rect.bottom);
            canvas.save();
            Rect rect2 = this.f12299a;
            canvas.clipRect(rect2.left, rect2.top, rect2.right, a10);
            float f11 = fArr[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, a10, f11, f11, paint);
            canvas.restore();
            return;
        }
        c(canvas, paint);
    }

    public final boolean e() {
        if (this.f12310n != -1 && this.f12312p > 0.0f) {
            return true;
        }
        return false;
    }
}
