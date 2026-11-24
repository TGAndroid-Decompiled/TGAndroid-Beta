package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qz3 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final t14 c;

    public qz3(t14 t14Var, boolean z, byte b) {
        this.a = b;
        this.c = t14Var;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        t14 t14Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    t14Var.y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!z) {
                    t14Var.E.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
