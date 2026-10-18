package ci;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f5242a;
    public final r f5243b;

    public d(r rVar, int i10) {
        this.f5242a = i10;
        this.f5243b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f5242a) {
            case 0:
                this.f5243b.p(true, false);
                return;
            case 1:
                r rVar = this.f5243b;
                ei.x3 x3Var = rVar.J;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                rVar.f5814e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f5243b.c();
                return;
        }
    }
}
