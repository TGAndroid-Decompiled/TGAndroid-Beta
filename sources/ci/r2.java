package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r2 extends AnimatorListenerAdapter {
    public final int f5907a;
    public final q4 f5908b;

    public r2(q4 q4Var, int i10) {
        this.f5907a = i10;
        this.f5908b = q4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        x2 x2Var;
        Runnable runnable;
        switch (this.f5907a) {
            case 0:
                q4 q4Var = this.f5908b;
                q4Var.f5825t3 = 0.0f;
                q4Var.f5819r3.setAlpha(1.0f);
                q4Var.f5819r3.setVisibility(8);
                q4Var.f5819r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                q4 q4Var2 = this.f5908b;
                q4Var2.N2.unlock();
                q4Var2.H2 = q4Var2.f5809o2;
                v2 v2Var = q4Var2.f5768b2;
                if (v2Var != null && (runnable = v2Var.f24034w) != null) {
                    runnable.run();
                    v2Var.f24034w = null;
                }
                if (q4Var2.K1 && !q4Var2.f5830v2) {
                    aa aaVar = ((r9) q4Var2.Q1).d;
                    if (aaVar.f5228x) {
                        aaVar.f5228x = false;
                        aaVar.P();
                    }
                }
                if (!q4Var2.f5830v2 && (x2Var = q4Var2.f5777d3) != null) {
                    x2Var.setVisibility(8);
                }
                q4Var2.V2 = true;
                q4Var2.invalidate();
                return;
        }
    }
}
