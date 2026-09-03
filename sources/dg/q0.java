package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f4731a;
    public final e1 f4732b;

    public q0(e1 e1Var, int i10) {
        this.f4731a = i10;
        this.f4732b = e1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4731a) {
            case 0:
                this.f4732b.f4468c2.setTranslationY(0.0f);
                return;
            default:
                e1 e1Var = this.f4732b;
                e1Var.f4474f2 = false;
                e1Var.f4468c2.setTranslationY(0.0f);
                e1Var.m0();
                return;
        }
    }
}
