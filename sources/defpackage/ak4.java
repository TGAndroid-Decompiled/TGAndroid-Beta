package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ak4 extends AnimatorListenerAdapter {
    public final byte a;
    public final ek4 b;

    public ak4(ek4 ek4Var, byte b) {
        this.a = b;
        this.b = ek4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                kk7.f(y6c.t0).d(new s54(this, (byte) 21));
                return;
            default:
                kk7.f(y6c.t0).d(new s54(this, (byte) 22));
                return;
        }
    }
}
