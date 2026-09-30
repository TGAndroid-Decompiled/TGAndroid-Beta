package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tk0;
public final class u5 extends AnimatorListenerAdapter {
    public final int f5615a;
    public final tk0 f5616b;

    public u5(tk0 tk0Var, int i10) {
        this.f5615a = i10;
        this.f5616b = tk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5615a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5616b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f5616b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                tk0 tk0Var = this.f5616b;
                tk0Var.Q = null;
                tk0Var.f28579n0 = 0.0f;
                tk0Var.f28577l0 = null;
                tk0Var.invalidate();
                return;
        }
    }
}
