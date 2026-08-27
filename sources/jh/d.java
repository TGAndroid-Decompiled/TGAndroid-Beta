package jh;

import org.telegram.ui.PremiumPreviewFragment;

public final class d implements Runnable {

    public final int f13169a;

    public final p f13170b;

    public d(p pVar, int i10) {
        this.f13169a = i10;
        this.f13170b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f13169a) {
            case 0:
                this.f13170b.q(true, false);
                break;
            case 1:
                p pVar = this.f13170b;
                lh.w3 w3Var = pVar.F;
                if (w3Var != null) {
                    w3Var.e(true);
                }
                pVar.f13772a0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            default:
                this.f13170b.c();
                break;
        }
    }
}
