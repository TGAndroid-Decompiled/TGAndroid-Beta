package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class he5 extends AnimatorListenerAdapter {
    public final byte a;
    public final ke5 b;

    public he5(ke5 ke5Var, byte b) {
        this.a = b;
        this.b = ke5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ke5 ke5Var = this.b;
        switch (b) {
            case 0:
                ke5Var.d = null;
                iu4 iu4Var = new iu4(this, (byte) 22);
                ke5Var.e = iu4Var;
                gl.d3(iu4Var, ke5Var.w);
                return;
            default:
                ke5Var.setVisibility(4);
                ke5Var.c = null;
                ke5Var.d = null;
                return;
        }
    }
}
