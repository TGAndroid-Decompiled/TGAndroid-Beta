package defpackage;
public final class p99 extends zo5 {
    public static final p99 n;
    public final transient wq7 e;
    public final transient int f;
    public transient yo5 h;

    static {
        ?? obj = new Object();
        obj.d(3);
        n = new p99(obj);
    }

    public p99(wq7 wq7Var) {
        this.e = wq7Var;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = wq7Var.c;
            if (i < i2) {
                yve.j(i, i2);
                j += wq7Var.b[i];
                i++;
            } else {
                this.f = ype.d(j);
                return;
            }
        }
    }

    @Override
    public final boolean m() {
        throw null;
    }

    @Override
    public final int size() {
        return this.f;
    }
}
