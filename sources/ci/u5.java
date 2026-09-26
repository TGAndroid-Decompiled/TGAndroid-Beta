package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rk0;
public final class u5 extends AnimatorListenerAdapter {
    public final int f5606a;
    public final rk0 f5607b;

    public u5(rk0 rk0Var, int i10) {
        this.f5606a = i10;
        this.f5607b = rk0Var;
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
                rk0 rk0Var = this.f5607b;
                rk0Var.Q = null;
                rk0Var.f27975n0 = 0.0f;
                rk0Var.f27973l0 = null;
                rk0Var.invalidate();
                return;
        }
    }
}
