package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.j6;
public final class c3 extends AnimatorListenerAdapter {
    public final int f6560a;
    public final int f6561b;
    public final f2 f6562c;
    public final n3 d;

    public c3(n3 n3Var, int i10, int i11, f2 f2Var) {
        this.d = n3Var;
        this.f6560a = i10;
        this.f6561b = i11;
        this.f6562c = f2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f6560a, this.f6561b);
        n3 n3Var = this.d;
        n3Var.Q = d;
        n3Var.h();
        m3 m3Var = n3Var.e;
        m3Var.invalidate();
        k3 k3Var = n3Var.W;
        k3Var.setBackgroundColor(n3Var.Q);
        f2 f2Var = this.f6562c;
        f2Var.b(k3Var, 1.0f);
        n3Var.f6782a = f2Var.a(j6.Ii);
        m3Var.invalidate();
    }
}
