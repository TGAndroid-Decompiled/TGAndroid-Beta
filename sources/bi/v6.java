package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v6 extends AnimatorListenerAdapter {
    public final int f3789a;
    public final r7 f3790b;

    public v6(r7 r7Var, int i10) {
        this.f3789a = i10;
        this.f3790b = r7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3789a) {
            case 0:
                r7 r7Var = this.f3790b;
                r7Var.f3502b2 = 0.0f;
                r7Var.Z1.setAlpha(1.0f);
                r7Var.Z1.setVisibility(8);
                r7Var.Z1.n();
                return;
            case 1:
                this.f3790b.f3529p2.setTranslationY(0.0f);
                return;
            default:
                r7 r7Var2 = this.f3790b;
                r7Var2.f3535s2 = false;
                r7Var2.f3529p2.setTranslationY(0.0f);
                r7Var2.w0();
                return;
        }
    }
}
