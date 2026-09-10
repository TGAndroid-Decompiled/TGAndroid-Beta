package di;

import android.animation.ValueAnimator;
public final class l4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6751a;
    public final u4 f6752b;

    public l4(u4 u4Var, int i10) {
        this.f6751a = i10;
        this.f6752b = u4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6751a) {
            case 0:
                this.f6752b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n4 n4Var = this.f6752b.f6947n;
                if (n4Var.getWebView() != null) {
                    n4Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
