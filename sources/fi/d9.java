package fi;

import android.animation.ValueAnimator;
public final class d9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10729a;
    public final e9 f10730b;

    public d9(e9 e9Var, int i10) {
        this.f10729a = i10;
        this.f10730b = e9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10729a) {
            case 0:
                e9.a(this.f10730b, valueAnimator);
                return;
            default:
                e9 e9Var = this.f10730b;
                e9Var.getClass();
                e9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
