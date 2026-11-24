package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t52 extends AnimatorListenerAdapter {
    public final byte a;
    public final k62 b;

    public t52(k62 k62Var, byte b) {
        this.a = b;
        this.b = k62Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        k62 k62Var = this.b;
        switch (b) {
            case 0:
                k62Var.F.setTranslationY(0.0f);
                return;
            case 1:
                k62Var.F.setTranslationY(0.0f);
                return;
            default:
                k62Var.g1 = false;
                k62Var.F.setTranslationY(0.0f);
                k62Var.a0();
                return;
        }
    }
}
