package ki;

import android.animation.ValueAnimator;
public final class l3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18766a;
    public final t3 f18767b;

    public l3(t3 t3Var, int i7) {
        this.f18766a = i7;
        this.f18767b = t3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18766a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                l2 l2Var = this.f18767b.f18958n;
                if (l2Var.getWebView() != null) {
                    l2Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
            default:
                this.f18767b.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
