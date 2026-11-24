package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m36 extends AnimatorListenerAdapter {
    public final byte a;
    public final n36 b;
    public final o36 c;

    public m36(o36 o36Var, n36 n36Var, byte b) {
        this.a = b;
        this.c = o36Var;
        this.b = n36Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        o36 o36Var = this.c;
        n36 n36Var = this.b;
        switch (b) {
            case 0:
                n36Var.f = null;
                o36Var.a();
                return;
            default:
                n36Var.f = null;
                o36Var.a();
                return;
        }
    }
}
