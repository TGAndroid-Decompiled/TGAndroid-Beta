package id;

import java.lang.reflect.InvocationTargetException;

public abstract class x0 extends a0 {

    public static final int f11212f = 0;

    public long f11213c;
    public boolean d;

    public qc.e f11214e;

    public final void f(boolean z10) {
        long j10 = this.f11213c - (z10 ? 4294967296L : 1L);
        this.f11213c = j10;
        if (j10 <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread g();

    public final void h(boolean z10) {
        this.f11213c = (z10 ? 4294967296L : 1L) + this.f11213c;
        if (z10) {
            return;
        }
        this.d = true;
    }

    public abstract long i();

    public final boolean j() throws IllegalAccessException, InvocationTargetException {
        qc.e eVar = this.f11214e;
        if (eVar == null) {
            return false;
        }
        m0 m0Var = (m0) (eVar.isEmpty() ? null : eVar.removeFirst());
        if (m0Var == null) {
            return false;
        }
        m0Var.run();
        return true;
    }

    public void k(long j10, u0 u0Var) {
        g0.f11153s.o(j10, u0Var);
    }

    public abstract void shutdown();
}
