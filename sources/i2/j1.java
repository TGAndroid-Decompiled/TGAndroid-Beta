package i2;

import android.os.Looper;
public final class j1 {
    public final i1 f10756a;
    public final h1 f10757b;
    public int f10758c;
    public Object d;
    public final Looper e;
    public boolean f10759f;

    public j1(h1 h1Var, i1 i1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.f10757b = h1Var;
        this.f10756a = i1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        e2.d.g(!this.f10759f);
        this.f10759f = true;
        o0 o0Var = (o0) this.f10757b;
        if (!o0Var.X && o0Var.f10828s.getThread().isAlive()) {
            o0Var.f10821n.a(14, this).b();
            return;
        }
        e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
