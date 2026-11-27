package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q36 extends AnimatorListenerAdapter {
    public final byte a;
    public final r36 b;
    public final s36 c;

    public q36(s36 s36Var, r36 r36Var, byte b) {
        this.a = b;
        this.c = s36Var;
        this.b = r36Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        s36 s36Var = this.c;
        r36 r36Var = this.b;
        switch (b) {
            case 0:
                r36Var.f = null;
                s36Var.a();
                return;
            default:
                r36Var.f = null;
                s36Var.a();
                return;
        }
    }
}
