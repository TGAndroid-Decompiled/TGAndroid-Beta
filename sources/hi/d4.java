package hi;

import android.animation.ValueAnimator;
public final class d4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14120a;
    public final m5 f14121b;

    public d4(m5 m5Var, int i7) {
        this.f14120a = i7;
        this.f14121b = m5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14120a) {
            case 0:
                m5 m5Var = this.f14121b;
                m5Var.getClass();
                m5Var.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                m5 m5Var2 = this.f14121b;
                m5Var2.getClass();
                m5Var2.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m5 m5Var3 = this.f14121b;
                m5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var3.L1 = floatValue;
                m5Var3.J1.setTransitionProgress(floatValue);
                return;
        }
    }
}
