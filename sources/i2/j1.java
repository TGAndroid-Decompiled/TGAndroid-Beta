package i2;

import android.os.Looper;
public final class j1 {
    public final i1 f10757a;
    public final h1 f10758b;
    public int f10759c;
    public Object d;
    public final Looper e;
    public boolean f10760f;

    public j1(h1 h1Var, i1 i1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.f10758b = h1Var;
        this.f10757a = i1Var;
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
        o0 o0Var = (o0) this.f10758b;
        if (!o0Var.X && o0Var.f10829s.getThread().isAlive()) {
            o0Var.f10822n.a(14, this).b();
            return;
        }
        e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
