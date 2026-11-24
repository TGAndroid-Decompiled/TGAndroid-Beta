package defpackage;
public final class s6b implements Runnable {
    public final byte a = 1;
    public final t6b b;
    public final Runnable c;
    public final boolean d;

    public s6b(t6b t6bVar, Runnable runnable, boolean z) {
        this.b = t6bVar;
        this.c = runnable;
        this.d = z;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        boolean z = this.d;
        Runnable runnable = this.c;
        t6b t6bVar = this.b;
        switch (b) {
            case 0:
                t6bVar.g(runnable, z);
                return;
            default:
                runnable.run();
                t7b t7bVar = t6bVar.a;
                ge5 ge5Var = t7bVar.U0;
                if (z) {
                    i = 2131744420;
                } else {
                    i = 2131744421;
                }
                ge5Var.a.t(k96.M0(i, null), false, true);
                ge5Var.invalidate();
                t7bVar.e(true, true);
                t7bVar.c0(true);
                t7bVar.J0.a(false, true);
                t7bVar.K0.b(true, true);
                t7bVar.h0(true, true);
                return;
        }
    }

    public s6b(t6b t6bVar, boolean z, Runnable runnable) {
        this.b = t6bVar;
        this.d = z;
        this.c = runnable;
    }
}
