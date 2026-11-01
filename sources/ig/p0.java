package ig;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final int f8390a;
    public final q0 f8391b;

    public p0(q0 q0Var, int i10) {
        this.f8390a = i10;
        this.f8391b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8390a) {
            case 0:
                q0 q0Var = this.f8391b;
                q0Var.K = null;
                q0Var.f8414f.f(new gg.c(this, 6));
                return;
            default:
                this.f8391b.f8414f.f(new gg.c(this, 7));
                return;
        }
    }
}
