package fi;

import org.telegram.messenger.hd;
public final class r9 implements Runnable {
    public final int f12757a = 1;
    public final s9 f12758b;
    public final Runnable f12759c;
    public final boolean d;

    public r9(s9 s9Var, Runnable runnable, boolean z9) {
        this.f12758b = s9Var;
        this.f12759c = runnable;
        this.d = z9;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f12757a;
        boolean z9 = this.d;
        Runnable runnable = this.f12759c;
        s9 s9Var = this.f12758b;
        switch (i10) {
            case 0:
                s9Var.g(runnable, z9);
                return;
            default:
                runnable.run();
                va vaVar = s9Var.f12819a;
                k3 k3Var = vaVar.T0;
                if (z9) {
                    i7 = 2131744661;
                } else {
                    i7 = 2131744662;
                }
                k3Var.f12266a.t(hd.M0(i7, null), false, true);
                k3Var.invalidate();
                vaVar.g(true, true);
                vaVar.c0(true);
                vaVar.I0.a(false, true);
                vaVar.J0.b(true, true);
                vaVar.h0(true, true);
                return;
        }
    }

    public r9(s9 s9Var, boolean z9, Runnable runnable) {
        this.f12758b = s9Var;
        this.d = z9;
        this.f12759c = runnable;
    }
}
