package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pk0;
public final class v5 extends AnimatorListenerAdapter {
    public final int f5655a;
    public final pk0 f5656b;

    public v5(pk0 pk0Var, int i10) {
        this.f5655a = i10;
        this.f5656b = pk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5655a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5656b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f5656b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                pk0 pk0Var = this.f5656b;
                pk0Var.Q = null;
                pk0Var.f27362n0 = 0.0f;
                pk0Var.f27360l0 = null;
                pk0Var.invalidate();
                return;
        }
    }
}
