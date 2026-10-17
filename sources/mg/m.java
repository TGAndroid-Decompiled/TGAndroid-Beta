package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f16899a;
    public final boolean f16900b;
    public final boolean f16901c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f16899a = z10;
        this.f16900b = z11;
        this.f16901c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f16899a) {
            pVar.e(this.f16900b, this.f16901c, this.d, true);
        }
    }
}
