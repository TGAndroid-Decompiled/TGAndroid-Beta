package fi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.mn0;
public final class t4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11704a;
    public final int f11705b;
    public final int f11706c;
    public final Object d;

    public t4(Object obj, int i10, int i11, int i12) {
        this.f11704a = i12;
        this.d = obj;
        this.f11705b = i10;
        this.f11706c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f11704a;
        int i11 = this.f11706c;
        int i12 = this.f11705b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                e6 e6Var = (e6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.f10806p1.f47560a = i0.a.f(floatValue, i12, i11);
                e6Var.I0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) obj;
                i4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                bk0 bk0Var = i4Var.f24231f;
                bk0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.y6.E1(bk0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) obj;
                r6Var.getClass();
                r6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                r6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f26285o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f26287a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f26286a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                dz0 dz0Var = (dz0) ((mn0) obj).f30564b;
                dz0Var.f27581c.setAlpha(animatedFraction);
                dz0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    dz0Var.A0(i11 + i14);
                    dz0Var.f27581c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                sg.m0 m0Var = (sg.m0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f48395z1.f47560a = i0.a.f(floatValue3, i12, i11);
                m0Var.R0.invalidate();
                return;
        }
    }
}
