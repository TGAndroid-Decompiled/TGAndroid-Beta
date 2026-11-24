package defpackage;

import android.animation.ValueAnimator;
public final class jt4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final cn0 b;

    public jt4(cn0 cn0Var, byte b) {
        this.a = b;
        this.b = cn0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cn0 cn0Var = this.b;
        switch (b) {
            case 0:
                ((tt4) cn0Var.c).invalidate();
                return;
            default:
                ((tt4) cn0Var.c).invalidate();
                return;
        }
    }
}
