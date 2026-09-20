package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w5 extends AnimatorListenerAdapter {
    public final int f5696a;
    public final r6 f5697b;

    public w5(r6 r6Var, int i10) {
        this.f5696a = i10;
        this.f5697b = r6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5696a) {
            case 0:
                r6 r6Var = this.f5697b;
                r6Var.f5412b2 = 0.0f;
                r6Var.Z1.setAlpha(1.0f);
                r6Var.Z1.setVisibility(8);
                r6Var.Z1.n();
                return;
            case 1:
                this.f5697b.f5439p2.setTranslationY(0.0f);
                return;
            default:
                r6 r6Var2 = this.f5697b;
                r6Var2.f5445s2 = false;
                r6Var2.f5439p2.setTranslationY(0.0f);
                r6Var2.w0();
                return;
        }
    }
}
