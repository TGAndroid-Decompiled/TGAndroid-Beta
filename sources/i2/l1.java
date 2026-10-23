package i2;

import android.os.Looper;
import v7.u6;
public final class l1 {
    public final k1 f12507a;
    public final j1 f12508b;
    public int f12509c;
    public Object d;
    public final Looper e;
    public boolean f12510f;

    public l1(j1 j1Var, k1 k1Var, b2.o1 o1Var, int i10, Looper looper) {
        this.f12508b = j1Var;
        this.f12507a = k1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        u6.p(!this.f12510f);
        this.f12510f = true;
        q0 q0Var = (q0) this.f12508b;
        if (!q0Var.Z && q0Var.f12590s.getThread().isAlive()) {
            q0Var.f12583n.b(14, this).b();
            return;
        }
        e2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
