package ae;
public abstract class v0 implements Runnable, Comparable, q0 {
    private volatile Object _heap;
    public long f510a;
    public int f511b = -1;

    public v0(long j3) {
        this.f510a = j3;
    }

    public final fe.x a() {
        Object obj = this._heap;
        if (obj instanceof fe.x) {
            return (fe.x) obj;
        }
        return null;
    }

    public final int c(long j3, w0 w0Var, x0 x0Var) {
        v0 v0Var;
        boolean z10;
        synchronized (this) {
            if (this._heap == g0.f451b) {
                return 2;
            }
            synchronized (w0Var) {
                v0[] v0VarArr = w0Var.f9921a;
                if (v0VarArr != null) {
                    v0Var = v0VarArr[0];
                } else {
                    v0Var = null;
                }
                if (x0.f517r.get(x0Var) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return 1;
                }
                if (v0Var == null) {
                    w0Var.f513c = j3;
                } else {
                    long j10 = v0Var.f510a;
                    if (j10 - j3 < 0) {
                        j3 = j10;
                    }
                    if (j3 - w0Var.f513c > 0) {
                        w0Var.f513c = j3;
                    }
                }
                long j11 = this.f510a;
                long j12 = w0Var.f513c;
                if (j11 - j12 < 0) {
                    this.f510a = j12;
                }
                w0Var.a(this);
                return 0;
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        int i10 = ((this.f510a - ((v0) obj).f510a) > 0L ? 1 : ((this.f510a - ((v0) obj).f510a) == 0L ? 0 : -1));
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        return 0;
    }

    @Override
    public final void dispose() {
        w0 w0Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                da.a aVar = g0.f451b;
                if (obj == aVar) {
                    return;
                }
                if (obj instanceof w0) {
                    w0Var = (w0) obj;
                } else {
                    w0Var = null;
                }
                if (w0Var != null) {
                    w0Var.c(this);
                }
                this._heap = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(w0 w0Var) {
        if (this._heap != g0.f451b) {
            this._heap = w0Var;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.f510a + ']';
    }
}
