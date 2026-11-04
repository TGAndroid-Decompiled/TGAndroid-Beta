package ii;

import android.animation.ValueAnimator;
public final class t3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15240a;
    public final d4 f15241b;

    public t3(d4 d4Var, int i3) {
        this.f15240a = i3;
        this.f15241b = d4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15240a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                s2 s2Var = this.f15241b.f14898n;
                if (s2Var.getWebView() != null) {
                    s2Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
            default:
                this.f15241b.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
