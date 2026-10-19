package ci;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f5305a;
    public final r f5306b;

    public d(r rVar, int i10) {
        this.f5305a = i10;
        this.f5306b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f5305a) {
            case 0:
                this.f5306b.p(true, false);
                return;
            case 1:
                r rVar = this.f5306b;
                ei.x3 x3Var = rVar.J;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                rVar.f5873e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f5306b.c();
                return;
        }
    }
}
