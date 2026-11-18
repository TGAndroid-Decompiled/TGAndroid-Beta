package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l extends AnimatorListenerAdapter {
    public final boolean f21879a;
    public final boolean f21880b;
    public final boolean f21881c;
    public final boolean d;
    public final o f21882e;

    public l(o oVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21882e = oVar;
        this.f21879a = z10;
        this.f21880b = z11;
        this.f21881c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.f21882e;
        oVar.G = false;
        if (!this.f21879a) {
            oVar.e(this.f21880b, this.f21881c, this.d, true);
        }
    }
}
