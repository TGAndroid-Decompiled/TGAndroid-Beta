package defpackage;

import android.animation.ValueAnimator;
public final class nq9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final er9 b;

    public nq9(er9 er9Var, byte b) {
        this.a = b;
        this.b = er9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        er9 er9Var = this.b;
        switch (b) {
            case 0:
                er9Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                er9Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                er9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                er9Var.f.requestLayout();
                return;
            default:
                er9Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jla jlaVar = er9Var.F;
                if (jlaVar.getTitleTextView() != null) {
                    jlaVar.getTitleTextView().invalidate();
                    return;
                }
                return;
        }
    }
}
