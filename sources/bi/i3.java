package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f3118a;
    public final o5 f3119b;

    public i3(o5 o5Var, int i10) {
        this.f3118a = i10;
        this.f3119b = o5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p3 p3Var;
        Runnable runnable;
        switch (this.f3118a) {
            case 0:
                o5 o5Var = this.f3119b;
                o5Var.f3489t3 = 0.0f;
                o5Var.f3483r3.setAlpha(1.0f);
                o5Var.f3483r3.setVisibility(8);
                o5Var.f3483r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                o5 o5Var2 = this.f3119b;
                o5Var2.N2.unlock();
                o5Var2.H2 = o5Var2.f3473o2;
                n3 n3Var = o5Var2.f3433b2;
                if (n3Var != null && (runnable = n3Var.f23814w) != null) {
                    runnable.run();
                    n3Var.f23814w = null;
                }
                if (o5Var2.K1 && !o5Var2.f3494v2) {
                    pb pbVar = ((gb) o5Var2.Q1).d;
                    if (pbVar.f3611x) {
                        pbVar.f3611x = false;
                        pbVar.P();
                    }
                }
                if (!o5Var2.f3494v2 && (p3Var = o5Var2.f3442d3) != null) {
                    p3Var.setVisibility(8);
                }
                o5Var2.V2 = true;
                o5Var2.invalidate();
                return;
        }
    }
}
