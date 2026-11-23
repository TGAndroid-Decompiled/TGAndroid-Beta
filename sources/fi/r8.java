package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r8 extends AnimatorListenerAdapter {
    public final int f12551a;
    public final t8 f12552b;

    public r8(t8 t8Var, int i7) {
        this.f12551a = i7;
        this.f12552b = t8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12551a) {
            case 0:
                f9 f9Var = this.f12552b.f12646s0;
                f9Var.Y = 0.0f;
                f9.i(f9Var);
                return;
            default:
                f9 f9Var2 = this.f12552b.f12646s0;
                f9Var2.X = 0.0f;
                f9Var2.f11997a0 = 0.0f;
                f9.i(f9Var2);
                return;
        }
    }
}
