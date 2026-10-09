package ei;

import android.animation.ValueAnimator;
public final class h4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9098a;
    public final p4 f9099b;

    public h4(p4 p4Var, int i10) {
        this.f9098a = i10;
        this.f9099b = p4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9098a) {
            case 0:
                this.f9099b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3 b3Var = this.f9099b.f9292n;
                if (b3Var.getWebView() != null) {
                    b3Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
