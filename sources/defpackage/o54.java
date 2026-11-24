package defpackage;
public abstract class o54 extends fy2 {
    public static final int f = 0;
    public long c;
    public boolean d;
    public lt e;

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
        lt ltVar = this.e;
        if (ltVar == null) {
            return false;
        }
        if (ltVar.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = ltVar.removeFirst();
        }
        tp3 tp3Var = (tp3) removeFirst;
        if (tp3Var == null) {
            return false;
        }
        tp3Var.run();
        return true;
    }

    public abstract void shutdown();
}
