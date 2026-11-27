package defpackage;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.os.Build;
import java.util.Arrays;
public final class mva {
    public static final int[] V = {-10504961, -13056257, -9445121, -5841665, -11544336, -7362817, -8468225, -3870977};
    public static final int[] W = {-15233051, -14054705, -14776080, -14575888, -15233051, -14975018, -13984526, -11554059};
    public static final int[] X = {-12739585, -13662465, -11554561, -13730817, -10831617, -12939275, -13994776, -10305281};
    public static int[] Y;
    public final float[] A;
    public final boolean[] B;
    public int C;
    public int D;
    public int E;
    public final float[] F;
    public final float[] G;
    public final int[] H = new int[72];
    public final int[] I = new int[72];
    public final short[] J;
    public int K;
    public final Paint L;
    public final Paint M;
    public boolean N;
    public long O;
    public float P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public long U;
    public boolean a;
    public int[] b;
    public final short c;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public final float[] g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public final float[] m;
    public final float[] n;
    public final float[] o;
    public final byte[] p;
    public final byte[] q;
    public final byte[] r;
    public final boolean[] s;
    public boolean t;
    public int[] u;
    public float v;
    public final float[] w;
    public final float[] x;
    public final float[] y;
    public final float[] z;

    public mva(int i) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.Q = 49734321;
        this.R = hl.L(16.0f);
        this.c = i;
        this.d = new float[i];
        this.e = new float[i];
        this.f = new float[i];
        this.g = new float[i];
        this.h = new float[i];
        this.i = new float[i];
        this.j = new float[i];
        this.k = new float[i];
        this.l = new float[i];
        this.m = new float[i];
        this.n = new float[i];
        this.o = new float[i];
        this.p = new byte[i];
        this.q = new byte[i];
        this.r = new byte[i];
        this.s = new boolean[i];
        this.J = new short[i];
        int i2 = i << 1;
        this.F = new float[i2];
        this.G = new float[i2];
        this.w = new float[i2];
        this.x = new float[i];
        this.y = new float[i];
        this.z = new float[i];
        this.A = new float[i];
        this.B = new boolean[i];
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStrokeCap(cap);
    }

    public static int[] l(int i, boolean z) {
        int f;
        boolean z2;
        int i2 = i | (-16777216);
        int[] iArr = Y;
        if (iArr != null && iArr[8] == i2) {
            if (iArr[9] != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 == z) {
                return Arrays.copyOf(iArr, 8);
            }
        }
        float[] fArr = new float[8];
        if (z) {
            fArr[0] = 0.0f;
            fArr[1] = 0.1f;
            fArr[2] = 0.22f;
            fArr[3] = -0.06f;
            fArr[4] = 0.3f;
            fArr[5] = 0.14f;
            fArr[6] = -0.03f;
            fArr[7] = 0.4f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = -0.08f;
            fArr[2] = 0.1f;
            fArr[3] = -0.04f;
            fArr[4] = 0.18f;
            fArr[5] = -0.12f;
            fArr[6] = 0.05f;
            fArr[7] = 0.28f;
        }
        int[] iArr2 = new int[10];
        for (int i3 = 0; i3 < 8; i3++) {
            float f2 = fArr[i3];
            if (f2 >= 0.0f) {
                f = vm2.f(f2, i2, -1);
            } else {
                f = vm2.f(-f2, i2, -16777216);
            }
            iArr2[i3] = f;
        }
        iArr2[8] = i2;
        iArr2[9] = z ? 1 : 0;
        Y = iArr2;
        return Arrays.copyOf(iArr2, 8);
    }

    public final void a() {
        for (int i = 0; i < this.c; i++) {
            this.i[i] = 0.0f;
        }
        this.E = 0;
        this.O = 0L;
    }

    public final boolean b(android.graphics.Canvas r53, float r54) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mva.b(android.graphics.Canvas, float):boolean");
    }

    public final void c(float f, float f2, int i) {
        int i2;
        this.i[i] = Math.max(0.05f, f);
        this.h[i] = -f2;
        this.j[i] = d() * 6.2832f;
        this.k[i] = d() * 8.0f;
        int i3 = 0;
        this.s[i] = false;
        float d = d();
        if (d < 0.5f) {
            i2 = 0;
        } else if (d < 0.86f) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.p[i] = (byte) i2;
        if (d() < 0.07f) {
            i3 = 1;
        }
        this.q[i] = (byte) i3;
    }

    public final float d() {
        int i = this.Q;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        this.Q = i4;
        return (i4 >>> 8) / 1.6777216E7f;
    }

    public final void e(boolean z) {
        this.a = z;
        this.N = z;
        if (Build.VERSION.SDK_INT >= 29) {
            this.M.setBlendMode(z ? BlendMode.PLUS : BlendMode.SRC_OVER);
        }
    }

    public final void f(float f) {
        int i = this.D;
        short s = this.c;
        int i2 = ((i + s) - 1) % s;
        this.B[i2] = true;
        float f2 = this.n[i2];
        float[] fArr = this.i;
        this.z[i2] = qu6.d(f, fArr[i2], 3.0f, f2);
        this.A[i2] = qu6.d(0.0f, fArr[i2], 3.0f, this.o[i2]);
    }

    public final int g() {
        int i = this.D;
        this.D = (i + 1) % this.c;
        if (this.i[i] <= 0.0f) {
            this.E++;
        }
        return i;
    }

    public final void h(float f, float f2, float f3, float f4, float f5, float f6) {
        int g = g();
        this.d[g] = f;
        this.e[g] = f2;
        this.f[g] = f3;
        this.g[g] = f4;
        this.r[g] = 0;
        c(f5, f6, g);
    }

    public final void i(float f, float f2, float f3, float f4, float f5) {
        int g = g();
        this.d[g] = f;
        this.n[g] = f;
        this.o[g] = f2;
        this.e[g] = f2;
        this.l[g] = f3;
        this.m[g] = f4;
        this.g[g] = 0.0f;
        this.f[g] = 0.0f;
        this.r[g] = 1;
        c(f5, 0.0f, g);
    }

    public final void j(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        int i;
        int g = g();
        this.d[g] = f;
        this.n[g] = f;
        this.e[g] = f2;
        this.o[g] = f2;
        this.l[g] = f5;
        this.m[g] = f6;
        this.f[g] = f3;
        this.g[g] = f4;
        this.r[g] = 2;
        c(f7, f8, g);
        this.y[g] = 0.0f;
        this.x[g] = 0.0f;
        this.B[g] = false;
        if (this.t) {
            if (d() < this.v) {
                i = 1;
            } else {
                i = 0;
            }
            byte b = (byte) i;
            this.q[g] = b;
            if (b != 0) {
                this.p[g] = 0;
            }
        }
    }

    public final void k(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        j(f, f2, f3, f4, f5, f6, f7, f8);
        int i2 = this.D;
        short s = this.c;
        int i3 = ((i2 + s) - 1) % s;
        this.k[i3] = Math.max(0, Math.min(7, i));
        this.s[i3] = true;
    }
}
