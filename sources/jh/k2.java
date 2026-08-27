package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class k2 extends AnimatorListenerAdapter {

    public final int f13567a;

    public final e4 f13568b;

    public k2(e4 e4Var, int i10) {
        this.f13567a = i10;
        this.f13568b = e4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q2 q2Var;
        Runnable runnable;
        switch (this.f13567a) {
            case 0:
                e4 e4Var = this.f13568b;
                e4Var.f13263p3 = 0.0f;
                e4Var.f13257n3.setAlpha(1.0f);
                e4Var.f13257n3.setVisibility(8);
                e4Var.f13257n3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                e4 e4Var2 = this.f13568b;
                e4Var2.J2.unlock();
                e4Var2.D2 = e4Var2.f13248k2;
                o2 o2Var = e4Var2.X1;
                if (o2Var != null && (runnable = o2Var.f26192w) != null) {
                    runnable.run();
                    o2Var.f26192w = null;
                }
                if (e4Var2.G1 && !e4Var2.f13268r2) {
                    i9 i9Var = ((z8) e4Var2.M1).d;
                    if (i9Var.f13513x) {
                        i9Var.f13513x = false;
                        i9Var.P();
                    }
                }
                if (!e4Var2.f13268r2 && (q2Var = e4Var2.Z2) != null) {
                    q2Var.setVisibility(8);
                }
                e4Var2.R2 = true;
                e4Var2.invalidate();
                break;
        }
    }
}
