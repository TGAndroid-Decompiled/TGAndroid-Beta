package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hb extends AnimatorListenerAdapter {
    public final int f7015a;
    public final int f7016b;
    public final int f7017c;
    public final kc d;

    public hb(kc kcVar, int i10, int i11, int i12) {
        this.f7015a = i12;
        this.d = kcVar;
        this.f7016b = i10;
        this.f7017c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7015a) {
            case 0:
                this.d.M(this.f7016b, this.f7017c);
                return;
            default:
                int i10 = this.f7016b;
                int i11 = this.f7017c;
                if (i10 != i11) {
                    this.d.P(i10, i11);
                    return;
                }
                return;
        }
    }
}
