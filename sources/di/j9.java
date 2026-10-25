package di;

import android.animation.ValueAnimator;
public final class j9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8704a;
    public final m9 f8705b;

    public j9(m9 m9Var, int i10) {
        this.f8704a = i10;
        this.f8705b = m9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8704a) {
            case 0:
                y9 y9Var = this.f8705b.f8807x0;
                y9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9.k(y9Var);
                return;
            default:
                y9 y9Var2 = this.f8705b.f8807x0;
                y9Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9.k(y9Var2);
                return;
        }
    }
}
