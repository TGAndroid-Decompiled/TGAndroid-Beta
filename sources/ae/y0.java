package ae;
public abstract class y0 extends b0 {
    public static final int f520f = 0;
    public long f521c;
    public boolean d;
    public id.e f522e;

    public final void f(boolean z10) {
        long j3;
        long j10 = this.f521c;
        if (z10) {
            j3 = 4294967296L;
        } else {
            j3 = 1;
        }
        long j11 = j10 - j3;
        this.f521c = j11;
        if (j11 <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread g();

    public final void h(boolean z10) {
        long j3;
        long j10 = this.f521c;
        if (z10) {
            j3 = 4294967296L;
        } else {
            j3 = 1;
        }
        this.f521c = j3 + j10;
        if (!z10) {
            this.d = true;
        }
    }

    public abstract long i();

    public final boolean j() {
        Object removeFirst;
        id.e eVar = this.f522e;
        if (eVar == null) {
            return false;
        }
        if (eVar.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = eVar.removeFirst();
        }
        n0 n0Var = (n0) removeFirst;
        if (n0Var == null) {
            return false;
        }
        n0Var.run();
        return true;
    }

    public void k(long j3, v0 v0Var) {
        h0.f462s.o(j3, v0Var);
    }

    public abstract void shutdown();
}
