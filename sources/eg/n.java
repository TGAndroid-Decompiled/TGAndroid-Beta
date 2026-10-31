package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n extends AnimatorListenerAdapter {
    public final boolean f6571a;
    public final boolean f6572b;
    public final boolean f6573c;
    public final boolean d;
    public final q e;

    public n(q qVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = qVar;
        this.f6571a = z10;
        this.f6572b = z11;
        this.f6573c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q qVar = this.e;
        qVar.F = false;
        if (!this.f6571a) {
            qVar.e(this.f6572b, this.f6573c, this.d, true);
        }
    }
}
