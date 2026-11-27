package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b51 extends AnimatorListenerAdapter {
    public final byte a;
    public final c51 b;

    public b51(c51 c51Var, byte b) {
        this.a = b;
        this.b = c51Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        c51 c51Var = this.b;
        switch (b) {
            case 0:
                c51Var.N = false;
                c51Var.e.t(null, false, true);
                return;
            default:
                c51Var.U = 1.0f;
                c51Var.invalidate();
                return;
        }
    }
}
