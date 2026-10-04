package ei;

import android.animation.ValueAnimator;
public final class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9012a;
    public final l3 f9013b;

    public e2(l3 l3Var, int i10) {
        this.f9012a = i10;
        this.f9013b = l3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9012a) {
            case 0:
                l3 l3Var = this.f9013b;
                l3Var.getClass();
                l3Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l3Var.h();
                return;
            default:
                this.f9013b.f9182y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
