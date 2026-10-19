package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f16905a;
    public final boolean f16906b;
    public final boolean f16907c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f16905a = z10;
        this.f16906b = z11;
        this.f16907c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f16905a) {
            pVar.e(this.f16906b, this.f16907c, this.d, true);
        }
    }
}
