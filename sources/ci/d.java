package ci;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f5308a;
    public final r f5309b;

    public d(r rVar, int i10) {
        this.f5308a = i10;
        this.f5309b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f5308a) {
            case 0:
                this.f5309b.p(true, false);
                return;
            case 1:
                r rVar = this.f5309b;
                ei.x3 x3Var = rVar.J;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                rVar.f5876e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f5309b.c();
                return;
        }
    }
}
