package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gl0;
public final class k5 extends AnimatorListenerAdapter {
    public final int f9323a;
    public final gl0 f9324b;

    public k5(gl0 gl0Var, int i10) {
        this.f9323a = i10;
        this.f9324b = gl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9323a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f9324b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f9324b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                gl0 gl0Var = this.f9324b;
                gl0Var.Q = null;
                gl0Var.f26656n0 = 0.0f;
                gl0Var.f26654l0 = null;
                gl0Var.invalidate();
                return;
        }
    }
}
