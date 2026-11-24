package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bm4 extends AnimatorListenerAdapter {
    public final byte a;
    public final fm4 b;

    public bm4(fm4 fm4Var, byte b) {
        this.a = b;
        this.b = fm4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                nm7.f(z8c.t0).d(new a14(this, (byte) 28));
                return;
            default:
                nm7.f(z8c.t0).d(new a14(this, (byte) 29));
                return;
        }
    }
}
