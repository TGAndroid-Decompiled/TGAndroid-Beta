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
public final class lz8 implements Consumer {
    public final rz8 a;
    public final yy8 b;
    public final cz8 c;

    public lz8(rz8 rz8Var, yy8 yy8Var, cz8 cz8Var) {
        this.a = rz8Var;
        this.b = yy8Var;
        this.c = cz8Var;
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
        yy8 yy8Var;
        float max2;
        Canvas canvas3 = (Canvas) obj;
        rz8 rz8Var = this.a;
        float[] fArr = rz8Var.T;
        int[] iArr5 = rz8Var.V;
        int[] iArr6 = rz8Var.U;
        RectF rectF2 = rz8Var.S;
        RectF rectF3 = rz8Var.i0;
        Paint paint3 = rz8Var.P;
        Paint paint4 = rz8Var.K;
        int[] iArr7 = rz8Var.N;
        Paint paint5 = rz8Var.h0;
        int[] iArr8 = rz8Var.M;
        Paint paint6 = rz8Var.R;
        Matrix matrix = rz8Var.Q;
        yy8 yy8Var2 = this.b;
        if (yy8Var2.isVerticalScrollBarEnabled()) {
            yy8Var2.setVerticalScrollBarEnabled(false);
        }
        if (!rz8Var.f0) {
            iArr = iArr5;
            pz8 pz8Var = rz8Var.h;
            if (pz8Var != null) {
                rz8Var.f0 = true;
                rz8.Z(pz8Var);
            }
        } else {
            iArr = iArr5;
        }
        if (rz8Var.h != null && !Float.isNaN(rz8Var.L)) {
            f09 f09Var = rz8Var.d;
            if (f09Var != null) {
                if (f09Var.h1 < 0.5f) {
                    f = (-Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - f09Var.d6)) / 150.0f)) - 1.0E-4f;
                } else if (!f09Var.e6) {
                    f = 0.0f;
                } else {
                    f = Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - f09Var.c6)) / 470.0f);
                }
            } else {
                f = 1.0f;
            }
            f09 f09Var2 = rz8Var.d;
            if (f09Var2 != null && f09Var2.h1 > 0.5f) {
                z = true;
            } else {
                z = false;
            }
            if (f09Var2 != null) {
                f2 = Utilities.l(f09Var2.g1);
            } else {
                f2 = 1.0f;
            }
            float f16 = 1.0f - f2;
            boolean z3 = z;
            float v = bp1.v(f16, f16, f16, 1.0f);
            if (z3) {
                f3 = rz8Var.d.V0();
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
                max = Math.max(yy8Var2.getScaleX(), (0.25f * v) + 0.75f);
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
                rz8Var.d.invalidate();
            } else {
                f7 = f5;
            }
            if (max < f7) {
                yy8Var2.postInvalidateOnAnimation();
            }
            if (yy8Var2.getScaleX() != max) {
                View view = yy8Var2;
                float f18 = 0.0f;
                while (true) {
                    paint = paint5;
                    if (view == null || view == rz8Var.h || !(view.getParent() instanceof View)) {
                        break;
                    }
                    f18 += view.getTop();
                    view = (View) view.getParent();
                    paint5 = paint;
                }
                if (Float.isNaN(rz8Var.L)) {
                    max2 = yy8Var2.getHeight();
                } else {
                    max2 = Math.max(0.0f, Math.min(yy8Var2.getHeight(), rz8Var.L - f18));
                }
                yy8Var2.setPivotX(yy8Var2.getWidth() / 2.0f);
                yy8Var2.setPivotY(max2);
                yy8Var2.setScaleX(max);
                yy8Var2.setScaleY(max);
            } else {
                paint = paint5;
            }
            if (yy8Var2.getAlpha() != f6) {
                yy8Var2.setAlpha(f6);
            }
            yy8Var2.getLocationOnScreen(iArr8);
            rz8Var.h.getLocationOnScreen(iArr7);
            float f19 = iArr8[1] - iArr7[1];
            if (yy8Var2.getScaleY() > 0.01f) {
                f8 = yy8Var2.getScaleY();
            } else {
                f8 = 1.0f;
            }
            float width = yy8Var2.getWidth();
            if (rz8Var.W == null) {
                LinearGradient i0 = rz8.i0(false);
                rz8Var.W = i0;
                paint4.setShader(i0);
                iArr2 = iArr7;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint4.setXfermode(new PorterDuffXfermode(mode));
                LinearGradient i02 = rz8.i0(true);
                rz8Var.O = i02;
                paint3.setShader(i02);
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            } else {
                iArr2 = iArr7;
            }
            cz8 cz8Var = this.c;
            cz8Var.getLocationOnScreen(iArr8);
            float f20 = iArr8[1] - iArr2[1];
            float f21 = (f20 - f19) / f8;
            float L = ((hl.L(12.0f) + cz8Var.getHeight()) / f8) + f21;
            ny3 ny3Var = rz8Var.y;
            if (ny3Var != null) {
                float height = (f20 + cz8Var.getHeight()) - rz8Var.d0;
                paint2 = paint3;
                if (ny3Var.L != height) {
                    ny3Var.L = height;
                    ny3Var.invalidate();
                }
            } else {
                paint2 = paint3;
            }
            cz8Var.getLocationOnScreen(rz8Var.j0);
            yy8Var2.getLocationOnScreen(rz8Var.k0);
            float scaleX = (iArr3[0] - iArr4[0]) / yy8Var2.getScaleX();
            float f22 = f8;
            rectF3.set((rz8Var.b0 / f8) + scaleX, (rz8Var.c0 / f8) + f21, ((cz8Var.getWidth() - rz8Var.b0) / f8) + scaleX, ((cz8Var.getHeight() - rz8Var.d0) / f22) + f21);
            paint6.setAlpha(255);
            canvas3.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint6);
            matrix.setScale(1.0f, L - f21);
            matrix.postTranslate(0.0f, f21);
            rz8Var.O.setLocalMatrix(matrix);
            Canvas canvas4 = canvas3;
            canvas4.drawRect(0.0f, Math.min(f21, (-f19) / f22), width, L, paint2);
            float L2 = hl.L(10.0f);
            float f23 = ((rz8Var.L - f19) - L2) / f22;
            float f24 = L2 / f22;
            matrix.setScale(1.0f, f24);
            matrix.postTranslate(0.0f, f23);
            rz8Var.W.setLocalMatrix(matrix);
            canvas4.drawRect(0.0f, f23, width, Math.max(f24 + f23, hl.L(200.0f) + yy8Var2.getHeight()), paint4);
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
            f09 f09Var3 = rz8Var.d;
            float f25 = 90.0f;
            if (f09Var3 != null) {
                rz8Var.e0 = rz8Var.r - (f09Var3.H0() - hl.L(8.0f));
                float translationY = cz8Var.getTranslationY();
                float f26 = rz8Var.e0;
                if (translationY != f26) {
                    cz8Var.setTranslationY(f26);
                    cz8Var.invalidate();
                }
                if (f9 < 1.0f) {
                    if (f9 >= 0.0f) {
                        float max3 = Math.max(0.0f, Math.min(1.0f, f9));
                        float f27 = 1.0f - max3;
                        f14 = Math.min(1.0f, max3 / 0.35f);
                        f15 = ((1.0f - ((f27 * f27) * f27)) * 0.15f) + 0.85f;
                    } else {
                        float max4 = Math.max(0.0f, Math.min(1.0f, ((-f9) * 150.0f) / 90.0f));
                        f15 = bp1.v(max4, 0.15f, max4, 1.0f);
                        f14 = 1.0f - max4;
                    }
                } else {
                    f14 = 1.0f;
                    f15 = 1.0f;
                }
                if (cz8Var.getScaleX() != f15) {
                    cz8Var.setPivotX(cz8Var.getWidth() / 2.0f);
                    cz8Var.setPivotY(cz8Var.getHeight() / 2.0f);
                    cz8Var.setScaleX(f15);
                    cz8Var.setScaleY(f15);
                    cz8Var.invalidate();
                }
                if (cz8Var.getAlpha() != f14) {
                    cz8Var.setAlpha(f14);
                }
                if ((f15 != 1.0f || f14 != 1.0f) && (yy8Var = rz8Var.a0) != null) {
                    yy8Var.postInvalidateOnAnimation();
                }
            }
            float max5 = Math.max(0.0f, -f19);
            float f28 = rz8Var.L - f19;
            int i2 = 0;
            float f29 = 0.0f;
            while (true) {
                float f30 = f25;
                if (i2 >= yy8Var2.getChildCount()) {
                    break;
                }
                View childAt = yy8Var2.getChildAt(i2);
                if (!(childAt instanceof xy8)) {
                    canvas2 = canvas4;
                } else {
                    xy8 xy8Var = (xy8) childAt;
                    if (f29 == 0.0f) {
                        f29 = childAt.getHeight();
                    }
                    if (z2 && f29 > 0.0f) {
                        float f31 = bp1.f(f28, max5, f29, 1.0f);
                        float height2 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                        if (f >= 0.0f) {
                            canvas2 = canvas4;
                            f13 = (f09.S(Math.max(0.0f, Math.min(1.0f, ((f * 470.0f) - (Math.max(0.0f, ((f28 - height2) / f29) - 0.5f) * Math.min(45.0f, 250.0f / f31))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                        } else {
                            canvas2 = canvas4;
                            float max6 = Math.max(0.0f, Math.min(1.0f, (((-f) * 150.0f) - (Math.max(0.0f, ((height2 - max5) / f29) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, f31 - 1.0f)))) / f30));
                            f13 = bp1.v(max6, 0.4f, max6, 1.0f);
                        }
                    } else {
                        canvas2 = canvas4;
                        f13 = 1.0f;
                    }
                    if (xy8Var.r != f13) {
                        xy8Var.r = f13;
                        xy8Var.invalidate();
                    }
                }
                i2++;
                f25 = f30;
                canvas4 = canvas2;
            }
            Canvas canvas5 = canvas4;
            if (z2 && f29 > 0.0f) {
                float f32 = bp1.f(f28, max5, f29, 1.0f);
                if (rz8Var.g0 == null) {
                    rz8Var.g0 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
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
                rz8Var.g0.setLocalMatrix(matrix);
                Paint paint7 = paint;
                paint7.setShader(rz8Var.g0);
                if (paint7.getXfermode() == null) {
                    paint7.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                canvas = canvas5;
                canvas.drawRect(0.0f, 0.0f, width, yy8Var2.getHeight(), paint7);
                yy8Var2.invalidate();
            } else {
                canvas = canvas5;
                f10 = 1.0f;
            }
            ny3 ny3Var2 = rz8Var.y;
            if (ny3Var2 != null) {
                RectF rectF4 = ny3Var2.G;
                if (ny3Var2.y > 0.003f && !rectF4.isEmpty()) {
                    RectF rectF5 = rectF;
                    rectF5.set(rectF4);
                    fArr[0] = rectF4.height() / 2.0f;
                    fArr[1] = ny3Var2.E;
                    rz8Var.y.getLocationOnScreen(iArr6);
                    int[] iArr9 = iArr;
                    yy8Var2.getLocationOnScreen(iArr9);
                    if (yy8Var2.getScaleX() > 0.01f) {
                        f11 = yy8Var2.getScaleX();
                    } else {
                        f11 = f10;
                    }
                    if (yy8Var2.getScaleY() > 0.01f) {
                        f12 = yy8Var2.getScaleY();
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
