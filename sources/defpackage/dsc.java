package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dsc extends AnimatorListenerAdapter {
    public final i22 a;
    public final npc b;
    public final esc c;

    public dsc(esc escVar, i22 i22Var, npc npcVar) {
        this.c = escVar;
        this.a = i22Var;
        this.b = npcVar;
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
            gm.t1(this.b);
        }
    }
}
