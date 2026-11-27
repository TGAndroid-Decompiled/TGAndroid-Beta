package defpackage;
public abstract class c54 implements Runnable, Comparable, ep3 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public c54(long j) {
        this.a = j;
    }

    public final drb b() {
        Object obj = this._heap;
        if (obj instanceof drb) {
            return (drb) obj;
        }
        return null;
    }

    public final int c(long j, d54 d54Var, e54 e54Var) {
        c54 c54Var;
        boolean z;
        synchronized (this) {
            if (this._heap == sdd.a) {
                return 2;
            }
            synchronized (d54Var) {
                c54[] c54VarArr = d54Var.a;
                if (c54VarArr != null) {
                    c54Var = c54VarArr[0];
                } else {
                    c54Var = null;
                }
                int i = e54.s;
                if (fx.a.getIntVolatile(e54Var, e54.n) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return 1;
                }
                if (c54Var == null) {
                    d54Var.c = j;
                } else {
                    long j2 = c54Var.a;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    long j3 = d54Var.c;
                    if (j - j3 > 0) {
                        d54Var.c = j;
                    } else {
                        j = j3;
                    }
                }
                if (this.a - j < 0) {
                    this.a = j;
                }
                d54Var.a(this);
                return 0;
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        int i = ((this.a - ((c54) obj).a) > 0L ? 1 : ((this.a - ((c54) obj).a) == 0L ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(d54 d54Var) {
        if (this._heap != sdd.a) {
            this._heap = d54Var;
        } else {
            lq5.j("Failed requirement.");
        }
    }

    @Override
    public final void dispose() {
        d54 d54Var;
        synchronized (this) {
            Object obj = this._heap;
            ow5 ow5Var = sdd.a;
            if (obj == ow5Var) {
                return;
            }
            if (obj instanceof d54) {
                d54Var = (d54) obj;
            } else {
                d54Var = null;
            }
            if (d54Var != null) {
                d54Var.c(this);
            }
            this._heap = ow5Var;
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
