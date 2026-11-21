package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l extends AnimatorListenerAdapter {
    public final boolean f21904a;
    public final boolean f21905b;
    public final boolean f21906c;
    public final boolean d;
    public final o f21907e;

    public l(o oVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21907e = oVar;
        this.f21904a = z10;
        this.f21905b = z11;
        this.f21906c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.f21907e;
        oVar.G = false;
        if (!this.f21904a) {
            oVar.e(this.f21905b, this.f21906c, this.d, true);
        }
    }
}
