package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v3 extends AnimatorListenerAdapter {
    public final int f1606a;
    public final e6 f1607b;

    public v3(e6 e6Var, int i10) {
        this.f1606a = i10;
        this.f1607b = e6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        c4 c4Var;
        Runnable runnable;
        switch (this.f1606a) {
            case 0:
                e6 e6Var = this.f1607b;
                e6Var.f832t3 = 0.0f;
                e6Var.f826r3.setAlpha(1.0f);
                e6Var.f826r3.setVisibility(8);
                e6Var.f826r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                e6 e6Var2 = this.f1607b;
                e6Var2.N2.unlock();
                e6Var2.H2 = e6Var2.f816o2;
                a4 a4Var = e6Var2.f776b2;
                if (a4Var != null && (runnable = a4Var.f22081w) != null) {
                    runnable.run();
                    a4Var.f22081w = null;
                }
                if (e6Var2.K1 && !e6Var2.f837v2) {
                    jc jcVar = ((ac) e6Var2.Q1).d;
                    if (jcVar.f1112x) {
                        jcVar.f1112x = false;
                        jcVar.P();
                    }
                }
                if (!e6Var2.f837v2 && (c4Var = e6Var2.f785d3) != null) {
                    c4Var.setVisibility(8);
                }
                e6Var2.V2 = true;
                e6Var2.invalidate();
                return;
        }
    }
}
