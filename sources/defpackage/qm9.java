package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qm9 extends AnimatorListenerAdapter {
    public final byte a;
    public final rm9 b;

    public qm9(rm9 rm9Var, byte b) {
        this.a = b;
        this.b = rm9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rm9 rm9Var = this.b;
        switch (b) {
            case 0:
                if (rm9Var.h != null) {
                    rm9Var.h = null;
                    rm9Var.e = 0.0f;
                    rm9Var.g();
                    rm9Var.n.e();
                    si3 si3Var = rm9Var.a;
                    if (si3Var != null) {
                        si3Var.onPause();
                        rm9Var.a.onFragmentDestroy();
                        rm9Var.removeAllViews();
                        rm9Var.a = null;
                        jn7.e().k(272, new Object[0]);
                    }
                    rm9Var.d(false);
                    return;
                }
                return;
            default:
                if (rm9Var.h != null) {
                    rm9Var.h = null;
                    rm9Var.d(true);
                    return;
                }
                return;
        }
    }
}
