package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v3 extends AnimatorListenerAdapter {
    public final int f1604a;
    public final e6 f1605b;

    public v3(e6 e6Var, int i10) {
        this.f1604a = i10;
        this.f1605b = e6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        c4 c4Var;
        Runnable runnable;
        switch (this.f1604a) {
            case 0:
                e6 e6Var = this.f1605b;
                e6Var.f829t3 = 0.0f;
                e6Var.f823r3.setAlpha(1.0f);
                e6Var.f823r3.setVisibility(8);
                e6Var.f823r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                e6 e6Var2 = this.f1605b;
                e6Var2.N2.unlock();
                e6Var2.H2 = e6Var2.f813o2;
                a4 a4Var = e6Var2.f773b2;
                if (a4Var != null && (runnable = a4Var.f22064w) != null) {
                    runnable.run();
                    a4Var.f22064w = null;
                }
                if (e6Var2.K1 && !e6Var2.f834v2) {
                    jc jcVar = ((ac) e6Var2.Q1).d;
                    if (jcVar.f1110x) {
                        jcVar.f1110x = false;
                        jcVar.P();
                    }
                }
                if (!e6Var2.f834v2 && (c4Var = e6Var2.f782d3) != null) {
                    c4Var.setVisibility(8);
                }
                e6Var2.V2 = true;
                e6Var2.invalidate();
                return;
        }
    }
}
