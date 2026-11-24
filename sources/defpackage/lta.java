package defpackage;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.os.Build;
public final class lta {
    public static final int[] T = {-10504961, -13056257, -9445121, -5841665, -11544336, -7362817, -8468225, -3870977};
    public static final int[] U = {-15233051, -14054705, -14776080, -14575888, -15233051, -14975018, -13984526, -11554059};
    public final boolean[] A;
    public int B;
    public int C;
    public int D;
    public final float[] E;
    public final float[] F;
    public final int[] G = new int[72];
    public final int[] H = new int[72];
    public final short[] I;
    public int J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public long N;
    public float O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public int[] a;
    public final short b;
    public final float[] c;
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
    public final byte[] o;
    public final byte[] p;
    public final byte[] q;
    public final boolean[] r;
    public boolean s;
    public int[] t;
    public float u;
    public final float[] v;
    public final float[] w;
    public final float[] x;
    public final float[] y;
    public final float[] z;

    public lta(int i) {
        Paint paint = new Paint(1);
        this.K = paint;
        Paint paint2 = new Paint(1);
        this.L = paint2;
        this.P = 49734321;
        this.Q = gm.L(16.0f);
        this.b = i;
        this.c = new float[i];
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
        this.o = new byte[i];
        this.p = new byte[i];
        this.q = new byte[i];
        this.r = new boolean[i];
        this.I = new short[i];
        int i2 = i << 1;
        this.E = new float[i2];
        this.F = new float[i2];
        this.v = new float[i2];
        this.w = new float[i];
        this.x = new float[i];
        this.y = new float[i];
        this.z = new float[i];
        this.A = new boolean[i];
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStrokeCap(cap);
    }

    public final void a() {
        for (int i = 0; i < this.b; i++) {
            this.h[i] = 0.0f;
        }
        this.D = 0;
        this.N = 0L;
    }

    public final boolean b(android.graphics.Canvas r54, float r55) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lta.b(android.graphics.Canvas, float):boolean");
    }

    public final void c(float f, float f2, int i) {
        int i2;
        this.h[i] = Math.max(0.05f, f);
        this.g[i] = -f2;
        this.i[i] = d() * 6.2832f;
        this.j[i] = d() * 8.0f;
        int i3 = 0;
        this.r[i] = false;
        float d = d();
        if (d < 0.5f) {
            i2 = 0;
        } else if (d < 0.86f) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.o[i] = (byte) i2;
        if (d() < 0.07f) {
            i3 = 1;
        }
        this.p[i] = (byte) i3;
    }

    public final float d() {
        int i = this.P;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        this.P = i4;
        return (i4 >>> 8) / 1.6777216E7f;
    }

    public final void e(boolean z) {
        this.M = z;
        if (Build.VERSION.SDK_INT >= 29) {
            this.L.setBlendMode(z ? BlendMode.PLUS : BlendMode.SRC_OVER);
        }
    }

    public final int f() {
        int i = this.C;
        this.C = (i + 1) % this.b;
        if (this.h[i] <= 0.0f) {
            this.D++;
        }
        return i;
    }

    public final void g(float f, float f2, float f3, float f4, float f5, float f6) {
        int f7 = f();
        this.c[f7] = f;
        this.d[f7] = f2;
        this.e[f7] = f3;
        this.f[f7] = f4;
        this.q[f7] = 0;
        c(f5, f6, f7);
    }

    public final void h(float f, float f2, float f3, float f4, float f5) {
        int f6 = f();
        this.c[f6] = f;
        this.m[f6] = f;
        this.n[f6] = f2;
        this.d[f6] = f2;
        this.k[f6] = f3;
        this.l[f6] = f4;
        this.f[f6] = 0.0f;
        this.e[f6] = 0.0f;
        this.q[f6] = 1;
        c(f5, 0.0f, f6);
    }

    public final void i(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        int i;
        int f9 = f();
        this.c[f9] = f;
        this.m[f9] = f;
        this.d[f9] = f2;
        this.n[f9] = f2;
        this.k[f9] = f5;
        this.l[f9] = f6;
        this.e[f9] = f3;
        this.f[f9] = f4;
        this.q[f9] = 2;
        c(f7, f8, f9);
        this.x[f9] = 0.0f;
        this.w[f9] = 0.0f;
        this.A[f9] = false;
        if (this.s) {
            if (d() < this.u) {
                i = 1;
            } else {
                i = 0;
            }
            byte b = (byte) i;
            this.p[f9] = b;
            if (b != 0) {
                this.o[f9] = 0;
            }
        }
    }

    public final void j(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        i(f, f2, f3, f4, f5, f6, f7, f8);
        int i2 = this.C;
        short s = this.b;
        int i3 = ((i2 + s) - 1) % s;
        this.j[i3] = Math.max(0, Math.min(7, i));
        this.r[i3] = true;
    }
}
