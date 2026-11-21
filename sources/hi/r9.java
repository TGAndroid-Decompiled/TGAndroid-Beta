package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r9 extends AnimatorListenerAdapter {
    public final int f15340a;
    public final int f15341b;
    public final int f15342c;
    public final sa d;

    public r9(sa saVar, int i7, int i10, int i11) {
        this.f15340a = i11;
        this.d = saVar;
        this.f15341b = i7;
        this.f15342c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15340a) {
            case 0:
                this.d.M(this.f15341b, this.f15342c);
                return;
            default:
                int i7 = this.f15341b;
                int i10 = this.f15342c;
                if (i7 != i10) {
                    this.d.P(i7, i10);
                    return;
                }
                return;
        }
    }
}
