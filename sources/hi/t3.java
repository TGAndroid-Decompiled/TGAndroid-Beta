package hi;

import android.animation.ValueAnimator;
public final class t3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14960a;
    public final c4 f14961b;

    public t3(c4 c4Var, int i7) {
        this.f14960a = i7;
        this.f14961b = c4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14960a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                s2 s2Var = this.f14961b.f14592n;
                if (s2Var.getWebView() != null) {
                    s2Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
            default:
                this.f14961b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
