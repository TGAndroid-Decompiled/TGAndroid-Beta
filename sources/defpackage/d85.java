package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d85 extends AnimatorListenerAdapter {
    public final byte a;
    public final ka5 b;
    public final j95 c;

    public d85(j95 j95Var, ka5 ka5Var, byte b) {
        this.a = b;
        this.c = j95Var;
        this.b = ka5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        j95 j95Var = this.c;
        ka5 ka5Var = this.b;
        switch (b) {
            case 0:
                if (ka5Var.getParent() != null) {
                    j95Var.b.removeView(ka5Var);
                    return;
                }
                return;
            default:
                if (ka5Var.getParent() != null) {
                    j95Var.b.removeView(ka5Var);
                    return;
                }
                return;
        }
    }
}
