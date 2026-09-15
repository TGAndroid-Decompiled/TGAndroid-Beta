package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cc extends AnimatorListenerAdapter {
    public final int f671a;
    public final sb f672b;

    public cc(sb sbVar, int i10) {
        this.f671a = i10;
        this.f672b = sbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f671a) {
            case 0:
                super.onAnimationEnd(animator);
                jc jcVar = this.f672b.f1529b;
                p9 p9Var = jcVar.f1108u1;
                if (p9Var != null) {
                    p9Var.b();
                    jcVar.v.removeView(jcVar.f1108u1);
                }
                jcVar.f1108u1 = null;
                jcVar.P();
                return;
            default:
                super.onAnimationEnd(animator);
                p9 p9Var2 = this.f672b.f1529b.f1108u1;
                if (p9Var2 != null) {
                    p9Var2.a(true);
                    return;
                }
                return;
        }
    }
}
