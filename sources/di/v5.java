package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;
public final class v5 extends AnimatorListenerAdapter {
    public final int f8288a;
    public final fk0 f8289b;

    public v5(fk0 fk0Var, int i10) {
        this.f8288a = i10;
        this.f8289b = fk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8288a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f8289b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f8289b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                fk0 fk0Var = this.f8289b;
                fk0Var.Q = null;
                fk0Var.f26105n0 = 0.0f;
                fk0Var.f26103l0 = null;
                fk0Var.invalidate();
                return;
        }
    }
}
