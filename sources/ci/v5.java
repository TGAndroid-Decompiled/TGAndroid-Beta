package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v5 extends AnimatorListenerAdapter {
    public final int f6151a;
    public final q6 f6152b;

    public v5(q6 q6Var, int i10) {
        this.f6151a = i10;
        this.f6152b = q6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6151a) {
            case 0:
                q6 q6Var = this.f6152b;
                q6Var.f5792b2 = 0.0f;
                q6Var.Z1.setAlpha(1.0f);
                q6Var.Z1.setVisibility(8);
                q6Var.Z1.n();
                return;
            case 1:
                this.f6152b.f5819p2.setTranslationY(0.0f);
                return;
            default:
                q6 q6Var2 = this.f6152b;
                q6Var2.f5825s2 = false;
                q6Var2.f5819p2.setTranslationY(0.0f);
                q6Var2.v0();
                return;
        }
    }
}
