package be;
public abstract class x0 extends a0 {
    public static final int f4338f = 0;
    public long f4339c;
    public boolean d;
    public jd.e e;

    public final void f(boolean z10) {
        long j10;
        long j11 = this.f4339c;
        if (z10) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        long j12 = j11 - j10;
        this.f4339c = j12;
        if (j12 <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread g();

    public final void h(boolean z10) {
        long j10;
        long j11 = this.f4339c;
        if (z10) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        this.f4339c = j10 + j11;
        if (!z10) {
            this.d = true;
        }
    }

    public abstract long i();

    public final boolean j() {
        Object removeFirst;
        jd.e eVar = this.e;
        if (eVar == null) {
            return false;
        }
        if (eVar.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = eVar.removeFirst();
        }
        m0 m0Var = (m0) removeFirst;
        if (m0Var == null) {
            return false;
        }
        m0Var.run();
        return true;
    }

    public void k(long j10, u0 u0Var) {
        g0.f4290s.o(j10, u0Var);
    }

    public abstract void shutdown();
}
