package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.i6;
public final class a3 extends AnimatorListenerAdapter {
    public final int f8914a;
    public final int f8915b;
    public final d2 f8916c;
    public final l3 d;

    public a3(l3 l3Var, int i10, int i11, d2 d2Var) {
        this.d = l3Var;
        this.f8914a = i10;
        this.f8915b = i11;
        this.f8916c = d2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f8914a, this.f8915b);
        l3 l3Var = this.d;
        l3Var.Q = d;
        l3Var.h();
        k3 k3Var = l3Var.f9156e;
        k3Var.invalidate();
        i3 i3Var = l3Var.W;
        i3Var.setBackgroundColor(l3Var.Q);
        d2 d2Var = this.f8916c;
        d2Var.b(i3Var, 1.0f);
        l3Var.f9149a = d2Var.a(i6.Ii);
        k3Var.invalidate();
    }
}
