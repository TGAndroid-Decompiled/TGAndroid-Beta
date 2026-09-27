package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sk0;
public final class u5 extends AnimatorListenerAdapter {
    public final int f5632a;
    public final sk0 f5633b;

    public u5(sk0 sk0Var, int i10) {
        this.f5632a = i10;
        this.f5633b = sk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5632a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5633b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f5633b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                sk0 sk0Var = this.f5633b;
                sk0Var.Q = null;
                sk0Var.f28309n0 = 0.0f;
                sk0Var.f28307l0 = null;
                sk0Var.invalidate();
                return;
        }
    }
}
