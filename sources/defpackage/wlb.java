package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wlb extends AnimatorListenerAdapter {
    public final qmb a;

    public wlb(qmb qmbVar) {
        this.a = qmbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c;
        qmb qmbVar = this.a;
        rqc[] rqcVarArr = qmbVar.L0;
        if (qmbVar.Y0 != null) {
            c = 0;
        } else {
            c = 2;
        }
        rqcVarArr[c].setVisibility(4);
    }
}
