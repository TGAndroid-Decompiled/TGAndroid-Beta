package hi;

import android.animation.ValueAnimator;
public final class w1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15021a;
    public final a3 f15022b;

    public w1(a3 a3Var, int i7) {
        this.f15021a = i7;
        this.f15022b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15021a) {
            case 0:
                a3 a3Var = this.f15022b;
                a3Var.getClass();
                a3Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.l();
                return;
            default:
                this.f15022b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
