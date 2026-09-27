package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v5 extends AnimatorListenerAdapter {
    public final int f5676a;
    public final q6 f5677b;

    public v5(q6 q6Var, int i10) {
        this.f5676a = i10;
        this.f5677b = q6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5676a) {
            case 0:
                q6 q6Var = this.f5677b;
                q6Var.f5337b2 = 0.0f;
                q6Var.Z1.setAlpha(1.0f);
                q6Var.Z1.setVisibility(8);
                q6Var.Z1.n();
                return;
            case 1:
                this.f5677b.f5364p2.setTranslationY(0.0f);
                return;
            default:
                q6 q6Var2 = this.f5677b;
                q6Var2.f5370s2 = false;
                q6Var2.f5364p2.setTranslationY(0.0f);
                q6Var2.w0();
                return;
        }
    }
}
