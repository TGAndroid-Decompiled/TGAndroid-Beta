package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f85 extends AnimatorListenerAdapter {
    public final byte a;
    public final g95 b;

    public f85(g95 g95Var, byte b) {
        this.a = b;
        this.b = g95Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        g95 g95Var = this.b;
        switch (b) {
            case 0:
                g95Var.O1.setVisibility(4);
                g95Var.P1.setVisibility(4);
                g95Var.N1.setVisibility(4);
                return;
            default:
                g95Var.a2 = null;
                return;
        }
    }
}
