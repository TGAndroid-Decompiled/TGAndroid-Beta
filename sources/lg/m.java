package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f15304a;
    public final boolean f15305b;
    public final boolean f15306c;
    public final boolean d;
    public final p f15307e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15307e = pVar;
        this.f15304a = z10;
        this.f15305b = z11;
        this.f15306c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.f15307e;
        pVar.F = false;
        if (!this.f15304a) {
            pVar.e(this.f15305b, this.f15306c, this.d, true);
        }
    }
}
