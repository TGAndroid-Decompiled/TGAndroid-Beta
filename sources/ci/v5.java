package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sk0;
public final class v5 extends AnimatorListenerAdapter {
    public final int f5653a;
    public final sk0 f5654b;

    public v5(sk0 sk0Var, int i10) {
        this.f5653a = i10;
        this.f5654b = sk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5653a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5654b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f5654b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                sk0 sk0Var = this.f5654b;
                sk0Var.Q = null;
                sk0Var.f28253n0 = 0.0f;
                sk0Var.f28251l0 = null;
                sk0Var.invalidate();
                return;
        }
    }
}
