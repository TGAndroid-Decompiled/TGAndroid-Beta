package bh;

import android.animation.ValueAnimator;
public final class z implements ValueAnimator.AnimatorUpdateListener {
    public final int f4237a;
    public final i0 f4238b;

    public z(i0 i0Var, int i10) {
        this.f4237a = i10;
        this.f4238b = i0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4237a) {
            case 0:
                i0 i0Var = this.f4238b;
                i0Var.getClass();
                i0Var.f4047a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f4238b.f4047a.invalidate();
                return;
        }
    }
}
