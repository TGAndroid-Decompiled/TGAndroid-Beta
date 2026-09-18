package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lb extends AnimatorListenerAdapter {
    public final int f4981a;
    public final int f4982b;
    public final int f4983c;
    public final oc d;

    public lb(oc ocVar, int i10, int i11, int i12) {
        this.f4981a = i12;
        this.d = ocVar;
        this.f4982b = i10;
        this.f4983c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4981a) {
            case 0:
                this.d.N(this.f4982b, this.f4983c);
                return;
            default:
                int i10 = this.f4982b;
                int i11 = this.f4983c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
