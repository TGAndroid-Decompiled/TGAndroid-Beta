package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.yy0;
public final class b5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4753a;
    public final int f4754b;
    public final int f4755c;
    public final Object d;

    public b5(Object obj, int i10, int i11, int i12) {
        this.f4753a = i12;
        this.d = obj;
        this.f4754b = i10;
        this.f4755c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f4753a;
        int i11 = this.f4755c;
        int i12 = this.f4754b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                q6 q6Var = (q6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f45822a = i0.a.d(floatValue, i12, i11);
                q6Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) obj;
                e4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                gk0 gk0Var = e4Var.f22035f;
                gk0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.i6.C1(gk0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.q6 q6Var2 = (org.telegram.ui.Components.q6) obj;
                q6Var2.getClass();
                q6Var2.u(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                q6Var2.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f24307o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f24309a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f24308a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                yy0 yy0Var = (yy0) ((ln0) obj).f28432b;
                yy0Var.f33423c.setAlpha(animatedFraction);
                yy0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    yy0Var.z0(i11 + i14);
                    yy0Var.f33423c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                qg.m0 m0Var = (qg.m0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f45822a = i0.a.d(floatValue3, i12, i11);
                m0Var.f46407c1.invalidate();
                return;
        }
    }
}
