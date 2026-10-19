package i2;

import android.os.Looper;
import v7.u6;
public final class m1 {
    public final l1 f12480a;
    public final k1 f12481b;
    public int f12482c;
    public Object d;
    public final Looper e;
    public boolean f12483f;

    public m1(k1 k1Var, l1 l1Var, b2.o1 o1Var, int i10, Looper looper) {
        this.f12481b = k1Var;
        this.f12480a = l1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        u6.p(!this.f12483f);
        this.f12483f = true;
        r0 r0Var = (r0) this.f12481b;
        if (!r0Var.Z && r0Var.f12567s.getThread().isAlive()) {
            r0Var.f12560n.b(14, this).b();
            return;
        }
        e2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
