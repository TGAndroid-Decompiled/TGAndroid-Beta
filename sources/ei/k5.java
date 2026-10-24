package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fl0;
public final class k5 extends AnimatorListenerAdapter {
    public final int f9323a;
    public final fl0 f9324b;

    public k5(fl0 fl0Var, int i10) {
        this.f9323a = i10;
        this.f9324b = fl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9323a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f9324b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f9324b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                fl0 fl0Var = this.f9324b;
                fl0Var.Q = null;
                fl0Var.f26374n0 = 0.0f;
                fl0Var.f26372l0 = null;
                fl0Var.invalidate();
                return;
        }
    }
}
