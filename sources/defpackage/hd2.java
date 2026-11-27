package defpackage;
public final class hd2 implements Runnable {
    public final byte a;
    public final pd2 b;
    public final long c;

    public hd2(pd2 pd2Var, long j, byte b) {
        this.a = b;
        this.b = pd2Var;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        pd2 pd2Var = this.b;
        switch (b) {
            case 0:
                pd2Var.n = j;
                pd2Var.r = true;
                pd2Var.c0();
                return;
            default:
                pd2Var.h0(j);
                return;
        }
    }
}
