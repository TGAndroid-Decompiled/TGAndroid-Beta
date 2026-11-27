package defpackage;

import android.graphics.Color;
public abstract class vm2 {
    public static final ThreadLocal a = new ThreadLocal();

    public static int a(float[] fArr) {
        int round;
        int round2;
        int i = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i = Math.round((abs + f4) * 255.0f);
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                break;
            case 1:
                i = Math.round((abs2 + f4) * 255.0f);
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                break;
            case 2:
                i = Math.round(f4 * 255.0f);
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                i = Math.round(f4 * 255.0f);
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                i = Math.round((abs2 + f4) * 255.0f);
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                i = Math.round((abs + f4) * 255.0f);
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                round2 = 0;
                round = 0;
                break;
        }
        return Color.rgb(m(i), m(round), m(round2));
    }

    public static int b(double d, double d2, double d3) {
        double d4;
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        double d5 = (d + 16.0d) / 116.0d;
        double d6 = (d2 / 500.0d) + d5;
        double d7 = d5 - (d3 / 200.0d);
        double pow = Math.pow(d6, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d6 * 116.0d) - 16.0d) / 903.3d;
        }
        if (d > 7.9996247999999985d) {
            d4 = Math.pow(d5, 3.0d);
        } else {
            d4 = d / 903.3d;
        }
        double pow2 = Math.pow(d7, 3.0d);
        if (pow2 <= 0.008856d) {
            pow2 = ((d7 * 116.0d) - 16.0d) / 903.3d;
        }
        double d8 = pow * 95.047d;
        dArr[0] = d8;
        double d9 = d4 * 100.0d;
        dArr[1] = d9;
        double d10 = pow2 * 108.883d;
        dArr[2] = d10;
        return e(d8, d9, d10);
    }

    public static void c(int i, int i2, int i3, float[] fArr) {
        float z;
        float abs;
        float min;
        float min2;
        float f = i / 255.0f;
        float f2 = i2 / 255.0f;
        float f3 = i3 / 255.0f;
        float max = Math.max(f, Math.max(f2, f3));
        float min3 = Math.min(f, Math.min(f2, f3));
        float f4 = max - min3;
        float f5 = (max + min3) / 2.0f;
        float f6 = 0.0f;
        if (max == min3) {
            z = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f) {
                z = ((f2 - f3) / f4) % 6.0f;
            } else if (max == f2) {
                z = bp1.z(f3, f, f4, 2.0f);
            } else {
                z = bp1.z(f, f2, f4, 4.0f);
            }
            abs = f4 / (1.0f - Math.abs((2.0f * f5) - 1.0f));
        }
        float f7 = (z * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        if (f7 < 0.0f) {
            min = 0.0f;
        } else {
            min = Math.min(f7, 360.0f);
        }
        fArr[0] = min;
        if (abs < 0.0f) {
            min2 = 0.0f;
        } else {
            min2 = Math.min(abs, 1.0f);
        }
        fArr[1] = min2;
        if (f5 >= 0.0f) {
            f6 = Math.min(f5, 1.0f);
        }
        fArr[2] = f6;
    }

    public static void d(int i, int i2, int i3, double[] dArr) {
        double pow;
        double pow2;
        double pow3;
        if (dArr.length == 3) {
            double d = i / 255.0d;
            if (d < 0.04045d) {
                pow = d / 12.92d;
            } else {
                pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d2 = i2 / 255.0d;
            if (d2 < 0.04045d) {
                pow2 = d2 / 12.92d;
            } else {
                pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d3 = i3 / 255.0d;
            if (d3 < 0.04045d) {
                pow3 = d3 / 12.92d;
            } else {
                pow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            double d4 = pow3 * 0.9505d;
            dArr[2] = (d4 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            return;
        }
        lq5.j("outXyz must have a length of 3.");
    }

    public static int e(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d8 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d9 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        if (d7 > 0.0031308d) {
            d4 = (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d4 = d7 * 12.92d;
        }
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        return Color.rgb(m((int) Math.round(d4 * 255.0d)), m((int) Math.round(d5 * 255.0d)), m((int) Math.round(d6 * 255.0d)));
    }

    public static int f(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static double g(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = k(i, i2);
            }
            double h = h(i) + 0.05d;
            double h2 = h(i2) + 0.05d;
            return Math.max(h, h2) / Math.min(h, h2);
        }
        c22.b(Integer.toHexString(i2), "background can not be translucent: #");
        return 0.0d;
    }

    public static double h(int i) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        d(Color.red(i), Color.green(i), Color.blue(i), dArr);
        return dArr[1] / 100.0d;
    }

    public static int i(float f, int i, int i2) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = f;
            if (g(o(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (g(o(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        c22.b(Integer.toHexString(i2), "background can not be translucent: #");
        return 0;
    }

    public static void j(int i, double[] dArr) {
        d(Color.red(i), Color.green(i), Color.blue(i), dArr);
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        if (dArr.length == 3) {
            double n = n(d / 95.047d);
            double n2 = n(d2 / 100.0d);
            double n3 = n(d3 / 108.883d);
            dArr[0] = Math.max(0.0d, (116.0d * n2) - 16.0d);
            dArr[1] = (n - n2) * 500.0d;
            dArr[2] = (n2 - n3) * 200.0d;
            return;
        }
        lq5.j("outLab must have a length of 3.");
    }

    public static int k(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i3, l(Color.red(i), alpha2, Color.red(i2), alpha, i3), l(Color.green(i), alpha2, Color.green(i2), alpha, i3), l(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int l(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return bp1.h(255, i2, i3 * i4, (i * 255) * i2) / (i5 * 255);
    }

    public static int m(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }

    public static double n(double d) {
        if (d > 0.008856d) {
            return Math.pow(d, 0.3333333333333333d);
        }
        return ((d * 903.3d) + 16.0d) / 116.0d;
    }

    public static int o(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        lq5.j("alpha must be between 0 and 255.");
        return 0;
    }
}
