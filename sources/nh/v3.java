package nh;

import android.animation.ValueAnimator;

public final class v3 implements ValueAnimator.AnimatorUpdateListener {

    public final int f19006a;

    public final e4 f19007b;

    public v3(e4 e4Var, int i10) {
        this.f19006a = i10;
        this.f19007b = e4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19006a) {
            case 0:
                this.f19007b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x3 x3Var = this.f19007b.f18669n;
                if (x3Var.getWebView() != null) {
                    x3Var.getWebView().setScrollY(iIntValue);
                }
                break;
        }
    }
}
