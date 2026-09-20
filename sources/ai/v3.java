package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v3 extends AnimatorListenerAdapter {
    public final int f1609a;
    public final f6 f1610b;

    public v3(f6 f6Var, int i10) {
        this.f1609a = i10;
        this.f1610b = f6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        c4 c4Var;
        Runnable runnable;
        switch (this.f1609a) {
            case 0:
                f6 f6Var = this.f1610b;
                f6Var.f856t3 = 0.0f;
                f6Var.f850r3.setAlpha(1.0f);
                f6Var.f850r3.setVisibility(8);
                f6Var.f850r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                f6 f6Var2 = this.f1610b;
                f6Var2.N2.unlock();
                f6Var2.H2 = f6Var2.f840o2;
                a4 a4Var = f6Var2.f800b2;
                if (a4Var != null && (runnable = a4Var.f22077w) != null) {
                    runnable.run();
                    a4Var.f22077w = null;
                }
                if (f6Var2.K1 && !f6Var2.f861v2) {
                    jc jcVar = ((ac) f6Var2.Q1).d;
                    if (jcVar.f1119x) {
                        jcVar.f1119x = false;
                        jcVar.P();
                    }
                }
                if (!f6Var2.f861v2 && (c4Var = f6Var2.f809d3) != null) {
                    c4Var.setVisibility(8);
                }
                f6Var2.V2 = true;
                f6Var2.invalidate();
                return;
        }
    }
}
