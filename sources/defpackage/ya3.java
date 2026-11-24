package defpackage;

import android.animation.ValueAnimator;
public final class ya3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final gb3 b;

    public ya3(gb3 gb3Var, s49 s49Var, byte b) {
        this.a = b;
        this.b = gb3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        gb3 gb3Var = this.b;
        switch (b) {
            case 0:
                gb3Var.Q();
                return;
            default:
                gb3Var.M();
                return;
        }
    }
}
