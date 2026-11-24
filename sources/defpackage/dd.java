package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.SystemClock;
import java.util.Random;
public final class dd {
    public float[] D;
    public float[] E;
    public float[] F;
    public int G;
    public long I;
    public final by1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final ln e;
    public final ln f;
    public long g;
    public LinearGradient r;
    public SweepGradient s;
    public int u;
    public final Paint h = new Paint(1);
    public final Path i = new Path();
    public final Paint j = new Paint(1);
    public final Paint k = new Paint(1);
    public final Paint l = new Paint(1);
    public final Paint m = new Paint(1);
    public final Paint n = new Paint(1);
    public final Path o = new Path();
    public final RectF p = new RectF();
    public final Matrix q = new Matrix();
    public float t = -1.0f;
    public final float[] v = new float[3];
    public final float[] w = new float[3];
    public final float[] x = new float[3];
    public final float[] y = new float[3];
    public final long[] z = new long[3];
    public final int[] A = new int[3];
    public final boolean[] B = new boolean[3];
    public final Random C = new Random(5905022);
    public float H = -1.0f;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public final float[] L = new float[5];
    public final float[] M = new float[5];
    public final float[] N = new float[5];
    public final float[] O = new float[5];
    public final float[] P = new float[5];

    public dd(by1 by1Var) {
        this.a = by1Var;
        Random random = new Random(31249L);
        float[] fArr = {-1.0f, 1.0f, -0.6f, 0.7f, -0.85f};
        for (int i = 0; i < 5; i++) {
            this.L[i] = random.nextFloat() * 2.0f;
            this.M[i] = wi8.e(random, 0.55f, 0.75f);
            this.N[i] = fArr[i] * gm.L(random.nextInt(5) + 9);
            this.O[i] = gm.L((random.nextFloat() * 1.4f) + 1.6f);
            this.P[i] = gm.L(random.nextInt(6) + 6);
        }
        this.e = new ln(by1Var, 0L, 420L, d53.h);
        this.f = new ln(by1Var, 0L, 360L, d53.g);
        this.i.moveTo(0.0f, -1.0f);
        this.i.quadTo(0.2f, -0.2f, 1.0f, 0.0f);
        this.i.quadTo(0.2f, 0.2f, 0.0f, 1.0f);
        this.i.quadTo(-0.2f, 0.2f, -1.0f, 0.0f);
        this.i.quadTo(-0.2f, -0.2f, 0.0f, -1.0f);
        this.i.close();
        Paint paint = this.k;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.k;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.m.setStyle(style);
        this.m.setStrokeCap(cap);
    }

    public final void a(float f, int i) {
        if (this.t == f && this.u == i) {
            return;
        }
        this.t = f;
        this.u = i;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f * 2.2f, 0.0f, new int[]{16777215, 16777215, 956301311, 16777215, 16777215}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.REPEAT);
        this.r = linearGradient;
        this.j.setShader(linearGradient);
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, new int[]{9497855, 9497855, -1935871745, -421988097, -1}, new float[]{0.0f, 0.55f, 0.8f, 0.95f, 1.0f});
        this.s = sweepGradient;
        this.k.setShader(sweepGradient);
        int f2 = on2.f(0.55f, i, -6297345) & 16777215;
        this.n.setShader(new RadialGradient(0.0f, 0.0f, f + gm.L(4.0f), new int[]{f2, Integer.MIN_VALUE | f2, f2}, new float[]{(f - gm.L(1.0f)) / (gm.L(4.0f) + f), (gm.L(0.5f) + f) / (f + gm.L(4.0f)), 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(android.graphics.Canvas r56, android.graphics.RectF r57, int r58, int r59) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd.b(android.graphics.Canvas, android.graphics.RectF, int, int):void");
    }

    public final void c(boolean z) {
        long j;
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (z) {
            this.g = SystemClock.uptimeMillis();
        }
        if (z) {
            j = 300;
        } else {
            j = 560;
        }
        this.f.g = j;
        this.a.invalidate();
    }

    public final float d() {
        return ((float) (SystemClock.uptimeMillis() - this.g)) / 1000.0f;
    }
}
