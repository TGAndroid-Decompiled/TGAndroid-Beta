package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j62 extends AnimatorListenerAdapter {
    public final byte a;
    public final a72 b;

    public j62(a72 a72Var, byte b) {
        this.a = b;
        this.b = a72Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a72 a72Var = this.b;
        switch (b) {
            case 0:
                a72Var.F.setTranslationY(0.0f);
                return;
            case 1:
                a72Var.F.setTranslationY(0.0f);
                return;
            default:
                a72Var.g1 = false;
                a72Var.F.setTranslationY(0.0f);
                a72Var.Z();
                return;
        }
    }
}
