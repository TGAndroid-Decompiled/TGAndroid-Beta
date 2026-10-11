package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.h6;
public final class z2 extends AnimatorListenerAdapter {
    public final int f9520a;
    public final int f9521b;
    public final c2 f9522c;
    public final k3 d;

    public z2(k3 k3Var, int i10, int i11, c2 c2Var) {
        this.d = k3Var;
        this.f9520a = i10;
        this.f9521b = i11;
        this.f9522c = c2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f9520a, this.f9521b);
        k3 k3Var = this.d;
        k3Var.Q = d;
        k3Var.h();
        j3 j3Var = k3Var.f9158e;
        j3Var.invalidate();
        h3 h3Var = k3Var.W;
        h3Var.setBackgroundColor(k3Var.Q);
        c2 c2Var = this.f9522c;
        c2Var.b(h3Var, 1.0f);
        k3Var.f9151a = c2Var.a(h6.Ii);
        j3Var.invalidate();
    }
}
