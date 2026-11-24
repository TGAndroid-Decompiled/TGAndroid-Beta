package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lt7 extends AnimatorListenerAdapter {
    public final byte a;
    public final wt7 b;

    public lt7(wt7 wt7Var, byte b) {
        this.a = b;
        this.b = wt7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                wt7Var.R1 = 0.0f;
                wt7Var.P1.setAlpha(1.0f);
                wt7Var.P1.setVisibility(8);
                wt7Var.P1.k();
                return;
            case 1:
                wt7Var.j2.setTranslationY(0.0f);
                return;
            default:
                wt7Var.m2 = false;
                wt7Var.j2.setTranslationY(0.0f);
                wt7Var.t0();
                return;
        }
    }
}
