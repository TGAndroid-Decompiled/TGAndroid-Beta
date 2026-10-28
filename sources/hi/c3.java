package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.y6;
public final class c3 extends AnimatorListenerAdapter {
    public final int f12910a;
    public final int f12911b;
    public final d2 f12912c;
    public final m3 d;

    public c3(m3 m3Var, int i10, int i11, d2 d2Var) {
        this.d = m3Var;
        this.f12910a = i10;
        this.f12911b = i11;
        this.f12912c = d2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.f12910a, this.f12911b);
        m3 m3Var = this.d;
        m3Var.R = f7;
        m3Var.h();
        l3 l3Var = m3Var.f13108f;
        l3Var.invalidate();
        j3 j3Var = m3Var.X;
        j3Var.setBackgroundColor(m3Var.R);
        d2 d2Var = this.f12912c;
        d2Var.b(j3Var, 1.0f);
        m3Var.f13100a = d2Var.a(y6.Ii);
        l3Var.invalidate();
    }
}
