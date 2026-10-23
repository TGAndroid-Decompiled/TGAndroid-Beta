package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l5 extends AnimatorListenerAdapter {
    public final int f9385a;
    public final f6 f9386b;

    public l5(f6 f6Var, int i10) {
        this.f9385a = i10;
        this.f9386b = f6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9385a) {
            case 0:
                f6 f6Var = this.f9386b;
                f6Var.f9012b2 = 0.0f;
                f6Var.Z1.setAlpha(1.0f);
                f6Var.Z1.setVisibility(8);
                f6Var.Z1.n();
                return;
            case 1:
                this.f9386b.f9039p2.setTranslationY(0.0f);
                return;
            default:
                f6 f6Var2 = this.f9386b;
                f6Var2.f9045s2 = false;
                f6Var2.f9039p2.setTranslationY(0.0f);
                f6Var2.u0();
                return;
        }
    }
}
