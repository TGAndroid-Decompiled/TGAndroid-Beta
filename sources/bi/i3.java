package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f3091a;
    public final o5 f3092b;

    public i3(o5 o5Var, int i10) {
        this.f3091a = i10;
        this.f3092b = o5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p3 p3Var;
        Runnable runnable;
        switch (this.f3091a) {
            case 0:
                o5 o5Var = this.f3092b;
                o5Var.f3462t3 = 0.0f;
                o5Var.f3456r3.setAlpha(1.0f);
                o5Var.f3456r3.setVisibility(8);
                o5Var.f3456r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                o5 o5Var2 = this.f3092b;
                o5Var2.N2.unlock();
                o5Var2.H2 = o5Var2.f3446o2;
                n3 n3Var = o5Var2.f3406b2;
                if (n3Var != null && (runnable = n3Var.f23787w) != null) {
                    runnable.run();
                    n3Var.f23787w = null;
                }
                if (o5Var2.K1 && !o5Var2.f3467v2) {
                    pb pbVar = ((gb) o5Var2.Q1).d;
                    if (pbVar.f3584x) {
                        pbVar.f3584x = false;
                        pbVar.P();
                    }
                }
                if (!o5Var2.f3467v2 && (p3Var = o5Var2.f3415d3) != null) {
                    p3Var.setVisibility(8);
                }
                o5Var2.V2 = true;
                o5Var2.invalidate();
                return;
        }
    }
}
