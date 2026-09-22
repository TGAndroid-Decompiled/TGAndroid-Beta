package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lb extends AnimatorListenerAdapter {
    public final int f4978a;
    public final int f4979b;
    public final int f4980c;
    public final oc d;

    public lb(oc ocVar, int i10, int i11, int i12) {
        this.f4978a = i12;
        this.d = ocVar;
        this.f4979b = i10;
        this.f4980c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4978a) {
            case 0:
                this.d.N(this.f4979b, this.f4980c);
                return;
            default:
                int i10 = this.f4979b;
                int i11 = this.f4980c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
