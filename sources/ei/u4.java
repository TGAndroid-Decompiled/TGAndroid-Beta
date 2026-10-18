package ei;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.xj0;
public final class u4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9891a;
    public final int f9892b;
    public final int f9893c;
    public final Object d;

    public u4(Object obj, int i10, int i11, int i12) {
        this.f9891a = i12;
        this.d = obj;
        this.f9892b = i10;
        this.f9893c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f9891a;
        int i11 = this.f9893c;
        int i12 = this.f9892b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                f6 f6Var = (f6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.A1.f44687a = i0.a.f(floatValue, i12, i11);
                f6Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) obj;
                d4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                xj0 xj0Var = d4Var.f22132f;
                xj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.h6.C1(xj0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) obj;
                p6Var.getClass();
                p6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                p6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f24347o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f24349a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f24348a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                oy0 oy0Var = (oy0) ((cn0) obj).f25318b;
                oy0Var.f29090c.setAlpha(animatedFraction);
                oy0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    oy0Var.z0(i11 + i14);
                    oy0Var.f29090c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                rg.m0 m0Var = (rg.m0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f44687a = i0.a.f(floatValue3, i12, i11);
                m0Var.f45515c1.invalidate();
                return;
        }
    }
}
