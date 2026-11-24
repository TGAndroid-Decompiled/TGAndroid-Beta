package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class qm8 extends AnimatorListenerAdapter {
    public final byte a;
    public final um8 b;

    public qm8(um8 um8Var, byte b) {
        this.a = b;
        this.b = um8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        um8 um8Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                if (um8Var.getParent() != null) {
                    ((ViewGroup) um8Var.getParent()).removeView(um8Var);
                    return;
                }
                return;
            case 1:
                if (um8Var.getParent() != null) {
                    ((ViewGroup) um8Var.getParent()).removeView(um8Var);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (um8Var.getParent() != null) {
                    ((ViewGroup) um8Var.getParent()).removeView(um8Var);
                    return;
                }
                return;
        }
    }
}
