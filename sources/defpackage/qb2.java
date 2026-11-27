package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qb2 extends AnimatorListenerAdapter {
    public final byte a;
    public final wb2 b;

    public qb2(wb2 wb2Var, byte b) {
        this.a = b;
        this.b = wb2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wb2 wb2Var = this.b;
        switch (b) {
            case 0:
                wb2Var.Q5.O0 = true;
                wb2Var.invalidate();
                return;
            default:
                wb2Var.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
