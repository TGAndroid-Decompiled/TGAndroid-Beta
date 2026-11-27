package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sw7 extends AnimatorListenerAdapter {
    public final byte a;
    public final dx7 b;

    public sw7(dx7 dx7Var, byte b) {
        this.a = b;
        this.b = dx7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        dx7 dx7Var = this.b;
        switch (b) {
            case 0:
                dx7Var.L1 = 0.0f;
                dx7Var.J1.setAlpha(1.0f);
                dx7Var.J1.setVisibility(8);
                dx7Var.J1.k();
                return;
            case 1:
                dx7Var.d2.setTranslationY(0.0f);
                return;
            default:
                dx7Var.g2 = false;
                dx7Var.d2.setTranslationY(0.0f);
                dx7Var.t0();
                return;
        }
    }
}
