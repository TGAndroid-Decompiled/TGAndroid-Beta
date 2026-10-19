package gi;

import android.animation.ValueAnimator;
public final class x3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11545a;
    public final f4 f11546b;

    public x3(f4 f4Var, int i10) {
        this.f11545a = i10;
        this.f11546b = f4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11545a) {
            case 0:
                this.f11546b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2 v2Var = this.f11546b.f11208n;
                if (v2Var.getWebView() != null) {
                    v2Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
