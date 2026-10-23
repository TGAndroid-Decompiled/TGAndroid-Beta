package h0;

import com.google.android.gms.internal.play_billing.k3;
public final class k {
    public static final k f11635k;
    public final float f11636a;
    public final float f11637b;
    public final float f11638c;
    public final float d;
    public final float e;
    public final float f11639f;
    public final float[] f11640g;
    public final float h;
    public final float f11641i;
    public final float f11642j;

    static {
        float f7;
        float[] fArr;
        float j10 = (float) ((b.j() * 63.66197723675813d) / 100.0d);
        float[] fArr2 = b.f11617c;
        float f10 = fArr2[0];
        float[][] fArr3 = b.f11615a;
        float[] fArr4 = fArr3[0];
        float f11 = fArr2[1];
        float f12 = fArr4[1] * f11;
        float f13 = fArr2[2];
        float f14 = (fArr4[2] * f13) + f12 + (fArr4[0] * f10);
        float[] fArr5 = fArr3[1];
        float f15 = (fArr5[2] * f13) + (fArr5[1] * f11) + (fArr5[0] * f10);
        float[] fArr6 = fArr3[2];
        float f16 = (f13 * fArr6[2]) + (f11 * fArr6[1]) + (f10 * fArr6[0]);
        if (1.0f >= 0.9d) {
            f7 = 0.69f;
        } else {
            f7 = 0.655f;
        }
        float f17 = f7;
        float B = k3.B((float) Math.exp(((-j10) - 42.0f) / 92.0f), 0.2777778f, 1.0f, 1.0f);
        double d = B;
        if (d > 1.0d) {
            B = 1.0f;
        } else if (d < 0.0d) {
            B = 0.0f;
        }
        float f18 = 1.0f / ((5.0f * j10) + 1.0f);
        float C = k3.C(f18, f18, f18, f18);
        float f19 = 1.0f - C;
        float cbrt = (0.1f * f19 * f19 * ((float) Math.cbrt(j10 * 5.0d))) + (C * j10);
        float j11 = b.j() / fArr2[1];
        double d10 = j11;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr[1] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr[2] * cbrt) * f16) / 100.0d, 0.42d)};
        float f20 = fArr7[0];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr7[1];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[2];
        float[] fArr8 = {f21, f23, (400.0f * f24) / (f24 + 27.13f)};
        f11635k = new k(j11, k3.A(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], pow), pow, pow, f17, 1.0f, new float[]{(((100.0f / f14) * B) + 1.0f) - B, (((100.0f / f15) * B) + 1.0f) - B, (((100.0f / f16) * B) + 1.0f) - B}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public k(float f7, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f11639f = f7;
        this.f11636a = f10;
        this.f11637b = f11;
        this.f11638c = f12;
        this.d = f13;
        this.e = f14;
        this.f11640g = fArr;
        this.h = f15;
        this.f11641i = f16;
        this.f11642j = f17;
    }
}
