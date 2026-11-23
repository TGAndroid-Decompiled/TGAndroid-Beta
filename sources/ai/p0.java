package ai;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.os.Build;
import android.os.SystemClock;
import java.util.Random;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.yu0;
public final class p0 {
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
    public final Paint f1452a;
    public final Object f1453b;
    public final Paint f1454c;
    public final Paint d;
    public final Matrix f1455e;
    public final Paint f1456f;
    public final RectF f1457g;
    public boolean h;
    public final long f1458i;
    public final float[] f1459j;
    public final float[] f1460k;
    public final float[] f1461l;
    public final float[] f1462m;
    public final float[] f1463n;
    public final float[] f1464o;
    public final float[] f1465p;
    public final float[] f1466q;
    public final int[] f1467r;
    public final boolean[] f1468s;
    public final Random f1469t;
    public long f1470u;
    public float v;
    public float f1471w;
    public final Path f1472x;
    public final RectF f1473y;
    public final float[] f1474z;

    public p0() {
        Paint paint = new Paint(1);
        this.f1452a = paint;
        this.f1454c = new Paint(1);
        this.d = new Paint(1);
        this.f1455e = new Matrix();
        this.f1456f = new Paint(1);
        this.f1457g = new RectF();
        this.h = true;
        this.f1458i = SystemClock.uptimeMillis();
        this.f1459j = new float[140];
        this.f1460k = new float[140];
        this.f1461l = new float[140];
        this.f1462m = new float[140];
        this.f1463n = new float[140];
        this.f1464o = new float[140];
        this.f1465p = new float[140];
        this.f1466q = new float[140];
        this.f1467r = new int[140];
        this.f1468s = new boolean[140];
        this.f1469t = new Random();
        this.f1472x = new Path();
        this.f1473y = new RectF();
        this.f1474z = new float[]{0.08f, 0.73f, 0.76f, 0.1f, 0.74f, 0.52f, 0.19f, 0.6f, 0.93f, 0.72f, 0.98f, 0.9f};
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
                o0.c();
                RuntimeShader a10 = o0.a();
                this.f1453b = a10;
                paint.setShader(a10);
            } catch (Throwable unused) {
                this.f1453b = null;
            }
        }
        Paint paint2 = this.f1454c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.d.setStyle(style);
    }

    public static boolean c(int i7) {
        if (org.telegram.messenger.g0.B(i7) < 0.5f) {
            return true;
        }
        return false;
    }

    public static int d(int i7) {
        if (U == 0.0f) {
            return i7;
        }
        Color.colorToHSV(i7, r0);
        float[] fArr = {(((U + 205.0f) % 360.0f) + 360.0f) % 360.0f};
        return Color.HSVToColor(Color.alpha(i7), fArr);
    }

    public static int e(int i7) {
        if (U == 0.0f) {
            return i7;
        }
        Color.colorToHSV(i7, r0);
        float[] fArr = {(((fArr[0] + U) % 360.0f) + 360.0f) % 360.0f};
        return Color.HSVToColor(Color.alpha(i7), fArr);
    }

    public static void h(int i7) {
        float f10 = 0.0f;
        if (i7 != 0) {
            float[] fArr = new float[3];
            Color.colorToHSV(i7 | (-16777216), fArr);
            if (fArr[1] >= 0.25f && fArr[2] >= 0.25f) {
                float f11 = fArr[0] - 205.0f;
                while (f11 > 180.0f) {
                    f11 -= 360.0f;
                }
                while (f11 < -180.0f) {
                    f11 += 360.0f;
                }
                if (Math.abs(f11) >= 12.0f) {
                    f10 = f11;
                }
            }
        }
        U = f10;
    }

    public static int[] k(boolean z10) {
        int[] iArr;
        if (U == 0.0f) {
            return null;
        }
        if (z10) {
            iArr = (int[]) yu0.T.clone();
        } else {
            iArr = (int[]) yu0.U.clone();
        }
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr[i7] = e(iArr[i7]);
        }
        return iArr;
    }

    public final int a(float f10, float f11, RectF rectF) {
        float c10;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        if (rectF == null || rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return 0;
        }
        float uptimeMillis = ((float) ((SystemClock.uptimeMillis() - this.f1458i) % 3600000)) / 1000.0f;
        if (this.h) {
            c10 = 1.0f;
        } else {
            c10 = q0.c(8);
        }
        float f21 = uptimeMillis * c10;
        float atan2 = (float) Math.atan2((f11 - rectF.centerY()) / Math.max(rectF.height() / 2.0f, 1.0f), (f10 - rectF.centerX()) / Math.max(rectF.width() / 2.0f, 1.0f));
        float max = (f10 - rectF.left) / Math.max(rectF.height(), 1.0f);
        if (this.h) {
            f18 = 0.12f;
            f19 = 0.22f;
            f20 = 0.33f;
            f15 = 1.0f;
            f14 = 0.86f;
            f16 = 0.43f;
            f12 = 0.4f;
            f17 = 1.0f;
            f13 = 1.0f;
        } else {
            float[] fArr = this.f1474z;
            float f22 = fArr[0];
            f12 = fArr[1];
            f13 = fArr[2];
            float f23 = fArr[3];
            f14 = fArr[4];
            f15 = fArr[5];
            f16 = fArr[6];
            float f24 = fArr[7];
            f17 = fArr[8];
            f18 = f22;
            f19 = f23;
            f20 = f24;
        }
        float sin = (((float) Math.sin((0.9f * f21) + atan2)) * 0.5f) + 0.5f;
        float sin2 = (((float) Math.sin((1.3f * max) + ((atan2 * 2.0f) - (f21 * 0.6f)))) * 0.5f) + 0.5f;
        float z10 = com.google.android.gms.internal.vision.e2.z(f19, f18, sin, f18);
        float z11 = com.google.android.gms.internal.vision.e2.z(f14, f12, sin, f12);
        float z12 = com.google.android.gms.internal.vision.e2.z(f15, f13, sin, f13);
        int rgb = Color.rgb(Math.round(Math.min(1.0f, com.google.android.gms.internal.vision.e2.z(f16, z10, sin2, z10)) * 255.0f), Math.round(Math.min(1.0f, com.google.android.gms.internal.vision.e2.z(f20, z11, sin2, z11)) * 255.0f), Math.round(Math.min(1.0f, com.google.android.gms.internal.vision.e2.z(f17, z12, sin2, z12)) * 255.0f));
        if (this.h) {
            return e(rgb);
        }
        return rgb;
    }

    public final void b(float r54, float r55, float r56, float r57, android.graphics.Canvas r58, android.graphics.RectF r59) {
        throw new UnsupportedOperationException("Method not decompiled: ai.p0.b(float, float, float, float, android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void f() {
        for (int i7 = 0; i7 < 140; i7++) {
            this.R[i7] = false;
        }
        for (int i10 = 0; i10 < 140; i10++) {
            this.f1468s[i10] = false;
        }
    }

    public final void g(int i7, int i10) {
        float[] i11;
        boolean z10;
        char c10;
        char c11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        q0.f();
        float[] fArr = q0.f1493f;
        float f17 = fArr[2];
        float f18 = fArr[1];
        float f19 = q0.i(i7)[0];
        float h = q0.h(i7);
        float h7 = q0.h(i10);
        if (((float) Math.hypot(i11[1], i11[2])) < 0.035f) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = q0.f1492e;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        float f20 = fArr[9];
                        if (z10) {
                            f16 = h7;
                        } else {
                            f16 = h;
                        }
                        float f21 = f16 - (0.7f * f20);
                        float f22 = (f20 * 0.6f) + f16;
                        f14 = q0.d(f16);
                        f15 = q0.d(f21);
                        f12 = q0.d(f22);
                        c10 = 1;
                        f17 = o10.A(f19, 0.16f, 0.95f, f17);
                    } else {
                        c10 = 1;
                        f15 = h7 - 28.0f;
                        f12 = h7 + 28.0f;
                        c11 = 4;
                        f10 = h7;
                        f11 = f15;
                    }
                } else {
                    c10 = 1;
                    f14 = 30.0f;
                    f15 = 350.0f;
                    f12 = 60.0f;
                }
                c11 = 4;
            } else {
                c10 = 1;
                f14 = 160.0f;
                f15 = 285.0f;
                c11 = 4;
                f12 = 205.0f;
            }
            f10 = f14;
            f11 = f15;
        } else {
            c10 = 1;
            c11 = 4;
            f10 = 230.0f;
            f11 = 200.0f;
            f12 = 255.0f;
        }
        int a10 = q0.a(f17, f18, f10);
        int[] iArr = this.B;
        iArr[0] = a10;
        iArr[c10] = q0.a(f17, f18, f11);
        iArr[2] = q0.a(f17, f18, f12);
        iArr[3] = q0.g(Math.min(0.98f, f17 + 0.12f), 0.5f * f18, f10);
        if (q0.f1492e != 0) {
            f13 = Math.min(0.62f, f17 - 0.1f);
        } else {
            f18 = 0.2f;
            f13 = 0.55f;
            if (!z10) {
                int i13 = q0.f1491c;
                if (i13 == 0) {
                    f10 = fArr[0] + h;
                } else if (i13 != 2) {
                    f13 = Math.max(0.42f, Math.min(0.58f, f19 - 0.12f));
                    f18 = 0.24f;
                    f10 = h;
                }
            }
            f10 = h7;
        }
        iArr[c11] = q0.g(f13, f18, f10);
        float max = Math.max(205.0f, Math.min(235.0f, ((((((h - h7) % 360.0f) + 540.0f) % 360.0f) - 180.0f) * fArr[10]) + h7));
        iArr[5] = q0.g(0.62f, 0.16f, max - 12.0f);
        iArr[6] = q0.g(0.58f, 0.18f, max + 4.0f);
        int i14 = 0;
        while (true) {
            float[] fArr2 = this.f1474z;
            if (i14 < 3) {
                int i15 = i14 * 3;
                fArr2[i15] = Color.red(iArr[i14]) / 255.0f;
                fArr2[i15 + 1] = Color.green(iArr[i14]) / 255.0f;
                fArr2[i15 + 2] = Color.blue(iArr[i14]) / 255.0f;
                this.A[i14] = iArr[i14];
                i14++;
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

    public final void j(float f10, float f11, float f12, float f13, float f14, float f15) {
        float[] fArr;
        float[] fArr2;
        boolean[] zArr;
        int i7 = 0;
        float f16 = -1.0f;
        int i10 = 0;
        while (true) {
            fArr = this.f1463n;
            fArr2 = this.f1464o;
            zArr = this.f1468s;
            if (i7 < 140) {
                if (!zArr[i7]) {
                    break;
                }
                float f17 = fArr2[i7] / fArr[i7];
                if (f17 > f16) {
                    i10 = i7;
                    f16 = f17;
                }
                i7++;
            } else {
                i7 = i10;
                break;
            }
        }
        this.f1459j[i7] = f10;
        this.f1460k[i7] = f11;
        this.f1461l[i7] = f12;
        this.f1462m[i7] = f13;
        fArr[i7] = f14;
        fArr2[i7] = 0.0f;
        this.f1465p[i7] = org.telegram.messenger.g0.L(f15);
        Random random = this.f1469t;
        this.f1466q[i7] = random.nextFloat() * 6.28f;
        this.f1467r[i7] = random.nextInt(3);
        zArr[i7] = true;
    }
}
