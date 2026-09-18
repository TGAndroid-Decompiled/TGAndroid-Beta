package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cc extends AnimatorListenerAdapter {
    public final int f676a;
    public final sb f677b;

    public cc(sb sbVar, int i10) {
        this.f676a = i10;
        this.f677b = sbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f676a) {
            case 0:
                super.onAnimationEnd(animator);
                jc jcVar = this.f677b.f1534b;
                p9 p9Var = jcVar.f1113u1;
                if (p9Var != null) {
                    p9Var.b();
                    jcVar.v.removeView(jcVar.f1113u1);
                }
                jcVar.f1113u1 = null;
                jcVar.P();
                return;
            default:
                super.onAnimationEnd(animator);
                p9 p9Var2 = this.f677b.f1534b.f1113u1;
                if (p9Var2 != null) {
                    p9Var2.a(true);
                    return;
                }
                return;
        }
    }
}
