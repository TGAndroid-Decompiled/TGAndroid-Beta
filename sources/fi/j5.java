package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gl0;
public final class j5 extends AnimatorListenerAdapter {
    public final int f11054a;
    public final gl0 f11055b;

    public j5(gl0 gl0Var, int i10) {
        this.f11054a = i10;
        this.f11055b = gl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11054a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f11055b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f11055b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                gl0 gl0Var = this.f11055b;
                gl0Var.Q = null;
                gl0Var.f28634n0 = 0.0f;
                gl0Var.f28632l0 = null;
                gl0Var.invalidate();
                return;
        }
    }
}
