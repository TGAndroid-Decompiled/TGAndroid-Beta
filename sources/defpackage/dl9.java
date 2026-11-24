package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dl9 extends AnimatorListenerAdapter {
    public final byte a;
    public final el9 b;

    public dl9(el9 el9Var, byte b) {
        this.a = b;
        this.b = el9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        el9 el9Var = this.b;
        switch (b) {
            case 0:
                if (el9Var.h != null) {
                    el9Var.h = null;
                    el9Var.e = 0.0f;
                    el9Var.g();
                    el9Var.n.e();
                    kj3 kj3Var = el9Var.a;
                    if (kj3Var != null) {
                        kj3Var.onPause();
                        el9Var.a.onFragmentDestroy();
                        el9Var.removeAllViews();
                        el9Var.a = null;
                        nm7.e().k(273, new Object[0]);
                    }
                    el9Var.d(false);
                    return;
                }
                return;
            default:
                if (el9Var.h != null) {
                    el9Var.h = null;
                    el9Var.d(true);
                    return;
                }
                return;
        }
    }
}
