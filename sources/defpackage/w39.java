package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w39 extends AnimatorListenerAdapter {
    public final v39 a;
    public final x39 b;

    public w39(x39 x39Var, v39 v39Var) {
        this.b = x39Var;
        this.a = v39Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v39 v39Var = this.a;
        v39Var.setLayerType(0, null);
        this.b.d.removeView(v39Var);
    }
}
