package defpackage;
public final class rab implements Runnable {
    public final byte a = 1;
    public final sab b;
    public final Runnable c;
    public final boolean d;

    public rab(sab sabVar, Runnable runnable, boolean z) {
        this.b = sabVar;
        this.c = runnable;
        this.d = z;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        boolean z = this.d;
        Runnable runnable = this.c;
        sab sabVar = this.b;
        switch (b) {
            case 0:
                sabVar.g(runnable, z);
                return;
            default:
                runnable.run();
                sbb sbbVar = sabVar.a;
                hg5 hg5Var = sbbVar.U0;
                if (z) {
                    i = 2131744314;
                } else {
                    i = 2131744315;
                }
                hg5Var.a.t(ob6.M0(i, null), false, true);
                hg5Var.invalidate();
                sbbVar.e(true, true);
                sbbVar.c0(true);
                sbbVar.J0.a(false, true);
                sbbVar.K0.b(true, true);
                sbbVar.h0(true, true);
                return;
        }
    }

    public rab(sab sabVar, boolean z, Runnable runnable) {
        this.b = sabVar;
        this.d = z;
        this.c = runnable;
    }
}
