package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t41 extends AnimatorListenerAdapter {
    public final byte a;
    public final u41 b;

    public t41(u41 u41Var, byte b) {
        this.a = b;
        this.b = u41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        u41 u41Var = this.b;
        switch (b) {
            case 0:
                u41Var.N = false;
                u41Var.e.t(null, false, true);
                return;
            default:
                u41Var.U = 1.0f;
                u41Var.invalidate();
                return;
        }
    }
}
