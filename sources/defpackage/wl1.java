package defpackage;
public final class wl1 implements Runnable {
    public final byte a;
    public final zu1 b;
    public final long c;
    public final long d;

    public wl1(zu1 zu1Var, long j, long j2, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = j;
        this.d = j2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.V9(j2, j);
                return;
            default:
                zu1Var.t9(j2, j);
                return;
        }
    }
}
