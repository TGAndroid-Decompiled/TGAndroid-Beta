package defpackage;
public abstract class r54 implements Runnable, Comparable, xp3 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public r54(long j) {
        this.a = j;
    }

    public final fpb b() {
        Object obj = this._heap;
        if (obj instanceof fpb) {
            return (fpb) obj;
        }
        return null;
    }

    public final int c(long j, s54 s54Var, t54 t54Var) {
        r54 r54Var;
        boolean z;
        synchronized (this) {
            if (this._heap == bbd.a) {
                return 2;
            }
            synchronized (s54Var) {
                r54[] r54VarArr = s54Var.a;
                if (r54VarArr != null) {
                    r54Var = r54VarArr[0];
                } else {
                    r54Var = null;
                }
                int i = t54.s;
                if (fy.a.getIntVolatile(t54Var, t54.n) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return 1;
                }
                if (r54Var == null) {
                    s54Var.c = j;
                } else {
                    long j2 = r54Var.a;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    long j3 = s54Var.c;
                    if (j - j3 > 0) {
                        s54Var.c = j;
                    } else {
                        j = j3;
                    }
                }
                if (this.a - j < 0) {
                    this.a = j;
                }
                s54Var.a(this);
                return 0;
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        int i = ((this.a - ((r54) obj).a) > 0L ? 1 : ((this.a - ((r54) obj).a) == 0L ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(s54 s54Var) {
        if (this._heap != bbd.a) {
            this._heap = s54Var;
        } else {
            u36.j("Failed requirement.");
        }
    }

    @Override
    public final void dispose() {
        s54 s54Var;
        synchronized (this) {
            Object obj = this._heap;
            du2 du2Var = bbd.a;
            if (obj == du2Var) {
                return;
            }
            if (obj instanceof s54) {
                s54Var = (s54) obj;
            } else {
                s54Var = null;
            }
            if (s54Var != null) {
                s54Var.c(this);
            }
            this._heap = du2Var;
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
