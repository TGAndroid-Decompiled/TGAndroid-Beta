package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qk0;
public final class v5 extends AnimatorListenerAdapter {
    public final int f5654a;
    public final qk0 f5655b;

    public v5(qk0 qk0Var, int i10) {
        this.f5654a = i10;
        this.f5655b = qk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5654a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5655b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f5655b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                qk0 qk0Var = this.f5655b;
                qk0Var.Q = null;
                qk0Var.f27661n0 = 0.0f;
                qk0Var.f27659l0 = null;
                qk0Var.invalidate();
                return;
        }
    }
}
