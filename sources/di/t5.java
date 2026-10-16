package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gl0;
public final class t5 extends AnimatorListenerAdapter {
    public final int f7833a;
    public final gl0 f7834b;

    public t5(gl0 gl0Var, int i10) {
        this.f7833a = i10;
        this.f7834b = gl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7833a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f7834b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f7834b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                gl0 gl0Var = this.f7834b;
                gl0Var.Q = null;
                gl0Var.f25033n0 = 0.0f;
                gl0Var.f25031l0 = null;
                gl0Var.invalidate();
                return;
        }
    }
}
