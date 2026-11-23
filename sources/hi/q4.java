package hi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.qh0;
public final class q4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15219a;
    public final int f15220b;
    public final int f15221c;
    public final Object d;

    public q4(Object obj, int i7, int i10, int i11) {
        this.f15219a = i11;
        this.d = obj;
        this.f15220b = i7;
        this.f15221c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f15219a;
        int i10 = this.f15221c;
        int i11 = this.f15220b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                v5 v5Var = (v5) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v5Var.f15573k1.f57335a = i0.a.f(floatValue, i11, i10);
                v5Var.D0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) obj;
                g4Var.getClass();
                int S0 = org.telegram.messenger.g0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i11, i10);
                qh0 qh0Var = g4Var.f30745f;
                qh0Var.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.n6.H1(qh0Var.getDrawable(), S0 & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.m6 m6Var = (org.telegram.ui.Components.m6) obj;
                m6Var.getClass();
                m6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10));
                m6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i12 = ScrollSlidingTextTabStrip.f33196p0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.f33198a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f33200b0 = i10 * floatValue2;
                scrollSlidingTextTabStrip.f33197a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                jw0 jw0Var = (jw0) ((cl0) obj).f34083b;
                jw0Var.n1.setAlpha(animatedFraction);
                jw0Var.f36547r1.setAlpha(animatedFraction);
                if (i11 != 0) {
                    int i13 = (int) ((1.0f - animatedFraction) * i11);
                    jw0Var.X0(i10 + i13);
                    jw0Var.n1.setTranslationY(i13);
                    return;
                }
                return;
            default:
                tg.l0 l0Var = (tg.l0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f58052u1.f57335a = i0.a.f(floatValue3, i11, i10);
                l0Var.M0.invalidate();
                return;
        }
    }
}
