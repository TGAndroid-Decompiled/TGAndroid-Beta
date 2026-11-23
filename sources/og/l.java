package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l extends AnimatorListenerAdapter {
    public final boolean f21907a;
    public final boolean f21908b;
    public final boolean f21909c;
    public final boolean d;
    public final o f21910e;

    public l(o oVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21910e = oVar;
        this.f21907a = z10;
        this.f21908b = z11;
        this.f21909c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.f21910e;
        oVar.G = false;
        if (!this.f21907a) {
            oVar.e(this.f21908b, this.f21909c, this.d, true);
        }
    }
}
