package defpackage;

import android.graphics.Color;
import android.util.LruCache;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public abstract class lsc {
    public static final LruCache a = new LruCache(128);
    public static final float[] b = {0.017513232f, 0.2844959f, 1.2347647f, 0.012535676f, 0.21663007f, 0.8356014f, 0.02682078f, 0.40080056f, 2.4040875f, 0.0032399998f, 0.171f, 0.47039998f};
    public static final float[] c = {0.0f, 0.47809f, 1.0f};
    public static final LruCache d = new LruCache(64);
    public static final int e;

    static {
        float[] j = j(-16748084);
        float f = j[0] * 0.876903f;
        float f2 = j[2];
        float e2 = e(f, f2);
        float f3 = f2;
        for (int i = -15; i <= 15; i++) {
            float radians = ((float) Math.toRadians(i)) + f2;
            float e3 = e(f, radians);
            if (e3 > 0.002f + e2) {
                f3 = radians;
                e2 = e3;
            }
        }
        float A = qd4.A(f3, f2, 0.723f, f2);
        e = l(f, e(f, A), A);
    }

    public static int a(int i, float[] fArr) {
        int i2;
        int o;
        if (i == -16216082) {
            i2 = -14456619;
        } else {
            i2 = -14184457;
        }
        if (fArr != null && fArr.length >= 18) {
            float f = fArr[10];
            if (f < 0.0f) {
                o = i2;
            } else {
                o = o(i, (int) f, (int) fArr[11]);
            }
            float f2 = fArr[14];
            if (f2 >= 0.0f) {
                i2 = o(i, (int) f2, (int) fArr[15]);
            }
            return vm2.f(fArr[8], o, i2);
        }
        return i2;
    }

    public static int b(int i, float[] fArr) {
        int i2 = i << 2;
        int i3 = i2 + 10;
        int i4 = e;
        if (fArr != null && fArr.length >= 18) {
            float f = fArr[i3];
            float f2 = 0.0f;
            if (f >= 0.0f) {
                int n = n(-16216082, (int) f, (int) fArr[i2 + 11]);
                Integer valueOf = Integer.valueOf(n);
                LruCache lruCache = d;
                Integer num = (Integer) lruCache.get(valueOf);
                if (num != null) {
                    return num.intValue();
                }
                float[] j = j(n);
                float d2 = (d(-16216082) + 0.05f) / (d(i4) + 0.05f);
                float d3 = d(n);
                float f3 = ((d3 + 0.05f) / d2) - 0.05f;
                if (f3 < 0.004f) {
                    f3 = d3 * 0.3f;
                }
                float f4 = 1.0f;
                float w = qu6.w(j[1], 0.1f, 1.0f, 0.0f);
                for (int i5 = 0; i5 < 18; i5++) {
                    float f5 = (f2 + f4) / 2.0f;
                    if (d(l(f5, e(f5, j[2]) * w, j[2])) < f3) {
                        f2 = f5;
                    } else {
                        f4 = f5;
                    }
                }
                float f6 = (f2 + f4) / 2.0f;
                int l = l(f6, e(f6, j[2]) * w, j[2]);
                lruCache.put(Integer.valueOf(n), Integer.valueOf(l));
                return l;
            }
        }
        return i4;
    }

    public static int c(float f) {
        float pow;
        float max = Math.max(0.0f, Math.min(1.0f, f));
        if (max <= 0.0031308f) {
            pow = max * 12.92f;
        } else {
            pow = (((float) Math.pow(max, 0.4166666666666667d)) * 1.055f) - 0.055f;
        }
        return Math.max(0, Math.min(255, (int) ((pow * 255.0f) + 0.5f)));
    }

    public static float d(int i) {
        float h = h(i, 8) * 0.7152f;
        return (h(i, 0) * 0.0722f) + h + (h(i, 16) * 0.2126f);
    }

    public static float e(float f, float f2) {
        float f3 = 0.5f;
        float f4 = 0.0f;
        for (int i = 0; i < 18; i++) {
            float f5 = (f4 + f3) / 2.0f;
            float[] k = k(f, f5, f2);
            float f6 = k[0];
            if (f6 >= 0.0f) {
                float f7 = k[1];
                if (f7 >= 0.0f) {
                    float f8 = k[2];
                    if (f8 >= 0.0f && f6 <= 1.0f && f7 <= 1.0f && f8 <= 1.0f) {
                        f4 = f5;
                    }
                }
            }
            f3 = f5;
        }
        return f4;
    }

    public static float[] f(int i) {
        float radians;
        double[] c2 = ufd.c(ufd.d(ufd.b(i)));
        float f = (float) c2[0];
        float f2 = (float) c2[1];
        if (Double.isNaN(c2[2])) {
            radians = 0.0f;
        } else {
            radians = (float) Math.toRadians(c2[2]);
        }
        return new float[]{f, f2, radians};
    }

    public static float g(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4d);
    }

    public static float h(int i, int i2) {
        float f = ((i >> i2) & 255) / 255.0f;
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4d);
    }

    public static float[] i(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return new float[]{0.0f, 1.0f, 1.0f};
        }
        float[] f = f(vm2.f(0.5f, stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)));
        float[] f2 = f(-16216082);
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(f[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        return new float[]{f[2] - f2[2], Math.min(xnb.z(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (f[1] * 1.5f) / 0.155f))), (f(stargiftattributebackdrop.center_color)[1] * 1.2f) / 0.173f), ((((Math.max(0.1f, f[0] - 0.02f) / f2[0]) - 1.0f) * Math.max(0.0f, Math.min(1.0f, (0.6f - f[0]) / 0.15f))) + 1.0f) - (exp * 0.025f)};
    }

    public static float[] j(int i) {
        float g = g(Color.red(i) / 255.0f);
        float g2 = g(Color.green(i) / 255.0f);
        float g3 = g(Color.blue(i) / 255.0f);
        float cbrt = (float) Math.cbrt((0.051445995f * g3) + (0.53633255f * g2) + (0.41222146f * g));
        float cbrt2 = (float) Math.cbrt((0.10739696f * g3) + (0.6806995f * g2) + (0.2119035f * g));
        float cbrt3 = (float) Math.cbrt((g3 * 0.6299787f) + (g2 * 0.28171885f) + (g * 0.08830246f));
        double d2 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        double d3 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        return new float[]{((0.7936178f * cbrt2) + (0.21045426f * cbrt)) - (0.004072047f * cbrt3), (float) Math.hypot(d2, d3), (float) Math.atan2(d3, d2)};
    }

    public static float[] k(float f, float f2, float f3) {
        double d2 = f3;
        float cos = ((float) Math.cos(d2)) * f2;
        float sin = f2 * ((float) Math.sin(d2));
        float f4 = (0.21580376f * sin) + (0.39633778f * cos) + f;
        float f5 = (f - (0.105561346f * cos)) - (0.06385417f * sin);
        float f6 = (f - (cos * 0.08948418f)) - (sin * 1.2914855f);
        float f7 = f4 * f4 * f4;
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        return new float[]{(0.23096994f * f9) + ((4.0767417f * f7) - (3.3077116f * f8)), ((2.6097574f * f8) + ((-1.268438f) * f7)) - (0.34131938f * f9), (f9 * 1.7076147f) + ((f7 * (-0.0041960864f)) - (f8 * 0.7034186f))};
    }

    public static int l(float f, float f2, float f3) {
        float[] k = k(f, f2, f3);
        loop0: for (int i = 0; i < 40; i++) {
            for (float f4 : k) {
                if (f4 < -0.001f || f4 > 1.001f) {
                    f2 *= 0.95f;
                    k = k(f, f2, f3);
                }
            }
        }
        return Color.rgb(c(k[0]), c(k[1]), c(k[2]));
    }

    public static void m(float[] fArr, int i, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        float f;
        float f2;
        float f3;
        int i2 = i << 2;
        int i3 = i2 + 10;
        float f4 = -1.0f;
        if (stargiftattributebackdrop == null) {
            f = -1.0f;
        } else {
            f = stargiftattributebackdrop.center_color & 16777215;
        }
        fArr[i3] = f;
        int i4 = i2 + 11;
        if (stargiftattributebackdrop == null) {
            f2 = -1.0f;
        } else {
            f2 = stargiftattributebackdrop.edge_color & 16777215;
        }
        fArr[i4] = f2;
        int i5 = i2 + 12;
        if (stargiftattributebackdrop == null) {
            f3 = -1.0f;
        } else {
            f3 = stargiftattributebackdrop.pattern_color & 16777215;
        }
        fArr[i5] = f3;
        int i6 = i2 + 13;
        if (stargiftattributebackdrop != null) {
            f4 = stargiftattributebackdrop.text_color & 16777215;
        }
        fArr[i6] = f4;
    }

    public static int n(int i, int i2, int i3) {
        int i4 = i2 | (-16777216);
        int i5 = i3 | (-16777216);
        float[] j = j(vm2.f(0.5f, i4, i5));
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(j[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        float z = xnb.z(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (j[1] * 1.5f) / 0.155f)));
        float[] j2 = j(i4);
        float[] j3 = j(i5);
        float max = Math.max(0.0f, Math.min(1.0f, (0.6f - ((j2[0] + j3[0]) / 2.0f)) / 0.15f));
        float f = j(-16216082)[0];
        float f2 = j(-15291399)[0];
        float[] j4 = j(i);
        float max2 = Math.max(-2.0f, Math.min(3.0f, (j4[0] - f) / (f2 - f)));
        float f3 = j3[0];
        float A = qd4.A(j2[0], f3, max2, f3 - 0.02f);
        float f4 = j4[0];
        float f5 = ((A - f4) * max) + f4 + (exp * (-0.025f));
        float f6 = j4[1];
        float f7 = f6 / 0.173f;
        float f8 = 1.0f - max;
        return l(Math.max(0.05f, Math.min(0.97f, f5)), c00.x(j2[1], 1.1f, max, f8 * Math.min(f6 * z, f7 * j2[1] * 1.2f)), j[2]);
    }

    public static int o(int i, int i2, int i3) {
        float[] fArr;
        float f;
        String str = i + ":" + i2 + ":" + i3;
        LruCache lruCache = a;
        Integer num = (Integer) lruCache.get(str);
        if (num != null) {
            return num.intValue();
        }
        int i4 = i2 | (-16777216);
        int i5 = i3 | (-16777216);
        float[] j = j(vm2.f(0.7f, i4, i5));
        float[] j2 = j(i4);
        float[] j3 = j(i5);
        float[] j4 = j(i);
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(j[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        float z = xnb.z(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (j[1] * 1.5f) / 0.155f)));
        float max = Math.max(0.0f, Math.min(1.0f, (0.6f - ((j2[0] + j3[0]) / 2.0f)) / 0.15f));
        float f2 = j(-16216082)[0];
        float max2 = Math.max(-2.0f, Math.min(3.0f, (j4[0] - f2) / (j(-15291399)[0] - f2)));
        float f3 = j3[0];
        float A = qd4.A(j2[0], f3, max2, f3 - 0.02f);
        float f4 = j4[0];
        float A2 = qd4.A(A, f4, max, f4) - (exp * 0.025f);
        float f5 = j4[1];
        float x = c00.x(j2[1], 1.1f, max, (1.0f - max) * Math.min(z * f5, (f5 / 0.173f) * j2[1] * 1.2f));
        if (i == -15291399) {
            fArr = j(vm2.f(0.5f, i4, i5));
        } else {
            fArr = j3;
        }
        float A3 = qd4.A(fArr[0], A2, 0.399f, A2);
        float A4 = qd4.A(fArr[1], x, 0.399f, x);
        float atan2 = (((float) Math.atan2(Math.sin(fArr[2] - f), Math.cos(fArr[2] - j[2]))) * 0.399f) + j[2];
        float max3 = (1.0f - Math.max(0.0f, Math.min(1.0f, (j[1] - 0.125f) / 0.015f))) * Math.max(0.0f, Math.min(1.0f, (j[1] - 0.06f) / 0.055f));
        float exp2 = (float) Math.exp(-Math.pow(((((Math.toDegrees(atan2) % 360.0d) + 360.0d) % 360.0d) - 70.0d) / 35.0d, 2.0d));
        float f6 = (((1.0f - (0.75f * exp2)) * max3 * 0.35f) + 1.0f) * A4;
        float B = xnb.B(exp2, 0.15f, 1.0f, Math.max(j2[1], j3[1]) * 1.3f);
        if (f6 > B && B > 0.0f) {
            f6 = qd4.A(B, f6, 0.8f, f6);
        }
        int l = l(Math.max(0.05f, Math.min(0.97f, A3 - (exp2 * 0.025f))), f6, atan2);
        lruCache.put(str, Integer.valueOf(l));
        return l;
    }

    public static int p(int i, int i2, float[] fArr) {
        double d2;
        int i3;
        int i4;
        char c2;
        double d3;
        int i5;
        double cos;
        double sin;
        int i6 = 2;
        int i7 = ((i2 / 3) << 2) + 10;
        char c3 = 0;
        if (fArr.length >= 18 && fArr[i7] >= 0.0f) {
            int i8 = i & 16777215;
            if (i8 != 165332) {
                if (i8 != 29132 && i8 != 561134) {
                    if (i8 != 2267888 && i8 != 1485817) {
                        i6 = 3;
                    } else {
                        i6 = 0;
                    }
                } else {
                    i6 = 1;
                }
            }
            return (Color.alpha(i) << 24) | (((int) fArr[i7 + i6]) & 16777215);
        } else if (fArr[i2] == 0.0f && fArr[i2 + 1] == 1.0f && fArr[i2 + 2] == 1.0f) {
            return i;
        } else {
            double[] c4 = ufd.c(ufd.d(ufd.b(i)));
            double d4 = c4[0];
            double d5 = 0.8d;
            if (d4 < 0.8d) {
                d5 = 0.0d;
            }
            c4[0] = Math.max(d5, d4 * fArr[i2 + 2]);
            c4[1] = c4[1] * fArr[i2 + 1];
            if (Double.isNaN(c4[2])) {
                d2 = 0.0d;
            } else {
                d2 = c4[2];
            }
            c4[2] = Math.toDegrees(fArr[i2]) + d2;
            double[] dArr = null;
            int i9 = 0;
            while (true) {
                if (i9 < 40) {
                    double d6 = c4[0];
                    double d7 = c4[1];
                    double d8 = c4[i6];
                    if (Double.isNaN(d8)) {
                        cos = 0.0d;
                    } else {
                        cos = Math.cos((d8 * 3.141592653589793d) / 180.0d) * d7;
                    }
                    if (Double.isNaN(d8)) {
                        sin = 0.0d;
                    } else {
                        sin = Math.sin((d8 * 3.141592653589793d) / 180.0d) * d7;
                    }
                    double[] dArr2 = new double[3];
                    dArr2[0] = d6;
                    dArr2[1] = cos;
                    dArr2[i6] = sin;
                    double[] a2 = ufd.a(ufd.f, dArr2);
                    int i10 = 0;
                    while (i10 < 3) {
                        a2[i10] = Math.pow(a2[i10], 3.0d);
                        i10++;
                        i6 = i6;
                        i9 = i9;
                    }
                    i3 = i6;
                    int i11 = i9;
                    dArr = ufd.a(ufd.h, ufd.a(ufd.d, a2));
                    double d9 = dArr[0];
                    if (d9 >= 0.0d) {
                        double d10 = dArr[1];
                        if (d10 >= 0.0d) {
                            double d11 = dArr[i3];
                            if (d11 >= 0.0d && d9 <= 1.0d && d10 <= 1.0d && d11 <= 1.0d) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    c4[1] = c4[1] * 0.95d;
                    i9 = i11 + 1;
                    i6 = i3;
                } else {
                    i3 = i6;
                    break;
                }
            }
            double[] dArr3 = new double[3];
            int i12 = 0;
            while (i12 < dArr.length) {
                if (Math.abs(dArr[i12]) > 0.0031308d) {
                    double d12 = dArr[i12];
                    if (d12 < 0.0d) {
                        i5 = -1;
                    } else {
                        i5 = 1;
                    }
                    double d13 = i5;
                    i4 = i3;
                    c2 = c3;
                    d3 = ((Math.pow(Math.abs(d12), 0.4166666666666667d) * 1.055d) - 0.055d) * d13;
                } else {
                    i4 = i3;
                    c2 = c3;
                    d3 = 12.92d * dArr[i12];
                }
                dArr3[i12] = d3;
                i12++;
                i3 = i4;
                c3 = c2;
            }
            return vm2.o(Color.rgb((int) Math.round(Utilities.h(dArr3[c3], 1.0d) * 255.0d), (int) Math.round(Utilities.h(dArr3[1], 1.0d) * 255.0d), (int) Math.round(Utilities.h(dArr3[i3], 1.0d) * 255.0d)), Color.alpha(i));
        }
    }
}
