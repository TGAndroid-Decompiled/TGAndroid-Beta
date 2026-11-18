package fi;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f11832a;
    public final q f11833b;

    public d(q qVar, int i7) {
        this.f11832a = i7;
        this.f11833b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f11832a) {
            case 0:
                this.f11833b.p(true, false);
                return;
            case 1:
                q qVar = this.f11833b;
                hi.m3 m3Var = qVar.K;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                qVar.f12422f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f11833b.c();
                return;
        }
    }
}
