package ai;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.d3;
public final class q0 implements Consumer {
    public final z0 f1634a;
    public final r f1635b;
    public final x f1636c;

    public q0(z0 z0Var, r rVar, x xVar) {
        this.f1634a = z0Var;
        this.f1635b = rVar;
        this.f1636c = xVar;
    }

    @Override
    public final void accept(Object obj) {
        int[] iArr;
        int[] iArr2;
        float f7;
        float f10;
        boolean z10;
        float f11;
        float f12;
        float f13;
        float max;
        RectF rectF;
        float f14;
        float f15;
        float f16;
        Paint paint;
        float f17;
        int[] iArr3;
        Paint paint2;
        int[] iArr4;
        int[] iArr5;
        boolean z11;
        float f18;
        Canvas canvas;
        float f19;
        float f20;
        Canvas canvas2;
        float f21;
        float f22;
        float f23;
        r rVar;
        float max2;
        Canvas canvas3 = (Canvas) obj;
        z0 z0Var = this.f1634a;
        int[] iArr6 = z0Var.U;
        int[] iArr7 = z0Var.T;
        float[] fArr = z0Var.S;
        RectF rectF2 = z0Var.R;
        RectF rectF3 = z0Var.f1997h0;
        Paint paint3 = z0Var.O;
        Paint paint4 = z0Var.J;
        int[] iArr8 = z0Var.M;
        Paint paint5 = z0Var.f1996g0;
        int[] iArr9 = z0Var.L;
        Paint paint6 = z0Var.Q;
        Matrix matrix = z0Var.P;
        r rVar2 = this.f1635b;
        if (rVar2.isVerticalScrollBarEnabled()) {
            rVar2.setVerticalScrollBarEnabled(false);
        }
        if (!z0Var.f1993e0) {
            iArr = iArr6;
            x0 x0Var = z0Var.h;
            if (x0Var != null) {
                z0Var.f1993e0 = true;
                z0.Y(x0Var);
            }
        } else {
            iArr = iArr6;
        }
        if (z0Var.h != null && !Float.isNaN(z0Var.K)) {
            t1 t1Var = z0Var.d;
            if (t1Var != null) {
                f7 = 1.0f;
                if (t1Var.f1743g1 < 0.5f) {
                    iArr2 = iArr7;
                    f10 = (-Utilities.clamp01(((float) (AnimationUtils.currentAnimationTimeMillis() - t1Var.f1728e6)) / 150.0f)) - 1.0E-4f;
                } else {
                    iArr2 = iArr7;
                    if (!t1Var.f1739f6) {
                        f10 = 0.0f;
                    } else {
                        f10 = Utilities.clamp01(((float) (AnimationUtils.currentAnimationTimeMillis() - t1Var.f1718d6)) / 470.0f);
                    }
                }
            } else {
                iArr2 = iArr7;
                f7 = 1.0f;
                f10 = 1.0f;
            }
            t1 t1Var2 = z0Var.d;
            int[] iArr10 = iArr2;
            if (t1Var2 != null && t1Var2.f1743g1 > 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (t1Var2 != null) {
                f11 = Utilities.clamp01(t1Var2.f1734f1);
            } else {
                f11 = f7;
            }
            float f24 = f7 - f11;
            boolean z12 = z10;
            float A = d3.A(f24, f24, f24, f7);
            if (z12) {
                f12 = z0Var.d.V0();
            } else {
                f12 = -1.0f;
            }
            int i10 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i10 >= 0) {
                float f25 = f7 - f12;
                max = ((f7 - ((f25 * f25) * f25)) * 0.25f) + 0.75f;
                f13 = f12;
            } else if (f11 >= 0.999f) {
                f13 = f12;
                max = 1.0f;
            } else {
                f13 = f12;
                max = Math.max(rVar2.getScaleX(), (0.25f * A) + 0.75f);
            }
            if (z12) {
                rectF = rectF2;
                f14 = 1.0f;
                f15 = Math.min(1.0f, f11 / 0.55f);
            } else {
                rectF = rectF2;
                f14 = 1.0f;
                f15 = 1.0f;
            }
            if (i10 >= 0 && f13 < f14) {
                f16 = f14;
                z0Var.d.invalidate();
            } else {
                f16 = f14;
            }
            if (max < f16) {
                rVar2.postInvalidateOnAnimation();
            }
            if (rVar2.getScaleX() != max) {
                View view = rVar2;
                float f26 = 0.0f;
                while (true) {
                    paint = paint5;
                    if (view == null || view == z0Var.h || !(view.getParent() instanceof View)) {
                        break;
                    }
                    f26 += view.getTop();
                    view = (View) view.getParent();
                    paint5 = paint;
                }
                if (Float.isNaN(z0Var.K)) {
                    max2 = rVar2.getHeight();
                } else {
                    max2 = Math.max(0.0f, Math.min(rVar2.getHeight(), z0Var.K - f26));
                }
                rVar2.setPivotX(rVar2.getWidth() / 2.0f);
                rVar2.setPivotY(max2);
                rVar2.setScaleX(max);
                rVar2.setScaleY(max);
            } else {
                paint = paint5;
            }
            if (rVar2.getAlpha() != f15) {
                rVar2.setAlpha(f15);
            }
            rVar2.getLocationOnScreen(iArr9);
            z0Var.h.getLocationOnScreen(iArr8);
            float f27 = iArr9[1] - iArr8[1];
            if (rVar2.getScaleY() > 0.01f) {
                f17 = rVar2.getScaleY();
            } else {
                f17 = 1.0f;
            }
            float width = rVar2.getWidth();
            if (z0Var.V == null) {
                LinearGradient f02 = z0.f0(false);
                z0Var.V = f02;
                paint4.setShader(f02);
                iArr3 = iArr8;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint4.setXfermode(new PorterDuffXfermode(mode));
                LinearGradient f03 = z0.f0(true);
                z0Var.N = f03;
                paint3.setShader(f03);
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            } else {
                iArr3 = iArr8;
            }
            x xVar = this.f1636c;
            xVar.getLocationOnScreen(iArr9);
            float f28 = iArr9[1] - iArr3[1];
            float f29 = (f28 - f27) / f17;
            float dp = ((AndroidUtilities.dp(12.0f) + xVar.getHeight()) / f17) + f29;
            d dVar = z0Var.f2011x;
            if (dVar != null) {
                float height = (f28 + xVar.getHeight()) - z0Var.f1991c0;
                paint2 = paint3;
                if (dVar.K != height) {
                    dVar.K = height;
                    dVar.invalidate();
                }
            } else {
                paint2 = paint3;
            }
            xVar.getLocationOnScreen(z0Var.f1998i0);
            rVar2.getLocationOnScreen(z0Var.f1999j0);
            float scaleX = (iArr4[0] - iArr5[0]) / rVar2.getScaleX();
            rectF3.set((z0Var.f1987a0 / f17) + scaleX, (z0Var.f1989b0 / f17) + f29, ((xVar.getWidth() - z0Var.f1987a0) / f17) + scaleX, ((xVar.getHeight() - z0Var.f1991c0) / f17) + f29);
            paint6.setAlpha(255);
            canvas3.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint6);
            matrix.setScale(1.0f, dp - f29);
            matrix.postTranslate(0.0f, f29);
            z0Var.N.setLocalMatrix(matrix);
            canvas3.drawRect(0.0f, Math.min(f29, (-f27) / f17), width, dp, paint2);
            float dp2 = AndroidUtilities.dp(10.0f);
            float f30 = ((z0Var.K - f27) - dp2) / f17;
            float f31 = dp2 / f17;
            matrix.setScale(1.0f, f31);
            matrix.postTranslate(0.0f, f30);
            z0Var.V.setLocalMatrix(matrix);
            canvas3.drawRect(0.0f, f30, width, Math.max(f31 + f30, AndroidUtilities.dp(200.0f) + rVar2.getHeight()), paint4);
            if (f10 < 1.0f && !z12) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12) {
                f18 = f11;
            } else {
                f18 = f10;
            }
            t1 t1Var3 = z0Var.d;
            float f32 = 90.0f;
            if (t1Var3 != null) {
                z0Var.f1992d0 = z0Var.f2007r - (t1Var3.H0() - AndroidUtilities.dp(8.0f));
                float translationY = xVar.getTranslationY();
                float f33 = z0Var.f1992d0;
                if (translationY != f33) {
                    xVar.setTranslationY(f33);
                    xVar.invalidate();
                }
                if (f18 < 1.0f) {
                    if (f18 >= 0.0f) {
                        float max3 = Math.max(0.0f, Math.min(1.0f, f18));
                        float f34 = 1.0f - max3;
                        f22 = Math.min(1.0f, max3 / 0.35f);
                        f23 = ((1.0f - ((f34 * f34) * f34)) * 0.15f) + 0.85f;
                    } else {
                        float max4 = Math.max(0.0f, Math.min(1.0f, ((-f18) * 150.0f) / 90.0f));
                        f23 = d3.A(max4, 0.15f, max4, 1.0f);
                        f22 = 1.0f - max4;
                    }
                } else {
                    f22 = 1.0f;
                    f23 = 1.0f;
                }
                if (xVar.getScaleX() != f23) {
                    xVar.setPivotX(xVar.getWidth() / 2.0f);
                    xVar.setPivotY(xVar.getHeight() / 2.0f);
                    xVar.setScaleX(f23);
                    xVar.setScaleY(f23);
                    xVar.invalidate();
                }
                if (xVar.getAlpha() != f22) {
                    xVar.setAlpha(f22);
                }
                if ((f23 != 1.0f || f22 != 1.0f) && (rVar = z0Var.Z) != null) {
                    rVar.postInvalidateOnAnimation();
                }
            }
            float max5 = Math.max(0.0f, -f27);
            float f35 = z0Var.K - f27;
            int i11 = 0;
            float f36 = 0.0f;
            while (true) {
                float f37 = f32;
                if (i11 >= rVar2.getChildCount()) {
                    break;
                }
                View childAt = rVar2.getChildAt(i11);
                if (!(childAt instanceof q)) {
                    canvas2 = canvas3;
                } else {
                    q qVar = (q) childAt;
                    if (f36 == 0.0f) {
                        f36 = childAt.getHeight();
                    }
                    if (z11 && f36 > 0.0f) {
                        float max6 = Math.max(1.0f, (f35 - max5) / f36);
                        float height2 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                        if (f10 >= 0.0f) {
                            canvas2 = canvas3;
                            f21 = (t1.S(Math.max(0.0f, Math.min(1.0f, ((f10 * 470.0f) - (Math.max(0.0f, ((f35 - height2) / f36) - 0.5f) * Math.min(45.0f, 250.0f / max6))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                        } else {
                            canvas2 = canvas3;
                            float max7 = Math.max(0.0f, Math.min(1.0f, (((-f10) * 150.0f) - (Math.max(0.0f, ((height2 - max5) / f36) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, max6 - 1.0f)))) / f37));
                            f21 = d3.A(max7, 0.4f, max7, 1.0f);
                        }
                    } else {
                        canvas2 = canvas3;
                        f21 = 1.0f;
                    }
                    if (qVar.f1633r != f21) {
                        qVar.f1633r = f21;
                        qVar.invalidate();
                    }
                }
                i11++;
                f32 = f37;
                canvas3 = canvas2;
            }
            Canvas canvas4 = canvas3;
            if (z11 && f36 > 0.0f) {
                float max8 = Math.max(1.0f, (f35 - max5) / f36);
                if (z0Var.f1995f0 == null) {
                    z0Var.f1995f0 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
                }
                if (f10 >= 0.0f) {
                    f19 = 1.0f;
                    matrix.setScale(1.0f, f36);
                    matrix.postTranslate(0.0f, (f35 - (Math.max(-1.0f, ((f10 * 470.0f) - 38.5f) / Math.min(45.0f, 250.0f / max8)) * f36)) - (f36 / 2.0f));
                } else {
                    f19 = 1.0f;
                    matrix.setScale(1.0f, f36);
                    matrix.postTranslate(0.0f, ((Math.max(-1.0f, (((-f10) * 150.0f) - 76.5f) / Math.min(25.0f, 60.0f / Math.max(1.0f, max8 - 1.0f))) * f36) + max5) - (f36 / 2.0f));
                }
                z0Var.f1995f0.setLocalMatrix(matrix);
                Paint paint7 = paint;
                paint7.setShader(z0Var.f1995f0);
                if (paint7.getXfermode() == null) {
                    paint7.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                canvas = canvas4;
                canvas.drawRect(0.0f, 0.0f, width, rVar2.getHeight(), paint7);
                rVar2.invalidate();
            } else {
                canvas = canvas4;
                f19 = 1.0f;
            }
            d dVar2 = z0Var.f2011x;
            if (dVar2 != null) {
                RectF rectF4 = dVar2.F;
                if (dVar2.f1465x > 0.003f && !rectF4.isEmpty()) {
                    RectF rectF5 = rectF;
                    rectF5.set(rectF4);
                    fArr[0] = rectF4.height() / 2.0f;
                    fArr[1] = dVar2.f1466y;
                    z0Var.f2011x.getLocationOnScreen(iArr10);
                    int[] iArr11 = iArr;
                    rVar2.getLocationOnScreen(iArr11);
                    if (rVar2.getScaleX() > 0.01f) {
                        f20 = rVar2.getScaleX();
                    } else {
                        f20 = f19;
                    }
                    if (rVar2.getScaleY() > 0.01f) {
                        f19 = rVar2.getScaleY();
                    }
                    float f38 = iArr10[0] - iArr11[0];
                    float f39 = iArr10[1] - iArr11[1];
                    rectF5.set((rectF5.left + f38) / f20, (rectF5.top + f39) / f19, (rectF5.right + f38) / f20, (rectF5.bottom + f39) / f19);
                    fArr[0] = fArr[0] / f19;
                    paint6.setAlpha((int) (fArr[1] * 255.0f));
                    float f40 = fArr[0];
                    canvas.drawRoundRect(rectF5, f40, f40, paint6);
                }
            }
        }
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
