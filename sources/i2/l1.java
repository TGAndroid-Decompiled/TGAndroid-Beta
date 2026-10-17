package i2;

import android.os.Looper;
import v7.u6;
public final class l1 {
    public final k1 f12483a;
    public final j1 f12484b;
    public int f12485c;
    public Object d;
    public final Looper e;
    public boolean f12486f;

    public l1(j1 j1Var, k1 k1Var, b2.o1 o1Var, int i10, Looper looper) {
        this.f12484b = j1Var;
        this.f12483a = k1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        u6.p(!this.f12486f);
        this.f12486f = true;
        p0 p0Var = (p0) this.f12484b;
        if (!p0Var.Z && p0Var.f12559s.getThread().isAlive()) {
            p0Var.f12552n.b(14, this).b();
            return;
        }
        e2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
