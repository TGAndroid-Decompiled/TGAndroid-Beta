package defpackage;
public abstract class g44 implements Runnable, Comparable, no3 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public g44(long j) {
        this.a = j;
    }

    public final enb b() {
        Object obj = this._heap;
        if (obj instanceof enb) {
            return (enb) obj;
        }
        return null;
    }

    public final int c(long j, h44 h44Var, i44 i44Var) {
        g44 g44Var;
        boolean z;
        synchronized (this) {
            if (this._heap == z8d.a) {
                return 2;
            }
            synchronized (h44Var) {
                g44[] g44VarArr = h44Var.a;
                if (g44VarArr != null) {
                    g44Var = g44VarArr[0];
                } else {
                    g44Var = null;
                }
                int i = i44.s;
                if (ex.a.getIntVolatile(i44Var, i44.n) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return 1;
                }
                if (g44Var == null) {
                    h44Var.c = j;
                } else {
                    long j2 = g44Var.a;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    long j3 = h44Var.c;
                    if (j - j3 > 0) {
                        h44Var.c = j;
                    } else {
                        j = j3;
                    }
                }
                if (this.a - j < 0) {
                    this.a = j;
                }
                h44Var.a(this);
                return 0;
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        int i = ((this.a - ((g44) obj).a) > 0L ? 1 : ((this.a - ((g44) obj).a) == 0L ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(h44 h44Var) {
        if (this._heap != z8d.a) {
            this._heap = h44Var;
        } else {
            w26.j("Failed requirement.");
        }
    }

    @Override
    public final void dispose() {
        h44 h44Var;
        synchronized (this) {
            Object obj = this._heap;
            lo5 lo5Var = z8d.a;
            if (obj == lo5Var) {
                return;
            }
            if (obj instanceof h44) {
                h44Var = (h44) obj;
            } else {
                h44Var = null;
            }
            if (h44Var != null) {
                h44Var.c(this);
            }
            this._heap = lo5Var;
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
