package be;
public abstract class u0 implements Runnable, Comparable, p0 {
    private volatile Object _heap;
    public long f4327a;
    public int f4328b = -1;

    public u0(long j10) {
        this.f4327a = j10;
    }

    public final ge.x a() {
        Object obj = this._heap;
        if (obj instanceof ge.x) {
            return (ge.x) obj;
        }
        return null;
    }

    public final int c(long j10, v0 v0Var, w0 w0Var) {
        u0 u0Var;
        boolean z10;
        synchronized (this) {
            if (this._heap == f0.f4281b) {
                return 2;
            }
            synchronized (v0Var) {
                u0[] u0VarArr = v0Var.f11046a;
                if (u0VarArr != null) {
                    u0Var = u0VarArr[0];
                } else {
                    u0Var = null;
                }
                if (w0.f4336r.get(w0Var) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return 1;
                }
                if (u0Var == null) {
                    v0Var.f4332c = j10;
                } else {
                    long j11 = u0Var.f4327a;
                    if (j11 - j10 < 0) {
                        j10 = j11;
                    }
                    if (j10 - v0Var.f4332c > 0) {
                        v0Var.f4332c = j10;
                    }
                }
                long j12 = this.f4327a;
                long j13 = v0Var.f4332c;
                if (j12 - j13 < 0) {
                    this.f4327a = j13;
                }
                v0Var.a(this);
                return 0;
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        int i10 = ((this.f4327a - ((u0) obj).f4327a) > 0L ? 1 : ((this.f4327a - ((u0) obj).f4327a) == 0L ? 0 : -1));
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(v0 v0Var) {
        if (this._heap != f0.f4281b) {
            this._heap = v0Var;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override
    public final void dispose() {
        v0 v0Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                com.google.android.gms.internal.clearcut.e eVar = f0.f4281b;
                if (obj == eVar) {
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
                this._heap = eVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f4327a + ']';
    }
}
