package di;

import android.animation.ValueAnimator;
public final class y4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8129a;
    public final o6 f8130b;

    public y4(o6 o6Var, int i10) {
        this.f8129a = i10;
        this.f8130b = o6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8129a) {
            case 0:
                o6 o6Var = this.f8130b;
                o6Var.getClass();
                o6Var.f7544p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                o6 o6Var2 = this.f8130b;
                o6Var2.getClass();
                o6Var2.f7544p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o6 o6Var3 = this.f8130b;
                o6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var3.f7517b2 = floatValue;
                o6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
