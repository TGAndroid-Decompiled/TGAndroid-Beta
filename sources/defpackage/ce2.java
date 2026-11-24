package defpackage;
public final class ce2 implements Runnable {
    public final byte a;
    public final ke2 b;
    public final long c;

    public ce2(ke2 ke2Var, long j, byte b) {
        this.a = b;
        this.b = ke2Var;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        ke2 ke2Var = this.b;
        switch (b) {
            case 0:
                ke2Var.n = j;
                ke2Var.r = true;
                ke2Var.d0();
                return;
            default:
                ke2Var.i0(j);
                return;
        }
    }
}
