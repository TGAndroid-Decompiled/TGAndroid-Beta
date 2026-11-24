package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.AnimationUtils;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.telegram.messenger.Utilities;
public final class aw8 implements Consumer {
    public final gw8 a;
    public final nv8 b;
    public final rv8 c;

    public aw8(gw8 gw8Var, nv8 nv8Var, rv8 rv8Var) {
        this.a = gw8Var;
        this.b = nv8Var;
        this.c = rv8Var;
    }

    @Override
    public final void accept(Object obj) {
        int[] iArr;
        float f;
        boolean z;
        float f2;
        float f3;
        float f4;
        float max;
        RectF rectF;
        float f5;
        float f6;
        float f7;
        Paint paint;
        float f8;
        int[] iArr2;
        Paint paint2;
        int[] iArr3;
        int[] iArr4;
        boolean z2;
        float f9;
        Canvas canvas;
        float f10;
        float f11;
        float f12;
        Canvas canvas2;
        float f13;
        float f14;
        float f15;
        nv8 nv8Var;
        float max2;
        Canvas canvas3 = (Canvas) obj;
        gw8 gw8Var = this.a;
        float[] fArr = gw8Var.T;
        int[] iArr5 = gw8Var.V;
        int[] iArr6 = gw8Var.U;
        RectF rectF2 = gw8Var.S;
        RectF rectF3 = gw8Var.i0;
        Paint paint3 = gw8Var.P;
        Paint paint4 = gw8Var.K;
        int[] iArr7 = gw8Var.N;
        Paint paint5 = gw8Var.h0;
        int[] iArr8 = gw8Var.M;
        Paint paint6 = gw8Var.R;
        Matrix matrix = gw8Var.Q;
        nv8 nv8Var2 = this.b;
        if (nv8Var2.isVerticalScrollBarEnabled()) {
            nv8Var2.setVerticalScrollBarEnabled(false);
        }
        if (!gw8Var.f0) {
            iArr = iArr5;
            ew8 ew8Var = gw8Var.h;
            if (ew8Var != null) {
                gw8Var.f0 = true;
                gw8.Z(ew8Var);
            }
        } else {
            iArr = iArr5;
        }
        if (gw8Var.h != null && !Float.isNaN(gw8Var.L)) {
            vw8 vw8Var = gw8Var.d;
            if (vw8Var != null) {
                if (vw8Var.h1 < 0.5f) {
                    f = (-Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - vw8Var.d6)) / 150.0f)) - 1.0E-4f;
                } else if (!vw8Var.e6) {
                    f = 0.0f;
                } else {
                    f = Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - vw8Var.c6)) / 470.0f);
                }
            } else {
                f = 1.0f;
            }
            vw8 vw8Var2 = gw8Var.d;
            if (vw8Var2 != null && vw8Var2.h1 > 0.5f) {
                z = true;
            } else {
                z = false;
            }
            if (vw8Var2 != null) {
                f2 = Utilities.l(vw8Var2.g1);
            } else {
                f2 = 1.0f;
            }
            float f16 = 1.0f - f2;
            boolean z3 = z;
            float v = oo1.v(f16, f16, f16, 1.0f);
            if (z3) {
                f3 = gw8Var.d.V0();
            } else {
                f3 = -1.0f;
            }
            int i = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            if (i >= 0) {
                float f17 = 1.0f - f3;
                max = ((1.0f - ((f17 * f17) * f17)) * 0.25f) + 0.75f;
                f4 = f3;
            } else if (f2 >= 0.999f) {
                f4 = f3;
                max = 1.0f;
            } else {
                f4 = f3;
                max = Math.max(nv8Var2.getScaleX(), (0.25f * v) + 0.75f);
            }
            if (z3) {
                rectF = rectF2;
                f5 = 1.0f;
                f6 = Math.min(1.0f, f2 / 0.55f);
            } else {
                rectF = rectF2;
                f5 = 1.0f;
                f6 = 1.0f;
            }
            if (i >= 0 && f4 < f5) {
                f7 = f5;
                gw8Var.d.invalidate();
            } else {
                f7 = f5;
            }
            if (max < f7) {
                nv8Var2.postInvalidateOnAnimation();
            }
            if (nv8Var2.getScaleX() != max) {
                View view = nv8Var2;
                float f18 = 0.0f;
                while (true) {
                    paint = paint5;
                    if (view == null || view == gw8Var.h || !(view.getParent() instanceof View)) {
                        break;
                    }
                    f18 += view.getTop();
                    view = (View) view.getParent();
                    paint5 = paint;
                }
                if (Float.isNaN(gw8Var.L)) {
                    max2 = nv8Var2.getHeight();
                } else {
                    max2 = Math.max(0.0f, Math.min(nv8Var2.getHeight(), gw8Var.L - f18));
                }
                nv8Var2.setPivotX(nv8Var2.getWidth() / 2.0f);
                nv8Var2.setPivotY(max2);
                nv8Var2.setScaleX(max);
                nv8Var2.setScaleY(max);
            } else {
                paint = paint5;
            }
            if (nv8Var2.getAlpha() != f6) {
                nv8Var2.setAlpha(f6);
            }
            nv8Var2.getLocationOnScreen(iArr8);
            gw8Var.h.getLocationOnScreen(iArr7);
            float f19 = iArr8[1] - iArr7[1];
            if (nv8Var2.getScaleY() > 0.01f) {
                f8 = nv8Var2.getScaleY();
            } else {
                f8 = 1.0f;
            }
            float width = nv8Var2.getWidth();
            if (gw8Var.W == null) {
                LinearGradient i0 = gw8.i0(false);
                gw8Var.W = i0;
                paint4.setShader(i0);
                iArr2 = iArr7;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint4.setXfermode(new PorterDuffXfermode(mode));
                LinearGradient i02 = gw8.i0(true);
                gw8Var.O = i02;
                paint3.setShader(i02);
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            } else {
                iArr2 = iArr7;
            }
            rv8 rv8Var = this.c;
            rv8Var.getLocationOnScreen(iArr8);
            float f20 = iArr8[1] - iArr2[1];
            float f21 = (f20 - f19) / f8;
            float L = ((gl.L(12.0f) + rv8Var.getHeight()) / f8) + f21;
            sx3 sx3Var = gw8Var.y;
            if (sx3Var != null) {
                float height = (f20 + rv8Var.getHeight()) - gw8Var.d0;
                paint2 = paint3;
                if (sx3Var.L != height) {
                    sx3Var.L = height;
                    sx3Var.invalidate();
                }
            } else {
                paint2 = paint3;
            }
            rv8Var.getLocationOnScreen(gw8Var.j0);
            nv8Var2.getLocationOnScreen(gw8Var.k0);
            float scaleX = (iArr3[0] - iArr4[0]) / nv8Var2.getScaleX();
            float f22 = f8;
            rectF3.set((gw8Var.b0 / f8) + scaleX, (gw8Var.c0 / f8) + f21, ((rv8Var.getWidth() - gw8Var.b0) / f8) + scaleX, ((rv8Var.getHeight() - gw8Var.d0) / f22) + f21);
            paint6.setAlpha(255);
            canvas3.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint6);
            matrix.setScale(1.0f, L - f21);
            matrix.postTranslate(0.0f, f21);
            gw8Var.O.setLocalMatrix(matrix);
            Canvas canvas4 = canvas3;
            canvas4.drawRect(0.0f, Math.min(f21, (-f19) / f22), width, L, paint2);
            float L2 = gl.L(10.0f);
            float f23 = ((gw8Var.L - f19) - L2) / f22;
            float f24 = L2 / f22;
            matrix.setScale(1.0f, f24);
            matrix.postTranslate(0.0f, f23);
            gw8Var.W.setLocalMatrix(matrix);
            canvas4.drawRect(0.0f, f23, width, Math.max(f24 + f23, gl.L(200.0f) + nv8Var2.getHeight()), paint4);
            if (f < 1.0f && !z3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3) {
                f9 = f2;
            } else {
                f9 = f;
            }
            vw8 vw8Var3 = gw8Var.d;
            float f25 = 90.0f;
            if (vw8Var3 != null) {
                gw8Var.e0 = gw8Var.r - (vw8Var3.H0() - gl.L(8.0f));
                float translationY = rv8Var.getTranslationY();
                float f26 = gw8Var.e0;
                if (translationY != f26) {
                    rv8Var.setTranslationY(f26);
                    rv8Var.invalidate();
                }
                if (f9 < 1.0f) {
                    if (f9 >= 0.0f) {
                        float max3 = Math.max(0.0f, Math.min(1.0f, f9));
                        float f27 = 1.0f - max3;
                        f14 = Math.min(1.0f, max3 / 0.35f);
                        f15 = ((1.0f - ((f27 * f27) * f27)) * 0.15f) + 0.85f;
                    } else {
                        float max4 = Math.max(0.0f, Math.min(1.0f, ((-f9) * 150.0f) / 90.0f));
                        f15 = oo1.v(max4, 0.15f, max4, 1.0f);
                        f14 = 1.0f - max4;
                    }
                } else {
                    f14 = 1.0f;
                    f15 = 1.0f;
                }
                if (rv8Var.getScaleX() != f15) {
                    rv8Var.setPivotX(rv8Var.getWidth() / 2.0f);
                    rv8Var.setPivotY(rv8Var.getHeight() / 2.0f);
                    rv8Var.setScaleX(f15);
                    rv8Var.setScaleY(f15);
                    rv8Var.invalidate();
                }
                if (rv8Var.getAlpha() != f14) {
                    rv8Var.setAlpha(f14);
                }
                if ((f15 != 1.0f || f14 != 1.0f) && (nv8Var = gw8Var.a0) != null) {
                    nv8Var.postInvalidateOnAnimation();
                }
            }
            float max5 = Math.max(0.0f, -f19);
            float f28 = gw8Var.L - f19;
            int i2 = 0;
            float f29 = 0.0f;
            while (true) {
                float f30 = f25;
                if (i2 >= nv8Var2.getChildCount()) {
                    break;
                }
                View childAt = nv8Var2.getChildAt(i2);
                if (!(childAt instanceof mv8)) {
                    canvas2 = canvas4;
                } else {
                    mv8 mv8Var = (mv8) childAt;
                    if (f29 == 0.0f) {
                        f29 = childAt.getHeight();
                    }
                    if (z2 && f29 > 0.0f) {
                        float f31 = oo1.f(f28, max5, f29, 1.0f);
                        float height2 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                        if (f >= 0.0f) {
                            canvas2 = canvas4;
                            f13 = (vw8.S(Math.max(0.0f, Math.min(1.0f, ((f * 470.0f) - (Math.max(0.0f, ((f28 - height2) / f29) - 0.5f) * Math.min(45.0f, 250.0f / f31))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                        } else {
                            canvas2 = canvas4;
                            float max6 = Math.max(0.0f, Math.min(1.0f, (((-f) * 150.0f) - (Math.max(0.0f, ((height2 - max5) / f29) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, f31 - 1.0f)))) / f30));
                            f13 = oo1.v(max6, 0.4f, max6, 1.0f);
                        }
                    } else {
                        canvas2 = canvas4;
                        f13 = 1.0f;
                    }
                    if (mv8Var.r != f13) {
                        mv8Var.r = f13;
                        mv8Var.invalidate();
                    }
                }
                i2++;
                f25 = f30;
                canvas4 = canvas2;
            }
            Canvas canvas5 = canvas4;
            if (z2 && f29 > 0.0f) {
                float f32 = oo1.f(f28, max5, f29, 1.0f);
                if (gw8Var.g0 == null) {
                    gw8Var.g0 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
                }
                if (f >= 0.0f) {
                    f10 = 1.0f;
                    matrix.setScale(1.0f, f29);
                    matrix.postTranslate(0.0f, (f28 - (Math.max(-1.0f, ((f * 470.0f) - 38.5f) / Math.min(45.0f, 250.0f / f32)) * f29)) - (f29 / 2.0f));
                } else {
                    f10 = 1.0f;
                    matrix.setScale(1.0f, f29);
                    matrix.postTranslate(0.0f, ((Math.max(-1.0f, (((-f) * 150.0f) - 76.5f) / Math.min(25.0f, 60.0f / Math.max(1.0f, f32 - 1.0f))) * f29) + max5) - (f29 / 2.0f));
                }
                gw8Var.g0.setLocalMatrix(matrix);
                Paint paint7 = paint;
                paint7.setShader(gw8Var.g0);
                if (paint7.getXfermode() == null) {
                    paint7.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                canvas = canvas5;
                canvas.drawRect(0.0f, 0.0f, width, nv8Var2.getHeight(), paint7);
                nv8Var2.invalidate();
            } else {
                canvas = canvas5;
                f10 = 1.0f;
            }
            sx3 sx3Var2 = gw8Var.y;
            if (sx3Var2 != null) {
                RectF rectF4 = sx3Var2.G;
                if (sx3Var2.y > 0.003f && !rectF4.isEmpty()) {
                    RectF rectF5 = rectF;
                    rectF5.set(rectF4);
                    fArr[0] = rectF4.height() / 2.0f;
                    fArr[1] = sx3Var2.E;
                    gw8Var.y.getLocationOnScreen(iArr6);
                    int[] iArr9 = iArr;
                    nv8Var2.getLocationOnScreen(iArr9);
                    if (nv8Var2.getScaleX() > 0.01f) {
                        f11 = nv8Var2.getScaleX();
                    } else {
                        f11 = f10;
                    }
                    if (nv8Var2.getScaleY() > 0.01f) {
                        f12 = nv8Var2.getScaleY();
                    } else {
                        f12 = f10;
                    }
                    float f33 = iArr6[0] - iArr9[0];
                    float f34 = iArr6[1] - iArr9[1];
                    rectF5.set((rectF5.left + f33) / f11, (rectF5.top + f34) / f12, (rectF5.right + f33) / f11, (rectF5.bottom + f34) / f12);
                    fArr[0] = fArr[0] / f12;
                    paint6.setAlpha((int) (fArr[1] * 255.0f));
                    float f35 = fArr[0];
                    canvas.drawRoundRect(rectF5, f35, f35, paint6);
                }
            }
        }
    }

    public final Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
