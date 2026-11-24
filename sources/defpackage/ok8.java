package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ok8 extends AnimatorListenerAdapter {
    public final byte a;
    public final sk8 b;

    public ok8(sk8 sk8Var, byte b) {
        this.a = b;
        this.b = sk8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        sk8 sk8Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                if (sk8Var.getParent() != null) {
                    ((ViewGroup) sk8Var.getParent()).removeView(sk8Var);
                    return;
                }
                return;
            case 1:
                if (sk8Var.getParent() != null) {
                    ((ViewGroup) sk8Var.getParent()).removeView(sk8Var);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (sk8Var.getParent() != null) {
                    ((ViewGroup) sk8Var.getParent()).removeView(sk8Var);
                    return;
                }
                return;
        }
    }
}
