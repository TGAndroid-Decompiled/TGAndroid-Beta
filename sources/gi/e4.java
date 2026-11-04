package gi;

import android.animation.ValueAnimator;
public final class e4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12659a;
    public final m5 f12660b;

    public e4(m5 m5Var, int i3) {
        this.f12659a = i3;
        this.f12660b = m5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12659a) {
            case 0:
                m5 m5Var = this.f12660b;
                m5Var.getClass();
                m5Var.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                m5 m5Var2 = this.f12660b;
                m5Var2.getClass();
                m5Var2.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m5 m5Var3 = this.f12660b;
                m5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var3.L1 = floatValue;
                m5Var3.J1.setTransitionProgress(floatValue);
                return;
        }
    }
}
