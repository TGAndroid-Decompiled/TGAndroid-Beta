package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gk0;
public final class u5 extends AnimatorListenerAdapter {
    public final int f5606a;
    public final gk0 f5607b;

    public u5(gk0 gk0Var, int i10) {
        this.f5606a = i10;
        this.f5607b = gk0Var;
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
                gk0 gk0Var = this.f5607b;
                gk0Var.Q = null;
                gk0Var.f24345n0 = 0.0f;
                gk0Var.f24343l0 = null;
                gk0Var.invalidate();
                return;
        }
    }
}
