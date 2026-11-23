package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r8 extends AnimatorListenerAdapter {
    public final int f12513a;
    public final t8 f12514b;

    public r8(t8 t8Var, int i7) {
        this.f12513a = i7;
        this.f12514b = t8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12513a) {
            case 0:
                f9 f9Var = this.f12514b.f12608s0;
                f9Var.Y = 0.0f;
                f9.i(f9Var);
                return;
            default:
                f9 f9Var2 = this.f12514b.f12608s0;
                f9Var2.X = 0.0f;
                f9Var2.f11959a0 = 0.0f;
                f9.i(f9Var2);
                return;
        }
    }
}
