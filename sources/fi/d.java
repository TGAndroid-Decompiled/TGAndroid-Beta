package fi;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f11829a;
    public final q f11830b;

    public d(q qVar, int i7) {
        this.f11829a = i7;
        this.f11830b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f11829a) {
            case 0:
                this.f11830b.p(true, false);
                return;
            case 1:
                q qVar = this.f11830b;
                hi.m3 m3Var = qVar.K;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                qVar.f12419f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f11830b.c();
                return;
        }
    }
}
