package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cc extends AnimatorListenerAdapter {
    public final int f673a;
    public final sb f674b;

    public cc(sb sbVar, int i10) {
        this.f673a = i10;
        this.f674b = sbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f673a) {
            case 0:
                super.onAnimationEnd(animator);
                jc jcVar = this.f674b.f1531b;
                p9 p9Var = jcVar.f1110u1;
                if (p9Var != null) {
                    p9Var.b();
                    jcVar.v.removeView(jcVar.f1110u1);
                }
                jcVar.f1110u1 = null;
                jcVar.P();
                return;
            default:
                super.onAnimationEnd(animator);
                p9 p9Var2 = this.f674b.f1531b.f1110u1;
                if (p9Var2 != null) {
                    p9Var2.a(true);
                    return;
                }
                return;
        }
    }
}
