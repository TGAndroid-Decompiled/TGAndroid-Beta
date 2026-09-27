package ei;

import android.animation.ValueAnimator;
public final class h4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8363a;
    public final q4 f8364b;

    public h4(q4 q4Var, int i10) {
        this.f8363a = i10;
        this.f8364b = q4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8363a) {
            case 0:
                this.f8364b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j4 j4Var = this.f8364b.f8555n;
                if (j4Var.getWebView() != null) {
                    j4Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
