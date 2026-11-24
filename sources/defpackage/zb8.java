package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zb8 extends AnimatorListenerAdapter {
    public final byte a;
    public final ac8 b;

    public zb8(ac8 ac8Var, byte b) {
        this.a = b;
        this.b = ac8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ac8 ac8Var = this.b;
        switch (b) {
            case 0:
                ac8Var.a.n.setVisibility(8);
                return;
            default:
                ac8Var.a.h.setVisibility(8);
                return;
        }
    }
}
