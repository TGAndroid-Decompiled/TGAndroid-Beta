package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l2 extends AnimatorListenerAdapter {
    public final int f17392a;
    public final f4 f17393b;

    public l2(f4 f4Var, int i10) {
        this.f17392a = i10;
        this.f17393b = f4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r2 r2Var;
        Runnable runnable;
        switch (this.f17392a) {
            case 0:
                f4 f4Var = this.f17393b;
                f4Var.f17102q3 = 0.0f;
                f4Var.f17096o3.setAlpha(1.0f);
                f4Var.f17096o3.setVisibility(8);
                f4Var.f17096o3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                f4 f4Var2 = this.f17393b;
                f4Var2.K2.unlock();
                f4Var2.E2 = f4Var2.f17086l2;
                p2 p2Var = f4Var2.Y1;
                if (p2Var != null && (runnable = p2Var.f24694w) != null) {
                    runnable.run();
                    p2Var.f24694w = null;
                }
                if (f4Var2.H1 && !f4Var2.f17107s2) {
                    i9 i9Var = ((z8) f4Var2.N1).d;
                    if (i9Var.f17304x) {
                        i9Var.f17304x = false;
                        i9Var.P();
                    }
                }
                if (!f4Var2.f17107s2 && (r2Var = f4Var2.f17055a3) != null) {
                    r2Var.setVisibility(8);
                }
                f4Var2.S2 = true;
                f4Var2.invalidate();
                return;
        }
    }
}
