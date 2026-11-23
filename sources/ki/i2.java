package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.m6;
public final class i2 extends AnimatorListenerAdapter {
    public final int f18706a;
    public final int f18707b;
    public final p1 f18708c;
    public final s2 d;

    public i2(s2 s2Var, int i7, int i10, p1 p1Var) {
        this.d = s2Var;
        this.f18706a = i7;
        this.f18707b = i10;
        this.f18708c = p1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f18706a, this.f18707b);
        s2 s2Var = this.d;
        s2Var.S = f10;
        s2Var.l();
        r2 r2Var = s2Var.f18906f;
        r2Var.invalidate();
        p2 p2Var = s2Var.Y;
        p2Var.setBackgroundColor(s2Var.S);
        p1 p1Var = this.f18708c;
        p1Var.b(p2Var, 1.0f);
        s2Var.f18896a = p1Var.a(m6.zj);
        r2Var.invalidate();
    }
}
