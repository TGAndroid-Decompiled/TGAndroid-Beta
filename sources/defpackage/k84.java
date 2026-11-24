package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k84 extends AnimatorListenerAdapter {
    public final m84 a;

    public k84(m84 m84Var) {
        this.a = m84Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m84 m84Var = this.a;
        if (m84Var.r) {
            m84Var.d.setVisibility(4);
        } else {
            m84Var.e.setVisibility(4);
        }
    }
}
