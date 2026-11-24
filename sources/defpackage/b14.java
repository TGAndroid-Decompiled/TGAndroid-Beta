package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b14 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final e34 c;

    public b14(e34 e34Var, boolean z, byte b) {
        this.a = b;
        this.c = e34Var;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        e34 e34Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    e34Var.y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!z) {
                    e34Var.E.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
