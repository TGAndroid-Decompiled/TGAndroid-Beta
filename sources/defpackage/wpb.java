package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wpb extends AnimatorListenerAdapter {
    public final pqb a;

    public wpb(pqb pqbVar) {
        this.a = pqbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pqb pqbVar = this.a;
        if (pqbVar.Y0 == null) {
            pqbVar.L0[0].setVisibility(4);
        }
    }
}
