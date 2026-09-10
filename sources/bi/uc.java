package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uc extends AnimatorListenerAdapter {
    public final int f3739a;
    public final int f3740b;
    public final int f3741c;
    public final ce d;

    public uc(ce ceVar, int i10, int i11, int i12) {
        this.f3739a = i12;
        this.d = ceVar;
        this.f3740b = i10;
        this.f3741c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3739a) {
            case 0:
                this.d.N(this.f3740b, this.f3741c);
                return;
            default:
                int i10 = this.f3740b;
                int i11 = this.f3741c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
