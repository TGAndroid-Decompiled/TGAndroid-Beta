package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gl0;
public final class t5 extends AnimatorListenerAdapter {
    public final int f7830a;
    public final gl0 f7831b;

    public t5(gl0 gl0Var, int i10) {
        this.f7830a = i10;
        this.f7831b = gl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7830a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f7831b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f7831b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                gl0 gl0Var = this.f7831b;
                gl0Var.Q = null;
                gl0Var.f25344n0 = 0.0f;
                gl0Var.f25342l0 = null;
                gl0Var.invalidate();
                return;
        }
    }
}
