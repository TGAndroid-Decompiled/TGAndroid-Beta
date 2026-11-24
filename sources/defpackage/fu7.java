package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fu7 extends AnimatorListenerAdapter {
    public final byte a;
    public final gu7 b;

    public fu7(gu7 gu7Var, byte b) {
        this.a = b;
        this.b = gu7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        gu7 gu7Var = this.b;
        switch (b) {
            case 0:
                gu7Var.K = null;
                gu7Var.f.f(new oq7(this, (byte) 2));
                return;
            default:
                gu7Var.f.f(new oq7(this, (byte) 3));
                return;
        }
    }
}
