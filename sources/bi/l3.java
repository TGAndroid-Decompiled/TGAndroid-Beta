package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l3 extends AnimatorListenerAdapter {
    public final int f3274a;
    public final q5 f3275b;

    public l3(q5 q5Var, int i10) {
        this.f3274a = i10;
        this.f3275b = q5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s3 s3Var;
        Runnable runnable;
        switch (this.f3274a) {
            case 0:
                q5 q5Var = this.f3275b;
                q5Var.f3569t3 = 0.0f;
                q5Var.f3563r3.setAlpha(1.0f);
                q5Var.f3563r3.setVisibility(8);
                q5Var.f3563r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                q5 q5Var2 = this.f3275b;
                q5Var2.N2.unlock();
                q5Var2.H2 = q5Var2.f3553o2;
                q3 q3Var = q5Var2.f3512b2;
                if (q3Var != null && (runnable = q3Var.f22676w) != null) {
                    runnable.run();
                    q3Var.f22676w = null;
                }
                if (q5Var2.K1 && !q5Var2.f3574v2) {
                    sb sbVar = ((jb) q5Var2.Q1).d;
                    if (sbVar.f3716x) {
                        sbVar.f3716x = false;
                        sbVar.P();
                    }
                }
                if (!q5Var2.f3574v2 && (s3Var = q5Var2.f3521d3) != null) {
                    s3Var.setVisibility(8);
                }
                q5Var2.V2 = true;
                q5Var2.invalidate();
                return;
        }
    }
}
