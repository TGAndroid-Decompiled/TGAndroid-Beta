package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bb0 extends AnimatorListenerAdapter {
    public final byte a;
    public final ob0 b;

    public bb0(ob0 ob0Var, byte b) {
        this.a = b;
        this.b = ob0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        byte b = this.a;
        ob0 ob0Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                ob0Var.f = false;
                return;
            default:
                if (ob0Var.G) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ob0Var.m0(false, f);
                ob0Var.G = false;
                return;
        }
    }
}
