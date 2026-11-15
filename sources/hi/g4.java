package hi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.sk0;
public final class g4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14340a;
    public final int f14341b;
    public final int f14342c;
    public final Object d;

    public g4(Object obj, int i7, int i10, int i11) {
        this.f14340a = i11;
        this.d = obj;
        this.f14341b = i7;
        this.f14342c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f14340a;
        int i10 = this.f14342c;
        int i11 = this.f14341b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                m5 m5Var = (m5) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.f14676k1.f56644a = i0.a.f(floatValue, i11, i10);
                m5Var.D0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                f4Var.getClass();
                int S0 = org.telegram.messenger.g0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i11, i10);
                fh0 fh0Var = f4Var.f30224f;
                fh0Var.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.j6.H1(fh0Var.getDrawable(), S0 & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) obj;
                g6Var.getClass();
                g6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10));
                g6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i12 = ScrollSlidingTextTabStrip.f32699p0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.f32701a0 = i11 * floatValue2;
                scrollSlidingTextTabStrip.f32703b0 = i10 * floatValue2;
                scrollSlidingTextTabStrip.f32700a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                bw0 bw0Var = (bw0) ((sk0) obj).f39332b;
                bw0Var.n1.setAlpha(animatedFraction);
                bw0Var.f33419r1.setAlpha(animatedFraction);
                if (i11 != 0) {
                    int i13 = (int) ((1.0f - animatedFraction) * i11);
                    bw0Var.W0(i10 + i13);
                    bw0Var.n1.setTranslationY(i13);
                    return;
                }
                return;
            default:
                tg.g0 g0Var = (tg.g0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.f57306u1.f56644a = i0.a.f(floatValue3, i11, i10);
                g0Var.M0.invalidate();
                return;
        }
    }
}
