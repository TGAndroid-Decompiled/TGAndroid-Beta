package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class puc extends AnimatorListenerAdapter {
    public final n12 a;
    public final yrc b;
    public final quc c;

    public puc(quc qucVar, n12 n12Var, yrc yrcVar) {
        this.c = qucVar;
        this.a = n12Var;
        this.b = yrcVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.a != null) {
            hl.t1(this.b);
        }
    }
}
