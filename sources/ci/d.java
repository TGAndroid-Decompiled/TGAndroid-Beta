package ci;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f5244a;
    public final r f5245b;

    public d(r rVar, int i10) {
        this.f5244a = i10;
        this.f5245b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f5244a) {
            case 0:
                this.f5245b.q(true, false);
                return;
            case 1:
                r rVar = this.f5245b;
                ei.x3 x3Var = rVar.J;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                rVar.f5818e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f5245b.c();
                return;
        }
    }
}
