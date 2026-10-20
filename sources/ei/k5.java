package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
public final class k5 extends AnimatorListenerAdapter {
    public final int f9312a;
    public final dl0 f9313b;

    public k5(dl0 dl0Var, int i10) {
        this.f9312a = i10;
        this.f9313b = dl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9312a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f9313b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f9313b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                dl0 dl0Var = this.f9313b;
                dl0Var.Q = null;
                dl0Var.f25549n0 = 0.0f;
                dl0Var.f25547l0 = null;
                dl0Var.invalidate();
                return;
        }
    }
}
