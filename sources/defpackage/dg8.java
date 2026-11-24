package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dg8 extends AnimatorListenerAdapter {
    public final byte a;
    public final kg8 b;

    public dg8(kg8 kg8Var, byte b) {
        this.a = b;
        this.b = kg8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        kg8 kg8Var = this.b;
        switch (b) {
            case 0:
                kg8Var.S.setTranslationY(0.0f);
                return;
            case 1:
                kg8Var.S.setTranslationY(0.0f);
                return;
            default:
                kg8Var.S.setTranslationY(0.0f);
                kg8Var.n0();
                return;
        }
    }
}
