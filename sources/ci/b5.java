package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.zy0;
public final class b5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4752a;
    public final int f4753b;
    public final int f4754c;
    public final Object d;

    public b5(Object obj, int i10, int i11, int i12) {
        this.f4752a = i12;
        this.d = obj;
        this.f4753b = i10;
        this.f4754c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f4752a;
        int i11 = this.f4754c;
        int i12 = this.f4753b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                q6 q6Var = (q6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f45812a = i0.a.d(floatValue, i12, i11);
                q6Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) obj;
                e4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                hk0 hk0Var = e4Var.f22023f;
                hk0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.h6.C1(hk0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.q6 q6Var2 = (org.telegram.ui.Components.q6) obj;
                q6Var2.getClass();
                q6Var2.u(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                q6Var2.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f24295o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f24297a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f24296a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                zy0 zy0Var = (zy0) ((mn0) obj).f28805b;
                zy0Var.f33691c.setAlpha(animatedFraction);
                zy0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    zy0Var.z0(i11 + i14);
                    zy0Var.f33691c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                qg.m0 m0Var = (qg.m0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f45812a = i0.a.d(floatValue3, i12, i11);
                m0Var.f46458c1.invalidate();
                return;
        }
    }
}
