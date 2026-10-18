package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.h6;
public final class t2 extends AnimatorListenerAdapter {
    public final int f11464a;
    public final int f11465b;
    public final w1 f11466c;
    public final d3 d;

    public t2(d3 d3Var, int i10, int i11, w1 w1Var) {
        this.d = d3Var;
        this.f11464a = i10;
        this.f11465b = i11;
        this.f11466c = w1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.f11464a, this.f11465b);
        d3 d3Var = this.d;
        d3Var.Q = f7;
        d3Var.h();
        c3 c3Var = d3Var.e;
        c3Var.invalidate();
        a3 a3Var = d3Var.W;
        a3Var.setBackgroundColor(d3Var.Q);
        w1 w1Var = this.f11466c;
        w1Var.b(a3Var, 1.0f);
        d3Var.f11137a = w1Var.a(h6.Ii);
        c3Var.invalidate();
    }
}
