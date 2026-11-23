package ki;

import android.animation.ValueAnimator;
public final class l3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18870a;
    public final t3 f18871b;

    public l3(t3 t3Var, int i7) {
        this.f18870a = i7;
        this.f18871b = t3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18870a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k2 k2Var = this.f18871b.f19053n;
                if (k2Var.getWebView() != null) {
                    k2Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
            default:
                this.f18871b.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
