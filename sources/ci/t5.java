package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ml0;
public final class t5 extends AnimatorListenerAdapter {
    public final int f5997a;
    public final ml0 f5998b;

    public t5(ml0 ml0Var, int i10) {
        this.f5997a = i10;
        this.f5998b = ml0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5997a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5998b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f5998b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                ml0 ml0Var = this.f5998b;
                ml0Var.Q = null;
                ml0Var.f28778n0 = 0.0f;
                ml0Var.f28776l0 = null;
                ml0Var.invalidate();
                return;
        }
    }
}
