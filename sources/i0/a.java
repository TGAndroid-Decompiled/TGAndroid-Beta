package i0;

import android.graphics.Color;
import com.google.android.gms.internal.vision.e2;
public abstract class a {
    public static final ThreadLocal f11448a = new ThreadLocal();

    public static int a(float[] fArr) {
        int round;
        int round2;
        int i10 = 0;
        float f7 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float abs = (1.0f - Math.abs((f11 * 2.0f) - 1.0f)) * f10;
        float f12 = f11 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f7 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f7) / 60) {
            case 0:
                i10 = Math.round((abs + f12) * 255.0f);
                round = Math.round((abs2 + f12) * 255.0f);
                round2 = Math.round(f12 * 255.0f);
                break;
            case 1:
                i10 = Math.round((abs2 + f12) * 255.0f);
                round = Math.round((abs + f12) * 255.0f);
                round2 = Math.round(f12 * 255.0f);
                break;
            case 2:
                i10 = Math.round(f12 * 255.0f);
                round = Math.round((abs + f12) * 255.0f);
                round2 = Math.round((abs2 + f12) * 255.0f);
                break;
            case 3:
                i10 = Math.round(f12 * 255.0f);
                round = Math.round((abs2 + f12) * 255.0f);
                round2 = Math.round((abs + f12) * 255.0f);
                break;
            case 4:
                i10 = Math.round((abs2 + f12) * 255.0f);
                round = Math.round(f12 * 255.0f);
                round2 = Math.round((abs + f12) * 255.0f);
                break;
            case 5:
            case 6:
                i10 = Math.round((abs + f12) * 255.0f);
                round = Math.round(f12 * 255.0f);
                round2 = Math.round((abs2 + f12) * 255.0f);
                break;
            default:
                round2 = 0;
                round = 0;
                break;
        }
        return Color.rgb(j(i10), j(round), j(round2));
    }

    public static void b(float[] fArr, int i10, int i11, int i12) {
        float A;
        float abs;
        float min;
        float min2;
        float f7 = i10 / 255.0f;
        float f10 = i11 / 255.0f;
        float f11 = i12 / 255.0f;
        float max = Math.max(f7, Math.max(f10, f11));
        float min3 = Math.min(f7, Math.min(f10, f11));
        float f12 = max - min3;
        float f13 = (max + min3) / 2.0f;
        float f14 = 0.0f;
        if (max == min3) {
            A = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f7) {
                A = ((f10 - f11) / f12) % 6.0f;
            } else if (max == f10) {
                A = e2.A(f11, f7, f12, 2.0f);
            } else {
                A = e2.A(f7, f10, f12, 4.0f);
            }
            abs = f12 / (1.0f - Math.abs((2.0f * f13) - 1.0f));
        }
        float f15 = (A * 60.0f) % 360.0f;
        if (f15 < 0.0f) {
            f15 += 360.0f;
        }
        if (f15 < 0.0f) {
            min = 0.0f;
        } else {
            min = Math.min(f15, 360.0f);
        }
        fArr[0] = min;
        if (abs < 0.0f) {
            min2 = 0.0f;
        } else {
            min2 = Math.min(abs, 1.0f);
        }
        fArr[1] = min2;
        if (f13 >= 0.0f) {
            f14 = Math.min(f13, 1.0f);
        }
        fArr[2] = f14;
    }

    public static int c(double d, double d10, double d11) {
        double d12;
        double d13;
        double d14;
        double d15 = (((-0.4986d) * d11) + (((-1.5372d) * d10) + (3.2406d * d))) / 100.0d;
        double d16 = ((0.0415d * d11) + ((1.8758d * d10) + ((-0.9689d) * d))) / 100.0d;
        double d17 = ((1.057d * d11) + (((-0.204d) * d10) + (0.0557d * d))) / 100.0d;
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
        if (d17 > 0.0031308d) {
            d14 = (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d14 = 12.92d * d17;
        }
        return Color.rgb(j((int) Math.round(d12 * 255.0d)), j((int) Math.round(d13 * 255.0d)), j((int) Math.round(d14 * 255.0d)));
    }

    public static int d(float f7, int i10, int i11) {
        float f10 = 1.0f - f7;
        return Color.argb((int) ((Color.alpha(i11) * f7) + (Color.alpha(i10) * f10)), (int) ((Color.red(i11) * f7) + (Color.red(i10) * f10)), (int) ((Color.green(i11) * f7) + (Color.green(i10) * f10)), (int) ((Color.blue(i11) * f7) + (Color.blue(i10) * f10)));
    }

    public static double e(int i10, int i11) {
        if (Color.alpha(i11) == 255) {
            if (Color.alpha(i10) < 255) {
                i10 = h(i10, i11);
            }
            double f7 = f(i10) + 0.05d;
            double f10 = f(i11) + 0.05d;
            return Math.max(f7, f10) / Math.min(f7, f10);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
    }

    public static double f(int i10) {
        double pow;
        double pow2;
        double pow3;
        ThreadLocal threadLocal = f11448a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        if (dArr.length == 3) {
            double d = red / 255.0d;
            if (d < 0.04045d) {
                pow = d / 12.92d;
            } else {
                pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d10 = green / 255.0d;
            if (d10 < 0.04045d) {
                pow2 = d10 / 12.92d;
            } else {
                pow2 = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            }
            double d11 = blue / 255.0d;
            if (d11 < 0.04045d) {
                pow3 = d11 / 12.92d;
            } else {
                pow3 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d12 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d12;
            double d13 = pow3 * 0.9505d;
            dArr[2] = (d13 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            return d12 / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int g(float f7, int i10, int i11) {
        int i12 = 255;
        if (Color.alpha(i11) == 255) {
            double d = f7;
            if (e(k(i10, 255), i11) < d) {
                return -1;
            }
            int i13 = 0;
            for (int i14 = 0; i14 <= 10 && i12 - i13 > 1; i14++) {
                int i15 = (i13 + i12) / 2;
                if (e(k(i10, i15), i11) < d) {
                    i13 = i15;
                } else {
                    i12 = i15;
                }
            }
            return i12;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
    }

    public static int h(int i10, int i11) {
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int i12 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i12, i(Color.red(i10), alpha2, Color.red(i11), alpha, i12), i(Color.green(i10), alpha2, Color.green(i11), alpha, i12), i(Color.blue(i10), alpha2, Color.blue(i11), alpha, i12));
    }

    public static int i(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return e2.w(255, i11, i12 * i13, (i10 * 255) * i11) / (i14 * 255);
    }

    public static int j(int i10) {
        if (i10 < 0) {
            return 0;
        }
        return Math.min(i10, 255);
    }

    public static int k(int i10, int i11) {
        if (i11 >= 0 && i11 <= 255) {
            return (i10 & 16777215) | (i11 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
