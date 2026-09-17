package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.j6;
public final class z2 extends AnimatorListenerAdapter {
    public final int f10159a;
    public final int f10160b;
    public final c2 f10161c;
    public final k3 d;

    public z2(k3 k3Var, int i10, int i11, c2 c2Var) {
        this.d = k3Var;
        this.f10159a = i10;
        this.f10160b = i11;
        this.f10161c = c2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f10159a, this.f10160b);
        k3 k3Var = this.d;
        k3Var.Q = d;
        k3Var.h();
        j3 j3Var = k3Var.f9793e;
        j3Var.invalidate();
        h3 h3Var = k3Var.W;
        h3Var.setBackgroundColor(k3Var.Q);
        c2 c2Var = this.f10161c;
        c2Var.b(h3Var, 1.0f);
        k3Var.f9786a = c2Var.a(j6.Ii);
        j3Var.invalidate();
    }
}
