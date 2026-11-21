package hi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.rh0;
public final class f4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14637a;
    public final int f14638b;
    public final int f14639c;
    public final Object d;

    public f4(Object obj, int i7, int i10, int i11) {
        this.f14637a = i11;
        this.d = obj;
        this.f14638b = i7;
        this.f14639c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f14637a;
        int i10 = this.f14639c;
        int i11 = this.f14638b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                k5 k5Var = (k5) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var.f14887k1.f57259a = i0.a.f(floatValue, i11, i10);
                k5Var.D0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) obj;
                g4Var.getClass();
                int S0 = org.telegram.messenger.g0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i11, i10);
                rh0 rh0Var = g4Var.f30687f;
                rh0Var.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.m6.H1(rh0Var.getDrawable(), S0 & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) obj;
                n6Var.getClass();
                n6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10));
                n6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i12 = ScrollSlidingTextTabStrip.f33129p0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.f33131a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f33133b0 = i10 * floatValue2;
                scrollSlidingTextTabStrip.f33130a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                kw0 kw0Var = (kw0) ((cl0) obj).f34222b;
                kw0Var.n1.setAlpha(animatedFraction);
                kw0Var.f37022r1.setAlpha(animatedFraction);
                if (i11 != 0) {
                    int i13 = (int) ((1.0f - animatedFraction) * i11);
                    kw0Var.X0(i10 + i13);
                    kw0Var.n1.setTranslationY(i13);
                    return;
                }
                return;
            default:
                tg.h0 h0Var = (tg.h0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h0Var.f57932u1.f57259a = i0.a.f(floatValue3, i11, i10);
                h0Var.M0.invalidate();
                return;
        }
    }
}
