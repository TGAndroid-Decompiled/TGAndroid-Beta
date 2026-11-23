package ki;

import android.animation.ValueAnimator;
public final class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18776a;
    public final s3 f18777b;

    public k3(s3 s3Var, int i7) {
        this.f18776a = i7;
        this.f18777b = s3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18776a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k2 k2Var = this.f18777b.f18968n;
                if (k2Var.getWebView() != null) {
                    k2Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
            default:
                this.f18777b.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
