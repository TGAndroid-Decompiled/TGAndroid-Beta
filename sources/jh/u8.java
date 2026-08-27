package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class u8 extends AnimatorListenerAdapter {

    public final int f14034a;

    public final w8 f14035b;

    public u8(w8 w8Var, int i10) {
        this.f14034a = i10;
        this.f14035b = w8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14034a) {
            case 0:
                i9 i9Var = this.f14035b.E0;
                i9Var.T = 0.0f;
                i9.k(i9Var);
                break;
            default:
                i9 i9Var2 = this.f14035b.E0;
                i9Var2.S = 0.0f;
                i9Var2.V = 0.0f;
                i9.k(i9Var2);
                break;
        }
    }
}
