package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r8 extends AnimatorListenerAdapter {
    public final int f12511a;
    public final t8 f12512b;

    public r8(t8 t8Var, int i7) {
        this.f12511a = i7;
        this.f12512b = t8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12511a) {
            case 0:
                f9 f9Var = this.f12512b.f12607s0;
                f9Var.Y = 0.0f;
                f9.i(f9Var);
                return;
            default:
                f9 f9Var2 = this.f12512b.f12607s0;
                f9Var2.X = 0.0f;
                f9Var2.f11956a0 = 0.0f;
                f9.i(f9Var2);
                return;
        }
    }
}
