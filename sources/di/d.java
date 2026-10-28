package di;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f8475a;
    public final r f8476b;

    public d(r rVar, int i10) {
        this.f8475a = i10;
        this.f8476b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f8475a) {
            case 0:
                this.f8476b.p(true, false);
                return;
            case 1:
                r rVar = this.f8476b;
                fi.v3 v3Var = rVar.J;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                rVar.f9077e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f8476b.c();
                return;
        }
    }
}
