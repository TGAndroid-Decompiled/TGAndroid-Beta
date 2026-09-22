package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;
public final class v5 extends AnimatorListenerAdapter {
    public final int f5651a;
    public final fk0 f5652b;

    public v5(fk0 fk0Var, int i10) {
        this.f5651a = i10;
        this.f5652b = fk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5651a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5652b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f5652b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                fk0 fk0Var = this.f5652b;
                fk0Var.Q = null;
                fk0Var.f23992n0 = 0.0f;
                fk0Var.f23990l0 = null;
                fk0Var.invalidate();
                return;
        }
    }
}
