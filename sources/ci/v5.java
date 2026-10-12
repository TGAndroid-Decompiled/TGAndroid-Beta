package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v5 extends AnimatorListenerAdapter {
    public final int f6149a;
    public final q6 f6150b;

    public v5(q6 q6Var, int i10) {
        this.f6149a = i10;
        this.f6150b = q6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6149a) {
            case 0:
                q6 q6Var = this.f6150b;
                q6Var.f5790b2 = 0.0f;
                q6Var.Z1.setAlpha(1.0f);
                q6Var.Z1.setVisibility(8);
                q6Var.Z1.n();
                return;
            case 1:
                this.f6150b.f5817p2.setTranslationY(0.0f);
                return;
            default:
                q6 q6Var2 = this.f6150b;
                q6Var2.f5823s2 = false;
                q6Var2.f5817p2.setTranslationY(0.0f);
                q6Var2.v0();
                return;
        }
    }
}
