package nh;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f15152a;
    public final q f15153b;

    public d(q qVar, int i10) {
        this.f15152a = i10;
        this.f15153b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f15152a) {
            case 0:
                this.f15153b.p(true, false);
                return;
            case 1:
                q qVar = this.f15153b;
                ph.f3 f3Var = qVar.G;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                qVar.f15738b0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f15153b.c();
                return;
        }
    }
}
