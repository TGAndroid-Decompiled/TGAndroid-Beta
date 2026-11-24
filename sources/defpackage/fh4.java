package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class fh4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public fh4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        float f2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                hh4 hh4Var = (hh4) obj;
                hh4Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = hh4Var.c;
                imageView.setAlpha(floatValue);
                float f3 = (floatValue * 0.5f) + 0.5f;
                imageView.setScaleX(f3);
                imageView.setScaleY(f3);
                View view = hh4Var.f;
                float f4 = 1.0f - floatValue;
                view.setAlpha(f4);
                float f5 = (f4 * 0.5f) + 0.5f;
                view.setScaleX(f5);
                view.setScaleY(f5);
                return;
            case 1:
                rk4 rk4Var = (rk4) obj;
                rk4Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rk4Var.i();
                return;
            case 2:
                sk4 sk4Var = (sk4) obj;
                sk4Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sk4Var.invalidate();
                return;
            case 3:
                ((tl4) obj).m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ((xt4) obj).l1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                g95 g95Var = (g95) obj;
                g95Var.O2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g95Var.J1(true);
                g95Var.o1.invalidate();
                g95Var.J1.invalidate();
                return;
            case 6:
                t85 t85Var = (t85) obj;
                t85Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t85Var.a.invalidate();
                return;
            case 7:
                w85 w85Var = (w85) obj;
                w85Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g95 g95Var2 = w85Var.L;
                g95Var2.J1.invalidate();
                g95Var2.T3.invalidate();
                g95Var2.b.invalidate();
                g95Var2.F1();
                return;
            case 8:
                oa5 oa5Var = (oa5) obj;
                ma5 ma5Var = oa5Var.a;
                if (!oa5Var.H) {
                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    oa5Var.d0 = floatValue2;
                    oa5Var.W.setPinnedProgress(floatValue2);
                    ma5Var.setScaleX(1.0f - (oa5Var.d0 * 0.6f));
                    ma5Var.setScaleY(1.0f - (oa5Var.d0 * 0.6f));
                    if (oa5Var.Y) {
                        oa5Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                va5 va5Var = (va5) obj;
                va5Var.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                va5Var.d();
                return;
            case 10:
                xc5 xc5Var = (xc5) obj;
                bf0 bf0Var = xc5Var.a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (xc5Var.I) {
                    f = 1.0f - (0.18f * floatValue3);
                } else {
                    f = 0.82f + (0.18f * floatValue3);
                }
                bf0Var.setScaleX(f);
                bf0Var.setScaleY(f);
                if (!xc5Var.I) {
                    floatValue3 = 1.0f - floatValue3;
                }
                xc5Var.J = floatValue3;
                xc5Var.invalidate();
                return;
            case 11:
                hg5 hg5Var = (hg5) obj;
                hg5Var.A0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hg5Var.invalidate();
                return;
            case 12:
                xn5 xn5Var = (xn5) obj;
                xn5Var.getClass();
                xn5Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                it5 it5Var = (it5) obj;
                it5Var.b2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                it5Var.b.invalidate();
                return;
            case 14:
                it5 it5Var2 = ((ht5) obj).e;
                it5Var2.e2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                it5Var2.b.invalidate();
                return;
            case 15:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yt5 yt5Var = ((bu5) obj).x;
                if (yt5Var != null) {
                    yt5Var.setProgress(floatValue4);
                    return;
                }
                return;
            case 16:
                ((yt5) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                iw5 iw5Var = (iw5) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iw5Var.s = floatValue5;
                iw5Var.d(floatValue5);
                return;
            case 18:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i = LimitPreviewView.p0;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue6 < 0.5f) {
                    f2 = (floatValue6 / 0.5f) * (-7.0f);
                } else {
                    f2 = (1.0f - ((floatValue6 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.c0 = f2;
                return;
            case 19:
                r86 r86Var = (r86) obj;
                r86Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r86Var.invalidateSelf();
                return;
            case 20:
                ((k96) obj).invalidate();
                return;
            case 21:
                n38 n38Var = (n38) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n38Var.c.setAlpha(floatValue7);
                n38Var.a.setAlpha(gm.R1(0.0f, 0.5f, floatValue7));
                n38Var.invalidate();
                return;
            case 22:
                d96 d96Var = (d96) obj;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = d96Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (gm.R1(d96Var.f, 1.0f, floatValue8) * 255.0f));
                    d96Var.h.invalidate();
                    return;
                }
                return;
            case 23:
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d96 d96Var2 = (d96) ((v85) obj).b;
                Drawable drawable2 = d96Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (gm.R1(1.0f, d96Var2.f, floatValue9) * 255.0f));
                    d96Var2.h.invalidate();
                    return;
                }
                return;
            case 24:
                ((pc6) obj).v0();
                return;
            case 25:
                ((ra8) ((gl6) obj)).L.f0.invalidate();
                return;
            case 26:
                ((gj7) obj).invalidate();
                return;
            case 27:
                vn7 vn7Var = (vn7) obj;
                vn7Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                vn7Var.invalidate();
                return;
            case 28:
                wt7 wt7Var = (wt7) obj;
                wt7Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wt7Var.invalidate();
                return;
            default:
                lu7 lu7Var = (lu7) obj;
                lu7Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lu7Var.invalidate();
                return;
        }
    }
}
