package defpackage;

import android.animation.ValueAnimator;
public final class na5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ra5 b;

    public na5(ra5 ra5Var, byte b) {
        this.a = b;
        this.b = ra5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ra5 ra5Var = this.b;
        switch (b) {
            case 0:
                ra5Var.s.x = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ra5Var.i();
                pa5 pa5Var = ra5Var.a;
                if (pa5Var.getParent() != null) {
                    ra5Var.n.updateViewLayout(pa5Var, ra5Var.s);
                    return;
                }
                return;
            default:
                ra5Var.s.y = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pa5 pa5Var2 = ra5Var.a;
                if (pa5Var2.getParent() != null) {
                    ra5Var.n.updateViewLayout(pa5Var2, ra5Var.s);
                    return;
                }
                return;
        }
    }
}
