package ng;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f18830a;
    public final boolean f18831b;
    public final boolean f18832c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f18830a = z10;
        this.f18831b = z11;
        this.f18832c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f18830a) {
            pVar.e(this.f18831b, this.f18832c, this.d, true);
        }
    }
}
