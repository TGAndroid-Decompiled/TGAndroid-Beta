package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.k6;
public final class q2 extends AnimatorListenerAdapter {
    public final int f14883a;
    public final int f14884b;
    public final t1 f14885c;
    public final a3 d;

    public q2(a3 a3Var, int i7, int i10, t1 t1Var) {
        this.d = a3Var;
        this.f14883a = i7;
        this.f14884b = i10;
        this.f14885c = t1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f14883a, this.f14884b);
        a3 a3Var = this.d;
        a3Var.R = f10;
        a3Var.l();
        z2 z2Var = a3Var.f14519f;
        z2Var.invalidate();
        x2 x2Var = a3Var.X;
        x2Var.setBackgroundColor(a3Var.R);
        t1 t1Var = this.f14885c;
        t1Var.b(x2Var, 1.0f);
        a3Var.f14510a = t1Var.a(k6.wj);
        z2Var.invalidate();
    }
}
