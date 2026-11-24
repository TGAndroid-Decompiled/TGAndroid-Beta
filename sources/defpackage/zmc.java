package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zmc extends AnimatorListenerAdapter {
    public final x02 a;
    public final lnc b;
    public final anc c;

    public zmc(anc ancVar, x02 x02Var, lnc lncVar) {
        this.c = ancVar;
        this.a = x02Var;
        this.b = lncVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.a != null) {
            gl.t1(this.b);
        }
    }
}
