package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z75 extends AnimatorListenerAdapter {
    public final byte a;
    public final ha5 b;
    public final g95 c;

    public z75(g95 g95Var, ha5 ha5Var, byte b) {
        this.a = b;
        this.c = g95Var;
        this.b = ha5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        g95 g95Var = this.c;
        ha5 ha5Var = this.b;
        switch (b) {
            case 0:
                if (ha5Var.getParent() != null) {
                    g95Var.b.removeView(ha5Var);
                    return;
                }
                return;
            default:
                if (ha5Var.getParent() != null) {
                    g95Var.b.removeView(ha5Var);
                    return;
                }
                return;
        }
    }
}
