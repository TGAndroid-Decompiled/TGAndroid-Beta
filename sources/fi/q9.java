package fi;

import org.telegram.messenger.id;
public final class q9 implements Runnable {
    public final int f12683a = 1;
    public final r9 f12684b;
    public final Runnable f12685c;
    public final boolean d;

    public q9(r9 r9Var, Runnable runnable, boolean z9) {
        this.f12684b = r9Var;
        this.f12685c = runnable;
        this.d = z9;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f12683a;
        boolean z9 = this.d;
        Runnable runnable = this.f12685c;
        r9 r9Var = this.f12684b;
        switch (i10) {
            case 0:
                r9Var.g(runnable, z9);
                return;
            default:
                runnable.run();
                va vaVar = r9Var.f12758a;
                k3 k3Var = vaVar.T0;
                if (z9) {
                    i7 = 2131744660;
                } else {
                    i7 = 2131744661;
                }
                k3Var.f12266a.t(id.M0(i7, null), false, true);
                k3Var.invalidate();
                vaVar.g(true, true);
                vaVar.c0(true);
                vaVar.I0.a(false, true);
                vaVar.J0.b(true, true);
                vaVar.h0(true, true);
                return;
        }
    }

    public q9(r9 r9Var, boolean z9, Runnable runnable) {
        this.f12684b = r9Var;
        this.d = z9;
        this.f12685c = runnable;
    }
}
