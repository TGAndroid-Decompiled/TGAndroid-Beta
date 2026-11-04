package ii;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.k6;
public final class q2 extends AnimatorListenerAdapter {
    public final int f15161a;
    public final int f15162b;
    public final u1 f15163c;
    public final a3 d;

    public q2(a3 a3Var, int i3, int i10, u1 u1Var) {
        this.d = a3Var;
        this.f15161a = i3;
        this.f15162b = i10;
        this.f15163c = u1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f15161a, this.f15162b);
        a3 a3Var = this.d;
        a3Var.S = f10;
        a3Var.l();
        z2 z2Var = a3Var.f14802f;
        z2Var.invalidate();
        x2 x2Var = a3Var.Y;
        x2Var.setBackgroundColor(a3Var.S);
        u1 u1Var = this.f15163c;
        u1Var.b(x2Var, 1.0f);
        a3Var.f14792a = u1Var.a(k6.wj);
        z2Var.invalidate();
    }
}
