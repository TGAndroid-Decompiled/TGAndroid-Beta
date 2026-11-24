package defpackage;
public final class ao7 implements Runnable {
    public final byte a;
    public final lo7 b;
    public final long c;
    public final long d;

    public ao7(lo7 lo7Var, long j, long j2, byte b) {
        this.a = b;
        this.b = lo7Var;
        this.c = j;
        this.d = j2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        lo7 lo7Var = this.b;
        switch (b) {
            case 0:
                lo7Var.G = j2;
                lo7Var.H = j;
                return;
            default:
                lo7Var.i(j2, j);
                return;
        }
    }
}
