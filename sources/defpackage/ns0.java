package defpackage;

import android.animation.AnimatorSet;
public final class ns0 implements Runnable {
    public final byte a;
    public final rs0 b;
    public final AnimatorSet c;

    public ns0(rs0 rs0Var, AnimatorSet animatorSet, byte b) {
        this.a = b;
        this.b = rs0Var;
        this.c = animatorSet;
    }

    @Override
    public final void run() {
        byte b = this.a;
        AnimatorSet animatorSet = this.c;
        rs0 rs0Var = this.b;
        switch (b) {
            case 0:
                rs0Var.c.postOnAnimation(new ns0(rs0Var, animatorSet, (byte) 1));
                return;
            default:
                if (rs0Var.y == animatorSet) {
                    animatorSet.start();
                    return;
                }
                return;
        }
    }
}
