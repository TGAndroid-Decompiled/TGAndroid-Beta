package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f14086a;
    public final boolean f14087b;
    public final boolean f14088c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f14086a = z10;
        this.f14087b = z11;
        this.f14088c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f14086a) {
            pVar.e(this.f14087b, this.f14088c, this.d, true);
        }
    }
}
