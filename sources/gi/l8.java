package gi;

import android.animation.ValueAnimator;
public final class l8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f13125a;
    public final m8 f13126b;

    public l8(m8 m8Var, int i3) {
        this.f13125a = i3;
        this.f13126b = m8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13125a) {
            case 0:
                m8.a(this.f13126b, valueAnimator);
                return;
            default:
                m8 m8Var = this.f13126b;
                m8Var.getClass();
                m8Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
