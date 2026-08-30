package nh;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f15172a;
    public final q f15173b;

    public d(q qVar, int i10) {
        this.f15172a = i10;
        this.f15173b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f15172a) {
            case 0:
                this.f15173b.p(true, false);
                return;
            case 1:
                q qVar = this.f15173b;
                ph.f3 f3Var = qVar.G;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                qVar.f15758b0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f15173b.c();
                return;
        }
    }
}
