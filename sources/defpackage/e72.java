package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e72 extends AnimatorListenerAdapter {
    public final byte a;
    public final v72 b;

    public e72(v72 v72Var, byte b) {
        this.a = b;
        this.b = v72Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        v72 v72Var = this.b;
        switch (b) {
            case 0:
                v72Var.F.setTranslationY(0.0f);
                return;
            case 1:
                v72Var.F.setTranslationY(0.0f);
                return;
            default:
                v72Var.g1 = false;
                v72Var.F.setTranslationY(0.0f);
                v72Var.a0();
                return;
        }
    }
}
