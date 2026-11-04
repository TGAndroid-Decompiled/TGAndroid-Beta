package ii;

import android.animation.ValueAnimator;
public final class w1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15302a;
    public final a3 f15303b;

    public w1(a3 a3Var, int i3) {
        this.f15302a = i3;
        this.f15303b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15302a) {
            case 0:
                a3 a3Var = this.f15303b;
                a3Var.getClass();
                a3Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.l();
                return;
            default:
                this.f15303b.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
