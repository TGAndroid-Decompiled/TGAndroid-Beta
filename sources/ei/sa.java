package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sa extends AnimatorListenerAdapter {
    public final int f9819a;
    public final int f9820b;
    public final int f9821c;
    public final vb d;

    public sa(vb vbVar, int i10, int i11, int i12) {
        this.f9819a = i12;
        this.d = vbVar;
        this.f9820b = i10;
        this.f9821c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9819a) {
            case 0:
                this.d.M(this.f9820b, this.f9821c);
                return;
            default:
                int i10 = this.f9820b;
                int i11 = this.f9821c;
                if (i10 != i11) {
                    this.d.P(i10, i11);
                    return;
                }
                return;
        }
    }
}
