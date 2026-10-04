package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.i6;
public final class a3 extends AnimatorListenerAdapter {
    public final int f8915a;
    public final int f8916b;
    public final d2 f8917c;
    public final l3 d;

    public a3(l3 l3Var, int i10, int i11, d2 d2Var) {
        this.d = l3Var;
        this.f8915a = i10;
        this.f8916b = i11;
        this.f8917c = d2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f8915a, this.f8916b);
        l3 l3Var = this.d;
        l3Var.Q = d;
        l3Var.h();
        k3 k3Var = l3Var.f9157e;
        k3Var.invalidate();
        i3 i3Var = l3Var.W;
        i3Var.setBackgroundColor(l3Var.Q);
        d2 d2Var = this.f8917c;
        d2Var.b(i3Var, 1.0f);
        l3Var.f9150a = d2Var.a(i6.Ii);
        k3Var.invalidate();
    }
}
