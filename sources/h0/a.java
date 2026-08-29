package h0;

import android.graphics.Color;
public final class a {
    public final float f7466a;
    public final float f7467b;
    public final float f7468c;
    public final float d;
    public final float f7469e;
    public final float f7470f;

    public a(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f7466a = f9;
        this.f7467b = f10;
        this.f7468c = f11;
        this.d = f12;
        this.f7469e = f13;
        this.f7470f = f14;
    }

    public static a a(int i10) {
        float f9;
        float pow;
        l lVar = l.f7493k;
        float e10 = b.e(Color.red(i10));
        float e11 = b.e(Color.green(i10));
        float e12 = b.e(Color.blue(i10));
        float[][] fArr = b.d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * e12) + (fArr2[1] * e11) + (fArr2[0] * e10);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * e12) + (fArr3[1] * e11) + (fArr3[0] * e10);
        float[] fArr4 = fArr[2];
        float f12 = (e12 * fArr4[2]) + (e11 * fArr4[1]) + (e10 * fArr4[0]);
        float[][] fArr5 = b.f7471a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = fArr7[1] * f11;
        float f15 = fArr7[2] * f12;
        float[] fArr8 = fArr5[2];
        float f16 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = lVar.f7499g;
        float f17 = lVar.f7500i;
        float f18 = lVar.d;
        float f19 = lVar.f7494a;
        float f20 = fArr9[0] * f13;
        float f21 = fArr9[1] * (f15 + f14 + (fArr7[0] * f10));
        float f22 = fArr9[2] * f16;
        float f23 = lVar.h;
        float pow2 = (float) Math.pow((Math.abs(f20) * f23) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f21) * f23) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f22) * f23) / 100.0d, 0.42d);
        float signum = ((Math.signum(f20) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f21) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f22) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f24 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f25 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f26 = signum2 * 20.0f;
        float y8 = com.google.android.recaptcha.internal.a.y(signum3, 21.0f, (signum * 20.0f) + f26, 20.0f);
        float f27 = (((signum * 40.0f) + f26) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f25, f24)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f28 = (3.1415927f * atan2) / 180.0f;
        float pow5 = ((float) Math.pow((f27 * lVar.f7495b) / f19, lVar.f7501j * f18)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f29 = f19 + 4.0f;
        if (atan2 < 20.14d) {
            f9 = atan2 + 360.0f;
        } else {
            f9 = atan2;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f7498f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f9 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f7497e) * lVar.f7496c) * ((float) Math.sqrt((f25 * f25) + (f24 * f24)))) / (y8 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * f18) / f29);
        float f30 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((f17 * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f28;
        return new a(atan2, pow6, pow5, f30, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static a b(float f9, float f10, float f11) {
        l lVar;
        double d;
        float f12 = l.f7493k.d;
        Math.sqrt(f9 / 100.0d);
        Math.sqrt(((f10 / ((float) Math.sqrt(d))) * lVar.d) / (lVar.f7494a + 4.0f));
        float f13 = (1.7f * f9) / ((0.007f * f9) + 1.0f);
        float log = ((float) Math.log((lVar.f7500i * f10 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f9, f13, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public final int c(l lVar) {
        float f9;
        float[] fArr;
        float f10 = this.f7467b;
        float f11 = this.f7468c;
        if (f10 != 0.0d) {
            double d = f11;
            if (d != 0.0d) {
                f9 = f10 / ((float) Math.sqrt(d / 100.0d));
                float f12 = lVar.f7498f;
                float f13 = lVar.h;
                float pow = (float) Math.pow(f9 / Math.pow(1.64d - Math.pow(0.29d, f12), 0.73d), 1.1111111111111112d);
                double d10 = (this.f7466a * 3.1415927f) / 180.0f;
                float pow2 = lVar.f7494a * ((float) Math.pow(f11 / 100.0d, (1.0d / lVar.d) / lVar.f7501j));
                float cos = ((float) (Math.cos(2.0d + d10) + 3.8d)) * 0.25f * 3846.1538f * lVar.f7497e * lVar.f7496c;
                float f14 = pow2 / lVar.f7495b;
                float sin = (float) Math.sin(d10);
                float cos2 = (float) Math.cos(d10);
                float x4 = (((0.305f + f14) * 23.0f) * pow) / (((pow * 108.0f) * sin) + com.google.android.recaptcha.internal.a.x(pow, 11.0f, cos2, cos * 23.0f));
                float f15 = cos2 * x4;
                float f16 = x4 * sin;
                float f17 = f14 * 460.0f;
                float y8 = com.google.android.recaptcha.internal.a.y(f16, 288.0f, (451.0f * f15) + f17, 1403.0f);
                float w10 = com.google.android.recaptcha.internal.a.w(f16, 261.0f, f17 - (891.0f * f15), 1403.0f);
                float w11 = com.google.android.recaptcha.internal.a.w(f16, 6300.0f, f17 - (f15 * 220.0f), 1403.0f);
                float f18 = 100.0f / f13;
                float signum = Math.signum(y8) * f18 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(y8) * 27.13d) / (400.0d - Math.abs(y8))), 2.380952380952381d));
                float signum2 = Math.signum(w10) * f18 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(w10) * 27.13d) / (400.0d - Math.abs(w10))), 2.380952380952381d));
                float[] fArr2 = lVar.f7499g;
                float f19 = signum / fArr2[0];
                float f20 = signum2 / fArr2[1];
                float signum3 = ((Math.signum(w11) * f18) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(w11) * 27.13d) / (400.0d - Math.abs(w11))), 2.380952380952381d))) / fArr2[2];
                float[][] fArr3 = b.f7472b;
                float[] fArr4 = fArr3[0];
                float f21 = (fArr4[2] * signum3) + (fArr4[1] * f20) + (fArr4[0] * f19);
                float[] fArr5 = fArr3[1];
                float f22 = fArr5[1] * f20;
                float f23 = fArr5[2] * signum3;
                float f24 = f19 * fArr3[2][0];
                return i0.a.c(f21, f23 + f22 + (fArr5[0] * f19), (signum3 * fArr[2]) + (f20 * fArr[1]) + f24);
            }
        }
        f9 = 0.0f;
        float f122 = lVar.f7498f;
        float f132 = lVar.h;
        float pow3 = (float) Math.pow(f9 / Math.pow(1.64d - Math.pow(0.29d, f122), 0.73d), 1.1111111111111112d);
        double d102 = (this.f7466a * 3.1415927f) / 180.0f;
        float pow22 = lVar.f7494a * ((float) Math.pow(f11 / 100.0d, (1.0d / lVar.d) / lVar.f7501j));
        float cos3 = ((float) (Math.cos(2.0d + d102) + 3.8d)) * 0.25f * 3846.1538f * lVar.f7497e * lVar.f7496c;
        float f142 = pow22 / lVar.f7495b;
        float sin2 = (float) Math.sin(d102);
        float cos22 = (float) Math.cos(d102);
        float x42 = (((0.305f + f142) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + com.google.android.recaptcha.internal.a.x(pow3, 11.0f, cos22, cos3 * 23.0f));
        float f152 = cos22 * x42;
        float f162 = x42 * sin2;
        float f172 = f142 * 460.0f;
        float y82 = com.google.android.recaptcha.internal.a.y(f162, 288.0f, (451.0f * f152) + f172, 1403.0f);
        float w102 = com.google.android.recaptcha.internal.a.w(f162, 261.0f, f172 - (891.0f * f152), 1403.0f);
        float w112 = com.google.android.recaptcha.internal.a.w(f162, 6300.0f, f172 - (f152 * 220.0f), 1403.0f);
        float f182 = 100.0f / f132;
        float signum4 = Math.signum(y82) * f182 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(y82) * 27.13d) / (400.0d - Math.abs(y82))), 2.380952380952381d));
        float signum22 = Math.signum(w102) * f182 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(w102) * 27.13d) / (400.0d - Math.abs(w102))), 2.380952380952381d));
        float[] fArr22 = lVar.f7499g;
        float f192 = signum4 / fArr22[0];
        float f202 = signum22 / fArr22[1];
        float signum32 = ((Math.signum(w112) * f182) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(w112) * 27.13d) / (400.0d - Math.abs(w112))), 2.380952380952381d))) / fArr22[2];
        float[][] fArr32 = b.f7472b;
        float[] fArr42 = fArr32[0];
        float f212 = (fArr42[2] * signum32) + (fArr42[1] * f202) + (fArr42[0] * f192);
        float[] fArr52 = fArr32[1];
        float f222 = fArr52[1] * f202;
        float f232 = fArr52[2] * signum32;
        float f242 = f192 * fArr32[2][0];
        return i0.a.c(f212, f232 + f222 + (fArr52[0] * f192), (signum32 * fArr[2]) + (f202 * fArr[1]) + f242);
    }
}
