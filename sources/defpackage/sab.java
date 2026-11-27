package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sab extends AnimatorListenerAdapter {
    public final byte a;
    public final byte b;
    public final rbb c;

    public sab(rbb rbbVar, int i, int i2) {
        this.c = rbbVar;
        this.a = i;
        this.b = i2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.c.L(this.a, this.b);
    }
}
