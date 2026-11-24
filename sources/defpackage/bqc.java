package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bqc extends AnimatorListenerAdapter {
    public final x02 a;
    public final lnc b;
    public final cqc c;

    public bqc(cqc cqcVar, x02 x02Var, lnc lncVar) {
        this.c = cqcVar;
        this.a = x02Var;
        this.b = lncVar;
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
            gl.t1(this.b);
        }
    }
}
