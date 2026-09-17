package h0;

import com.google.android.gms.internal.vision.e2;
public final class l {
    public static final l f10847k;
    public final float f10848a;
    public final float f10849b;
    public final float f10850c;
    public final float d;
    public final float f10851e;
    public final float f10852f;
    public final float[] f10853g;
    public final float h;
    public final float f10854i;
    public final float f10855j;

    static {
        float f7;
        float j3 = (float) ((b.j() * 63.66197723675813d) / 100.0d);
        float[] fArr = b.f10827c;
        float f10 = fArr[0];
        float[][] fArr2 = b.f10825a;
        float[] fArr3 = fArr2[0];
        float f11 = fArr[1];
        float f12 = fArr3[1] * f11;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12 + (fArr3[0] * f10);
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f10 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f7 = 0.69f;
        } else {
            f7 = 0.655f;
        }
        float exp = (1.0f - (((float) Math.exp(((-j3) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp};
        float f17 = 1.0f / ((5.0f * j3) + 1.0f);
        float C = e2.C(f17, f17, f17, f17);
        float f18 = 1.0f - C;
        float cbrt = (0.1f * f18 * f18 * ((float) Math.cbrt(j3 * 5.0d))) + (C * j3);
        float j10 = b.j() / fArr[1];
        double d10 = j10;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f16) / 100.0d, 0.42d)};
        float f19 = fArr7[0];
        float f20 = (f19 * 400.0f) / (f19 + 27.13f);
        float f21 = fArr7[1];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[2];
        float[] fArr8 = {f20, f22, (400.0f * f23) / (f23 + 27.13f)};
        f10847k = new l(j10, e2.B(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], pow), pow, pow, f7, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public l(float f7, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f10852f = f7;
        this.f10848a = f10;
        this.f10849b = f11;
        this.f10850c = f12;
        this.d = f13;
        this.f10851e = f14;
        this.f10853g = fArr;
        this.h = f15;
        this.f10854i = f16;
        this.f10855j = f17;
    }
}
