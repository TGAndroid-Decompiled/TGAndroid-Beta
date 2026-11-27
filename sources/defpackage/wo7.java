package defpackage;
public final class wo7 implements Runnable {
    public final byte a;
    public final ip7 b;
    public final long c;
    public final long d;

    public wo7(ip7 ip7Var, long j, long j2, byte b) {
        this.a = b;
        this.b = ip7Var;
        this.c = j;
        this.d = j2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        ip7 ip7Var = this.b;
        switch (b) {
            case 0:
                ip7Var.G = j2;
                ip7Var.H = j;
                return;
            default:
                ip7Var.i(j2, j);
                return;
        }
    }
}
