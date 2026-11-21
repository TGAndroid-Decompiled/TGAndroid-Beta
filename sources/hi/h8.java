package hi;

import android.animation.ValueAnimator;
public final class h8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14757a;
    public final i8 f14758b;

    public h8(i8 i8Var, int i7) {
        this.f14757a = i7;
        this.f14758b = i8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14757a) {
            case 0:
                i8.a(this.f14758b, valueAnimator);
                return;
            default:
                i8 i8Var = this.f14758b;
                i8Var.getClass();
                i8Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
