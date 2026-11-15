package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.j6;
public final class n2 extends AnimatorListenerAdapter {
    public final int f18464a;
    public final int f18465b;
    public final u1 f18466c;
    public final x2 d;

    public n2(x2 x2Var, int i7, int i10, u1 u1Var) {
        this.d = x2Var;
        this.f18464a = i7;
        this.f18465b = i10;
        this.f18466c = u1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f18464a, this.f18465b);
        x2 x2Var = this.d;
        x2Var.S = f10;
        x2Var.l();
        w2 w2Var = x2Var.f18661f;
        w2Var.invalidate();
        u2 u2Var = x2Var.Y;
        u2Var.setBackgroundColor(x2Var.S);
        u1 u1Var = this.f18466c;
        u1Var.b(u2Var, 1.0f);
        x2Var.f18651a = u1Var.a(j6.zj);
        w2Var.invalidate();
    }
}
