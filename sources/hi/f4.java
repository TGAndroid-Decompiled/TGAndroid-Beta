package hi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.rh0;
public final class f4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14640a;
    public final int f14641b;
    public final int f14642c;
    public final Object d;

    public f4(Object obj, int i7, int i10, int i11) {
        this.f14640a = i11;
        this.d = obj;
        this.f14641b = i7;
        this.f14642c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f14640a;
        int i10 = this.f14642c;
        int i11 = this.f14641b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                k5 k5Var = (k5) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var.f14890k1.f57263a = i0.a.f(floatValue, i11, i10);
                k5Var.D0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) obj;
                g4Var.getClass();
                int S0 = org.telegram.messenger.g0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i11, i10);
                rh0 rh0Var = g4Var.f30690f;
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
                int i12 = ScrollSlidingTextTabStrip.f33132p0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.f33134a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f33136b0 = i10 * floatValue2;
                scrollSlidingTextTabStrip.f33133a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                kw0 kw0Var = (kw0) ((cl0) obj).f34216b;
                kw0Var.n1.setAlpha(animatedFraction);
                kw0Var.f37025r1.setAlpha(animatedFraction);
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
                h0Var.f57936u1.f57263a = i0.a.f(floatValue3, i11, i10);
                h0Var.M0.invalidate();
                return;
        }
    }
}
