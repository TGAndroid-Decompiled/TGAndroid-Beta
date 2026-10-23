package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sa extends AnimatorListenerAdapter {
    public final int f9834a;
    public final int f9835b;
    public final int f9836c;
    public final vb d;

    public sa(vb vbVar, int i10, int i11, int i12) {
        this.f9834a = i12;
        this.d = vbVar;
        this.f9835b = i10;
        this.f9836c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9834a) {
            case 0:
                this.d.M(this.f9835b, this.f9836c);
                return;
            default:
                int i10 = this.f9835b;
                int i11 = this.f9836c;
                if (i10 != i11) {
                    this.d.P(i10, i11);
                    return;
                }
                return;
        }
    }
}
