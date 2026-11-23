package ki;

import android.animation.ValueAnimator;
public final class r1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18860a;
    public final s2 f18861b;

    public r1(s2 s2Var, int i7) {
        this.f18860a = i7;
        this.f18861b = s2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18860a) {
            case 0:
                s2 s2Var = this.f18861b;
                s2Var.getClass();
                s2Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.l();
                return;
            default:
                this.f18861b.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
