package lh;

import android.animation.ValueAnimator;

public final class g9 implements ValueAnimator.AnimatorUpdateListener {

    public final int f16041a;

    public final i9 f16042b;

    public g9(i9 i9Var, int i10) {
        this.f16041a = i10;
        this.f16042b = i9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16041a) {
            case 0:
                i9.a(this.f16042b, valueAnimator);
                break;
            default:
                i9 i9Var = this.f16042b;
                i9Var.getClass();
                i9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
