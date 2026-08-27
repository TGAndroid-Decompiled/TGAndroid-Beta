package hh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;

public abstract class y0 {

    public static final float[][] f10355a;

    public static final e0.i0 f10356b;

    static {
        float[][] fArr = {new float[]{83.33f, 24.0f, 27.33f, 0.22f, 68.66f, 75.33f, 25.33f, 0.21f, 0.0f, 86.0f, 25.33f, 0.12f, -68.66f, 75.33f, 25.33f, 0.21f, -82.66f, 13.66f, 27.33f, 0.22f, -80.0f, -33.33f, 20.0f, 0.24f, -46.5f, -63.16f, 27.0f, 0.21f, 1.0f, -82.66f, 20.0f, 0.15f, 46.5f, -63.16f, 27.0f, 0.21f, 80.0f, -33.33f, 19.33f, 0.24f, 115.66f, -63.0f, 20.0f, 0.15f, 134.0f, -10.66f, 20.0f, 0.18f, 118.66f, 55.66f, 20.0f, 0.15f, 124.33f, 98.33f, 20.0f, 0.11f, -128.0f, 98.33f, 20.0f, 0.11f, -108.0f, 55.66f, 20.0f, 0.15f, -123.33f, -10.66f, 20.0f, 0.18f, -116.0f, -63.33f, 20.0f, 0.15f}, new float[]{27.33f, -57.66f, 20.0f, 0.12f, 59.0f, -32.0f, 19.33f, 0.22f, 77.0f, 4.33f, 22.66f, 0.2f, 100.0f, 40.33f, 18.0f, 0.12f, 58.66f, 59.0f, 20.0f, 0.18f, 73.33f, 100.33f, 22.66f, 0.15f, 75.0f, 155.0f, 22.0f, 0.11f, -27.33f, -57.33f, 20.0f, 0.12f, -59.0f, -32.33f, 19.33f, 0.2f, -77.0f, 4.66f, 23.33f, 0.2f, -98.66f, 41.0f, 18.66f, 0.12f, -58.0f, 59.33f, 19.33f, 0.18f, -73.33f, 100.0f, 22.0f, 0.15f, -75.66f, 155.0f, 22.0f, 0.11f}, new float[]{-0.83f, -52.16f, 12.33f, 0.2f, 26.66f, -40.33f, 16.0f, 0.2f, 44.16f, -20.5f, 12.33f, 0.2f, 53.0f, 7.33f, 16.0f, 0.2f, 31.0f, 23.66f, 14.66f, 0.2f, 0.0f, 32.0f, 13.33f, 0.2f, -29.0f, 23.66f, 14.0f, 0.2f, -53.0f, 7.33f, 16.0f, 0.2f, -44.5f, -20.16f, 12.33f, 0.2f, -27.33f, -40.33f, 16.0f, 0.2f, 43.66f, 50.0f, 14.66f, 0.2f, -41.66f, 48.0f, 14.66f, 0.2f}, new float[]{-0.16f, -103.5f, 20.33f, 0.15f, 39.66f, -77.33f, 26.66f, 0.15f, 70.66f, -46.33f, 21.33f, 0.15f, 84.5f, -3.83f, 29.66f, 0.15f, 65.33f, 56.33f, 24.66f, 0.15f, 0.0f, 67.66f, 24.66f, 0.15f, -65.66f, 56.66f, 24.66f, 0.15f, -85.0f, -4.0f, 29.33f, 0.15f, -70.66f, -46.33f, 21.33f, 0.15f, -40.33f, -77.66f, 26.66f, 0.15f, 62.66f, -109.66f, 21.33f, 0.11f, 103.166f, -67.5f, 20.33f, 0.11f, 110.33f, 37.66f, 20.66f, 0.11f, 94.166f, 91.16f, 20.33f, 0.11f, 38.83f, 91.16f, 20.33f, 0.11f, 0.0f, 112.5f, 20.33f, 0.11f, -38.83f, 91.16f, 20.33f, 0.11f, -94.166f, 91.16f, 20.33f, 0.11f, -110.33f, 37.66f, 20.66f, 0.11f, -103.166f, -67.5f, 20.33f, 0.11f, -62.66f, -109.66f, 21.33f, 0.11f}};
        f10355a = fArr;
        short sMax = 0;
        for (float[] fArr2 : fArr) {
            sMax = (short) Math.max((int) sMax, fArr2.length / 4);
        }
        f10356b = new e0.i0(sMax);
    }

    public static void a(Canvas canvas, int i10, Drawable drawable, float f10, float f11, float f12, float f13) {
        if (f12 <= 0.0f) {
            return;
        }
        int i11 = 0;
        while (true) {
            float[] fArr = f10355a[i10];
            if (i11 >= fArr.length) {
                return;
            }
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
        }
    }

    public static void b(Canvas canvas, int i10, Paint paint, Bitmap bitmap, float f10, float f11, float f12) {
        e0.i0 i0Var;
        if (f12 <= 0.0f) {
            return;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i0Var = f10356b;
            if (i12 >= i0Var.f5064a) {
                break;
            }
            e0.i0.c((float[]) i0Var.f5066c, i12, 0.0f, 0.0f, width, height);
            i12++;
        }
        while (true) {
            float[] fArr = f10355a[i10];
            if (i11 >= fArr.length) {
                g0.a.b(canvas, i0Var, fArr.length / 4, paint);
                return;
            }
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
            e0.i0.c((float[]) i0Var.f5065b, i13, AndroidUtilities.dp(f17) - (AndroidUtilities.dp(f19) / 2.0f), AndroidUtilities.dp(f18) - (AndroidUtilities.dp(f19) / 2.0f), (AndroidUtilities.dp(f19) / 2.0f) + AndroidUtilities.dp(f17), (AndroidUtilities.dp(f19) / 2.0f) + AndroidUtilities.dp(f18));
            i0Var.e(i13, i0.b.k(-1, (int) (255.0f * f12 * f16)));
            i11 += 4;
        }
    }

    public static void c(Canvas canvas, org.telegram.ui.Components.i5 i5Var, int i10, float f10, float f11, RectF rectF, float f12) {
        float fClamp01;
        float f13 = f11;
        if (f13 <= 0.0f) {
            return;
        }
        float fClamp02 = Utilities.clamp01(((f13 >= 0.85f ? 1.0f : f13 / 0.85f) - 0.2f) / 0.8f);
        float f14 = rectF.left;
        float f15 = rectF.top;
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float f16 = (fWidth / 2.0f) + f14;
        float f17 = (fHeight / 2.0f) + f15;
        float fDpf2 = AndroidUtilities.dpf2(96.0f);
        float fMin = Math.min(f14, (i10 - fDpf2) / 2.0f);
        float fMax = Math.max(f15, (f10 - fDpf2) / 2.0f);
        float fMax2 = Math.max(fWidth, fDpf2);
        float fMax3 = Math.max(fHeight, fDpf2);
        float f18 = fMax2 / 2.0f;
        float f19 = fMin + f18;
        float f20 = fMax3 / 2.0f;
        float f21 = fMax + f20;
        float fDpf3 = AndroidUtilities.dpf2(24.0f);
        float fDpf4 = AndroidUtilities.dpf2(16.0f);
        float fDpf5 = AndroidUtilities.dpf2(12.0f);
        float fDpf6 = AndroidUtilities.dpf2(8.0f);
        float fDpf7 = AndroidUtilities.dpf2(4.0f);
        float f22 = fDpf3 * 2.0f;
        float f23 = f22 * 2.0f;
        float fCos = (f22 + f18) * ((float) Math.cos(Math.toRadians(120.0d)));
        float fCos2 = (fDpf4 + f20) * ((float) Math.cos(Math.toRadians(160.0d)));
        float f24 = fMax + fMax3;
        float f25 = fMin - fDpf4;
        float f26 = fMax3 / 4.0f;
        float f27 = (f21 - f26) - fDpf6;
        float f28 = fMin + fMax2;
        float f29 = f28 + fDpf4;
        float f30 = f21 + f26 + fDpf6;
        float f31 = fMin - f22;
        float f32 = f28 + f22;
        float f33 = f19 + fCos;
        float f34 = (fMax - f22) + fDpf5;
        float f35 = f19 - fCos;
        float f36 = (f24 + f22) - fDpf5;
        float f37 = f31 - fDpf6;
        float f38 = f21 + fCos2;
        float f39 = f32 + fDpf6;
        float f40 = f21 - fCos2;
        float f41 = fMin - f23;
        float f42 = f28 + f23;
        float f43 = 1.0f;
        int i11 = 0;
        float[] fArr = {f19, fMax - fDpf3, 20.0f, f19, f24 + fDpf3, 20.0f, f25, f27, 23.0f, f29, f27, 18.0f, f25, f30, 24.0f, f29 - fDpf7, f30, 24.0f, f31, f21, 19.0f, f32, f21, 19.0f, f33, f34, 17.0f, f35, f34, 17.0f, f33, f36, 20.0f, f35, f36, 20.0f, f37, f38, 20.0f, f39, f38, 19.0f, f37, f40, 21.0f, f39, f40, 18.0f, f41, f21, 19.0f, f42, f21, 19.0f};
        float[] fArr2 = {0.02f, 0.42f, 0.0f, 0.32f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.14f, 0.6f, 0.16f, 0.64f, 0.14f, 0.7f, 0.14f, 0.9f, 0.2f, 0.75f, 0.2f, 0.85f, 0.09f, 0.45f, 0.09f, 0.45f, 0.09f, 0.45f, 0.11f, 0.45f, 0.14f, 0.75f, 0.2f, 0.8f};
        int i12 = 0;
        for (int i13 = 54; i12 < i13; i13 = 54) {
            float fLerp = fArr[i12];
            float f44 = fArr[i12 + 1];
            float fDpf8 = AndroidUtilities.dpf2(fArr[i12 + 2]) * 0.5f;
            float f45 = fArr2[i11];
            float f46 = f43 - fClamp02;
            float fClamp03 = f46 < f45 ? 1.0f : f43 - Utilities.clamp01((f46 - f45) / (fArr2[i11 + 1] - f45));
            float f47 = f24;
            if (i12 == 18 || i12 == 19 || i12 == 6 || i12 == 7) {
                fClamp03 = er.f28124i.getInterpolation(fClamp03);
            }
            float[] fArr3 = fArr;
            float fB = org.telegram.ui.Cells.pa.b(1.0f, f13, AndroidUtilities.dp(12.0f), f44);
            if (fClamp03 < 1.0f) {
                fLerp = AndroidUtilities.lerp(f16, fLerp, er.f28124i.getInterpolation(fClamp03));
                fB = AndroidUtilities.lerp(f17, fB, fClamp03);
                fDpf8 = AndroidUtilities.lerp(AndroidUtilities.dpf2(8.0f), fDpf8, fClamp03);
            }
            if (fB > f47 + AndroidUtilities.dp(8.0f)) {
                f43 = 1.0f;
                fClamp01 = 1.0f - Utilities.clamp01((((fB - fMax) - fMax3) - AndroidUtilities.dp(8.0f)) / AndroidUtilities.dp(56.0f));
            } else {
                f43 = 1.0f;
                fClamp01 = 1.0f;
            }
            float fClamp04 = (f43 - Utilities.clamp01(h7.y.a(f19, f21, fLerp, fB) / (fMax2 * 2.0f))) * f12 * 0.5f * fClamp01;
            if (fClamp03 < 1.0f) {
                fClamp04 = AndroidUtilities.lerp(0.0f, fClamp04, fClamp03);
            }
            i5Var.setBounds((int) (fLerp - fDpf8), (int) (fB - fDpf8), (int) (fLerp + fDpf8), (int) (fB + fDpf8));
            i5Var.v = (int) (fClamp04 * 255.0f);
            i5Var.draw(canvas);
            i12 += 3;
            i11 += 2;
            f13 = f11;
            f24 = f47;
            fMax3 = fMax3;
            fArr = fArr3;
        }
    }
}
