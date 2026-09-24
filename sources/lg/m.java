package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f14296a;
    public final boolean f14297b;
    public final boolean f14298c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f14296a = z10;
        this.f14297b = z11;
        this.f14298c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f14296a) {
            pVar.e(this.f14297b, this.f14298c, this.d, true);
        }
    }
}
