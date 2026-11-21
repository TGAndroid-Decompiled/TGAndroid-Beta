package fi;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f11869a;
    public final q f11870b;

    public d(q qVar, int i7) {
        this.f11869a = i7;
        this.f11870b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f11869a) {
            case 0:
                this.f11870b.p(true, false);
                return;
            case 1:
                q qVar = this.f11870b;
                hi.l3 l3Var = qVar.K;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                qVar.f12459f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f11870b.c();
                return;
        }
    }
}
