package hi;

import org.telegram.messenger.hd;
public final class p9 implements Runnable {
    public final int f15199a = 1;
    public final q9 f15200b;
    public final Runnable f15201c;
    public final boolean d;

    public p9(q9 q9Var, Runnable runnable, boolean z10) {
        this.f15200b = q9Var;
        this.f15201c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f15199a;
        boolean z10 = this.d;
        Runnable runnable = this.f15201c;
        q9 q9Var = this.f15200b;
        switch (i10) {
            case 0:
                q9Var.g(runnable, z10);
                return;
            default:
                runnable.run();
                ta taVar = q9Var.f15255a;
                i3 i3Var = taVar.U0;
                if (z10) {
                    i7 = 2131744419;
                } else {
                    i7 = 2131744420;
                }
                i3Var.f14717a.t(hd.N0(i7, null), false, true);
                i3Var.invalidate();
                taVar.g(true, true);
                taVar.c0(true);
                taVar.J0.a(false, true);
                taVar.K0.b(true, true);
                taVar.h0(true, true);
                return;
        }
    }

    public p9(q9 q9Var, boolean z10, Runnable runnable) {
        this.f15200b = q9Var;
        this.d = z10;
        this.f15201c = runnable;
    }
}
