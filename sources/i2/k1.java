package i2;

import android.os.Looper;
public final class k1 {
    public final j1 f10754a;
    public final i1 f10755b;
    public int f10756c;
    public Object d;
    public final Looper e;
    public boolean f10757f;

    public k1(i1 i1Var, j1 j1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.f10755b = i1Var;
        this.f10754a = j1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        e2.d.g(!this.f10757f);
        this.f10757f = true;
        p0 p0Var = (p0) this.f10755b;
        if (!p0Var.X && p0Var.f10839s.getThread().isAlive()) {
            p0Var.f10832n.a(14, this).b();
            return;
        }
        e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}
