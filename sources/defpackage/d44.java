package defpackage;
public abstract class d44 extends vw2 {
    public static final int f = 0;
    public long c;
    public boolean d;
    public ks e;

    public final void f(boolean z) {
        long j;
        long j2 = this.c;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.c = j3;
        if (j3 <= 0 && this.d) {
            shutdown();
        }
    }

    public final void g(boolean z) {
        long j;
        long j2 = this.c;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.c = j + j2;
        if (!z) {
            this.d = true;
        }
    }

    public abstract long h();

    public final boolean i() {
        Object removeFirst;
        ks ksVar = this.e;
        if (ksVar == null) {
            return false;
        }
        if (ksVar.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = ksVar.removeFirst();
        }
        jo3 jo3Var = (jo3) removeFirst;
        if (jo3Var == null) {
            return false;
        }
        jo3Var.run();
        return true;
    }

    public abstract void shutdown();
}
