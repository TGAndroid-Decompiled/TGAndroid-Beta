package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
public class fl0 {
    public float a;
    public float b;
    public final Path c;
    public final Paint d;
    public final float[] e;
    public final float[] f;
    public final float[] g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public final Random m;
    public final float n;
    public final float o;
    public final float p;
    public final Matrix q;
    public final int r;
    public float s;
    public float t;
    public float u;

    public fl0(int i, int i2) {
        float f;
        this.c = new Path();
        this.d = new Paint(1);
        this.k = new float[4];
        this.l = new float[4];
        this.m = new Random();
        this.p = 1.0f;
        this.q = new Matrix();
        this.n = i;
        this.o = (float) (Math.tan(3.141592653589793d / (f * 2.0f)) * 1.3333333333333333d);
        this.e = new float[i];
        this.f = new float[i];
        this.g = new float[i];
        this.h = new float[i];
        this.i = new float[i];
        this.j = new float[i];
        for (int i3 = 0; i3 < this.n; i3++) {
            c(this.e, this.f, i3);
            c(this.g, this.h, i3);
            this.i[i3] = 0.0f;
        }
        this.r = i2;
    }

    public final void a(float f, float f2, Canvas canvas, Paint paint) {
        int i;
        if (!e86.e(this.r)) {
            return;
        }
        Path path = this.c;
        path.reset();
        int i2 = 0;
        while (true) {
            float f3 = this.n;
            if (i2 < f3) {
                float[] fArr = this.i;
                float f4 = fArr[i2];
                int i3 = i2 + 1;
                if (i3 < f3) {
                    i = i3;
                } else {
                    i = 0;
                }
                float f5 = fArr[i];
                float[] fArr2 = this.e;
                float f6 = 1.0f - f4;
                float[] fArr3 = this.g;
                float f7 = (fArr3[i2] * f4) + (fArr2[i2] * f6);
                float f8 = 1.0f - f5;
                float f9 = (fArr3[i] * f5) + (fArr2[i] * f8);
                float[] fArr4 = this.f;
                float f10 = fArr4[i2] * f6;
                float[] fArr5 = this.h;
                float f11 = (fArr5[i] * f5) + (fArr4[i] * f8);
                float max = (((Math.max(f7, f9) - Math.min(f7, f9)) / 2.0f) + Math.min(f7, f9)) * this.o * this.p;
                Matrix matrix = this.q;
                matrix.reset();
                matrix.setRotate((fArr5[i2] * f4) + f10, f, f2);
                float[] fArr6 = this.k;
                fArr6[0] = f;
                float f12 = f2 - f7;
                fArr6[1] = f12;
                fArr6[2] = f + max;
                fArr6[3] = f12;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.l;
                fArr7[0] = f;
                float f13 = f2 - f9;
                fArr7[1] = f13;
                fArr7[2] = f - max;
                fArr7[3] = f13;
                matrix.reset();
                matrix.setRotate(f11, f, f2);
                matrix.mapPoints(fArr7);
                if (i2 == 0) {
                    path.moveTo(fArr6[0], fArr6[1]);
                }
                path.cubicTo(fArr6[2], fArr6[3], fArr7[2], fArr7[3], fArr7[0], fArr7[1]);
                i2 = i3;
            } else {
                canvas.save();
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
        }
    }

    public final void b() {
        for (int i = 0; i < this.n; i++) {
            c(this.e, this.f, i);
            c(this.g, this.h, i);
            this.i[i] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i) {
        float f = this.n;
        float f2 = this.b;
        float f3 = this.a;
        Random random = this.m;
        fArr[i] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f2 - f3)) + f3;
        fArr2[i] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f) * 0.05f) + ((360.0f / f) * i);
        this.j[i] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(boolean z, float f) {
        this.s = f;
        if (!e86.e(this.r)) {
            return;
        }
        float f2 = this.s;
        float f3 = this.t;
        if (z) {
            int i = (f2 > f3 ? 1 : (f2 == f3 ? 0 : -1));
            float f4 = f2 - f3;
            if (i > 0) {
                this.u = f4 / 205.0f;
                return;
            } else {
                this.u = f4 / 275.0f;
                return;
            }
        }
        int i2 = (f2 > f3 ? 1 : (f2 == f3 ? 0 : -1));
        float f5 = f2 - f3;
        if (i2 > 0) {
            this.u = f5 / 320.0f;
        } else {
            this.u = f5 / 375.0f;
        }
    }

    public final void e(float f, float f2) {
        if (e86.e(this.r)) {
            for (int i = 0; i < this.n; i++) {
                float[] fArr = this.i;
                float f3 = fArr[i];
                float f4 = this.j[i];
                float f5 = (f4 * f * 8.2f * f2) + (0.8f * f4) + f3;
                fArr[i] = f5;
                if (f5 >= 1.0f) {
                    fArr[i] = 0.0f;
                    float[] fArr2 = this.g;
                    this.e[i] = fArr2[i];
                    float[] fArr3 = this.h;
                    this.f[i] = fArr3[i];
                    c(fArr2, fArr3, i);
                }
            }
        }
    }

    public final void f(long j) {
        float f = this.s;
        float f2 = this.t;
        if (f != f2) {
            float f3 = this.u;
            float f4 = (((float) j) * f3) + f2;
            this.t = f4;
            if (f3 > 0.0f) {
                if (f4 > f) {
                    this.t = f;
                }
            } else if (f4 < f) {
                this.t = f;
            }
        }
    }

    public fl0(int i) {
        this(i, 512);
    }
}
