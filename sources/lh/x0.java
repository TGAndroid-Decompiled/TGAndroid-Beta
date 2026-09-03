package lh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.ai;
public abstract class x0 {
    public static final float[][] f13311a;
    public static final a4.k f13312b;

    static {
        float[][] fArr = {new float[]{83.33f, 24.0f, 27.33f, 0.22f, 68.66f, 75.33f, 25.33f, 0.21f, 0.0f, 86.0f, 25.33f, 0.12f, -68.66f, 75.33f, 25.33f, 0.21f, -82.66f, 13.66f, 27.33f, 0.22f, -80.0f, -33.33f, 20.0f, 0.24f, -46.5f, -63.16f, 27.0f, 0.21f, 1.0f, -82.66f, 20.0f, 0.15f, 46.5f, -63.16f, 27.0f, 0.21f, 80.0f, -33.33f, 19.33f, 0.24f, 115.66f, -63.0f, 20.0f, 0.15f, 134.0f, -10.66f, 20.0f, 0.18f, 118.66f, 55.66f, 20.0f, 0.15f, 124.33f, 98.33f, 20.0f, 0.11f, -128.0f, 98.33f, 20.0f, 0.11f, -108.0f, 55.66f, 20.0f, 0.15f, -123.33f, -10.66f, 20.0f, 0.18f, -116.0f, -63.33f, 20.0f, 0.15f}, new float[]{27.33f, -57.66f, 20.0f, 0.12f, 59.0f, -32.0f, 19.33f, 0.22f, 77.0f, 4.33f, 22.66f, 0.2f, 100.0f, 40.33f, 18.0f, 0.12f, 58.66f, 59.0f, 20.0f, 0.18f, 73.33f, 100.33f, 22.66f, 0.15f, 75.0f, 155.0f, 22.0f, 0.11f, -27.33f, -57.33f, 20.0f, 0.12f, -59.0f, -32.33f, 19.33f, 0.2f, -77.0f, 4.66f, 23.33f, 0.2f, -98.66f, 41.0f, 18.66f, 0.12f, -58.0f, 59.33f, 19.33f, 0.18f, -73.33f, 100.0f, 22.0f, 0.15f, -75.66f, 155.0f, 22.0f, 0.11f}, new float[]{-0.83f, -52.16f, 12.33f, 0.2f, 26.66f, -40.33f, 16.0f, 0.2f, 44.16f, -20.5f, 12.33f, 0.2f, 53.0f, 7.33f, 16.0f, 0.2f, 31.0f, 23.66f, 14.66f, 0.2f, 0.0f, 32.0f, 13.33f, 0.2f, -29.0f, 23.66f, 14.0f, 0.2f, -53.0f, 7.33f, 16.0f, 0.2f, -44.5f, -20.16f, 12.33f, 0.2f, -27.33f, -40.33f, 16.0f, 0.2f, 43.66f, 50.0f, 14.66f, 0.2f, -41.66f, 48.0f, 14.66f, 0.2f}, new float[]{-0.16f, -103.5f, 20.33f, 0.15f, 39.66f, -77.33f, 26.66f, 0.15f, 70.66f, -46.33f, 21.33f, 0.15f, 84.5f, -3.83f, 29.66f, 0.15f, 65.33f, 56.33f, 24.66f, 0.15f, 0.0f, 67.66f, 24.66f, 0.15f, -65.66f, 56.66f, 24.66f, 0.15f, -85.0f, -4.0f, 29.33f, 0.15f, -70.66f, -46.33f, 21.33f, 0.15f, -40.33f, -77.66f, 26.66f, 0.15f, 62.66f, -109.66f, 21.33f, 0.11f, 103.166f, -67.5f, 20.33f, 0.11f, 110.33f, 37.66f, 20.66f, 0.11f, 94.166f, 91.16f, 20.33f, 0.11f, 38.83f, 91.16f, 20.33f, 0.11f, 0.0f, 112.5f, 20.33f, 0.11f, -38.83f, 91.16f, 20.33f, 0.11f, -94.166f, 91.16f, 20.33f, 0.11f, -110.33f, 37.66f, 20.66f, 0.11f, -103.166f, -67.5f, 20.33f, 0.11f, -62.66f, -109.66f, 21.33f, 0.11f}};
        f13311a = fArr;
        short s6 = 0;
        for (float[] fArr2 : fArr) {
            s6 = (short) Math.max((int) s6, fArr2.length / 4);
        }
        f13312b = new a4.k(s6);
    }

    public static void a(Canvas canvas, int i10, Drawable drawable, float f10, float f11, float f12, float f13) {
        if (f12 > 0.0f) {
            int i11 = 0;
            while (true) {
                float[] fArr = f13311a[i10];
                if (i11 < fArr.length) {
                    float f14 = fArr[i11];
                    float f15 = fArr[i11 + 1];
                    float f16 = fArr[i11 + 2];
                    float f17 = fArr[i11 + 3];
                    if (f10 < f11 && i10 == 0) {
                        f15 = f14;
                        f14 = f15;
                    }
                    float f18 = f14 * f13;
                    float f19 = f15 * f13;
                    float f20 = f16 * f13;
                    drawable.setBounds((int) (AndroidUtilities.dp(f18) - (AndroidUtilities.dp(f20) / 2.0f)), (int) (AndroidUtilities.dp(f19) - (AndroidUtilities.dp(f20) / 2.0f)), (int) ((AndroidUtilities.dp(f20) / 2.0f) + AndroidUtilities.dp(f18)), (int) ((AndroidUtilities.dp(f20) / 2.0f) + AndroidUtilities.dp(f19)));
                    drawable.setAlpha((int) Utilities.clamp(f12 * 255.0f * f17, 255.0f, 0.0f));
                    drawable.draw(canvas);
                    i11 += 4;
                } else {
                    return;
                }
            }
        }
    }

    public static void b(Canvas canvas, int i10, Paint paint, Bitmap bitmap, float f10, float f11, float f12) {
        a4.k kVar;
        if (f12 <= 0.0f) {
            return;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            kVar = f13312b;
            if (i12 >= kVar.f84a) {
                break;
            }
            a4.k.b((float[]) kVar.f86c, i12, 0.0f, 0.0f, width, height);
            i12++;
        }
        while (true) {
            float[] fArr = f13311a[i10];
            if (i11 < fArr.length) {
                float f13 = fArr[i11];
                float f14 = fArr[i11 + 1];
                float f15 = fArr[i11 + 2];
                float f16 = fArr[i11 + 3];
                if (f10 < f11 && i10 == 0) {
                    f14 = f13;
                    f13 = f14;
                }
                float f17 = f13 * 1.0f;
                float f18 = f14 * 1.0f;
                float f19 = f15 * 1.0f;
                int i13 = i11 / 4;
                a4.k.b((float[]) kVar.f85b, i13, AndroidUtilities.dp(f17) - (AndroidUtilities.dp(f19) / 2.0f), AndroidUtilities.dp(f18) - (AndroidUtilities.dp(f19) / 2.0f), (AndroidUtilities.dp(f19) / 2.0f) + AndroidUtilities.dp(f17), (AndroidUtilities.dp(f19) / 2.0f) + AndroidUtilities.dp(f18));
                kVar.e(i13, i0.a.k(-1, (int) (255.0f * f12 * f16)));
                i11 += 4;
            } else {
                g0.a.b(canvas, kVar, fArr.length / 4, paint);
                return;
            }
        }
    }

    public static void c(Canvas canvas, org.telegram.ui.Components.j5 j5Var, int i10, float f10, float f11, RectF rectF, float f12) {
        float f13;
        float f14;
        float clamp01;
        float f15;
        float f16 = f11;
        if (f16 > 0.0f) {
            if (f16 >= 0.85f) {
                f13 = 1.0f;
            } else {
                f13 = f16 / 0.85f;
            }
            float clamp012 = Utilities.clamp01((f13 - 0.2f) / 0.8f);
            float f17 = rectF.left;
            float f18 = rectF.top;
            float width = rectF.width();
            float height = rectF.height();
            float f19 = (width / 2.0f) + f17;
            float f20 = (height / 2.0f) + f18;
            float dpf2 = AndroidUtilities.dpf2(96.0f);
            float min = Math.min(f17, (i10 - dpf2) / 2.0f);
            float max = Math.max(f18, (f10 - dpf2) / 2.0f);
            float max2 = Math.max(width, dpf2);
            float max3 = Math.max(height, dpf2);
            float f21 = max2 / 2.0f;
            float f22 = min + f21;
            float f23 = max3 / 2.0f;
            float f24 = max + f23;
            float dpf22 = AndroidUtilities.dpf2(24.0f);
            float dpf23 = AndroidUtilities.dpf2(16.0f);
            float dpf24 = AndroidUtilities.dpf2(12.0f);
            float dpf25 = AndroidUtilities.dpf2(8.0f);
            float dpf26 = AndroidUtilities.dpf2(4.0f);
            float f25 = dpf22 * 2.0f;
            float f26 = f25 * 2.0f;
            float cos = (f25 + f21) * ((float) Math.cos(Math.toRadians(120.0d)));
            float cos2 = (dpf23 + f23) * ((float) Math.cos(Math.toRadians(160.0d)));
            float f27 = max + max3;
            float f28 = min - dpf23;
            float f29 = max3 / 4.0f;
            float f30 = (f24 - f29) - dpf25;
            float f31 = min + max2;
            float f32 = f31 + dpf23;
            float f33 = f24 + f29 + dpf25;
            float f34 = min - f25;
            float f35 = f31 + f25;
            float f36 = f22 + cos;
            float f37 = (max - f25) + dpf24;
            float f38 = f22 - cos;
            float f39 = (f27 + f25) - dpf24;
            float f40 = f34 - dpf25;
            float f41 = f24 + cos2;
            float f42 = f35 + dpf25;
            float f43 = f24 - cos2;
            float f44 = min - f26;
            float f45 = f31 + f26;
            float f46 = 1.0f;
            int i11 = 0;
            float[] fArr = {f22, max - dpf22, 20.0f, f22, f27 + dpf22, 20.0f, f28, f30, 23.0f, f32, f30, 18.0f, f28, f33, 24.0f, f32 - dpf26, f33, 24.0f, f34, f24, 19.0f, f35, f24, 19.0f, f36, f37, 17.0f, f38, f37, 17.0f, f36, f39, 20.0f, f38, f39, 20.0f, f40, f41, 20.0f, f42, f41, 19.0f, f40, f43, 21.0f, f42, f43, 18.0f, f44, f24, 19.0f, f45, f24, 19.0f};
            float[] fArr2 = {0.02f, 0.42f, 0.0f, 0.32f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.14f, 0.6f, 0.16f, 0.64f, 0.14f, 0.7f, 0.14f, 0.9f, 0.2f, 0.75f, 0.2f, 0.85f, 0.09f, 0.45f, 0.09f, 0.45f, 0.09f, 0.45f, 0.11f, 0.45f, 0.14f, 0.75f, 0.2f, 0.8f};
            int i12 = 0;
            for (int i13 = 54; i12 < i13; i13 = 54) {
                float f47 = fArr[i12];
                float f48 = fArr[i12 + 1];
                float dpf27 = AndroidUtilities.dpf2(fArr[i12 + 2]) * 0.5f;
                float f49 = fArr2[i11];
                float f50 = fArr2[i11 + 1];
                float f51 = f46 - clamp012;
                if (f51 < f49) {
                    f14 = max3;
                    clamp01 = 1.0f;
                } else {
                    f14 = max3;
                    clamp01 = f46 - Utilities.clamp01((f51 - f49) / (f50 - f49));
                }
                float f52 = f27;
                if (i12 == 18 || i12 == 19 || i12 == 6 || i12 == 7) {
                    clamp01 = mr.f27124i.getInterpolation(clamp01);
                }
                float[] fArr3 = fArr;
                float c3 = ai.c(1.0f, f16, AndroidUtilities.dp(12.0f), f48);
                int i14 = (clamp01 > 1.0f ? 1 : (clamp01 == 1.0f ? 0 : -1));
                if (i14 < 0) {
                    f47 = AndroidUtilities.lerp(f19, f47, mr.f27124i.getInterpolation(clamp01));
                    c3 = AndroidUtilities.lerp(f20, c3, clamp01);
                    dpf27 = AndroidUtilities.lerp(AndroidUtilities.dpf2(8.0f), dpf27, clamp01);
                }
                if (c3 > f52 + AndroidUtilities.dp(8.0f)) {
                    f46 = 1.0f;
                    f15 = 1.0f - Utilities.clamp01((((c3 - max) - f14) - AndroidUtilities.dp(8.0f)) / AndroidUtilities.dp(56.0f));
                } else {
                    f46 = 1.0f;
                    f15 = 1.0f;
                }
                float clamp013 = (f46 - Utilities.clamp01(k7.n6.a(f22, f24, f47, c3) / (max2 * 2.0f))) * f12 * 0.5f * f15;
                if (i14 < 0) {
                    clamp013 = AndroidUtilities.lerp(0.0f, clamp013, clamp01);
                }
                j5Var.setBounds((int) (f47 - dpf27), (int) (c3 - dpf27), (int) (f47 + dpf27), (int) (c3 + dpf27));
                j5Var.v = (int) (clamp013 * 255.0f);
                j5Var.draw(canvas);
                i12 += 3;
                i11 += 2;
                f16 = f11;
                f27 = f52;
                max3 = f14;
                fArr = fArr3;
            }
        }
    }
}
