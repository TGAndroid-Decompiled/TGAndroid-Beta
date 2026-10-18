package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l9 extends AnimatorListenerAdapter {
    public final int f5525a;
    public final n9 f5526b;

    public l9(n9 n9Var, int i10) {
        this.f5525a = i10;
        this.f5526b = n9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5525a) {
            case 0:
                z9 z9Var = this.f5526b.I0;
                z9Var.X = 0.0f;
                z9.k(z9Var);
                return;
            default:
                z9 z9Var2 = this.f5526b.I0;
                z9Var2.W = 0.0f;
                z9Var2.Z = 0.0f;
                z9.k(z9Var2);
                return;
        }
    }
}
