package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nl0;
public final class t5 extends AnimatorListenerAdapter {
    public final int f5996a;
    public final nl0 f5997b;

    public t5(nl0 nl0Var, int i10) {
        this.f5996a = i10;
        this.f5997b = nl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5996a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5997b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f5997b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                nl0 nl0Var = this.f5997b;
                nl0Var.Q = null;
                nl0Var.f28852n0 = 0.0f;
                nl0Var.f28850l0 = null;
                nl0Var.invalidate();
                return;
        }
    }
}
