package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mx7 extends AnimatorListenerAdapter {
    public final byte a;
    public final nx7 b;

    public mx7(nx7 nx7Var, byte b) {
        this.a = b;
        this.b = nx7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        nx7 nx7Var = this.b;
        switch (b) {
            case 0:
                nx7Var.K = null;
                nx7Var.f.f(new fe7(this, (byte) 17));
                return;
            default:
                nx7Var.f.f(new fe7(this, (byte) 18));
                return;
        }
    }
}
