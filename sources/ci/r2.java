package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r2 extends AnimatorListenerAdapter {
    public final int f5905a;
    public final q4 f5906b;

    public r2(q4 q4Var, int i10) {
        this.f5905a = i10;
        this.f5906b = q4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        x2 x2Var;
        Runnable runnable;
        switch (this.f5905a) {
            case 0:
                q4 q4Var = this.f5906b;
                q4Var.f5823t3 = 0.0f;
                q4Var.f5817r3.setAlpha(1.0f);
                q4Var.f5817r3.setVisibility(8);
                q4Var.f5817r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                q4 q4Var2 = this.f5906b;
                q4Var2.N2.unlock();
                q4Var2.H2 = q4Var2.f5807o2;
                v2 v2Var = q4Var2.f5766b2;
                if (v2Var != null && (runnable = v2Var.f24039w) != null) {
                    runnable.run();
                    v2Var.f24039w = null;
                }
                if (q4Var2.K1 && !q4Var2.f5828v2) {
                    aa aaVar = ((r9) q4Var2.Q1).d;
                    if (aaVar.f5226x) {
                        aaVar.f5226x = false;
                        aaVar.P();
                    }
                }
                if (!q4Var2.f5828v2 && (x2Var = q4Var2.f5775d3) != null) {
                    x2Var.setVisibility(8);
                }
                q4Var2.V2 = true;
                q4Var2.invalidate();
                return;
        }
    }
}
