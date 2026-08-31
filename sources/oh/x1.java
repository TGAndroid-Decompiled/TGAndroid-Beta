package oh;

import android.animation.ValueAnimator;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f17922a;
    public final f4 f17923b;

    public x1(f4 f4Var, int i10) {
        this.f17922a = i10;
        this.f17923b = f4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17922a) {
            case 0:
                f4 f4Var = this.f17923b;
                f4Var.getClass();
                f4Var.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.invalidate();
                return;
            case 1:
                f4 f4Var2 = this.f17923b;
                f4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var2.f17100q3 = floatValue;
                f4Var2.f17094o3.setTransitionProgress(floatValue);
                return;
            default:
                f4.Z(this.f17923b, valueAnimator);
                return;
        }
    }
}
