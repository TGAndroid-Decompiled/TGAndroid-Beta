package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xk3 extends AnimatorListenerAdapter {
    public final byte a;
    public final f89 b;
    public final of3 c;
    public final sh3 d;

    public xk3(sh3 sh3Var, f89 f89Var, of3 of3Var, byte b) {
        this.a = b;
        this.d = sh3Var;
        this.b = f89Var;
        this.c = of3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        f89 f89Var = this.b;
        sh3 sh3Var = this.d;
        of3 of3Var = this.c;
        switch (b) {
            case 0:
                animator.removeAllListeners();
                of3Var.setClipProgress(0.0f);
                of3Var.setElevation(0.0f);
                sh3Var.d(f89Var);
                sh3Var.x.remove(f89Var);
                sh3Var.A();
                return;
            default:
                animator.removeAllListeners();
                of3Var.setClipProgress(0.0f);
                of3Var.setElevation(0.0f);
                sh3Var.d(f89Var);
                sh3Var.x.remove(f89Var);
                sh3Var.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        sh3 sh3Var = this.d;
        switch (b) {
            case 0:
                sh3Var.y();
                return;
            default:
                sh3Var.y();
                return;
        }
    }
}
