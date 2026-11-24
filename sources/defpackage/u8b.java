package defpackage;
public final class u8b implements Runnable {
    public final byte a = 1;
    public final v8b b;
    public final Runnable c;
    public final boolean d;

    public u8b(v8b v8bVar, Runnable runnable, boolean z) {
        this.b = v8bVar;
        this.c = runnable;
        this.d = z;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        boolean z = this.d;
        Runnable runnable = this.c;
        v8b v8bVar = this.b;
        switch (b) {
            case 0:
                v8bVar.g(runnable, z);
                return;
            default:
                runnable.run();
                v9b v9bVar = v8bVar.a;
                eg5 eg5Var = v9bVar.U0;
                if (z) {
                    i = 2131744346;
                } else {
                    i = 2131744347;
                }
                eg5Var.a.t(jb6.M0(i, null), false, true);
                eg5Var.invalidate();
                v9bVar.e(true, true);
                v9bVar.c0(true);
                v9bVar.J0.a(false, true);
                v9bVar.K0.b(true, true);
                v9bVar.h0(true, true);
                return;
        }
    }

    public u8b(v8b v8bVar, boolean z, Runnable runnable) {
        this.b = v8bVar;
        this.d = z;
        this.c = runnable;
    }
}
