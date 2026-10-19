package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cl0;
public final class k5 extends AnimatorListenerAdapter {
    public final int f9312a;
    public final cl0 f9313b;

    public k5(cl0 cl0Var, int i10) {
        this.f9312a = i10;
        this.f9313b = cl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9312a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f9313b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f9313b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                cl0 cl0Var = this.f9313b;
                cl0Var.Q = null;
                cl0Var.f25260n0 = 0.0f;
                cl0Var.f25258l0 = null;
                cl0Var.invalidate();
                return;
        }
    }
}
