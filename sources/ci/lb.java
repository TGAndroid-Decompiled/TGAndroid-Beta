package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lb extends AnimatorListenerAdapter {
    public final int f4982a;
    public final int f4983b;
    public final int f4984c;
    public final oc d;

    public lb(oc ocVar, int i10, int i11, int i12) {
        this.f4982a = i12;
        this.d = ocVar;
        this.f4983b = i10;
        this.f4984c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4982a) {
            case 0:
                this.d.N(this.f4983b, this.f4984c);
                return;
            default:
                int i10 = this.f4983b;
                int i11 = this.f4984c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
