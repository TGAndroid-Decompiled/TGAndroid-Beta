package ci;

import android.animation.ValueAnimator;
public final class k9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5500a;
    public final n9 f5501b;

    public k9(n9 n9Var, int i10) {
        this.f5500a = i10;
        this.f5501b = n9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5500a) {
            case 0:
                z9 z9Var = this.f5501b.I0;
                z9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9.k(z9Var);
                return;
            default:
                z9 z9Var2 = this.f5501b.I0;
                z9Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9.k(z9Var2);
                return;
        }
    }
}
