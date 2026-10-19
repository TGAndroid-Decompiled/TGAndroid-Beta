package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f16907a;
    public final boolean f16908b;
    public final boolean f16909c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f16907a = z10;
        this.f16908b = z11;
        this.f16909c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f16907a) {
            pVar.e(this.f16908b, this.f16909c, this.d, true);
        }
    }
}
