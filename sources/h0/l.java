package h0;
public final class l {
    public static final l f7172k;
    public final float f7173a;
    public final float f7174b;
    public final float f7175c;
    public final float d;
    public final float f7176e;
    public final float f7177f;
    public final float[] f7178g;
    public final float h;
    public final float f7179i;
    public final float f7180j;

    static {
        float f10;
        float j10 = (float) ((b.j() * 63.66197723675813d) / 100.0d);
        float[] fArr = b.f7152c;
        float f11 = fArr[0];
        float[][] fArr2 = b.f7150a;
        float[] fArr3 = fArr2[0];
        float f12 = fArr[1];
        float f13 = fArr3[1] * f12;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13 + (fArr3[0] * f11);
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f11);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f11 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f10 = 0.69f;
        } else {
            f10 = 0.655f;
        }
        float exp = (1.0f - (((float) Math.exp(((-j10) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp};
        float f18 = 1.0f / ((5.0f * j10) + 1.0f);
        float z4 = e2.c.z(f18, f18, f18, f18);
        float f19 = 1.0f - z4;
        float cbrt = (0.1f * f19 * f19 * ((float) Math.cbrt(j10 * 5.0d))) + (z4 * j10);
        float j11 = b.j() / fArr[1];
        double d10 = j11;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f17) / 100.0d, 0.42d)};
        float f20 = fArr7[0];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr7[1];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[2];
        float[] fArr8 = {f21, f23, (400.0f * f24) / (f24 + 27.13f)};
        f7172k = new l(j11, e2.c.y(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], pow), pow, pow, f10, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f7177f = f10;
        this.f7173a = f11;
        this.f7174b = f12;
        this.f7175c = f13;
        this.d = f14;
        this.f7176e = f15;
        this.f7178g = fArr;
        this.h = f16;
        this.f7179i = f17;
        this.f7180j = f18;
    }
}
