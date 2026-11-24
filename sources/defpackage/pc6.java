package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pc6 extends AnimatorListenerAdapter {
    public final byte a;
    public final mf6 b;

    public pc6(mf6 mf6Var, byte b) {
        this.a = b;
        this.b = mf6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        mf6 mf6Var = this.b;
        switch (b) {
            case 0:
                if (mf6Var.d == animator) {
                    mf6Var.d = null;
                    return;
                }
                return;
            default:
                mf6Var.c.setVisibility(8);
                if (mf6Var.d == animator) {
                    mf6Var.d = null;
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
