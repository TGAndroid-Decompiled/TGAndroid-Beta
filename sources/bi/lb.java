package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lb extends AnimatorListenerAdapter {
    public final int f3287a;
    public final bb f3288b;

    public lb(bb bbVar, int i10) {
        this.f3287a = i10;
        this.f3288b = bbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3287a) {
            case 0:
                super.onAnimationEnd(animator);
                sb sbVar = this.f3288b.f2880b;
                b9 b9Var = sbVar.f3706u1;
                if (b9Var != null) {
                    b9Var.b();
                    sbVar.v.removeView(sbVar.f3706u1);
                }
                sbVar.f3706u1 = null;
                sbVar.P();
                return;
            default:
                super.onAnimationEnd(animator);
                b9 b9Var2 = this.f3288b.f2880b.f3706u1;
                if (b9Var2 != null) {
                    b9Var2.a(true);
                    return;
                }
                return;
        }
    }
}
