package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ma extends AnimatorListenerAdapter {
    public final int f14916a;
    public final int f14917b;
    public final int f14918c;
    public final nb d;

    public ma(nb nbVar, int i7, int i10, int i11) {
        this.f14916a = i11;
        this.d = nbVar;
        this.f14917b = i7;
        this.f14918c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14916a) {
            case 0:
                this.d.M(this.f14917b, this.f14918c);
                return;
            default:
                int i7 = this.f14917b;
                int i10 = this.f14918c;
                if (i7 != i10) {
                    this.d.P(i7, i10);
                    return;
                }
                return;
        }
    }
}
