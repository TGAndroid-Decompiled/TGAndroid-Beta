package ih;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f11312a;
    public final r f11313b;

    public d(r rVar, int i9) {
        this.f11312a = i9;
        this.f11313b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f11312a) {
            case 0:
                this.f11313b.p(true, false);
                return;
            case 1:
                r rVar = this.f11313b;
                kh.x3 x3Var = rVar.F;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                rVar.f12019a0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f11313b.c();
                return;
        }
    }
}
