package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n72 extends AnimatorListenerAdapter {
    public final byte a;
    public final o72 b;

    public n72(o72 o72Var, byte b) {
        this.a = b;
        this.b = o72Var;
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
        o72 o72Var = this.b;
        switch (b) {
            case 0:
                if (o72Var.R == animator) {
                    o72Var.getSubtitleTextView().setVisibility(4);
                    o72Var.R = null;
                    return;
                }
                return;
            default:
                o72Var.R = null;
                return;
        }
    }
}
