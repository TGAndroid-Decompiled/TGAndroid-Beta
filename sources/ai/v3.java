package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v3 extends AnimatorListenerAdapter {
    public final int f1606a;
    public final f6 f1607b;

    public v3(f6 f6Var, int i10) {
        this.f1606a = i10;
        this.f1607b = f6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        c4 c4Var;
        Runnable runnable;
        switch (this.f1606a) {
            case 0:
                f6 f6Var = this.f1607b;
                f6Var.f853t3 = 0.0f;
                f6Var.f847r3.setAlpha(1.0f);
                f6Var.f847r3.setVisibility(8);
                f6Var.f847r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                f6 f6Var2 = this.f1607b;
                f6Var2.N2.unlock();
                f6Var2.H2 = f6Var2.f837o2;
                a4 a4Var = f6Var2.f797b2;
                if (a4Var != null && (runnable = a4Var.f22093w) != null) {
                    runnable.run();
                    a4Var.f22093w = null;
                }
                if (f6Var2.K1 && !f6Var2.f858v2) {
                    jc jcVar = ((ac) f6Var2.Q1).d;
                    if (jcVar.f1116x) {
                        jcVar.f1116x = false;
                        jcVar.P();
                    }
                }
                if (!f6Var2.f858v2 && (c4Var = f6Var2.f806d3) != null) {
                    c4Var.setVisibility(8);
                }
                f6Var2.V2 = true;
                f6Var2.invalidate();
                return;
        }
    }
}
