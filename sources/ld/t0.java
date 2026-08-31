package ld;
public abstract class t0 implements Runnable, Comparable, o0 {
    private volatile Object _heap;
    public long f12357a;
    public int f12358b = -1;

    public t0(long j10) {
        this.f12357a = j10;
    }

    public final qd.x a() {
        Object obj = this._heap;
        if (obj instanceof qd.x) {
            return (qd.x) obj;
        }
        return null;
    }

    public final int c(long j10, u0 u0Var, v0 v0Var) {
        t0 t0Var;
        boolean z4;
        synchronized (this) {
            if (this._heap == e0.f12297b) {
                return 2;
            }
            synchronized (u0Var) {
                t0[] t0VarArr = u0Var.f44827a;
                if (t0VarArr != null) {
                    t0Var = t0VarArr[0];
                } else {
                    t0Var = null;
                }
                if (v0.f12370r.get(v0Var) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    return 1;
                }
                if (t0Var == null) {
                    u0Var.f12364c = j10;
                } else {
                    long j11 = t0Var.f12357a;
                    if (j11 - j10 < 0) {
                        j10 = j11;
                    }
                    if (j10 - u0Var.f12364c > 0) {
                        u0Var.f12364c = j10;
                    }
                }
                long j12 = this.f12357a;
                long j13 = u0Var.f12364c;
                if (j12 - j13 < 0) {
                    this.f12357a = j13;
                }
                u0Var.a(this);
                return 0;
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        int i10 = ((this.f12357a - ((t0) obj).f12357a) > 0L ? 1 : ((this.f12357a - ((t0) obj).f12357a) == 0L ? 0 : -1));
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
                com.google.android.gms.internal.clearcut.e eVar = e0.f12297b;
                if (obj == eVar) {
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
                this._heap = eVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(u0 u0Var) {
        if (this._heap != e0.f12297b) {
            this._heap = u0Var;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.f12357a + ']';
    }
}
