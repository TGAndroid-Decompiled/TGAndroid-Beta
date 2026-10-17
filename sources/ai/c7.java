package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c7 extends AnimatorListenerAdapter {
    public final int f1092a;
    public final e7 f1093b;

    public c7(e7 e7Var, int i10) {
        this.f1092a = i10;
        this.f1093b = e7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1092a) {
            case 0:
                this.f1093b.f1217e0 = false;
                return;
            case 1:
                this.f1093b.f1217e0 = false;
                return;
            case 2:
                this.f1093b.O.setVisibility(4);
                return;
            case 3:
                e7 e7Var = this.f1093b;
                e7Var.f1235t0 = e7Var.f1234s0;
                e7Var.d(e7Var.V);
                return;
            default:
                e7 e7Var2 = this.f1093b;
                e7Var2.f1236u0 = 1.0f;
                e7Var2.f1212b.setScaleX(1.0f);
                e7Var2.f1212b.setScaleY(e7Var2.f1236u0);
                e7Var2.invalidate();
                return;
        }
    }
}
