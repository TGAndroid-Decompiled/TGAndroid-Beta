package ei;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.ty0;
public final class u4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9904a;
    public final int f9905b;
    public final int f9906c;
    public final Object d;

    public u4(Object obj, int i10, int i11, int i12) {
        this.f9904a = i12;
        this.d = obj;
        this.f9905b = i10;
        this.f9906c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f9904a;
        int i11 = this.f9906c;
        int i12 = this.f9905b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                f6 f6Var = (f6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.A1.f45066a = i0.a.f(floatValue, i12, i11);
                f6Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) obj;
                d4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                bk0 bk0Var = d4Var.f22266f;
                bk0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.k6.E1(bk0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) obj;
                p6Var.getClass();
                p6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                p6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f24490o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f24492a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f24491a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ty0 ty0Var = (ty0) ((gn0) obj).f26682b;
                ty0Var.f30930c.setAlpha(animatedFraction);
                ty0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    ty0Var.A0(i11 + i14);
                    ty0Var.f30930c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                rg.m0 m0Var = (rg.m0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f45066a = i0.a.f(floatValue3, i12, i11);
                m0Var.f45886c1.invalidate();
                return;
        }
    }
}
