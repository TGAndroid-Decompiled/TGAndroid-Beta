package di;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f8476a;
    public final r f8477b;

    public d(r rVar, int i10) {
        this.f8476a = i10;
        this.f8477b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f8476a) {
            case 0:
                this.f8477b.p(true, false);
                return;
            case 1:
                r rVar = this.f8477b;
                fi.v3 v3Var = rVar.J;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                rVar.f9078e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f8477b.c();
                return;
        }
    }
}
