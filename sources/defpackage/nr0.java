package defpackage;

import android.animation.AnimatorSet;
public final class nr0 implements Runnable {
    public final byte a;
    public final rr0 b;
    public final AnimatorSet c;

    public nr0(rr0 rr0Var, AnimatorSet animatorSet, byte b) {
        this.a = b;
        this.b = rr0Var;
        this.c = animatorSet;
    }

    @Override
    public final void run() {
        byte b = this.a;
        AnimatorSet animatorSet = this.c;
        rr0 rr0Var = this.b;
        switch (b) {
            case 0:
                rr0Var.c.postOnAnimation(new nr0(rr0Var, animatorSet, (byte) 1));
                return;
            default:
                if (rr0Var.y == animatorSet) {
                    animatorSet.start();
                    return;
                }
                return;
        }
    }
}
