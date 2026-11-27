package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class oy5 extends AnimatorListenerAdapter {
    public final byte a;
    public final wy5 b;

    public oy5(wy5 wy5Var, byte b) {
        this.a = b;
        this.b = wy5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wy5 wy5Var = this.b;
        switch (b) {
            case 0:
                wy5Var.T1.setTranslationY(0.0f);
                return;
            default:
                wy5Var.W1 = false;
                wy5Var.T1.setTranslationY(0.0f);
                wy5Var.j0();
                return;
        }
    }
}
