package h0;

import android.graphics.Color;
public final class a {
    public final float f9272a;
    public final float f9273b;
    public final float f9274c;
    public final float d;
    public final float f9275e;
    public final float f9276f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f9272a = f10;
        this.f9273b = f11;
        this.f9274c = f12;
        this.d = f13;
        this.f9275e = f14;
        this.f9276f = f15;
    }

    public static a a(int i9) {
        float f10;
        float pow;
        l lVar = l.f9299k;
        float e10 = b.e(Color.red(i9));
        float e11 = b.e(Color.green(i9));
        float e12 = b.e(Color.blue(i9));
        float[][] fArr = b.d;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[2] * e12) + (fArr2[1] * e11) + (fArr2[0] * e10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[2] * e12) + (fArr3[1] * e11) + (fArr3[0] * e10);
        float[] fArr4 = fArr[2];
        float f13 = (e12 * fArr4[2]) + (e11 * fArr4[1]) + (e10 * fArr4[0]);
        float[][] fArr5 = b.f9277a;
        float[] fArr6 = fArr5[0];
        float f14 = (fArr6[2] * f13) + (fArr6[1] * f12) + (fArr6[0] * f11);
        float[] fArr7 = fArr5[1];
        float f15 = fArr7[1] * f12;
        float f16 = fArr7[2] * f13;
        float[] fArr8 = fArr5[2];
        float f17 = (f13 * fArr8[2]) + (f12 * fArr8[1]) + (f11 * fArr8[0]);
        float[] fArr9 = lVar.f9305g;
        float f18 = lVar.f9306i;
        float f19 = lVar.d;
        float f20 = lVar.f9300a;
        float f21 = fArr9[0] * f14;
        float f22 = fArr9[1] * (f16 + f15 + (fArr7[0] * f11));
        float f23 = fArr9[2] * f17;
        float f24 = lVar.h;
        float pow2 = (float) Math.pow((Math.abs(f21) * f24) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f22) * f24) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f23) * f24) / 100.0d, 0.42d);
        float signum = ((Math.signum(f21) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f22) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f23) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f25 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f26 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f27 = signum2 * 20.0f;
        float y10 = e2.c.y(signum3, 21.0f, (signum * 20.0f) + f27, 20.0f);
        float f28 = (((signum * 40.0f) + f27) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f26, f25)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f29 = (3.1415927f * atan2) / 180.0f;
        float pow5 = ((float) Math.pow((f28 * lVar.f9301b) / f20, lVar.f9307j * f19)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f30 = f20 + 4.0f;
        if (atan2 < 20.14d) {
            f10 = atan2 + 360.0f;
        } else {
            f10 = atan2;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f9304f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f10 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f9303e) * lVar.f9302c) * ((float) Math.sqrt((f26 * f26) + (f25 * f25)))) / (y10 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * f19) / f30);
        float f31 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((f18 * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d9 = f29;
        return new a(atan2, pow6, pow5, f31, log * ((float) Math.cos(d9)), log * ((float) Math.sin(d9)));
    }

    public static a b(float f10, float f11, float f12) {
        l lVar;
        double d;
        float f13 = l.f9299k.d;
        Math.sqrt(f10 / 100.0d);
        Math.sqrt(((f11 / ((float) Math.sqrt(d))) * lVar.d) / (lVar.f9300a + 4.0f));
        float f14 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((lVar.f9306i * f11 * 0.0228d) + 1.0d)) * 43.85965f;
        double d9 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f14, log * ((float) Math.cos(d9)), log * ((float) Math.sin(d9)));
    }

    public final int c(l lVar) {
        float f10;
        float[] fArr;
        float f11 = this.f9273b;
        float f12 = this.f9274c;
        if (f11 != 0.0d) {
            double d = f12;
            if (d != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d / 100.0d));
                float f13 = lVar.f9304f;
                float f14 = lVar.h;
                float pow = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, f13), 0.73d), 1.1111111111111112d);
                double d9 = (this.f9272a * 3.1415927f) / 180.0f;
                float pow2 = lVar.f9300a * ((float) Math.pow(f12 / 100.0d, (1.0d / lVar.d) / lVar.f9307j));
                float cos = ((float) (Math.cos(2.0d + d9) + 3.8d)) * 0.25f * 3846.1538f * lVar.f9303e * lVar.f9302c;
                float f15 = pow2 / lVar.f9301b;
                float sin = (float) Math.sin(d9);
                float cos2 = (float) Math.cos(d9);
                float x10 = (((0.305f + f15) * 23.0f) * pow) / (((pow * 108.0f) * sin) + e2.c.x(pow, 11.0f, cos2, cos * 23.0f));
                float f16 = cos2 * x10;
                float f17 = x10 * sin;
                float f18 = f15 * 460.0f;
                float y10 = e2.c.y(f17, 288.0f, (451.0f * f16) + f18, 1403.0f);
                float d10 = e2.c.d(f17, 261.0f, f18 - (891.0f * f16), 1403.0f);
                float d11 = e2.c.d(f17, 6300.0f, f18 - (f16 * 220.0f), 1403.0f);
                float f19 = 100.0f / f14;
                float signum = Math.signum(y10) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(y10) * 27.13d) / (400.0d - Math.abs(y10))), 2.380952380952381d));
                float signum2 = Math.signum(d10) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(d10) * 27.13d) / (400.0d - Math.abs(d10))), 2.380952380952381d));
                float[] fArr2 = lVar.f9305g;
                float f20 = signum / fArr2[0];
                float f21 = signum2 / fArr2[1];
                float signum3 = ((Math.signum(d11) * f19) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(d11) * 27.13d) / (400.0d - Math.abs(d11))), 2.380952380952381d))) / fArr2[2];
                float[][] fArr3 = b.f9278b;
                float[] fArr4 = fArr3[0];
                float f22 = (fArr4[2] * signum3) + (fArr4[1] * f21) + (fArr4[0] * f20);
                float[] fArr5 = fArr3[1];
                float f23 = fArr5[1] * f21;
                float f24 = fArr5[2] * signum3;
                float f25 = f20 * fArr3[2][0];
                return i0.a.c(f22, f24 + f23 + (fArr5[0] * f20), (signum3 * fArr[2]) + (f21 * fArr[1]) + f25);
            }
        }
        f10 = 0.0f;
        float f132 = lVar.f9304f;
        float f142 = lVar.h;
        float pow3 = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, f132), 0.73d), 1.1111111111111112d);
        double d92 = (this.f9272a * 3.1415927f) / 180.0f;
        float pow22 = lVar.f9300a * ((float) Math.pow(f12 / 100.0d, (1.0d / lVar.d) / lVar.f9307j));
        float cos3 = ((float) (Math.cos(2.0d + d92) + 3.8d)) * 0.25f * 3846.1538f * lVar.f9303e * lVar.f9302c;
        float f152 = pow22 / lVar.f9301b;
        float sin2 = (float) Math.sin(d92);
        float cos22 = (float) Math.cos(d92);
        float x102 = (((0.305f + f152) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + e2.c.x(pow3, 11.0f, cos22, cos3 * 23.0f));
        float f162 = cos22 * x102;
        float f172 = x102 * sin2;
        float f182 = f152 * 460.0f;
        float y102 = e2.c.y(f172, 288.0f, (451.0f * f162) + f182, 1403.0f);
        float d102 = e2.c.d(f172, 261.0f, f182 - (891.0f * f162), 1403.0f);
        float d112 = e2.c.d(f172, 6300.0f, f182 - (f162 * 220.0f), 1403.0f);
        float f192 = 100.0f / f142;
        float signum4 = Math.signum(y102) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(y102) * 27.13d) / (400.0d - Math.abs(y102))), 2.380952380952381d));
        float signum22 = Math.signum(d102) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(d102) * 27.13d) / (400.0d - Math.abs(d102))), 2.380952380952381d));
        float[] fArr22 = lVar.f9305g;
        float f202 = signum4 / fArr22[0];
        float f212 = signum22 / fArr22[1];
        float signum32 = ((Math.signum(d112) * f192) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(d112) * 27.13d) / (400.0d - Math.abs(d112))), 2.380952380952381d))) / fArr22[2];
        float[][] fArr32 = b.f9278b;
        float[] fArr42 = fArr32[0];
        float f222 = (fArr42[2] * signum32) + (fArr42[1] * f212) + (fArr42[0] * f202);
        float[] fArr52 = fArr32[1];
        float f232 = fArr52[1] * f212;
        float f242 = fArr52[2] * signum32;
        float f252 = f202 * fArr32[2][0];
        return i0.a.c(f222, f242 + f232 + (fArr52[0] * f202), (signum32 * fArr[2]) + (f212 * fArr[1]) + f252);
    }
}
