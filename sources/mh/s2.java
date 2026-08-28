package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.f6;
public final class s2 extends AnimatorListenerAdapter {
    public final int f18101a;
    public final int f18102b;
    public final w1 f18103c;
    public final c3 d;

    public s2(c3 c3Var, int i9, int i10, w1 w1Var) {
        this.d = c3Var;
        this.f18101a = i9;
        this.f18102b = i10;
        this.f18103c = w1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f18101a, this.f18102b);
        c3 c3Var = this.d;
        c3Var.M = d;
        c3Var.h();
        b3 b3Var = c3Var.f17754e;
        b3Var.invalidate();
        z2 z2Var = c3Var.S;
        z2Var.setBackgroundColor(c3Var.M);
        w1 w1Var = this.f18103c;
        w1Var.b(z2Var, 1.0f);
        c3Var.f17747a = w1Var.a(f6.Ii);
        b3Var.invalidate();
    }
}
