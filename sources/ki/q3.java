package ki;

import android.animation.ValueAnimator;
public final class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18510a;
    public final y3 f18511b;

    public q3(y3 y3Var, int i7) {
        this.f18510a = i7;
        this.f18511b = y3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18510a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p2 p2Var = this.f18511b.f18715n;
                if (p2Var.getWebView() != null) {
                    p2Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
            default:
                this.f18511b.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
