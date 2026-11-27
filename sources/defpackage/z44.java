package defpackage;
public abstract class z44 extends px2 {
    public static final int f = 0;
    public long c;
    public boolean d;
    public ls e;

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
        ls lsVar = this.e;
        if (lsVar == null) {
            return false;
        }
        if (lsVar.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = lsVar.removeFirst();
        }
        ap3 ap3Var = (ap3) removeFirst;
        if (ap3Var == null) {
            return false;
        }
        ap3Var.run();
        return true;
    }

    public abstract void shutdown();
}
