package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f14280a;
    public final boolean f14281b;
    public final boolean f14282c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f14280a = z10;
        this.f14281b = z11;
        this.f14282c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f14280a) {
            pVar.e(this.f14281b, this.f14282c, this.d, true);
        }
    }
}
