package gi;

import android.animation.ValueAnimator;
public final class x3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11572a;
    public final f4 f11573b;

    public x3(f4 f4Var, int i10) {
        this.f11572a = i10;
        this.f11573b = f4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11572a) {
            case 0:
                this.f11573b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2 v2Var = this.f11573b.f11230n;
                if (v2Var.getWebView() != null) {
                    v2Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
