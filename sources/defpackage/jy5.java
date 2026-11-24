package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jy5 extends AnimatorListenerAdapter {
    public final byte a;
    public final ry5 b;

    public jy5(ry5 ry5Var, byte b) {
        this.a = b;
        this.b = ry5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ry5 ry5Var = this.b;
        switch (b) {
            case 0:
                ry5Var.Z1.setTranslationY(0.0f);
                return;
            default:
                ry5Var.c2 = false;
                ry5Var.Z1.setTranslationY(0.0f);
                ry5Var.j0();
                return;
        }
    }
}
