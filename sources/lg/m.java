package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f14313a;
    public final boolean f14314b;
    public final boolean f14315c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f14313a = z10;
        this.f14314b = z11;
        this.f14315c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f14313a) {
            pVar.e(this.f14314b, this.f14315c, this.d, true);
        }
    }
}
