package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;
public final class v5 extends AnimatorListenerAdapter {
    public final int f5649a;
    public final fk0 f5650b;

    public v5(fk0 fk0Var, int i10) {
        this.f5649a = i10;
        this.f5650b = fk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5649a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5650b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f5650b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                fk0 fk0Var = this.f5650b;
                fk0Var.Q = null;
                fk0Var.f23993n0 = 0.0f;
                fk0Var.f23991l0 = null;
                fk0Var.invalidate();
                return;
        }
    }
}
