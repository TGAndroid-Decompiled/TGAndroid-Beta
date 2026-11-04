package gi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.xv0;
public final class h4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12874a;
    public final int f12875b;
    public final int f12876c;
    public final Object d;

    public h4(Object obj, int i3, int i10, int i11) {
        this.f12874a = i11;
        this.d = obj;
        this.f12875b = i3;
        this.f12876c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.f12874a;
        int i10 = this.f12876c;
        int i11 = this.f12875b;
        Object obj = this.d;
        switch (i3) {
            case 0:
                m5 m5Var = (m5) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.k1.f55186a = i0.a.f(floatValue, i11, i10);
                m5Var.D0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                f4Var.getClass();
                int S0 = org.telegram.messenger.g0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i11, i10);
                fh0 fh0Var = f4Var.f29165f;
                fh0Var.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.k6.H1(fh0Var.getDrawable(), S0 & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) obj;
                g6Var.getClass();
                g6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10));
                g6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i12 = ScrollSlidingTextTabStrip.f31592p0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.f31594a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f31596b0 = i10 * floatValue2;
                scrollSlidingTextTabStrip.f31593a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                xv0 xv0Var = (xv0) ((rk0) obj).f37747b;
                xv0Var.k1.setAlpha(animatedFraction);
                xv0Var.f40522o1.setAlpha(animatedFraction);
                if (i11 != 0) {
                    int i13 = (int) ((1.0f - animatedFraction) * i11);
                    xv0Var.W0(i10 + i13);
                    xv0Var.k1.setTranslationY(i13);
                    return;
                }
                return;
            default:
                ug.f0 f0Var = (ug.f0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.f55992u1.f55186a = i0.a.f(floatValue3, i11, i10);
                f0Var.M0.invalidate();
                return;
        }
    }
}
