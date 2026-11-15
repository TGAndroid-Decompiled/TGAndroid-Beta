package ki;

import android.animation.ValueAnimator;
public final class w1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18632a;
    public final x2 f18633b;

    public w1(x2 x2Var, int i7) {
        this.f18632a = i7;
        this.f18633b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18632a) {
            case 0:
                x2 x2Var = this.f18633b;
                x2Var.getClass();
                x2Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.l();
                return;
            default:
                this.f18633b.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
