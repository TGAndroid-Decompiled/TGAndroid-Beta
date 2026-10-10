package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ll0;
public final class t5 extends AnimatorListenerAdapter {
    public final int f5998a;
    public final ll0 f5999b;

    public t5(ll0 ll0Var, int i10) {
        this.f5998a = i10;
        this.f5999b = ll0Var;
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
                ll0 ll0Var = this.f5999b;
                ll0Var.Q = null;
                ll0Var.f28407n0 = 0.0f;
                ll0Var.f28405l0 = null;
                ll0Var.invalidate();
                return;
        }
    }
}
