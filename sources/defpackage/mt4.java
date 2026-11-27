package defpackage;

import android.animation.ValueAnimator;
public final class mt4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final cm0 b;

    public mt4(cm0 cm0Var, byte b) {
        this.a = b;
        this.b = cm0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cm0 cm0Var = this.b;
        switch (b) {
            case 0:
                ((wt4) cm0Var.c).invalidate();
                return;
            default:
                ((wt4) cm0Var.c).invalidate();
                return;
        }
    }
}
