package fi;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f11872a;
    public final q f11873b;

    public d(q qVar, int i7) {
        this.f11872a = i7;
        this.f11873b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f11872a) {
            case 0:
                this.f11873b.p(true, false);
                return;
            case 1:
                q qVar = this.f11873b;
                hi.l3 l3Var = qVar.K;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                qVar.f12462f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f11873b.c();
                return;
        }
    }
}
