package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f14085a;
    public final boolean f14086b;
    public final boolean f14087c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f14085a = z10;
        this.f14086b = z11;
        this.f14087c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f14085a) {
            pVar.e(this.f14086b, this.f14087c, this.d, true);
        }
    }
}
