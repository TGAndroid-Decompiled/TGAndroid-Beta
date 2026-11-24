package defpackage;

import android.animation.ValueAnimator;
public final class kc3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final sc3 b;

    public kc3(sc3 sc3Var, u69 u69Var, byte b) {
        this.a = b;
        this.b = sc3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sc3 sc3Var = this.b;
        switch (b) {
            case 0:
                sc3Var.Q();
                return;
            default:
                sc3Var.M();
                return;
        }
    }
}
