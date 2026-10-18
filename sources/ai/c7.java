package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c7 extends AnimatorListenerAdapter {
    public final int f1077a;
    public final e7 f1078b;

    public c7(e7 e7Var, int i10) {
        this.f1077a = i10;
        this.f1078b = e7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1077a) {
            case 0:
                this.f1078b.f1221e0 = false;
                return;
            case 1:
                this.f1078b.f1221e0 = false;
                return;
            case 2:
                this.f1078b.O.setVisibility(4);
                return;
            case 3:
                e7 e7Var = this.f1078b;
                e7Var.f1239t0 = e7Var.f1238s0;
                e7Var.d(e7Var.V);
                return;
            default:
                e7 e7Var2 = this.f1078b;
                e7Var2.f1240u0 = 1.0f;
                e7Var2.f1216b.setScaleX(1.0f);
                e7Var2.f1216b.setScaleY(e7Var2.f1240u0);
                e7Var2.invalidate();
                return;
        }
    }
}
