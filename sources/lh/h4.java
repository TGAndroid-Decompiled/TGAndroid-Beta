package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h4 extends AnimatorListenerAdapter {
    public final int f12797a;
    public final boolean f12798b;
    public final r5 f12799c;

    public h4(r5 r5Var, boolean z4, int i10) {
        this.f12797a = i10;
        this.f12799c = r5Var;
        this.f12798b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12797a) {
            case 0:
                if (!this.f12798b) {
                    this.f12799c.f12937y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f12798b) {
                    this.f12799c.f12935w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
