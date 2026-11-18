package hi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.ph0;
public final class g4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14688a;
    public final int f14689b;
    public final int f14690c;
    public final Object d;

    public g4(Object obj, int i7, int i10, int i11) {
        this.f14688a = i11;
        this.d = obj;
        this.f14689b = i7;
        this.f14690c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f14688a;
        int i10 = this.f14690c;
        int i11 = this.f14689b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                l5 l5Var = (l5) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var.f14915k1.f57218a = i0.a.f(floatValue, i11, i10);
                l5Var.D0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                f4Var.getClass();
                int S0 = org.telegram.messenger.g0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i11, i10);
                ph0 ph0Var = f4Var.f30600f;
                ph0Var.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.n6.H1(ph0Var.getDrawable(), S0 & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.m6 m6Var = (org.telegram.ui.Components.m6) obj;
                m6Var.getClass();
                m6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10));
                m6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i12 = ScrollSlidingTextTabStrip.f33096p0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.f33098a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f33100b0 = i10 * floatValue2;
                scrollSlidingTextTabStrip.f33097a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                iw0 iw0Var = (iw0) ((al0) obj).f33363b;
                iw0Var.n1.setAlpha(animatedFraction);
                iw0Var.f36253r1.setAlpha(animatedFraction);
                if (i11 != 0) {
                    int i13 = (int) ((1.0f - animatedFraction) * i11);
                    iw0Var.X0(i10 + i13);
                    iw0Var.n1.setTranslationY(i13);
                    return;
                }
                return;
            default:
                tg.g0 g0Var = (tg.g0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.f57878u1.f57218a = i0.a.f(floatValue3, i11, i10);
                g0Var.M0.invalidate();
                return;
        }
    }
}
