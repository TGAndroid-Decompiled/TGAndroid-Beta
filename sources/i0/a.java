package i0;

import android.graphics.Color;
public abstract class a {
    public static final ThreadLocal f10846a = new ThreadLocal();

    public static int a(float[] fArr) {
        int round;
        int round2;
        int i9 = 0;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float abs = (1.0f - Math.abs((f12 * 2.0f) - 1.0f)) * f11;
        float f13 = f12 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f10 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f10) / 60) {
            case 0:
                i9 = Math.round((abs + f13) * 255.0f);
                round = Math.round((abs2 + f13) * 255.0f);
                round2 = Math.round(f13 * 255.0f);
                break;
            case 1:
                i9 = Math.round((abs2 + f13) * 255.0f);
                round = Math.round((abs + f13) * 255.0f);
                round2 = Math.round(f13 * 255.0f);
                break;
            case 2:
                i9 = Math.round(f13 * 255.0f);
                round = Math.round((abs + f13) * 255.0f);
                round2 = Math.round((abs2 + f13) * 255.0f);
                break;
            case 3:
                i9 = Math.round(f13 * 255.0f);
                round = Math.round((abs2 + f13) * 255.0f);
                round2 = Math.round((abs + f13) * 255.0f);
                break;
            case 4:
                i9 = Math.round((abs2 + f13) * 255.0f);
                round = Math.round(f13 * 255.0f);
                round2 = Math.round((abs + f13) * 255.0f);
                break;
            case 5:
            case 6:
                i9 = Math.round((abs + f13) * 255.0f);
                round = Math.round(f13 * 255.0f);
                round2 = Math.round((abs2 + f13) * 255.0f);
                break;
            default:
                round2 = 0;
                round = 0;
                break;
        }
        return Color.rgb(j(i9), j(round), j(round2));
    }

    public static void b(float[] fArr, int i9, int i10, int i11) {
        float A;
        float abs;
        float min;
        float min2;
        float f10 = i9 / 255.0f;
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
                A = e2.c.A(f12, f10, f13, 2.0f);
            } else {
                A = e2.c.A(f10, f11, f13, 4.0f);
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

    public static int c(double d, double d9, double d10) {
        double d11;
        double d12;
        double d13;
        double d14 = (((-0.4986d) * d10) + (((-1.5372d) * d9) + (3.2406d * d))) / 100.0d;
        double d15 = ((0.0415d * d10) + ((1.8758d * d9) + ((-0.9689d) * d))) / 100.0d;
        double d16 = ((1.057d * d10) + (((-0.204d) * d9) + (0.0557d * d))) / 100.0d;
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
            d13 = 12.92d * d16;
        }
        return Color.rgb(j((int) Math.round(d11 * 255.0d)), j((int) Math.round(d12 * 255.0d)), j((int) Math.round(d13 * 255.0d)));
    }

    public static int d(float f10, int i9, int i10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f10) + (Color.alpha(i9) * f11)), (int) ((Color.red(i10) * f10) + (Color.red(i9) * f11)), (int) ((Color.green(i10) * f10) + (Color.green(i9) * f11)), (int) ((Color.blue(i10) * f10) + (Color.blue(i9) * f11)));
    }

    public static double e(int i9, int i10) {
        if (Color.alpha(i10) == 255) {
            if (Color.alpha(i9) < 255) {
                i9 = h(i9, i10);
            }
            double f10 = f(i9) + 0.05d;
            double f11 = f(i10) + 0.05d;
            return Math.max(f10, f11) / Math.min(f10, f11);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
    }

    public static double f(int i9) {
        double pow;
        double pow2;
        double pow3;
        ThreadLocal threadLocal = f10846a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i9);
        int green = Color.green(i9);
        int blue = Color.blue(i9);
        if (dArr.length == 3) {
            double d = red / 255.0d;
            if (d < 0.04045d) {
                pow = d / 12.92d;
            } else {
                pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d9 = green / 255.0d;
            if (d9 < 0.04045d) {
                pow2 = d9 / 12.92d;
            } else {
                pow2 = Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
            }
            double d10 = blue / 255.0d;
            if (d10 < 0.04045d) {
                pow3 = d10 / 12.92d;
            } else {
                pow3 = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d11 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d11;
            double d12 = pow3 * 0.9505d;
            dArr[2] = (d12 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            return d11 / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int g(float f10, int i9, int i10) {
        int i11 = 255;
        if (Color.alpha(i10) == 255) {
            double d = f10;
            if (e(k(i9, 255), i10) < d) {
                return -1;
            }
            int i12 = 0;
            for (int i13 = 0; i13 <= 10 && i11 - i12 > 1; i13++) {
                int i14 = (i12 + i11) / 2;
                if (e(k(i9, i14), i10) < d) {
                    i12 = i14;
                } else {
                    i11 = i14;
                }
            }
            return i11;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
    }

    public static int h(int i9, int i10) {
        int alpha = Color.alpha(i10);
        int alpha2 = Color.alpha(i9);
        int i11 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i11, i(Color.red(i9), alpha2, Color.red(i10), alpha, i11), i(Color.green(i9), alpha2, Color.green(i10), alpha, i11), i(Color.blue(i9), alpha2, Color.blue(i10), alpha, i11));
    }

    public static int i(int i9, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return e2.c.e(255, i10, i11 * i12, (i9 * 255) * i10) / (i13 * 255);
    }

    public static int j(int i9) {
        if (i9 < 0) {
            return 0;
        }
        return Math.min(i9, 255);
    }

    public static int k(int i9, int i10) {
        if (i10 >= 0 && i10 <= 255) {
            return (i9 & 16777215) | (i10 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
