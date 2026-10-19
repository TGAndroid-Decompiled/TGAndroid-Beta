package ei;

import android.animation.ValueAnimator;
public final class h9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9162a;
    public final i9 f9163b;

    public h9(i9 i9Var, int i10) {
        this.f9162a = i10;
        this.f9163b = i9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9162a) {
            case 0:
                i9.a(this.f9163b, valueAnimator);
                return;
            default:
                i9 i9Var = this.f9163b;
                i9Var.getClass();
                i9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
