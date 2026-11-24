package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xnb extends AnimatorListenerAdapter {
    public final rob a;

    public xnb(rob robVar) {
        this.a = robVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c;
        rob robVar = this.a;
        tsc[] tscVarArr = robVar.L0;
        if (robVar.Y0 != null) {
            c = 0;
        } else {
            c = 2;
        }
        tscVarArr[c].setVisibility(4);
    }
}
