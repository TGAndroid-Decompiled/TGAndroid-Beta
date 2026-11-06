package di;

import android.animation.ValueAnimator;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9917a;
    public final i4 f9918b;

    public x1(i4 i4Var, int i7) {
        this.f9917a = i7;
        this.f9918b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9917a) {
            case 0:
                i4 i4Var = this.f9918b;
                i4Var.getClass();
                i4Var.f9186q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                return;
            case 1:
                i4 i4Var2 = this.f9918b;
                i4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var2.f9138c3 = floatValue;
                i4Var2.f9132a3.setTransitionProgress(floatValue);
                return;
            default:
                i4.X(this.f9918b, valueAnimator);
                return;
        }
    }
}
