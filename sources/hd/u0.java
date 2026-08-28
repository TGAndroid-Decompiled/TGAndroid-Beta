package hd;
public abstract class u0 implements Runnable, Comparable, p0 {
    private volatile Object _heap;
    public long f10491a;
    public int f10492b = -1;

    public u0(long j10) {
        this.f10491a = j10;
    }

    public final md.x a() {
        Object obj = this._heap;
        if (obj instanceof md.x) {
            return (md.x) obj;
        }
        return null;
    }

    public final int c(long j10, v0 v0Var, w0 w0Var) {
        u0 u0Var;
        boolean z10;
        synchronized (this) {
            if (this._heap == f0.f10431b) {
                return 2;
            }
            synchronized (v0Var) {
                u0[] u0VarArr = v0Var.f17677a;
                if (u0VarArr != null) {
                    u0Var = u0VarArr[0];
                } else {
                    u0Var = null;
                }
                if (w0.f10500r.get(w0Var) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return 1;
                }
                if (u0Var == null) {
                    v0Var.f10496c = j10;
                } else {
                    long j11 = u0Var.f10491a;
                    if (j11 - j10 < 0) {
                        j10 = j11;
                    }
                    if (j10 - v0Var.f10496c > 0) {
                        v0Var.f10496c = j10;
                    }
                }
                long j12 = this.f10491a;
                long j13 = v0Var.f10496c;
                if (j12 - j13 < 0) {
                    this.f10491a = j13;
                }
                v0Var.a(this);
                return 0;
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        int i9 = ((this.f10491a - ((u0) obj).f10491a) > 0L ? 1 : ((this.f10491a - ((u0) obj).f10491a) == 0L ? 0 : -1));
        if (i9 > 0) {
            return 1;
        }
        if (i9 < 0) {
            return -1;
        }
        return 0;
    }

    @Override
    public final void dispose() {
        v0 v0Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                e5.c cVar = f0.f10431b;
                if (obj == cVar) {
                    return;
                }
                if (obj instanceof v0) {
                    v0Var = (v0) obj;
                } else {
                    v0Var = null;
                }
                if (v0Var != null) {
                    v0Var.c(this);
                }
                this._heap = cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(v0 v0Var) {
        if (this._heap != f0.f10431b) {
            this._heap = v0Var;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.f10491a + ']';
    }
}
