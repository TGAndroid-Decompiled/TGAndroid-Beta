package id;

public abstract class u0 implements Runnable, Comparable, p0 {
    private volatile Object _heap;

    public long f11200a;

    public int f11201b = -1;

    public u0(long j10) {
        this.f11200a = j10;
    }

    public final nd.x a() {
        Object obj = this._heap;
        if (obj instanceof nd.x) {
            return (nd.x) obj;
        }
        return null;
    }

    public final int c(long j10, v0 v0Var, w0 w0Var) {
        synchronized (this) {
            if (this._heap == f0.f11140b) {
                return 2;
            }
            synchronized (v0Var) {
                try {
                    u0[] u0VarArr = v0Var.f18513a;
                    u0 u0Var = u0VarArr != null ? u0VarArr[0] : null;
                    if (w0.f11209r.get(w0Var) != 0) {
                        return 1;
                    }
                    if (u0Var == null) {
                        v0Var.f11205c = j10;
                    } else {
                        long j11 = u0Var.f11200a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - v0Var.f11205c > 0) {
                            v0Var.f11205c = j10;
                        }
                    }
                    long j12 = this.f11200a;
                    long j13 = v0Var.f11205c;
                    if (j12 - j13 < 0) {
                        this.f11200a = j13;
                    }
                    v0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        long j10 = this.f11200a - ((u0) obj).f11200a;
        if (j10 > 0) {
            return 1;
        }
        return j10 < 0 ? -1 : 0;
    }

    @Override
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                ec.a aVar = f0.f11140b;
                if (obj == aVar) {
                    return;
                }
                v0 v0Var = obj instanceof v0 ? (v0) obj : null;
                if (v0Var != null) {
                    v0Var.c(this);
                }
                this._heap = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(v0 v0Var) {
        if (this._heap == f0.f11140b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = v0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f11200a + ']';
    }
}
