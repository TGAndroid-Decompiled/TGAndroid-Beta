package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.n6;
public final class i2 extends AnimatorListenerAdapter {
    public final int f18811a;
    public final int f18812b;
    public final p1 f18813c;
    public final t2 d;

    public i2(t2 t2Var, int i7, int i10, p1 p1Var) {
        this.d = t2Var;
        this.f18811a = i7;
        this.f18812b = i10;
        this.f18813c = p1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f18811a, this.f18812b);
        t2 t2Var = this.d;
        t2Var.S = f10;
        t2Var.l();
        s2 s2Var = t2Var.f19025f;
        s2Var.invalidate();
        q2 q2Var = t2Var.Y;
        q2Var.setBackgroundColor(t2Var.S);
        p1 p1Var = this.f18813c;
        p1Var.b(q2Var, 1.0f);
        t2Var.f19015a = p1Var.a(n6.zj);
        s2Var.invalidate();
    }
}
