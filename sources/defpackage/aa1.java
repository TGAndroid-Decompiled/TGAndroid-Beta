package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class aa1 extends AnimatorListenerAdapter {
    public final AtomicBoolean a;
    public final l66 b;
    public final String c;

    public aa1(AtomicBoolean atomicBoolean, l66 l66Var, String str) {
        this.a = atomicBoolean;
        this.b = l66Var;
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
