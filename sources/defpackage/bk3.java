package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bk3 extends AnimatorListenerAdapter {
    public final byte a;
    public final ck3 b;

    public bk3(ck3 ck3Var, byte b) {
        this.a = b;
        this.b = ck3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ck3 ck3Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = ck3Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == ck3Var.e) {
                    ck3Var.e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = ck3Var.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == ck3Var.e) {
                    ck3Var.e = null;
                    return;
                }
                return;
        }
    }
}
