package ih;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y8 extends AnimatorListenerAdapter {
    public final int f12354a;
    public final a9 f12355b;

    public y8(a9 a9Var, int i9) {
        this.f12354a = i9;
        this.f12355b = a9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12354a) {
            case 0:
                m9 m9Var = this.f12355b.E0;
                m9Var.T = 0.0f;
                m9.k(m9Var);
                return;
            default:
                m9 m9Var2 = this.f12355b.E0;
                m9Var2.S = 0.0f;
                m9Var2.V = 0.0f;
                m9.k(m9Var2);
                return;
        }
    }
}
