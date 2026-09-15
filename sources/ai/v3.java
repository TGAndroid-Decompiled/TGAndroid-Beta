package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v3 extends AnimatorListenerAdapter {
    public final int f1604a;
    public final f6 f1605b;

    public v3(f6 f6Var, int i10) {
        this.f1604a = i10;
        this.f1605b = f6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        c4 c4Var;
        Runnable runnable;
        switch (this.f1604a) {
            case 0:
                f6 f6Var = this.f1605b;
                f6Var.f851t3 = 0.0f;
                f6Var.f845r3.setAlpha(1.0f);
                f6Var.f845r3.setVisibility(8);
                f6Var.f845r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                f6 f6Var2 = this.f1605b;
                f6Var2.N2.unlock();
                f6Var2.H2 = f6Var2.f835o2;
                a4 a4Var = f6Var2.f795b2;
                if (a4Var != null && (runnable = a4Var.f21856w) != null) {
                    runnable.run();
                    a4Var.f21856w = null;
                }
                if (f6Var2.K1 && !f6Var2.f856v2) {
                    jc jcVar = ((ac) f6Var2.Q1).d;
                    if (jcVar.f1114x) {
                        jcVar.f1114x = false;
                        jcVar.P();
                    }
                }
                if (!f6Var2.f856v2 && (c4Var = f6Var2.f804d3) != null) {
                    c4Var.setVisibility(8);
                }
                f6Var2.V2 = true;
                f6Var2.invalidate();
                return;
        }
    }
}
