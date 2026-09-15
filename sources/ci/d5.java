package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.vx0;
public final class d5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4495a;
    public final int f4496b;
    public final int f4497c;
    public final Object d;

    public d5(Object obj, int i10, int i11, int i12) {
        this.f4495a = i12;
        this.d = obj;
        this.f4496b = i10;
        this.f4497c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f4495a;
        int i11 = this.f4497c;
        int i12 = this.f4496b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                r6 r6Var = (r6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.A1.f40970a = i0.a.d(floatValue, i12, i11);
                r6Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) obj;
                d4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                aj0 aj0Var = d4Var.f19916f;
                aj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.i6.B1(aj0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.m6 m6Var = (org.telegram.ui.Components.m6) obj;
                m6Var.getClass();
                m6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                m6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f22165o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f22167a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f22166a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                vx0 vx0Var = (vx0) ((em0) obj).f23694b;
                vx0Var.f29457c.setAlpha(animatedFraction);
                vx0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    vx0Var.y0(i11 + i14);
                    vx0Var.f29457c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                qg.p0 p0Var = (qg.p0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.K1.f40970a = i0.a.d(floatValue3, i12, i11);
                p0Var.f41518c1.invalidate();
                return;
        }
    }
}
