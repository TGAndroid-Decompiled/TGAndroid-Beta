package mh;

import android.animation.ValueAnimator;
public final class x3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18202a;
    public final g4 f18203b;

    public x3(g4 g4Var, int i9) {
        this.f18202a = i9;
        this.f18203b = g4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18202a) {
            case 0:
                this.f18203b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z3 z3Var = this.f18203b.f17861n;
                if (z3Var.getWebView() != null) {
                    z3Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
