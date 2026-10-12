package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dc extends AnimatorListenerAdapter {
    public final int f864a;
    public final tb f865b;

    public dc(tb tbVar, int i10) {
        this.f864a = i10;
        this.f865b = tbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f864a) {
            case 0:
                super.onAnimationEnd(animator);
                kc kcVar = this.f865b.f1773b;
                q9 q9Var = kcVar.f1298u1;
                if (q9Var != null) {
                    q9Var.b();
                    kcVar.v.removeView(kcVar.f1298u1);
                }
                kcVar.f1298u1 = null;
                kcVar.P();
                return;
            default:
                super.onAnimationEnd(animator);
                q9 q9Var2 = this.f865b.f1773b.f1298u1;
                if (q9Var2 != null) {
                    q9Var2.a(true);
                    return;
                }
                return;
        }
    }
}
