package i2;

import android.os.Looper;
import v7.u6;
public final class n1 {
    public final m1 f11095a;
    public final l1 f11096b;
    public int f11097c;
    public Object d;
    public final Looper e;
    public boolean f11098f;

    public n1(l1 l1Var, m1 m1Var, b2.p1 p1Var, int i10, Looper looper) {
        this.f11096b = l1Var;
        this.f11095a = m1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        u6.p(!this.f11098f);
        this.f11098f = true;
        r0 r0Var = (r0) this.f11096b;
        if (!r0Var.Z && r0Var.f11172s.getThread().isAlive()) {
            r0Var.f11165n.b(14, this).b();
            return;
        }
        e2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
