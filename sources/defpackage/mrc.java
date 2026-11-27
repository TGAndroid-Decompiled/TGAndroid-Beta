package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mrc extends AnimatorListenerAdapter {
    public final n12 a;
    public final yrc b;
    public final nrc c;

    public mrc(nrc nrcVar, n12 n12Var, yrc yrcVar) {
        this.c = nrcVar;
        this.a = n12Var;
        this.b = yrcVar;
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
            hl.t1(this.b);
        }
    }
}
