package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.os.Build;
import android.os.SystemClock;
import java.util.Random;
public final class om3 {
    public static float U;
    public final int[] A;
    public final int[] B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public final float[] I;
    public final float[] J;
    public final float[] K;
    public final float[] L;
    public final float[] M;
    public final float[] N;
    public final float[] O;
    public final float[] P;
    public final int[] Q;
    public final boolean[] R;
    public final boolean[] S;
    public float T;
    public final Paint a;
    public final Object b;
    public final Paint c;
    public final Paint d;
    public final Matrix e;
    public final Paint f;
    public final RectF g;
    public boolean h;
    public final long i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public final float[] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public final float[] q;
    public final int[] r;
    public final boolean[] s;
    public final Random t;
    public long u;
    public float v;
    public float w;
    public final Path x;
    public final RectF y;
    public final float[] z;

    public om3() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Matrix();
        this.f = new Paint(1);
        this.g = new RectF();
        this.h = true;
        this.i = SystemClock.uptimeMillis();
        this.j = new float[140];
        this.k = new float[140];
        this.l = new float[140];
        this.m = new float[140];
        this.n = new float[140];
        this.o = new float[140];
        this.p = new float[140];
        this.q = new float[140];
        this.r = new int[140];
        this.s = new boolean[140];
        this.t = new Random();
        this.x = new Path();
        this.y = new RectF();
        this.z = new float[]{0.08f, 0.73f, 0.76f, 0.1f, 0.74f, 0.52f, 0.19f, 0.6f, 0.93f, 0.72f, 0.98f, 0.9f};
        this.A = new int[]{-15420490, -14699385, -13787165};
        this.B = new int[7];
        this.C = -1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.I = new float[140];
        this.J = new float[140];
        this.K = new float[140];
        this.L = new float[140];
        this.M = new float[140];
        this.N = new float[140];
        this.O = new float[140];
        this.P = new float[140];
        this.Q = new int[140];
        this.R = new boolean[140];
        this.S = new boolean[140];
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                nm3.c();
                RuntimeShader a = nm3.a();
                this.b = a;
                paint.setShader(a);
            } catch (Throwable unused) {
                this.b = null;
            }
        }
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.d.setStyle(style);
    }

    public static boolean c(int i) {
        if (gl.B(i) < 0.5f) {
            return true;
        }
        return false;
    }

    public static int d(int i) {
        if (U == 0.0f) {
            return i;
        }
        Color.colorToHSV(i, r0);
        float[] fArr = {(((U + 205.0f) % 360.0f) + 360.0f) % 360.0f};
        return Color.HSVToColor(Color.alpha(i), fArr);
    }

    public static int e(int i) {
        if (U == 0.0f) {
            return i;
        }
        Color.colorToHSV(i, r0);
        float[] fArr = {(((fArr[0] + U) % 360.0f) + 360.0f) % 360.0f};
        return Color.HSVToColor(Color.alpha(i), fArr);
    }

    public static void h(int i) {
        float f = 0.0f;
        if (i != 0) {
            float[] fArr = new float[3];
            Color.colorToHSV(i | (-16777216), fArr);
            if (fArr[1] >= 0.25f && fArr[2] >= 0.25f) {
                float f2 = fArr[0] - 205.0f;
                while (f2 > 180.0f) {
                    f2 -= 360.0f;
                }
                while (f2 < -180.0f) {
                    f2 += 360.0f;
                }
                if (Math.abs(f2) >= 12.0f) {
                    f = f2;
                }
            }
        }
        U = f;
    }

    public static int[] k(boolean z) {
        int[] iArr;
        if (U == 0.0f) {
            return null;
        }
        if (z) {
            iArr = (int[]) kra.T.clone();
        } else {
            iArr = (int[]) kra.U.clone();
        }
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = e(iArr[i]);
        }
        return iArr;
    }

    public final int a(float f, float f2, RectF rectF) {
        float c;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        if (rectF == null || rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return 0;
        }
        float uptimeMillis = ((float) ((SystemClock.uptimeMillis() - this.i) % 3600000)) / 1000.0f;
        if (this.h) {
            c = 1.0f;
        } else {
            c = pm3.c(8);
        }
        float f12 = uptimeMillis * c;
        float atan2 = (float) Math.atan2((f2 - rectF.centerY()) / Math.max(rectF.height() / 2.0f, 1.0f), (f - rectF.centerX()) / Math.max(rectF.width() / 2.0f, 1.0f));
        float max = (f - rectF.left) / Math.max(rectF.height(), 1.0f);
        if (this.h) {
            f9 = 0.12f;
            f10 = 0.22f;
            f11 = 0.33f;
            f6 = 1.0f;
            f5 = 0.86f;
            f7 = 0.43f;
            f3 = 0.4f;
            f8 = 1.0f;
            f4 = 1.0f;
        } else {
            float[] fArr = this.z;
            float f13 = fArr[0];
            f3 = fArr[1];
            f4 = fArr[2];
            float f14 = fArr[3];
            f5 = fArr[4];
            f6 = fArr[5];
            f7 = fArr[6];
            float f15 = fArr[7];
            f8 = fArr[8];
            f9 = f13;
            f10 = f14;
            f11 = f15;
        }
        float sin = (((float) Math.sin((0.9f * f12) + atan2)) * 0.5f) + 0.5f;
        float sin2 = (((float) Math.sin((1.3f * max) + ((atan2 * 2.0f) - (f12 * 0.6f)))) * 0.5f) + 0.5f;
        float A = tb4.A(f10, f9, sin, f9);
        float A2 = tb4.A(f5, f3, sin, f3);
        float A3 = tb4.A(f6, f4, sin, f4);
        int rgb = Color.rgb(Math.round(Math.min(1.0f, tb4.A(f7, A, sin2, A)) * 255.0f), Math.round(Math.min(1.0f, tb4.A(f11, A2, sin2, A2)) * 255.0f), Math.round(Math.min(1.0f, tb4.A(f8, A3, sin2, A3)) * 255.0f));
        if (this.h) {
            return e(rgb);
        }
        return rgb;
    }

    public final void b(float r54, float r55, float r56, float r57, android.graphics.Canvas r58, android.graphics.RectF r59) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om3.b(float, float, float, float, android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void f() {
        for (int i = 0; i < 140; i++) {
            this.R[i] = false;
        }
        for (int i2 = 0; i2 < 140; i2++) {
            this.s[i2] = false;
        }
    }

    public final void g(int i, int i2) {
        float[] i3;
        boolean z;
        char c;
        char c2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        pm3.f();
        float[] fArr = pm3.f;
        float f8 = fArr[2];
        float f9 = fArr[1];
        float f10 = pm3.i(i)[0];
        float h = pm3.h(i);
        float h2 = pm3.h(i2);
        if (((float) Math.hypot(i3[1], i3[2])) < 0.035f) {
            z = true;
        } else {
            z = false;
        }
        int i4 = pm3.e;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        float f11 = fArr[9];
                        if (z) {
                            f7 = h2;
                        } else {
                            f7 = h;
                        }
                        float f12 = f7 - (0.7f * f11);
                        float f13 = (f11 * 0.6f) + f7;
                        f5 = pm3.d(f7);
                        f6 = pm3.d(f12);
                        f3 = pm3.d(f13);
                        c = 1;
                        f8 = yjb.f(f10, 0.16f, 0.95f, f8);
                    } else {
                        c = 1;
                        f6 = h2 - 28.0f;
                        f3 = h2 + 28.0f;
                        c2 = 4;
                        f = h2;
                        f2 = f6;
                    }
                } else {
                    c = 1;
                    f5 = 30.0f;
                    f6 = 350.0f;
                    f3 = 60.0f;
                }
                c2 = 4;
            } else {
                c = 1;
                f5 = 160.0f;
                f6 = 285.0f;
                c2 = 4;
                f3 = 205.0f;
            }
            f = f5;
            f2 = f6;
        } else {
            c = 1;
            c2 = 4;
            f = 230.0f;
            f2 = 200.0f;
            f3 = 255.0f;
        }
        int a = pm3.a(f8, f9, f);
        int[] iArr = this.B;
        iArr[0] = a;
        iArr[c] = pm3.a(f8, f9, f2);
        iArr[2] = pm3.a(f8, f9, f3);
        iArr[3] = pm3.g(Math.min(0.98f, f8 + 0.12f), 0.5f * f9, f);
        if (pm3.e != 0) {
            f4 = Math.min(0.62f, f8 - 0.1f);
        } else {
            f9 = 0.2f;
            f4 = 0.55f;
            if (!z) {
                int i5 = pm3.c;
                if (i5 == 0) {
                    f = fArr[0] + h;
                } else if (i5 != 2) {
                    f4 = Math.max(0.42f, Math.min(0.58f, f10 - 0.12f));
                    f9 = 0.24f;
                    f = h;
                }
            }
            f = h2;
        }
        iArr[c2] = pm3.g(f4, f9, f);
        float max = Math.max(205.0f, Math.min(235.0f, ((((((h - h2) % 360.0f) + 540.0f) % 360.0f) - 180.0f) * fArr[10]) + h2));
        iArr[5] = pm3.g(0.62f, 0.16f, max - 12.0f);
        iArr[6] = pm3.g(0.58f, 0.18f, max + 4.0f);
        int i6 = 0;
        while (true) {
            float[] fArr2 = this.z;
            if (i6 < 3) {
                int i7 = i6 * 3;
                fArr2[i7] = Color.red(iArr[i6]) / 255.0f;
                fArr2[i7 + 1] = Color.green(iArr[i6]) / 255.0f;
                fArr2[i7 + 2] = Color.blue(iArr[i6]) / 255.0f;
                this.A[i6] = iArr[i6];
                i6++;
            } else {
                fArr2[9] = Color.red(iArr[3]) / 255.0f;
                fArr2[10] = Color.green(iArr[3]) / 255.0f;
                fArr2[11] = Color.blue(iArr[3]) / 255.0f;
                return;
            }
        }
    }

    public final void i() {
        this.E = 0.7f;
        this.F = 0.6f;
        this.G = 0.85f;
    }

    public final void j(float f, float f2, float f3, float f4, float f5, float f6) {
        float[] fArr;
        float[] fArr2;
        boolean[] zArr;
        int i = 0;
        float f7 = -1.0f;
        int i2 = 0;
        while (true) {
            fArr = this.n;
            fArr2 = this.o;
            zArr = this.s;
            if (i < 140) {
                if (!zArr[i]) {
                    break;
                }
                float f8 = fArr2[i] / fArr[i];
                if (f8 > f7) {
                    i2 = i;
                    f7 = f8;
                }
                i++;
            } else {
                i = i2;
                break;
            }
        }
        this.j[i] = f;
        this.k[i] = f2;
        this.l[i] = f3;
        this.m[i] = f4;
        fArr[i] = f5;
        fArr2[i] = 0.0f;
        this.p[i] = gl.L(f6);
        Random random = this.t;
        this.q[i] = random.nextFloat() * 6.28f;
        this.r[i] = random.nextInt(3);
        zArr[i] = true;
    }
}
