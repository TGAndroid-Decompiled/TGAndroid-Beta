package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qk0;
public final class u5 extends AnimatorListenerAdapter {
    public final int f5606a;
    public final qk0 f5607b;

    public u5(qk0 qk0Var, int i10) {
        this.f5606a = i10;
        this.f5607b = qk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5606a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5607b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f5607b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                qk0 qk0Var = this.f5607b;
                qk0Var.Q = null;
                qk0Var.f27680n0 = 0.0f;
                qk0Var.f27678l0 = null;
                qk0Var.invalidate();
                return;
        }
    }
}
