package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f4725a;
    public final e1 f4726b;

    public q0(e1 e1Var, int i10) {
        this.f4725a = i10;
        this.f4726b = e1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4725a) {
            case 0:
                this.f4726b.f4462c2.setTranslationY(0.0f);
                return;
            default:
                e1 e1Var = this.f4726b;
                e1Var.f4468f2 = false;
                e1Var.f4462c2.setTranslationY(0.0f);
                e1Var.m0();
                return;
        }
    }
}
