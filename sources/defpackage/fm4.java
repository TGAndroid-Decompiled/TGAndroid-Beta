package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fm4 extends AnimatorListenerAdapter {
    public final byte a;
    public final jm4 b;

    public fm4(jm4 jm4Var, byte b) {
        this.a = b;
        this.b = jm4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                jn7.f(yac.t0).d(new rj4(this, (byte) 5));
                return;
            default:
                jn7.f(yac.t0).d(new rj4(this, (byte) 6));
                return;
        }
    }
}
