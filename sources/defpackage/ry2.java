package defpackage;
public final class ry2 {
    public final qy2 a;
    public long b;
    public boolean c;
    public final xf2 d = new xf2(this, (byte) 16);

    public ry2(qy2 qy2Var) {
        this.a = qy2Var;
    }

    public final void a(long j) {
        if (this.c && this.b == j) {
            return;
        }
        this.b = j;
        if (j <= 0) {
            b();
            return;
        }
        this.c = true;
        xf2 xf2Var = this.d;
        gm.r(xf2Var);
        gm.d3(xf2Var, 1000L);
    }

    public final void b() {
        this.c = false;
        gm.r(this.d);
    }
}
