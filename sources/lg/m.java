package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f14098a;
    public final boolean f14099b;
    public final boolean f14100c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f14098a = z10;
        this.f14099b = z11;
        this.f14100c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f14098a) {
            pVar.e(this.f14099b, this.f14100c, this.d, true);
        }
    }
}
