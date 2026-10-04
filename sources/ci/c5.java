package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.wm0;
public final class c5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4805a;
    public final int f4806b;
    public final int f4807c;
    public final Object d;

    public c5(Object obj, int i10, int i11, int i12) {
        this.f4805a = i12;
        this.d = obj;
        this.f4806b = i10;
        this.f4807c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f4805a;
        int i11 = this.f4807c;
        int i12 = this.f4806b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                q6 q6Var = (q6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f44638a = i0.a.d(floatValue, i12, i11);
                q6Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) obj;
                e4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                nj0 nj0Var = e4Var.f22029f;
                nj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.i6.B1(nj0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) obj;
                o6Var.getClass();
                o6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                o6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f24304o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f24306a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f24305a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                qy0 qy0Var = (qy0) ((wm0) obj).f32589b;
                qy0Var.f30195c.setAlpha(animatedFraction);
                qy0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    qy0Var.y0(i11 + i14);
                    qy0Var.f30195c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                qg.m0 m0Var = (qg.m0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f44638a = i0.a.d(floatValue3, i12, i11);
                m0Var.f45166c1.invalidate();
                return;
        }
    }
}
