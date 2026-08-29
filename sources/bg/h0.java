package bg;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nx0;
public final class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f2278a;
    public final int f2279b;
    public final int f2280c;
    public final Object d;

    public h0(Object obj, int i10, int i11, int i12) {
        this.f2278a = i12;
        this.d = obj;
        this.f2279b = i10;
        this.f2280c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f2278a;
        int i11 = this.f2280c;
        int i12 = this.f2279b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                g1 g1Var = (g1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.G1.f571a = i0.a.d(floatValue, i12, i11);
                g1Var.Y0.invalidate();
                return;
            case 1:
                t5 t5Var = (t5) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5Var.f18665w1.f571a = i0.a.d(floatValue2, i12, i11);
                t5Var.P0.invalidate();
                return;
            case 2:
                org.telegram.ui.Cells.c4 c4Var = (org.telegram.ui.Cells.c4) obj;
                c4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                aj0 aj0Var = c4Var.f24157f;
                aj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                g6.B1(aj0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 3:
                n6 n6Var = (n6) obj;
                n6Var.getClass();
                n6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                n6Var.invalidateSelf();
                return;
            case 4:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f26522k0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.S = i12 * floatValue3;
                scrollSlidingTextTabStrip.T = i11 * floatValue3;
                scrollSlidingTextTabStrip.f26523a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            default:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                nx0 nx0Var = (nx0) ((cm0) obj).f27510b;
                nx0Var.f31171c.setAlpha(animatedFraction);
                nx0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    nx0Var.y0(i11 + i14);
                    nx0Var.f31171c.setTranslationY(i14);
                    return;
                }
                return;
        }
    }
}
