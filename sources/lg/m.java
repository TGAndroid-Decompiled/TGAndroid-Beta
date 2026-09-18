package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f14244a;
    public final boolean f14245b;
    public final boolean f14246c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f14244a = z10;
        this.f14245b = z11;
        this.f14246c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f14244a) {
            pVar.e(this.f14245b, this.f14246c, this.d, true);
        }
    }
}
