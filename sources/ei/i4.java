package ei;

import android.animation.ValueAnimator;
public final class i4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9098a;
    public final r4 f9099b;

    public i4(r4 r4Var, int i10) {
        this.f9098a = i10;
        this.f9099b = r4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9098a) {
            case 0:
                this.f9099b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k4 k4Var = this.f9099b.f9306n;
                if (k4Var.getWebView() != null) {
                    k4Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
