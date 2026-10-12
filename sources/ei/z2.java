package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.h6;
public final class z2 extends AnimatorListenerAdapter {
    public final int f9518a;
    public final int f9519b;
    public final c2 f9520c;
    public final k3 d;

    public z2(k3 k3Var, int i10, int i11, c2 c2Var) {
        this.d = k3Var;
        this.f9518a = i10;
        this.f9519b = i11;
        this.f9520c = c2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f9518a, this.f9519b);
        k3 k3Var = this.d;
        k3Var.Q = d;
        k3Var.h();
        j3 j3Var = k3Var.f9156e;
        j3Var.invalidate();
        h3 h3Var = k3Var.W;
        h3Var.setBackgroundColor(k3Var.Q);
        c2 c2Var = this.f9520c;
        c2Var.b(h3Var, 1.0f);
        k3Var.f9149a = c2Var.a(h6.Ii);
        j3Var.invalidate();
    }
}
