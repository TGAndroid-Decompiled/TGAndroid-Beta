package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f14295a;
    public final boolean f14296b;
    public final boolean f14297c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f14295a = z10;
        this.f14296b = z11;
        this.f14297c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f14295a) {
            pVar.e(this.f14296b, this.f14297c, this.d, true);
        }
    }
}
