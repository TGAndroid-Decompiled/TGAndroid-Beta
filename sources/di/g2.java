package di;

import android.animation.ValueAnimator;
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6640a;
    public final n3 f6641b;

    public g2(n3 n3Var, int i10) {
        this.f6640a = i10;
        this.f6641b = n3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6640a) {
            case 0:
                n3 n3Var = this.f6641b;
                n3Var.getClass();
                n3Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var.h();
                return;
            default:
                this.f6641b.f6814y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
