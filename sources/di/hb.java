package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hb extends AnimatorListenerAdapter {
    public final int f7012a;
    public final int f7013b;
    public final int f7014c;
    public final kc d;

    public hb(kc kcVar, int i10, int i11, int i12) {
        this.f7012a = i12;
        this.d = kcVar;
        this.f7013b = i10;
        this.f7014c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7012a) {
            case 0:
                this.d.M(this.f7013b, this.f7014c);
                return;
            default:
                int i10 = this.f7013b;
                int i11 = this.f7014c;
                if (i10 != i11) {
                    this.d.P(i10, i11);
                    return;
                }
                return;
        }
    }
}
