package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h0 extends AnimatorListenerAdapter {
    public final int f9993a;
    public final r0 f9994b;

    public h0(r0 r0Var, int i10) {
        this.f9993a = i10;
        this.f9994b = r0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9993a) {
            case 0:
                this.f9994b.O1.setTranslationY(0.0f);
                return;
            default:
                r0 r0Var = this.f9994b;
                r0Var.R1 = false;
                r0Var.O1.setTranslationY(0.0f);
                r0Var.l0();
                return;
        }
    }
}
