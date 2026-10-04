package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hb extends AnimatorListenerAdapter {
    public final int f5142a;
    public final int f5143b;
    public final int f5144c;
    public final kc d;

    public hb(kc kcVar, int i10, int i11, int i12) {
        this.f5142a = i12;
        this.d = kcVar;
        this.f5143b = i10;
        this.f5144c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5142a) {
            case 0:
                this.d.N(this.f5143b, this.f5144c);
                return;
            default:
                int i10 = this.f5143b;
                int i11 = this.f5144c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
