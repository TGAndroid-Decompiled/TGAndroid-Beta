package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jw5 extends AnimatorListenerAdapter {
    public final byte a;
    public final rw5 b;

    public jw5(rw5 rw5Var, byte b) {
        this.a = b;
        this.b = rw5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rw5 rw5Var = this.b;
        switch (b) {
            case 0:
                rw5Var.Z1.setTranslationY(0.0f);
                return;
            default:
                rw5Var.c2 = false;
                rw5Var.Z1.setTranslationY(0.0f);
                rw5Var.j0();
                return;
        }
    }
}
