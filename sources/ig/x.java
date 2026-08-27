package ig;

import android.animation.ValueAnimator;

public final class x implements ValueAnimator.AnimatorUpdateListener {

    public final int f11470a;

    public final d0 f11471b;

    public x(d0 d0Var, int i10) {
        this.f11470a = i10;
        this.f11471b = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11470a) {
            case 0:
                d0 d0Var = this.f11471b;
                d0Var.getClass();
                d0Var.f11268a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.f11471b.f11268a.invalidate();
                break;
        }
    }
}
