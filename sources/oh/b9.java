package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b9 extends AnimatorListenerAdapter {
    public final int f16904a;
    public final r8 f16905b;

    public b9(r8 r8Var, int i10) {
        this.f16904a = i10;
        this.f16905b = r8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16904a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.f16905b.f17701b;
                x6 x6Var = i9Var.f17292r1;
                if (x6Var != null) {
                    x6Var.b();
                    i9Var.v.removeView(i9Var.f17292r1);
                }
                i9Var.f17292r1 = null;
                i9Var.P();
                return;
            default:
                super.onAnimationEnd(animator);
                x6 x6Var2 = this.f16905b.f17701b.f17292r1;
                if (x6Var2 != null) {
                    x6Var2.a(true);
                    return;
                }
                return;
        }
    }
}
