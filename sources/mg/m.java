package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f16968a;
    public final boolean f16969b;
    public final boolean f16970c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f16968a = z10;
        this.f16969b = z11;
        this.f16970c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f16968a) {
            pVar.e(this.f16969b, this.f16970c, this.d, true);
        }
    }
}
