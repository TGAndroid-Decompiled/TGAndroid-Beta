package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pk0;
public final class t6 extends AnimatorListenerAdapter {
    public final int f3681a;
    public final pk0 f3682b;

    public t6(pk0 pk0Var, int i10) {
        this.f3681a = i10;
        this.f3682b = pk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3681a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f3682b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f3682b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                pk0 pk0Var = this.f3682b;
                pk0Var.Q = null;
                pk0Var.f26185n0 = 0.0f;
                pk0Var.f26183l0 = null;
                pk0Var.invalidate();
                return;
        }
    }
}
