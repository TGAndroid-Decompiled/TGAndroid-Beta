package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dc extends AnimatorListenerAdapter {
    public final int f866a;
    public final tb f867b;

    public dc(tb tbVar, int i10) {
        this.f866a = i10;
        this.f867b = tbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f866a) {
            case 0:
                super.onAnimationEnd(animator);
                kc kcVar = this.f867b.f1775b;
                q9 q9Var = kcVar.f1300u1;
                if (q9Var != null) {
                    q9Var.b();
                    kcVar.v.removeView(kcVar.f1300u1);
                }
                kcVar.f1300u1 = null;
                kcVar.P();
                return;
            default:
                super.onAnimationEnd(animator);
                q9 q9Var2 = this.f867b.f1775b.f1300u1;
                if (q9Var2 != null) {
                    q9Var2.a(true);
                    return;
                }
                return;
        }
    }
}
