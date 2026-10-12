package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f15305a;
    public final boolean f15306b;
    public final boolean f15307c;
    public final boolean d;
    public final p f15308e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15308e = pVar;
        this.f15305a = z10;
        this.f15306b = z11;
        this.f15307c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.f15308e;
        pVar.F = false;
        if (!this.f15305a) {
            pVar.e(this.f15306b, this.f15307c, this.d, true);
        }
    }
}
