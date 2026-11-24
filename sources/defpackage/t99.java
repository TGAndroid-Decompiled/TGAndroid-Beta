package defpackage;
public final class t99 implements Runnable {
    public final byte a;
    public final x99 b;

    public t99(x99 x99Var, byte b) {
        this.a = b;
        this.b = x99Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        x99 x99Var = this.b;
        switch (b) {
            case 0:
                q99 q99Var = x99Var.c;
                if (!q99Var.j.isEmpty()) {
                    q99Var.j.clear();
                    q99Var.m();
                    return;
                }
                return;
            case 1:
                q99 q99Var2 = x99Var.c;
                if (!q99Var2.k.isEmpty()) {
                    q99Var2.k.clear();
                    q99Var2.m();
                    return;
                }
                return;
            case 2:
                q99 q99Var3 = x99Var.c;
                if (!q99Var3.l.isEmpty()) {
                    q99Var3.l.clear();
                    q99Var3.m();
                    return;
                }
                return;
            case 3:
                x99Var.c.p(p99.a);
                return;
            case 4:
                x99Var.c.p(p99.b);
                return;
            default:
                x99Var.c.p(p99.c);
                return;
        }
    }
}
