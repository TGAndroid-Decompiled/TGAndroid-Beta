package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o18 extends AnimatorListenerAdapter {
    public final byte a;
    public final y28 b;

    public o18(y28 y28Var, byte b) {
        this.a = b;
        this.b = y28Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s18 s18Var;
        Runnable runnable;
        byte b = this.a;
        y28 y28Var = this.b;
        switch (b) {
            case 0:
                y28Var.j3 = 0.0f;
                y28Var.h3.setAlpha(1.0f);
                y28Var.h3.setVisibility(8);
                y28Var.h3.k();
                return;
            default:
                super.onAnimationEnd(animator);
                y28Var.D2.e();
                y28Var.x2 = y28Var.e2;
                q18 q18Var = y28Var.R1;
                if (q18Var != null && (runnable = q18Var.x) != null) {
                    runnable.run();
                    q18Var.x = null;
                }
                if (y28Var.A1 && !y28Var.l2) {
                    m8b m8bVar = ((d8b) y28Var.G1).d;
                    if (m8bVar.y) {
                        m8bVar.y = false;
                        m8bVar.U();
                    }
                }
                if (!y28Var.l2 && (s18Var = y28Var.T2) != null) {
                    s18Var.setVisibility(8);
                }
                y28Var.L2 = true;
                y28Var.invalidate();
                return;
        }
    }
}
