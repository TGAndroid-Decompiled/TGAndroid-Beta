package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f12404a;
    public final w8 f12405b;

    public u8(w8 w8Var, int i7) {
        this.f12404a = i7;
        this.f12405b = w8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12404a) {
            case 0:
                i9 i9Var = this.f12405b.f12486s0;
                i9Var.Y = 0.0f;
                i9.i(i9Var);
                return;
            default:
                i9 i9Var2 = this.f12405b.f12486s0;
                i9Var2.X = 0.0f;
                i9Var2.f11831a0 = 0.0f;
                i9.i(i9Var2);
                return;
        }
    }
}
