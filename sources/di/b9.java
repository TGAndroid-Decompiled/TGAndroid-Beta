package di;

import android.animation.ValueAnimator;
public final class b9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8856a;
    public final e9 f8857b;

    public b9(e9 e9Var, int i7) {
        this.f8856a = i7;
        this.f8857b = e9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8856a) {
            case 0:
                q9 q9Var = this.f8857b.f8975r0;
                q9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9.i(q9Var);
                return;
            default:
                q9 q9Var2 = this.f8857b.f8975r0;
                q9Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9.i(q9Var2);
                return;
        }
    }
}
