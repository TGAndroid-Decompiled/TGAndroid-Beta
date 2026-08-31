package oh;

import android.animation.ValueAnimator;
public final class t8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f17796a;
    public final w8 f17797b;

    public t8(w8 w8Var, int i10) {
        this.f17796a = i10;
        this.f17797b = w8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17796a) {
            case 0:
                i9 i9Var = this.f17797b.F0;
                i9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.k(i9Var);
                return;
            default:
                i9 i9Var2 = this.f17797b.F0;
                i9Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.k(i9Var2);
                return;
        }
    }
}
