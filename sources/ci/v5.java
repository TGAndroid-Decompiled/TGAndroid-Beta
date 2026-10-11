package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v5 extends AnimatorListenerAdapter {
    public final int f6150a;
    public final q6 f6151b;

    public v5(q6 q6Var, int i10) {
        this.f6150a = i10;
        this.f6151b = q6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6150a) {
            case 0:
                q6 q6Var = this.f6151b;
                q6Var.f5791b2 = 0.0f;
                q6Var.Z1.setAlpha(1.0f);
                q6Var.Z1.setVisibility(8);
                q6Var.Z1.n();
                return;
            case 1:
                this.f6151b.f5818p2.setTranslationY(0.0f);
                return;
            default:
                q6 q6Var2 = this.f6151b;
                q6Var2.f5824s2 = false;
                q6Var2.f5818p2.setTranslationY(0.0f);
                q6Var2.v0();
                return;
        }
    }
}
