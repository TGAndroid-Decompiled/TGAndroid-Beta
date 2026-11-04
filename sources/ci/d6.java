package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d6 extends AnimatorListenerAdapter {
    public final int f4973a;
    public final f6 f4974b;

    public d6(f6 f6Var, int i3) {
        this.f4973a = i3;
        this.f4974b = f6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4973a) {
            case 0:
                this.f4974b.f5095h0 = false;
                return;
            case 1:
                this.f4974b.f5095h0 = false;
                return;
            case 2:
                this.f4974b.P.setVisibility(4);
                return;
            case 3:
                f6 f6Var = this.f4974b;
                f6Var.f5113w0 = f6Var.f5111v0;
                f6Var.d(f6Var.f5086b0);
                return;
            default:
                f6 f6Var2 = this.f4974b;
                f6Var2.f5115x0 = 1.0f;
                f6Var2.f5085b.setScaleX(1.0f);
                f6Var2.f5085b.setScaleY(f6Var2.f5115x0);
                f6Var2.invalidate();
                return;
        }
    }
}
