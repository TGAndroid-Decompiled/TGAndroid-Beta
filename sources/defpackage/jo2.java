package defpackage;
public final class jo2 implements Runnable {
    public final byte a;
    public final po2 b;
    public final long c;

    public jo2(po2 po2Var, long j, byte b) {
        this.a = b;
        this.b = po2Var;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        po2 po2Var = this.b;
        switch (b) {
            case 0:
                po2Var.a0(j);
                return;
            default:
                po2Var.presentFragment(yv1.ga(j));
                return;
        }
    }
}
