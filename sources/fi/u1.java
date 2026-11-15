package fi;

import android.animation.ValueAnimator;
public final class u1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12394a;
    public final b4 f12395b;

    public u1(b4 b4Var, int i7) {
        this.f12394a = i7;
        this.f12395b = b4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12394a) {
            case 0:
                b4 b4Var = this.f12395b;
                b4Var.getClass();
                b4Var.f11516r2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.invalidate();
                return;
            case 1:
                b4 b4Var2 = this.f12395b;
                b4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var2.f11467d3 = floatValue;
                b4Var2.f11462b3.setTransitionProgress(floatValue);
                return;
            default:
                b4.X(this.f12395b, valueAnimator);
                return;
        }
    }
}
