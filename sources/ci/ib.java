package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ib extends AnimatorListenerAdapter {
    public final int f4802a;
    public final int f4803b;
    public final int f4804c;
    public final lc d;

    public ib(lc lcVar, int i10, int i11, int i12) {
        this.f4802a = i12;
        this.d = lcVar;
        this.f4803b = i10;
        this.f4804c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4802a) {
            case 0:
                this.d.N(this.f4803b, this.f4804c);
                return;
            default:
                int i10 = this.f4803b;
                int i11 = this.f4804c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
