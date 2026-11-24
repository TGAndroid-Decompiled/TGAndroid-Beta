package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y82 extends AnimatorListenerAdapter {
    public final byte a;
    public final z82 b;

    public y82(z82 z82Var, byte b) {
        this.a = b;
        this.b = z82Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.R = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        z82 z82Var = this.b;
        switch (b) {
            case 0:
                if (z82Var.R == animator) {
                    z82Var.getSubtitleTextView().setVisibility(4);
                    z82Var.R = null;
                    return;
                }
                return;
            default:
                z82Var.R = null;
                return;
        }
    }
}
