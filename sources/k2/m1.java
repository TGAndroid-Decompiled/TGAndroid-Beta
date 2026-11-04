package k2;

import android.os.Looper;
import b8.zb;
public final class m1 {
    public final l1 f16626a;
    public final k1 f16627b;
    public int f16628c;
    public Object d;
    public final Looper f16629e;
    public boolean f16630f;

    public m1(k1 k1Var, l1 l1Var, d2.n1 n1Var, int i3, Looper looper) {
        this.f16627b = k1Var;
        this.f16626a = l1Var;
        this.f16629e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        zb.p(!this.f16630f);
        this.f16630f = true;
        r0 r0Var = (r0) this.f16627b;
        if (!r0Var.f16689a0 && r0Var.f16712s.getThread().isAlive()) {
            r0Var.f16705n.b(14, this).b();
            return;
        }
        g2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
