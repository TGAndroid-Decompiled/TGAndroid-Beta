package fi;

import android.animation.ValueAnimator;
public final class s1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12556a;
    public final z3 f12557b;

    public s1(z3 z3Var, int i7) {
        this.f12556a = i7;
        this.f12557b = z3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12556a) {
            case 0:
                z3 z3Var = this.f12557b;
                z3Var.getClass();
                z3Var.f12907r2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var.invalidate();
                return;
            case 1:
                z3 z3Var2 = this.f12557b;
                z3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var2.f12858d3 = floatValue;
                z3Var2.f12853b3.setTransitionProgress(floatValue);
                return;
            default:
                z3.X(this.f12557b, valueAnimator);
                return;
        }
    }
}
