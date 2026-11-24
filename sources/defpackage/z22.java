package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z22 extends AnimatorListenerAdapter {
    public final byte a = 0;
    public final a32 b;

    public z22(a32 a32Var) {
        this.b = a32Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a32 a32Var = this.b;
        switch (b) {
            case 0:
                ((c32) a32Var.d).V.e();
                return;
            default:
                pi4 pi4Var = a32Var.b;
                pi4Var.setAlpha(1.0f);
                d49.w0(pi4Var);
                ((c32) a32Var.d).Y.r.removeView(pi4Var);
                return;
        }
    }

    public z22(a32 a32Var, d49 d49Var) {
        this.b = a32Var;
    }
}
