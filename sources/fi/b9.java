package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b9 extends AnimatorListenerAdapter {
    public final int f11580a;
    public final r8 f11581b;

    public b9(r8 r8Var, int i7) {
        this.f11580a = i7;
        this.f11581b = r8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11580a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.f11581b.f12289b;
                w6 w6Var = i9Var.f11876u1;
                if (w6Var != null) {
                    w6Var.b();
                    i9Var.f11879w.removeView(i9Var.f11876u1);
                }
                i9Var.f11876u1 = null;
                i9Var.V();
                return;
            default:
                super.onAnimationEnd(animator);
                w6 w6Var2 = this.f11581b.f12289b.f11876u1;
                if (w6Var2 != null) {
                    w6Var2.a(true);
                    return;
                }
                return;
        }
    }
}
