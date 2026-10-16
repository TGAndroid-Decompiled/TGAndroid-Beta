package fi;

import android.animation.ValueAnimator;
public final class i4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9325a;
    public final q4 f9326b;

    public i4(q4 q4Var, int i10) {
        this.f9325a = i10;
        this.f9326b = q4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9325a) {
            case 0:
                this.f9326b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3 b3Var = this.f9326b.f9498n;
                if (b3Var.getWebView() != null) {
                    b3Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
