package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y8 extends AnimatorListenerAdapter {
    public final int f12837a;
    public final o8 f12838b;

    public y8(o8 o8Var, int i7) {
        this.f12837a = i7;
        this.f12838b = o8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12837a) {
            case 0:
                super.onAnimationEnd(animator);
                f9 f9Var = this.f12838b.f12390b;
                t6 t6Var = f9Var.f12042u1;
                if (t6Var != null) {
                    t6Var.b();
                    f9Var.f12045w.removeView(f9Var.f12042u1);
                }
                f9Var.f12042u1 = null;
                f9Var.V();
                return;
            default:
                super.onAnimationEnd(animator);
                t6 t6Var2 = this.f12838b.f12390b.f12042u1;
                if (t6Var2 != null) {
                    t6Var2.a(true);
                    return;
                }
                return;
        }
    }
}
