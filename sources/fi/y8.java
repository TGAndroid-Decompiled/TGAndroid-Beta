package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y8 extends AnimatorListenerAdapter {
    public final int f12834a;
    public final o8 f12835b;

    public y8(o8 o8Var, int i7) {
        this.f12834a = i7;
        this.f12835b = o8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12834a) {
            case 0:
                super.onAnimationEnd(animator);
                f9 f9Var = this.f12835b.f12387b;
                t6 t6Var = f9Var.f12039u1;
                if (t6Var != null) {
                    t6Var.b();
                    f9Var.f12042w.removeView(f9Var.f12039u1);
                }
                f9Var.f12039u1 = null;
                f9Var.V();
                return;
            default:
                super.onAnimationEnd(animator);
                t6 t6Var2 = this.f12835b.f12387b.f12039u1;
                if (t6Var2 != null) {
                    t6Var2.a(true);
                    return;
                }
                return;
        }
    }
}
