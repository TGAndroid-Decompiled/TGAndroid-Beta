package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c9 extends AnimatorListenerAdapter {
    public final int f8904a;
    public final e9 f8905b;

    public c9(e9 e9Var, int i7) {
        this.f8904a = i7;
        this.f8905b = e9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8904a) {
            case 0:
                q9 q9Var = this.f8905b.f8975r0;
                q9Var.X = 0.0f;
                q9.i(q9Var);
                return;
            default:
                q9 q9Var2 = this.f8905b.f8975r0;
                q9Var2.W = 0.0f;
                q9Var2.Z = 0.0f;
                q9.i(q9Var2);
                return;
        }
    }
}
