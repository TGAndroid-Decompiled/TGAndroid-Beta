package ei;

import android.animation.ValueAnimator;
public final class h4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9097a;
    public final p4 f9098b;

    public h4(p4 p4Var, int i10) {
        this.f9097a = i10;
        this.f9098b = p4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9097a) {
            case 0:
                this.f9098b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3 b3Var = this.f9098b.f9291n;
                if (b3Var.getWebView() != null) {
                    b3Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
