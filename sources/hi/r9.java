package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r9 extends AnimatorListenerAdapter {
    public final int f15343a;
    public final int f15344b;
    public final int f15345c;
    public final sa d;

    public r9(sa saVar, int i7, int i10, int i11) {
        this.f15343a = i11;
        this.d = saVar;
        this.f15344b = i7;
        this.f15345c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15343a) {
            case 0:
                this.d.M(this.f15344b, this.f15345c);
                return;
            default:
                int i7 = this.f15344b;
                int i10 = this.f15345c;
                if (i7 != i10) {
                    this.d.P(i7, i10);
                    return;
                }
                return;
        }
    }
}
