package eg;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.e4;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.xx0;
import qh.a5;
public final class e0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5166a;
    public final int f5167b;
    public final int f5168c;
    public final Object d;

    public e0(Object obj, int i10, int i11, int i12) {
        this.f5166a = i12;
        this.d = obj;
        this.f5167b = i10;
        this.f5168c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f5166a;
        int i11 = this.f5168c;
        int i12 = this.f5167b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                c1 c1Var = (c1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.H1.f4524a = i0.a.d(floatValue, i12, i11);
                c1Var.Z0.invalidate();
                return;
            case 1:
                e4 e4Var = (e4) obj;
                e4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                kj0 kj0Var = e4Var.f22748f;
                kj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                k6.B1(kj0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                j6 j6Var = (j6) obj;
                j6Var.getClass();
                j6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                j6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f25011l0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.T = i12 * floatValue2;
                scrollSlidingTextTabStrip.U = i11 * floatValue2;
                scrollSlidingTextTabStrip.f25012a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                xx0 xx0Var = (xx0) ((mm0) obj).f29180b;
                xx0Var.f33223c.setAlpha(animatedFraction);
                xx0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    xx0Var.y0(i11 + i14);
                    xx0Var.f33223c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                a5 a5Var = (a5) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5Var.f44966x1.f4524a = i0.a.d(floatValue3, i12, i11);
                a5Var.Q0.invalidate();
                return;
        }
    }
}
