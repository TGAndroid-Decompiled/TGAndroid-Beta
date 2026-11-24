package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cj9 extends AnimatorListenerAdapter {
    public final byte a;
    public final dj9 b;

    public cj9(dj9 dj9Var, byte b) {
        this.a = b;
        this.b = dj9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        dj9 dj9Var = this.b;
        switch (b) {
            case 0:
                if (dj9Var.h != null) {
                    dj9Var.h = null;
                    dj9Var.e = 0.0f;
                    dj9Var.g();
                    dj9Var.n.e();
                    yh3 yh3Var = dj9Var.a;
                    if (yh3Var != null) {
                        yh3Var.onPause();
                        dj9Var.a.onFragmentDestroy();
                        dj9Var.removeAllViews();
                        dj9Var.a = null;
                        kk7.e().k(271, new Object[0]);
                    }
                    dj9Var.d(false);
                    return;
                }
                return;
            default:
                if (dj9Var.h != null) {
                    dj9Var.h = null;
                    dj9Var.d(true);
                    return;
                }
                return;
        }
    }
}
