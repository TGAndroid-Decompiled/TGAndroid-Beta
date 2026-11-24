package defpackage;

import android.animation.ValueAnimator;
public final class xm9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final on9 b;

    public xm9(on9 on9Var, byte b) {
        this.a = b;
        this.b = on9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                on9Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                on9Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                on9Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pha phaVar = on9Var.F;
                if (phaVar.getTitleTextView() != null) {
                    phaVar.getTitleTextView().invalidate();
                    return;
                }
                return;
            default:
                on9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on9Var.f.requestLayout();
                return;
        }
    }
}
