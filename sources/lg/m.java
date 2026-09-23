package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f14076a;
    public final boolean f14077b;
    public final boolean f14078c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f14076a = z10;
        this.f14077b = z11;
        this.f14078c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f14076a) {
            pVar.e(this.f14077b, this.f14078c, this.d, true);
        }
    }
}
