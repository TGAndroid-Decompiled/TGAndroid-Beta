package fh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u4 extends AnimatorListenerAdapter {
    public final int f6785a;
    public final boolean f6786b;
    public final g6 f6787c;

    public u4(g6 g6Var, boolean z10, int i9) {
        this.f6785a = i9;
        this.f6787c = g6Var;
        this.f6786b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6785a) {
            case 0:
                if (!this.f6786b) {
                    this.f6787c.f6492y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f6786b) {
                    this.f6787c.f6490w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
