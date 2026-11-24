package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class r81 extends AnimatorListenerAdapter {
    public final AtomicBoolean a;
    public final l46 b;
    public final String c;

    public r81(AtomicBoolean atomicBoolean, l46 l46Var, String str) {
        this.a = atomicBoolean;
        this.b = l46Var;
        this.c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.b.setText(this.c);
        }
    }
}
