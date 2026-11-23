package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l extends AnimatorListenerAdapter {
    public final boolean f21873a;
    public final boolean f21874b;
    public final boolean f21875c;
    public final boolean d;
    public final o f21876e;

    public l(o oVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21876e = oVar;
        this.f21873a = z10;
        this.f21874b = z11;
        this.f21875c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.f21876e;
        oVar.G = false;
        if (!this.f21873a) {
            oVar.e(this.f21874b, this.f21875c, this.d, true);
        }
    }
}
