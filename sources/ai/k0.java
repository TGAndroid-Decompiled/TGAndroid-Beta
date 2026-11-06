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
import org.telegram.messenger.Utilities;
public final class k0 implements Consumer {
    public final s0 f1307a;
    public final r f1308b;
    public final w f1309c;

    public k0(s0 s0Var, r rVar, w wVar) {
        this.f1307a = s0Var;
        this.f1308b = rVar;
        this.f1309c = wVar;
    }

    @Override
    public final void accept(Object obj) {
        int[] iArr;
        int[] iArr2;
        float f10;
        float f11;
        boolean z9;
        float f12;
        float f13;
        float f14;
        float max;
        RectF rectF;
        float f15;
        float f16;
        float f17;
        Paint paint;
        float f18;
        int[] iArr3;
        Paint paint2;
        int[] iArr4;
        int[] iArr5;
        boolean z10;
        float f19;
        Canvas canvas;
        float f20;
        float f21;
        Canvas canvas2;
        float f22;
        float f23;
        float f24;
        r rVar;
        float max2;
        Canvas canvas3 = (Canvas) obj;
        s0 s0Var = this.f1307a;
        int[] iArr6 = s0Var.U;
        int[] iArr7 = s0Var.T;
        float[] fArr = s0Var.S;
        RectF rectF2 = s0Var.R;
        RectF rectF3 = s0Var.f1625h0;
        Paint paint3 = s0Var.O;
        Paint paint4 = s0Var.J;
        int[] iArr8 = s0Var.M;
        Paint paint5 = s0Var.f1624g0;
        int[] iArr9 = s0Var.L;
        Paint paint6 = s0Var.Q;
        Matrix matrix = s0Var.P;
        r rVar2 = this.f1308b;
        if (rVar2.isVerticalScrollBarEnabled()) {
            rVar2.setVerticalScrollBarEnabled(false);
        }
        if (!s0Var.f1621e0) {
            iArr = iArr6;
            q0 q0Var = s0Var.h;
            if (q0Var != null) {
                s0Var.f1621e0 = true;
                s0.c0(q0Var);
            }
        } else {
            iArr = iArr6;
        }
        if (s0Var.h != null && !Float.isNaN(s0Var.K)) {
            l1 l1Var = s0Var.d;
            if (l1Var != null) {
                f10 = 1.0f;
                if (l1Var.f1382g1 < 0.5f) {
                    iArr2 = iArr7;
                    f11 = (-Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - l1Var.f1355d6)) / 150.0f)) - 1.0E-4f;
                } else {
                    iArr2 = iArr7;
                    if (!l1Var.f1366e6) {
                        f11 = 0.0f;
                    } else {
                        f11 = Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - l1Var.f1346c6)) / 470.0f);
                    }
                }
            } else {
                iArr2 = iArr7;
                f10 = 1.0f;
                f11 = 1.0f;
            }
            l1 l1Var2 = s0Var.d;
            int[] iArr10 = iArr2;
            if (l1Var2 != null && l1Var2.f1382g1 > 0.5f) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (l1Var2 != null) {
                f12 = Utilities.l(l1Var2.f1372f1);
            } else {
                f12 = f10;
            }
            float f25 = f10 - f12;
            boolean z11 = z9;
            float x10 = org.telegram.ui.Cells.f1.x(f25, f25, f25, f10);
            if (z11) {
                f13 = s0Var.d.V0();
            } else {
                f13 = -1.0f;
            }
            int i7 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            if (i7 >= 0) {
                float f26 = f10 - f13;
                max = ((f10 - ((f26 * f26) * f26)) * 0.25f) + 0.75f;
                f14 = f13;
            } else if (f12 >= 0.999f) {
                f14 = f13;
                max = 1.0f;
            } else {
                f14 = f13;
                max = Math.max(rVar2.getScaleX(), (0.25f * x10) + 0.75f);
            }
            if (z11) {
                rectF = rectF2;
                f15 = 1.0f;
                f16 = Math.min(1.0f, f12 / 0.55f);
            } else {
                rectF = rectF2;
                f15 = 1.0f;
                f16 = 1.0f;
            }
            if (i7 >= 0 && f14 < f15) {
                f17 = f15;
                s0Var.d.invalidate();
            } else {
                f17 = f15;
            }
            if (max < f17) {
                rVar2.postInvalidateOnAnimation();
            }
            if (rVar2.getScaleX() != max) {
                View view = rVar2;
                float f27 = 0.0f;
                while (true) {
                    paint = paint5;
                    if (view == null || view == s0Var.h || !(view.getParent() instanceof View)) {
                        break;
                    }
                    f27 += view.getTop();
                    view = (View) view.getParent();
                    paint5 = paint;
                }
                if (Float.isNaN(s0Var.K)) {
                    max2 = rVar2.getHeight();
                } else {
                    max2 = Math.max(0.0f, Math.min(rVar2.getHeight(), s0Var.K - f27));
                }
                rVar2.setPivotX(rVar2.getWidth() / 2.0f);
                rVar2.setPivotY(max2);
                rVar2.setScaleX(max);
                rVar2.setScaleY(max);
            } else {
                paint = paint5;
            }
            if (rVar2.getAlpha() != f16) {
                rVar2.setAlpha(f16);
            }
            rVar2.getLocationOnScreen(iArr9);
            s0Var.h.getLocationOnScreen(iArr8);
            float f28 = iArr9[1] - iArr8[1];
            if (rVar2.getScaleY() > 0.01f) {
                f18 = rVar2.getScaleY();
            } else {
                f18 = 1.0f;
            }
            float width = rVar2.getWidth();
            if (s0Var.V == null) {
                LinearGradient j02 = s0.j0(false);
                s0Var.V = j02;
                paint4.setShader(j02);
                iArr3 = iArr8;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint4.setXfermode(new PorterDuffXfermode(mode));
                LinearGradient j03 = s0.j0(true);
                s0Var.N = j03;
                paint3.setShader(j03);
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            } else {
                iArr3 = iArr8;
            }
            w wVar = this.f1309c;
            wVar.getLocationOnScreen(iArr9);
            float f29 = iArr9[1] - iArr3[1];
            float f30 = (f29 - f28) / f18;
            float L = ((org.telegram.messenger.g0.L(12.0f) + wVar.getHeight()) / f18) + f30;
            d dVar = s0Var.f1640y;
            if (dVar != null) {
                float height = (f29 + wVar.getHeight()) - s0Var.f1618c0;
                paint2 = paint3;
                if (dVar.K != height) {
                    dVar.K = height;
                    dVar.invalidate();
                }
            } else {
                paint2 = paint3;
            }
            wVar.getLocationOnScreen(s0Var.f1626i0);
            rVar2.getLocationOnScreen(s0Var.f1627j0);
            float scaleX = (iArr4[0] - iArr5[0]) / rVar2.getScaleX();
            rectF3.set((s0Var.f1614a0 / f18) + scaleX, (s0Var.f1616b0 / f18) + f30, ((wVar.getWidth() - s0Var.f1614a0) / f18) + scaleX, ((wVar.getHeight() - s0Var.f1618c0) / f18) + f30);
            paint6.setAlpha(255);
            canvas3.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint6);
            matrix.setScale(1.0f, L - f30);
            matrix.postTranslate(0.0f, f30);
            s0Var.N.setLocalMatrix(matrix);
            canvas3.drawRect(0.0f, Math.min(f30, (-f28) / f18), width, L, paint2);
            float L2 = org.telegram.messenger.g0.L(10.0f);
            float f31 = ((s0Var.K - f28) - L2) / f18;
            float f32 = L2 / f18;
            matrix.setScale(1.0f, f32);
            matrix.postTranslate(0.0f, f31);
            s0Var.V.setLocalMatrix(matrix);
            canvas3.drawRect(0.0f, f31, width, Math.max(f32 + f31, org.telegram.messenger.g0.L(200.0f) + rVar2.getHeight()), paint4);
            if (f11 < 1.0f && !z11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11) {
                f19 = f12;
            } else {
                f19 = f11;
            }
            l1 l1Var3 = s0Var.d;
            float f33 = 90.0f;
            if (l1Var3 != null) {
                s0Var.f1619d0 = s0Var.f1635r - (l1Var3.H0() - org.telegram.messenger.g0.L(8.0f));
                float translationY = wVar.getTranslationY();
                float f34 = s0Var.f1619d0;
                if (translationY != f34) {
                    wVar.setTranslationY(f34);
                    wVar.invalidate();
                }
                if (f19 < 1.0f) {
                    if (f19 >= 0.0f) {
                        float max3 = Math.max(0.0f, Math.min(1.0f, f19));
                        float f35 = 1.0f - max3;
                        f23 = Math.min(1.0f, max3 / 0.35f);
                        f24 = ((1.0f - ((f35 * f35) * f35)) * 0.15f) + 0.85f;
                    } else {
                        float max4 = Math.max(0.0f, Math.min(1.0f, ((-f19) * 150.0f) / 90.0f));
                        f24 = org.telegram.ui.Cells.f1.x(max4, 0.15f, max4, 1.0f);
                        f23 = 1.0f - max4;
                    }
                } else {
                    f23 = 1.0f;
                    f24 = 1.0f;
                }
                if (wVar.getScaleX() != f24) {
                    wVar.setPivotX(wVar.getWidth() / 2.0f);
                    wVar.setPivotY(wVar.getHeight() / 2.0f);
                    wVar.setScaleX(f24);
                    wVar.setScaleY(f24);
                    wVar.invalidate();
                }
                if (wVar.getAlpha() != f23) {
                    wVar.setAlpha(f23);
                }
                if ((f24 != 1.0f || f23 != 1.0f) && (rVar = s0Var.Z) != null) {
                    rVar.postInvalidateOnAnimation();
                }
            }
            float max5 = Math.max(0.0f, -f28);
            float f36 = s0Var.K - f28;
            int i10 = 0;
            float f37 = 0.0f;
            while (true) {
                float f38 = f33;
                if (i10 >= rVar2.getChildCount()) {
                    break;
                }
                View childAt = rVar2.getChildAt(i10);
                if (!(childAt instanceof q)) {
                    canvas2 = canvas3;
                } else {
                    q qVar = (q) childAt;
                    if (f37 == 0.0f) {
                        f37 = childAt.getHeight();
                    }
                    if (z10 && f37 > 0.0f) {
                        float max6 = Math.max(1.0f, (f36 - max5) / f37);
                        float height2 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                        if (f11 >= 0.0f) {
                            canvas2 = canvas3;
                            f22 = (l1.S(Math.max(0.0f, Math.min(1.0f, ((f11 * 470.0f) - (Math.max(0.0f, ((f36 - height2) / f37) - 0.5f) * Math.min(45.0f, 250.0f / max6))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                        } else {
                            canvas2 = canvas3;
                            float max7 = Math.max(0.0f, Math.min(1.0f, (((-f11) * 150.0f) - (Math.max(0.0f, ((height2 - max5) / f37) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, max6 - 1.0f)))) / f38));
                            f22 = org.telegram.ui.Cells.f1.x(max7, 0.4f, max7, 1.0f);
                        }
                    } else {
                        canvas2 = canvas3;
                        f22 = 1.0f;
                    }
                    if (qVar.f1605r != f22) {
                        qVar.f1605r = f22;
                        qVar.invalidate();
                    }
                }
                i10++;
                f33 = f38;
                canvas3 = canvas2;
            }
            Canvas canvas4 = canvas3;
            if (z10 && f37 > 0.0f) {
                float max8 = Math.max(1.0f, (f36 - max5) / f37);
                if (s0Var.f1623f0 == null) {
                    s0Var.f1623f0 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
                }
                if (f11 >= 0.0f) {
                    f20 = 1.0f;
                    matrix.setScale(1.0f, f37);
                    matrix.postTranslate(0.0f, (f36 - (Math.max(-1.0f, ((f11 * 470.0f) - 38.5f) / Math.min(45.0f, 250.0f / max8)) * f37)) - (f37 / 2.0f));
                } else {
                    f20 = 1.0f;
                    matrix.setScale(1.0f, f37);
                    matrix.postTranslate(0.0f, ((Math.max(-1.0f, (((-f11) * 150.0f) - 76.5f) / Math.min(25.0f, 60.0f / Math.max(1.0f, max8 - 1.0f))) * f37) + max5) - (f37 / 2.0f));
                }
                s0Var.f1623f0.setLocalMatrix(matrix);
                Paint paint7 = paint;
                paint7.setShader(s0Var.f1623f0);
                if (paint7.getXfermode() == null) {
                    paint7.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                canvas = canvas4;
                canvas.drawRect(0.0f, 0.0f, width, rVar2.getHeight(), paint7);
                rVar2.invalidate();
            } else {
                canvas = canvas4;
                f20 = 1.0f;
            }
            d dVar2 = s0Var.f1640y;
            if (dVar2 != null) {
                RectF rectF4 = dVar2.F;
                if (dVar2.f1154y > 0.003f && !rectF4.isEmpty()) {
                    RectF rectF5 = rectF;
                    rectF5.set(rectF4);
                    fArr[0] = rectF4.height() / 2.0f;
                    fArr[1] = dVar2.D;
                    s0Var.f1640y.getLocationOnScreen(iArr10);
                    int[] iArr11 = iArr;
                    rVar2.getLocationOnScreen(iArr11);
                    if (rVar2.getScaleX() > 0.01f) {
                        f21 = rVar2.getScaleX();
                    } else {
                        f21 = f20;
                    }
                    if (rVar2.getScaleY() > 0.01f) {
                        f20 = rVar2.getScaleY();
                    }
                    float f39 = iArr10[0] - iArr11[0];
                    float f40 = iArr10[1] - iArr11[1];
                    rectF5.set((rectF5.left + f39) / f21, (rectF5.top + f40) / f20, (rectF5.right + f39) / f21, (rectF5.bottom + f40) / f20);
                    fArr[0] = fArr[0] / f20;
                    paint6.setAlpha((int) (fArr[1] * 255.0f));
                    float f41 = fArr[0];
                    canvas.drawRoundRect(rectF5, f41, f41, paint6);
                }
            }
        }
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
