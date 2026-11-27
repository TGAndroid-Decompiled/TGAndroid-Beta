package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j85 extends AnimatorListenerAdapter {
    public final byte a;
    public final j95 b;

    public j85(j95 j95Var, byte b) {
        this.a = b;
        this.b = j95Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        j95 j95Var = this.b;
        switch (b) {
            case 0:
                j95Var.O1.setVisibility(4);
                j95Var.P1.setVisibility(4);
                j95Var.N1.setVisibility(4);
                return;
            default:
                j95Var.a2 = null;
                return;
        }
    }
}
