package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;
public final class v5 extends AnimatorListenerAdapter {
    public final int f8316a;
    public final fk0 f8317b;

    public v5(fk0 fk0Var, int i10) {
        this.f8316a = i10;
        this.f8317b = fk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8316a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f8317b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f8317b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                fk0 fk0Var = this.f8317b;
                fk0Var.Q = null;
                fk0Var.f26132n0 = 0.0f;
                fk0Var.f26130l0 = null;
                fk0Var.invalidate();
                return;
        }
    }
}
