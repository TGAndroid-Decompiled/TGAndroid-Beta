package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k9 extends AnimatorListenerAdapter {
    public final int f8748a;
    public final m9 f8749b;

    public k9(m9 m9Var, int i10) {
        this.f8748a = i10;
        this.f8749b = m9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8748a) {
            case 0:
                y9 y9Var = this.f8749b.f8807x0;
                y9Var.X = 0.0f;
                y9.k(y9Var);
                return;
            default:
                y9 y9Var2 = this.f8749b.f8807x0;
                y9Var2.W = 0.0f;
                y9Var2.Z = 0.0f;
                y9.k(y9Var2);
                return;
        }
    }
}
