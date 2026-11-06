package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b9 extends AnimatorListenerAdapter {
    public final int f8856a;
    public final d9 f8857b;

    public b9(d9 d9Var, int i7) {
        this.f8856a = i7;
        this.f8857b = d9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8856a) {
            case 0:
                p9 p9Var = this.f8857b.f8950r0;
                p9Var.X = 0.0f;
                p9.i(p9Var);
                return;
            default:
                p9 p9Var2 = this.f8857b.f8950r0;
                p9Var2.W = 0.0f;
                p9Var2.Z = 0.0f;
                p9.i(p9Var2);
                return;
        }
    }
}
