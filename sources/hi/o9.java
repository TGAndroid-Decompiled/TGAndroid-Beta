package hi;

import org.telegram.messenger.hd;
public final class o9 implements Runnable {
    public final int f14828a = 1;
    public final p9 f14829b;
    public final Runnable f14830c;
    public final boolean d;

    public o9(p9 p9Var, Runnable runnable, boolean z10) {
        this.f14829b = p9Var;
        this.f14830c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f14828a;
        boolean z10 = this.d;
        Runnable runnable = this.f14830c;
        p9 p9Var = this.f14829b;
        switch (i10) {
            case 0:
                p9Var.g(runnable, z10);
                return;
            default:
                runnable.run();
                sa saVar = p9Var.f14881a;
                i3 i3Var = saVar.U0;
                if (z10) {
                    i7 = 2131744660;
                } else {
                    i7 = 2131744661;
                }
                i3Var.f14416a.t(hd.M0(i7, null), false, true);
                i3Var.invalidate();
                saVar.g(true, true);
                saVar.c0(true);
                saVar.J0.a(false, true);
                saVar.K0.b(true, true);
                saVar.h0(true, true);
                return;
        }
    }

    public o9(p9 p9Var, boolean z10, Runnable runnable) {
        this.f14829b = p9Var;
        this.d = z10;
        this.f14830c = runnable;
    }
}
