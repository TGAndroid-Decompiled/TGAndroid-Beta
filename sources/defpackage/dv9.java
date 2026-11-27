package defpackage;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
public final class dv9 {
    public static final float v = 0.6f;
    public static final float[] w = new float[101];
    public static final float x;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;
    public float n;
    public float o;
    public float p;
    public final DecelerateInterpolator r;
    public float t;
    public final float u;
    public boolean q = true;
    public final boolean s = true;

    static {
        float f;
        float f2;
        float f3 = 0.0f;
        for (int i = 0; i <= 100; i++) {
            float f4 = i / 100.0f;
            float f5 = 1.0f;
            while (true) {
                float z = bp1.z(f5, f3, 2.0f, f3);
                float f6 = 1.0f - z;
                f = 3.0f * z * f6;
                f2 = z * z * z;
                float z2 = xnb.z(z, v, f6 * 0.4f, f) + f2;
                if (Math.abs(z2 - f4) < 1.0E-5d) {
                    break;
                } else if (z2 > f4) {
                    f5 = z;
                } else {
                    f3 = z;
                }
            }
            w[i] = f + f2;
        }
        w[100] = 1.0f;
        x = 1.0f;
        x = 1.0f / e(1.0f);
    }

    public dv9(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.r = decelerateInterpolator;
        this.u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f) {
        float A;
        float f2 = f * 8.0f;
        if (f2 < 1.0f) {
            A = f2 - (1.0f - ((float) Math.exp(-f2)));
        } else {
            A = qd4.A(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f);
        }
        return A * x;
    }

    public final void a() {
        this.j = this.d;
        this.k = this.e;
        this.q = true;
    }

    public final boolean b() {
        float interpolation;
        if (this.q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.l);
        int i = this.m;
        if (currentAnimationTimeMillis < i) {
            boolean z = this.a;
            if (z) {
                if (z) {
                    float f = currentAnimationTimeMillis / i;
                    int i2 = (int) (f * 100.0f);
                    float f2 = i2 / 100.0f;
                    int i3 = i2 + 1;
                    float[] fArr = w;
                    float f3 = fArr[i2];
                    float A = qd4.A(fArr[i3], f3, (f - f2) / ((i3 / 100.0f) - f2), f3);
                    int i4 = this.b;
                    int round = Math.round((this.d - i4) * A) + i4;
                    this.j = round;
                    int min = Math.min(round, this.g);
                    this.j = min;
                    this.j = Math.max(min, this.f);
                    int i5 = this.c;
                    int round2 = Math.round(A * (this.e - i5)) + i5;
                    this.k = round2;
                    int min2 = Math.min(round2, this.i);
                    this.k = min2;
                    int max = Math.max(min2, this.h);
                    this.k = max;
                    if (this.j == this.d && max == this.e) {
                        this.q = true;
                    }
                }
                return true;
            }
            float f4 = currentAnimationTimeMillis * this.n;
            DecelerateInterpolator decelerateInterpolator = this.r;
            if (decelerateInterpolator == null) {
                interpolation = e(f4);
            } else {
                interpolation = decelerateInterpolator.getInterpolation(f4);
            }
            this.j = Math.round(this.o * interpolation) + this.b;
            this.k = Math.round(interpolation * this.p) + this.c;
            return true;
        }
        this.j = this.d;
        this.k = this.e;
        this.q = true;
        return true;
    }

    public final void c(int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv9.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(int i, int i2) {
        this.a = false;
        this.q = false;
        this.m = i2;
        this.l = AnimationUtils.currentAnimationTimeMillis();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = i;
        this.o = 0.0f;
        this.p = i;
        this.n = 1.0f / this.m;
    }
}
