package ih;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l2 extends AnimatorListenerAdapter {
    public final int f11697a;
    public final i4 f11698b;

    public l2(i4 i4Var, int i9) {
        this.f11697a = i9;
        this.f11698b = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r2 r2Var;
        Runnable runnable;
        switch (this.f11697a) {
            case 0:
                i4 i4Var = this.f11698b;
                i4Var.f11576p3 = 0.0f;
                i4Var.f11570n3.setAlpha(1.0f);
                i4Var.f11570n3.setVisibility(8);
                i4Var.f11570n3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                i4 i4Var2 = this.f11698b;
                i4Var2.J2.unlock();
                i4Var2.D2 = i4Var2.f11561k2;
                p2 p2Var = i4Var2.X1;
                if (p2Var != null && (runnable = p2Var.f26196w) != null) {
                    runnable.run();
                    p2Var.f26196w = null;
                }
                if (i4Var2.G1 && !i4Var2.f11581r2) {
                    m9 m9Var = ((d9) i4Var2.M1).d;
                    if (m9Var.f11832x) {
                        m9Var.f11832x = false;
                        m9Var.P();
                    }
                }
                if (!i4Var2.f11581r2 && (r2Var = i4Var2.Z2) != null) {
                    r2Var.setVisibility(8);
                }
                i4Var2.R2 = true;
                i4Var2.invalidate();
                return;
        }
    }
}
