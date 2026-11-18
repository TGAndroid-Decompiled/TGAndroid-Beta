package fi;

import android.animation.ValueAnimator;
public final class q8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12474a;
    public final t8 f12475b;

    public q8(t8 t8Var, int i7) {
        this.f12474a = i7;
        this.f12475b = t8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12474a) {
            case 0:
                f9 f9Var = this.f12475b.f12607s0;
                f9Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9.i(f9Var);
                return;
            default:
                f9 f9Var2 = this.f12475b.f12607s0;
                f9Var2.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9.i(f9Var2);
                return;
        }
    }
}
