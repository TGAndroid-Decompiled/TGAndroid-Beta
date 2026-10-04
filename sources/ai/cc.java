package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cc extends AnimatorListenerAdapter {
    public final int f740a;
    public final sb f741b;

    public cc(sb sbVar, int i10) {
        this.f740a = i10;
        this.f741b = sbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f740a) {
            case 0:
                super.onAnimationEnd(animator);
                jc jcVar = this.f741b.f1668b;
                p9 p9Var = jcVar.f1191u1;
                if (p9Var != null) {
                    p9Var.b();
                    jcVar.v.removeView(jcVar.f1191u1);
                }
                jcVar.f1191u1 = null;
                jcVar.P();
                return;
            default:
                super.onAnimationEnd(animator);
                p9 p9Var2 = this.f741b.f1668b.f1191u1;
                if (p9Var2 != null) {
                    p9Var2.a(true);
                    return;
                }
                return;
        }
    }
}
