package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.g6;
public final class z2 extends AnimatorListenerAdapter {
    public final int f9701a;
    public final int f9702b;
    public final b2 f9703c;
    public final k3 d;

    public z2(k3 k3Var, int i10, int i11, b2 b2Var) {
        this.d = k3Var;
        this.f9701a = i10;
        this.f9702b = i11;
        this.f9703c = b2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f9701a, this.f9702b);
        k3 k3Var = this.d;
        k3Var.Q = d;
        k3Var.h();
        j3 j3Var = k3Var.e;
        j3Var.invalidate();
        h3 h3Var = k3Var.W;
        h3Var.setBackgroundColor(k3Var.Q);
        b2 b2Var = this.f9703c;
        b2Var.b(h3Var, 1.0f);
        k3Var.f9351a = b2Var.a(g6.Ii);
        j3Var.invalidate();
    }
}
