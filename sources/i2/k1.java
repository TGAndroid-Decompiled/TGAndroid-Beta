package i2;

import android.os.Looper;
public final class k1 {
    public final j1 f10757a;
    public final i1 f10758b;
    public int f10759c;
    public Object d;
    public final Looper e;
    public boolean f10760f;

    public k1(i1 i1Var, j1 j1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.f10758b = i1Var;
        this.f10757a = j1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        e2.d.g(!this.f10760f);
        this.f10760f = true;
        p0 p0Var = (p0) this.f10758b;
        if (!p0Var.X && p0Var.f10842s.getThread().isAlive()) {
            p0Var.f10835n.a(14, this).b();
            return;
        }
        e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
