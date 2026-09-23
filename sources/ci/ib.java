package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ib extends AnimatorListenerAdapter {
    public final int f4794a;
    public final int f4795b;
    public final int f4796c;
    public final lc d;

    public ib(lc lcVar, int i10, int i11, int i12) {
        this.f4794a = i12;
        this.d = lcVar;
        this.f4795b = i10;
        this.f4796c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4794a) {
            case 0:
                this.d.N(this.f4795b, this.f4796c);
                return;
            default:
                int i10 = this.f4795b;
                int i11 = this.f4796c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
