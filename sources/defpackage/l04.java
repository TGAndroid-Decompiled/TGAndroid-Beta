package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l04 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final o24 c;

    public l04(o24 o24Var, boolean z, byte b) {
        this.a = b;
        this.c = o24Var;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        o24 o24Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    o24Var.y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!z) {
                    o24Var.E.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
