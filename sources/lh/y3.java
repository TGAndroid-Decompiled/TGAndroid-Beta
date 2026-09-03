package lh;

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
public final class y3 extends FrameLayout {
    public float B;
    public int C;
    public ValueAnimator D;
    public x3 E;
    public final b F;
    public final View[] f13366a;
    public final Matrix f13367b;
    public final float[] f13368c;
    public float d;
    public float e;
    public boolean f13369f;
    public final float[][] h;
    public final float[] f13370n;
    public final float[] f13371r;
    public final Integer[] f13372s;
    public final HashSet v;
    public final HashMap f13373w;
    public final HashMap f13374x;
    public final float[] f13375y;

    public y3(Context context, View[] viewArr) {
        super(context);
        this.f13367b = new Matrix();
        float[] fArr = new float[16];
        this.f13368c = fArr;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f13369f = true;
        this.h = new float[][]{new float[]{-1.0f, 0.0f, 0.0f, 0.0f}, new float[]{1.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 1.0f, 0.0f, 0.0f}, new float[]{0.0f, -1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, -1.0f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f, 0.0f}};
        this.f13370n = new float[4];
        this.f13371r = new float[6];
        this.f13372s = new Integer[]{0, 1, 2, 3, 4, 5};
        this.v = new HashSet();
        this.f13373w = new HashMap();
        this.f13374x = new HashMap();
        this.f13375y = new float[6];
        this.C = -1;
        this.F = new b(this, 8);
        setClipToOutline(false);
        setClipToPadding(false);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        this.f13366a = viewArr;
        for (View view : viewArr) {
            addView(view, k7.b6.e(108, 108, 17));
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
        fArr[10] = e2.c.u(f13, 0.0f, 0.0f, cos);
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
        if (Math.abs(this.d) > 1.0E-4f || Math.abs(this.e) > 1.0E-4f) {
            float[] fArr = new float[16];
            b(1.0f, 0.0f, this.d, fArr);
            float[] fArr2 = this.f13368c;
            d(fArr, fArr2, fArr2);
            b(0.0f, 1.0f, this.e, fArr);
            d(fArr, fArr2, fArr2);
            if (this.f13369f) {
                this.d *= 0.96f;
                this.e *= 0.96f;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        RectF rectF;
        boolean z4;
        boolean z10;
        float f10;
        char c3;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        float f15;
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 6) {
            if (this.C == indexOfChild) {
                z4 = true;
            } else {
                z4 = false;
            }
            rectF = (RectF) this.f13374x.get(Integer.valueOf(indexOfChild));
            Integer num = (Integer) this.f13373w.get(Integer.valueOf(indexOfChild));
            if (num != null) {
                indexOfChild = num.intValue();
            }
            if (view instanceof d4) {
                d4 d4Var = (d4) view;
                if (z4) {
                    f15 = this.B;
                } else {
                    f15 = 1.0f;
                }
                float f16 = 1.0f - f15;
                d4Var.d.setAlpha(f16);
                d4Var.e.setAlpha(f16);
                if (!z4 || this.B >= 1.0f) {
                    this.f13366a[indexOfChild].setVisibility(8);
                }
            }
            z10 = true;
        } else {
            rectF = null;
            z4 = false;
            z10 = false;
        }
        float[][] fArr = this.h;
        android.opengl.Matrix.multiplyMV(this.f13370n, 0, this.f13368c, 0, fArr[indexOfChild], 0);
        float f17 = this.f13370n[2];
        if (f17 < 0.001f) {
            return false;
        }
        view.setAlpha(Math.min(1.0f, f17 / 0.3f));
        float width = view.getWidth() / 2.0f;
        if (z10 && (view instanceof d4)) {
            float dp = AndroidUtilities.dp(-6.0f);
            f10 = 1.0f;
            if (z4) {
                f14 = this.B;
            } else {
                f14 = 1.0f;
            }
            c3 = 6;
            f11 = (f14 * AndroidUtilities.dp(2.0f)) + dp;
        } else {
            f10 = 1.0f;
            c3 = 6;
            f11 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(108.0f) / 2.0f;
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
                            i10 = 3;
                            if (indexOfChild == 5) {
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
                    } else {
                        i10 = 3;
                        fArr3[0] = f10;
                        fArr3[1] = 0.0f;
                        fArr3[2] = 0.0f;
                        fArr4[0] = 0.0f;
                        fArr4[1] = 0.0f;
                        fArr4[2] = -1.0f;
                    }
                } else {
                    i10 = 3;
                    fArr3[0] = f10;
                    fArr3[1] = 0.0f;
                    fArr3[2] = 0.0f;
                    fArr4[0] = 0.0f;
                    fArr4[1] = 0.0f;
                    fArr4[2] = f10;
                }
            } else {
                i10 = 3;
                fArr3[0] = 0.0f;
                fArr3[1] = 0.0f;
                fArr3[2] = -1.0f;
                fArr4[0] = 0.0f;
                fArr4[1] = -1.0f;
                fArr4[2] = 0.0f;
            }
        } else {
            i10 = 3;
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = f10;
            fArr4[0] = 0.0f;
            fArr4[1] = -1.0f;
            fArr4[2] = 0.0f;
        }
        fArr3[i10] = 0.0f;
        fArr4[i10] = 0.0f;
        float f18 = this.f13375y[indexOfChild];
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
        }
        float[] fArr5 = new float[4];
        float[] fArr6 = new float[4];
        float[] fArr7 = new float[4];
        android.opengl.Matrix.multiplyMV(fArr5, 0, this.f13368c, 0, fArr2, 0);
        float[] fArr8 = fArr5;
        android.opengl.Matrix.multiplyMV(fArr6, 0, this.f13368c, 0, fArr3, 0);
        float[] fArr9 = fArr6;
        android.opengl.Matrix.multiplyMV(fArr7, 0, this.f13368c, 0, fArr4, 0);
        float f25 = 64.0f * dp2;
        int i11 = 2;
        int i12 = 1;
        float[][] fArr10 = (float[][]) Array.newInstance(Float.TYPE, 4, i10);
        int i13 = 0;
        for (int i14 = 4; i13 < i14; i14 = 4) {
            if (i13 != i12 && i13 != i11) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            if (i13 != 0 && i13 != i12) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            float[] fArr11 = fArr10[i13];
            float[] fArr12 = fArr8;
            float[] fArr13 = fArr9;
            fArr11[0] = e2.c.y(fArr7[0], f13, (fArr9[0] * f12) + fArr8[0], dp2);
            fArr11[1] = e2.c.y(fArr7[1], f13, (fArr13[1] * f12) + fArr12[1], dp2);
            fArr11[2] = e2.c.y(fArr7[2], f13, (fArr13[2] * f12) + fArr12[2], dp2);
            i13++;
            fArr9 = fArr13;
            fArr8 = fArr12;
            i12 = 1;
            i11 = 2;
        }
        char c10 = 2;
        float[] fArr14 = new float[8];
        int i15 = 0;
        while (i15 < 4) {
            float[] fArr15 = fArr10[i15];
            float f26 = f25 / (f25 - fArr15[c10]);
            int i16 = i15 * 2;
            fArr14[i16] = (fArr15[0] * f26) + width2;
            fArr14[i16 + 1] = (fArr15[1] * f26) + height;
            i15++;
            c10 = 2;
        }
        float f27 = (width2 - width) - f11;
        float f28 = (height - width) - f11;
        float f29 = width2 + width + f11;
        float f30 = height + width + f11;
        float[] fArr16 = new float[8];
        fArr16[0] = f27;
        fArr16[1] = f28;
        fArr16[2] = f29;
        fArr16[i10] = f28;
        fArr16[4] = f29;
        fArr16[5] = f30;
        fArr16[c3] = f27;
        fArr16[7] = f30;
        if (z4 && rectF != null) {
            float f31 = rectF.left;
            float f32 = rectF.top;
            float f33 = rectF.right;
            float f34 = rectF.bottom;
            float[] fArr17 = new float[8];
            fArr17[0] = f31;
            fArr17[1] = f32;
            fArr17[2] = f33;
            fArr17[i10] = f32;
            fArr17[4] = f33;
            fArr17[5] = f34;
            fArr17[c3] = f31;
            fArr17[7] = f34;
            AndroidUtilities.lerp(fArr17, fArr14, this.B, fArr14);
        }
        Matrix matrix = this.f13367b;
        matrix.reset();
        matrix.setPolyToPoly(fArr16, 0, fArr14, 0, 4);
        canvas.save();
        canvas.concat(matrix);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void f(int i10, FrameLayout frameLayout) {
        if (i10 == -1) {
            i10 = 5;
        }
        AndroidUtilities.removeFromParent(frameLayout);
        int childCount = getChildCount();
        addView(frameLayout, k7.b6.e(64, 64, 17));
        this.v.add(Integer.valueOf(i10));
        this.f13373w.put(Integer.valueOf(childCount), Integer.valueOf(i10));
    }

    @Override
    public final int getChildDrawingOrder(int i10, int i11) {
        if (i11 < 6) {
            Integer[] numArr = this.f13372s;
            if (i11 < numArr.length) {
                return numArr[i11].intValue();
            }
        }
        return i11;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.F, 16L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.F);
    }
}
