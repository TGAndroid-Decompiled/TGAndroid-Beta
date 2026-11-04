package gi;

import org.telegram.messenger.bd;
public final class r9 implements Runnable {
    public final int f13531a = 1;
    public final s9 f13532b;
    public final Runnable f13533c;
    public final boolean d;

    public r9(s9 s9Var, Runnable runnable, boolean z10) {
        this.f13532b = s9Var;
        this.f13533c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i3;
        int i10 = this.f13531a;
        boolean z10 = this.d;
        Runnable runnable = this.f13533c;
        s9 s9Var = this.f13532b;
        switch (i10) {
            case 0:
                s9Var.g(runnable, z10);
                return;
            default:
                runnable.run();
                va vaVar = s9Var.f13580a;
                i3 i3Var = vaVar.U0;
                if (z10) {
                    i3 = 2131744670;
                } else {
                    i3 = 2131744671;
                }
                i3Var.f12965a.t(bd.M0(i3, null), false, true);
                i3Var.invalidate();
                vaVar.g(true, true);
                vaVar.c0(true);
                vaVar.J0.a(false, true);
                vaVar.K0.b(true, true);
                vaVar.h0(true, true);
                return;
        }
    }

    public r9(s9 s9Var, boolean z10, Runnable runnable) {
        this.f13532b = s9Var;
        this.d = z10;
        this.f13533c = runnable;
    }
}
