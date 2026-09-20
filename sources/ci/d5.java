package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.qm0;
public final class d5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4501a;
    public final int f4502b;
    public final int f4503c;
    public final Object d;

    public d5(Object obj, int i10, int i11, int i12) {
        this.f4501a = i12;
        this.d = obj;
        this.f4502b = i10;
        this.f4503c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f4501a;
        int i11 = this.f4503c;
        int i12 = this.f4502b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                r6 r6Var = (r6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.A1.f41283a = i0.a.d(floatValue, i12, i11);
                r6Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                f4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                kj0 kj0Var = f4Var.f20279f;
                kj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.j6.B1(kj0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) obj;
                n6Var.getClass();
                n6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                n6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f22386o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f22388a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f22387a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                gy0 gy0Var = (gy0) ((qm0) obj).f27614b;
                gy0Var.f24479c.setAlpha(animatedFraction);
                gy0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    gy0Var.y0(i11 + i14);
                    gy0Var.f24479c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                qg.n0 n0Var = (qg.n0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.K1.f41283a = i0.a.d(floatValue3, i12, i11);
                n0Var.f41787c1.invalidate();
                return;
        }
    }
}
