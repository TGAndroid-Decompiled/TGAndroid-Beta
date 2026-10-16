package i2;

import android.os.Looper;
import v7.u6;
public final class n1 {
    public final m1 f11099a;
    public final l1 f11100b;
    public int f11101c;
    public Object d;
    public final Looper e;
    public boolean f11102f;

    public n1(l1 l1Var, m1 m1Var, b2.p1 p1Var, int i10, Looper looper) {
        this.f11100b = l1Var;
        this.f11099a = m1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        u6.p(!this.f11102f);
        this.f11102f = true;
        r0 r0Var = (r0) this.f11100b;
        if (!r0Var.Z && r0Var.f11176s.getThread().isAlive()) {
            r0Var.f11169n.b(14, this).b();
            return;
        }
        e2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
