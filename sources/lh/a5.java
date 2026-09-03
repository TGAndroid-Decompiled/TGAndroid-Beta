package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a5 extends AnimatorListenerAdapter {
    public final int f12088a;
    public final c5 f12089b;

    public a5(c5 c5Var, int i10) {
        this.f12088a = i10;
        this.f12089b = c5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12088a) {
            case 0:
                this.f12089b.f12198a0 = false;
                return;
            case 1:
                this.f12089b.f12198a0 = false;
                return;
            case 2:
                this.f12089b.K.setVisibility(4);
                return;
            case 3:
                c5 c5Var = this.f12089b;
                c5Var.f12216p0 = c5Var.f12215o0;
                c5Var.d(c5Var.R);
                return;
            default:
                c5 c5Var2 = this.f12089b;
                c5Var2.f12217q0 = 1.0f;
                c5Var2.f12199b.setScaleX(1.0f);
                c5Var2.f12199b.setScaleY(c5Var2.f12217q0);
                c5Var2.invalidate();
                return;
        }
    }
}
