package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a61 extends AnimatorListenerAdapter {
    public final byte a;
    public final b61 b;

    public a61(b61 b61Var, byte b) {
        this.a = b;
        this.b = b61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        b61 b61Var = this.b;
        switch (b) {
            case 0:
                b61Var.N = false;
                b61Var.e.t(null, false, true);
                return;
            default:
                b61Var.U = 1.0f;
                b61Var.invalidate();
                return;
        }
    }
}
