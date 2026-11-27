package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h59 extends AnimatorListenerAdapter {
    public final g59 a;
    public final i59 b;

    public h59(i59 i59Var, g59 g59Var) {
        this.b = i59Var;
        this.a = g59Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g59 g59Var = this.a;
        g59Var.setLayerType(0, null);
        this.b.d.removeView(g59Var);
    }
}
