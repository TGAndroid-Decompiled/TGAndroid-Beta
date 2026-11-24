package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f85 extends AnimatorListenerAdapter {
    public final byte a;
    public final h85 b;

    public f85(h85 h85Var, byte b) {
        this.a = b;
        this.b = h85Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = 0.0f;
        int i = 0;
        h85 h85Var = this.b;
        switch (b) {
            case 0:
                h85Var.F = false;
                h85Var.invalidate();
                return;
            case 1:
                g85 g85Var = h85Var.b0;
                if (!h85Var.W) {
                    f = 1.0f;
                }
                h85Var.a0 = f;
                g85Var.setAlpha(f);
                if (h85Var.W) {
                    i = 8;
                }
                g85Var.setVisibility(i);
                h85Var.a.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                h85Var.H0 = null;
                d85 d85Var = h85Var.a;
                d85Var.setRotationY(0.0f);
                if (!h85Var.I0) {
                    d85Var.d.clearImage();
                    return;
                }
                return;
            case 3:
                h85Var.F = false;
                return;
            default:
                h85Var.F = false;
                return;
        }
    }
}
