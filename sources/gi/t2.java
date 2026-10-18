package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.h6;
public final class t2 extends AnimatorListenerAdapter {
    public final int f11462a;
    public final int f11463b;
    public final w1 f11464c;
    public final d3 d;

    public t2(d3 d3Var, int i10, int i11, w1 w1Var) {
        this.d = d3Var;
        this.f11462a = i10;
        this.f11463b = i11;
        this.f11464c = w1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.f11462a, this.f11463b);
        d3 d3Var = this.d;
        d3Var.Q = f7;
        d3Var.h();
        c3 c3Var = d3Var.e;
        c3Var.invalidate();
        a3 a3Var = d3Var.W;
        a3Var.setBackgroundColor(d3Var.Q);
        w1 w1Var = this.f11464c;
        w1Var.b(a3Var, 1.0f);
        d3Var.f11135a = w1Var.a(h6.Ii);
        c3Var.invalidate();
    }
}
