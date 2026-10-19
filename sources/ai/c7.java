package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c7 extends AnimatorListenerAdapter {
    public final int f1076a;
    public final e7 f1077b;

    public c7(e7 e7Var, int i10) {
        this.f1076a = i10;
        this.f1077b = e7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1076a) {
            case 0:
                this.f1077b.f1220g0 = false;
                return;
            case 1:
                this.f1077b.f1220g0 = false;
                return;
            case 2:
                this.f1077b.O.setVisibility(4);
                return;
            case 3:
                e7 e7Var = this.f1077b;
                e7Var.f1237v0 = e7Var.f1236u0;
                e7Var.d(e7Var.f1211a0);
                return;
            default:
                e7 e7Var2 = this.f1077b;
                e7Var2.f1239w0 = 1.0f;
                e7Var2.f1212b.setScaleX(1.0f);
                e7Var2.f1212b.setScaleY(e7Var2.f1239w0);
                e7Var2.invalidate();
                return;
        }
    }
}
