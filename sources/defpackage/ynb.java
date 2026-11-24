package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ynb extends AnimatorListenerAdapter {
    public final rob a;

    public ynb(rob robVar) {
        this.a = robVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rob robVar = this.a;
        if (robVar.Y0 == null) {
            robVar.L0[0].setVisibility(4);
        }
    }
}
