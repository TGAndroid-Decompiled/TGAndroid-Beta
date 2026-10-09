package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ib extends AnimatorListenerAdapter {
    public final int f5211a;
    public final int f5212b;
    public final int f5213c;
    public final lc d;

    public ib(lc lcVar, int i10, int i11, int i12) {
        this.f5211a = i12;
        this.d = lcVar;
        this.f5212b = i10;
        this.f5213c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5211a) {
            case 0:
                this.d.M(this.f5212b, this.f5213c);
                return;
            default:
                int i10 = this.f5212b;
                int i11 = this.f5213c;
                if (i10 != i11) {
                    this.d.P(i10, i11);
                    return;
                }
                return;
        }
    }
}
