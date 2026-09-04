package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ib extends AnimatorListenerAdapter {
    public final int f3114a;
    public final ya f3115b;

    public ib(ya yaVar, int i10) {
        this.f3114a = i10;
        this.f3115b = yaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3114a) {
            case 0:
                super.onAnimationEnd(animator);
                pb pbVar = this.f3115b.f4025b;
                y8 y8Var = pbVar.f3578u1;
                if (y8Var != null) {
                    y8Var.b();
                    pbVar.v.removeView(pbVar.f3578u1);
                }
                pbVar.f3578u1 = null;
                pbVar.P();
                return;
            default:
                super.onAnimationEnd(animator);
                y8 y8Var2 = this.f3115b.f4025b.f3578u1;
                if (y8Var2 != null) {
                    y8Var2.a(true);
                    return;
                }
                return;
        }
    }
}
