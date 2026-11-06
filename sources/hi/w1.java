package hi;

import android.animation.ValueAnimator;
public final class w1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15016a;
    public final a3 f15017b;

    public w1(a3 a3Var, int i7) {
        this.f15016a = i7;
        this.f15017b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15016a) {
            case 0:
                a3 a3Var = this.f15017b;
                a3Var.getClass();
                a3Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.l();
                return;
            default:
                this.f15017b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
