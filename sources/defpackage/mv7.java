package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mv7 extends AnimatorListenerAdapter {
    public final byte a;
    public final xv7 b;

    public mv7(xv7 xv7Var, byte b) {
        this.a = b;
        this.b = xv7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        xv7 xv7Var = this.b;
        switch (b) {
            case 0:
                xv7Var.R1 = 0.0f;
                xv7Var.P1.setAlpha(1.0f);
                xv7Var.P1.setVisibility(8);
                xv7Var.P1.k();
                return;
            case 1:
                xv7Var.j2.setTranslationY(0.0f);
                return;
            default:
                xv7Var.m2 = false;
                xv7Var.j2.setTranslationY(0.0f);
                xv7Var.t0();
                return;
        }
    }
}
