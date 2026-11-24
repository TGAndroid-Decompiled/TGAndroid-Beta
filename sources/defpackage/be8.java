package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class be8 extends AnimatorListenerAdapter {
    public final byte a;
    public final ie8 b;

    public be8(ie8 ie8Var, byte b) {
        this.a = b;
        this.b = ie8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ie8 ie8Var = this.b;
        switch (b) {
            case 0:
                ie8Var.S.setTranslationY(0.0f);
                return;
            case 1:
                ie8Var.S.setTranslationY(0.0f);
                return;
            default:
                ie8Var.S.setTranslationY(0.0f);
                ie8Var.m0();
                return;
        }
    }
}
