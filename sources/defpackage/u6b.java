package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u6b extends AnimatorListenerAdapter {
    public final byte a;
    public final byte b;
    public final t7b c;

    public u6b(t7b t7bVar, int i, int i2) {
        this.c = t7bVar;
        this.a = i;
        this.b = i2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.c.L(this.a, this.b);
    }
}
