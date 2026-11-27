package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ia5 extends AnimatorListenerAdapter {
    public final byte a;
    public final ka5 b;

    public ia5(ka5 ka5Var, byte b) {
        this.a = b;
        this.b = ka5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = 0.0f;
        int i = 0;
        ka5 ka5Var = this.b;
        switch (b) {
            case 0:
                ka5Var.F = false;
                ka5Var.invalidate();
                return;
            case 1:
                ja5 ja5Var = ka5Var.b0;
                if (!ka5Var.W) {
                    f = 1.0f;
                }
                ka5Var.a0 = f;
                ja5Var.setAlpha(f);
                if (ka5Var.W) {
                    i = 8;
                }
                ja5Var.setVisibility(i);
                ka5Var.a.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                ka5Var.H0 = null;
                ga5 ga5Var = ka5Var.a;
                ga5Var.setRotationY(0.0f);
                if (!ka5Var.I0) {
                    ga5Var.d.a();
                    return;
                }
                return;
            case 3:
                ka5Var.F = false;
                return;
            default:
                ka5Var.F = false;
                return;
        }
    }
}
