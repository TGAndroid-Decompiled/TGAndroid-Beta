package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gk0;
public final class v5 extends AnimatorListenerAdapter {
    public final int f5654a;
    public final gk0 f5655b;

    public v5(gk0 gk0Var, int i10) {
        this.f5654a = i10;
        this.f5655b = gk0Var;
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
                gk0 gk0Var = this.f5655b;
                gk0Var.Q = null;
                gk0Var.f24295n0 = 0.0f;
                gk0Var.f24293l0 = null;
                gk0Var.invalidate();
                return;
        }
    }
}
