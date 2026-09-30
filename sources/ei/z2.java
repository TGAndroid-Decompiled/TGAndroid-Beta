package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.h6;
public final class z2 extends AnimatorListenerAdapter {
    public final int f8745a;
    public final int f8746b;
    public final c2 f8747c;
    public final k3 d;

    public z2(k3 k3Var, int i10, int i11, c2 c2Var) {
        this.d = k3Var;
        this.f8745a = i10;
        this.f8746b = i11;
        this.f8747c = c2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f8745a, this.f8746b);
        k3 k3Var = this.d;
        k3Var.Q = d;
        k3Var.h();
        j3 j3Var = k3Var.e;
        j3Var.invalidate();
        h3 h3Var = k3Var.W;
        h3Var.setBackgroundColor(k3Var.Q);
        c2 c2Var = this.f8747c;
        c2Var.b(h3Var, 1.0f);
        k3Var.f8408a = c2Var.a(h6.Ii);
        j3Var.invalidate();
    }
}
