package jg;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.sl0;
import vh.b4;
public final class a0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9875a;
    public final int f9876b;
    public final int f9877c;
    public final Object d;

    public a0(Object obj, int i10, int i11, int i12) {
        this.f9875a = i12;
        this.d = obj;
        this.f9876b = i10;
        this.f9877c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f9875a;
        int i11 = this.f9877c;
        int i12 = this.f9876b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                r0 r0Var = (r0) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.f10192t1.f8433a = i0.b.f(floatValue, i12, i11);
                r0Var.L0.invalidate();
                return;
            case 1:
                h4 h4Var = (h4) obj;
                h4Var.getClass();
                int S0 = org.telegram.messenger.i0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i12, i11);
                fi0 fi0Var = h4Var.f21981f;
                fi0Var.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.SRC_IN));
                t6.H1(fi0Var.getDrawable(), S0 & 620756991, true);
                return;
            case 2:
                e6 e6Var = (e6) obj;
                e6Var.getClass();
                e6Var.u(i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                e6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f24165o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f24167a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f24166a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                dx0 dx0Var = (dx0) ((sl0) obj).f30331b;
                dx0Var.f25619j1.setAlpha(animatedFraction);
                dx0Var.f25626n1.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    dx0Var.W0(i11 + i14);
                    dx0Var.f25619j1.setTranslationY(i14);
                    return;
                }
                return;
            default:
                b4 b4Var = (b4) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.f50978j1.f8433a = i0.b.f(floatValue3, i12, i11);
                b4Var.C0.invalidate();
                return;
        }
    }
}
