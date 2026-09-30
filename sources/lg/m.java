package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f14327a;
    public final boolean f14328b;
    public final boolean f14329c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f14327a = z10;
        this.f14328b = z11;
        this.f14329c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f14327a) {
            pVar.e(this.f14328b, this.f14329c, this.d, true);
        }
    }
}
