package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kl0;
public final class t5 extends AnimatorListenerAdapter {
    public final int f5998a;
    public final kl0 f5999b;

    public t5(kl0 kl0Var, int i10) {
        this.f5998a = i10;
        this.f5999b = kl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5998a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5999b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f5999b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                kl0 kl0Var = this.f5999b;
                kl0Var.Q = null;
                kl0Var.f28092n0 = 0.0f;
                kl0Var.f28090l0 = null;
                kl0Var.invalidate();
                return;
        }
    }
}
