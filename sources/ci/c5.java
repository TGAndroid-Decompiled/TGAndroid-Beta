package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.tm0;
public final class c5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4444a;
    public final int f4445b;
    public final int f4446c;
    public final Object d;

    public c5(Object obj, int i10, int i11, int i12) {
        this.f4444a = i12;
        this.d = obj;
        this.f4445b = i10;
        this.f4446c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f4444a;
        int i11 = this.f4446c;
        int i12 = this.f4445b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                q6 q6Var = (q6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f41364a = i0.a.d(floatValue, i12, i11);
                q6Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) obj;
                e4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                oj0 oj0Var = e4Var.f20250f;
                oj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.h6.B1(oj0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) obj;
                o6Var.getClass();
                o6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                o6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f22409o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f22411a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f22410a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                iy0 iy0Var = (iy0) ((tm0) obj).f28608b;
                iy0Var.f25214c.setAlpha(animatedFraction);
                iy0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    iy0Var.y0(i11 + i14);
                    iy0Var.f25214c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                qg.n0 n0Var = (qg.n0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.K1.f41364a = i0.a.d(floatValue3, i12, i11);
                n0Var.f41874c1.invalidate();
                return;
        }
    }
}
