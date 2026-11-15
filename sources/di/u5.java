package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u5 extends AnimatorListenerAdapter {
    public final int f9516a;
    public final w5 f9517b;

    public u5(w5 w5Var, int i7) {
        this.f9516a = i7;
        this.f9517b = w5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9516a) {
            case 0:
                this.f9517b.f9658h0 = false;
                return;
            case 1:
                this.f9517b.f9658h0 = false;
                return;
            case 2:
                this.f9517b.P.setVisibility(4);
                return;
            case 3:
                w5 w5Var = this.f9517b;
                w5Var.f9676w0 = w5Var.f9674v0;
                w5Var.d(w5Var.f9649b0);
                return;
            default:
                w5 w5Var2 = this.f9517b;
                w5Var2.f9678x0 = 1.0f;
                w5Var2.f9648b.setScaleX(1.0f);
                w5Var2.f9648b.setScaleY(w5Var2.f9678x0);
                w5Var2.invalidate();
                return;
        }
    }
}
