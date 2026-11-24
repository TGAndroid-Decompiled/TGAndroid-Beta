package defpackage;

import android.animation.AnimatorSet;
public final class pt implements Runnable {
    public final byte a;
    public final AnimatorSet b;

    public pt(AnimatorSet animatorSet, byte b) {
        this.a = b;
        this.b = animatorSet;
    }

    @Override
    public final void run() {
        byte b = this.a;
        this.b.start();
    }
}
