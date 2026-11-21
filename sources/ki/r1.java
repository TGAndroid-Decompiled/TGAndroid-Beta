package ki;

import android.animation.ValueAnimator;
public final class r1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18891a;
    public final s2 f18892b;

    public r1(s2 s2Var, int i7) {
        this.f18891a = i7;
        this.f18892b = s2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18891a) {
            case 0:
                s2 s2Var = this.f18892b;
                s2Var.getClass();
                s2Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.l();
                return;
            default:
                this.f18892b.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
