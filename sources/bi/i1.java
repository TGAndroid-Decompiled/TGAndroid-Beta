package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;
public abstract class i1 {
    public static final float[][] f4026a;
    public static final a4.k f4027b;

    static {
        float[][] fArr = {new float[]{83.33f, 24.0f, 27.33f, 0.22f, 68.66f, 75.33f, 25.33f, 0.21f, 0.0f, 86.0f, 25.33f, 0.12f, -68.66f, 75.33f, 25.33f, 0.21f, -82.66f, 13.66f, 27.33f, 0.22f, -80.0f, -33.33f, 20.0f, 0.24f, -46.5f, -63.16f, 27.0f, 0.21f, 1.0f, -82.66f, 20.0f, 0.15f, 46.5f, -63.16f, 27.0f, 0.21f, 80.0f, -33.33f, 19.33f, 0.24f, 115.66f, -63.0f, 20.0f, 0.15f, 134.0f, -10.66f, 20.0f, 0.18f, 118.66f, 55.66f, 20.0f, 0.15f, 124.33f, 98.33f, 20.0f, 0.11f, -128.0f, 98.33f, 20.0f, 0.11f, -108.0f, 55.66f, 20.0f, 0.15f, -123.33f, -10.66f, 20.0f, 0.18f, -116.0f, -63.33f, 20.0f, 0.15f}, new float[]{27.33f, -57.66f, 20.0f, 0.12f, 59.0f, -32.0f, 19.33f, 0.22f, 77.0f, 4.33f, 22.66f, 0.2f, 100.0f, 40.33f, 18.0f, 0.12f, 58.66f, 59.0f, 20.0f, 0.18f, 73.33f, 100.33f, 22.66f, 0.15f, 75.0f, 155.0f, 22.0f, 0.11f, -27.33f, -57.33f, 20.0f, 0.12f, -59.0f, -32.33f, 19.33f, 0.2f, -77.0f, 4.66f, 23.33f, 0.2f, -98.66f, 41.0f, 18.66f, 0.12f, -58.0f, 59.33f, 19.33f, 0.18f, -73.33f, 100.0f, 22.0f, 0.15f, -75.66f, 155.0f, 22.0f, 0.11f}, new float[]{-0.83f, -52.16f, 12.33f, 0.2f, 26.66f, -40.33f, 16.0f, 0.2f, 44.16f, -20.5f, 12.33f, 0.2f, 53.0f, 7.33f, 16.0f, 0.2f, 31.0f, 23.66f, 14.66f, 0.2f, 0.0f, 32.0f, 13.33f, 0.2f, -29.0f, 23.66f, 14.0f, 0.2f, -53.0f, 7.33f, 16.0f, 0.2f, -44.5f, -20.16f, 12.33f, 0.2f, -27.33f, -40.33f, 16.0f, 0.2f, 43.66f, 50.0f, 14.66f, 0.2f, -41.66f, 48.0f, 14.66f, 0.2f}, new float[]{-0.16f, -103.5f, 20.33f, 0.15f, 39.66f, -77.33f, 26.66f, 0.15f, 70.66f, -46.33f, 21.33f, 0.15f, 84.5f, -3.83f, 29.66f, 0.15f, 65.33f, 56.33f, 24.66f, 0.15f, 0.0f, 67.66f, 24.66f, 0.15f, -65.66f, 56.66f, 24.66f, 0.15f, -85.0f, -4.0f, 29.33f, 0.15f, -70.66f, -46.33f, 21.33f, 0.15f, -40.33f, -77.66f, 26.66f, 0.15f, 62.66f, -109.66f, 21.33f, 0.11f, 103.166f, -67.5f, 20.33f, 0.11f, 110.33f, 37.66f, 20.66f, 0.11f, 94.166f, 91.16f, 20.33f, 0.11f, 38.83f, 91.16f, 20.33f, 0.11f, 0.0f, 112.5f, 20.33f, 0.11f, -38.83f, 91.16f, 20.33f, 0.11f, -94.166f, 91.16f, 20.33f, 0.11f, -110.33f, 37.66f, 20.66f, 0.11f, -103.166f, -67.5f, 20.33f, 0.11f, -62.66f, -109.66f, 21.33f, 0.11f}};
        f4026a = fArr;
        short s5 = 0;
        for (float[] fArr2 : fArr) {
            s5 = (short) Math.max((int) s5, fArr2.length / 4);
        }
        f4027b = new a4.k(s5);
    }

    public static void a(Canvas canvas, int i7, Drawable drawable, float f10, float f11, float f12, float f13) {
        if (f12 > 0.0f) {
            int i10 = 0;
            while (true) {
                float[] fArr = f4026a[i7];
                if (i10 < fArr.length) {
                    float f14 = fArr[i10];
                    float f15 = fArr[i10 + 1];
                    float f16 = fArr[i10 + 2];
                    float f17 = fArr[i10 + 3];
                    if (f10 < f11 && i7 == 0) {
                        f15 = f14;
                        f14 = f15;
                    }
                    float f18 = f14 * f13;
                    float f19 = f15 * f13;
                    float f20 = f16 * f13;
                    drawable.setBounds((int) (org.telegram.messenger.g0.L(f18) - (org.telegram.messenger.g0.L(f20) / 2.0f)), (int) (org.telegram.messenger.g0.L(f19) - (org.telegram.messenger.g0.L(f20) / 2.0f)), (int) ((org.telegram.messenger.g0.L(f20) / 2.0f) + org.telegram.messenger.g0.L(f18)), (int) ((org.telegram.messenger.g0.L(f20) / 2.0f) + org.telegram.messenger.g0.L(f19)));
                    drawable.setAlpha((int) Utilities.i(f12 * 255.0f * f17, 255.0f, 0.0f));
                    drawable.draw(canvas);
                    i10 += 4;
                } else {
                    return;
                }
            }
        }
    }

    public static void b(Canvas canvas, int i7, Paint paint, Bitmap bitmap, float f10, float f11, float f12) {
        a4.k kVar;
        if (f12 <= 0.0f) {
            return;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            kVar = f4027b;
            if (i11 >= kVar.f191b) {
                break;
            }
            a4.k.d((float[]) kVar.d, i11, 0.0f, 0.0f, width, height);
            i11++;
        }
        while (true) {
            float[] fArr = f4026a[i7];
            if (i10 < fArr.length) {
                float f13 = fArr[i10];
                float f14 = fArr[i10 + 1];
                float f15 = fArr[i10 + 2];
                float f16 = fArr[i10 + 3];
                if (f10 < f11 && i7 == 0) {
                    f14 = f13;
                    f13 = f14;
                }
                float f17 = f13 * 1.0f;
                float f18 = f14 * 1.0f;
                float f19 = f15 * 1.0f;
                int i12 = i10 / 4;
                a4.k.d((float[]) kVar.f192c, i12, org.telegram.messenger.g0.L(f17) - (org.telegram.messenger.g0.L(f19) / 2.0f), org.telegram.messenger.g0.L(f18) - (org.telegram.messenger.g0.L(f19) / 2.0f), (org.telegram.messenger.g0.L(f19) / 2.0f) + org.telegram.messenger.g0.L(f17), (org.telegram.messenger.g0.L(f19) / 2.0f) + org.telegram.messenger.g0.L(f18));
                kVar.t(i12, i0.a.o(-1, (int) (255.0f * f12 * f16)));
                i10 += 4;
            } else {
                g0.a.b(canvas, kVar, fArr.length / 4, paint);
                return;
            }
        }
    }

    public static void c(Canvas canvas, org.telegram.ui.Components.g5 g5Var, int i7, float f10, float f11, RectF rectF, float f12) {
        float f13;
        float f14;
        float l10;
        float f15;
        float f16 = f11;
        if (f16 > 0.0f) {
            if (f16 >= 0.85f) {
                f13 = 1.0f;
            } else {
                f13 = f16 / 0.85f;
            }
            float l11 = Utilities.l((f13 - 0.2f) / 0.8f);
            float f17 = rectF.left;
            float f18 = rectF.top;
            float width = rectF.width();
            float height = rectF.height();
            float f19 = (width / 2.0f) + f17;
            float f20 = (height / 2.0f) + f18;
            float N = org.telegram.messenger.g0.N(96.0f);
            float min = Math.min(f17, (i7 - N) / 2.0f);
            float max = Math.max(f18, (f10 - N) / 2.0f);
            float max2 = Math.max(width, N);
            float max3 = Math.max(height, N);
            float f21 = max2 / 2.0f;
            float f22 = min + f21;
            float f23 = max3 / 2.0f;
            float f24 = max + f23;
            float N2 = org.telegram.messenger.g0.N(24.0f);
            float N3 = org.telegram.messenger.g0.N(16.0f);
            float N4 = org.telegram.messenger.g0.N(12.0f);
            float N5 = org.telegram.messenger.g0.N(8.0f);
            float N6 = org.telegram.messenger.g0.N(4.0f);
            float f25 = N2 * 2.0f;
            float f26 = f25 * 2.0f;
            float cos = (f25 + f21) * ((float) Math.cos(Math.toRadians(120.0d)));
            float cos2 = (N3 + f23) * ((float) Math.cos(Math.toRadians(160.0d)));
            float f27 = max + max3;
            float f28 = min - N3;
            float f29 = max3 / 4.0f;
            float f30 = (f24 - f29) - N5;
            float f31 = min + max2;
            float f32 = f31 + N3;
            float f33 = f24 + f29 + N5;
            float f34 = min - f25;
            float f35 = f31 + f25;
            float f36 = f22 + cos;
            float f37 = (max - f25) + N4;
            float f38 = f22 - cos;
            float f39 = (f27 + f25) - N4;
            float f40 = f34 - N5;
            float f41 = f24 + cos2;
            float f42 = f35 + N5;
            float f43 = f24 - cos2;
            float f44 = min - f26;
            float f45 = f31 + f26;
            float f46 = 1.0f;
            int i10 = 0;
            float[] fArr = {f22, max - N2, 20.0f, f22, f27 + N2, 20.0f, f28, f30, 23.0f, f32, f30, 18.0f, f28, f33, 24.0f, f32 - N6, f33, 24.0f, f34, f24, 19.0f, f35, f24, 19.0f, f36, f37, 17.0f, f38, f37, 17.0f, f36, f39, 20.0f, f38, f39, 20.0f, f40, f41, 20.0f, f42, f41, 19.0f, f40, f43, 21.0f, f42, f43, 18.0f, f44, f24, 19.0f, f45, f24, 19.0f};
            float[] fArr2 = {0.02f, 0.42f, 0.0f, 0.32f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.14f, 0.6f, 0.16f, 0.64f, 0.14f, 0.7f, 0.14f, 0.9f, 0.2f, 0.75f, 0.2f, 0.85f, 0.09f, 0.45f, 0.09f, 0.45f, 0.09f, 0.45f, 0.11f, 0.45f, 0.14f, 0.75f, 0.2f, 0.8f};
            int i11 = 0;
            for (int i12 = 54; i11 < i12; i12 = 54) {
                float f47 = fArr[i11];
                float f48 = fArr[i11 + 1];
                float N7 = org.telegram.messenger.g0.N(fArr[i11 + 2]) * 0.5f;
                float f49 = fArr2[i10];
                float f50 = fArr2[i10 + 1];
                float f51 = f46 - l11;
                if (f51 < f49) {
                    f14 = max3;
                    l10 = f46;
                } else {
                    f14 = max3;
                    l10 = f46 - Utilities.l((f51 - f49) / (f50 - f49));
                }
                float f52 = f27;
                if (i11 == 18 || i11 == 19 || i11 == 6 || i11 == 7) {
                    l10 = xq.f40312i.getInterpolation(l10);
                }
                float[] fArr3 = fArr2;
                float f53 = f46;
                float v = com.google.android.recaptcha.internal.a.v(f53, f16, org.telegram.messenger.g0.L(12.0f), f48);
                int i13 = (l10 > f53 ? 1 : (l10 == f53 ? 0 : -1));
                if (i13 < 0) {
                    f47 = org.telegram.messenger.g0.T1(f19, f47, xq.f40312i.getInterpolation(l10));
                    v = org.telegram.messenger.g0.T1(f20, v, l10);
                    N7 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(8.0f), N7, l10);
                }
                if (v > f52 + org.telegram.messenger.g0.L(8.0f)) {
                    f46 = 1.0f;
                    f15 = 1.0f - Utilities.l((((v - max) - f14) - org.telegram.messenger.g0.L(8.0f)) / org.telegram.messenger.g0.L(56.0f));
                } else {
                    f46 = 1.0f;
                    f15 = 1.0f;
                }
                float l12 = (f46 - Utilities.l(a8.r9.a(f22, f24, f47, v) / (max2 * 2.0f))) * f12 * 0.5f * f15;
                if (i13 < 0) {
                    l12 = org.telegram.messenger.g0.T1(0.0f, l12, l10);
                }
                g5Var.setBounds((int) (f47 - N7), (int) (v - N7), (int) (f47 + N7), (int) (v + N7));
                g5Var.f33862w = (int) (l12 * 255.0f);
                g5Var.draw(canvas);
                i11 += 3;
                i10 += 2;
                f16 = f11;
                f27 = f52;
                max3 = f14;
                fArr2 = fArr3;
            }
        }
    }
}
