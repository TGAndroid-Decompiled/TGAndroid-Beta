package ai;

import android.animation.ValueAnimator;
public final class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f874a;
    public final f6 f875b;

    public e3(f6 f6Var, int i10) {
        this.f874a = i10;
        this.f875b = f6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f874a) {
            case 0:
                f6 f6Var = this.f875b;
                f6Var.getClass();
                f6Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.invalidate();
                return;
            case 1:
                f6 f6Var2 = this.f875b;
                f6Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var2.f1008t3 = floatValue;
                f6Var2.f1002r3.setTransitionProgress(floatValue);
                return;
            default:
                f6.Z(this.f875b, valueAnimator);
                return;
        }
    }
}
