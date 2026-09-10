package bi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.om0;
public final class z5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4004a;
    public final int f4005b;
    public final int f4006c;
    public final Object d;

    public z5(Object obj, int i10, int i11, int i12) {
        this.f4004a = i12;
        this.d = obj;
        this.f4005b = i10;
        this.f4006c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f4004a;
        int i11 = this.f4006c;
        int i12 = this.f4005b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                r7 r7Var = (r7) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.A1.f14534a = i0.a.d(floatValue, i12, i11);
                r7Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) obj;
                d4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                kj0 kj0Var = d4Var.f18990f;
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
                int i13 = ScrollSlidingTextTabStrip.f21250o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f21252a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f21251a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                hy0 hy0Var = (hy0) ((om0) obj).f25843b;
                hy0Var.f23806c.setAlpha(animatedFraction);
                hy0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    hy0Var.y0(i11 + i14);
                    hy0Var.f23806c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                pg.m0 m0Var = (pg.m0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f14534a = i0.a.d(floatValue3, i12, i11);
                m0Var.f40126c1.invalidate();
                return;
        }
    }
}
