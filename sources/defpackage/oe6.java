package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class oe6 extends AnimatorListenerAdapter {
    public final byte a;
    public final mh6 b;

    public oe6(mh6 mh6Var, byte b) {
        this.a = b;
        this.b = mh6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        mh6 mh6Var = this.b;
        switch (b) {
            case 0:
                if (mh6Var.d == animator) {
                    mh6Var.d = null;
                    return;
                }
                return;
            default:
                mh6Var.c.setVisibility(8);
                if (mh6Var.d == animator) {
                    mh6Var.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
