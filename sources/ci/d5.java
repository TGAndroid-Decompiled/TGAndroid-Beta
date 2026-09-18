package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.rm0;
public final class d5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4500a;
    public final int f4501b;
    public final int f4502c;
    public final Object d;

    public d5(Object obj, int i10, int i11, int i12) {
        this.f4500a = i12;
        this.d = obj;
        this.f4501b = i10;
        this.f4502c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f4500a;
        int i11 = this.f4502c;
        int i12 = this.f4501b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                r6 r6Var = (r6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.A1.f41242a = i0.a.d(floatValue, i12, i11);
                r6Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) obj;
                e4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                lj0 lj0Var = e4Var.f20197f;
                lj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.j6.B1(lj0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) obj;
                o6Var.getClass();
                o6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                o6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f22351o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f22353a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f22352a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                hy0 hy0Var = (hy0) ((rm0) obj).f27933b;
                hy0Var.f24755c.setAlpha(animatedFraction);
                hy0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    hy0Var.y0(i11 + i14);
                    hy0Var.f24755c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                qg.m0 m0Var = (qg.m0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f41242a = i0.a.d(floatValue3, i12, i11);
                m0Var.f41740c1.invalidate();
                return;
        }
    }
}
