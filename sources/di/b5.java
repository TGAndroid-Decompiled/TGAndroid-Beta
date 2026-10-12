package di;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.ty0;
public final class b5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6655a;
    public final int f6656b;
    public final int f6657c;
    public final Object d;

    public b5(Object obj, int i10, int i11, int i12) {
        this.f6655a = i12;
        this.d = obj;
        this.f6656b = i10;
        this.f6657c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f6655a;
        int i11 = this.f6657c;
        int i12 = this.f6656b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                o6 o6Var = (o6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.A1.f43543a = i0.a.d(floatValue, i12, i11);
                o6Var.T0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) obj;
                e4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                bk0 bk0Var = e4Var.f21105f;
                bk0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.g6.C1(bk0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) obj;
                r6Var.getClass();
                r6Var.u(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                r6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f23285o0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue2;
                scrollSlidingTextTabStrip.f23287a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f23286a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ty0 ty0Var = (ty0) ((gn0) obj).f25369b;
                ty0Var.f29504c.setAlpha(animatedFraction);
                ty0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    ty0Var.z0(i11 + i14);
                    ty0Var.f29504c.setTranslationY(i14);
                    return;
                }
                return;
            default:
                rg.o0 o0Var = (rg.o0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.K1.f43543a = i0.a.d(floatValue3, i12, i11);
                o0Var.f44403c1.invalidate();
                return;
        }
    }
}
