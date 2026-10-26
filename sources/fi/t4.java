package fi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.ln0;
public final class t4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11705a;
    public final int f11706b;
    public final int f11707c;
    public final Object d;

    public t4(Object obj, int i10, int i11, int i12) {
        this.f11705a = i12;
        this.d = obj;
        this.f11706b = i10;
        this.f11707c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f11705a;
        int i11 = this.f11707c;
        int i12 = this.f11706b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                e6 e6Var = (e6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.f10807p1.f47525a = i0.a.f(floatValue, i12, i11);
                e6Var.I0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) obj;
                i4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                ak0 ak0Var = i4Var.f24229f;
                ak0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.y6.E1(ak0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) obj;
                r6Var.getClass();
                r6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                r6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f26283o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f26285a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f26284a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                cz0 cz0Var = (cz0) ((ln0) obj).f30234b;
                cz0Var.f27291c.setAlpha(animatedFraction);
                cz0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    cz0Var.A0(i11 + i14);
                    cz0Var.f27291c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                sg.n0 n0Var = (sg.n0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.f48369z1.f47525a = i0.a.f(floatValue3, i12, i11);
                n0Var.R0.invalidate();
                return;
        }
    }
}
