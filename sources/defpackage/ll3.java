package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ll3 extends AnimatorListenerAdapter {
    public final byte a;
    public final ml3 b;

    public ll3(ml3 ml3Var, byte b) {
        this.a = b;
        this.b = ml3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ml3 ml3Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = ml3Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == ml3Var.e) {
                    ml3Var.e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = ml3Var.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == ml3Var.e) {
                    ml3Var.e = null;
                    return;
                }
                return;
        }
    }
}
