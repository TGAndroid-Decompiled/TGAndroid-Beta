package ei;

import android.animation.ValueAnimator;
public final class r4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9704a;
    public final f6 f9705b;

    public r4(f6 f6Var, int i10) {
        this.f9704a = i10;
        this.f9705b = f6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9704a) {
            case 0:
                f6 f6Var = this.f9705b;
                f6Var.getClass();
                f6Var.f9029p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                f6 f6Var2 = this.f9705b;
                f6Var2.getClass();
                f6Var2.f9029p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                f6 f6Var3 = this.f9705b;
                f6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var3.f9002b2 = floatValue;
                f6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
