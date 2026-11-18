package ki;

import android.animation.ValueAnimator;
public final class s1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18884a;
    public final t2 f18885b;

    public s1(t2 t2Var, int i7) {
        this.f18884a = i7;
        this.f18885b = t2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18884a) {
            case 0:
                t2 t2Var = this.f18885b;
                t2Var.getClass();
                t2Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.l();
                return;
            default:
                this.f18885b.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
