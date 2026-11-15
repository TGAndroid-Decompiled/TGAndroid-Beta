package fi;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f11613a;
    public final q f11614b;

    public d(q qVar, int i7) {
        this.f11613a = i7;
        this.f11614b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f11613a) {
            case 0:
                this.f11614b.p(true, false);
                return;
            case 1:
                q qVar = this.f11614b;
                hi.l3 l3Var = qVar.K;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                qVar.f12194f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f11614b.c();
                return;
        }
    }
}
