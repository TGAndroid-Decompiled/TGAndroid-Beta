package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y8 extends AnimatorListenerAdapter {
    public final int f12799a;
    public final o8 f12800b;

    public y8(o8 o8Var, int i7) {
        this.f12799a = i7;
        this.f12800b = o8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12799a) {
            case 0:
                super.onAnimationEnd(animator);
                f9 f9Var = this.f12800b.f12352b;
                t6 t6Var = f9Var.f12004u1;
                if (t6Var != null) {
                    t6Var.b();
                    f9Var.f12007w.removeView(f9Var.f12004u1);
                }
                f9Var.f12004u1 = null;
                f9Var.V();
                return;
            default:
                super.onAnimationEnd(animator);
                t6 t6Var2 = this.f12800b.f12352b.f12004u1;
                if (t6Var2 != null) {
                    t6Var2.a(true);
                    return;
                }
                return;
        }
    }
}
