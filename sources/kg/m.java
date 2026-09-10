package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f12483a;
    public final boolean f12484b;
    public final boolean f12485c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f12483a = z10;
        this.f12484b = z11;
        this.f12485c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f12483a) {
            pVar.e(this.f12484b, this.f12485c, this.d, true);
        }
    }
}
