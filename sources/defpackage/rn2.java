package defpackage;
public final class rn2 implements Runnable {
    public final byte a;
    public final xn2 b;
    public final long c;

    public rn2(xn2 xn2Var, long j, byte b) {
        this.a = b;
        this.b = xn2Var;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        xn2 xn2Var = this.b;
        switch (b) {
            case 0:
                xn2Var.Z(j);
                return;
            default:
                xn2Var.presentFragment(zu1.ha(j));
                return;
        }
    }
}
