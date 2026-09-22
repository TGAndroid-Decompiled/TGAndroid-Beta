package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lb extends AnimatorListenerAdapter {
    public final int f4980a;
    public final int f4981b;
    public final int f4982c;
    public final oc d;

    public lb(oc ocVar, int i10, int i11, int i12) {
        this.f4980a = i12;
        this.d = ocVar;
        this.f4981b = i10;
        this.f4982c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4980a) {
            case 0:
                this.d.N(this.f4981b, this.f4982c);
                return;
            default:
                int i10 = this.f4981b;
                int i11 = this.f4982c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
