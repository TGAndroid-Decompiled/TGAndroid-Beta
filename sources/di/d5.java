package di;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.ux0;
public final class d5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f7064a;
    public final int f7065b;
    public final int f7066c;
    public final Object d;

    public d5(Object obj, int i10, int i11, int i12) {
        this.f7064a = i12;
        this.d = obj;
        this.f7065b = i10;
        this.f7066c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f7064a;
        int i11 = this.f7066c;
        int i12 = this.f7065b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                q6 q6Var = (q6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f44541a = i0.a.d(floatValue, i12, i11);
                q6Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) obj;
                d4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                aj0 aj0Var = d4Var.f21737f;
                aj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.j6.B1(aj0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) obj;
                p6Var.getClass();
                p6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                p6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f24113o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f24115a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f24114a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ux0 ux0Var = (ux0) ((em0) obj).f25734b;
                ux0Var.f30994c.setAlpha(animatedFraction);
                ux0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    ux0Var.y0(i11 + i14);
                    ux0Var.f30994c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                rg.o0 o0Var = (rg.o0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.K1.f44541a = i0.a.d(floatValue3, i12, i11);
                o0Var.f45341c1.invalidate();
                return;
        }
    }
}
