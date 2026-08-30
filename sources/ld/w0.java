package ld;
public abstract class w0 extends a0 {
    public static final int f11933f = 0;
    public long f11934c;
    public boolean d;
    public tc.e e;

    public final void f(boolean z4) {
        long j10;
        long j11 = this.f11934c;
        if (z4) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        long j12 = j11 - j10;
        this.f11934c = j12;
        if (j12 <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread g();

    public final void h(boolean z4) {
        long j10;
        long j11 = this.f11934c;
        if (z4) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        this.f11934c = j10 + j11;
        if (!z4) {
            this.d = true;
        }
    }

    public abstract long i();

    public final boolean j() {
        Object removeFirst;
        tc.e eVar = this.e;
        if (eVar == null) {
            return false;
        }
        if (eVar.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = eVar.removeFirst();
        }
        l0 l0Var = (l0) removeFirst;
        if (l0Var == null) {
            return false;
        }
        l0Var.run();
        return true;
    }

    public void k(long j10, t0 t0Var) {
        f0.f11884s.o(j10, t0Var);
    }

    public abstract void shutdown();
}
