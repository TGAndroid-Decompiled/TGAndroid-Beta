package h0;
public final class k {
    public static final k f14085k;
    public final float f14086a;
    public final float f14087b;
    public final float f14088c;
    public final float d;
    public final float f14089e;
    public final float f14090f;
    public final float[] f14091g;
    public final float h;
    public final float f14092i;
    public final float f14093j;

    static {
        float f10;
        float[] fArr;
        float j10 = (float) ((b.j() * 63.66197723675813d) / 100.0d);
        float[] fArr2 = b.f14065c;
        float f11 = fArr2[0];
        float[][] fArr3 = b.f14063a;
        float[] fArr4 = fArr3[0];
        float f12 = fArr2[1];
        float f13 = fArr4[1] * f12;
        float f14 = fArr2[2];
        float f15 = (fArr4[2] * f14) + f13 + (fArr4[0] * f11);
        float[] fArr5 = fArr3[1];
        float f16 = (fArr5[2] * f14) + (fArr5[1] * f12) + (fArr5[0] * f11);
        float[] fArr6 = fArr3[2];
        float f17 = (f14 * fArr6[2]) + (f12 * fArr6[1]) + (f11 * fArr6[0]);
        if (1.0f >= 0.9d) {
            f10 = 0.69f;
        } else {
            f10 = 0.655f;
        }
        float f18 = f10;
        float B = com.google.android.recaptcha.internal.a.B((float) Math.exp(((-j10) - 42.0f) / 92.0f), 0.2777778f, 1.0f, 1.0f);
        double d = B;
        if (d > 1.0d) {
            B = 1.0f;
        } else if (d < 0.0d) {
            B = 0.0f;
        }
        float f19 = 1.0f / ((5.0f * j10) + 1.0f);
        float C = com.google.android.recaptcha.internal.a.C(f19, f19, f19, f19);
        float f20 = 1.0f - C;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(j10 * 5.0d))) + (C * j10);
        float j11 = b.j() / fArr2[1];
        double d10 = j11;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr[0] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr[1] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr[2] * cbrt) * f17) / 100.0d, 0.42d)};
        float f21 = fArr7[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[2];
        float[] fArr8 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        f14085k = new k(j11, com.google.android.recaptcha.internal.a.A(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], pow), pow, pow, f18, 1.0f, new float[]{(((100.0f / f15) * B) + 1.0f) - B, (((100.0f / f16) * B) + 1.0f) - B, (((100.0f / f17) * B) + 1.0f) - B}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public k(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f14090f = f10;
        this.f14086a = f11;
        this.f14087b = f12;
        this.f14088c = f13;
        this.d = f14;
        this.f14089e = f15;
        this.f14091g = fArr;
        this.h = f16;
        this.f14092i = f17;
        this.f14093j = f18;
    }
}
