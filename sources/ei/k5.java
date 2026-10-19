package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cl0;
public final class k5 extends AnimatorListenerAdapter {
    public final int f9314a;
    public final cl0 f9315b;

    public k5(cl0 cl0Var, int i10) {
        this.f9314a = i10;
        this.f9315b = cl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9314a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f9315b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f9315b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                cl0 cl0Var = this.f9315b;
                cl0Var.Q = null;
                cl0Var.f25262n0 = 0.0f;
                cl0Var.f25260l0 = null;
                cl0Var.invalidate();
                return;
        }
    }
}
