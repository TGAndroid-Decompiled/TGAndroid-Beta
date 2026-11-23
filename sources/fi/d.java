package fi;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f11834a;
    public final q f11835b;

    public d(q qVar, int i7) {
        this.f11834a = i7;
        this.f11835b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f11834a) {
            case 0:
                this.f11835b.p(true, false);
                return;
            case 1:
                q qVar = this.f11835b;
                hi.u3 u3Var = qVar.K;
                if (u3Var != null) {
                    u3Var.f(true);
                }
                qVar.f12424f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f11835b.c();
                return;
        }
    }
}
