package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class bo8 extends AnimatorListenerAdapter {
    public final byte a;
    public final fo8 b;

    public bo8(fo8 fo8Var, byte b) {
        this.a = b;
        this.b = fo8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        fo8 fo8Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                if (fo8Var.getParent() != null) {
                    ((ViewGroup) fo8Var.getParent()).removeView(fo8Var);
                    return;
                }
                return;
            case 1:
                if (fo8Var.getParent() != null) {
                    ((ViewGroup) fo8Var.getParent()).removeView(fo8Var);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (fo8Var.getParent() != null) {
                    ((ViewGroup) fo8Var.getParent()).removeView(fo8Var);
                    return;
                }
                return;
        }
    }
}
