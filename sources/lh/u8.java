package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f16305a;
    public final w8 f16306b;

    public u8(w8 w8Var, int i10) {
        this.f16305a = i10;
        this.f16306b = w8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16305a) {
            case 0:
                i9 i9Var = this.f16306b.E0;
                i9Var.T = 0.0f;
                i9.k(i9Var);
                return;
            default:
                i9 i9Var2 = this.f16306b.E0;
                i9Var2.S = 0.0f;
                i9Var2.V = 0.0f;
                i9.k(i9Var2);
                return;
        }
    }
}
