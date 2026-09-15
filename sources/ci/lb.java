package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lb extends AnimatorListenerAdapter {
    public final int f4976a;
    public final int f4977b;
    public final int f4978c;
    public final oc d;

    public lb(oc ocVar, int i10, int i11, int i12) {
        this.f4976a = i12;
        this.d = ocVar;
        this.f4977b = i10;
        this.f4978c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4976a) {
            case 0:
                this.d.N(this.f4977b, this.f4978c);
                return;
            default:
                int i10 = this.f4977b;
                int i11 = this.f4978c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
