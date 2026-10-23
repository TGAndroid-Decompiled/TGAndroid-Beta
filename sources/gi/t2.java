package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.k6;
public final class t2 extends AnimatorListenerAdapter {
    public final int f11487a;
    public final int f11488b;
    public final w1 f11489c;
    public final d3 d;

    public t2(d3 d3Var, int i10, int i11, w1 w1Var) {
        this.d = d3Var;
        this.f11487a = i10;
        this.f11488b = i11;
        this.f11489c = w1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.f11487a, this.f11488b);
        d3 d3Var = this.d;
        d3Var.R = f7;
        d3Var.h();
        c3 c3Var = d3Var.f11164f;
        c3Var.invalidate();
        a3 a3Var = d3Var.X;
        a3Var.setBackgroundColor(d3Var.R);
        w1 w1Var = this.f11489c;
        w1Var.b(a3Var, 1.0f);
        d3Var.f11156a = w1Var.a(k6.Ii);
        c3Var.invalidate();
    }
}
