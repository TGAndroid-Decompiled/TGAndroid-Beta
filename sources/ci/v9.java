package ci;

import android.animation.ValueAnimator;
public final class v9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5692a;
    public final w9 f5693b;

    public v9(w9 w9Var, int i10) {
        this.f5692a = i10;
        this.f5693b = w9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5692a) {
            case 0:
                w9.a(this.f5693b, valueAnimator);
                return;
            default:
                w9 w9Var = this.f5693b;
                w9Var.getClass();
                w9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
