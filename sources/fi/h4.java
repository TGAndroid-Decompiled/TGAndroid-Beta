package fi;

import android.animation.ValueAnimator;
public final class h4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9707a;
    public final r4 f9708b;

    public h4(r4 r4Var, int i10) {
        this.f9707a = i10;
        this.f9708b = r4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9707a) {
            case 0:
                this.f9708b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k4 k4Var = this.f9708b.f9930n;
                if (k4Var.getWebView() != null) {
                    k4Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
