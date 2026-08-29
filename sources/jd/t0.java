package jd;
public abstract class t0 implements Runnable, Comparable, o0 {
    private volatile Object _heap;
    public long f11521a;
    public int f11522b = -1;

    public t0(long j10) {
        this.f11521a = j10;
    }

    public final od.y a() {
        Object obj = this._heap;
        if (obj instanceof od.y) {
            return (od.y) obj;
        }
        return null;
    }

    public final int c(long j10, u0 u0Var, v0 v0Var) {
        t0 t0Var;
        boolean z10;
        synchronized (this) {
            if (this._heap == e0.f11461b) {
                return 2;
            }
            synchronized (u0Var) {
                t0[] t0VarArr = u0Var.f19543a;
                if (t0VarArr != null) {
                    t0Var = t0VarArr[0];
                } else {
                    t0Var = null;
                }
                if (v0.f11534r.get(v0Var) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return 1;
                }
                if (t0Var == null) {
                    u0Var.f11528c = j10;
                } else {
                    long j11 = t0Var.f11521a;
                    if (j11 - j10 < 0) {
                        j10 = j11;
                    }
                    if (j10 - u0Var.f11528c > 0) {
                        u0Var.f11528c = j10;
                    }
                }
                long j12 = this.f11521a;
                long j13 = u0Var.f11528c;
                if (j12 - j13 < 0) {
                    this.f11521a = j13;
                }
                u0Var.a(this);
                return 0;
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        int i10 = ((this.f11521a - ((t0) obj).f11521a) > 0L ? 1 : ((this.f11521a - ((t0) obj).f11521a) == 0L ? 0 : -1));
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
        u0 u0Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                fc.a aVar = e0.f11461b;
                if (obj == aVar) {
                    return;
                }
                if (obj instanceof u0) {
                    u0Var = (u0) obj;
                } else {
                    u0Var = null;
                }
                if (u0Var != null) {
                    u0Var.c(this);
                }
                this._heap = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(u0 u0Var) {
        if (this._heap != e0.f11461b) {
            this._heap = u0Var;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.f11521a + ']';
    }
}
