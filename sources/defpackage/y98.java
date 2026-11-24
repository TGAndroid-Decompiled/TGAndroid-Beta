package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y98 extends AnimatorListenerAdapter {
    public final byte a;
    public final z98 b;

    public y98(z98 z98Var, byte b) {
        this.a = b;
        this.b = z98Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        z98 z98Var = this.b;
        switch (b) {
            case 0:
                z98Var.a.n.setVisibility(8);
                return;
            default:
                z98Var.a.h.setVisibility(8);
                return;
        }
    }
}
