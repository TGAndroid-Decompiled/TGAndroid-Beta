package h0;

public final class l {

    public static final l f7731k;

    public final float f7732a;

    public final float f7733b;

    public final float f7734c;
    public final float d;

    public final float f7735e;

    public final float f7736f;

    public final float[] f7737g;
    public final float h;

    public final float f7738i;

    public final float f7739j;

    static {
        float fJ = (float) ((((double) b.j()) * 63.66197723675813d) / 100.0d);
        float[] fArr = b.f7711c;
        float f10 = fArr[0];
        float[][] fArr2 = b.f7709a;
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        float f18 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fJ) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp};
        float f19 = 1.0f / ((5.0f * fJ) + 1.0f);
        float fC = com.google.android.recaptcha.internal.a.C(f19, f19, f19, f19);
        float f20 = 1.0f - fC;
        float fCbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(((double) fJ) * 5.0d))) + (fC * fJ);
        float fJ2 = b.j() / fArr[1];
        double d10 = fJ2;
        float fSqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f15)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f17)) / 100.0d, 0.42d)};
        float f21 = fArr7[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[2];
        float[] fArr8 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        f7731k = new l(fJ2, com.google.android.recaptcha.internal.a.B(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], fPow), fPow, fPow, f18, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f7736f = f10;
        this.f7732a = f11;
        this.f7733b = f12;
        this.f7734c = f13;
        this.d = f14;
        this.f7735e = f15;
        this.f7737g = fArr;
        this.h = f16;
        this.f7738i = f17;
        this.f7739j = f18;
    }
}
