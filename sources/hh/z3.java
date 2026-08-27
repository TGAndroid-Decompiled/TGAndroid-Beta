package hh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

public final class z3 extends FrameLayout {
    public float A;
    public int B;
    public ValueAnimator C;
    public y3 D;
    public final f2.r E;

    public final View[] f10410a;

    public final Matrix f10411b;

    public final float[] f10412c;
    public float d;

    public float f10413e;

    public boolean f10414f;
    public final float[][] h;

    public final float[] f10415n;

    public final float[] f10416r;

    public final Integer[] f10417s;
    public final HashSet v;

    public final HashMap f10418w;

    public final HashMap f10419x;

    public final float[] f10420y;

    public z3(Context context, View[] viewArr) {
        super(context);
        this.f10411b = new Matrix();
        float[] fArr = new float[16];
        this.f10412c = fArr;
        this.d = 0.0f;
        this.f10413e = 0.0f;
        this.f10414f = true;
        this.h = new float[][]{new float[]{-1.0f, 0.0f, 0.0f, 0.0f}, new float[]{1.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 1.0f, 0.0f, 0.0f}, new float[]{0.0f, -1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, -1.0f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f, 0.0f}};
        this.f10415n = new float[4];
        this.f10416r = new float[6];
        this.f10417s = new Integer[]{0, 1, 2, 3, 4, 5};
        this.v = new HashSet();
        this.f10418w = new HashMap();
        this.f10419x = new HashMap();
        this.f10420y = new float[6];
        this.B = -1;
        this.E = new f2.r(this, 23);
        setClipToOutline(false);
        setClipToPadding(false);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        this.f10410a = viewArr;
        for (View view : viewArr) {
            addView(view, h7.z5.e(108, 108, 17));
        }
    }

    public static void b(float f10, float f11, float f12, float[] fArr) {
        double d = f12;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f13 = 1.0f - fCos;
        float f14 = f13 * f10;
        fArr[0] = (f14 * f10) + fCos;
        float f15 = f14 * f11;
        float f16 = fSin * 0.0f;
        fArr[4] = f15 - f16;
        float f17 = f14 * 0.0f;
        float f18 = fSin * f11;
        fArr[8] = f17 + f18;
        fArr[12] = 0.0f;
        fArr[1] = f15 + f16;
        float f19 = f13 * f11;
        fArr[5] = (f11 * f19) + fCos;
        float f20 = f19 * 0.0f;
        float f21 = fSin * f10;
        fArr[9] = f20 - f21;
        fArr[13] = 0.0f;
        fArr[2] = f17 - f18;
        fArr[6] = f20 + f21;
        fArr[10] = com.google.android.recaptcha.internal.a.x(f13, 0.0f, 0.0f, fCos);
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static void c(float[] fArr, float[] fArr2, float[] fArr3) {
        float f10 = fArr[1];
        float f11 = fArr2[2];
        float f12 = fArr[2];
        fArr3[0] = (f10 * f11) - (fArr2[1] * f12);
        float f13 = fArr2[0];
        float f14 = fArr[0];
        fArr3[1] = (f12 * f13) - (f11 * f14);
        fArr3[2] = (f14 * fArr2[1]) - (fArr[1] * f13);
    }

    public static void d(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArr4 = new float[16];
        android.opengl.Matrix.multiplyMM(fArr4, 0, fArr, 0, fArr2, 0);
        System.arraycopy(fArr4, 0, fArr3, 0, 16);
    }

    public static void e(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fSqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11) + (f10 * f10));
        if (fSqrt > 0.0f) {
            fArr[0] = fArr[0] / fSqrt;
            fArr[1] = fArr[1] / fSqrt;
            fArr[2] = fArr[2] / fSqrt;
        }
    }

    public final void a() {
        if (Math.abs(this.d) > 1.0E-4f || Math.abs(this.f10413e) > 1.0E-4f) {
            float[] fArr = new float[16];
            b(1.0f, 0.0f, this.d, fArr);
            float[] fArr2 = this.f10412c;
            d(fArr, fArr2, fArr2);
            b(0.0f, 1.0f, this.f10413e, fArr);
            d(fArr, fArr2, fArr2);
            if (this.f10414f) {
                this.d *= 0.96f;
                this.f10413e *= 0.96f;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        RectF rectF;
        boolean z10;
        boolean z11;
        float f10;
        char c10;
        float fDp;
        int i10;
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 6) {
            z10 = this.B == iIndexOfChild;
            rectF = (RectF) this.f10419x.get(Integer.valueOf(iIndexOfChild));
            Integer num = (Integer) this.f10418w.get(Integer.valueOf(iIndexOfChild));
            if (num != null) {
                iIndexOfChild = num.intValue();
            }
            if (view instanceof e4) {
                e4 e4Var = (e4) view;
                float f11 = 1.0f - (z10 ? this.A : 1.0f);
                e4Var.d.setAlpha(f11);
                e4Var.f9169e.setAlpha(f11);
                if (!z10 || this.A >= 1.0f) {
                    this.f10410a[iIndexOfChild].setVisibility(8);
                }
            }
            z11 = true;
        } else {
            rectF = null;
            z10 = false;
            z11 = false;
        }
        float[][] fArr = this.h;
        android.opengl.Matrix.multiplyMV(this.f10415n, 0, this.f10412c, 0, fArr[iIndexOfChild], 0);
        float f12 = this.f10415n[2];
        if (f12 < 0.001f) {
            return false;
        }
        view.setAlpha(Math.min(1.0f, f12 / 0.3f));
        float width = view.getWidth() / 2.0f;
        if (z11 && (view instanceof e4)) {
            f10 = 1.0f;
            c10 = 6;
            fDp = ((z10 ? this.A : 1.0f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(-6.0f);
        } else {
            f10 = 1.0f;
            c10 = 6;
            fDp = 0.0f;
        }
        float fDp2 = AndroidUtilities.dp(108.0f) / 2.0f;
        float width2 = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float[] fArr2 = new float[4];
        float[] fArr3 = new float[4];
        float[] fArr4 = new float[4];
        System.arraycopy(fArr[iIndexOfChild], 0, fArr2, 0, 4);
        if (iIndexOfChild == 0) {
            i10 = 3;
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = f10;
            fArr4[0] = 0.0f;
            fArr4[1] = -1.0f;
            fArr4[2] = 0.0f;
        } else if (iIndexOfChild == 1) {
            i10 = 3;
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = -1.0f;
            fArr4[0] = 0.0f;
            fArr4[1] = -1.0f;
            fArr4[2] = 0.0f;
        } else if (iIndexOfChild == 2) {
            i10 = 3;
            fArr3[0] = f10;
            fArr3[1] = 0.0f;
            fArr3[2] = 0.0f;
            fArr4[0] = 0.0f;
            fArr4[1] = 0.0f;
            fArr4[2] = f10;
        } else if (iIndexOfChild == 3) {
            i10 = 3;
            fArr3[0] = f10;
            fArr3[1] = 0.0f;
            fArr3[2] = 0.0f;
            fArr4[0] = 0.0f;
            fArr4[1] = 0.0f;
            fArr4[2] = -1.0f;
        } else if (iIndexOfChild != 4) {
            i10 = 3;
            if (iIndexOfChild == 5) {
                fArr3[0] = f10;
                fArr3[1] = 0.0f;
                fArr3[2] = 0.0f;
                fArr4[0] = 0.0f;
                fArr4[1] = -1.0f;
                fArr4[2] = 0.0f;
            }
        } else {
            i10 = 3;
            fArr3[0] = -1.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = 0.0f;
            fArr4[0] = 0.0f;
            fArr4[1] = -1.0f;
            fArr4[2] = 0.0f;
        }
        fArr3[i10] = 0.0f;
        fArr4[i10] = 0.0f;
        float f13 = this.f10420y[iIndexOfChild];
        if (f13 != 0.0f) {
            double radians = (float) Math.toRadians(f13);
            float fCos = (float) Math.cos(radians);
            float fSin = (float) Math.sin(radians);
            float f14 = fArr3[0];
            float f15 = fArr4[0];
            float f16 = fArr3[1];
            float f17 = fArr4[1];
            float f18 = fArr3[2];
            float f19 = fArr4[2];
            fArr3[0] = (f15 * fSin) + (f14 * fCos);
            fArr3[1] = (f17 * fSin) + (f16 * fCos);
            fArr3[2] = (f19 * fSin) + (f18 * fCos);
            fArr4[0] = (f15 * fCos) + ((-f14) * fSin);
            fArr4[1] = (f17 * fCos) + ((-f16) * fSin);
            fArr4[2] = (f19 * fCos) + ((-f18) * fSin);
        }
        float[] fArr5 = new float[4];
        float[] fArr6 = new float[4];
        float[] fArr7 = new float[4];
        android.opengl.Matrix.multiplyMV(fArr5, 0, this.f10412c, 0, fArr2, 0);
        float[] fArr8 = fArr5;
        android.opengl.Matrix.multiplyMV(fArr6, 0, this.f10412c, 0, fArr3, 0);
        float[] fArr9 = fArr6;
        android.opengl.Matrix.multiplyMV(fArr7, 0, this.f10412c, 0, fArr4, 0);
        float f20 = 64.0f * fDp2;
        int i11 = 2;
        int i12 = 1;
        float[][] fArr10 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, i10);
        int i13 = 0;
        for (int i14 = 4; i13 < i14; i14 = 4) {
            float f21 = (i13 == i12 || i13 == i11) ? 1.0f : -1.0f;
            float f22 = (i13 == 0 || i13 == i12) ? 1.0f : -1.0f;
            float[] fArr11 = fArr10[i13];
            float[] fArr12 = fArr8;
            float[] fArr13 = fArr9;
            fArr11[0] = com.google.android.recaptcha.internal.a.B(fArr7[0], f22, (fArr9[0] * f21) + fArr8[0], fDp2);
            fArr11[1] = com.google.android.recaptcha.internal.a.B(fArr7[1], f22, (fArr13[1] * f21) + fArr12[1], fDp2);
            fArr11[2] = com.google.android.recaptcha.internal.a.B(fArr7[2], f22, (fArr13[2] * f21) + fArr12[2], fDp2);
            i13++;
            fArr9 = fArr13;
            fArr8 = fArr12;
            i12 = 1;
            i11 = 2;
        }
        char c11 = 2;
        float[] fArr14 = new float[8];
        int i15 = 0;
        while (i15 < 4) {
            float[] fArr15 = fArr10[i15];
            float f23 = f20 / (f20 - fArr15[c11]);
            int i16 = i15 * 2;
            fArr14[i16] = (fArr15[0] * f23) + width2;
            fArr14[i16 + 1] = (fArr15[1] * f23) + height;
            i15++;
            c11 = 2;
        }
        float f24 = (width2 - width) - fDp;
        float f25 = (height - width) - fDp;
        float f26 = width2 + width + fDp;
        float f27 = height + width + fDp;
        float[] fArr16 = new float[8];
        fArr16[0] = f24;
        fArr16[1] = f25;
        fArr16[2] = f26;
        fArr16[i10] = f25;
        fArr16[4] = f26;
        fArr16[5] = f27;
        fArr16[c10] = f24;
        fArr16[7] = f27;
        if (z10 && rectF != null) {
            float f28 = rectF.left;
            float f29 = rectF.top;
            float f30 = rectF.right;
            float f31 = rectF.bottom;
            float[] fArr17 = new float[8];
            fArr17[0] = f28;
            fArr17[1] = f29;
            fArr17[2] = f30;
            fArr17[i10] = f29;
            fArr17[4] = f30;
            fArr17[5] = f31;
            fArr17[c10] = f28;
            fArr17[7] = f31;
            AndroidUtilities.lerp(fArr17, fArr14, this.A, fArr14);
        }
        Matrix matrix = this.f10411b;
        matrix.reset();
        matrix.setPolyToPoly(fArr16, 0, fArr14, 0, 4);
        canvas.save();
        canvas.concat(matrix);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    public final void f(int i10, FrameLayout frameLayout) {
        if (i10 == -1) {
            i10 = 5;
        }
        AndroidUtilities.removeFromParent(frameLayout);
        int childCount = getChildCount();
        addView(frameLayout, h7.z5.e(64, 64, 17));
        this.v.add(Integer.valueOf(i10));
        this.f10418w.put(Integer.valueOf(childCount), Integer.valueOf(i10));
    }

    @Override
    public final int getChildDrawingOrder(int i10, int i11) {
        if (i11 < 6) {
            Integer[] numArr = this.f10417s;
            if (i11 < numArr.length) {
                return numArr[i11].intValue();
            }
        }
        return i11;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.E, 16L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.E);
    }
}
