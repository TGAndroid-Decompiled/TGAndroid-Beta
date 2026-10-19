package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sa extends AnimatorListenerAdapter {
    public final int f9818a;
    public final int f9819b;
    public final int f9820c;
    public final vb d;

    public sa(vb vbVar, int i10, int i11, int i12) {
        this.f9818a = i12;
        this.d = vbVar;
        this.f9819b = i10;
        this.f9820c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9818a) {
            case 0:
                this.d.M(this.f9819b, this.f9820c);
                return;
            default:
                int i10 = this.f9819b;
                int i11 = this.f9820c;
                if (i10 != i11) {
                    this.d.P(i10, i11);
                    return;
                }
                return;
        }
    }
}
