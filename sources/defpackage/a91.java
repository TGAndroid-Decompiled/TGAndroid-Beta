package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a91 extends AnimatorListenerAdapter {
    public final AtomicBoolean a;
    public final p66 b;
    public final String c;

    public a91(AtomicBoolean atomicBoolean, p66 p66Var, String str) {
        this.a = atomicBoolean;
        this.b = p66Var;
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
