package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
public final class n40 {
    public float f;
    public boolean g;
    public final Paint h;
    public gb2 i;
    public int p;
    public int q;
    public float r;
    public final int[] b = new int[3];
    public final float[] c = new float[8];
    public final float[] d = new float[8];
    public final float[] e = new float[8];
    public final Random j = new Random();
    public final float k = gl.L(6.0f) * 0.33f;
    public final float l = gl.L(12.0f) * 0.36f;
    public final float m = 120.0f;
    public final byte n = 61;
    public final float[] o = new float[6];
    public final gh2[] a = new gh2[2];

    public n40() {
        for (int i = 0; i < 2; i++) {
            gh2[] gh2VarArr = this.a;
            gh2 gh2Var = new gh2();
            gh2VarArr[i] = gh2Var;
            gh2Var.g = gl.L(24.0f);
            gh2Var.j = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f, float f2, float f3, int i, Canvas canvas) {
        if (!e66.e(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i);
        paint.setAlpha((int) (this.n * f3));
        b(canvas, f, f2);
    }

    public final void b(Canvas canvas, float f, float f2) {
        float[] fArr;
        float f3;
        int[] iArr;
        if (e66.e(32)) {
            int i = 0;
            int i2 = 0;
            while (true) {
                fArr = this.d;
                if (i2 >= 8) {
                    break;
                }
                float[] fArr2 = this.c;
                float f4 = fArr2[i2];
                float f5 = fArr[i2];
                if (f4 != f5) {
                    float[] fArr3 = this.e;
                    float f6 = (fArr3[i2] * 16.0f) + f5;
                    fArr[i2] = f6;
                    float f7 = fArr3[i2];
                    if ((f7 > 0.0f && f6 > fArr2[i2]) || (f7 < 0.0f && f6 < fArr2[i2])) {
                        fArr[i2] = fArr2[i2];
                    }
                    this.i.invalidate();
                }
                i2++;
            }
            boolean z = this.g;
            float f8 = this.f;
            char c = 1;
            if (z) {
                float f9 = f8 + 0.02f;
                this.f = f9;
                if (f9 > 1.0f) {
                    this.g = false;
                    this.f = 1.0f;
                }
            } else {
                float f10 = f8 - 0.02f;
                this.f = f10;
                if (f10 < 0.0f) {
                    this.g = true;
                    this.f = 0.0f;
                }
            }
            float f11 = fArr[7];
            float f12 = fArr[6] * fArr[0];
            if (f11 == 0.0f && f12 == 0.0f) {
                return;
            }
            int i3 = 0;
            while (true) {
                f3 = this.l;
                iArr = this.b;
                if (i3 >= 3) {
                    break;
                }
                iArr[i3] = (int) (fArr[i3] * f3);
                i3++;
            }
            gh2[] gh2VarArr = this.a;
            gh2 gh2Var = gh2VarArr[0];
            while (i < gh2Var.f) {
                float[] fArr4 = gh2Var.i;
                fArr4[i] = iArr[i / 2];
                fArr4[i + 1] = 0.0f;
                i += 2;
                c = c;
            }
            char c2 = c;
            for (int i4 = 0; i4 < 3; i4++) {
                iArr[i4] = (int) (fArr[i4 + 3] * f3);
            }
            gh2 gh2Var2 = gh2VarArr[c2];
            for (int i5 = 0; i5 < gh2Var2.f; i5 += 2) {
                float[] fArr5 = gh2Var2.i;
                fArr5[i5] = iArr[i5 / 2];
                fArr5[i5 + 1] = 0.0f;
            }
            float L = (this.k * f11) + (gl.L(4.0f) * f12) + gl.L(22.0f);
            if (L > gl.L(26.0f)) {
                L = gl.L(26.0f);
            }
            gh2 gh2Var3 = gh2VarArr[0];
            gh2VarArr[c2].g = L;
            gh2Var3.g = L;
            canvas.save();
            float f13 = (float) (this.r + 0.6d);
            this.r = f13;
            canvas.rotate(f13, f, f2);
            canvas.save();
            float f14 = (this.f * 0.04f) + 1.0f;
            canvas.scale(f14, f14, f, f2);
            gh2 gh2Var4 = gh2VarArr[0];
            Paint paint = this.h;
            gh2Var4.a(f, f2, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f, f2);
            float A = tb4.A(1.0f, this.f, 0.04f, 1.0f);
            canvas.scale(A, A, f, f2);
            gh2VarArr[c2].a(f, f2, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f, float f2, boolean z, float f3, wjb wjbVar) {
        if (!e66.e(32)) {
            return;
        }
        byte b = this.n;
        Paint paint = this.h;
        if (z) {
            paint.setColor(bkb.v0(bkb.Dc, wjbVar));
            paint.setAlpha((int) (b * f3));
        } else {
            paint.setColor(bkb.v0(bkb.Ye, wjbVar));
            paint.setAlpha((int) (b * f3));
        }
        b(canvas, f, f2);
    }

    public final void d(boolean z, float[] fArr) {
        boolean z2;
        float f;
        float f2;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        if (!e66.e(32)) {
            return;
        }
        float f3 = 0.0f;
        int i = 0;
        if (fArr != null && fArr[6] == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fArr == null) {
            f = 0.0f;
        } else {
            f = fArr[6];
        }
        float[] fArr5 = this.o;
        if (fArr != null && f > 0.4d) {
            int i2 = this.q;
            fArr5[i2] = f;
            int i3 = i2 + 1;
            this.q = i3;
            if (i3 > 5) {
                this.q = 0;
            }
            this.p++;
        } else {
            this.p = 0;
        }
        if (z2) {
            for (int i4 = 0; i4 < 6; i4++) {
                fArr[i4] = (this.j.nextInt() % 500) / 1000.0f;
            }
        }
        float f4 = this.m;
        if (z2) {
            f2 = 2.0f * f4;
        } else {
            f2 = f4;
        }
        if (this.p > 6) {
            float f5 = 0.0f;
            for (int i5 = 0; i5 < 6; i5++) {
                f5 += fArr5[i5];
            }
            float f6 = f5 / 6.0f;
            if (f6 > 0.52f) {
                f2 = ls6.B(f6, 0.4f, f4, f2);
            }
        }
        while (true) {
            fArr2 = this.e;
            fArr3 = this.c;
            fArr4 = this.d;
            if (i >= 7) {
                break;
            }
            if (fArr == null) {
                fArr3[i] = 0.0f;
            } else {
                fArr3[i] = fArr[i];
            }
            if (this.i == null) {
                fArr4[i] = fArr3[i];
            } else if (i == 6) {
                fArr2[i] = (fArr3[i] - fArr4[i]) / (80.0f + f4);
            } else {
                fArr2[i] = (fArr3[i] - fArr4[i]) / f2;
            }
            i++;
        }
        if (z) {
            f3 = 1.0f;
        }
        fArr3[7] = f3;
        fArr2[7] = (f3 - fArr4[7]) / 120.0f;
    }
}
