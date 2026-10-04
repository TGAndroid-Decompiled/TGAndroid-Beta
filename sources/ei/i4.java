package ei;

import android.animation.ValueAnimator;
public final class i4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9099a;
    public final r4 f9100b;

    public i4(r4 r4Var, int i10) {
        this.f9099a = i10;
        this.f9100b = r4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9099a) {
            case 0:
                this.f9100b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k4 k4Var = this.f9100b.f9307n;
                if (k4Var.getWebView() != null) {
                    k4Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
