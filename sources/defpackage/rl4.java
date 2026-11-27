package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rl4 extends AnimatorListenerAdapter {
    public final byte a;
    public final xl4 b;

    public rl4(xl4 xl4Var, byte b) {
        this.a = b;
        this.b = xl4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        xl4 xl4Var = this.b;
        switch (b) {
            case 0:
                xl4Var.a.c(false, true);
                return;
            default:
                xl4Var.y = null;
                return;
        }
    }
}
