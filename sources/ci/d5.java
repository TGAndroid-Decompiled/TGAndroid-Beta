package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.sm0;
public final class d5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4499a;
    public final int f4500b;
    public final int f4501c;
    public final Object d;

    public d5(Object obj, int i10, int i11, int i12) {
        this.f4499a = i12;
        this.d = obj;
        this.f4500b = i10;
        this.f4501c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f4499a;
        int i11 = this.f4501c;
        int i12 = this.f4500b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                r6 r6Var = (r6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.A1.f41314a = i0.a.d(floatValue, i12, i11);
                r6Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                f4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                nj0 nj0Var = f4Var.f20294f;
                nj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.j6.B1(nj0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) obj;
                n6Var.getClass();
                n6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                n6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f22402o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f22404a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f22403a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                iy0 iy0Var = (iy0) ((sm0) obj).f28278b;
                iy0Var.f25199c.setAlpha(animatedFraction);
                iy0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    iy0Var.y0(i11 + i14);
                    iy0Var.f25199c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                qg.n0 n0Var = (qg.n0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.K1.f41314a = i0.a.d(floatValue3, i12, i11);
                n0Var.f41808c1.invalidate();
                return;
        }
    }
}
