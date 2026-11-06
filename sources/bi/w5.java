package bi;

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
public final class w5 extends FrameLayout {
    public final float[] D;
    public float E;
    public int F;
    public ValueAnimator G;
    public v5 H;
    public final a3.f I;
    public final View[] f4963a;
    public final Matrix f4964b;
    public final float[] f4965c;
    public float d;
    public float f4966e;
    public boolean f4967f;
    public final float[][] h;
    public final float[] f4968n;
    public final float[] f4969r;
    public final Integer[] f4970s;
    public final HashSet f4971w;
    public final HashMap f4972x;
    public final HashMap f4973y;

    public w5(Context context, View[] viewArr) {
        super(context);
        this.f4964b = new Matrix();
        float[] fArr = new float[16];
        this.f4965c = fArr;
        this.d = 0.0f;
        this.f4966e = 0.0f;
        this.f4967f = true;
        this.h = new float[][]{new float[]{-1.0f, 0.0f, 0.0f, 0.0f}, new float[]{1.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 1.0f, 0.0f, 0.0f}, new float[]{0.0f, -1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, -1.0f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f, 0.0f}};
        this.f4968n = new float[4];
        this.f4969r = new float[6];
        this.f4970s = new Integer[]{0, 1, 2, 3, 4, 5};
        this.f4971w = new HashSet();
        this.f4972x = new HashMap();
        this.f4973y = new HashMap();
        this.D = new float[6];
        this.F = -1;
        this.I = new a3.f(this, 25);
        setClipToOutline(false);
        setClipToPadding(false);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        this.f4963a = viewArr;
        for (View view : viewArr) {
            addView(view, c8.ha.e(108, 108, 17));
        }
    }

    public static void b(float f10, float f11, float f12, float[] fArr) {
        double d = f12;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f13 = 1.0f - cos;
        float f14 = f13 * f10;
        fArr[0] = (f14 * f10) + cos;
        float f15 = f14 * f11;
        float f16 = sin * 0.0f;
        fArr[4] = f15 - f16;
        float f17 = f14 * 0.0f;
        float f18 = sin * f11;
        fArr[8] = f17 + f18;
        fArr[12] = 0.0f;
        fArr[1] = f15 + f16;
        float f19 = f13 * f11;
        fArr[5] = (f11 * f19) + cos;
        float f20 = f19 * 0.0f;
        float f21 = sin * f10;
        fArr[9] = f20 - f21;
        fArr[13] = 0.0f;
        fArr[2] = f17 - f18;
        fArr[6] = f20 + f21;
        fArr[10] = com.google.android.recaptcha.internal.a.x(f13, 0.0f, 0.0f, cos);
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
        float f13 = f12 * f12;
        float sqrt = (float) Math.sqrt(f13 + (f11 * f11) + (f10 * f10));
        if (sqrt > 0.0f) {
            fArr[0] = fArr[0] / sqrt;
            fArr[1] = fArr[1] / sqrt;
            fArr[2] = fArr[2] / sqrt;
        }
    }

    public final void a() {
        if (Math.abs(this.d) > 1.0E-4f || Math.abs(this.f4966e) > 1.0E-4f) {
            float[] fArr = new float[16];
            b(1.0f, 0.0f, this.d, fArr);
            float[] fArr2 = this.f4965c;
            d(fArr, fArr2, fArr2);
            b(0.0f, 1.0f, this.f4966e, fArr);
            d(fArr, fArr2, fArr2);
            if (this.f4967f) {
                this.d *= 0.96f;
                this.f4966e *= 0.96f;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        RectF rectF;
        boolean z9;
        boolean z10;
        float f10;
        char c10;
        float f11;
        int i7;
        int i10;
        float f12;
        float f13;
        float f14;
        int indexOfChild = indexOfChild(view);
        float f15 = 1.0f;
        if (indexOfChild >= 6) {
            if (this.F == indexOfChild) {
                z9 = true;
            } else {
                z9 = false;
            }
            rectF = (RectF) this.f4973y.get(Integer.valueOf(indexOfChild));
            Integer num = (Integer) this.f4972x.get(Integer.valueOf(indexOfChild));
            if (num != null) {
                indexOfChild = num.intValue();
            }
            if (view instanceof b6) {
                b6 b6Var = (b6) view;
                if (z9) {
                    f14 = this.E;
                } else {
                    f14 = 1.0f;
                }
                float f16 = 1.0f - f14;
                b6Var.d.setAlpha(f16);
                b6Var.f3514e.setAlpha(f16);
                if (!z9 || this.E >= 1.0f) {
                    this.f4963a[indexOfChild].setVisibility(8);
                }
            }
            z10 = true;
        } else {
            rectF = null;
            z9 = false;
            z10 = false;
        }
        float[][] fArr = this.h;
        android.opengl.Matrix.multiplyMV(this.f4968n, 0, this.f4965c, 0, fArr[indexOfChild], 0);
        float f17 = this.f4968n[2];
        if (f17 < 0.001f) {
            return false;
        }
        view.setAlpha(Math.min(1.0f, f17 / 0.3f));
        float width = view.getWidth() / 2.0f;
        if (z10 && (view instanceof b6)) {
            float L = org.telegram.messenger.g0.L(-6.0f);
            f10 = 1.0f;
            if (z9) {
                f15 = this.E;
            }
            c10 = 6;
            f11 = (f15 * org.telegram.messenger.g0.L(2.0f)) + L;
        } else {
            f10 = 1.0f;
            c10 = 6;
            f11 = 0.0f;
        }
        float L2 = org.telegram.messenger.g0.L(108.0f) / 2.0f;
        float width2 = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float[] fArr2 = new float[4];
        float[] fArr3 = new float[4];
        float[] fArr4 = new float[4];
        System.arraycopy(fArr[indexOfChild], 0, fArr2, 0, 4);
        if (indexOfChild != 0) {
            if (indexOfChild != 1) {
                if (indexOfChild != 2) {
                    if (indexOfChild != 3) {
                        if (indexOfChild != 4) {
                            i7 = 3;
                            if (indexOfChild == 5) {
                                fArr3[0] = f10;
                                fArr3[1] = 0.0f;
                                fArr3[2] = 0.0f;
                                fArr4[0] = 0.0f;
                                fArr4[1] = -1.0f;
                                fArr4[2] = 0.0f;
                            }
                        } else {
                            i7 = 3;
                            fArr3[0] = -1.0f;
                            fArr3[1] = 0.0f;
                            fArr3[2] = 0.0f;
                            fArr4[0] = 0.0f;
                            fArr4[1] = -1.0f;
                            fArr4[2] = 0.0f;
                        }
                    } else {
                        i7 = 3;
                        fArr3[0] = f10;
                        fArr3[1] = 0.0f;
                        fArr3[2] = 0.0f;
                        fArr4[0] = 0.0f;
                        fArr4[1] = 0.0f;
                        fArr4[2] = -1.0f;
                    }
                } else {
                    i7 = 3;
                    fArr3[0] = f10;
                    fArr3[1] = 0.0f;
                    fArr3[2] = 0.0f;
                    fArr4[0] = 0.0f;
                    fArr4[1] = 0.0f;
                    fArr4[2] = f10;
                }
            } else {
                i7 = 3;
                fArr3[0] = 0.0f;
                fArr3[1] = 0.0f;
                fArr3[2] = -1.0f;
                fArr4[0] = 0.0f;
                fArr4[1] = -1.0f;
                fArr4[2] = 0.0f;
            }
        } else {
            i7 = 3;
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = f10;
            fArr4[0] = 0.0f;
            fArr4[1] = -1.0f;
            fArr4[2] = 0.0f;
        }
        fArr3[i7] = 0.0f;
        fArr4[i7] = 0.0f;
        float f18 = this.D[indexOfChild];
        if (f18 != 0.0f) {
            double radians = (float) Math.toRadians(f18);
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f19 = fArr3[0];
            float f20 = fArr4[0];
            float f21 = fArr3[1];
            float f22 = fArr4[1];
            float f23 = fArr3[2];
            float f24 = fArr4[2];
            fArr3[0] = (f20 * sin) + (f19 * cos);
            fArr3[1] = (f22 * sin) + (f21 * cos);
            fArr3[2] = (f24 * sin) + (f23 * cos);
            fArr4[0] = (f20 * cos) + ((-f19) * sin);
            fArr4[1] = (f22 * cos) + ((-f21) * sin);
            fArr4[2] = (f24 * cos) + ((-f23) * sin);
            i10 = 4;
        } else {
            i10 = 4;
        }
        float[] fArr5 = new float[i10];
        float[] fArr6 = new float[i10];
        float[] fArr7 = new float[i10];
        android.opengl.Matrix.multiplyMV(fArr5, 0, this.f4965c, 0, fArr2, 0);
        float[] fArr8 = fArr5;
        android.opengl.Matrix.multiplyMV(fArr6, 0, this.f4965c, 0, fArr3, 0);
        float[] fArr9 = fArr6;
        android.opengl.Matrix.multiplyMV(fArr7, 0, this.f4965c, 0, fArr4, 0);
        float f25 = 64.0f * L2;
        int i11 = 2;
        int i12 = 1;
        float[][] fArr10 = (float[][]) Array.newInstance(Float.TYPE, 4, i7);
        int i13 = 0;
        for (int i14 = 4; i13 < i14; i14 = 4) {
            if (i13 != i12 && i13 != i11) {
                f12 = -1.0f;
            } else {
                f12 = f10;
            }
            if (i13 != 0 && i13 != i12) {
                f13 = -1.0f;
            } else {
                f13 = f10;
            }
            float[] fArr11 = fArr10[i13];
            float[] fArr12 = fArr8;
            float[] fArr13 = fArr9;
            fArr11[0] = com.google.android.recaptcha.internal.a.B(fArr7[0], f13, (fArr9[0] * f12) + fArr8[0], L2);
            fArr11[1] = com.google.android.recaptcha.internal.a.B(fArr7[1], f13, (fArr13[1] * f12) + fArr12[1], L2);
            fArr11[2] = com.google.android.recaptcha.internal.a.B(fArr7[2], f13, (fArr13[2] * f12) + fArr12[2], L2);
            i13++;
            fArr9 = fArr13;
            fArr8 = fArr12;
            i11 = 2;
            i12 = 1;
        }
        int i15 = i11;
        float[] fArr14 = new float[8];
        int i16 = 0;
        while (i16 < 4) {
            float[] fArr15 = fArr10[i16];
            float f26 = f25 / (f25 - fArr15[i15]);
            int i17 = i16 * 2;
            fArr14[i17] = (fArr15[0] * f26) + width2;
            fArr14[i17 + 1] = (fArr15[1] * f26) + height;
            i16++;
            i15 = 2;
        }
        float f27 = (width2 - width) - f11;
        float f28 = (height - width) - f11;
        float f29 = width2 + width + f11;
        float f30 = height + width + f11;
        float[] fArr16 = new float[8];
        fArr16[0] = f27;
        fArr16[1] = f28;
        fArr16[2] = f29;
        fArr16[i7] = f28;
        fArr16[4] = f29;
        fArr16[5] = f30;
        fArr16[c10] = f27;
        fArr16[7] = f30;
        if (z9 && rectF != null) {
            float f31 = rectF.left;
            float f32 = rectF.top;
            float f33 = rectF.right;
            float f34 = rectF.bottom;
            float[] fArr17 = new float[8];
            fArr17[0] = f31;
            fArr17[1] = f32;
            fArr17[2] = f33;
            fArr17[i7] = f32;
            fArr17[4] = f33;
            fArr17[5] = f34;
            fArr17[c10] = f31;
            fArr17[7] = f34;
            org.telegram.messenger.g0.a2(fArr17, fArr14, this.E, fArr14);
        }
        Matrix matrix = this.f4964b;
        matrix.reset();
        matrix.setPolyToPoly(fArr16, 0, fArr14, 0, 4);
        canvas.save();
        canvas.concat(matrix);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void f(int i7, FrameLayout frameLayout) {
        if (i7 == -1) {
            i7 = 5;
        }
        org.telegram.messenger.g0.E2(frameLayout);
        int childCount = getChildCount();
        addView(frameLayout, c8.ha.e(64, 64, 17));
        this.f4971w.add(Integer.valueOf(i7));
        this.f4972x.put(Integer.valueOf(childCount), Integer.valueOf(i7));
    }

    @Override
    public final int getChildDrawingOrder(int i7, int i10) {
        if (i10 < 6) {
            Integer[] numArr = this.f4970s;
            if (i10 < numArr.length) {
                return numArr[i10].intValue();
            }
        }
        return i10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.i3(this.I, 16L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.I);
    }
}
