package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pe4 extends AnimatorListenerAdapter {
    public final byte a = 0;
    public final a32 b;

    public pe4(a32 a32Var) {
        this.b = a32Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a32 a32Var = this.b;
        switch (b) {
            case 0:
                ((af4) a32Var.d).m0.e();
                return;
            default:
                pi4 pi4Var = a32Var.b;
                pi4Var.setAlpha(1.0f);
                d49.w0(pi4Var);
                ((af4) a32Var.d).b.removeView(pi4Var);
                return;
        }
    }

    public pe4(a32 a32Var, d49 d49Var) {
        this.b = a32Var;
    }
}
