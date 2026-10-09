package h0;

import com.google.android.gms.internal.vision.e2;
public final class k {
    public static final k f10956k;
    public final float f10957a;
    public final float f10958b;
    public final float f10959c;
    public final float d;
    public final float f10960e;
    public final float f10961f;
    public final float[] f10962g;
    public final float h;
    public final float f10963i;
    public final float f10964j;

    static {
        float f7;
        float[] fArr;
        float j3 = (float) ((b.j() * 63.66197723675813d) / 100.0d);
        float[] fArr2 = b.f10936c;
        float f10 = fArr2[0];
        float[][] fArr3 = b.f10934a;
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
        float B = e2.B((float) Math.exp(((-j3) - 42.0f) / 92.0f), 0.2777778f, 1.0f, 1.0f);
        double d = B;
        if (d > 1.0d) {
            B = 1.0f;
        } else if (d < 0.0d) {
            B = 0.0f;
        }
        float f18 = 1.0f / ((5.0f * j3) + 1.0f);
        float C = e2.C(f18, f18, f18, f18);
        float f19 = 1.0f - C;
        float cbrt = (0.1f * f19 * f19 * ((float) Math.cbrt(j3 * 5.0d))) + (C * j3);
        float j10 = b.j() / fArr2[1];
        double d10 = j10;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr[1] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr[2] * cbrt) * f16) / 100.0d, 0.42d)};
        float f20 = fArr7[0];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr7[1];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[2];
        float[] fArr8 = {f21, f23, (400.0f * f24) / (f24 + 27.13f)};
        f10956k = new k(j10, e2.A(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], pow), pow, pow, f17, 1.0f, new float[]{(((100.0f / f14) * B) + 1.0f) - B, (((100.0f / f15) * B) + 1.0f) - B, (((100.0f / f16) * B) + 1.0f) - B}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public k(float f7, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f10961f = f7;
        this.f10957a = f10;
        this.f10958b = f11;
        this.f10959c = f12;
        this.d = f13;
        this.f10960e = f14;
        this.f10962g = fArr;
        this.h = f15;
        this.f10963i = f16;
        this.f10964j = f17;
    }
}
