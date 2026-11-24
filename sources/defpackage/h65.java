package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h65 extends AnimatorListenerAdapter {
    public final byte a;
    public final h75 b;

    public h65(h75 h75Var, byte b) {
        this.a = b;
        this.b = h75Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        h75 h75Var = this.b;
        switch (b) {
            case 0:
                h75Var.O1.setVisibility(4);
                h75Var.P1.setVisibility(4);
                h75Var.N1.setVisibility(4);
                return;
            default:
                h75Var.a2 = null;
                return;
        }
    }
}
