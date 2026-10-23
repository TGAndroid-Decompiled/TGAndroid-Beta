package ei;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.yj0;
public final class u4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9888a;
    public final int f9889b;
    public final int f9890c;
    public final Object d;

    public u4(Object obj, int i10, int i11, int i12) {
        this.f9888a = i12;
        this.d = obj;
        this.f9889b = i10;
        this.f9890c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f9888a;
        int i11 = this.f9890c;
        int i12 = this.f9889b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                f6 f6Var = (f6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.A1.f44661a = i0.a.f(floatValue, i12, i11);
                f6Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) obj;
                d4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                yj0 yj0Var = d4Var.f22133f;
                yj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.h6.C1(yj0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) obj;
                p6Var.getClass();
                p6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                p6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f24348o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f24350a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f24349a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                qy0 qy0Var = (qy0) ((dn0) obj).f25578b;
                qy0Var.f29751c.setAlpha(animatedFraction);
                qy0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    qy0Var.z0(i11 + i14);
                    qy0Var.f29751c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                rg.m0 m0Var = (rg.m0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f44661a = i0.a.f(floatValue3, i12, i11);
                m0Var.f45480c1.invalidate();
                return;
        }
    }
}
