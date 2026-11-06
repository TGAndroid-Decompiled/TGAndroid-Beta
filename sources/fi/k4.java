package fi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.yv0;
public final class k4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12267a;
    public final int f12268b;
    public final int f12269c;
    public final Object d;

    public k4(Object obj, int i7, int i10, int i11) {
        this.f12267a = i11;
        this.d = obj;
        this.f12268b = i7;
        this.f12269c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f12267a;
        int i10 = this.f12269c;
        int i11 = this.f12268b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                o5 o5Var = (o5) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.f12531j1.f55016a = i0.a.f(floatValue, i11, i10);
                o5Var.C0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                f4Var.getClass();
                int S0 = org.telegram.messenger.g0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i11, i10);
                ch0 ch0Var = f4Var.f29107f;
                ch0Var.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.k6.H1(ch0Var.getDrawable(), S0 & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) obj;
                i6Var.getClass();
                i6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10));
                i6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i12 = ScrollSlidingTextTabStrip.f31516o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i11 * floatValue2;
                scrollSlidingTextTabStrip.f31518a0 = i10 * floatValue2;
                scrollSlidingTextTabStrip.f31517a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                yv0 yv0Var = (yv0) ((nk0) obj).f36366b;
                yv0Var.f40761j1.setAlpha(animatedFraction);
                yv0Var.n1.setAlpha(animatedFraction);
                if (i11 != 0) {
                    int i13 = (int) ((1.0f - animatedFraction) * i11);
                    yv0Var.W0(i10 + i13);
                    yv0Var.f40761j1.setTranslationY(i13);
                    return;
                }
                return;
            default:
                tg.g0 g0Var = (tg.g0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.f55600t1.f55016a = i0.a.f(floatValue3, i11, i10);
                g0Var.L0.invalidate();
                return;
        }
    }
}
