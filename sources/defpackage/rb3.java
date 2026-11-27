package defpackage;

import android.animation.ValueAnimator;
public final class rb3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final zb3 b;

    public rb3(zb3 zb3Var, f89 f89Var, byte b) {
        this.a = b;
        this.b = zb3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        zb3 zb3Var = this.b;
        switch (b) {
            case 0:
                zb3Var.Q();
                return;
            default:
                zb3Var.M();
                return;
        }
    }
}
