package ai;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f704a;
    public final e6 f705b;

    public d3(e6 e6Var, int i10) {
        this.f704a = i10;
        this.f705b = e6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f704a) {
            case 0:
                e6 e6Var = this.f705b;
                e6Var.getClass();
                e6Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.invalidate();
                return;
            case 1:
                e6 e6Var2 = this.f705b;
                e6Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var2.f829t3 = floatValue;
                e6Var2.f823r3.setTransitionProgress(floatValue);
                return;
            default:
                e6.Z(this.f705b, valueAnimator);
                return;
        }
    }
}
