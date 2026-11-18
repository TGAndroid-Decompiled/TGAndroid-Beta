package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l extends AnimatorListenerAdapter {
    public final boolean f21882a;
    public final boolean f21883b;
    public final boolean f21884c;
    public final boolean d;
    public final o f21885e;

    public l(o oVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21885e = oVar;
        this.f21882a = z10;
        this.f21883b = z11;
        this.f21884c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.f21885e;
        oVar.G = false;
        if (!this.f21882a) {
            oVar.e(this.f21883b, this.f21884c, this.d, true);
        }
    }
}
