package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lc2 extends AnimatorListenerAdapter {
    public final byte a;
    public final rc2 b;

    public lc2(rc2 rc2Var, byte b) {
        this.a = b;
        this.b = rc2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rc2 rc2Var = this.b;
        switch (b) {
            case 0:
                rc2Var.Q5.O0 = true;
                rc2Var.invalidate();
                return;
            default:
                rc2Var.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
