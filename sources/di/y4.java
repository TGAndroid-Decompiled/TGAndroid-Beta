package di;

import android.animation.ValueAnimator;
public final class y4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8127a;
    public final o6 f8128b;

    public y4(o6 o6Var, int i10) {
        this.f8127a = i10;
        this.f8128b = o6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8127a) {
            case 0:
                o6 o6Var = this.f8128b;
                o6Var.getClass();
                o6Var.f7541p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                o6 o6Var2 = this.f8128b;
                o6Var2.getClass();
                o6Var2.f7541p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o6 o6Var3 = this.f8128b;
                o6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var3.f7514b2 = floatValue;
                o6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
