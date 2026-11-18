package hi;

import org.telegram.messenger.gd;
public final class p9 implements Runnable {
    public final int f15255a = 1;
    public final q9 f15256b;
    public final Runnable f15257c;
    public final boolean d;

    public p9(q9 q9Var, Runnable runnable, boolean z10) {
        this.f15256b = q9Var;
        this.f15257c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f15255a;
        boolean z10 = this.d;
        Runnable runnable = this.f15257c;
        q9 q9Var = this.f15256b;
        switch (i10) {
            case 0:
                q9Var.g(runnable, z10);
                return;
            default:
                runnable.run();
                ta taVar = q9Var.f15296a;
                j3 j3Var = taVar.U0;
                if (z10) {
                    i7 = 2131744425;
                } else {
                    i7 = 2131744426;
                }
                j3Var.f14809a.t(gd.M0(i7, null), false, true);
                j3Var.invalidate();
                taVar.g(true, true);
                taVar.c0(true);
                taVar.J0.a(false, true);
                taVar.K0.b(true, true);
                taVar.h0(true, true);
                return;
        }
    }

    public p9(q9 q9Var, boolean z10, Runnable runnable) {
        this.f15256b = q9Var;
        this.d = z10;
        this.f15257c = runnable;
    }
}
