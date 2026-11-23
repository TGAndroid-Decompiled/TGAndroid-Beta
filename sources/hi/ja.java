package hi;

import org.telegram.messenger.gd;
public final class ja implements Runnable {
    public final int f14755a = 1;
    public final ka f14756b;
    public final Runnable f14757c;
    public final boolean d;

    public ja(ka kaVar, Runnable runnable, boolean z10) {
        this.f14756b = kaVar;
        this.f14757c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f14755a;
        boolean z10 = this.d;
        Runnable runnable = this.f14757c;
        ka kaVar = this.f14756b;
        switch (i10) {
            case 0:
                kaVar.g(runnable, z10);
                return;
            default:
                runnable.run();
                nb nbVar = kaVar.f14800a;
                r3 r3Var = nbVar.U0;
                if (z10) {
                    i7 = 2131744416;
                } else {
                    i7 = 2131744417;
                }
                r3Var.f15289a.t(gd.N0(i7, null), false, true);
                r3Var.invalidate();
                nbVar.g(true, true);
                nbVar.c0(true);
                nbVar.J0.a(false, true);
                nbVar.K0.b(true, true);
                nbVar.h0(true, true);
                return;
        }
    }

    public ja(ka kaVar, boolean z10, Runnable runnable) {
        this.f14756b = kaVar;
        this.d = z10;
        this.f14757c = runnable;
    }
}
