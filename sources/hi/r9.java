package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r9 extends AnimatorListenerAdapter {
    public final int f15000a;
    public final int f15001b;
    public final int f15002c;
    public final sa d;

    public r9(sa saVar, int i7, int i10, int i11) {
        this.f15000a = i11;
        this.d = saVar;
        this.f15001b = i7;
        this.f15002c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15000a) {
            case 0:
                this.d.M(this.f15001b, this.f15002c);
                return;
            default:
                int i7 = this.f15001b;
                int i10 = this.f15002c;
                if (i7 != i10) {
                    this.d.P(i7, i10);
                    return;
                }
                return;
        }
    }
}
