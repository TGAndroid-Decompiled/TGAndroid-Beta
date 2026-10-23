package ei;

import android.animation.ValueAnimator;
public final class r4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9719a;
    public final f6 f9720b;

    public r4(f6 f6Var, int i10) {
        this.f9719a = i10;
        this.f9720b = f6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9719a) {
            case 0:
                f6 f6Var = this.f9720b;
                f6Var.getClass();
                f6Var.f9039p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                f6 f6Var2 = this.f9720b;
                f6Var2.getClass();
                f6Var2.f9039p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                f6 f6Var3 = this.f9720b;
                f6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var3.f9012b2 = floatValue;
                f6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
