package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w5 extends AnimatorListenerAdapter {
    public final int f8328a;
    public final q6 f8329b;

    public w5(q6 q6Var, int i10) {
        this.f8328a = i10;
        this.f8329b = q6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8328a) {
            case 0:
                q6 q6Var = this.f8329b;
                q6Var.f7955b2 = 0.0f;
                q6Var.Z1.setAlpha(1.0f);
                q6Var.Z1.setVisibility(8);
                q6Var.Z1.n();
                return;
            case 1:
                this.f8329b.f7982p2.setTranslationY(0.0f);
                return;
            default:
                q6 q6Var2 = this.f8329b;
                q6Var2.f7988s2 = false;
                q6Var2.f7982p2.setTranslationY(0.0f);
                q6Var2.w0();
                return;
        }
    }
}
