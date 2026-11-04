package ei;

import android.animation.ValueAnimator;
public final class b9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10137a;
    public final e9 f10138b;

    public b9(e9 e9Var, int i3) {
        this.f10137a = i3;
        this.f10138b = e9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10137a) {
            case 0:
                r9 r9Var = this.f10138b.f10249s0;
                r9Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9.w(r9Var);
                return;
            default:
                r9 r9Var2 = this.f10138b.f10249s0;
                r9Var2.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9.w(r9Var2);
                return;
        }
    }
}
