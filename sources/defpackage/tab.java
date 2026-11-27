package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tab extends AnimatorListenerAdapter {
    public final byte a;
    public final byte b;
    public final sbb c;

    public tab(sbb sbbVar, int i, int i2) {
        this.c = sbbVar;
        this.a = i;
        this.b = i2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.c.L(this.a, this.b);
    }
}
