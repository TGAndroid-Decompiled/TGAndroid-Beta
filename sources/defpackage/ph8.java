package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ph8 extends AnimatorListenerAdapter {
    public final byte a;
    public final wh8 b;

    public ph8(wh8 wh8Var, byte b) {
        this.a = b;
        this.b = wh8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wh8 wh8Var = this.b;
        switch (b) {
            case 0:
                wh8Var.S.setTranslationY(0.0f);
                return;
            case 1:
                wh8Var.S.setTranslationY(0.0f);
                return;
            default:
                wh8Var.S.setTranslationY(0.0f);
                wh8Var.m0();
                return;
        }
    }
}
