package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cc extends AnimatorListenerAdapter {
    public final int f685a;
    public final sb f686b;

    public cc(sb sbVar, int i10) {
        this.f685a = i10;
        this.f686b = sbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f685a) {
            case 0:
                super.onAnimationEnd(animator);
                jc jcVar = this.f686b.f1535b;
                p9 p9Var = jcVar.f1106u1;
                if (p9Var != null) {
                    p9Var.b();
                    jcVar.v.removeView(jcVar.f1106u1);
                }
                jcVar.f1106u1 = null;
                jcVar.P();
                return;
            default:
                super.onAnimationEnd(animator);
                p9 p9Var2 = this.f686b.f1535b.f1106u1;
                if (p9Var2 != null) {
                    p9Var2.a(true);
                    return;
                }
                return;
        }
    }
}
