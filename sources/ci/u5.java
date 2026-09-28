package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sk0;
public final class u5 extends AnimatorListenerAdapter {
    public final int f5606a;
    public final sk0 f5607b;

    public u5(sk0 sk0Var, int i10) {
        this.f5606a = i10;
        this.f5607b = sk0Var;
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
                sk0 sk0Var = this.f5607b;
                sk0Var.Q = null;
                sk0Var.f28291n0 = 0.0f;
                sk0Var.f28289l0 = null;
                sk0Var.invalidate();
                return;
        }
    }
}
