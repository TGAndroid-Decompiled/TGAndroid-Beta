package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sk0;
public final class u5 extends AnimatorListenerAdapter {
    public final int f6063a;
    public final sk0 f6064b;

    public u5(sk0 sk0Var, int i10) {
        this.f6063a = i10;
        this.f6064b = sk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6063a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f6064b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f6064b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                sk0 sk0Var = this.f6064b;
                sk0Var.Q = null;
                sk0Var.f30788n0 = 0.0f;
                sk0Var.f30786l0 = null;
                sk0Var.invalidate();
                return;
        }
    }
}
