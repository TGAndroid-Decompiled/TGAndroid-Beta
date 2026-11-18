package ki;

import android.animation.ValueAnimator;
public final class l3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18763a;
    public final t3 f18764b;

    public l3(t3 t3Var, int i7) {
        this.f18763a = i7;
        this.f18764b = t3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18763a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                l2 l2Var = this.f18764b.f18955n;
                if (l2Var.getWebView() != null) {
                    l2Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
            default:
                this.f18764b.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
