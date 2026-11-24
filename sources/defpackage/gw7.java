package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gw7 extends AnimatorListenerAdapter {
    public final byte a;
    public final hw7 b;

    public gw7(hw7 hw7Var, byte b) {
        this.a = b;
        this.b = hw7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        hw7 hw7Var = this.b;
        switch (b) {
            case 0:
                hw7Var.K = null;
                hw7Var.f.f(new kl7(this, (byte) 9));
                return;
            default:
                hw7Var.f.f(new kl7(this, (byte) 10));
                return;
        }
    }
}
