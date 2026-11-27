package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vpb extends AnimatorListenerAdapter {
    public final pqb a;

    public vpb(pqb pqbVar) {
        this.a = pqbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c;
        pqb pqbVar = this.a;
        fvc[] fvcVarArr = pqbVar.L0;
        if (pqbVar.Y0 != null) {
            c = 0;
        } else {
            c = 2;
        }
        fvcVarArr[c].setVisibility(4);
    }
}
