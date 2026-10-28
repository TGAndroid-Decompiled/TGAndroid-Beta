package di;

import android.animation.ValueAnimator;
public final class j9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8703a;
    public final m9 f8704b;

    public j9(m9 m9Var, int i10) {
        this.f8703a = i10;
        this.f8704b = m9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8703a) {
            case 0:
                y9 y9Var = this.f8704b.f8806x0;
                y9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9.k(y9Var);
                return;
            default:
                y9 y9Var2 = this.f8704b.f8806x0;
                y9Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9.k(y9Var2);
                return;
        }
    }
}
