package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ib extends AnimatorListenerAdapter {
    public final int f5210a;
    public final int f5211b;
    public final int f5212c;
    public final lc d;

    public ib(lc lcVar, int i10, int i11, int i12) {
        this.f5210a = i12;
        this.d = lcVar;
        this.f5211b = i10;
        this.f5212c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5210a) {
            case 0:
                this.d.M(this.f5211b, this.f5212c);
                return;
            default:
                int i10 = this.f5211b;
                int i11 = this.f5212c;
                if (i10 != i11) {
                    this.d.P(i10, i11);
                    return;
                }
                return;
        }
    }
}
