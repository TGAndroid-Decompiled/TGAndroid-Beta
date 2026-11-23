package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l extends AnimatorListenerAdapter {
    public final boolean f21973a;
    public final boolean f21974b;
    public final boolean f21975c;
    public final boolean d;
    public final o f21976e;

    public l(o oVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21976e = oVar;
        this.f21973a = z10;
        this.f21974b = z11;
        this.f21975c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.f21976e;
        oVar.G = false;
        if (!this.f21973a) {
            oVar.e(this.f21974b, this.f21975c, this.d, true);
        }
    }
}
