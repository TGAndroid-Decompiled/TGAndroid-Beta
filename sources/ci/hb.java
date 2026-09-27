package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hb extends AnimatorListenerAdapter {
    public final int f4760a;
    public final int f4761b;
    public final int f4762c;
    public final kc d;

    public hb(kc kcVar, int i10, int i11, int i12) {
        this.f4760a = i12;
        this.d = kcVar;
        this.f4761b = i10;
        this.f4762c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4760a) {
            case 0:
                this.d.N(this.f4761b, this.f4762c);
                return;
            default:
                int i10 = this.f4761b;
                int i11 = this.f4762c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
