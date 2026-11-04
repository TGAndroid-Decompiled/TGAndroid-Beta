package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c9 extends AnimatorListenerAdapter {
    public final int f10182a;
    public final e9 f10183b;

    public c9(e9 e9Var, int i3) {
        this.f10182a = i3;
        this.f10183b = e9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10182a) {
            case 0:
                r9 r9Var = this.f10183b.f10249s0;
                r9Var.Y = 0.0f;
                r9.w(r9Var);
                return;
            default:
                r9 r9Var2 = this.f10183b.f10249s0;
                r9Var2.X = 0.0f;
                r9Var2.f10909a0 = 0.0f;
                r9.w(r9Var2);
                return;
        }
    }
}
