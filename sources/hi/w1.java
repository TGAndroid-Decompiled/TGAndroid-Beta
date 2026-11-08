package hi;

import android.animation.ValueAnimator;
public final class w1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15019a;
    public final a3 f15020b;

    public w1(a3 a3Var, int i7) {
        this.f15019a = i7;
        this.f15020b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15019a) {
            case 0:
                a3 a3Var = this.f15020b;
                a3Var.getClass();
                a3Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.l();
                return;
            default:
                this.f15020b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
