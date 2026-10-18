package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cl0;
public final class k5 extends AnimatorListenerAdapter {
    public final int f9313a;
    public final cl0 f9314b;

    public k5(cl0 cl0Var, int i10) {
        this.f9313a = i10;
        this.f9314b = cl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9313a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f9314b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f9314b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                cl0 cl0Var = this.f9314b;
                cl0Var.Q = null;
                cl0Var.f25284n0 = 0.0f;
                cl0Var.f25282l0 = null;
                cl0Var.invalidate();
                return;
        }
    }
}
