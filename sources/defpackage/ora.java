package defpackage;

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
public final class ora extends FrameLayout {
    public static final int K = 0;
    public final float[] E;
    public float F;
    public int G;
    public ValueAnimator H;
    public nra I;
    public final c0a J;
    public final View[] a;
    public final Matrix b;
    public final float[] c;
    public float d;
    public float e;
    public boolean f;
    public final float[][] h;
    public final float[] n;
    public final float[] r;
    public final Integer[] s;
    public final HashSet w;
    public final HashMap x;
    public final HashMap y;

    public ora(Context context, View[] viewArr) {
        super(context);
        this.b = new Matrix();
        float[] fArr = new float[16];
        this.c = fArr;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = true;
        this.h = new float[][]{new float[]{-1.0f, 0.0f, 0.0f, 0.0f}, new float[]{1.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 1.0f, 0.0f, 0.0f}, new float[]{0.0f, -1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, -1.0f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f, 0.0f}};
        this.n = new float[4];
        this.r = new float[6];
        this.s = new Integer[]{0, 1, 2, 3, 4, 5};
        this.w = new HashSet();
        this.x = new HashMap();
        this.y = new HashMap();
        this.E = new float[6];
        this.G = -1;
        this.J = new c0a(this, (byte) 27);
        setClipToOutline(false);
        setClipToPadding(false);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        this.a = viewArr;
        for (View view : viewArr) {
            addView(view, qoe.e(108, 108, 17));
        }
    }

    public static void b(float f, float f2, float f3, float[] fArr) {
        double d = f3;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f4 = 1.0f - cos;
        float f5 = f4 * f;
        fArr[0] = (f5 * f) + cos;
        float f6 = f5 * f2;
        float f7 = sin * 0.0f;
        fArr[4] = f6 - f7;
        float f8 = f5 * 0.0f;
        float f9 = sin * f2;
        fArr[8] = f8 + f9;
        fArr[12] = 0.0f;
        fArr[1] = f6 + f7;
        float f10 = f4 * f2;
        fArr[5] = (f2 * f10) + cos;
        float f11 = f10 * 0.0f;
        float f12 = sin * f;
        fArr[9] = f11 - f12;
        fArr[13] = 0.0f;
        fArr[2] = f8 - f9;
        fArr[6] = f11 + f12;
        fArr[10] = b10.w(f4, 0.0f, 0.0f, cos);
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static void c(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr[1];
        float f2 = fArr2[2];
        float f3 = fArr[2];
        fArr3[0] = (f * f2) - (fArr2[1] * f3);
        float f4 = fArr2[0];
        float f5 = fArr[0];
        fArr3[1] = (f3 * f4) - (f2 * f5);
        fArr3[2] = (f5 * fArr2[1]) - (fArr[1] * f4);
    }

    public static void d(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArr4 = new float[16];
        android.opengl.Matrix.multiplyMM(fArr4, 0, fArr, 0, fArr2, 0);
        System.arraycopy(fArr4, 0, fArr3, 0, 16);
    }

    public static void e(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = f3 * f3;
        float sqrt = (float) Math.sqrt(f4 + (f2 * f2) + (f * f));
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
            float[] fArr2 = this.c;
            d(fArr, fArr2, fArr2);
            b(0.0f, 1.0f, this.e, fArr);
            d(fArr, fArr2, fArr2);
            if (this.f) {
                this.d *= 0.96f;
                this.e *= 0.96f;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        RectF rectF;
        boolean z;
        boolean z2;
        float f;
        char c;
        float f2;
        int i;
        int i2;
        float f3;
        float f4;
        float f5;
        int indexOfChild = indexOfChild(view);
        float f6 = 1.0f;
        if (indexOfChild >= 6) {
            if (this.G == indexOfChild) {
                z = true;
            } else {
                z = false;
            }
            rectF = (RectF) this.y.get(Integer.valueOf(indexOfChild));
            Integer num = (Integer) this.x.get(Integer.valueOf(indexOfChild));
            if (num != null) {
                indexOfChild = num.intValue();
            }
            if (view instanceof sra) {
                sra sraVar = (sra) view;
                if (z) {
                    f5 = this.F;
                } else {
                    f5 = 1.0f;
                }
                float f7 = 1.0f - f5;
                sraVar.d.setAlpha(f7);
                sraVar.e.setAlpha(f7);
                if (!z || this.F >= 1.0f) {
                    this.a[indexOfChild].setVisibility(8);
                }
            }
            z2 = true;
        } else {
            rectF = null;
            z = false;
            z2 = false;
        }
        float[][] fArr = this.h;
        android.opengl.Matrix.multiplyMV(this.n, 0, this.c, 0, fArr[indexOfChild], 0);
        float f8 = this.n[2];
        if (f8 < 0.001f) {
            return false;
        }
        view.setAlpha(Math.min(1.0f, f8 / 0.3f));
        float width = view.getWidth() / 2.0f;
        if (z2 && (view instanceof sra)) {
            float L = gm.L(-6.0f);
            f = 1.0f;
            if (z) {
                f6 = this.F;
            }
            c = 6;
            f2 = (f6 * gm.L(2.0f)) + L;
        } else {
            f = 1.0f;
            c = 6;
            f2 = 0.0f;
        }
        float L2 = gm.L(108.0f) / 2.0f;
        float width2 = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float[] fArr2 = new float[4];
        float[] fArr3 = new float[4];
        float[] fArr4 = new float[4];
        System.arraycopy(fArr[indexOfChild], 0, fArr2, 0, 4);
        if (indexOfChild != 0) {
            if (indexOfChild != 1) {
                i = 3;
                if (indexOfChild != 2) {
                    if (indexOfChild != 3) {
                        if (indexOfChild != 4) {
                            if (indexOfChild == 5) {
                                fArr3[0] = f;
                                fArr3[1] = 0.0f;
                                fArr3[2] = 0.0f;
                                fArr4[0] = 0.0f;
                                fArr4[1] = -1.0f;
                                fArr4[2] = 0.0f;
                            }
                        } else {
                            fArr3[0] = -1.0f;
                            fArr3[1] = 0.0f;
                            fArr3[2] = 0.0f;
                            fArr4[0] = 0.0f;
                            fArr4[1] = -1.0f;
                            fArr4[2] = 0.0f;
                        }
                    } else {
                        fArr3[0] = f;
                        fArr3[1] = 0.0f;
                        fArr3[2] = 0.0f;
                        fArr4[0] = 0.0f;
                        fArr4[1] = 0.0f;
                        fArr4[2] = -1.0f;
                    }
                } else {
                    fArr3[0] = f;
                    fArr3[1] = 0.0f;
                    fArr3[2] = 0.0f;
                    fArr4[0] = 0.0f;
                    fArr4[1] = 0.0f;
                    fArr4[2] = f;
                }
            } else {
                i = 3;
                fArr3[0] = 0.0f;
                fArr3[1] = 0.0f;
                fArr3[2] = -1.0f;
                fArr4[0] = 0.0f;
                fArr4[1] = -1.0f;
                fArr4[2] = 0.0f;
            }
        } else {
            i = 3;
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = f;
            fArr4[0] = 0.0f;
            fArr4[1] = -1.0f;
            fArr4[2] = 0.0f;
        }
        fArr3[i] = 0.0f;
        fArr4[i] = 0.0f;
        float f9 = this.E[indexOfChild];
        if (f9 != 0.0f) {
            double radians = (float) Math.toRadians(f9);
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f10 = fArr3[0];
            float f11 = fArr4[0];
            float f12 = fArr3[1];
            float f13 = fArr4[1];
            float f14 = fArr3[2];
            float f15 = fArr4[2];
            fArr3[0] = (f11 * sin) + (f10 * cos);
            fArr3[1] = (f13 * sin) + (f12 * cos);
            fArr3[2] = (f15 * sin) + (f14 * cos);
            fArr4[0] = (f11 * cos) + ((-f10) * sin);
            fArr4[1] = (f13 * cos) + ((-f12) * sin);
            fArr4[2] = (f15 * cos) + ((-f14) * sin);
            i2 = 4;
        } else {
            i2 = 4;
        }
        float[] fArr5 = new float[i2];
        float[] fArr6 = new float[i2];
        float[] fArr7 = new float[i2];
        android.opengl.Matrix.multiplyMV(fArr5, 0, this.c, 0, fArr2, 0);
        float[] fArr8 = fArr5;
        android.opengl.Matrix.multiplyMV(fArr6, 0, this.c, 0, fArr3, 0);
        float[] fArr9 = fArr6;
        android.opengl.Matrix.multiplyMV(fArr7, 0, this.c, 0, fArr4, 0);
        float f16 = 64.0f * L2;
        int i3 = 2;
        int i4 = 1;
        float[][] fArr10 = (float[][]) Array.newInstance(Float.TYPE, 4, i);
        int i5 = 0;
        for (int i6 = 4; i5 < i6; i6 = 4) {
            if (i5 != i4 && i5 != i3) {
                f3 = -1.0f;
            } else {
                f3 = f;
            }
            if (i5 != 0 && i5 != i4) {
                f4 = -1.0f;
            } else {
                f4 = f;
            }
            float[] fArr11 = fArr10[i5];
            float[] fArr12 = fArr8;
            float[] fArr13 = fArr9;
            fArr11[0] = mlb.A(fArr7[0], f4, (fArr9[0] * f3) + fArr8[0], L2);
            fArr11[1] = mlb.A(fArr7[1], f4, (fArr13[1] * f3) + fArr12[1], L2);
            fArr11[2] = mlb.A(fArr7[2], f4, (fArr13[2] * f3) + fArr12[2], L2);
            i5++;
            fArr9 = fArr13;
            fArr8 = fArr12;
            i3 = 2;
            i4 = 1;
        }
        int i7 = i3;
        float[] fArr14 = new float[8];
        int i8 = 0;
        while (i8 < 4) {
            float[] fArr15 = fArr10[i8];
            float f17 = f16 / (f16 - fArr15[i7]);
            int i9 = i8 << 1;
            fArr14[i9] = (fArr15[0] * f17) + width2;
            fArr14[i9 + 1] = (fArr15[1] * f17) + height;
            i8++;
            i7 = 2;
        }
        float f18 = (width2 - width) - f2;
        float f19 = (height - width) - f2;
        float f20 = width2 + width + f2;
        float f21 = height + width + f2;
        float[] fArr16 = new float[8];
        fArr16[0] = f18;
        fArr16[1] = f19;
        fArr16[2] = f20;
        fArr16[i] = f19;
        fArr16[4] = f20;
        fArr16[5] = f21;
        fArr16[c] = f18;
        fArr16[7] = f21;
        if (z && rectF != null) {
            float f22 = rectF.left;
            float f23 = rectF.top;
            float f24 = rectF.right;
            float f25 = rectF.bottom;
            float[] fArr17 = new float[8];
            fArr17[0] = f22;
            fArr17[1] = f23;
            fArr17[2] = f24;
            fArr17[i] = f23;
            fArr17[4] = f24;
            fArr17[5] = f25;
            fArr17[c] = f22;
            fArr17[7] = f25;
            gm.Y1(fArr17, fArr14, this.F, fArr14);
        }
        Matrix matrix = this.b;
        matrix.reset();
        matrix.setPolyToPoly(fArr16, 0, fArr14, 0, 4);
        canvas.save();
        canvas.concat(matrix);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void f(int i, FrameLayout frameLayout) {
        if (i == -1) {
            i = 5;
        }
        gm.B2(frameLayout);
        int childCount = getChildCount();
        addView(frameLayout, qoe.e(64, 64, 17));
        this.w.add(Integer.valueOf(i));
        this.x.put(Integer.valueOf(childCount), Integer.valueOf(i));
    }

    @Override
    public final int getChildDrawingOrder(int i, int i2) {
        if (i2 < 6) {
            Integer[] numArr = this.s;
            if (i2 < numArr.length) {
                return numArr[i2].intValue();
            }
        }
        return i2;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm.d3(this.J, 16L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.r(this.J);
    }
}
