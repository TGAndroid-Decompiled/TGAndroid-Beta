package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sk0;
public final class u5 extends AnimatorListenerAdapter {
    public final int f6062a;
    public final sk0 f6063b;

    public u5(sk0 sk0Var, int i10) {
        this.f6062a = i10;
        this.f6063b = sk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6062a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f6063b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f6063b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                sk0 sk0Var = this.f6063b;
                sk0Var.Q = null;
                sk0Var.f30782n0 = 0.0f;
                sk0Var.f30780l0 = null;
                sk0Var.invalidate();
                return;
        }
    }
}
