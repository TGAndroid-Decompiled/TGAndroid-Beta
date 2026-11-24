package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gk3 extends AnimatorListenerAdapter {
    public final byte a;
    public final s49 b;
    public final ue3 c;
    public final yg3 d;

    public gk3(yg3 yg3Var, s49 s49Var, ue3 ue3Var, byte b) {
        this.a = b;
        this.d = yg3Var;
        this.b = s49Var;
        this.c = ue3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        s49 s49Var = this.b;
        yg3 yg3Var = this.d;
        ue3 ue3Var = this.c;
        switch (b) {
            case 0:
                animator.removeAllListeners();
                ue3Var.setClipProgress(0.0f);
                ue3Var.setElevation(0.0f);
                yg3Var.d(s49Var);
                yg3Var.x.remove(s49Var);
                yg3Var.A();
                return;
            default:
                animator.removeAllListeners();
                ue3Var.setClipProgress(0.0f);
                ue3Var.setElevation(0.0f);
                yg3Var.d(s49Var);
                yg3Var.x.remove(s49Var);
                yg3Var.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        yg3 yg3Var = this.d;
        switch (b) {
            case 0:
                yg3Var.y();
                return;
            default:
                yg3Var.y();
                return;
        }
    }
}
