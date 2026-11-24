package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
public final class n50 {
    public float f;
    public boolean g;
    public final Paint h;
    public rc2 i;
    public int p;
    public int q;
    public float r;
    public final int[] b = new int[3];
    public final float[] c = new float[8];
    public final float[] d = new float[8];
    public final float[] e = new float[8];
    public final Random j = new Random();
    public final float k = gm.L(6.0f) * 0.33f;
    public final float l = gm.L(12.0f) * 0.36f;
    public final float m = 120.0f;
    public final byte n = 61;
    public final float[] o = new float[6];
    public final ui2[] a = new ui2[2];

    public n50() {
        for (int i = 0; i < 2; i++) {
            ui2[] ui2VarArr = this.a;
            ui2 ui2Var = new ui2();
            ui2VarArr[i] = ui2Var;
            ui2Var.g = gm.L(24.0f);
            ui2Var.j = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f, float f2, float f3, int i, Canvas canvas) {
        if (!e86.e(32)) {
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
        if (e86.e(32)) {
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
            ui2[] ui2VarArr = this.a;
            ui2 ui2Var = ui2VarArr[0];
            while (i < ui2Var.f) {
                float[] fArr4 = ui2Var.i;
                fArr4[i] = iArr[i / 2];
                fArr4[i + 1] = 0.0f;
                i += 2;
                c = c;
            }
            char c2 = c;
            for (int i4 = 0; i4 < 3; i4++) {
                iArr[i4] = (int) (fArr[i4 + 3] * f3);
            }
            ui2 ui2Var2 = ui2VarArr[c2];
            for (int i5 = 0; i5 < ui2Var2.f; i5 += 2) {
                float[] fArr5 = ui2Var2.i;
                fArr5[i5] = iArr[i5 / 2];
                fArr5[i5 + 1] = 0.0f;
            }
            float L = (this.k * f11) + (gm.L(4.0f) * f12) + gm.L(22.0f);
            if (L > gm.L(26.0f)) {
                L = gm.L(26.0f);
            }
            ui2 ui2Var3 = ui2VarArr[0];
            ui2VarArr[c2].g = L;
            ui2Var3.g = L;
            canvas.save();
            float f13 = (float) (this.r + 0.6d);
            this.r = f13;
            canvas.rotate(f13, f, f2);
            canvas.save();
            float f14 = (this.f * 0.04f) + 1.0f;
            canvas.scale(f14, f14, f, f2);
            ui2 ui2Var4 = ui2VarArr[0];
            Paint paint = this.h;
            ui2Var4.a(f, f2, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f, f2);
            float A = td4.A(1.0f, this.f, 0.04f, 1.0f);
            canvas.scale(A, A, f, f2);
            ui2VarArr[c2].a(f, f2, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f, float f2, boolean z, float f3, ylb ylbVar) {
        if (!e86.e(32)) {
            return;
        }
        byte b = this.n;
        Paint paint = this.h;
        if (z) {
            paint.setColor(cmb.v0(cmb.Dc, ylbVar));
            paint.setAlpha((int) (b * f3));
        } else {
            paint.setColor(cmb.v0(cmb.Ye, ylbVar));
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
        if (!e86.e(32)) {
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
                f2 = kt6.B(f6, 0.4f, f4, f2);
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
