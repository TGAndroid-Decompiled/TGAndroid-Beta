package defpackage;
public final class qab implements Runnable {
    public final byte a = 1;
    public final rab b;
    public final Runnable c;
    public final boolean d;

    public qab(rab rabVar, Runnable runnable, boolean z) {
        this.b = rabVar;
        this.c = runnable;
        this.d = z;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        boolean z = this.d;
        Runnable runnable = this.c;
        rab rabVar = this.b;
        switch (b) {
            case 0:
                rabVar.g(runnable, z);
                return;
            default:
                runnable.run();
                rbb rbbVar = rabVar.a;
                hg5 hg5Var = rbbVar.U0;
                if (z) {
                    i = 2131744314;
                } else {
                    i = 2131744315;
                }
                hg5Var.a.t(ob6.M0(i, null), false, true);
                hg5Var.invalidate();
                rbbVar.e(true, true);
                rbbVar.c0(true);
                rbbVar.J0.a(false, true);
                rbbVar.K0.b(true, true);
                rbbVar.h0(true, true);
                return;
        }
    }

    public qab(rab rabVar, boolean z, Runnable runnable) {
        this.b = rabVar;
        this.d = z;
        this.c = runnable;
    }
}
