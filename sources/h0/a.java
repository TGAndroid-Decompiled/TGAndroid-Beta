package h0;

import android.graphics.Color;

public final class a {

    public final float f7704a;

    public final float f7705b;

    public final float f7706c;
    public final float d;

    public final float f7707e;

    public final float f7708f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f7704a = f10;
        this.f7705b = f11;
        this.f7706c = f12;
        this.d = f13;
        this.f7707e = f14;
        this.f7708f = f15;
    }

    public static a a(int i10) {
        l lVar = l.f7731k;
        float fE = b.e(Color.red(i10));
        float fE2 = b.e(Color.green(i10));
        float fE3 = b.e(Color.blue(i10));
        float[][] fArr = b.d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * fE3) + (fArr2[1] * fE2) + (fArr2[0] * fE);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * fE3) + (fArr3[1] * fE2) + (fArr3[0] * fE);
        float[] fArr4 = fArr[2];
        float f12 = (fE3 * fArr4[2]) + (fE2 * fArr4[1]) + (fE * fArr4[0]);
        float[][] fArr5 = b.f7709a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f10);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = lVar.f7737g;
        float f16 = lVar.f7738i;
        float f17 = lVar.d;
        float f18 = lVar.f7732a;
        float f19 = fArr9[0] * f13;
        float f20 = fArr9[1] * f14;
        float f21 = fArr9[2] * f15;
        float f22 = lVar.h;
        float fPow = (float) Math.pow(((double) (Math.abs(f19) * f22)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f20) * f22)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f21) * f22)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f19) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f20) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f21) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f23 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f24 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f25 = fSignum2 * 20.0f;
        float fY = com.google.android.recaptcha.internal.a.y(fSignum3, 21.0f, (fSignum * 20.0f) + f25, 20.0f);
        float f26 = (((fSignum * 40.0f) + f25) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f24, f23)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f27 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f26 * lVar.f7733b) / f18, lVar.f7739j * f17)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f28 = f18 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f7736f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? fAtan2 + 360.0f : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f7735e) * lVar.f7734c) * ((float) Math.sqrt((f24 * f24) + (f23 * f23)))) / (fY + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f17) / f28);
        float f29 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f16 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f27;
        return new a(fAtan2, fSqrt, fPow4, f29, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
    }

    public static a b(float f10, float f11, float f12) {
        l lVar = l.f7731k;
        float f13 = lVar.d;
        double d = ((double) f10) / 100.0d;
        Math.sqrt(d);
        float f14 = lVar.f7732a + 4.0f;
        float f15 = lVar.f7738i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(d))) * lVar.d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((((double) f15) * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f16, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
    }

    public final int c(l lVar) {
        float fSqrt;
        float f10 = this.f7705b;
        double d = f10;
        float f11 = this.f7706c;
        if (d != 0.0d) {
            double d10 = f11;
            if (d10 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f10 / ((float) Math.sqrt(d10 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f12 = lVar.f7736f;
        float f13 = lVar.h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f12), 0.73d), 1.1111111111111112d);
        double d11 = (this.f7704a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f;
        float fPow2 = lVar.f7732a * ((float) Math.pow(((double) f11) / 100.0d, (1.0d / ((double) lVar.d)) / ((double) lVar.f7739j)));
        float f14 = fCos * 3846.1538f * lVar.f7735e * lVar.f7734c;
        float f15 = fPow2 / lVar.f7733b;
        float fSin = (float) Math.sin(d11);
        float fCos2 = (float) Math.cos(d11);
        float fX = (((0.305f + f15) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + com.google.android.recaptcha.internal.a.x(fPow, 11.0f, fCos2, f14 * 23.0f));
        float f16 = fCos2 * fX;
        float f17 = fX * fSin;
        float f18 = f15 * 460.0f;
        float fY = com.google.android.recaptcha.internal.a.y(f17, 288.0f, (451.0f * f16) + f18, 1403.0f);
        float fW = com.google.android.recaptcha.internal.a.w(f17, 261.0f, f18 - (891.0f * f16), 1403.0f);
        float fW2 = com.google.android.recaptcha.internal.a.w(f17, 6300.0f, f18 - (f16 * 220.0f), 1403.0f);
        float f19 = 100.0f / f13;
        float fSignum = Math.signum(fY) * f19 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fY)) * 27.13d) / (400.0d - ((double) Math.abs(fY)))), 2.380952380952381d));
        float fSignum2 = Math.signum(fW) * f19 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fW)) * 27.13d) / (400.0d - ((double) Math.abs(fW)))), 2.380952380952381d));
        float fSignum3 = Math.signum(fW2) * f19 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fW2)) * 27.13d) / (400.0d - ((double) Math.abs(fW2)))), 2.380952380952381d));
        float[] fArr = lVar.f7737g;
        float f20 = fSignum / fArr[0];
        float f21 = fSignum2 / fArr[1];
        float f22 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f7710b;
        float[] fArr3 = fArr2[0];
        float f23 = (fArr3[2] * f22) + (fArr3[1] * f21) + (fArr3[0] * f20);
        float[] fArr4 = fArr2[1];
        float f24 = (fArr4[2] * f22) + (fArr4[1] * f21) + (fArr4[0] * f20);
        float[] fArr5 = fArr2[2];
        return i0.b.c(f23, f24, (f22 * fArr5[2]) + (f21 * fArr5[1]) + (f20 * fArr5[0]));
    }
}
