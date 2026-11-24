package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xlb extends AnimatorListenerAdapter {
    public final qmb a;

    public xlb(qmb qmbVar) {
        this.a = qmbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qmb qmbVar = this.a;
        if (qmbVar.Y0 == null) {
            qmbVar.L0[0].setVisibility(4);
        }
    }
}
