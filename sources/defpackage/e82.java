package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e82 extends AnimatorListenerAdapter {
    public final byte a;
    public final f82 b;

    public e82(f82 f82Var, byte b) {
        this.a = b;
        this.b = f82Var;
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
        f82 f82Var = this.b;
        switch (b) {
            case 0:
                if (f82Var.R == animator) {
                    f82Var.getSubtitleTextView().setVisibility(4);
                    f82Var.R = null;
                    return;
                }
                return;
            default:
                f82Var.R = null;
                return;
        }
    }
}
