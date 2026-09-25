package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f14311a;
    public final boolean f14312b;
    public final boolean f14313c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f14311a = z10;
        this.f14312b = z11;
        this.f14313c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f14311a) {
            pVar.e(this.f14312b, this.f14313c, this.d, true);
        }
    }
}
