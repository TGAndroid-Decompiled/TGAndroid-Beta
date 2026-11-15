package ci;

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
public final class c0 implements Consumer {
    public final i0 f5328a;
    public final m f5329b;
    public final r f5330c;

    public c0(i0 i0Var, m mVar, r rVar) {
        this.f5328a = i0Var;
        this.f5329b = mVar;
        this.f5330c = rVar;
    }

    @Override
    public final void accept(Object obj) {
        int[] iArr;
        int[] iArr2;
        float f10;
        float f11;
        boolean z10;
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
        boolean z11;
        float f19;
        Canvas canvas;
        float f20;
        float f21;
        Canvas canvas2;
        float f22;
        float f23;
        float f24;
        m mVar;
        float max2;
        Canvas canvas3 = (Canvas) obj;
        i0 i0Var = this.f5328a;
        int[] iArr6 = i0Var.V;
        int[] iArr7 = i0Var.U;
        float[] fArr = i0Var.T;
        RectF rectF2 = i0Var.S;
        RectF rectF3 = i0Var.f5400i0;
        Paint paint3 = i0Var.P;
        Paint paint4 = i0Var.K;
        int[] iArr8 = i0Var.N;
        Paint paint5 = i0Var.f5399h0;
        int[] iArr9 = i0Var.M;
        Paint paint6 = i0Var.R;
        Matrix matrix = i0Var.Q;
        m mVar2 = this.f5329b;
        if (mVar2.isVerticalScrollBarEnabled()) {
            mVar2.setVerticalScrollBarEnabled(false);
        }
        if (!i0Var.f5397f0) {
            iArr = iArr6;
            g0 g0Var = i0Var.h;
            if (g0Var != null) {
                i0Var.f5397f0 = true;
                i0.c0(g0Var);
            }
        } else {
            iArr = iArr6;
        }
        if (i0Var.h != null && !Float.isNaN(i0Var.L)) {
            z0 z0Var = i0Var.d;
            if (z0Var != null) {
                f10 = 1.0f;
                if (z0Var.f5642h1 < 0.5f) {
                    iArr2 = iArr7;
                    f11 = (-Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - z0Var.f5616e6)) / 150.0f)) - 1.0E-4f;
                } else {
                    iArr2 = iArr7;
                    if (!z0Var.f5627f6) {
                        f11 = 0.0f;
                    } else {
                        f11 = Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - z0Var.f5605d6)) / 470.0f);
                    }
                }
            } else {
                iArr2 = iArr7;
                f10 = 1.0f;
                f11 = 1.0f;
            }
            z0 z0Var2 = i0Var.d;
            int[] iArr10 = iArr2;
            if (z0Var2 != null && z0Var2.f5642h1 > 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z0Var2 != null) {
                f12 = Utilities.l(z0Var2.f5632g1);
            } else {
                f12 = f10;
            }
            float f25 = f10 - f12;
            boolean z12 = z10;
            float x10 = org.telegram.ui.Cells.y0.x(f25, f25, f25, f10);
            if (z12) {
                f13 = i0Var.d.V0();
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
                max = Math.max(mVar2.getScaleX(), (0.25f * x10) + 0.75f);
            }
            if (z12) {
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
                i0Var.d.invalidate();
            } else {
                f17 = f15;
            }
            if (max < f17) {
                mVar2.postInvalidateOnAnimation();
            }
            if (mVar2.getScaleX() != max) {
                View view = mVar2;
                float f27 = 0.0f;
                while (true) {
                    paint = paint5;
                    if (view == null || view == i0Var.h || !(view.getParent() instanceof View)) {
                        break;
                    }
                    f27 += view.getTop();
                    view = (View) view.getParent();
                    paint5 = paint;
                }
                if (Float.isNaN(i0Var.L)) {
                    max2 = mVar2.getHeight();
                } else {
                    max2 = Math.max(0.0f, Math.min(mVar2.getHeight(), i0Var.L - f27));
                }
                mVar2.setPivotX(mVar2.getWidth() / 2.0f);
                mVar2.setPivotY(max2);
                mVar2.setScaleX(max);
                mVar2.setScaleY(max);
            } else {
                paint = paint5;
            }
            if (mVar2.getAlpha() != f16) {
                mVar2.setAlpha(f16);
            }
            mVar2.getLocationOnScreen(iArr9);
            i0Var.h.getLocationOnScreen(iArr8);
            float f28 = iArr9[1] - iArr8[1];
            if (mVar2.getScaleY() > 0.01f) {
                f18 = mVar2.getScaleY();
            } else {
                f18 = 1.0f;
            }
            float width = mVar2.getWidth();
            if (i0Var.W == null) {
                LinearGradient j02 = i0.j0(false);
                i0Var.W = j02;
                paint4.setShader(j02);
                iArr3 = iArr8;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint4.setXfermode(new PorterDuffXfermode(mode));
                LinearGradient j03 = i0.j0(true);
                i0Var.O = j03;
                paint3.setShader(j03);
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            } else {
                iArr3 = iArr8;
            }
            r rVar = this.f5330c;
            rVar.getLocationOnScreen(iArr9);
            float f29 = iArr9[1] - iArr3[1];
            float f30 = (f29 - f28) / f18;
            float L = ((org.telegram.messenger.g0.L(12.0f) + rVar.getHeight()) / f18) + f30;
            c cVar = i0Var.f5415y;
            if (cVar != null) {
                float height = (f29 + rVar.getHeight()) - i0Var.f5393d0;
                paint2 = paint3;
                if (cVar.L != height) {
                    cVar.L = height;
                    cVar.invalidate();
                }
            } else {
                paint2 = paint3;
            }
            rVar.getLocationOnScreen(i0Var.f5401j0);
            mVar2.getLocationOnScreen(i0Var.f5402k0);
            float scaleX = (iArr4[0] - iArr5[0]) / mVar2.getScaleX();
            rectF3.set((i0Var.f5390b0 / f18) + scaleX, (i0Var.f5392c0 / f18) + f30, ((rVar.getWidth() - i0Var.f5390b0) / f18) + scaleX, ((rVar.getHeight() - i0Var.f5393d0) / f18) + f30);
            paint6.setAlpha(255);
            canvas3.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint6);
            matrix.setScale(1.0f, L - f30);
            matrix.postTranslate(0.0f, f30);
            i0Var.O.setLocalMatrix(matrix);
            canvas3.drawRect(0.0f, Math.min(f30, (-f28) / f18), width, L, paint2);
            float L2 = org.telegram.messenger.g0.L(10.0f);
            float f31 = ((i0Var.L - f28) - L2) / f18;
            float f32 = L2 / f18;
            matrix.setScale(1.0f, f32);
            matrix.postTranslate(0.0f, f31);
            i0Var.W.setLocalMatrix(matrix);
            canvas3.drawRect(0.0f, f31, width, Math.max(f32 + f31, org.telegram.messenger.g0.L(200.0f) + mVar2.getHeight()), paint4);
            if (f11 < 1.0f && !z12) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12) {
                f19 = f12;
            } else {
                f19 = f11;
            }
            z0 z0Var3 = i0Var.d;
            float f33 = 90.0f;
            if (z0Var3 != null) {
                i0Var.f5395e0 = i0Var.f5409r - (z0Var3.H0() - org.telegram.messenger.g0.L(8.0f));
                float translationY = rVar.getTranslationY();
                float f34 = i0Var.f5395e0;
                if (translationY != f34) {
                    rVar.setTranslationY(f34);
                    rVar.invalidate();
                }
                if (f19 < 1.0f) {
                    if (f19 >= 0.0f) {
                        float max3 = Math.max(0.0f, Math.min(1.0f, f19));
                        float f35 = 1.0f - max3;
                        f23 = Math.min(1.0f, max3 / 0.35f);
                        f24 = ((1.0f - ((f35 * f35) * f35)) * 0.15f) + 0.85f;
                    } else {
                        float max4 = Math.max(0.0f, Math.min(1.0f, ((-f19) * 150.0f) / 90.0f));
                        f24 = org.telegram.ui.Cells.y0.x(max4, 0.15f, max4, 1.0f);
                        f23 = 1.0f - max4;
                    }
                } else {
                    f23 = 1.0f;
                    f24 = 1.0f;
                }
                if (rVar.getScaleX() != f24) {
                    rVar.setPivotX(rVar.getWidth() / 2.0f);
                    rVar.setPivotY(rVar.getHeight() / 2.0f);
                    rVar.setScaleX(f24);
                    rVar.setScaleY(f24);
                    rVar.invalidate();
                }
                if (rVar.getAlpha() != f23) {
                    rVar.setAlpha(f23);
                }
                if ((f24 != 1.0f || f23 != 1.0f) && (mVar = i0Var.f5388a0) != null) {
                    mVar.postInvalidateOnAnimation();
                }
            }
            float max5 = Math.max(0.0f, -f28);
            float f36 = i0Var.L - f28;
            int i10 = 0;
            float f37 = 0.0f;
            while (true) {
                float f38 = f33;
                if (i10 >= mVar2.getChildCount()) {
                    break;
                }
                View childAt = mVar2.getChildAt(i10);
                if (!(childAt instanceof l)) {
                    canvas2 = canvas3;
                } else {
                    l lVar = (l) childAt;
                    if (f37 == 0.0f) {
                        f37 = childAt.getHeight();
                    }
                    if (z11 && f37 > 0.0f) {
                        float v = org.telegram.ui.Cells.y0.v(f36, max5, f37, 1.0f);
                        float height2 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                        if (f11 >= 0.0f) {
                            canvas2 = canvas3;
                            f22 = (z0.S(Math.max(0.0f, Math.min(1.0f, ((f11 * 470.0f) - (Math.max(0.0f, ((f36 - height2) / f37) - 0.5f) * Math.min(45.0f, 250.0f / v))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                        } else {
                            canvas2 = canvas3;
                            float max6 = Math.max(0.0f, Math.min(1.0f, (((-f11) * 150.0f) - (Math.max(0.0f, ((height2 - max5) / f37) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, v - 1.0f)))) / f38));
                            f22 = org.telegram.ui.Cells.y0.x(max6, 0.4f, max6, 1.0f);
                        }
                    } else {
                        canvas2 = canvas3;
                        f22 = 1.0f;
                    }
                    if (lVar.f5428r != f22) {
                        lVar.f5428r = f22;
                        lVar.invalidate();
                    }
                }
                i10++;
                f33 = f38;
                canvas3 = canvas2;
            }
            Canvas canvas4 = canvas3;
            if (z11 && f37 > 0.0f) {
                float v10 = org.telegram.ui.Cells.y0.v(f36, max5, f37, 1.0f);
                if (i0Var.f5398g0 == null) {
                    i0Var.f5398g0 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
                }
                if (f11 >= 0.0f) {
                    f20 = 1.0f;
                    matrix.setScale(1.0f, f37);
                    matrix.postTranslate(0.0f, (f36 - (Math.max(-1.0f, ((f11 * 470.0f) - 38.5f) / Math.min(45.0f, 250.0f / v10)) * f37)) - (f37 / 2.0f));
                } else {
                    f20 = 1.0f;
                    matrix.setScale(1.0f, f37);
                    matrix.postTranslate(0.0f, ((Math.max(-1.0f, (((-f11) * 150.0f) - 76.5f) / Math.min(25.0f, 60.0f / Math.max(1.0f, v10 - 1.0f))) * f37) + max5) - (f37 / 2.0f));
                }
                i0Var.f5398g0.setLocalMatrix(matrix);
                Paint paint7 = paint;
                paint7.setShader(i0Var.f5398g0);
                if (paint7.getXfermode() == null) {
                    paint7.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                canvas = canvas4;
                canvas.drawRect(0.0f, 0.0f, width, mVar2.getHeight(), paint7);
                mVar2.invalidate();
            } else {
                canvas = canvas4;
                f20 = 1.0f;
            }
            c cVar2 = i0Var.f5415y;
            if (cVar2 != null) {
                RectF rectF4 = cVar2.G;
                if (cVar2.f5327y > 0.003f && !rectF4.isEmpty()) {
                    RectF rectF5 = rectF;
                    rectF5.set(rectF4);
                    fArr[0] = rectF4.height() / 2.0f;
                    fArr[1] = cVar2.E;
                    i0Var.f5415y.getLocationOnScreen(iArr10);
                    int[] iArr11 = iArr;
                    mVar2.getLocationOnScreen(iArr11);
                    if (mVar2.getScaleX() > 0.01f) {
                        f21 = mVar2.getScaleX();
                    } else {
                        f21 = f20;
                    }
                    if (mVar2.getScaleY() > 0.01f) {
                        f20 = mVar2.getScaleY();
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
