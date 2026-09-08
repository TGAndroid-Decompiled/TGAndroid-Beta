package fi;

import android.animation.ValueAnimator;
public final class h4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9735a;
    public final r4 f9736b;

    public h4(r4 r4Var, int i10) {
        this.f9735a = i10;
        this.f9736b = r4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9735a) {
            case 0:
                this.f9736b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k4 k4Var = this.f9736b.f9958n;
                if (k4Var.getWebView() != null) {
                    k4Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
