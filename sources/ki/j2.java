package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.n6;
public final class j2 extends AnimatorListenerAdapter {
    public final int f18730a;
    public final int f18731b;
    public final q1 f18732c;
    public final t2 d;

    public j2(t2 t2Var, int i7, int i10, q1 q1Var) {
        this.d = t2Var;
        this.f18730a = i7;
        this.f18731b = i10;
        this.f18732c = q1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f18730a, this.f18731b);
        t2 t2Var = this.d;
        t2Var.S = f10;
        t2Var.l();
        s2 s2Var = t2Var.f18930f;
        s2Var.invalidate();
        q2 q2Var = t2Var.Y;
        q2Var.setBackgroundColor(t2Var.S);
        q1 q1Var = this.f18732c;
        q1Var.b(q2Var, 1.0f);
        t2Var.f18920a = q1Var.a(n6.zj);
        s2Var.invalidate();
    }
}
