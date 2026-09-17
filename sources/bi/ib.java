package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ib extends AnimatorListenerAdapter {
    public final int f3141a;
    public final ya f3142b;

    public ib(ya yaVar, int i10) {
        this.f3141a = i10;
        this.f3142b = yaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3141a) {
            case 0:
                super.onAnimationEnd(animator);
                pb pbVar = this.f3142b.f4052b;
                y8 y8Var = pbVar.f3605u1;
                if (y8Var != null) {
                    y8Var.b();
                    pbVar.v.removeView(pbVar.f3605u1);
                }
                pbVar.f3605u1 = null;
                pbVar.P();
                return;
            default:
                super.onAnimationEnd(animator);
                y8 y8Var2 = this.f3142b.f4052b.f3605u1;
                if (y8Var2 != null) {
                    y8Var2.a(true);
                    return;
                }
                return;
        }
    }
}
