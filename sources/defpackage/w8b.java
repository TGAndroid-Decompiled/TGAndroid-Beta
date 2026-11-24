package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w8b extends AnimatorListenerAdapter {
    public final byte a;
    public final byte b;
    public final v9b c;

    public w8b(v9b v9bVar, int i, int i2) {
        this.c = v9bVar;
        this.a = i;
        this.b = i2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.c.L(this.a, this.b);
    }
}
