package i0;

import android.graphics.Color;
public abstract class a {
    public static final ThreadLocal f15115a = new ThreadLocal();

    public static int a(float[] fArr) {
        int round;
        int round2;
        int i7 = 0;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float abs = (1.0f - Math.abs((f12 * 2.0f) - 1.0f)) * f11;
        float f13 = f12 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f10 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f10) / 60) {
            case 0:
                i7 = Math.round((abs + f13) * 255.0f);
                round = Math.round((abs2 + f13) * 255.0f);
                round2 = Math.round(f13 * 255.0f);
                break;
            case 1:
                i7 = Math.round((abs2 + f13) * 255.0f);
                round = Math.round((abs + f13) * 255.0f);
                round2 = Math.round(f13 * 255.0f);
                break;
            case 2:
                i7 = Math.round(f13 * 255.0f);
                round = Math.round((abs + f13) * 255.0f);
                round2 = Math.round((abs2 + f13) * 255.0f);
                break;
            case 3:
                i7 = Math.round(f13 * 255.0f);
                round = Math.round((abs2 + f13) * 255.0f);
                round2 = Math.round((abs + f13) * 255.0f);
                break;
            case 4:
                i7 = Math.round((abs2 + f13) * 255.0f);
                round = Math.round(f13 * 255.0f);
                round2 = Math.round((abs + f13) * 255.0f);
                break;
            case 5:
            case 6:
                i7 = Math.round((abs + f13) * 255.0f);
                round = Math.round(f13 * 255.0f);
                round2 = Math.round((abs2 + f13) * 255.0f);
                break;
            default:
                round2 = 0;
                round = 0;
                break;
        }
        return Color.rgb(m(i7), m(round), m(round2));
    }

    public static int b(double d, double d2, double d10) {
        double d11;
        ThreadLocal threadLocal = f15115a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        double d12 = (d + 16.0d) / 116.0d;
        double d13 = (d2 / 500.0d) + d12;
        double d14 = d12 - (d10 / 200.0d);
        double pow = Math.pow(d13, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d13 * 116.0d) - 16.0d) / 903.3d;
        }
        if (d > 7.9996247999999985d) {
            d11 = Math.pow(d12, 3.0d);
        } else {
            d11 = d / 903.3d;
        }
        double pow2 = Math.pow(d14, 3.0d);
        if (pow2 <= 0.008856d) {
            pow2 = ((d14 * 116.0d) - 16.0d) / 903.3d;
        }
        double d15 = pow * 95.047d;
        dArr[0] = d15;
        double d16 = d11 * 100.0d;
        dArr[1] = d16;
        double d17 = pow2 * 108.883d;
        dArr[2] = d17;
        return e(d15, d16, d17);
    }

    public static void c(int i7, int i10, int i11, float[] fArr) {
        float A;
        float abs;
        float min;
        float min2;
        float f10 = i7 / 255.0f;
        float f11 = i10 / 255.0f;
        float f12 = i11 / 255.0f;
        float max = Math.max(f10, Math.max(f11, f12));
        float min3 = Math.min(f10, Math.min(f11, f12));
        float f13 = max - min3;
        float f14 = (max + min3) / 2.0f;
        float f15 = 0.0f;
        if (max == min3) {
            A = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f10) {
                A = ((f11 - f12) / f13) % 6.0f;
            } else if (max == f11) {
                A = com.google.android.recaptcha.internal.a.A(f12, f10, f13, 2.0f);
            } else {
                A = com.google.android.recaptcha.internal.a.A(f10, f11, f13, 4.0f);
            }
            abs = f13 / (1.0f - Math.abs((2.0f * f14) - 1.0f));
        }
        float f16 = (A * 60.0f) % 360.0f;
        if (f16 < 0.0f) {
            f16 += 360.0f;
        }
        if (f16 < 0.0f) {
            min = 0.0f;
        } else {
            min = Math.min(f16, 360.0f);
        }
        fArr[0] = min;
        if (abs < 0.0f) {
            min2 = 0.0f;
        } else {
            min2 = Math.min(abs, 1.0f);
        }
        fArr[1] = min2;
        if (f14 >= 0.0f) {
            f15 = Math.min(f14, 1.0f);
        }
        fArr[2] = f15;
    }

    public static void d(int i7, int i10, int i11, double[] dArr) {
        double pow;
        double pow2;
        double pow3;
        if (dArr.length == 3) {
            double d = i7 / 255.0d;
            if (d < 0.04045d) {
                pow = d / 12.92d;
            } else {
                pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d2 = i10 / 255.0d;
            if (d2 < 0.04045d) {
                pow2 = d2 / 12.92d;
            } else {
                pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d10 = i11 / 255.0d;
            if (d10 < 0.04045d) {
                pow3 = d10 / 12.92d;
            } else {
                pow3 = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            double d11 = pow3 * 0.9505d;
            dArr[2] = (d11 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int e(double d, double d2, double d10) {
        double d11;
        double d12;
        double d13;
        double d14 = (((-0.4986d) * d10) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d15 = ((0.0415d * d10) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d16 = ((1.057d * d10) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        if (d14 > 0.0031308d) {
            d11 = (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d11 = d14 * 12.92d;
        }
        if (d15 > 0.0031308d) {
            d12 = (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d12 = d15 * 12.92d;
        }
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = d16 * 12.92d;
        }
        return Color.rgb(m((int) Math.round(d11 * 255.0d)), m((int) Math.round(d12 * 255.0d)), m((int) Math.round(d13 * 255.0d)));
    }

    public static int f(float f10, int i7, int i10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f10) + (Color.alpha(i7) * f11)), (int) ((Color.red(i10) * f10) + (Color.red(i7) * f11)), (int) ((Color.green(i10) * f10) + (Color.green(i7) * f11)), (int) ((Color.blue(i10) * f10) + (Color.blue(i7) * f11)));
    }

    public static double g(int i7, int i10) {
        if (Color.alpha(i10) == 255) {
            if (Color.alpha(i7) < 255) {
                i7 = k(i7, i10);
            }
            double h = h(i7) + 0.05d;
            double h7 = h(i10) + 0.05d;
            return Math.max(h, h7) / Math.min(h, h7);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
    }

    public static double h(int i7) {
        ThreadLocal threadLocal = f15115a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        d(Color.red(i7), Color.green(i7), Color.blue(i7), dArr);
        return dArr[1] / 100.0d;
    }

    public static int i(float f10, int i7, int i10) {
        int i11 = 255;
        if (Color.alpha(i10) == 255) {
            double d = f10;
            if (g(o(i7, 255), i10) < d) {
                return -1;
            }
            int i12 = 0;
            for (int i13 = 0; i13 <= 10 && i11 - i12 > 1; i13++) {
                int i14 = (i12 + i11) / 2;
                if (g(o(i7, i14), i10) < d) {
                    i12 = i14;
                } else {
                    i11 = i14;
                }
            }
            return i11;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
    }

    public static void j(int i7, double[] dArr) {
        d(Color.red(i7), Color.green(i7), Color.blue(i7), dArr);
        double d = dArr[0];
        double d2 = dArr[1];
        double d10 = dArr[2];
        if (dArr.length == 3) {
            double n10 = n(d / 95.047d);
            double n11 = n(d2 / 100.0d);
            double n12 = n(d10 / 108.883d);
            dArr[0] = Math.max(0.0d, (116.0d * n11) - 16.0d);
            dArr[1] = (n10 - n11) * 500.0d;
            dArr[2] = (n11 - n12) * 200.0d;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }

    public static int k(int i7, int i10) {
        int alpha = Color.alpha(i10);
        int alpha2 = Color.alpha(i7);
        int i11 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i11, l(Color.red(i7), alpha2, Color.red(i10), alpha, i11), l(Color.green(i7), alpha2, Color.green(i10), alpha, i11), l(Color.blue(i7), alpha2, Color.blue(i10), alpha, i11));
    }

    public static int l(int i7, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return com.google.android.recaptcha.internal.a.e(255, i10, i11 * i12, (i7 * 255) * i10) / (i13 * 255);
    }

    public static int m(int i7) {
        if (i7 < 0) {
            return 0;
        }
        return Math.min(i7, 255);
    }

    public static double n(double d) {
        if (d > 0.008856d) {
            return Math.pow(d, 0.3333333333333333d);
        }
        return ((d * 903.3d) + 16.0d) / 116.0d;
    }

    public static int o(int i7, int i10) {
        if (i10 >= 0 && i10 <= 255) {
            return (i7 & 16777215) | (i10 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
