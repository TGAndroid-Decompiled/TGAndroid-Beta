package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f16906a;
    public final boolean f16907b;
    public final boolean f16908c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f16906a = z10;
        this.f16907b = z11;
        this.f16908c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f16906a) {
            pVar.e(this.f16907b, this.f16908c, this.d, true);
        }
    }
}
