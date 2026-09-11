package bi;

import android.animation.ValueAnimator;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3620a;
    public final o5 f3621b;

    public r2(o5 o5Var, int i10) {
        this.f3620a = i10;
        this.f3621b = o5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3620a) {
            case 0:
                o5 o5Var = this.f3621b;
                o5Var.getClass();
                o5Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.invalidate();
                return;
            case 1:
                o5 o5Var2 = this.f3621b;
                o5Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var2.f3462t3 = floatValue;
                o5Var2.f3456r3.setTransitionProgress(floatValue);
                return;
            default:
                o5.Z(this.f3621b, valueAnimator);
                return;
        }
    }
}
