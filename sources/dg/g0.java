package dg;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.e4;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.xx0;
import ph.c5;
public final class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4518a;
    public final int f4519b;
    public final int f4520c;
    public final Object d;

    public g0(Object obj, int i10, int i11, int i12) {
        this.f4518a = i12;
        this.d = obj;
        this.f4519b = i10;
        this.f4520c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f4518a;
        int i11 = this.f4520c;
        int i12 = this.f4519b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                e1 e1Var = (e1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.H1.f2401a = i0.a.d(floatValue, i12, i11);
                e1Var.Z0.invalidate();
                return;
            case 1:
                e4 e4Var = (e4) obj;
                e4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                jj0 jj0Var = e4Var.f21006f;
                jj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                j6.B1(jj0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) obj;
                j6Var.getClass();
                j6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                j6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f23152l0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.T = i12 * floatValue2;
                scrollSlidingTextTabStrip.U = i11 * floatValue2;
                scrollSlidingTextTabStrip.f23153a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                xx0 xx0Var = (xx0) ((mm0) obj).f27076b;
                xx0Var.f30770c.setAlpha(animatedFraction);
                xx0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    xx0Var.y0(i11 + i14);
                    xx0Var.f30770c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                c5 c5Var = (c5) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.f41370x1.f2401a = i0.a.d(floatValue3, i12, i11);
                c5Var.Q0.invalidate();
                return;
        }
    }
}
