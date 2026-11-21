package ki;

import android.animation.ValueAnimator;
public final class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18773a;
    public final s3 f18774b;

    public k3(s3 s3Var, int i7) {
        this.f18773a = i7;
        this.f18774b = s3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18773a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k2 k2Var = this.f18774b.f18965n;
                if (k2Var.getWebView() != null) {
                    k2Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
            default:
                this.f18774b.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
