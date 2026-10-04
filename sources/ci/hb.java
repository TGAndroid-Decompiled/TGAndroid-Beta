package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hb extends AnimatorListenerAdapter {
    public final int f5141a;
    public final int f5142b;
    public final int f5143c;
    public final kc d;

    public hb(kc kcVar, int i10, int i11, int i12) {
        this.f5141a = i12;
        this.d = kcVar;
        this.f5142b = i10;
        this.f5143c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5141a) {
            case 0:
                this.d.N(this.f5142b, this.f5143c);
                return;
            default:
                int i10 = this.f5142b;
                int i11 = this.f5143c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
