package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sa extends AnimatorListenerAdapter {
    public final int f9821a;
    public final int f9822b;
    public final int f9823c;
    public final vb d;

    public sa(vb vbVar, int i10, int i11, int i12) {
        this.f9821a = i12;
        this.d = vbVar;
        this.f9822b = i10;
        this.f9823c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9821a) {
            case 0:
                this.d.M(this.f9822b, this.f9823c);
                return;
            default:
                int i10 = this.f9822b;
                int i11 = this.f9823c;
                if (i10 != i11) {
                    this.d.P(i10, i11);
                    return;
                }
                return;
        }
    }
}
