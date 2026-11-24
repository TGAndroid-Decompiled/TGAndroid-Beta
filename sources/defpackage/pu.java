package defpackage;

import android.animation.AnimatorSet;
public final class pu implements Runnable {
    public final byte a;
    public final AnimatorSet b;

    public pu(AnimatorSet animatorSet, byte b) {
        this.a = b;
        this.b = animatorSet;
    }

    @Override
    public final void run() {
        byte b = this.a;
        this.b.start();
    }
}
